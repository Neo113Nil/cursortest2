package defpackage;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class exs extends n2 implements x1 {
    public final z1 a;
    public final int b;

    public exs(int i, n2 n2Var) {
        this.a = n2Var;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static exs h(z1 z1Var) {
        t2 t2Var;
        if (z1Var == 0 || (z1Var instanceof exs)) {
            return (exs) z1Var;
        }
        if (!(z1Var instanceof r3)) {
            if (!(z1Var instanceof byte[])) {
                ny61.g("unknown object in getInstance: ".concat(z1Var.getClass().getName()));
                return null;
            }
            try {
                return h(a3.m((byte[]) z1Var));
            } catch (IOException unused) {
                ny61.g("unable to parse encoded general name");
                return null;
            }
        }
        r3 r3Var = (r3) z1Var;
        int i = r3Var.c;
        switch (i) {
            case 0:
            case 3:
            case 5:
                break;
            case 1:
            case 2:
            case 6:
                break;
            case 4:
                break;
            case 7:
                break;
            case 8:
                q1 q1Var = t2.c;
                int i2 = r3Var.a;
                if (i2 != 3 && i2 != 4) {
                    if (128 != r3Var.b) {
                        ny61.r("this method only valid for CONTEXT_SPECIFIC tags");
                        break;
                    } else {
                        a3 aSN1Primitive = r3Var.w.toASN1Primitive();
                        if (!(aSN1Primitive instanceof t2)) {
                            t2Var = t2.p(v2.p(aSN1Primitive).a, true);
                            break;
                        }
                    }
                }
                t2Var = (t2) t2.c.f(r3Var, false);
                break;
            default:
                ny61.g(oyr.i(i, "unknown tag: "));
                break;
        }
        return null;
    }

    @Override // defpackage.z1
    public final a3 toASN1Primitive() {
        int i = this.b;
        return new td4(i == 4, i, this.a, 1);
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i = this.b;
        stringBuffer.append(i);
        stringBuffer.append(Extension.COLON_SPACE);
        z1 z1Var = this.a;
        if (i != 1 && i != 2) {
            if (i == 4) {
                stringBuffer.append(ic51.i(z1Var).toString());
            } else if (i != 6) {
                stringBuffer.append(z1Var.toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(ruu0.a(wpf.p(z1Var).a));
        return stringBuffer.toString();
    }
}
