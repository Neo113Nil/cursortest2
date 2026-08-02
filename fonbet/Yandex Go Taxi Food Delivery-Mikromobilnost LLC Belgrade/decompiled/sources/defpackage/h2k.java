package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class h2k extends o2 implements y1 {
    public o2 a;
    public int b;

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

    public static h2k n(s3 s3Var) {
        s3 z = s3.z(s3Var);
        h2k h2kVar = new h2k();
        int i = z.c;
        h2kVar.b = i;
        if (i == 0) {
            h2kVar.a = new gxs((i3) i3.b.Hg(z, false));
            return h2kVar;
        }
        h2kVar.a = (m3) m3.c.Hg(z, false);
        return h2kVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        return new oqf(2, 128, this.b, this.a, 0);
    }

    public final String toString() {
        String str = quu0.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str);
        m(stringBuffer, str, this.b == 0 ? "fullName" : "nameRelativeToCRLIssuer", this.a.toString());
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
