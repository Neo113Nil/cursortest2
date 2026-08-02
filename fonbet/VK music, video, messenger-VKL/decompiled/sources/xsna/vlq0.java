package xsna;

import android.app.Activity;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.log.L;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.atq0;
import xsna.gs90;
import xsna.nyd0;
import xsna.zp0;

/* compiled from: UserProfileAdditionalActionFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class vlq0 implements huq {
    public final dvq0 b;
    public final gd60 c;
    public final fnq d;
    public final ouq0 e;
    public final ProfileAction.a f;
    public final lyd0 g;
    public final lzh0 h;
    public u5p0 i;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> j;
    public fpq0 k;
    public Activity l;

    /* compiled from: UserProfileAdditionalActionFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileAction.Type.values().length];
            try {
                iArr[ProfileAction.Type.GIFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileAction.Type.PROFILE_QUESTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileAction.Type.ADD_TO_CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileAction.Type.OPEN_APP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProfileAction.Type.MEMORIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProfileAction.Type.SHARE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: UserProfileAdditionalActionFeatureDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public vlq0(dvq0 dvq0Var, gd60 gd60Var, fnq fnqVar, ouq0 ouq0Var, ProfileAction.a aVar, lyd0 lyd0Var, lzh0 lzh0Var) {
        this.b = dvq0Var;
        this.c = gd60Var;
        this.d = fnqVar;
        this.e = ouq0Var;
        this.f = aVar;
        this.g = lyd0Var;
        this.h = lzh0Var;
    }

    public static void a(List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            ((zp0) obj).b = i == 0 ? 3 : 0;
            i = i2;
        }
    }

    public static Integer b(ProfileAction profileAction) {
        WebApiApplication webApiApplication;
        int i = a.$EnumSwitchMapping$0[profileAction.getType().ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.user_profile_additonal_action_full_title_send_gift);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.user_profile_additonal_action_full_title_asq_question);
        }
        if (i == 3) {
            return Integer.valueOf(R.string.user_profile_action_add_to_conversation);
        }
        if (i == 4) {
            gs90.a payload = profileAction.getPayload();
            Long valueOf = (payload == null || (webApiApplication = payload.a) == null) ? null : Long.valueOf(webApiApplication.b);
            long j = InternalVkMiniApps.WISHLIST.h().a;
            if (valueOf != null && valueOf.longValue() == j) {
                return Integer.valueOf(R.string.user_profile_action_wishlist);
            }
        } else if (i == 6) {
            return Integer.valueOf(R.string.user_profile_action_share);
        }
        return null;
    }

    public static f.h c(String str) {
        return new f.h(new atq0.d(null, str, null, null, 0, null, null, 253));
    }

    public static ArrayList d(int i, ArrayList arrayList) {
        List<ProfileAction> S = j5g.S(arrayList, i);
        ArrayList arrayList2 = new ArrayList(c5g.u(S, 10));
        for (ProfileAction profileAction : S) {
            arrayList2.add(new zp0.b.C4193b(profileAction, b(profileAction)));
        }
        return arrayList2;
    }

    public static boolean f() {
        VasFeatures vasFeatures = VasFeatures.VAS_GIFT_BUTTON_IN_PROFILE;
        vasFeatures.getClass();
        return com.vk.toggle.b.A.a(vasFeatures);
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

    public final void e(ExtendedUserProfile extendedUserProfile) {
        nyd0.b a2 = this.g.a();
        a2.getClass();
        a2.a(MobileOfficialAppsProfileStat$AnotherUserProfileMenuEvent.AnotherUserProfileMenuEventType.SHARE_PAGE, null);
        fpq0 fpq0Var = this.k;
        fpq0 fpq0Var2 = fpq0Var != null ? fpq0Var : null;
        dvq0 dvq0Var = this.b;
        fpq0Var2.B(new f.e.o1(dvq0Var.g(extendedUserProfile), extendedUserProfile.j, dvq0Var.a(extendedUserProfile.a.c), extendedUserProfile.a));
    }

    public final void g(ExtendedUserProfile extendedUserProfile) {
        Boolean K = extendedUserProfile.a.K();
        boolean z = extendedUserProfile.o0;
        boolean z2 = !z;
        int i = (z || !K.booleanValue()) ? (z || K.booleanValue()) ? (z && K.booleanValue()) ? R.string.user_profile_user_removed_from_best_friends_f : R.string.user_profile_user_removed_from_best_friends_m : R.string.user_profile_user_added_to_best_friends_m : R.string.user_profile_user_added_to_best_friends_f;
        Activity activity = this.l;
        if (activity == null) {
            activity = null;
        }
        f.h c = c(activity.getString(i, extendedUserProfile.a.e));
        boolean z3 = extendedUserProfile.o0;
        ouq0 ouq0Var = this.e;
        io.reactivex.rxjava3.internal.operators.observable.j1 h = z3 ? ouq0Var.h() : ouq0Var.D();
        e7q0 e7q0Var = new e7q0(new ulq0(0, this, c), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        h.E(e7q0Var, lVar, kVar, kVar).F(new i22(new ozh(this, 15), 22)).subscribe(new k130(new wkh(this, extendedUserProfile, z2, 1), 25));
    }

    public final void h(ExtendedUserProfile extendedUserProfile) {
        Boolean K = extendedUserProfile.a.K();
        boolean z = extendedUserProfile.i0;
        boolean z2 = !z;
        int i = (z || !K.booleanValue()) ? (z || K.booleanValue()) ? (z && K.booleanValue()) ? R.string.user_profile_user_unblocked_f : R.string.user_profile_user_unblocked_m : R.string.user_profile_user_blocked_m : R.string.user_profile_user_blocked_f;
        Activity activity = this.l;
        if (activity == null) {
            activity = null;
        }
        f.h c = c(activity.getString(i, extendedUserProfile.a.e));
        boolean z3 = extendedUserProfile.i0;
        ouq0 ouq0Var = this.e;
        io.reactivex.rxjava3.internal.operators.observable.b0 r = z3 ? ouq0Var.r() : ouq0Var.e();
        e7q0 e7q0Var = new e7q0(new ulq0(0, this, c), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        r.E(e7q0Var, lVar, kVar, kVar).F(new i22(new ozh(this, 15), 22)).subscribe(new u0o0(new q6h(this, extendedUserProfile, z2, 3), 1), new b8v(new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 29));
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.i = u5p0Var;
    }

    public final void l(ExtendedUserProfile extendedUserProfile, boolean z) {
        Activity activity = this.l;
        if (activity == null) {
            activity = null;
        }
        gd60.T0(this.c, activity, this.d.a(extendedUserProfile), new pqq(null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE), null, null, 13), new jn20(extendedUserProfile, this, z), null, 48);
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
        this.l = activity;
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
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
    }
}
