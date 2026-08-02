package xsna;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.provider.CredentialEntry;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.api.generated.bestFriends.dto.BestFriendsBatchEditInputDto;
import com.vk.api.generated.gifts.dto.GiftsHideTooltipAliasTypeDto;
import com.vk.api.generated.gifts.dto.GiftsHideTooltipTypeDto;
import com.vk.core.preference.Preference;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.hg1;

/* compiled from: UserProfileRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class tuq0 implements ouq0 {
    public final r0e0 a;
    public final Context b;
    public final htq0 c;
    public final ExtendedProfilesRepository d;
    public final uvl0 e;
    public final gul0 f;
    public final ney<aj1, VKList<Photo>> g;
    public final lzd0 h;
    public final ysg0<m7a0> i;
    public final ysg0<y0r0> j;
    public final h7v k;
    public final t9w l;
    public final wrq0 m;
    public boolean n;
    public final j2r0 o = new j2r0();
    public final String p = HintId.PROFILE_UPDATE_AVATAR_PHOTO.getId();
    public final e9i0 q = new e9i0(this, 14);
    public final exi0 r = new exi0(this, 16);

    public tuq0(r0e0 r0e0Var, Context context, htq0 htq0Var, ExtendedProfilesRepository extendedProfilesRepository, uvl0 uvl0Var, gul0 gul0Var, ney neyVar, lzd0 lzd0Var, ysg0 ysg0Var, ysg0 ysg0Var2, h7v h7vVar, t9w t9wVar, wrq0 wrq0Var) {
        this.a = r0e0Var;
        this.b = context;
        this.c = htq0Var;
        this.d = extendedProfilesRepository;
        this.e = uvl0Var;
        this.f = gul0Var;
        this.g = neyVar;
        this.h = lzd0Var;
        this.i = ysg0Var;
        this.j = ysg0Var2;
        this.k = h7vVar;
        this.l = t9wVar;
        this.m = wrq0Var;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.j1 I(xy2 xy2Var) {
        return rsg0.y0(yfb.x(xy2Var), null, null, 3).U(new awi0(new ha40(21), 3));
    }

    public static io.reactivex.rxjava3.internal.operators.observable.j1 J(xy2 xy2Var) {
        return rsg0.y0(yfb.x(xy2Var), null, null, 3).U(new bjn0(new xep0(1)));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 A() {
        return J(bs.n(this.h.a, AccountSetPrivacyKeyDto.CLOSED_PROFILE, Collections.singletonList(CredentialEntry.FALSE_STRING), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 B() {
        this.h.j.getClass();
        return I(new tfx("onboarding.hideCardsBlock", new to(23), new t11(26)));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 C(String str, boolean z) {
        return rsg0.y0(new aks(this.a.a(), Boolean.valueOf(z), str, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE), this.c.d), null, null, 3).U(new did0(new eyp0(3), 13));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 D() {
        return I(this.h.e.g(Collections.singletonList(new BestFriendsBatchEditInputDto(BestFriendsBatchEditInputDto.OpDto.ADD, this.a.a()))));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 E() {
        return J(nts.g(this.h.b, this.a.a(), null, this.c.d, null, null, 26));
    }

    @Override // xsna.ouq0
    public final int F(StoriesContainer storiesContainer) {
        return this.e.l(storiesContainer);
    }

    @Override // xsna.ouq0
    public final void G() {
        this.g.clear();
    }

    @Override // xsna.ouq0
    public final boolean H() {
        htq0 htq0Var = this.c;
        boolean z = htq0Var.g;
        htq0Var.g = false;
        return z;
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a() {
        xy2 j;
        j = this.h.d.j((r12 & 1) != 0 ? null : Collections.singletonList(this.a.a()), (r12 & 2) != 0 ? null : null, null, null, (r12 & 16) != 0 ? null : null);
        return J(j);
    }

    @Override // xsna.ouq0
    public final int b() {
        return g620.s;
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.d2 c() {
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        hg1.l4 l4Var = new hg1.l4(quq0.b);
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, l4Var).U(new hg1.k4(ruq0.c)), new nlf0(new u5p0(this, 5), 9)).U(new iun0(new h2h0(10), 3));
        io.reactivex.rxjava3.subjects.f<m7a0> fVar2 = this.i.a;
        hg1.l4 l4Var2 = new hg1.l4(suq0.b);
        fVar2.getClass();
        return io.reactivex.rxjava3.core.q.X(U, new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, l4Var2).U(new hg1.k4(dnb.d)), new b630(new hij0(this, 11), 16)).U(new sq(new wfl0(3), 26))).v0(500L, TimeUnit.MILLISECONDS);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.core.q<kkq0> d() {
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_PROFILE_DISCOVER_BLOCK;
        storiesFeatures.getClass();
        if (!com.vk.toggle.b.A.a(storiesFeatures) || !this.c.k) {
            return io.reactivex.rxjava3.core.q.T(new kkq0(EmptyList.b));
        }
        this.h.l.getClass();
        tfx tfxVar = new tfx("storiesProfileDiscover.get", new thl0(1), new qjk0(1));
        tfxVar.f(10, 1, 30, "count");
        dz2 x = yfb.x(tfxVar);
        x.n = true;
        return rsg0.T(x).U(new uf20(new puq0(0), 17));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 e() {
        io.reactivex.rxjava3.internal.operators.observable.j1 I = I(this.h.a.j(this.a.a(), null));
        n3t n3tVar = new n3t(new b3m0(this, 8), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return I.E(n3tVar, lVar, kVar, kVar);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 f() {
        this.h.l.getClass();
        return I(new tfx("storiesProfileDiscover.hide", new joi0(3), new hq(29)));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 g(boolean z) {
        if (z) {
            return o(true);
        }
        UserId a = this.a.a();
        htq0 htq0Var = this.c;
        com.vk.repository.data.api.a aVar = new com.vk.repository.data.api.a(a, g620.f().getExperiments().k(), true, true, htq0Var.d, !this.n, htq0Var.e, this.q, this.r, ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST, htq0Var.b, htq0Var.c, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE));
        boolean z2 = ((Boolean) this.l.invoke()).booleanValue() && !TextUtils.isEmpty(hd60.a().a().m());
        ListBuilder e = e43.e();
        e.add(new Pair("device_info", zeq0.a()));
        e.add(new Pair("connection_type", com.vk.core.utils.newtork.b.c().b()));
        e.add(new Pair("connection_subtype", com.vk.core.utils.newtork.b.c().a()));
        e.add(new Pair("user_options", zeq0.e()));
        if (z2) {
            e.add(new Pair("filters", zeq0.d(hd60.a().a1(), "ads_applovin")));
        }
        s3q0 s3q0Var = s3q0.a;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = this.d.X(aVar, e.g()).U(new xhb0(new xzk0(6, this, a), 9));
        fv70 fv70Var = new fv70(new waf0(this, 17), 22);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(fv70Var, lVar, kVar, kVar);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 h() {
        return I(this.h.e.g(Collections.singletonList(new BestFriendsBatchEditInputDto(BestFriendsBatchEditInputDto.OpDto.DELETE, this.a.a()))));
    }

    @Override // xsna.ouq0
    public final ezd0 i(ExtendedUserProfile extendedUserProfile) {
        Map<String, String> map;
        h7v h7vVar = this.k;
        String str = this.p;
        if (!h7vVar.a(str)) {
            return new ezd0(0);
        }
        Hint p = h7vVar.p(str);
        if (p == null || (map = p.e) == null) {
            return new ezd0(0);
        }
        boolean z = extendedUserProfile.n0;
        String str2 = z ? "profile_photo_banner_has_photo" : "profile_photo_banner_no_photo";
        String str3 = z ? "profile_photo_button_has_photo" : "profile_photo_button_no_photo";
        String str4 = map.get(str2);
        if (str4 == null) {
            str4 = "";
        }
        String str5 = map.get(str3);
        return new ezd0(true, str4, str5 != null ? str5 : "");
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 j(boolean z) {
        r0e0 r0e0Var = this.a;
        lzd0 lzd0Var = this.h;
        return rsg0.y0(yfb.x(z ? lzd0Var.g.b(r0e0Var.a(), null) : lax0.g(lzd0Var.g, r0e0Var.a(), null, 6)), null, null, 3).U(new k6c0(new wyn0(4), 9));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 k(boolean z) {
        r0e0 r0e0Var = this.a;
        lzd0 lzd0Var = this.h;
        return I(z ? tft0.l(lzd0Var.h, r0e0Var.a(), null, 6) : lzd0Var.h.c(r0e0Var.a(), null));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 l() {
        aj1 aj1Var = new aj1(this.a.a());
        VKList<Photo> vKList = this.g.get(aj1Var);
        io.reactivex.rxjava3.core.q T = vKList != null ? io.reactivex.rxjava3.core.q.T(vKList) : q(0, 10);
        k5j0 k5j0Var = new k5j0(new pm90(8, this, aj1Var), 12);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return T.E(k5j0Var, lVar, kVar, kVar);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 m() {
        return J(cz60.a(this.h.d, Collections.singletonList(this.a.a()), null, 2));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 n() {
        wlb0 wlb0Var = this.h.j;
        List singletonList = Collections.singletonList("all");
        wlb0Var.getClass();
        tfx tfxVar = new tfx("onboarding.getCards", new w11(27), new at(25));
        tfxVar.i("icon_sizes", singletonList);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new r2v(new epj0(8), 18));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 o(boolean z) {
        UserId a = this.a.a();
        htq0 htq0Var = this.c;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = this.d.w(new com.vk.repository.data.api.a(a, g620.f().getExperiments().k(), true, true, htq0Var.d, !this.n, htq0Var.e, this.q, this.r, z ? ExtendedProfilesRepository.LoadStrategy.RELOAD : ExtendedProfilesRepository.LoadStrategy.CACHE_FIRST, htq0Var.b, htq0Var.c, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE))).U(new fhb0(new irt(24), 12));
        dh40 dh40Var = new dh40(new hfm0(this, 8), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(dh40Var, lVar, kVar, kVar);
    }

    @Override // xsna.ouq0
    public final boolean p() {
        return Preference.d("profile_user", "need_show_subscription_onboarding", true);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.m1 q(int i, int i2) {
        return rsg0.y0(new vea0(this.a.a(), -6, i, i2, true), null, null, 3);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 r() {
        io.reactivex.rxjava3.internal.operators.observable.j1 I = I(this.h.a.l(this.a.a()));
        xj50 xj50Var = new xj50(new f6m0(this, 10), 20);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return I.E(xj50Var, lVar, kVar, kVar);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 s(boolean z) {
        r0e0 r0e0Var = this.a;
        lzd0 lzd0Var = this.h;
        return I(z ? lzd0Var.f.g(r0e0Var.a(), null) : lzd0Var.f.a(r0e0Var.a()));
    }

    @Override // xsna.ouq0
    public final void t() {
        this.h.l.getClass();
        itg0.i(7, rsg0.T(yfb.x(new tfx("storiesProfileDiscover.markSeen", new ful0(0), new koi0(4)))), null, null, null);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 u(UserId userId) {
        tfx tfxVar;
        VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_CATALOG;
        vasFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(vasFeatures);
        lzd0 lzd0Var = this.h;
        if (a) {
            wlb0 wlb0Var = lzd0Var.i;
            GiftsHideTooltipAliasTypeDto giftsHideTooltipAliasTypeDto = GiftsHideTooltipAliasTypeDto.BIRTHDAY;
            wlb0Var.getClass();
            tfxVar = new tfx("gifts.hideTooltipAlias", new bt(14), new ct(12));
            tfx.n(tfxVar, "user_id", userId, 0L, 0L, 12);
            tfx.o(tfxVar, "type", giftsHideTooltipAliasTypeDto.i(), 0, 0, 12);
        } else {
            wlb0 wlb0Var2 = lzd0Var.i;
            GiftsHideTooltipTypeDto giftsHideTooltipTypeDto = GiftsHideTooltipTypeDto.BIRTHDAY;
            wlb0Var2.getClass();
            tfx tfxVar2 = new tfx("gifts.hideTooltip", new w11(18), new at(19));
            tfx.n(tfxVar2, "user_id", userId, 0L, 0L, 12);
            tfx.o(tfxVar2, "type", giftsHideTooltipTypeDto.i(), 0, 0, 12);
            tfxVar = tfxVar2;
        }
        return I(tfxVar);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 v() {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new tea0(this.a.a()), null, null, 3);
        s520 s520Var = new s520(new rzl0(this, 13), 27);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(s520Var, lVar, kVar, kVar);
    }

    @Override // xsna.ouq0
    public final void w() {
        Preference.I("profile_user", "need_show_subscription_onboarding", false);
    }

    @Override // xsna.ouq0
    public final void x() {
        this.k.b(this.p);
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 y(UserId userId, String str, String str2) {
        String concat = "profile_tooltip__".concat(str2);
        VasFeatures vasFeatures = VasFeatures.VAS_GIFTS_SERVICE_CATALOG;
        vasFeatures.getClass();
        rzt rztVar = new rzt(com.vk.toggle.b.A.a(vasFeatures) ? "gifts.getCatalogAlias" : "gifts.getCatalog");
        if (userId != null) {
            rztVar.F(userId, "user_id");
        }
        rztVar.C(!vx2.d.o() ? 1 : 0, "no_inapp");
        rztVar.C(1, "force_payment");
        rztVar.K("filters", str);
        rztVar.K("ref", concat);
        return rsg0.y0(rztVar, null, null, 3).U(new osk0(new zlm0(6), 7));
    }

    @Override // xsna.ouq0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 z() {
        String i = AccountSetPrivacyKeyDto.CLOSED_PROFILE.i();
        return rsg0.y0(yfb.x(bs.e(this.h.a, Collections.singletonList(i), 6)), null, null, 3).U(new qw80(new lf5(i, 4), 11));
    }
}
