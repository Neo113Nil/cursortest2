package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class mjs0 extends e530 implements v0y {
    public float a;
    public float b;
    public float c;
    public float w;
    public boolean x;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r4 != Integer.MAX_VALUE) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long E0(k kVar) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (Float.isNaN(this.c)) {
            i = Integer.MAX_VALUE;
        } else {
            i = kVar.f0(this.c);
            if (i < 0) {
                i = 0;
            }
        }
        if (Float.isNaN(this.w)) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = kVar.f0(this.w);
            if (i2 < 0) {
                i2 = 0;
            }
        }
        if (!Float.isNaN(this.a)) {
            i3 = kVar.f0(this.a);
            if (i3 < 0) {
                i3 = 0;
            }
            if (i3 > i) {
                i3 = i;
            }
        }
        i3 = 0;
        if (!Float.isNaN(this.b)) {
            int f0 = kVar.f0(this.b);
            if (f0 < 0) {
                f0 = 0;
            }
            if (f0 > i2) {
                f0 = i2;
            }
            if (f0 != Integer.MAX_VALUE) {
                i4 = f0;
            }
        }
        return p8e.a(i3, i, i4, i2);
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        long E0 = E0(lookaheadCapablePlaceable);
        if (n8e.g(E0)) {
            return n8e.i(E0);
        }
        if (!this.x) {
            i = p8e.f(i, E0);
        }
        return p8e.g(x910Var.k0(i), E0);
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        long E0 = E0(lookaheadCapablePlaceable);
        if (n8e.g(E0)) {
            return n8e.i(E0);
        }
        if (!this.x) {
            i = p8e.f(i, E0);
        }
        return p8e.g(x910Var.e0(i), E0);
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        int k;
        int i;
        int j2;
        int h;
        long a;
        long E0 = E0(kVar);
        if (this.x) {
            a = p8e.e(j, E0);
        } else {
            if (Float.isNaN(this.a)) {
                k = n8e.k(j);
                int i2 = n8e.i(E0);
                if (k > i2) {
                    k = i2;
                }
            } else {
                k = n8e.k(E0);
            }
            if (Float.isNaN(this.c)) {
                i = n8e.i(j);
                int k2 = n8e.k(E0);
                if (i < k2) {
                    i = k2;
                }
            } else {
                i = n8e.i(E0);
            }
            if (Float.isNaN(this.b)) {
                j2 = n8e.j(j);
                int h2 = n8e.h(E0);
                if (j2 > h2) {
                    j2 = h2;
                }
            } else {
                j2 = n8e.j(E0);
            }
            if (Float.isNaN(this.w)) {
                h = n8e.h(j);
                int j3 = n8e.j(E0);
                if (h < j3) {
                    h = j3;
                }
            } else {
                h = n8e.h(E0);
            }
            a = p8e.a(k, i, j2, h);
        }
        o l0 = x910Var.l0(a);
        return kVar.w(l0.a, l0.b, b.f(), new l3r(l0, 1));
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        long E0 = E0(lookaheadCapablePlaceable);
        if (n8e.f(E0)) {
            return n8e.h(E0);
        }
        if (!this.x) {
            i = p8e.g(i, E0);
        }
        return p8e.f(x910Var.V(i), E0);
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        long E0 = E0(lookaheadCapablePlaceable);
        if (n8e.f(E0)) {
            return n8e.h(E0);
        }
        if (!this.x) {
            i = p8e.g(i, E0);
        }
        return p8e.f(x910Var.y(i), E0);
    }
}
