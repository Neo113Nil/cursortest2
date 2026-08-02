package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.SignatureTimeStamp;
import ru.CryptoPro.XAdES.SignatureTimeStampImpl;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.XAdESType;
import ru.CryptoPro.XAdES.cl_64;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public class bv61 extends tr61 implements AdESTAttributeDecoder {
    public static final rvr A = new rvr(15);

    @Override // defpackage.tr61, defpackage.jt61, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    public void decode() {
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding as XAdES-T structure...");
        super.decode();
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeParametersDecoder
    public final List getSignatureTimestampTokens() {
        List list = (List) this.y.get(cl_64.z);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SignatureTimeStamp) it.next()).getTimestampToken());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // defpackage.tr61
    public void h() {
        JCPLogger.subEnter();
        qu61 a = XAdESType.a(this.x);
        if (a != null) {
            try {
                Element e = a.e();
                for (cl_64 cl_64Var : cl_64.values()) {
                    NodeList elementsByTagNameNS = e.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64Var.b());
                    if (elementsByTagNameNS != null && cl_64.z.equals(cl_64Var)) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
                            SignatureTimeStampImpl signatureTimeStampImpl = new SignatureTimeStampImpl(elementsByTagNameNS.item(i), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                            signatureTimeStampImpl.setProvider(this.b);
                            signatureTimeStampImpl.setCertificateValues(this.c);
                            arrayList.add(signatureTimeStampImpl);
                        }
                        Collections.sort(arrayList, A);
                        this.y.put(cl_64.z, arrayList);
                    }
                }
            } catch (XAdESException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new XAdESException(e3, IAdESException.ecSignatureMarshallingFailed);
            }
        }
        JCPLogger.subExit();
    }
}
