package xsna;

import androidx.compose.runtime.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.at80;
import xsna.y2k0;

/* compiled from: Operation.kt */
/* loaded from: classes11.dex */
public abstract class ss80 {
    public final int a;
    public final int b;

    /* compiled from: Operation.kt */
    public static final class a extends ss80 {
        public static final a c = new a(1, 0, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.a(aVar.a(0));
        }
    }

    /* compiled from: Operation.kt */
    public static final class a0 extends ss80 {
        public static final a0 c;

        static {
            int i = 1;
            c = new a0(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            ytf0Var.g.b((gzs) aVar.b(0));
        }
    }

    /* compiled from: Operation.kt */
    public static final class b extends ss80 {
        public static final b c = new b(0, 2, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            rgt rgtVar = (rgt) aVar.b(0);
            Object b = aVar.b(1);
            if (b instanceof iuf0) {
                ytf0Var.h((iuf0) b);
            }
            if (y2k0Var.n != 0) {
                androidx.compose.runtime.b.a("Can only append a slot if not current inserting");
            }
            int i = y2k0Var.i;
            int i2 = y2k0Var.j;
            int c2 = y2k0Var.c(rgtVar);
            int g = y2k0Var.g(y2k0Var.v(c2 + 1), y2k0Var.b);
            y2k0Var.i = g;
            y2k0Var.j = g;
            y2k0Var.C(1, c2);
            if (i >= g) {
                i++;
                i2++;
            }
            y2k0Var.c[g] = b;
            y2k0Var.i = i;
            y2k0Var.j = i2;
        }
    }

    /* compiled from: Operation.kt */
    public static final class b0 extends ss80 {
        public static final b0 c;

        static {
            int i = 0;
            c = new b0(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.U();
        }
    }

    /* compiled from: Operation.kt */
    public static final class c extends ss80 {
        public static final c c = new c(0, 2, 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            m9x m9xVar = (m9x) aVar.b(1);
            int i = m9xVar != null ? m9xVar.a : 0;
            csa csaVar = (csa) aVar.b(0);
            if (i > 0) {
                fd3Var = new pv70(fd3Var, i);
            }
            csaVar.r0(fd3Var, y2k0Var, ytf0Var, vs80Var != null ? new qd50(vs80Var, y2k0Var) : null);
        }
    }

    /* compiled from: Operation.kt */
    public static final class c0 extends ss80 {
        public static final c0 c;

