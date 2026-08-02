package xsna;

import android.app.Activity;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserProfileWallActionFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class gvq0 implements huq {
    public u5p0 b;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> c;
    public fpq0 d;

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.d = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.c;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(UserProfileAction.d0 d0Var, com.vk.profile.user.impl.ui.g gVar) {
        if (!(d0Var instanceof UserProfileAction.d0.e)) {
            if (d0Var instanceof UserProfileAction.d0.a) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.c;
                (izsVar != null ? izsVar : null).invoke(new b.z.a());
                return;
            }
            if (d0Var instanceof UserProfileAction.d0.b.a) {
                u5p0 u5p0Var = this.b;
                (u5p0Var != null ? u5p0Var : null).invoke(UserProfileAction.u.a.b.b);
                return;
            }
            if (d0Var instanceof UserProfileAction.d0.g) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = this.c;
                (izsVar2 != null ? izsVar2 : null).invoke(new b.p());
                return;
            }
            if (d0Var instanceof UserProfileAction.d0.d.a) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar3 = this.c;
                (izsVar3 != null ? izsVar3 : null).invoke(new b.o(((UserProfileAction.d0.d.a) d0Var).b));
                return;
            } else if (d0Var instanceof UserProfileAction.d0.c.a) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar4 = this.c;
                (izsVar4 != null ? izsVar4 : null).invoke(new b.g(((UserProfileAction.d0.c.a) d0Var).b));
                return;
            } else {
                if (!(d0Var instanceof UserProfileAction.d0.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar5 = this.c;
                (izsVar5 != null ? izsVar5 : null).invoke(new b.z.C1714b(((UserProfileAction.d0.f) d0Var).b));
                return;
            }
        }
        UserProfileAction.d0.e eVar = (UserProfileAction.d0.e) d0Var;
        if (eVar instanceof UserProfileAction.d0.e.a) {
            WallGetMode wallGetMode = ((UserProfileAction.d0.e.a) eVar).b;
            if (wallGetMode != gVar.o) {
                u5p0 u5p0Var2 = this.b;
                if (u5p0Var2 == null) {
                    u5p0Var2 = null;
                }
                u5p0Var2.invoke(new UserProfileAction.d0.f(true));
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar6 = this.c;
                (izsVar6 != null ? izsVar6 : null).invoke(new b.u(wallGetMode));
                return;
            }
            return;
        }
        if (eVar instanceof UserProfileAction.d0.e.b.a) {
            ExtendedUserProfile extendedUserProfile = gVar.j;
            if (extendedUserProfile == null) {
                return;
            }
            fpq0 fpq0Var = this.d;
            (fpq0Var != null ? fpq0Var : null).B(new f.e.b1(extendedUserProfile));
            return;
        }
        if (eVar instanceof UserProfileAction.d0.e.c) {
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar7 = this.c;
            (izsVar7 != null ? izsVar7 : null).invoke(new b.z.c());
        } else {
            if (!(eVar instanceof UserProfileAction.d0.e.d)) {
                throw new NoWhenBranchMatchedException();
            }
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar8 = this.c;
            (izsVar8 != null ? izsVar8 : null).invoke(new b.e0());
        }
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.b = u5p0Var;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.c = r9c0Var;
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
