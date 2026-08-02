package xsna;

import android.app.Activity;
import com.vk.api.generated.donut.dto.DonutGetInfoFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.domain.donut.state.DonutBannerDonutType;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutBanner;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.hyn;
import xsna.hzp0;

/* compiled from: DonutBannerFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class dxn implements huq {
    public final cyn b;
    public io.reactivex.rxjava3.disposables.b c;
    public u5p0 d;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> e;
    public fpq0 f;
    public final rwn g = new rwn();

    /* compiled from: DonutBannerFeatureDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserProfileAction.DonutBanner.UrlClick.Source.values().length];
            try {
                iArr[UserProfileAction.DonutBanner.UrlClick.Source.Faq.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserProfileAction.DonutBanner.UrlClick.Source.Goals.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserProfileAction.DonutBanner.UrlClick.Source.Regular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dxn(cyn cynVar) {
        this.b = cynVar;
    }

    public static List c(wvd0 wvd0Var) {
        if (wvd0Var == null || !wvd0Var.a) {
            return EmptyList.b;
        }
        ListBuilder e = e43.e();
        Boolean bool = wvd0Var.b;
        if (bool != null ? bool.booleanValue() : false) {
            e.add(DonutBannerDonutType.Regular);
        }
        Boolean bool2 = wvd0Var.d;
        if (bool2 != null ? bool2.booleanValue() : false) {
            e.add(DonutBannerDonutType.Goals);
        }
        return e.g();
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.f = fpq0Var;
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
        UserId i;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (aVar.b == xo9.n(430, 0, 12, (extendedUserProfile == null || (i = bwd0.i(extendedUserProfile)) == null) ? null : Integer.valueOf(Long.hashCode(i.b))) && aVar.c == -1) {
            u5p0 u5p0Var = this.d;
            if (u5p0Var == null) {
                u5p0Var = null;
            }
            u5p0Var.invoke(new UserProfileAction.x(null, 11));
        }
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.e;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.DonutBanner donutBanner) {
        UserProfile userProfile;
        UserId userId;
        UserProfile userProfile2;
        UserId userId2;
        UserProfile userProfile3;
        UserId userId3;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (donutBanner instanceof UserProfileAction.DonutBanner.a) {
            if (((UserProfileAction.DonutBanner.a) donutBanner).b) {
                b(gVar);
                return;
            }
            if (extendedUserProfile == null || (userProfile3 = extendedUserProfile.a) == null || (userId3 = userProfile3.c) == null) {
                return;
            }
            List c = c(extendedUserProfile.T1);
            if (c.isEmpty()) {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.e;
                (izsVar != null ? izsVar : null).invoke(b.f.C1709b.b);
                return;
            }
            d(userId3);
            if (gVar.s instanceof hyn.b) {
                return;
            }
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = this.e;
            (izsVar2 != null ? izsVar2 : null).invoke(new b.f.d(c));
            return;
        }
        if (donutBanner instanceof UserProfileAction.DonutBanner.b) {
            b(gVar);
            return;
        }
        boolean z = donutBanner instanceof UserProfileAction.DonutBanner.c;
        rwn rwnVar = this.g;
        if (z) {
            if (extendedUserProfile == null || (userProfile2 = extendedUserProfile.a) == null || (userId2 = userProfile2.c) == null || rwnVar.a.getAndSet(true)) {
                return;
            }
            new hzp0.h(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BROWSER, null, Long.valueOf(userId2.b), null, null, null, 58, null), MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, new CommonCommunitiesStat$TypeDonutBanner(CommonCommunitiesStat$TypeDonutBanner.EventType.DONUT_BANNER_VIEW)).a();
            return;
        }
        if (!(donutBanner instanceof UserProfileAction.DonutBanner.UrlClick)) {
            throw new NoWhenBranchMatchedException();
        }
        UserProfileAction.DonutBanner.UrlClick urlClick = (UserProfileAction.DonutBanner.UrlClick) donutBanner;
        fpq0 fpq0Var = this.f;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.e.o0(null, urlClick.b));
        if (extendedUserProfile == null || (userProfile = extendedUserProfile.a) == null || (userId = userProfile.c) == null) {
            return;
        }
        long j = userId.b;
        UserProfileAction.DonutBanner.UrlClick.Source source = urlClick.c;
        int i = source == null ? -1 : a.$EnumSwitchMapping$0[source.ordinal()];
        if (i == 1) {
            rwnVar.getClass();
            new bjc(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutClick(CommonCommunitiesStat$TypeDonutClick.EventType.CLICK_DONUT_FAQ, null, null, 6, null), 2)).q();
        } else if (i == 2) {
            rwnVar.getClass();
            new bjc(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutClick(CommonCommunitiesStat$TypeDonutClick.EventType.CLICK_DONUT_BANNER_GOAL, null, null, 6, null), 2)).q();
        } else {
            if (i != 3) {
                return;
            }
            rwnVar.getClass();
            new bjc(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(j), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutClick(CommonCommunitiesStat$TypeDonutClick.EventType.CLICK_DONUT_BANNER_SUBSCRIBE, null, null, 6, null), 2)).q();
        }
    }

    public final void b(com.vk.profile.user.impl.ui.g gVar) {
        UserProfile userProfile;
        UserId userId;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null || (userProfile = extendedUserProfile.a) == null || (userId = userProfile.c) == null) {
            return;
        }
        if (!c(extendedUserProfile.T1).isEmpty()) {
            d(userId);
            return;
        }
        izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.e;
        if (izsVar == null) {
            izsVar = null;
        }
        izsVar.invoke(b.f.C1709b.b);
    }

    public final void d(UserId userId) {
        cyn cynVar = this.b;
        io.reactivex.rxjava3.disposables.c subscribe = rsg0.w0(yfb.x(cynVar.a.b(userId, Collections.singletonList(DonutGetInfoFieldsDto.GROUP_DONUT_BLOCK)))).l(new tt0(new o1e(cynVar, 18), 17)).subscribe(new b00(new qqe(this, 11), 22), new cw(new lrk(this, 5), 18));
        io.reactivex.rxjava3.disposables.b bVar = this.c;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(subscribe);
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
        this.c = bVar;
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.d = u5p0Var;
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
    public final void m(Activity activity) {
    }
}
