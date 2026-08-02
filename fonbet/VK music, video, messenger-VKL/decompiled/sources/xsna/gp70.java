package xsna;

import androidx.compose.animation.core.RepeatMode;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Animator.kt */
/* loaded from: classes11.dex */
public final class gp70 extends ar2 {
    public final int a;
    public final int b;
    public final int c;
    public final RepeatMode d;
    public final ArrayList e;
    public final int f;

    public gp70(int i, int i2, int i3, RepeatMode repeatMode, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = repeatMode;
        this.e = arrayList;
        this.f = i3 == -1 ? Integer.MAX_VALUE : ((i3 + 1) * i) + i2;
    }

    @Override // xsna.ar2
    public final void b(ph50<String, m7e0<?>> ph50Var, int i, int i2) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p7e0 p7e0Var = (p7e0) arrayList.get(i3);
            if (!(p7e0Var instanceof o7e0)) {
                boolean z = p7e0Var instanceof r7e0;
                int i4 = this.b;
                if (z) {
                    r7e0 r7e0Var = (r7e0) p7e0Var;
                    kqr kqrVar = (kqr) ph50Var.d(r7e0Var.a);
                    if (kqrVar == null) {
                        kqrVar = new kqr();
                    }
                    kqrVar.a.add(new sxo0(i2 + i4, this.a, this.c, this.d, (n7e0) p7e0Var));
                    ph50Var.p(r7e0Var.a, kqrVar);
                } else if (p7e0Var instanceof q7e0) {
                    q7e0 q7e0Var = (q7e0) p7e0Var;
                    p7g p7gVar = (p7g) ph50Var.d(q7e0Var.a);
                    if (p7gVar == null) {
                        p7gVar = new p7g();
                    }
                    p7gVar.a.add(new sxo0(i2 + i4, this.a, this.c, this.d, (n7e0) p7e0Var));
                    ph50Var.p(q7e0Var.a, p7gVar);
                } else if (p7e0Var instanceof u7e0) {
                    u7e0 u7e0Var = (u7e0) p7e0Var;
                    vq90 vq90Var = (vq90) ph50Var.d(u7e0Var.a);
                    if (vq90Var == null) {
                        vq90Var = new vq90();
                    }
                    vq90Var.a.add(new sxo0(i2 + i4, this.a, this.c, this.d, (n7e0) p7e0Var));
                    ph50Var.p(u7e0Var.a, vq90Var);
                } else if (!(p7e0Var instanceof s7e0)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    @Override // xsna.ar2
    public final int c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp70)) {
            return false;
        }
        gp70 gp70Var = (gp70) obj;
        return this.a == gp70Var.a && this.b == gp70Var.b && this.c == gp70Var.c && this.d == gp70Var.d && epx.f(this.e, gp70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectAnimator(duration=");
        sb.append(this.a);
        sb.append(", startDelay=");
        sb.append(this.b);
        sb.append(", repeatCount=");
        sb.append(this.c);
        sb.append(", repeatMode=");
        sb.append(this.d);
        sb.append(", holders=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }
}
