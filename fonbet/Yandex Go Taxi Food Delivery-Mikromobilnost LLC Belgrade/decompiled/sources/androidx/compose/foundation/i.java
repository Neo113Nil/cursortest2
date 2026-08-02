package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.node.s;
import androidx.compose.ui.node.u;
import defpackage.c1y;
import defpackage.c8m;
import defpackage.dr60;
import defpackage.e530;
import defpackage.ejt;
import defpackage.fwi;
import defpackage.gnq0;
import defpackage.k6w;
import defpackage.m810;
import defpackage.mnq0;
import defpackage.ni9;
import defpackage.oi9;
import defpackage.oz40;
import defpackage.pam;
import defpackage.qje;
import defpackage.qxi;
import defpackage.rzo;
import defpackage.sb2;
import defpackage.t200;
import defpackage.tje;
import defpackage.tls;
import defpackage.u200;
import defpackage.v5c0;
import defpackage.wfz;
import defpackage.wu60;
import defpackage.x4c;
import defpackage.zy11;
import kotlinx.coroutines.CoroutineStart;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class i extends e530 implements ejt, pam, gnq0, dr60 {
    public boolean A;
    public wfz B;
    public View C;
    public fwi D;
    public v5c0 E;
    public qxi G;
    public k6w I;
    public kotlinx.coroutines.channels.a J;
    public tls a;
    public tls b;
    public float c;
    public boolean w;
    public long x;
    public float y;
    public float z;
    public final oz40 F = androidx.compose.runtime.f.i(null, x4c.Q);
    public long H = 9205357640488583168L;

    public i(tls tlsVar, tls tlsVar2, float f, boolean z, long j, float f2, float f3, boolean z2, wfz wfzVar) {
        this.a = tlsVar;
        this.b = tlsVar2;
        this.c = f;
        this.w = z;
        this.x = j;
        this.y = f2;
        this.z = f3;
        this.A = z2;
        this.B = wfzVar;
    }

    public final long E0() {
        if (this.G == null) {
            this.G = androidx.compose.runtime.f.d(new t200(this, 2));
        }
        qxi qxiVar = this.G;
        if (qxiVar != null) {
            return ((wu60) qxiVar.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void F0() {
        v5c0 v5c0Var;
        v5c0 v5c0Var2 = this.E;
        if (v5c0Var2 != null) {
            ((Magnifier) v5c0Var2.b).dismiss();
        }
        View view = this.C;
        if (view == null) {
            view = tje.V(this);
        }
        this.C = view;
        fwi fwiVar = this.D;
        if (fwiVar == null) {
            fwiVar = qje.P(this).R;
        }
        this.D = fwiVar;
        wfz wfzVar = this.B;
        boolean z = this.w;
        long j = this.x;
        float f = this.y;
        float f2 = this.z;
        boolean z2 = this.A;
        float f3 = this.c;
        wfzVar.getClass();
        if (z) {
            v5c0Var = new v5c0(2, new Magnifier(view));
        } else {
            long R = fwiVar.R(j);
            float w0 = fwiVar.w0(f);
            float w02 = fwiVar.w0(f2);
            Magnifier.Builder builder = new Magnifier.Builder(view);
            if (R != 9205357640488583168L) {
                builder.setSize(m810.b(Float.intBitsToFloat((int) (R >> 32))), m810.b(Float.intBitsToFloat((int) (R & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
            }
            if (!Float.isNaN(w0)) {
                builder.setCornerRadius(w0);
            }
            if (!Float.isNaN(w02)) {
                builder.setElevation(w02);
            }
            if (!Float.isNaN(f3)) {
                builder.setInitialZoom(f3);
            }
            builder.setClippingEnabled(z2);
            v5c0Var = new v5c0(2, builder.build());
        }
        this.E = v5c0Var;
        H0();
    }

    public final void G0() {
        fwi fwiVar = this.D;
        if (fwiVar == null) {
            fwiVar = qje.P(this).R;
            this.D = fwiVar;
        }
        long j = ((wu60) this.a.invoke(fwiVar)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (E0() & 9223372034707292159L) == 9205357640488583168L) {
            this.H = 9205357640488583168L;
            v5c0 v5c0Var = this.E;
            if (v5c0Var != null) {
                ((Magnifier) v5c0Var.b).dismiss();
                return;
            }
            return;
        }
        this.H = wu60.f(E0(), j);
        if (this.E == null) {
            F0();
        }
        v5c0 v5c0Var2 = this.E;
        if (v5c0Var2 != null) {
            long j2 = this.H;
            float f = this.c;
            Magnifier magnifier = (Magnifier) v5c0Var2.b;
            if (!Float.isNaN(f)) {
                magnifier.setZoom(f);
            }
            if ((9205357640488583168L & 9223372034707292159L) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & 9205357640488583168L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2)));
            }
        }
        H0();
    }

    public final void H0() {
        fwi fwiVar;
        v5c0 v5c0Var = this.E;
        if (v5c0Var == null || (fwiVar = this.D) == null) {
            return;
        }
        long G = v5c0Var.G();
        k6w k6wVar = this.I;
        if (k6wVar != null && G == k6wVar.a) {
            return;
        }
        tls tlsVar = this.b;
        if (tlsVar != null) {
            tlsVar.invoke(new c8m(fwiVar.f(rzo.a0(v5c0Var.G()))));
        }
        this.I = new k6w(v5c0Var.G());
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        c1yVar.a();
        kotlinx.coroutines.channels.a aVar = this.J;
        if (aVar != null) {
            aVar.d(zy11.a);
            ni9 ni9Var = oi9.b;
        }
    }

    @Override // defpackage.dr60
    public final void e0() {
        u.e(this, new t200(this, 0));
    }

    @Override // defpackage.ejt
    public final void g(s sVar) {
        this.F.setValue(sVar);
    }

    @Override // defpackage.e530
    public final void onAttach() {
        e0();
        this.J = sb2.a(0, null, null, 7);
        tje.N(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // defpackage.e530
    public final void onDetach() {
        v5c0 v5c0Var = this.E;
        if (v5c0Var != null) {
            ((Magnifier) v5c0Var.b).dismiss();
        }
        this.E = null;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        mnq0Var.a(u200.a, new t200(this, 1));
    }
}
