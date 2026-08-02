package xsna;

import android.app.Activity;
import com.vk.profile.user.impl.ui.UserProfileAction;

/* compiled from: UserProfileFollowersModeFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class gpq0 implements huq {
    public final b4s b;
    public io.reactivex.rxjava3.disposables.b c;
    public u5p0 d;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> e;
    public fpq0 f;

    public gpq0(b4s b4sVar) {
        this.b = b4sVar;
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

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.c = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.d = u5p0Var;
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
        io.reactivex.rxjava3.disposables.c subscribe = this.b.d().subscribe(new xj50(new f6m0(this, 9), 19));
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
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
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
