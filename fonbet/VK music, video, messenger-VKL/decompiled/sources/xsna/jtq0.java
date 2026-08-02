package xsna;

import android.app.Activity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$PublishingEvent;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.api.ExtendedUserProfile;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gij;
import xsna.nyd0;
import xsna.rgc0;

/* compiled from: UserProfilePostingFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class jtq0 implements huq {
    public final r0e0 b;
    public final htq0 c;
    public final dvq0 d;
    public final rgc0 e;
    public final uaq0 f;
    public final lyd0 g;
    public final fhc0 h;
    public io.reactivex.rxjava3.disposables.b i;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> j;
    public fpq0 k;
    public final boolean l;
    public egc0 m;
    public gzs<? extends ExtendedUserProfile> n;

    /* compiled from: UserProfilePostingFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingCreationEntryPoint.values().length];
            try {
                iArr[PostingCreationEntryPoint.ProfileWallButton.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePostponedPostsThreePoints.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePostponedPosts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingCreationEntryPoint.ProfilePlusButton.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UserProfilePostingFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<gij.d, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gij.d dVar) {
            gij.d dVar2 = dVar;
            jtq0 jtq0Var = (jtq0) this.receiver;
            if (jtq0Var.e(dVar2)) {
                fpq0 fpq0Var = jtq0Var.k;
                if (fpq0Var == null) {
                    fpq0Var = null;
                }
                fpq0Var.B(new f.b.c(dVar2.c, dVar2.d));
            }
            return s3q0.a;
        }
    }

    /* compiled from: UserProfilePostingFeatureDelegate.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<gij.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(gij.a aVar) {
            gij.a aVar2 = aVar;
            jtq0 jtq0Var = (jtq0) this.receiver;
            if (jtq0Var.e(aVar2)) {
                fpq0 fpq0Var = jtq0Var.k;
                if (fpq0Var == null) {
                    fpq0Var = null;
                }
                fpq0Var.B(new f.b.a(aVar2.a, aVar2.c));
            }
            return s3q0.a;
        }
    }

    public jtq0(r0e0 r0e0Var, htq0 htq0Var, dvq0 dvq0Var, rgc0 rgc0Var, uaq0 uaq0Var, lyd0 lyd0Var, fhc0 fhc0Var) {
        this.b = r0e0Var;
        this.c = htq0Var;
        this.d = dvq0Var;
        this.e = rgc0Var;
        this.f = uaq0Var;
        this.g = lyd0Var;
        this.h = fhc0Var;
        ComFeatures comFeatures = ComFeatures.COM_PROFILE_POSTING_REDESIGN;
        comFeatures.getClass();
        this.l = com.vk.toggle.b.A.a(comFeatures);
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.k = fpq0Var;
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.j;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(UserProfileAction.h.a aVar) {
        if (aVar.equals(UserProfileAction.h.a.C1688a.b)) {
            egc0 egc0Var = this.m;
            (egc0Var != null ? egc0Var : null).A6(PostingCreationEntryPoint.ProfileWallButton);
        } else {
            if (!aVar.equals(UserProfileAction.h.a.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            egc0 egc0Var2 = this.m;
            (egc0Var2 != null ? egc0Var2 : null).d3();
        }
    }

    public final void b(UserProfileAction.u.a aVar, ExtendedUserProfile extendedUserProfile) {
        if (extendedUserProfile == null) {
            return;
        }
        this.n = new tfm0(extendedUserProfile, 10);
        if (aVar instanceof UserProfileAction.u.a.C1699a) {
            egc0 egc0Var = this.m;
            (egc0Var != null ? egc0Var : null).x1(false, PostingCreationEntryPoint.ProfileWallButton);
        } else {
            if (!(aVar instanceof UserProfileAction.u.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            egc0 egc0Var2 = this.m;
            kgc0.Z1(egc0Var2 != null ? egc0Var2 : null, PostingCreationEntryPoint.ProfileWallButton, false, 12);
        }
    }

    public final void c(UserProfileAction.v vVar) {
        if (!vVar.equals(UserProfileAction.v.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        nyd0.j c2 = this.g.c();
        c2.getClass();
        c2.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.CLICK_TO_POSTPONED);
        fpq0 fpq0Var = this.k;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(f.e.x0.a);
    }

    public final void d(UserProfileAction.z zVar) {
        if (!zVar.equals(UserProfileAction.z.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        nyd0.j c2 = this.g.c();
        c2.getClass();
        c2.a(MobileOfficialAppsProfileStat$PublishingEvent.PublishingEventType.CLICK_TO_DRAFTS);
        fpq0 fpq0Var = this.k;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(f.e.l0.a);
    }

    public final boolean e(gij gijVar) {
        UserId userId = this.b.a;
        boolean a2 = this.d.a(userId);
        if (!userId.equals(gijVar.a) || !a2) {
            return false;
        }
        int i = a.$EnumSwitchMapping$0[gijVar.b.ordinal()];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.i = bVar;
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
        this.m = this.e.b(new qq40(activity, 1), new rgc0.a(new j79(this), CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, this.h, this.d.c()), new ape0(this, 19), new ktq0(this, activity));
        if (this.l) {
            uaq0 uaq0Var = this.f;
            io.reactivex.rxjava3.core.q<gij.d> a2 = uaq0Var.a();
            asu0 asu0Var = asu0.a;
            io.reactivex.rxjava3.disposables.c h = hg1.h(a2.a0(asu0Var.c()).r0(asu0Var.d()), new b(1, this, jtq0.class, "onVideoAddEvent", "onVideoAddEvent(Lcom/vk/newsfeed/api/posting/ContentOriginMetadata$Video;)V", 0));
            io.reactivex.rxjava3.disposables.b bVar = this.i;
            if (bVar == null) {
                bVar = null;
            }
            bVar.b(h);
            io.reactivex.rxjava3.disposables.c h2 = hg1.h(uaq0Var.c().a0(asu0Var.c()).r0(asu0Var.d()), new c(1, this, jtq0.class, "onClipAddEvent", "onClipAddEvent(Lcom/vk/newsfeed/api/posting/ContentOriginMetadata$Clip;)V", 0));
            io.reactivex.rxjava3.disposables.b bVar2 = this.i;
            (bVar2 != null ? bVar2 : null).b(h2);
        }
    }

    @Override // xsna.huq
    public final void onStart() {
        egc0 egc0Var = this.m;
        if (egc0Var == null) {
            egc0Var = null;
        }
        egc0Var.onStart();
    }

    @Override // xsna.huq
    public final void onStop() {
        egc0 egc0Var = this.m;
        if (egc0Var == null) {
            egc0Var = null;
        }
        egc0Var.getClass();
        egc0 egc0Var2 = this.m;
        (egc0Var2 != null ? egc0Var2 : null).onDestroy();
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.j = r9c0Var;
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
    public final void k(u5p0 u5p0Var) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
