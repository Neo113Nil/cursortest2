package xsna;

import xsna.b280;
import xsna.c280;

/* compiled from: OldUserOnBoardingState.kt */
/* loaded from: classes5.dex */
public final class i080 implements km50 {
    public static final i080 e = new i080(c280.a.a, b280.a.a, 0);
    public final c280 b;
    public final b280 c;
    public final int d;

    public i080(c280 c280Var, b280 b280Var, int i) {
        this.b = c280Var;
        this.c = b280Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i080)) {
            return false;
        }
        i080 i080Var = (i080) obj;
        return epx.f(this.b, i080Var.b) && epx.f(this.c, i080Var.c) && this.d == i080Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OldUserOnBoardingState(screenData=");
        sb.append(this.b);
        sb.append(", screenBottomData=");
        sb.append(this.c);
        sb.append(", step=");
        return vu5.b(sb, this.d, ')');
    }
}
