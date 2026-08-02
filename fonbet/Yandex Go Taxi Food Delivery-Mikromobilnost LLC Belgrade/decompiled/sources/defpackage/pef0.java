package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.div.core.expression.variables.a;
import com.yandex.feedsdk.di.Yatagan$FeedSdkComponent;
import com.yandex.go.profile.domain.flex.f;
import com.yandex.go.profile.ui.ProfileFlexModalView;
import defpackage.kr;
import defpackage.pef0;
import defpackage.tje;
import defpackage.zy11;
import java.util.Collections;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes8.dex */
public final class pef0 extends fkr {
    public final Context G;
    public final jef0 H;
    public final u5g I;
    public final fxl J;
    public final a850 K;
    public final w030 L;
    public final nni0 M;
    public final v3u0 N;
    public final a O;
    public final boolean P = true;
    public ProfileFlexModalView Q;
    public SparseArray R;

    public pef0(Context context, jef0 jef0Var, u5g u5gVar, fxl fxlVar, a850 a850Var, w030 w030Var, nni0 nni0Var, v3u0 v3u0Var, a aVar) {
        this.G = context;
        this.H = jef0Var;
        this.I = u5gVar;
        this.J = fxlVar;
        this.K = a850Var;
        this.L = w030Var;
        this.M = nni0Var;
        this.N = v3u0Var;
        this.O = aVar;
    }

    @Override // defpackage.m230, defpackage.h55
    public final void G(Object obj) {
        nef0 nef0Var = (nef0) obj;
        super.G(nef0Var);
        nef0Var.getClass();
        this.K.i("superprofile", false);
    }

    @Override // defpackage.fkr, defpackage.m230, defpackage.h55
    public final void H(Object obj) {
        nef0 nef0Var = (nef0) obj;
        super.H(nef0Var);
        ProfileFlexModalView profileFlexModalView = this.Q;
        this.R = profileFlexModalView != null ? profileFlexModalView.saveInstanceState() : null;
        nef0Var.getClass();
        this.K.d("superprofile");
    }

    @Override // defpackage.fkr, defpackage.h55
    public final void I(Object obj) {
        this.Q = null;
        this.R = null;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.L;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        nef0 nef0Var = (nef0) obj;
        final f fVar = nef0Var.a;
        tls tlsVar = new tls() { // from class: com.yandex.go.profile.ui.e
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                tje.N(pef0.this.o(), null, CoroutineStart.UNDISPATCHED, new ProfileFlexModalRouter$provideModalView$feedSdkComponent$1$1(fVar, (kr) obj2, null), 1);
                return zy11.a;
            }
        };
        oef0 oef0Var = new oef0(this);
        ljr ljrVar = nef0Var.c;
        jef0 jef0Var = this.H;
        vlr vlrVar = new vlr("Profile", new atl(1, this.O), null, new g0p(null, null, null, null, null, Collections.singletonList((ref0) jef0Var.d.a), null, null, 959), null, new ief0(), null, null, null, null, null, jef0Var.b, jef0Var.c, null, null, null, null, null, null, 1036202);
        Yatagan$FeedSdkComponent yatagan$FeedSdkComponent = (Yatagan$FeedSdkComponent) jef0Var.a.a(vlr.a(vlrVar, null, new s59(jef0Var.e.a(tlsVar, "Profile", oef0Var, ljrVar, new csz(8, vlrVar))), 1048543));
        mef0 mef0Var = new mef0(fVar, yatagan$FeedSdkComponent.x(), this.J, this.M, this.N);
        flex.engine.a w = yatagan$FeedSdkComponent.w();
        com.yandex.go.profile.domain.flex.a aVar = nef0Var.b;
        SparseArray sparseArray = this.R;
        ProfileFlexModalView profileFlexModalView = new ProfileFlexModalView(this.G, mef0Var, w, aVar, sparseArray == null ? 0 : 1, sparseArray, ljrVar);
        this.Q = profileFlexModalView;
        return profileFlexModalView;
    }
}
