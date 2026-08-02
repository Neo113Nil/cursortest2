package xsna;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.q630;

/* compiled from: HitPathTracker.kt */
/* loaded from: classes11.dex */
public final class y8v {
    public final tny a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final fh50<q630.c> f = new fh50<>((Object) null);
    public final g570 g = new g570();
    public final xg50<fh50<t470>> h = new xg50<>(10);

    /* compiled from: HitPathTracker.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ q630.c $pointerInputNode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q630.c cVar) {
            super(0);
            this.$pointerInputNode = cVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            y8v.this.d(this.$pointerInputNode);
            return s3q0.a;
        }
    }

    public y8v(tny tnyVar) {
        this.a = tnyVar;
    }

    public final void a(boolean z, long j, List list) {
        xg50<fh50<t470>> xg50Var;
        int i;
        t470 t470Var;
        t470 t470Var2;
        int size = list.size();
        g570 g570Var = this.g;
        g570 g570Var2 = g570Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            xg50Var = this.h;
            if (i2 >= size) {
                break;
            }
            q630.c cVar = (q630.c) list.get(i2);
            if (cVar.o) {
                cVar.n = new a(cVar);
                if (z2) {
                    ci50<t470> ci50Var = g570Var2.a;
                    t470[] t470VarArr = ci50Var.b;
                    int i3 = ci50Var.d;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            t470Var2 = null;
                            break;
                        }
                        t470Var2 = t470VarArr[i4];
                        if (epx.f(t470Var2.c, cVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    t470Var = t470Var2;
                    if (t470Var != null) {
                        t470Var.i = true;
                        t470Var.d.d(j);
                        if (z) {
                            fh50<t470> b = xg50Var.b(j);
                            if (b == null) {
                                b = new fh50<>((Object) null);
                                xg50Var.i(j, b);
                            }
                            b.j(t470Var);
                        }
                        g570Var2 = t470Var;
                    } else {
                        z2 = false;
                    }
                }
                t470Var = new t470(cVar);
                t470Var.d.d(j);
                if (z) {
                    fh50<t470> b2 = xg50Var.b(j);
                    if (b2 == null) {
                        b2 = new fh50<>((Object) null);
                        xg50Var.i(j, b2);
                    }
                    b2.j(t470Var);
                }
                g570Var2.a.b(t470Var);
                g570Var2 = t470Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr = xg50Var.b;
            Object[] objArr = xg50Var.c;
            long[] jArr2 = xg50Var.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr2[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr[i9];
                                fh50<t470> fh50Var = (fh50) objArr[i9];
                                i = i6;
                                ci50<t470> ci50Var2 = g570Var.a;
                                t470[] t470VarArr2 = ci50Var2.b;
                                int i10 = ci50Var2.d;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    t470VarArr2[i11].f(j3, fh50Var);
                                }
                            } else {
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                        }
                        if (i7 != i6) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        xg50Var.d();
    }

    public final boolean b(rkx rkxVar, boolean z) {
        x500<xlb0> x500Var = rkxVar.a;
        tny tnyVar = this.a;
        g570 g570Var = this.g;
        boolean a2 = g570Var.a(x500Var, tnyVar, rkxVar, z);
        ci50<t470> ci50Var = g570Var.a;
        if (!a2) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        t470[] t470VarArr = ci50Var.b;
        int i = ci50Var.d;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z3 = t470VarArr[i2].e(rkxVar, z) || z3;
        }
        t470[] t470VarArr2 = ci50Var.b;
        int i3 = ci50Var.d;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            z4 = t470VarArr2[i4].d(rkxVar) || z4;
        }
        g570Var.b(rkxVar);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            fh50<q630.c> fh50Var = this.f;
            int i5 = fh50Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d(fh50Var.d(i6));
            }
            fh50Var.m();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            g570Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        g570 g570Var = this.g;
        ci50<t470> ci50Var = g570Var.a;
        t470[] t470VarArr = ci50Var.b;
        int i = ci50Var.d;
        for (int i2 = 0; i2 < i; i2++) {
            t470VarArr[i2].c();
        }
        if (this.d) {
            this.d = true;
        } else {
            g570Var.a.g();
        }
    }

    public final void d(q630.c cVar) {
        if (this.b) {
            this.e = true;
            this.f.j(cVar);
            return;
        }
        g570 g570Var = this.g;
        fh50<g570> fh50Var = g570Var.b;
        fh50Var.m();
        fh50Var.j(g570Var);
        while (fh50Var.g()) {
            g570 o = fh50Var.o(fh50Var.b - 1);
            int i = 0;
            while (true) {
                ci50<t470> ci50Var = o.a;
                if (i < ci50Var.d) {
                    t470 t470Var = ci50Var.b[i];
                    if (epx.f(t470Var.c, cVar)) {
                        o.a.j(t470Var);
                        t470Var.c();
                    } else {
                        fh50Var.j(t470Var);
                        i++;
                    }
                }
            }
        }
    }
}
