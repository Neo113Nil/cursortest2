package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.transform.HashDataInfoWrapper;

/* loaded from: classes4.dex */
public class kt61 implements TSPData {
    public final ArrayList a;
    public final Document b;
    public String c;
    public String w;

    public kt61(List list, Document document) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.c = null;
        this.w = null;
        arrayList.addAll(list);
        this.b = document;
    }

    public final byte[] a(HashDataInfoWrapper hashDataInfoWrapper) {
        JCPLogger.fine("Converting element to stream...");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        XMLSignatureInput xMLSignatureInput = new XMLSignatureInput(hashDataInfoWrapper.getElement());
        InputStream inputStream = null;
        if (xMLSignatureInput.isNodeSet() || xMLSignatureInput.isElement()) {
            Iterator<String> it = hashDataInfoWrapper.getTransformAlgorithms().iterator();
            while (it.hasNext()) {
                xMLSignatureInput = new Transform(this.b, it.next(), (NodeList) null).performTransform(xMLSignatureInput);
            }
        }
        try {
            if (xMLSignatureInput.isByteArray()) {
                byteArrayOutputStream.write(xMLSignatureInput.getBytes());
            } else if (xMLSignatureInput.isOctetStream()) {
                byte[] bArr = new byte[1024];
                inputStream = xMLSignatureInput.getOctetStream();
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (Exception unused2) {
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
        }
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public final byte[] getDigest() {
        JCPLogger.fine("Calculating digest...");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(a((HashDataInfoWrapper) it.next()));
            }
            byteArrayOutputStream.close();
            return MessageDigest.getInstance(this.w, this.c).digest(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            throw new XAdESException(e, IAdESException.ecTimestampWrongImprint);
        }
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public final String getProvider() {
        return this.c;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData, ru.CryptoPro.AdES.tools.DigestUtility
    public final void setDigestAlgorithm(String str) {
        this.w = str;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData, ru.CryptoPro.AdES.tools.ProviderUtility
    public final void setProvider(String str) {
        this.c = str;
    }

    @Override // ru.CryptoPro.AdES.external.timestamp.data.TSPData
    public final void validateImprint(byte[] bArr) {
        JCPLogger.subEnter();
        if (!Arrays.equals(bArr, getDigest())) {
            throw new XAdESException(IAdESException.ecTimestampWrongImprint);
        }
        JCPLogger.subExit();
    }
}