        static {
            int i = 1;
            c = new c0(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) aVar.b(0);
            ph50<androidx.compose.runtime.f, lr90> ph50Var = ytf0Var.i;
            lr90 d = ph50Var != null ? ph50Var.d(fVar) : null;
            if (d != null) {
                ArrayList<ci50<iuf0>> arrayList = ytf0Var.j;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    ytf0Var.j = arrayList;
                }
                arrayList.add(ytf0Var.e);
                ytf0Var.e = d.c;
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class d extends ss80 {
        public static final d c = new d(0, 2, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            int i = ((m9x) aVar.b(0)).a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                fd3Var.e(i3, obj);
                fd3Var.i(i3, obj);
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class d0 extends ss80 {
        public static final d0 c = new d0(1, 0, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            int a = aVar.a(0);
            int i = y2k0Var.v;
            int V = y2k0Var.V(y2k0Var.v(i), y2k0Var.b);
            int g = y2k0Var.g(y2k0Var.v(i + 1), y2k0Var.b);
            for (int max = Math.max(V, g - a); max < g; max++) {
                Object obj = y2k0Var.c[y2k0Var.h(max)];
                if (obj instanceof iuf0) {
                    ytf0Var.e((iuf0) obj);
                } else if (obj instanceof androidx.compose.runtime.f) {
                    ((androidx.compose.runtime.f) obj).d();
                }
            }
            if (a <= 0) {
                androidx.compose.runtime.b.a("Check failed");
            }
            int i2 = y2k0Var.v;
            int V2 = y2k0Var.V(y2k0Var.v(i2), y2k0Var.b);
            int g2 = y2k0Var.g(y2k0Var.v(i2 + 1), y2k0Var.b) - a;
            if (g2 < V2) {
                androidx.compose.runtime.b.a("Check failed");
            }
            y2k0Var.R(g2, a, i2);
            int i3 = y2k0Var.i;
            if (i3 >= V2) {
                y2k0Var.i = i3 - a;
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class e extends ss80 {
        public static final e c = new e(0, 4, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            ic30 ic30Var = (ic30) aVar.b(2);
            ic30 ic30Var2 = (ic30) aVar.b(3);
            cvi cviVar = (cvi) aVar.b(1);
            hc30 hc30Var = (hc30) aVar.b(0);
            if (hc30Var == null && (hc30Var = cviVar.p(ic30Var)) == null) {
                throw at.b("Could not resolve state for movable content");
            }
            v2k0 e = x2k0.e(hc30Var.a);
            if (y2k0Var.n > 0 || y2k0Var.y(y2k0Var.t + 1) != 1) {
                androidx.compose.runtime.b.a("Check failed");
            }
            int i = y2k0Var.t;
            int i2 = y2k0Var.i;
            int i3 = y2k0Var.j;
            y2k0Var.a(1);
            y2k0Var.X();
            y2k0Var.d();
            y2k0 f0 = e.f0();
            try {
                List a = y2k0.a.a(f0, 2, y2k0Var, false, true, true);
                f0.e(true);
                y2k0Var.k();
                y2k0Var.j();
                y2k0Var.t = i;
                y2k0Var.i = i2;
                y2k0Var.j = i3;
                f.a.a(y2k0Var, a, (wef0) ic30Var2.c);
            } catch (Throwable th) {
                f0.e(false);
                throw th;
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class e0 extends ss80 {
        public static final e0 c = new e0(1, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            Object b = aVar.b(0);
            rgt rgtVar = (rgt) aVar.b(1);
            int a = aVar.a(0);
            if (b instanceof iuf0) {
                ytf0Var.h((iuf0) b);
            }
            Object S = y2k0Var.S(y2k0Var.c(rgtVar), a, b);
            if (S instanceof iuf0) {
                ytf0Var.e((iuf0) S);
            } else if (S instanceof androidx.compose.runtime.f) {
                ((androidx.compose.runtime.f) S).d();
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class f extends ss80 {
        public static final f c;

        static {
            int i = 0;
            c = new f(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.n(y2k0Var.t, new x7d(5, ytf0Var, y2k0Var));
        }
    }

    /* compiled from: Operation.kt */
    public static final class f0 extends ss80 {
        public static final f0 c;

        static {
            int i = 1;
            c = new f0(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.c0(aVar.b(0));
        }
    }

    /* compiled from: Operation.kt */
    public static final class g extends ss80 {
        public static final g c = new g(0, 2, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            int i;
            m9x m9xVar = (m9x) aVar.b(0);
            int c2 = y2k0Var.c((rgt) aVar.b(1));
            if (y2k0Var.t >= c2) {
                androidx.compose.runtime.b.a("Check failed");
            }
            aqw.k(y2k0Var, fd3Var, c2);
            int i2 = y2k0Var.t;
            int i3 = y2k0Var.v;
            while (i3 >= 0 && !y2k0Var.D(i3)) {
                i3 = y2k0Var.M(i3, y2k0Var.b);
            }
            int i4 = i3 + 1;
            int i5 = 0;
            while (i4 < i2) {
                if (y2k0Var.A(i2, i4)) {
                    if (y2k0Var.D(i4)) {
                        i5 = 0;
                    }
                    i4++;
                } else {
                    i5 += y2k0Var.D(i4) ? 1 : y2k0Var.K(i4);
                    i4 += y2k0Var.y(i4);
                }
            }
            while (true) {
                i = y2k0Var.t;
                if (i >= c2) {
                    break;
                }
                if (y2k0Var.A(c2, i)) {
                    int i6 = y2k0Var.t;
                    if (i6 < y2k0Var.u && (y2k0Var.b[(y2k0Var.v(i6) * 5) + 1] & 1073741824) != 0) {
                        fd3Var.f(y2k0Var.J(y2k0Var.t));
                        i5 = 0;
                    }
                    y2k0Var.X();
                } else {
                    i5 += y2k0Var.T();
                }
            }
            if (i != c2) {
                androidx.compose.runtime.b.a("Check failed");
            }
            m9xVar.a = i5;
        }
    }

    /* compiled from: Operation.kt */
    public static final class g0 extends ss80 {
        public static final g0 c = new g0(0, 2, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            fd3Var.b(aVar.b(0), (wzs) aVar.b(1));
        }
    }

    /* compiled from: Operation.kt */
    public static final class h extends ss80 {
        public static final h c;

        static {
            int i = 1;
            c = new h(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            for (Object obj : (Object[]) aVar.b(0)) {
                fd3Var.f(obj);
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class h0 extends ss80 {
        public static final h0 c = new h0(1, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            Object b = aVar.b(0);
            int a = aVar.a(0);
            if (b instanceof iuf0) {
                ytf0Var.h((iuf0) b);
            }
            Object S = y2k0Var.S(y2k0Var.t, a, b);
            if (S instanceof iuf0) {
                ytf0Var.e((iuf0) S);
            } else if (S instanceof androidx.compose.runtime.f) {
                ((androidx.compose.runtime.f) S).d();
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class i extends ss80 {
        public static final i c = new i(0, 2, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            ((izs) aVar.b(0)).invoke((bvi) aVar.b(1));
        }
    }

    /* compiled from: Operation.kt */
    public static final class i0 extends ss80 {
        public static final i0 c = new i0(1, 0, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            int a = aVar.a(0);
            for (int i = 0; i < a; i++) {
                fd3Var.j();
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class j extends ss80 {
        public static final j c;

        static {
            int i = 0;
            c = new j(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.j();
        }
    }

    /* compiled from: Operation.kt */
    public static final class j0 extends ss80 {
        public static final j0 c;

        static {
            int i = 0;
            c = new j0(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            fd3Var.d();
        }
    }

    /* compiled from: Operation.kt */
    public static final class k extends ss80 {
        public static final k c;

        static {
            int i = 0;
            c = new k(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            aqw.k(y2k0Var, fd3Var, 0);
            y2k0Var.j();
        }
    }

    /* compiled from: Operation.kt */
    public static final class l extends ss80 {
        public static final l c;

        static {
            int i = 1;
            c = new l(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            ci50<iuf0> remove;
            androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) aVar.b(0);
            ph50<androidx.compose.runtime.f, lr90> ph50Var = ytf0Var.i;
            if (ph50Var == null || ph50Var.d(fVar) == null) {
                return;
            }
            ArrayList<ci50<iuf0>> arrayList = ytf0Var.j;
            if (arrayList != null && (remove = arrayList.remove(arrayList.size() - 1)) != null) {
                ytf0Var.e = remove;
            }
            ph50Var.n(fVar);
        }
    }

    /* compiled from: Operation.kt */
    public static final class m extends ss80 {
        public static final m c;

        static {
            int i = 1;
            c = new m(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            rgt rgtVar = (rgt) aVar.b(0);
            rgtVar.getClass();
            y2k0Var.l(y2k0Var.c(rgtVar));
        }
    }

    /* compiled from: Operation.kt */
    public static final class n extends ss80 {
        public static final n c;

        static {
            int i = 0;
            c = new n(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.l(0);
        }
    }

    /* compiled from: Operation.kt */
    public static final class o extends ss80 {
        public static final o c = new o(1, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            Object invoke = ((gzs) aVar.b(0)).invoke();
            rgt rgtVar = (rgt) aVar.b(1);
            int a = aVar.a(0);
            rgtVar.getClass();
            y2k0Var.e0(y2k0Var.c(rgtVar), invoke);
            fd3Var.i(a, invoke);
            fd3Var.f(invoke);
        }

        @Override // xsna.ss80
        public final rgt b(at80.a aVar) {
            return (rgt) aVar.b(1);
        }
    }

    /* compiled from: Operation.kt */
    public static final class p extends ss80 {
        public static final p c = new p(0, 2, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            v2k0 v2k0Var = (v2k0) aVar.b(1);
            rgt rgtVar = (rgt) aVar.b(0);
            y2k0Var.d();
            rgtVar.getClass();
            y2k0Var.F(v2k0Var, v2k0Var.a0(rgtVar));
            y2k0Var.k();
        }
    }

    /* compiled from: Operation.kt */
    public static final class q extends ss80 {
        public static final q c = new q(0, 3, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            qd50 qd50Var;
            v2k0 v2k0Var = (v2k0) aVar.b(1);
            rgt rgtVar = (rgt) aVar.b(0);
            lnr lnrVar = (lnr) aVar.b(2);
            y2k0 f0 = v2k0Var.f0();
            if (vs80Var != null) {
                try {
                    qd50Var = new qd50(vs80Var, y2k0Var);
                } catch (Throwable th) {
                    f0.e(false);
                    throw th;
                }
            } else {
                qd50Var = null;
            }
            if (!lnrVar.c.isEmpty()) {
                androidx.compose.runtime.b.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            lnrVar.b.a0(fd3Var, f0, ytf0Var, qd50Var);
            s3q0 s3q0Var = s3q0.a;
            f0.e(true);
            y2k0Var.d();
            rgtVar.getClass();
            y2k0Var.F(v2k0Var, v2k0Var.a0(rgtVar));
            y2k0Var.k();
        }
    }

    /* compiled from: Operation.kt */
    public static final class r extends ss80 {
        public static final r c = new r(1, 0, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            rgt rgtVar;
            int c2;
            int a = aVar.a(0);
            if (y2k0Var.n != 0) {
                androidx.compose.runtime.b.a("Cannot move a group while inserting");
            }
            if (a < 0) {
                androidx.compose.runtime.b.a("Parameter offset is out of bounds");
            }
            if (a == 0) {
                return;
            }
            int i = y2k0Var.t;
            int i2 = y2k0Var.v;
            int i3 = y2k0Var.u;
            int i4 = i;
            while (a > 0) {
                i4 += x2k0.a(y2k0Var.v(i4), y2k0Var.b);
                if (i4 > i3) {
                    androidx.compose.runtime.b.a("Parameter offset is out of bounds");
                }
                a--;
            }
            int a2 = x2k0.a(y2k0Var.v(i4), y2k0Var.b);
            int g = y2k0Var.g(y2k0Var.v(y2k0Var.t), y2k0Var.b);
            int g2 = y2k0Var.g(y2k0Var.v(i4), y2k0Var.b);
            int i5 = i4 + a2;
            int g3 = y2k0Var.g(y2k0Var.v(i5), y2k0Var.b);
            int i6 = g3 - g2;
            y2k0Var.C(i6, Math.max(y2k0Var.t - 1, 0));
            y2k0Var.B(a2);
            int[] iArr = y2k0Var.b;
            int v = y2k0Var.v(i5) * 5;
            jw5.e(y2k0Var.v(i) * 5, v, (a2 * 5) + v, iArr, iArr);
            if (i6 > 0) {
                Object[] objArr = y2k0Var.c;
                int h = y2k0Var.h(g2 + i6);
                System.arraycopy(objArr, h, objArr, g, y2k0Var.h(g3 + i6) - h);
            }
            int i7 = g2 + i6;
            int i8 = i7 - g;
            int i9 = y2k0Var.k;
            int i10 = y2k0Var.l;
            int length = y2k0Var.c.length;
            int i11 = y2k0Var.m;
            int i12 = i + a2;
            int i13 = i;
            while (i13 < i12) {
                int v2 = y2k0Var.v(i13);
                int i14 = i8;
                int[] iArr2 = iArr;
                iArr2[(v2 * 5) + 4] = y2k0.i(y2k0.i(y2k0Var.g(v2, iArr) - i14, i11 < v2 ? 0 : i9, i10, length), y2k0Var.k, y2k0Var.l, y2k0Var.c.length);
                i13++;
                i8 = i14;
                iArr = iArr2;
                i9 = i9;
            }
            int i15 = i5 + a2;
            int t = y2k0Var.t();
            int b = x2k0.b(y2k0Var.d, i5, t);
            ArrayList arrayList = new ArrayList();
            if (b >= 0) {
                while (b < y2k0Var.d.size() && (c2 = y2k0Var.c((rgtVar = y2k0Var.d.get(b)))) >= i5 && c2 < i15) {
                    arrayList.add(rgtVar);
                    y2k0Var.d.remove(b);
                }
            }
            int i16 = i - i5;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                rgt rgtVar2 = (rgt) arrayList.get(i17);
                int c3 = y2k0Var.c(rgtVar2) + i16;
                if (c3 >= y2k0Var.g) {
                    rgtVar2.a = -(t - c3);
                } else {
                    rgtVar2.a = c3;
                }
                y2k0Var.d.add(x2k0.b(y2k0Var.d, c3, t), rgtVar2);
            }
            if (y2k0Var.Q(i5, a2)) {
                androidx.compose.runtime.b.a("Unexpectedly removed anchors");
            }
            y2k0Var.m(i2, y2k0Var.u, i);
            if (i6 > 0) {
                y2k0Var.R(i7, i6, i5 - 1);
            }
        }
    }

    /* compiled from: Operation.kt */
    public static final class s extends ss80 {
        public static final s c = new s(3, 0, 2);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            fd3Var.h(aVar.a(0), aVar.a(1), aVar.a(2));
        }
    }

    /* compiled from: Operation.kt */
    public static final class t extends ss80 {
        public static final t c = new t(1, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            rgt rgtVar = (rgt) aVar.b(0);
            int a = aVar.a(0);
            fd3Var.j();
            rgtVar.getClass();
            fd3Var.e(a, y2k0Var.J(y2k0Var.c(rgtVar)));
        }

        @Override // xsna.ss80
        public final rgt b(at80.a aVar) {
            return (rgt) aVar.b(0);
        }
    }

    /* compiled from: Operation.kt */
    public static final class u extends ss80 {
        public static final u c = new u(0, 3, 1);

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            hqj hqjVar = (hqj) aVar.b(0);
            ic30 ic30Var = (ic30) aVar.b(2);
            ((cvi) aVar.b(1)).o(ic30Var, androidx.compose.runtime.b.c(hqjVar, ic30Var, y2k0Var, null), fd3Var);
        }
    }

    /* compiled from: Operation.kt */
    public static final class v extends ss80 {
        public static final v c;

        static {
            int i = 1;
            c = new v(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            ytf0Var.h((iuf0) aVar.b(0));
        }
    }

    /* compiled from: Operation.kt */
    public static final class w extends ss80 {
        public static final w c;

        static {
            int i = 1;
            c = new w(0, i, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            androidx.compose.runtime.f fVar = (androidx.compose.runtime.f) aVar.b(0);
            Set<huf0> set = ytf0Var.a;
            if (set == null) {
                return;
            }
            lr90 lr90Var = new lr90(set);
            ph50<androidx.compose.runtime.f, lr90> ph50Var = ytf0Var.i;
            if (ph50Var == null) {
                ph50Var = h5h0.b();
                ytf0Var.i = ph50Var;
            }
            ph50Var.p(fVar, lr90Var);
            ytf0Var.e.b(new zgt(lr90Var, -1));
        }
    }

    /* compiled from: Operation.kt */
    public static final class x extends ss80 {
        public static final x c;

        static {
            int i = 0;
            c = new x(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            y2k0Var.n(y2k0Var.r(), new dd4(ytf0Var, 1));
            y2k0Var.P();
        }
    }

    /* compiled from: Operation.kt */
    public static final class y extends ss80 {
        public static final y c;

        static {
            int i = 2;
            c = new y(i, 0, i);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            fd3Var.g(aVar.a(0), aVar.a(1));
        }
    }

    /* compiled from: Operation.kt */
    public static final class z extends ss80 {
        public static final z c;

        static {
            int i = 0;
            c = new z(i, i, 3);
        }

        @Override // xsna.ss80
        public final void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
            if (y2k0Var.n != 0) {
                androidx.compose.runtime.b.a("Cannot reset when inserting");
            }
            y2k0Var.O();
            y2k0Var.t = 0;
            y2k0Var.u = y2k0Var.o() - y2k0Var.h;
            y2k0Var.i = 0;
            y2k0Var.j = 0;
            y2k0Var.o = 0;
        }
    }

    public ss80(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public abstract void a(at80.a aVar, fd3 fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var);

    public rgt b(at80.a aVar) {
        return null;
    }

    public final String toString() {
        String l2 = fpf0.a(getClass()).l();
        return l2 == null ? "" : l2;
    }

    public /* synthetic */ ss80(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
