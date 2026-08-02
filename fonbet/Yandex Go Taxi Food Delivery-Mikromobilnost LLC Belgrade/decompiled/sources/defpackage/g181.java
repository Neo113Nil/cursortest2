package defpackage;

import java.lang.ref.WeakReference;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class g181 {
    public final WeakReference a;
    public final kf71 b;
    public final f881 c;

    public g181(WeakReference weakReference, kf71 kf71Var, f881 f881Var) {
        this.a = weakReference;
        this.b = kf71Var;
        this.c = f881Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g181) {
            g181 g181Var = (g181) obj;
            if (this.a.equals(g181Var.a) && this.b == g181Var.b && jl40.l(this.c, g181Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.a + ", notice=" + this.b + ", validationResult=" + this.c + Extension.C_BRAKE;
    }
}
