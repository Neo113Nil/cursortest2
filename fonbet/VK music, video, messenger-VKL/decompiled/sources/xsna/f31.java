package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import xsna.it80;

/* compiled from: AdvertBannerFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class f31 implements huq {
    public final vc0 b;
    public final Context c;
    public final loq0 d;
    public io.reactivex.rxjava3.disposables.b e;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> f;

    public f31(vc0 vc0Var, Context context, loq0 loq0Var) {
        this.b = vc0Var;
        this.c = context;
        this.d = loq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.f;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.b bVar) {
        UserProfile userProfile;
        UserId userId;
        UserProfile userProfile2;
        UserId userId2;
        d690 d690Var = this.b.a;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (bVar.equals(UserProfileAction.b.c.b)) {
            if (extendedUserProfile == null || (userProfile2 = extendedUserProfile.a) == null || (userId2 = userProfile2.c) == null) {
                return;
            }
            ComFeatures comFeatures = ComFeatures.COM_ADVERT_BANNER;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures) && bwd0.d(extendedUserProfile)) {
                d690Var.getClass();
                tfx tfxVar = new tfx("owners.getBanner", new b690(0), new wp(25));
                tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
                tfxVar.f(27, 1, 29, "banner_type");
                io.reactivex.rxjava3.internal.operators.single.y l = rsg0.w0(yfb.x(tfxVar)).l(new kb(new i8(3), 2));
                it80.b.getClass();
                io.reactivex.rxjava3.disposables.c subscribe = l.o(it80.a.a()).subscribe(new hz(new mb(this, 1), 1));
                io.reactivex.rxjava3.disposables.b bVar2 = this.e;
                (bVar2 != null ? bVar2 : null).b(subscribe);
                return;
            }
            return;
        }
        if (!(bVar instanceof UserProfileAction.b.a)) {
            if (!(bVar instanceof UserProfileAction.b.C1673b)) {
                throw new NoWhenBranchMatchedException();
            }
            maz.c((maz) this.d.r.getValue(), this.c, ((UserProfileAction.b.C1673b) bVar).b, LaunchContext.A, null, null, 24);
            return;
        }
        String str = ((UserProfileAction.b.a) bVar).b;
        if (extendedUserProfile == null || (userProfile = extendedUserProfile.a) == null || (userId = userProfile.c) == null) {
            return;
        }
        d690Var.getClass();
        tfx tfxVar2 = new tfx("owners.hideBanner", new uf3(21), new up(24));
        tfx.n(tfxVar2, "owner_id", userId, 0L, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar2, "banner_id", str, 0, 0, 12);
        }
        io.reactivex.rxjava3.disposables.c l2 = itg0.l(rsg0.Z(yfb.x(tfxVar2)));
        io.reactivex.rxjava3.disposables.b bVar3 = this.e;
        if (bVar3 == null) {
            bVar3 = null;
        }
        bVar3.b(l2);
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.f;
        (izsVar != null ? izsVar : null).invoke(b.a.C1705a.b);
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.e = bVar;
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
    public final void H(fpq0 fpq0Var) {
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
