package xsna;

import android.app.Activity;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: UserProfileDetailsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class koq0 implements huq {
    public final a13 b;
    public final q3s c;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> d;
    public fpq0 e;

    public koq0(a13 a13Var, q3s q3sVar) {
        this.b = a13Var;
        this.c = q3sVar;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.e = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.d;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.d = r9c0Var;
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
