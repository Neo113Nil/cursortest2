package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature$StabilizationMode;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.ar7;
import defpackage.b3u;
import defpackage.br7;
import defpackage.bsj0;
import defpackage.d6z;
import defpackage.dyq0;
import defpackage.eav;
import defpackage.eo31;
import defpackage.gbs;
import defpackage.hcv;
import defpackage.icv;
import defpackage.jyq0;
import defpackage.lru0;
import defpackage.lw01;
import defpackage.max0;
import defpackage.ny61;
import defpackage.o84;
import defpackage.oyr;
import defpackage.q8n;
import defpackage.qp7;
import defpackage.qt7;
import defpackage.r38;
import defpackage.ri21;
import defpackage.s38;
import defpackage.s8n;
import defpackage.sgb1;
import defpackage.si21;
import defpackage.szd;
import defpackage.wi21;
import defpackage.x34;
import defpackage.xdb1;
import defpackage.xi21;
import defpackage.yy40;
import defpackage.zi21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes10.dex */
public abstract class j {
    public xi21 e;
    public xi21 f;
    public HashSet g;
    public xi21 h;
    public lru0 i;
    public xi21 j;
    public Rect k;
    public br7 m;
    public br7 n;
    public boolean a = false;
    public final HashSet b = new HashSet();
    public final Object c = new Object();
    public UseCase$State d = UseCase$State.INACTIVE;
    public Matrix l = new Matrix();
    public jyq0 o = jyq0.a();
    public jyq0 p = jyq0.a();

    public j(xi21 xi21Var) {
        this.f = xi21Var;
        this.h = xi21Var;
    }

    public abstract lru0 A(lru0 lru0Var, lru0 lru0Var2);

    public void B() {
    }

    public void C(Matrix matrix) {
        this.l = new Matrix(matrix);
    }

    public final boolean D(int i) {
        Size size;
        int n = ((icv) this.h).n(-1);
        if (n != -1 && n == i) {
            return false;
        }
        wi21 o = o(this.f);
        icv icvVar = (icv) o.e();
        int n2 = icvVar.n(-1);
        if (n2 == -1 || n2 != i) {
            ((hcv) o).a(i);
        }
        if (n2 != -1 && i != -1 && n2 != i) {
            if (Math.abs(xdb1.g(i) - xdb1.g(n2)) % SubsamplingScaleImageView.ORIENTATION_180 == 90 && (size = (Size) icvVar.g(icv.r2, null)) != null) {
                ((hcv) o).c(new Size(size.getHeight(), size.getWidth()));
            }
        }
        this.f = o.e();
        br7 e = e();
        if (e == null) {
            this.h = this.f;
            return true;
        }
        this.h = q(e.f(), this.e, this.j);
        return true;
    }

    public void E(Rect rect) {
        this.k = rect;
    }

