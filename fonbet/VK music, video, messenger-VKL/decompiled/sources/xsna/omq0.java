package xsna;

import android.app.Activity;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: UserProfileBroadcastFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class omq0 implements huq {
    public final dvq0 b;
    public final bvq0 c;
    public final lyd0 d;
    public u5p0 e;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> f;
    public fpq0 g;

    public omq0(dvq0 dvq0Var, bvq0 bvq0Var, lyd0 lyd0Var) {
        this.b = dvq0Var;
        this.c = bvq0Var;
        this.d = lyd0Var;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.g = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.f;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.e = u5p0Var;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.f = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
