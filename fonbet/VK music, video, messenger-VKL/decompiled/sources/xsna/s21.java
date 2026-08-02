package xsna;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.D1;
import com.vk.ads.api.di.AdsComponent;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.api.generated.adsint.dto.AdsintEventTypeDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.common.links.AwayLink;
import com.vk.common.links.LaunchContext;
import com.vk.contacts.model.ContactsPermissionMessage;
import com.vk.core.preference.Preference;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenConversation;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.ButtonAction;
import com.vk.dto.newsfeed.Link;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.ClickArea;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vk.story.api.di.StoriesComponent;
import com.vk.subscription.api.di.SubscriptionComponent;
import com.vk.toggle.Features;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.PackageAddedReceiver;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.base.TimeUtils;

/* compiled from: AdsUtil.java */
/* loaded from: classes7.dex */
public final class s21 {
    public static volatile ztl0 b;
    public static final HashMap a = new HashMap();
    public static final a c = new a();

    @Nullable
    public static ng30 d = null;

    @Nullable
    public static pv0 e = null;

    @Nullable
    public static hqa0 f = null;

    /* compiled from: AdsUtil.java */
    public class a implements w8i {
    }

    public static void A(@NonNull String str, @Nullable NewsEntry newsEntry) {
        if (newsEntry instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) newsEntry;
            int i = promoPost.i;
            int i2 = promoPost.j;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(i2);
            String sb2 = sb.toString();
            String str2 = promoPost.l;
            String str3 = com.vkontakte.android.data.b.h().r;
            HashMap hashMap = a;
            Set set = (Set) hashMap.get(sb2);
            if (set == null) {
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                hashMap.put(sb2, hashSet);
            } else {
                if (set.contains(str)) {
                    return;
                }
                set.add(str);
                hashMap.put(sb2, set);
            }
            y(str, str2, str3, null);
        }
    }

    public static DeprecatedStatisticUrl B(@NonNull DeprecatedStatisticUrl deprecatedStatisticUrl, @NonNull Pattern pattern, int i) {
        return pattern.matcher(deprecatedStatisticUrl.f).find() ? new DeprecatedStatisticUrl(Uri.parse(deprecatedStatisticUrl.f).buildUpon().appendQueryParameter("click_target", String.valueOf(i)).build().toString(), deprecatedStatisticUrl.b, deprecatedStatisticUrl.c) : deprecatedStatisticUrl;
    }

    public static void a(UserId userId, String str, String str2, izs<Boolean, Void> izsVar) {
        io.reactivex.rxjava3.internal.operators.observable.o0 o0Var = new io.reactivex.rxjava3.internal.operators.observable.o0(com.vkontakte.android.data.b.d(), new l21(userId, str, str2));
        m21 m21Var = new m21(izsVar, 0);
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Objects.requireNonNull(bVar);
        o0Var.subscribe(m21Var, new le50(bVar, 25));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, ButtonAction buttonAction, @Nullable PostInteract postInteract, @Nullable ShitAttachment shitAttachment, @Nullable String str) {
        String str2;
        String str3 = buttonAction.d;
        if (str3 == null) {
            q(context, buttonAction, postInteract, str);
            return;
        }
        if (str3.equals(BaseLinkButtonActionTypeDto.JOIN_GROUP_AND_OPEN_URL.j())) {
            int i = buttonAction.c;
            if (postInteract != null) {
                String str4 = postInteract.c;
                if (!TextUtils.isEmpty(str4)) {
                    str2 = go9.b("wall", str4);
                    a(new UserId(i), str2, postInteract != null ? postInteract.h : null, new p21(context, buttonAction, postInteract, 0));
                    return;
                }
            }
            str2 = null;
            a(new UserId(i), str2, postInteract != null ? postInteract.h : null, new p21(context, buttonAction, postInteract, 0));
            return;
        }
        if (str3.equals(BaseLinkButtonActionTypeDto.USER_SUBSCRIBE_AND_OPEN_URL.j())) {
            if (shitAttachment == null) {
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Inconsistent state, ad object is null, while button action is not"));
                return;
            } else {
                w(context, null, shitAttachment);
                return;
            }
        }
        if (str3.equals(BaseLinkButtonActionTypeDto.OPEN_URL.j())) {
            q(context, buttonAction, postInteract, str);
        } else if (str3.equals(BaseLinkButtonActionTypeDto.SYNC_CONTACTS.j())) {
            com.vk.contacts.d.a.S0(context, ContactsPermissionMessage.DEFAULT);
        } else {
            q(context, buttonAction, postInteract, str);
        }
    }

    public static void c(Action action, PromoPost promoPost) {
        if (action instanceof ActionOpenConversation) {
            SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
            smbAdFeatures.getClass();
            if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                p().a(promoPost.B.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLICK));
            } else {
                Iterator it = promoPost.v.b("click").iterator();
                while (it.hasNext()) {
                    com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it.next());
                }
            }
        }
    }

    public static void d(@NonNull Context context, @NonNull ShitAttachment shitAttachment, int i, boolean z) {
        Link b2;
        Integer num;
        Integer num2 = shitAttachment.h0;
        String str = shitAttachment.s;
        String str2 = shitAttachment.k0;
        int i2 = shitAttachment.z;
        Integer num3 = shitAttachment.j0;
        UserId userId = shitAttachment.R;
        String str3 = shitAttachment.q;
        String str4 = shitAttachment.i0;
        if (num2 != null) {
            ClickArea clickArea = new ClickArea(num2.intValue());
            AdClickContext adClickContext = AdClickContext.CTA_BUTTON;
            if (!clickArea.a(adClickContext) && !z) {
                return;
            }
            Integer valueOf = Integer.valueOf(adClickContext.h());
            if (str4 != null) {
                str3 = str4;
            }
            if (str4 != null && num3 != null) {
                i2 = num3.intValue();
            }
            if (str4 != null && str2 != null) {
                str = str2;
            }
            b2 = new Link(str3, i2);
            num = valueOf;
        } else {
            if (str4 != null) {
                str3 = str4;
            }
            if (str4 != null && str2 != null) {
                str = str2;
            }
            if (str4 != null && num3 != null) {
                i2 = num3.intValue();
            }
            b2 = a9z.b(shitAttachment.r, str3, i2, AdClickContext.BUTTON);
            num = null;
        }
        if (b2 == null) {
            return;
        }
        String str5 = b2.b;
        int i3 = b2.c;
        AdClickContext adClickContext2 = AdClickContext.CTA_BUTTON;
        if (e == null) {
            e = ((AdsComponent) j6i.c(m7m.f(c), AdsComponent.class)).gf();
        }
        e.a(adClickContext2, shitAttachment, i);
        x(shitAttachment, shitAttachment, shitAttachment.y, shitAttachment.l0, num);
        y("ads/click_open_link_url", shitAttachment.v, com.vkontakte.android.data.b.h().r, null);
        z(i, AdsintEventTypeDto.MRC_CLICK, shitAttachment);
        z(i, AdsintEventTypeDto.MRC_CLICK_OPEN_LINK_URL, shitAttachment);
        if (str.equals(BaseLinkButtonActionTypeDto.JOIN_GROUP_AND_OPEN_URL.j()) && userId != null) {
            a(userId, null, null, new g21(context, i3, str5, 0));
            return;
        }
        if (str.equals(BaseLinkButtonActionTypeDto.USER_SUBSCRIBE_AND_OPEN_URL.j()) && userId != null) {
            w(context, b2, shitAttachment);
            return;
        }
        if (TextUtils.isEmpty(shitAttachment.x) || !shitAttachment.l0) {
            t(context, i3, str5);
            return;
        }
        r(context, shitAttachment, shitAttachment.S.b("click_deeplink"), shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLICK_DEEPLINK), shitAttachment.x, shitAttachment.y, str5, shitAttachment.l0, i, num);
    }

    public static void e(Context context, ShitAttachment shitAttachment, int i, @Nullable AdClickContext adClickContext) {
        f(context, shitAttachment, null, i, adClickContext);
    }

    public static void f(@NonNull Context context, @NonNull ShitAttachment shitAttachment, @Nullable ShitAttachment.Card card, int i, @Nullable AdClickContext adClickContext) {
        Link b2;
        Integer num;
        String str;
        int i2;
        String str2;
        String str3;
        Integer num2 = shitAttachment.h0;
        int i3 = shitAttachment.z;
        String str4 = shitAttachment.q;
        if (num2 == null || card != null) {
            b2 = a9z.b(shitAttachment.r, str4, i3, adClickContext);
            num = null;
        } else {
            if (!new ClickArea(num2.intValue()).a(adClickContext)) {
                return;
            }
            Integer valueOf = Integer.valueOf(adClickContext != null ? adClickContext.h() : -1);
            b2 = new Link(str4, i3);
            num = valueOf;
        }
        if (b2 == null && card == null) {
            return;
        }
        if (adClickContext != null && (adClickContext == AdClickContext.ICON || adClickContext == AdClickContext.TITLE || adClickContext == AdClickContext.HEADER)) {
            z(i, AdsintEventTypeDto.MRC_CLICK_HEADER, shitAttachment);
        }
        if (card != null) {
            x(card, card, card.d, shitAttachment.l0, num);
            z(i, AdsintEventTypeDto.MRC_CLICK_PRETTY_CARD, shitAttachment);
        } else {
            x(shitAttachment, shitAttachment, shitAttachment.y, shitAttachment.l0, num);
            z(i, AdsintEventTypeDto.MRC_CLICK, shitAttachment);
        }
        if (adClickContext != null) {
            if (e == null) {
                e = ((AdsComponent) j6i.c(m7m.f(c), AdsComponent.class)).gf();
            }
            e.a(adClickContext, shitAttachment, i);
        }
        if (!TextUtils.isEmpty(shitAttachment.x) && shitAttachment.l0) {
            if (card != null) {
                r(context, shitAttachment, card.p.b("click_deeplink"), card.q.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLICK_DEEPLINK), card.e, card.d, (adClickContext == null || !(adClickContext == AdClickContext.BUTTON || adClickContext == AdClickContext.CTA_BUTTON) || (str3 = card.o) == null) ? card.b : str3, shitAttachment.l0, i, num);
                return;
            } else {
                r(context, shitAttachment, shitAttachment.S.b("click_deeplink"), shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLICK_DEEPLINK), shitAttachment.x, shitAttachment.y, b2.b, shitAttachment.l0, i, num);
                return;
            }
        }
        if (b2 != null) {
            str = b2.b;
            i2 = b2.c;
        } else {
            if (card == null) {
                return;
            }
            str = "";
            i2 = 0;
        }
        y("ads/click_open_link_url", shitAttachment.v, com.vkontakte.android.data.b.h().r, null);
        z(i, AdsintEventTypeDto.MRC_CLICK_OPEN_LINK_URL, shitAttachment);
        if (card == null) {
            t(context, i2, str);
            return;
        }
        String str5 = card.b;
        if (adClickContext != null && ((adClickContext == AdClickContext.BUTTON || adClickContext == AdClickContext.CTA_BUTTON) && (str2 = card.o) != null)) {
            str5 = str2;
        }
        t(context, card.k, str5);
    }

    public static void g(Context context, String str, String str2, String str3, boolean z, int i) {
        Link link = new Link(str3, z ? 0 : 2);
        boolean i2 = dy2.i(str);
        if (TextUtils.isEmpty(str) || !i2) {
            t(context, link.c, str3);
        } else {
            s(context, null, null, str, str2, str3, true, i, new com.vk.movika.sdk.base.model.props.c(3), new f21(0));
        }
    }

    public static void h(@NonNull Context context, @Nullable String str, @NonNull String str2, @NonNull List<String> list, int i) {
        boolean i2 = dy2.i(str);
        Link link = new Link(str2, list.contains(D1.e) ? 0 : 2);
        if (TextUtils.isEmpty(str) || !i2) {
            t(context, link.c, str2);
        } else {
            int i3 = 0;
            s(context, null, null, str, null, str2, true, i, new i21(i3), new j21((byte) 0, i3));
        }
    }

    public static void i(ShitAttachment shitAttachment) {
        y("ads/expand", shitAttachment.v, com.vkontakte.android.data.b.h().r, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void j(@Nullable NewsEntry newsEntry) {
        A("ads/music_play", newsEntry);
        if (newsEntry instanceof DeprecatedStatisticInterface) {
            Iterator<DeprecatedStatisticUrl> it = ((DeprecatedStatisticInterface) newsEntry).R6("audio_click").iterator();
            while (it.hasNext()) {
                com.vkontakte.android.data.b.p(it.next());
            }
        }
    }

    public static void k(@Nullable NewsEntry newsEntry) {
        A("ads/music_playlist_share", newsEntry);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void l(@Nullable NewsEntry newsEntry) {
        A("ads/music_playlist_to_profile", newsEntry);
        if (newsEntry instanceof DeprecatedStatisticInterface) {
            Iterator<DeprecatedStatisticUrl> it = ((DeprecatedStatisticInterface) newsEntry).R6("audio_click").iterator();
            while (it.hasNext()) {
                com.vkontakte.android.data.b.p(it.next());
            }
        }
    }

    public static void m(Context context, PrettyCardAttachment.Card card) {
        AwayLink awayLink = card.e;
        com.vk.common.links.b.i(context, awayLink.b, card.d, awayLink.c, null, Boolean.TRUE);
    }

    public static void n(@Nullable NewsEntry newsEntry) {
        A("ads/like", newsEntry);
    }

    public static void o(@Nullable NewsEntry newsEntry) {
        A("ads/share", newsEntry);
    }

    @NonNull
    public static hqa0 p() {
        if (f == null) {
            f = ((AdPixelStatsComponent) j6i.b(m7m.f(c), AdPixelStatsComponent.class)).Ed();
        }
        return f;
    }

    public static void q(Context context, ButtonAction buttonAction, @Nullable PostInteract postInteract, @Nullable String str) {
        if (str == null) {
            str = postInteract != null ? postInteract.h : null;
        }
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.g = str;
        AwayLink awayLink = buttonAction.e;
        String str2 = awayLink.b;
        aVar.h = str2;
        com.vk.common.links.b.i(context, str2, buttonAction.b, awayLink.c, aVar.a(), Boolean.TRUE);
    }

    public static void r(@NonNull Context context, @NonNull ShitAttachment shitAttachment, @NonNull ArrayList arrayList, @NonNull List list, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i, @Nullable Integer num) {
        s(context, shitAttachment, null, str, str2, str3, z, i, new q21(arrayList, list, num, 0), new r21(0, shitAttachment, com.vkontakte.android.data.b.h().r));
    }

    public static void s(Context context, @Nullable ShitAttachment shitAttachment, @Nullable String str, String str2, String str3, String str4, boolean z, int i, gzs<s3q0> gzsVar, wzs<String, izs<b.d, s3q0>, s3q0> wzsVar) {
        boolean z2;
        boolean z3;
        if (z) {
            z2 = false;
            try {
                if (TextUtils.isEmpty(str3)) {
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str2);
                    if (launchIntentForPackage != null) {
                        context.startActivity(launchIntentForPackage);
                    }
                    z3 = launchIntentForPackage != null;
                } else {
                    context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str3)).setPackage(str2));
                    gzsVar.invoke();
                    z3 = z;
                }
                wzsVar.invoke("ads/click_open_app", null);
                if (shitAttachment != null) {
                    z(i, AdsintEventTypeDto.MRC_CLICK_OPEN_APP, shitAttachment);
                }
                z2 = z3;
            } catch (Exception unused) {
            }
        } else {
            z2 = z;
        }
        if (z2) {
            return;
        }
        try {
            try {
                context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=" + str2)));
                String str5 = shitAttachment != null ? shitAttachment.v : str;
                Preference.f("pending_installs").edit().putString(str2, ((System.currentTimeMillis() / 1000) + TimeUtils.SECONDS_PER_DAY) + "~" + str5).apply();
                wzsVar.invoke("ads/click_install_app", null);
                if (shitAttachment != null) {
                    z(i, AdsintEventTypeDto.MRC_CLICK_INSTALL_APP, shitAttachment);
                }
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) PackageAddedReceiver.class), 1, 1);
            } catch (ActivityNotFoundException unused2) {
                context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str4)));
                wzsVar.invoke("ads/click_open_link_url", new db(4));
            }
        } catch (Exception e2) {
            com.vk.metrics.eventtracking.b.a.a(e2);
        }
    }

    public static void t(Context context, int i, String str) {
        if (com.vk.common.links.b.l(context, Uri.parse(str))) {
            return;
        }
        if (i == 1) {
            FeedFeatures feedFeatures = FeedFeatures.FEED_ADS_FORCE_OPEN_BROWSER;
            feedFeatures.getClass();
            if (!com.vk.toggle.b.A.a(feedFeatures)) {
                com.vk.common.links.b.d(context, str, null);
                return;
            }
        }
        if (i == 2) {
            com.vk.common.links.b.f(context, str);
        } else if (i == 3) {
            com.vk.common.links.b.j(context, str);
        } else {
            com.vk.common.links.b.b(context, str, null);
        }
    }

    public static void u(Context context, int i, String str) {
        if (com.vk.common.links.b.l(context, Uri.parse(str))) {
            return;
        }
        if (i == 1) {
            com.vk.common.links.b.d(context, str, null);
            return;
        }
        if (i == 2) {
            com.vk.common.links.b.f(context, str);
        } else if (i == 3) {
            com.vk.common.links.b.j(context, str);
        } else {
            com.vk.common.links.b.b(context, str, null);
        }
    }

    public static synchronized ztl0 v() {
        ztl0 ztl0Var;
        synchronized (s21.class) {
            try {
                if (b == null) {
                    b = ((StoriesComponent) j6i.b(m7m.f(c), StoriesComponent.class)).bb();
                }
                ztl0Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ztl0Var;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @SuppressLint({"CheckResult"})
    public static void w(@NonNull final Context context, @Nullable final Link link, @NonNull final ShitAttachment shitAttachment) {
        a0r0 ec;
        boolean a2 = com.vk.toggle.b.A.a(Features.Type.FEATURE_SMB_USER_SUBSCRIBE);
        UserId userId = shitAttachment.R;
        if (userId == null || !fkq0.d(userId) || !a2) {
            t(context, shitAttachment.z, shitAttachment.q);
            return;
        }
        synchronized (s21.class) {
            a aVar = c;
            ec = ((AdsComponent) j6i.c(m7m.f(aVar), AdsComponent.class)).ec((SubscriptionComponent) j6i.c(m7m.f(aVar), SubscriptionComponent.class));
        }
        io.reactivex.rxjava3.core.q H = io.reactivex.rxjava3.core.q.H(new IllegalArgumentException("UserId doesn't belong to user"));
        UserId userId2 = shitAttachment.R;
        if (userId2 != null && fkq0.d(userId2)) {
            NewsEntry.TrackData trackData = shitAttachment.Q;
            H = ((zvm0) ec.b.getValue()).n(userId2, true, trackData != null ? trackData.b : null, trackData != null ? trackData.h : null);
        }
        io.reactivex.rxjava3.internal.operators.completable.p pVar = new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.d0(H.U(new wx40(new ye40(22), 12)).K(), new zzq0(0), null), new x150(new irt(ec, 25), 17)));
        io.reactivex.rxjava3.functions.a aVar2 = new io.reactivex.rxjava3.functions.a() { // from class: xsna.k21
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                int i;
                String str;
                Link link2 = link;
                if (link2 != null) {
                    i = link2.c;
                    str = link2.b;
                } else {
                    ShitAttachment shitAttachment2 = shitAttachment;
                    i = shitAttachment2.z;
                    str = shitAttachment2.q;
                }
                s21.t(context, i, str);
            }
        };
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Objects.requireNonNull(bVar);
        pVar.subscribe(aVar2, new le50(bVar, 25));
    }

    public static void x(@NonNull DeprecatedStatisticInterface deprecatedStatisticInterface, @NonNull dqa0 dqa0Var, @Nullable String str, boolean z, Integer num) {
        if (!z || TextUtils.isEmpty(str)) {
            SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
            smbAdFeatures.getClass();
            if (com.vk.toggle.b.A.a(smbAdFeatures)) {
                p().a(dqa0Var.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLICK));
                return;
            }
            List<DeprecatedStatisticUrl> R6 = deprecatedStatisticInterface.R6("click");
            Pattern compile = Pattern.compile("\\w+.mail.ru");
            for (DeprecatedStatisticUrl deprecatedStatisticUrl : R6) {
                if (num == null || num.intValue() == -1) {
                    com.vkontakte.android.data.b.p(deprecatedStatisticUrl);
                } else {
                    com.vkontakte.android.data.b.p(B(deprecatedStatisticUrl, compile, num.intValue()));
                }
            }
        }
    }

    public static void y(String str, String str2, String str3, izs<b.d, s3q0> izsVar) {
        b.d a2 = io.reactivex.rxjava3.processors.b.a(str, "ads_device_id", str3);
        if (str2 != null) {
            a2.b(str2, "ad_data");
        }
        if (izsVar != null) {
            izsVar.invoke(a2);
        }
        a2.h();
    }

    public static void z(int i, @NonNull AdsintEventTypeDto adsintEventTypeDto, @NonNull ShitAttachment shitAttachment) {
        if (d == null) {
            d = ((AdsComponent) j6i.c(m7m.f(c), AdsComponent.class)).j6();
        }
        d.b(new h21(i, adsintEventTypeDto, shitAttachment));
    }
}
