package xsna;

import java.util.List;
import kotlin.Pair;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class o7e0 extends p7e0<Pair<? extends Float, ? extends Float>> {
    public final String a;
    public final String b;
    public final List<qq90> c;
    public final huo d;

    /* JADX WARN: Multi-variable type inference failed */
    public o7e0(String str, String str2, List<? extends qq90> list, huo huoVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = huoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7e0)) {
            return false;
        }
        o7e0 o7e0Var = (o7e0) obj;
        return epx.f(this.a, o7e0Var.a) && epx.f(this.b, o7e0Var.b) && epx.f(this.c, o7e0Var.c) && epx.f(this.d, o7e0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PropertyValuesHolder2D(xPropertyName=" + this.a + ", yPropertyName=" + this.b + ", pathData=" + this.c + ", interpolator=" + this.d + ')';
    }
}
