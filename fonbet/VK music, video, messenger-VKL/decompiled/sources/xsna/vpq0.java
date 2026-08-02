package xsna;

import android.app.Activity;
import com.vk.dto.profile.RequestsBlock;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: UserProfileFriendsFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class vpq0 implements huq {
    public final r0e0 b;
    public final dvq0 c;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> d;
    public fpq0 e;

    public vpq0(r0e0 r0e0Var, dvq0 dvq0Var) {
        this.b = r0e0Var;
        this.c = dvq0Var;
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

    public final void a(com.vk.profile.user.impl.ui.g gVar) {
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null) {
            return;
        }
        boolean a = this.c.a(this.b.a);
        boolean z = extendedUserProfile.a.B.b;
        boolean z2 = extendedUserProfile.b("friends") != 0;
        boolean z3 = extendedUserProfile.a1 == 3;
        RequestsBlock requestsBlock = extendedUserProfile.Q;
        com.vk.profile.user.impl.ui.f u1Var = (!a || z2) ? a ? new f.e.u1(extendedUserProfile) : (z && z3) ? new f.e.u1(extendedUserProfile) : z ? new f.e.t1(extendedUserProfile) : new f.e.u1(extendedUserProfile) : (requestsBlock != null ? requestsBlock.c : 0) > 0 ? new f.e.u1(extendedUserProfile) : f.e.m.a;
        fpq0 fpq0Var = this.e;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(u1Var);
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
