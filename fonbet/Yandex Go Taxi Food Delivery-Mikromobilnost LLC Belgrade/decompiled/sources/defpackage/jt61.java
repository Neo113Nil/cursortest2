package defpackage;

import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.XAdESType;
import ru.CryptoPro.XAdES.cl_64;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public class jt61 extends XAdESType implements AdESAttributeDecoder, kq61 {
    public String b = null;
    public final HashSet c = new HashSet();
    public final HashSet w = new HashSet();
    public final Element x;

    public jt61(Element element) {
        this.x = element;
    }

    public void decode() {
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding as XML DSig structure...");
        f();
        try {
            g();
        } catch (Exception e) {
            JCPLogger.ignoredException(e);
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public cr80 getSignerCertificateReference() {
        return null;
    }

    public final void f() {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting certificates from KeyInfo...");
        HashSet hashSet = this.c;
        hashSet.clear();
        NodeList elementsByTagNameNS = this.x.getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "KeyInfo");
        if (elementsByTagNameNS == null || elementsByTagNameNS.getLength() == 0) {
            JCPLogger.fine("KeyInfo not found. Continue.");
            return;
        }
        for (int i = 0; i < elementsByTagNameNS.getLength(); i++) {
            NodeList elementsByTagNameNS2 = ((Element) elementsByTagNameNS.item(i)).getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "X509Data");
            if (elementsByTagNameNS2 == null || elementsByTagNameNS2.getLength() == 0) {
                throw new XAdESException("X509Data in node not found", IAdESException.ecNodeNotFound);
            }
            for (int i2 = 0; i2 < elementsByTagNameNS2.getLength(); i2++) {
                NodeList elementsByTagNameNS3 = ((Element) elementsByTagNameNS2.item(i2)).getElementsByTagNameNS("http://www.w3.org/2000/09/xmldsig#", "X509Certificate");
                if (elementsByTagNameNS3 == null || elementsByTagNameNS3.getLength() == 0) {
                    throw new XAdESException("X509Certificate in node not found", IAdESException.ecNodeNotFound);
                }
                for (int i3 = 0; i3 < elementsByTagNameNS3.getLength(); i3++) {
                    try {
                        hashSet.add((X509Certificate) AdESUtility.CERT_FACTORY.generateCertificate(new ByteArrayInputStream(Base64.decode(elementsByTagNameNS3.item(i3).getTextContent()))));
                    } catch (Exception e) {
                        throw new XAdESException(e, IAdESException.ecNodeInvalidContent);
                    }
                }
            }
        }
        JCPLogger.subExit();
    }

    public final void g() {
        JCPLogger.subEnter();
        JCPLogger.fine("Extracting existing certificate-values...");
        JCPLogger.subEnter();
        qu61 a = XAdESType.a(this.x);
        if (a != null) {
            Element e = a.e();
            for (cl_64 cl_64Var : cl_64.values()) {
                NodeList elementsByTagNameNS = e.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64Var.b());
                if (elementsByTagNameNS != null && cl_64.G.equals(cl_64Var)) {
                    this.w.addAll(new ux61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX).h());
                }
            }
        }
        JCPLogger.subExit();
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    public final Set getExistingCertificateValues() {
        return Collections.unmodifiableSet(this.w);
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    public final void setProvider(String str) {
        this.b = str;
    }
}
