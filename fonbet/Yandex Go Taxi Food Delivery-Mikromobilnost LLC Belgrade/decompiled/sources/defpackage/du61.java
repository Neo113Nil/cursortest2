package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.security.auth.x500.X500Principal;
import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.XAdES.cl_29;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.SystemUtils;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public final class du61 extends xw61 {
    public Date A;
    public cl_29 B;
    public String x;
    public final jc51 y;
    public byte[] z;

    public du61(Document document, hu61 hu61Var, lr60 lr60Var, String str, String str2, String str3, String str4, String str5) {
        super(document, hu61Var, "OCSPIdentifier", str3, str4, str5);
        this.B = cl_29.a;
        Element e = e();
        if (str != null && str2 != null) {
            String l = b64.l(ShimmerDivHandler.NUMBER_SING, str2, "-EncapsulatedOCSPValue-", str);
            this.x = l;
            a(null, GlobalRouterActivity.URI, l);
        }
        Element g = g("ResponderID");
        g.setPrefix(str3);
        e.appendChild(g);
        bvj0 bvj0Var = lr60Var.a;
        g2 g2Var = lr60Var.b;
        this.z = bvj0Var.getKeyHash();
        this.y = bvj0Var.getName();
        byte[] bArr = this.z;
        if (bArr != null) {
            this.B = cl_29.b;
            String encode = Base64.encode(bArr);
            Element g2 = g("ByKey");
            g2.setPrefix(str3);
            g.appendChild(g2);
            g2.setTextContent(encode);
        }
        if (this.y != null) {
            this.B = cl_29.c;
            try {
                X500Principal x500Principal = new X500Principal(this.y.getEncoded());
                Element g3 = g("ByName");
                g3.setPrefix(str3);
                g.appendChild(g3);
                g3.setTextContent(x500Principal.getName());
            } catch (IOException e2) {
                throw new XAdESException(e2, IAdESException.ecNodeEncodingFailed);
            }
        }
        Element g4 = g("ProducedAt");
        g4.setPrefix(str3);
        e.appendChild(g4);
        try {
            Date y = g2Var.y();
            this.A = y;
            g4.setTextContent(SystemUtils.formatDate(y));
        } catch (ParseException e3) {
            throw new XAdESException(e3, IAdESException.ecNodeEncodingFailed);
        }
    }

    public final byte[] h() {
        Element f;
        Element childElementByTagNameNS;
        String textContent;
        if (this.z == null && (f = f("ResponderID")) != null && (childElementByTagNameNS = XMLUtils.getChildElementByTagNameNS(f, "ByKey", this.c)) != null && (textContent = childElementByTagNameNS.getTextContent()) != null) {
            String trim = textContent.trim();
            if (trim.length() > 0) {
                try {
                    this.z = Base64.decode(trim);
                } catch (Base64DecodingException e) {
                    throw new XAdESException((Exception) e, IAdESException.ecNodeInvalidContent);
                }
            }
        }
        return this.z;
    }
}
