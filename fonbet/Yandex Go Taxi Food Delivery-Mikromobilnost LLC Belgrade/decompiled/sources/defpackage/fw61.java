package defpackage;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.encoders.EncoderException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.cl_63;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public final class fw61 extends xw61 implements bw61 {
    public cr80 x;

    public fw61(Document document, sv61 sv61Var, dw61 dw61Var, String str, String str2, String str3) {
        super(document, sv61Var, cl_63.k, str, str2, str3);
        this.x = null;
        Element g = g("Cert");
        Element g2 = g("CertDigest");
        Element c = c("http://www.w3.org/2000/09/xmldsig#", str3, "DigestMethod");
        c.setPrefix(str3);
        hw61 hw61Var = (hw61) dw61Var;
        c.setAttributeNS(null, "Algorithm", hw61Var.b);
        Element c2 = c("http://www.w3.org/2000/09/xmldsig#", str3, "DigestValue");
        c2.setPrefix(str3);
        c2.setTextContent(hw61Var.a());
        g2.appendChild(c);
        g2.appendChild(c2);
        Element g3 = g("IssuerSerialV2");
        byte[] b = hw61Var.b();
        kw4 kw4Var = dw4.a;
        int length = b.length;
        kw4 kw4Var2 = dw4.a;
        kw4Var2.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(((length + 2) / 3) * 4);
        try {
            kw4Var2.b(length, byteArrayOutputStream, b);
            g3.setTextContent(quu0.a(byteArrayOutputStream.toByteArray()));
            g.appendChild(g2);
            g.appendChild(g3);
            getNode().appendChild(g);
            h(dw61Var);
        } catch (Exception e) {
            throw new EncoderException("exception encoding base64 string: " + e.getMessage(), e);
        }
    }

    @Override // defpackage.bw61
    public final cr80 a() {
        return this.x;
    }

    public final void h(dw61 dw61Var) {
        ax61 i;
        JCPLogger.subEnter();
        if (this.x == null) {
            if (dw61Var != null) {
                try {
                    String findDigestOidByDigestName = XAdESUtility.findDigestOidByDigestName(XAdESUtility.findDigestNameByDigestUri(((hw61) dw61Var).b));
                    JCPLogger.fine("Digest oid: " + findDigestOidByDigestName);
                    r0x m = r0x.m(((hw61) dw61Var).b());
                    xr1 xr1Var = new xr1(new u2(findDigestOidByDigestName));
                    Element f = f("Cert");
                    byte[] bArr = null;
                    if (f != null && (i = new rv61(f, this.b, this.c, this.w).i()) != null) {
                        try {
                            bArr = i.h();
                        } catch (Exception e) {
                            JCPLogger.thrown(e);
                        }
                    }
                    this.x = new cr80(xr1Var, bArr, m);
                } catch (XAdESException | Exception e2) {
                    JCPLogger.thrown(e2);
                }
            } else {
                Element f2 = f("Cert");
                if (f2 == null) {
                    return;
                } else {
                    this.x = rv61.h(new rv61(f2, this.b, this.c, this.w));
                }
            }
        }
        JCPLogger.subExit();
    }

    public fw61(Node node, String str, String str2, String str3) {
        super(node, str, str2, str3);
        this.x = null;
        h(null);
    }
}
