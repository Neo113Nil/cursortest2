package coil.compose;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import defpackage.aa10;
import defpackage.blm0;
import defpackage.c1y;
import defpackage.cjs0;
import defpackage.cma1;
import defpackage.cot;
import defpackage.e530;
import defpackage.jdi0;
import defpackage.jt1;
import defpackage.k28;
import defpackage.m810;
import defpackage.n8e;
import defpackage.nhe;
import defpackage.p8e;
import defpackage.pa90;
import defpackage.pam;
import defpackage.rzo;
import defpackage.sb2;
import defpackage.sx21;
import defpackage.tls;
import defpackage.v0y;
import defpackage.wec;
import defpackage.x910;
import defpackage.y6i0;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class g extends e530 implements pam, v0y {
    public pa90 a;
    public jt1 b;
    public nhe c;
    public float w;
    public wec x;

    public final long E0(long j) {
        if (cjs0.e(j)) {
            return 0L;
        }
        long i = this.a.i();
        if (i != 9205357640488583168L) {
            float d = cjs0.d(i);
            if (Float.isInfinite(d) || Float.isNaN(d)) {
                d = cjs0.d(j);
            }
            float b = cjs0.b(i);
            if (Float.isInfinite(b) || Float.isNaN(b)) {
                b = cjs0.b(j);
            }
            long a = cma1.a(d, b);
            long j2 = this.c.j(a, j);
            int i2 = blm0.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            if (!Float.isInfinite(intBitsToFloat) && !Float.isNaN(intBitsToFloat)) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2));
                if (!Float.isInfinite(intBitsToFloat2) && !Float.isNaN(intBitsToFloat2)) {
                    return sb2.J(a, j2);
                }
            }
        }
        return j;
    }

    public final long F0(long j) {
        float k;
        int j2;
        float c;
        boolean g = n8e.g(j);
        boolean f = n8e.f(j);
        if (!g || !f) {
            boolean z = n8e.e(j) && n8e.d(j);
            long i = this.a.i();
            if (i != 9205357640488583168L) {
                if (z && (g || f)) {
                    k = n8e.i(j);
                    j2 = n8e.h(j);
                } else {
                    float d = cjs0.d(i);
                    float b = cjs0.b(i);
                    if (Float.isInfinite(d) || Float.isNaN(d)) {
                        k = n8e.k(j);
                    } else {
                        jdi0 jdi0Var = sx21.b;
                        k = y6i0.c(d, n8e.k(j), n8e.i(j));
                    }
                    if (!Float.isInfinite(b) && !Float.isNaN(b)) {
                        jdi0 jdi0Var2 = sx21.b;
                        c = y6i0.c(b, n8e.j(j), n8e.h(j));
                        long E0 = E0(cma1.a(k, c));
                        return n8e.b(p8e.g(m810.b(cjs0.d(E0)), j), j, 0, p8e.f(m810.b(cjs0.b(E0)), j), 0, 10);
                    }
                    j2 = n8e.j(j);
                }
                c = j2;
                long E02 = E0(cma1.a(k, c));
                return n8e.b(p8e.g(m810.b(cjs0.d(E02)), j), j, 0, p8e.f(m810.b(cjs0.b(E02)), j), 0, 10);
            }
            if (z) {
                return n8e.b(n8e.i(j), j, 0, n8e.h(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.v0y
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (this.a.i() == 9205357640488583168L) {
            return x910Var.k0(i);
        }
        int k0 = x910Var.k0(n8e.h(F0(p8e.b(0, 0, 0, i, 7))));
        return Math.max(m810.b(cjs0.d(E0(cma1.a(k0, i)))), k0);
    }

    @Override // defpackage.v0y
    public final int b(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (this.a.i() == 9205357640488583168L) {
            return x910Var.e0(i);
        }
        int e0 = x910Var.e0(n8e.h(F0(p8e.b(0, 0, 0, i, 7))));
        return Math.max(m810.b(cjs0.d(E0(cma1.a(e0, i)))), e0);
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        k28 k28Var = c1yVar.a;
        long E0 = E0(k28Var.c());
        jt1 jt1Var = this.b;
        jdi0 jdi0Var = sx21.b;
        long h = rzo.h(m810.b(cjs0.d(E0)), m810.b(cjs0.b(E0)));
        long c = k28Var.c();
        long a = jt1Var.a(h, rzo.h(m810.b(cjs0.d(c)), m810.b(cjs0.b(c))), c1yVar.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        ((cot) k28Var.b.a).n(f, f2);
        this.a.g(c1yVar, E0, this.w, this.x);
        ((cot) k28Var.b.a).n(-f, -f2);
        c1yVar.a();
    }

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        final o l0 = x910Var.l0(F0(j));
        return kVar.w(l0.a, l0.b, kotlin.collections.b.f(), new tls() { // from class: coil.compose.ContentPainterNode$measure$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a.o((o.a) obj, o.this, 0, 0);
                return zy11.a;
            }
        });
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.v0y
    public final int l0(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (this.a.i() == 9205357640488583168L) {
            return x910Var.V(i);
        }
        int V = x910Var.V(n8e.i(F0(p8e.b(0, i, 0, 0, 13))));
        return Math.max(m810.b(cjs0.b(E0(cma1.a(i, V)))), V);
    }

    @Override // defpackage.v0y
    public final int v(LookaheadCapablePlaceable lookaheadCapablePlaceable, x910 x910Var, int i) {
        if (this.a.i() == 9205357640488583168L) {
            return x910Var.y(i);
        }
        int y = x910Var.y(n8e.i(F0(p8e.b(0, i, 0, 0, 13))));
        return Math.max(m810.b(cjs0.b(E0(cma1.a(i, y)))), y);
    }
}
