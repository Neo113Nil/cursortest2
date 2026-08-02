package com.yandex.go.navigator.ui;

import android.app.Activity;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.navigator.address.PreorderAddressUpdateInteractor$attach$$inlined$safeCollectLatestIn$1;
import com.yandex.go.navigator.domain.u;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayer;
import defpackage.ad50;
import defpackage.ah00;
import defpackage.byx;
import defpackage.c430;
import defpackage.cyx;
import defpackage.dd50;
import defpackage.fif;
import defpackage.g18;
import defpackage.hiq0;
import defpackage.l56;
import defpackage.ng50;
import defpackage.r8;
import defpackage.rz8;
import defpackage.sb50;
import defpackage.spe0;
import defpackage.tje;
import defpackage.un0;
import defpackage.wb50;
import defpackage.x94;
import defpackage.ydf;
import defpackage.zc50;

/* loaded from: classes12.dex */
public final class b extends r8 {
    public static final Animation L = new Animation(Animation.Type.SMOOTH, 0.5f);
    public final cyx A;
    public final spe0 B;
    public final ng50 C;
    public final wb50 D;
    public final sb50 E;
    public final hiq0 F;
    public final fif G;
    public final x94 H;
    public NavigationLayer I;
    public final zc50 J;
    public g18 K;
    public final Activity c;
    public final dd50 w;
    public final u x;
    public final rz8 y;
    public final l56 z;

    public b(Activity activity, ah00 ah00Var, dd50 dd50Var, u uVar, rz8 rz8Var, l56 l56Var, cyx cyxVar, spe0 spe0Var, ng50 ng50Var, wb50 wb50Var, sb50 sb50Var, hiq0 hiq0Var, fif fifVar, x94 x94Var) {
        super(5, ah00Var);
        this.c = activity;
        this.w = dd50Var;
        this.x = uVar;
        this.y = rz8Var;
        this.z = l56Var;
        this.A = cyxVar;
        this.B = spe0Var;
        this.C = ng50Var;
        this.D = wb50Var;
        this.E = sb50Var;
        this.F = hiq0Var;
        this.G = fifVar;
        this.H = x94Var;
        this.J = new zc50(this);
        this.K = g18.u1;
    }

    public final void attach() {
        this.C.attach();
        this.D.c();
        this.z.hideBlockedZones();
        this.A.b(new byx(Screen.SUMMARY, new c430(Mode.NAVIGATOR, (kotlinx.serialization.json.b) null, (un0) null)));
        ad50 ad50Var = new ad50(this);
        dd50 dd50Var = this.w;
        dd50Var.Bg(ad50Var);
        tje.N(dd50Var.Jg(), null, null, new NavigatorMapPresenter$attachView$1(dd50Var, null), 3);
        spe0 spe0Var = this.B;
        spe0Var.d.a();
        tje.N(spe0Var.d, null, null, new PreorderAddressUpdateInteractor$attach$$inlined$safeCollectLatestIn$1(spe0Var.a.c, null, spe0Var), 3);
        this.K = this.G.c(new ydf(6));
    }
}
