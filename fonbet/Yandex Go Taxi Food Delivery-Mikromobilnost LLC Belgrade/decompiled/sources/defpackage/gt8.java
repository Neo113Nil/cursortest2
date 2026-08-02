package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.care.impl.router.e;

/* loaded from: classes4.dex */
public final class gt8 {
    public final at8 a;
    public final dt8 b;
    public final e c;

    public gt8(at8 at8Var, dt8 dt8Var, e eVar) {
        this.a = at8Var;
        this.b = dt8Var;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gt8) {
            gt8 gt8Var = (gt8) obj;
            return this.a.equals(gt8Var.a) && this.b == gt8Var.b && this.c == gt8Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CareWebViewLauncherConfig(args=" + this.a + ", dependencies=" + this.b + ", callback=" + this.c + Extension.C_BRAKE;
    }
}
