package defpackage;

import java.io.IOException;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import ru.CryptoPro.AdES.evidence.wrapper.BasicOCSPResponseWrapper;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public final class ht61 extends xw61 implements at61 {
    public he5 x;
    public String y;

    public ht61(Document document, pu61 pu61Var, BasicOCSPResponseWrapper basicOCSPResponseWrapper, String str, String str2, String str3, String str4) {
        super(document, pu61Var, "EncapsulatedOCSPValue", str2, str3, str4);
        this.x = basicOCSPResponseWrapper.getEvidence();
        String index = basicOCSPResponseWrapper.getIndex();
        if (index != null && str != null) {
            try {
                String str5 = str + "-EncapsulatedOCSPValue-" + index;
                this.y = str5;
                a(null, "Id", str5);
            } catch (IOException e) {
                throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
            }
        }
        e().setTextContent(Base64.encode(this.x.getEncoded()));
    }

    public final he5 h() {
        String textContent;
        if (this.x == null && (textContent = e().getTextContent()) != null) {
            String trim = textContent.trim();
            if (trim.length() > 0) {
                try {
                    this.x = he5.m(Base64.decode(trim));
                } catch (Base64DecodingException e) {
                    throw new XAdESException((Exception) e, IAdESException.ecNodeInvalidContent);
                }
            }
        }
        return this.x;
    }
}
