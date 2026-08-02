package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

/* loaded from: classes4.dex */
public final class g2k extends o2 {
    public h2k a;
    public c490 b;
    public gxs c;

    public static void m(StringBuffer stringBuffer, String str, String str2, String str3) {
        stringBuffer.append(Extension.TAB_CHAR);
        stringBuffer.append(str2);
        stringBuffer.append(":");
        stringBuffer.append(str);
        stringBuffer.append(Extension.TAB_CHAR);
        stringBuffer.append(Extension.TAB_CHAR);
        stringBuffer.append(str3);
        stringBuffer.append(str);
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        h2k h2kVar = this.a;
        if (h2kVar != null) {
            c2Var.a(new oqf(true, 0, h2kVar, 0));
        }
        c490 c490Var = this.b;
        if (c490Var != null) {
            c2Var.a(new oqf(false, 1, c490Var, 0));
        }
        gxs gxsVar = this.c;
        if (gxsVar != null) {
            c2Var.a(new oqf(false, 2, gxsVar, 0));
        }
        return new jqf(c2Var);
    }

    public final String toString() {
        String str = quu0.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(str);
        h2k h2kVar = this.a;
        if (h2kVar != null) {
            m(stringBuffer, str, "distributionPoint", h2kVar.toString());
        }
        c490 c490Var = this.b;
        if (c490Var != null) {
            m(stringBuffer, str, IssuingDistributionPointExtension.REASONS, c490Var.f());
        }
        gxs gxsVar = this.c;
        if (gxsVar != null) {
            m(stringBuffer, str, "cRLIssuer", gxsVar.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
