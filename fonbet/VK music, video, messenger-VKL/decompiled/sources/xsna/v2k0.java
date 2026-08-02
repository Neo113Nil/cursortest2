package xsna;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import xsna.fh50;

/* compiled from: SlotTable.kt */
/* loaded from: classes11.dex */
public final class v2k0 extends be implements evi, Iterable<Object>, gcy {
    public int c;
    public int e;
    public int f;
    public boolean h;
    public int i;
    public HashMap<rgt, wgt> k;
    public pg50<qg50> l;
    public int[] b = new int[0];
    public Object[] d = new Object[0];
    public final Object g = new Object();
    public ArrayList<rgt> j = new ArrayList<>();

    public static final void d0(y2k0 y2k0Var, int i) {
        while (y2k0Var.v >= 0 && y2k0Var.u <= i) {
            y2k0Var.U();
            y2k0Var.j();
        }
    }

    @Override // xsna.be
    public final void M(ytf0 ytf0Var) {
        y2k0 f0 = f0();
        try {
            f0.n(f0.r(), new dd4(ytf0Var, 1));
            f0.P();
            s3q0 s3q0Var = s3q0.a;
            f0.e(true);
        } catch (Throwable th) {
            f0.e(false);
            throw th;
        }
    }

    @Override // xsna.be
    public final ph50 N(fd3 fd3Var, rp70 rp70Var) {
        int i;
        Object[] objArr = rp70Var.a;
        int i2 = rp70Var.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (g0(sdi.d(((ic30) objArr[i4]).e))) {
                i4++;
            } else {
                fh50 fh50Var = new fh50((Object) null);
                Object[] objArr2 = rp70Var.a;
                int i5 = rp70Var.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (g0(sdi.d(((ic30) obj).e))) {
                        fh50Var.j(obj);
                    }
                }
                rp70Var = fh50Var;
            }
        }
        u2k0 u2k0Var = new u2k0(this, i3);
        if (rp70Var.b > 1) {
            Comparable comparable = (Comparable) u2k0Var.invoke(rp70Var.d(0));
            int i7 = rp70Var.b;
            int i8 = 1;
            while (true) {
                if (i8 >= i7) {
                    break;
                }
                Comparable comparable2 = (Comparable) u2k0Var.invoke(rp70Var.d(i8));
                if (comparable.compareTo(comparable2) > 0) {
                    fh50 fh50Var2 = new fh50(rp70Var.b);
                    Object[] objArr3 = rp70Var.a;
                    int i9 = rp70Var.b;
                    for (int i10 = 0; i10 < i9; i10++) {
                        fh50Var2.j(objArr3[i10]);
                    }
                    fh50.b bVar = fh50Var2.c;
                    if (bVar == null) {
                        bVar = new fh50.b(fh50Var2);
                        fh50Var2.c = bVar;
                    }
                    if (bVar.b.b > 1) {
                        g5g.L(bVar, new ldq(u2k0Var));
                    }
                    rp70Var = fh50Var2;
                } else {
                    i8++;
                    comparable = comparable2;
                }
            }
        }
        if (rp70Var.f()) {
            return h5h0.b;
        }
        ph50 b = h5h0.b();
        y2k0 f0 = f0();
        try {
            Object[] objArr4 = rp70Var.a;
            int i11 = rp70Var.b;
            for (int i12 = 0; i12 < i11; i12++) {
                ic30 ic30Var = (ic30) objArr4[i12];
                int c = f0.c(sdi.d(ic30Var.e));
                int M = f0.M(c, f0.b);
                d0(f0, M);
                d0(f0, M);
                while (true) {
                    i = f0.t;
                    if (i == M || i == f0.u) {
                        break;
                    }
                    if (M < f0.y(i) + i) {
                        f0.X();
                    } else {
                        f0.T();
                    }
                }
                if (i != M) {
                    androidx.compose.runtime.b.a("Unexpected slot table structure");
                }
                f0.X();
                f0.a(c - f0.t);
                b.p(ic30Var, androidx.compose.runtime.b.c(ic30Var.c, ic30Var, f0, fd3Var));
            }
            d0(f0, Integer.MAX_VALUE);
            s3q0 s3q0Var = s3q0.a;
            f0.e(true);
            return b;
        } catch (Throwable th) {
            f0.e(false);
            throw th;
        }
    }

    public final int a0(rgt rgtVar) {
        if (this.h) {
            androidx.compose.runtime.b.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!rgtVar.a()) {
            gxc0.a("Anchor refers to a group that was removed");
        }
        return rgtVar.a;
    }

    public final void b0() {
        this.l = new pg50<>((Object) null);
    }

    public final void c0() {
        this.k = new HashMap<>();
    }

    public final r2k0 e0() {
        if (this.h) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f++;
        return new r2k0(this);
    }

    public final y2k0 f0() {
        if (this.h) {
            androidx.compose.runtime.b.a("Cannot start a writer when another writer is pending");
        }
        if (this.f > 0) {
            androidx.compose.runtime.b.a("Cannot start a writer when a reader is pending");
        }
        this.h = true;
        this.i++;
        return new y2k0(this);
    }

    public final boolean g0(rgt rgtVar) {
        int f;
        return rgtVar.a() && (f = x2k0.f(this.j, rgtVar.a, this.c)) >= 0 && epx.f(this.j.get(f), rgtVar);
    }

    public final wgt h0(int i) {
        int i2;
        ArrayList<rgt> arrayList;
        int f;
        HashMap<rgt, wgt> hashMap = this.k;
        if (hashMap != null) {
            if (this.h) {
                androidx.compose.runtime.b.a("use active SlotWriter to crate an anchor for location instead");
            }
            rgt rgtVar = (i < 0 || i >= (i2 = this.c) || (f = x2k0.f((arrayList = this.j), i, i2)) < 0) ? null : arrayList.get(f);
            if (rgtVar != null) {
                return hashMap.get(rgtVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new ilu(this, 0, this.c);
    }
}
