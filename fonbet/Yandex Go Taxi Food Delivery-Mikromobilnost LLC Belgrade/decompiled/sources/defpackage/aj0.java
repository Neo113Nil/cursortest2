package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.PowerManager;
import com.squareup.moshi.Moshi;
import com.yandex.go.ads.prefetch.impl.d;
import com.yandex.go.clarify_address.a;
import com.yandex.go.clarify_address.c;
import com.yandex.go.layers.domain.g;
import com.yandex.go.payments.cards.data.h;
import com.yandex.go.quark.ai_assistant.impl.router.b;
import com.yandex.go.user_profile.ui.am.u;
import ru.yandex.taxi.address.repository.f;

/* loaded from: classes8.dex */
public final class aj0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public aj0(kgn kgnVar, bt2 bt2Var, xvf0 xvf0Var) {
        this.a = 10;
        this.d = kgnVar;
        this.c = bt2Var;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new zi0((ie) ((x) xvf0Var2).get(), (Context) xvf0Var3.get(), (w030) xvf0Var.get());
            case 1:
                return new a((mr0) xvf0Var3.get(), (c) ((nl9) xvf0Var2).get(), (jtq0) xvf0Var.get());
            case 2:
                return new bw0((hbm) ((upj) xvf0Var2).get(), (tk51) xvf0Var3.get(), (f) xvf0Var.get());
            case 3:
                return new com.yandex.go.ads.prefetch.impl.a((Context) xvf0Var3.get(), (zd1) xvf0Var.get(), (d) ((qy0) xvf0Var2).get());
            case 4:
                return new ru.yandex.taxi.layers.domain.a((ru.yandex.taxi.layers.domain.links.a) ((n2g) xvf0Var2).get(), (hit) ((m2g) xvf0Var3).get(), (g) ((m2g) xvf0Var).get());
            case 5:
                return new b((Context) xvf0Var3.get(), (vgg0) xvf0Var.get(), (npe0) xvf0Var2);
            case 6:
                return new da0(1, (w030) xvf0Var3.get(), (wx1) xvf0Var.get(), (v920) ((x4) xvf0Var2).get());
            case 7:
                return new ru.yandex.taxi.altpins.source.overlay.a((ah00) xvf0Var3.get(), (tz1) ((oe) xvf0Var2).get(), (a02) ((qy0) xvf0Var).get());
            case 8:
                return new c02((mf00) xvf0Var3.get(), (aj0) xvf0Var2, (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var.get());
            case 9:
                return new u((yj70) ((ec80) xvf0Var2).get(), (zuj0) xvf0Var3.get(), (u02) xvf0Var.get());
            case 10:
                return new pho((gp50) ((kgn) xvf0Var2).get(), (w8h) ((bt2) xvf0Var).get(), (xhh) xvf0Var3.get());
            case 11:
                return new qs2((t2m) xvf0Var3.get(), (ms2) ((y2g) xvf0Var2).get(), i5m.a((z2g) xvf0Var));
            case 12:
                return ((lt2) xvf0Var3.get()).z((qc20) ((i5s0) xvf0Var2).get(), (j5z) xvf0Var.get());
            case 13:
                return new com.yandex.go.proxyprovision.a((yws) xvf0Var3.get(), (afh) ((uq2) xvf0Var2).get(), (yg4) xvf0Var.get());
            case 14:
                return new com.yandex.messaging.internal.b((odt) ((mwq) xvf0Var2).get(), (kse) xvf0Var3.get(), (lqo) xvf0Var.get());
            case 15:
                sm40 sm40Var = (sm40) xvf0Var3.get();
                i5m.a((my0) xvf0Var2);
                return new kf4(sm40Var, i5m.a((n0k0) xvf0Var));
            case 16:
                return new jb7(5, (cxq0) ((o10) xvf0Var2).get(), (vmw0) xvf0Var3.get(), (ru.yandex.taxi.badge.a) xvf0Var.get());
            case 17:
                return new i85((ugd) xvf0Var3.get(), xvf0Var, (lf0) xvf0Var2);
            case 18:
                return new rf5((o61) ((bi4) xvf0Var2).get(), (bg5) xvf0Var3.get(), (PowerManager) xvf0Var.get());
            case 19:
                return new mrj(25, (lx4) xvf0Var3.get(), (dho) xvf0Var.get(), (co40) ((nup0) xvf0Var2).get());
            case 20:
                return new com.yandex.go.benefits_center.activation.domain.a((com.yandex.go.benefits_center.data.a) ((fr3) xvf0Var2).get(), (rn5) ((fn5) xvf0Var3).get(), (com.yandex.go.benefits_center.activation.data.a) ((nf) xvf0Var).get());
            case 21:
                return new vn5((tse) xvf0Var3.get(), (wgr) xvf0Var.get(), (co5) ((fn5) xvf0Var2).get());
            case 22:
                return new com.yandex.go.benefits_center.claim.domain.a((com.yandex.go.benefits_center.data.a) xvf0Var3.get(), (rn5) xvf0Var.get(), (com.yandex.go.benefits_center.claim.data.a) ((nf) xvf0Var2).get());
            case 23:
                return new com.yandex.go.payments.cards.data.a((h) xvf0Var3.get(), (ql3) ((xv2) xvf0Var2).get(), (com.yandex.go.payments.di.a) xvf0Var.get());
            case 24:
                return new com.yandex.go.superapp.biometrics.domain.a((com.yandex.go.cryptosdk.a) xvf0Var3.get(), (com.yandex.go.superapp.biometrics.domain.b) ((o10) xvf0Var2).get(), (yy5) xvf0Var.get());
            case 25:
                return new i46((Activity) xvf0Var3.get(), (com.yandex.go.blockeduser.data.c) xvf0Var.get(), (b46) xvf0Var2);
            case 26:
                return new h56((sr4) ((gd) xvf0Var2).get(), (y46) xvf0Var3.get(), (l56) xvf0Var.get());
            case 27:
                return new u66((pdc) xvf0Var3.get(), (s66) ((fn5) xvf0Var2).get(), (nbj) xvf0Var.get());
            case 28:
                return new com.ybsdk.network.retrofit.b((y8j0) xvf0Var3.get(), (Moshi) xvf0Var.get(), (u0k0) ((zlf0) xvf0Var2).get());
            default:
                return new fk7((jg7) xvf0Var3.get(), (jc4) ((abx0) xvf0Var2).get(), (yi7) xvf0Var.get());
        }
    }

    public /* synthetic */ aj0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.d = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ aj0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i, boolean z) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = xvf0Var3;
    }

    public /* synthetic */ aj0(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = v7pVar;
    }
}
