package xsna;

import android.content.Context;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import xsna.oj00;
import xsna.s9u;

/* compiled from: VKMap.kt */
/* loaded from: classes3.dex */
public final class ndr0 implements oj00 {
    public final s9u a;

    /* compiled from: VKMap.kt */
    public static final class a implements s9u.a {
        public final /* synthetic */ oj00.a a;

        public a(oj00.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.s9u.a
        public final void onCancel() {
            oj00.a aVar = this.a;
            if (aVar != null) {
                aVar.onCancel();
            }
        }

        @Override // xsna.s9u.a
        public final void onFinish() {
            oj00.a aVar = this.a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }
    }

    public ndr0(s9u s9uVar) {
        this.a = s9uVar;
    }

    @Override // xsna.oj00
    public final void a(tar0 tar0Var, oj00.a aVar) {
        g(tar0Var, 1000, aVar);
    }

    @Override // xsna.oj00
    public final void b(tar0 tar0Var) {
        this.a.g(tar0Var.a);
    }

    @Override // xsna.oj00
    public final void c(tar0 tar0Var) {
        this.a.b(tar0Var.a);
    }

    @Override // xsna.oj00
    public final void clear() {
        try {
            this.a.a.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.oj00
    public final void d(double d, double d2) {
        this.a.g(xa4.F(new LatLng(d, d2), 16.0f));
    }

    @Override // xsna.oj00
    public final qdr0 e(rdr0 rdr0Var) {
        eo00 a2 = this.a.a(rdr0Var.a);
        if (a2 != null) {
            return new qdr0(a2);
        }
        return null;
    }

    @Override // xsna.oj00
    public final void f(am00 am00Var) {
        s9u s9uVar = this.a;
        odr0 odr0Var = am00Var instanceof odr0 ? (odr0) am00Var : null;
        try {
            s9uVar.a.k0(odr0Var != null ? odr0Var.a : null);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.oj00
    public final void g(tar0 tar0Var, int i, oj00.a aVar) {
        this.a.c(tar0Var.a, i, new a(aVar));
    }

    @Override // xsna.oj00
    public final sar0 h() {
        return new sar0(this.a.d());
    }

    @Override // xsna.oj00
    public final Location i(Context context) {
        return kzz.f(context);
    }

    @Override // xsna.oj00
    public final qdr0 j(double d, double d2) {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.b = new LatLng(d, d2);
        eo00 a2 = this.a.a(markerOptions);
        if (a2 != null) {
            return new qdr0(a2);
        }
        return null;
    }

    @Override // xsna.oj00
    public final void k(boolean z) {
        b1y f = this.a.f();
        f.getClass();
        try {
            ((yov) f.c).k(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void l() {
        b1y f = this.a.f();
        f.getClass();
        try {
            ((yov) f.c).S();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void m(boolean z) {
        try {
            this.a.a.U0(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void n(eer0 eer0Var) {
        mdr0 mdr0Var = new mdr0(eer0Var);
        try {
            this.a.a.z(new js01(mdr0Var));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void o(fer0 fer0Var) {
        ga40 ga40Var = new ga40(fer0Var, 14);
        try {
            this.a.a.t(new tq01(ga40Var));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void p(her0 her0Var) {
        this.a.j(new osk0(her0Var, 9));
    }

    public final void q(int i) {
        try {
            this.a.a.u(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void r() {
        b1y f = this.a.f();
        f.getClass();
        try {
            ((yov) f.c).t0();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
