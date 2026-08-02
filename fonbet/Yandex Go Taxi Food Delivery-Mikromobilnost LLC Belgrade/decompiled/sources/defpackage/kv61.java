package defpackage;

import java.io.IOException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.SignatureTimeStamp;
import ru.CryptoPro.XAdES.SignatureTimeStampImpl;
import ru.CryptoPro.XAdES.cl_63;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public final class kv61 extends xw61 {
    public kv61(Document document, mw61 mw61Var, SignatureTimeStamp signatureTimeStamp, int i, String str, Element element, String str2, String str3, String str4) {
        super(document, mw61Var, cl_63.D, str2, str3, str4);
        if (str != null) {
            a(null, "Id", qv10.h(i, str, "-SignatureTimestamp-"));
        }
        ((SignatureTimeStampImpl) signatureTimeStamp).b = this;
        String attribute = element.getAttribute("Id");
        if (attribute != null && !attribute.trim().isEmpty()) {
            SignatureTimeStampImpl.addHashDataInfoElement(this, element, null);
        }
        signatureTimeStamp.generateEncapsulatedTimeStamp(this.a, str);
        boolean z = signatureTimeStamp instanceof ot61;
        if (z) {
            signatureTimeStamp.enhance();
        }
        if (z) {
            JCPLogger.fine("Skip signature-timestamp validation, because it is enhanced and will be checked later.");
        }
        try {
            Element c = c("http://www.w3.org/2000/09/xmldsig#", str4, "CanonicalizationMethod");
            c.setAttributeNS(null, "Algorithm", SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM);
            getNode().appendChild(c);
            String encode = Base64.encode(signatureTimeStamp.getTimestampToken().a.b.getEncoded("DL"));
            Element g = g("EncapsulatedTimeStamp");
            g.appendChild(this.a.createTextNode(encode));
            getNode().appendChild(g);
        } catch (IOException e) {
            throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
        }
    }
}