    public final void F(br7 br7Var) {
        B();
        synchronized (this.c) {
            try {
                br7 br7Var2 = this.m;
                if (br7Var == br7Var2) {
                    this.b.remove(br7Var2);
                    this.m = null;
                }
                br7 br7Var3 = this.n;
                if (br7Var == br7Var3) {
                    this.b.remove(br7Var3);
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = null;
        this.k = null;
        this.h = this.f;
        this.e = null;
        this.j = null;
    }

    public final void G(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.o = (jyq0) list.get(0);
        if (list.size() > 1) {
            this.p = (jyq0) list.get(1);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (DeferrableSurface deferrableSurface : ((jyq0) it.next()).b()) {
                if (deferrableSurface.j == null) {
                    deferrableSurface.j = getClass();
                }
            }
        }
    }

    public final void a(dyq0 dyq0Var, lru0 lru0Var) {
        Range range = lru0.a;
        if (!range.equals(lru0Var.c())) {
            Range c = lru0Var.c();
            r38 r38Var = dyq0Var.b;
            r38Var.getClass();
            r38Var.b.w(s38.k, c);
            return;
        }
        synchronized (this.c) {
            try {
                br7 br7Var = this.m;
                br7Var.getClass();
                ArrayList c2 = br7Var.f().q().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (c2.size() > 1) {
                    z = false;
                }
                d6z.m("There should not have more than one AeFpsRangeQuirk.", z);
                if (!c2.isEmpty()) {
                    Range range2 = ((AeFpsRangeLegacyQuirk) ((AeFpsRangeQuirk) c2.get(0))).a;
                    if (range2 != null) {
                        range = range2;
                    }
                    r38 r38Var2 = dyq0Var.b;
                    r38Var2.getClass();
                    r38Var2.b.w(s38.k, range);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(br7 br7Var, br7 br7Var2, xi21 xi21Var, xi21 xi21Var2) {
        synchronized (this.c) {
            this.m = br7Var;
            this.n = br7Var2;
            this.b.add(br7Var);
            if (br7Var2 != null) {
                this.b.add(br7Var2);
            }
        }
        this.e = xi21Var;
        this.j = xi21Var2;
        this.h = q(br7Var.f(), this.e, this.j);
        u();
    }

    public final int c() {
        return ((Integer) ((icv) this.h).g(icv.o2, -1)).intValue();
    }

    public final Size d() {
        lru0 lru0Var = this.i;
        if (lru0Var != null) {
            return lru0Var.f();
        }
        return null;
    }

    public final br7 e() {
        br7 br7Var;
        synchronized (this.c) {
            br7Var = this.m;
        }
        return br7Var;
    }

    public final qp7 f() {
        synchronized (this.c) {
            try {
                br7 br7Var = this.m;
                if (br7Var == null) {
                    return qp7.a;
                }
                return br7Var.l();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        br7 e = e();
        d6z.v(e, "No camera attached to use case: " + this);
        return e.f().c();
    }

    public abstract xi21 h(boolean z, zi21 zi21Var);

    public final String i() {
        String str = (String) this.h.g(max0.e4, "<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(str);
        return str;
    }

    public final int j(br7 br7Var, boolean z) {
        int i = br7Var.f().i(n());
        return (br7Var.q() || !z) ? i : lw01.k(-i);
    }

    public final br7 k() {
        br7 br7Var;
        synchronized (this.c) {
            br7Var = this.n;
        }
        return br7Var;
    }

    public Set l(ar7 ar7Var) {
        return null;
    }

    public Set m() {
        return Collections.EMPTY_SET;
    }

    public final int n() {
        return ((icv) this.h).n(0);
    }

    public abstract wi21 o(szd szdVar);

    public final boolean p(br7 br7Var) {
        int intValue = ((Integer) ((icv) this.h).g(icv.q2, -1)).intValue();
        if (intValue == -1 || intValue == 0) {
            return false;
        }
        if (intValue == 1) {
            return true;
        }
        if (intValue == 2) {
            return br7Var.g();
        }
        ny61.f(oyr.i(intValue, "Unknown mirrorMode: "));
        return false;
    }

    public final xi21 q(ar7 ar7Var, xi21 xi21Var, xi21 xi21Var2) {
        yy40 b;
        if (xi21Var2 != null) {
            b = yy40.p(xi21Var2);
            b.z(max0.e4);
        } else {
            b = yy40.b();
        }
        TreeMap treeMap = b.a;
        if (this.f.d(icv.m2) || this.f.d(icv.r2)) {
            x34 x34Var = icv.w2;
            if (treeMap.containsKey(x34Var)) {
                b.z(x34Var);
            }
        }
        xi21 xi21Var3 = this.f;
        x34 x34Var2 = icv.w2;
        if (xi21Var3.d(x34Var2)) {
            x34 x34Var3 = icv.t2;
            if (treeMap.containsKey(x34Var3) && ((bsj0) this.f.f(x34Var2)).b != null) {
                b.z(x34Var3);
            }
        }
        Iterator it = this.f.h().iterator();
        while (it.hasNext()) {
            szd.k(b, b, this.f, (x34) it.next());
        }
        if (xi21Var != null) {
            for (x34 x34Var4 : xi21Var.h()) {
                if (!x34Var4.a.equals(max0.e4.a)) {
                    szd.k(b, b, xi21Var, x34Var4);
                }
            }
        }
        if (treeMap.containsKey(icv.r2)) {
            x34 x34Var5 = icv.m2;
            if (treeMap.containsKey(x34Var5)) {
                b.z(x34Var5);
            }
        }
        x34 x34Var6 = icv.w2;
        if (treeMap.containsKey(x34Var6)) {
            ((bsj0) b.f(x34Var6)).getClass();
        }
        Objects.toString(this.g);
        toString();
        sgb1.g(3, "UseCase");
        HashSet<b3u> hashSet = this.g;
        if (hashSet != null) {
            int i = s8n.c;
            Range range = lru0.a;
            VideoStabilizationFeature$StabilizationMode videoStabilizationFeature$StabilizationMode = eo31.c;
            q8n q8nVar = q8n.d;
            for (b3u b3uVar : hashSet) {
                if (b3uVar instanceof s8n) {
                    q8nVar = ((s8n) b3uVar).a;
                } else if (b3uVar instanceof gbs) {
                    gbs gbsVar = (gbs) b3uVar;
                    range = new Range(Integer.valueOf(gbsVar.a), Integer.valueOf(gbsVar.b));
                } else if (b3uVar instanceof eo31) {
                    videoStabilizationFeature$StabilizationMode = ((eo31) b3uVar).a;
                }
            }
            if ((this instanceof g) || qt7.C(this)) {
                b.w(eav.l2, q8nVar);
            }
            b.w(xi21.p4, range);
            int i2 = ri21.a[videoStabilizationFeature$StabilizationMode.ordinal()];
            if (i2 == 1) {
                b.w(xi21.u4, 1);
                b.w(xi21.w4, 1);
            } else if (i2 == 2) {
                b.w(xi21.u4, 0);
                b.w(xi21.w4, 2);
            } else if (i2 == 3) {
                b.w(xi21.u4, 2);
                b.w(xi21.w4, 0);
            }
        }
        return w(ar7Var, o(b));
    }

    public final void r() {
        this.d = UseCase$State.ACTIVE;
        t();
    }

    public final void s() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((si21) it.next()).p(this);
        }
    }

    public final void t() {
        int ordinal = this.d.ordinal();
        HashSet hashSet = this.b;
        if (ordinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((si21) it.next()).k(this);
            }
        } else {
            if (ordinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((si21) it2.next()).r(this);
            }
        }
    }

    public void u() {
    }

    public void v() {
    }

    public abstract xi21 w(ar7 ar7Var, wi21 wi21Var);

    public void x() {
        this.a = true;
    }

    public void y() {
        this.a = false;
    }

    public abstract o84 z(szd szdVar);
}
