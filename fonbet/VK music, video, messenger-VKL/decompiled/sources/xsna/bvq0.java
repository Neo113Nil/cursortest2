package xsna;

import android.app.Activity;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: UserProfileStatusFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class bvq0 implements huq {
    public final dvq0 b;
    public final u2b0 c;
    public final lyd0 d;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> e;
    public fpq0 f;

    public bvq0(dvq0 dvq0Var, u2b0 u2b0Var, lyd0 lyd0Var) {
        this.b = dvq0Var;
        this.c = u2b0Var;
        this.d = lyd0Var;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.f = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.e;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.e = r9c0Var;
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
    public final void k(u5p0 u5p0Var) {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
