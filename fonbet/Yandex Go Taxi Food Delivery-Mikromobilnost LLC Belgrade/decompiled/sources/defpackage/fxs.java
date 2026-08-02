package defpackage;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class fxs extends o2 implements y1 {
    public final a2 a;
    public final int b;

    public fxs(jc51 jc51Var) {
        this.a = jc51Var;
        this.b = 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fxs m(a2 a2Var) {
        u2 u2Var;
        if (a2Var == 0 || (a2Var instanceof fxs)) {
            return (fxs) a2Var;
        }
        if (!(a2Var instanceof s3)) {
            if (!(a2Var instanceof byte[])) {
                ny61.g("unknown object in getInstance: ".concat(a2Var.getClass().getName()));
                return null;
            }
            try {
                return m(b3.r((byte[]) a2Var));
            } catch (IOException unused) {
                ny61.g("unable to parse encoded general name");
                return null;
            }
        }
        s3 s3Var = (s3) a2Var;
        int i = s3Var.c;
        p1 p1Var = i3.b;
        switch (i) {
            case 0:
            case 3:
            case 5:
                return new fxs(i, (i3) p1Var.Hg(s3Var, false));
            case 1:
            case 2:
            case 6:
                return new fxs(i, (xpf) xpf.b.Hg(s3Var, false));
            case 4:
                xc4 xc4Var = jc51.y;
                return new fxs(i, jc51.m((i3) p1Var.Hg(s3Var, true)));
            case 7:
                return new fxs(i, (w2) w2.b.Hg(s3Var, false));
            case 8:
                p1 p1Var2 = u2.c;
                int i2 = s3Var.a;
                if (i2 != 3 && i2 != 4 && 128 == s3Var.b) {
                    b3 aSN1Primitive = s3Var.u().toASN1Primitive();
                    if (!(aSN1Primitive instanceof u2)) {
                        u2Var = u2.x(w2.x(aSN1Primitive).a, true);
                        return new fxs(i, u2Var);
                    }
                }
                u2Var = (u2) u2.c.Hg(s3Var, false);
                return new fxs(i, u2Var);
            default:
                ny61.g(oyr.i(i, "unknown tag: "));
                return null;
        }
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        int i = this.b;
        return new oqf(i == 4, i, this.a, 0);
    }

    public final String toString() {
        String a;
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.b;
        stringBuffer.append(i);
        stringBuffer.append(Extension.COLON_SPACE);
        a2 a2Var = this.a;
        if (i != 1 && i != 2) {
            if (i == 4) {
                jc51 m = jc51.m(a2Var);
                a = m.c.d(m);
                stringBuffer.append(a);
                return stringBuffer.toString();
            }
            if (i != 6) {
                stringBuffer.append(a2Var.toString());
                return stringBuffer.toString();
            }
        }
        a = quu0.a(xpf.u(a2Var).a);
        stringBuffer.append(a);
        return stringBuffer.toString();
    }

    public fxs(int i, o2 o2Var) {
        this.a = o2Var;
        this.b = i;
    }
}
