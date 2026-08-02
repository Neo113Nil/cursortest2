package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.bev;
import defpackage.bvf0;
import defpackage.cjs0;
import defpackage.cvw;
import defpackage.da3;
import defpackage.dui0;
import defpackage.ea3;
import defpackage.fa3;
import defpackage.ga3;
import defpackage.ha3;
import defpackage.hev;
import defpackage.ibm;
import defpackage.ike;
import defpackage.jl40;
import defpackage.mhe;
import defpackage.nev;
import defpackage.nhe;
import defpackage.o400;
import defpackage.ocf;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.qam;
import defpackage.qav;
import defpackage.qcf;
import defpackage.qhw0;
import defpackage.r7b1;
import defpackage.sd90;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tx40;
import defpackage.u3v0;
import defpackage.u92;
import defpackage.uyj;
import defpackage.wec;
import defpackage.wx01;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class d extends pa90 implements dui0 {
    public static final tls N = null;
    public ha3 D;
    public pa90 E;
    public tls F;
    public tls G;
    public nhe H;
    public int I;
    public boolean J;
    public final oz40 K;
    public final oz40 L;
    public final oz40 M;
    public ike y;
    public final r0 z = bvf0.c(new cjs0(0));
    public final oz40 A = androidx.compose.runtime.f.j(null);
    public final tx40 B = androidx.compose.runtime.f.f(1.0f);
    public final oz40 C = androidx.compose.runtime.f.j(null);

    public d(hev hevVar, qav qavVar) {
        da3 da3Var = da3.a;
        this.D = da3Var;
        this.F = AsyncImagePainter$Companion$DefaultTransform$1.w;
        this.H = mhe.b;
        this.I = 1;
        this.K = androidx.compose.runtime.f.j(da3Var);
        this.L = androidx.compose.runtime.f.j(hevVar);
        this.M = androidx.compose.runtime.f.j(qavVar);
    }

    @Override // defpackage.pa90
    public final boolean a(float f) {
        this.B.setFloatValue(f);
        return true;
    }

    @Override // defpackage.dui0
    public final void b() {
        if (this.y != null) {
            return;
        }
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        ike a2 = bvf0.a(cvw.U(a, o400.a.x));
        this.y = a2;
        Object obj = this.E;
        dui0 dui0Var = obj instanceof dui0 ? (dui0) obj : null;
        if (dui0Var != null) {
            dui0Var.b();
        }
        if (!this.J) {
            tje.N(a2, null, null, new AsyncImagePainter$onRemembered$1(this, null), 3);
            return;
        }
        bev F = hev.F((hev) this.L.getValue());
        F.b = ((coil.c) ((qav) this.M.getValue())).b;
        F.B = null;
        Drawable v = F.d().v();
        l(new fa3(v != null ? k(v) : null));
    }

    @Override // defpackage.pa90
    public final boolean c(wec wecVar) {
        this.C.setValue(wecVar);
        return true;
    }

    @Override // defpackage.dui0
    public final void d() {
        ike ikeVar = this.y;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.y = null;
        Object obj = this.E;
        dui0 dui0Var = obj instanceof dui0 ? (dui0) obj : null;
        if (dui0Var != null) {
            dui0Var.d();
        }
    }

    @Override // defpackage.dui0
    public final void e() {
        ike ikeVar = this.y;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.y = null;
        Object obj = this.E;
        dui0 dui0Var = obj instanceof dui0 ? (dui0) obj : null;
        if (dui0Var != null) {
            dui0Var.e();
        }
    }

    @Override // defpackage.pa90
    public final long i() {
        pa90 pa90Var = (pa90) this.A.getValue();
        if (pa90Var != null) {
            return pa90Var.i();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.pa90
    public final void j(qam qamVar) {
        cjs0 cjs0Var = new cjs0(qamVar.c());
        r0 r0Var = this.z;
        r0Var.getClass();
        r0Var.m(null, cjs0Var);
        pa90 pa90Var = (pa90) this.A.getValue();
        if (pa90Var != null) {
            pa90Var.g(qamVar, qamVar.c(), this.B.getFloatValue(), (wec) this.C.getValue());
        }
    }

    public final pa90 k(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? r7b1.a(new u92(((BitmapDrawable) drawable).getBitmap()), this.I) : new ibm(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(ha3 ha3Var) {
        nev nevVar;
        pa90 pa90Var;
        tls tlsVar;
        dui0 dui0Var;
        dui0 dui0Var2;
        ha3 ha3Var2 = this.D;
        ha3 ha3Var3 = (ha3) this.F.invoke(ha3Var);
        this.D = ha3Var3;
        this.K.setValue(ha3Var3);
        if (!(ha3Var3 instanceof ga3)) {
            if (ha3Var3 instanceof ea3) {
                nevVar = ((ea3) ha3Var3).b;
            }
            pa90Var = null;
            if (pa90Var == null) {
                pa90Var = ha3Var3.a();
            }
            this.E = pa90Var;
            this.A.setValue(pa90Var);
            if (this.y != null && ha3Var2.a() != ha3Var3.a()) {
                Object a = ha3Var2.a();
                dui0Var = !(a instanceof dui0) ? (dui0) a : null;
                if (dui0Var != null) {
                    dui0Var.e();
                }
                Object a2 = ha3Var3.a();
                dui0Var2 = a2 instanceof dui0 ? (dui0) a2 : null;
                if (dui0Var2 != null) {
                    dui0Var2.b();
                }
            }
            tlsVar = this.G;
            if (tlsVar != null) {
                tlsVar.invoke(ha3Var3);
                return;
            }
            return;
        }
        nevVar = ((ga3) ha3Var3).b;
        wx01 a3 = nevVar.b().j.a(sd90.a, nevVar);
        if (a3 instanceof qcf) {
            qcf qcfVar = (qcf) a3;
            pa90Var = new ocf(ha3Var2 instanceof fa3 ? ha3Var2.a() : null, ha3Var3.a(), this.H, qcfVar.c, ((nevVar instanceof u3v0) && ((u3v0) nevVar).g) ? false : true, qcfVar.w);
            if (pa90Var == null) {
            }
            this.E = pa90Var;
            this.A.setValue(pa90Var);
            if (this.y != null) {
                Object a4 = ha3Var2.a();
                if (!(a4 instanceof dui0)) {
                }
                if (dui0Var != null) {
                }
                Object a22 = ha3Var3.a();
                if (a22 instanceof dui0) {
                }
                if (dui0Var2 != null) {
                }
            }
            tlsVar = this.G;
            if (tlsVar != null) {
            }
        }
        pa90Var = null;
        if (pa90Var == null) {
        }
        this.E = pa90Var;
        this.A.setValue(pa90Var);
        if (this.y != null) {
        }
        tlsVar = this.G;
        if (tlsVar != null) {
        }
    }
}
