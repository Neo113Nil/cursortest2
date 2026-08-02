package defpackage;

import androidx.compose.animation.core.RepeatMode;

/* loaded from: classes10.dex */
public final class nsv implements jj2 {
    public final f3n a;
    public final RepeatMode b;
    public final long c;

    public nsv(f3n f3nVar, RepeatMode repeatMode, long j) {
        this.a = f3nVar;
        this.b = repeatMode;
        this.c = j;
        if (f3nVar instanceof ck11) {
            ck11 ck11Var = (ck11) f3nVar;
            if (ck11Var.a != 0 || ck11Var.b != 0) {
                return;
            }
        } else if (!(f3nVar instanceof l1t0) && (!(f3nVar instanceof xkx) || ((xkx) f3nVar).a.a != 0)) {
            return;
        }
        ny61.g("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    @Override // defpackage.jj2
    public final f531 a(gl11 gl11Var) {
        h531 a = this.a.a(gl11Var);
        zer zerVar = new zer();
        zerVar.c = a;
        zerVar.w = this.b;
        zerVar.a = (a.f() + a.r()) * 1000000;
        zerVar.b = this.c * 1000000;
        return zerVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nsv) {
            nsv nsvVar = (nsv) obj;
            if (jl40.l(nsvVar.a, this.a) && nsvVar.b == this.b && nsvVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
