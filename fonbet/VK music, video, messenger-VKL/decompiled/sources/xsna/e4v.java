package xsna;

import android.content.Context;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.dto.common.AdsChoices;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.TagsSuggestions;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.feed.core.models.MyTargetAdsComplainOptions;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.d4v;
import xsna.gko;

/* compiled from: HideOptionButtonTransformer.kt */
/* loaded from: classes4.dex */
public final class e4v implements gn60<NewsEntry, wm60> {
    public static ListBuilder b(NewsEntry newsEntry) {
        boolean z;
        ListBuilder e = e43.e();
        boolean z2 = newsEntry instanceof ShitAttachment;
        ArrayList<AdHideReason> arrayList = z2 ? ((ShitAttachment) newsEntry).W : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).y : newsEntry instanceof Html5Entry ? ((Html5Entry) newsEntry).D : null;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z2) {
                AdSource.a aVar = AdSource.Companion;
                AdSource adSource = ((ShitAttachment) newsEntry).X;
                aVar.getClass();
                z = AdSource.a.b(adSource);
            } else if (newsEntry instanceof PromoPost) {
                AdSource.a aVar2 = AdSource.Companion;
                AdSource adSource2 = ((PromoPost) newsEntry).z;
                aVar2.getClass();
                z = AdSource.a.b(adSource2);
            } else if (newsEntry instanceof Html5Entry) {
                AdSource.a aVar3 = AdSource.Companion;
                AdSource adSource3 = ((Html5Entry) newsEntry).E;
                aVar3.getClass();
                z = AdSource.a.b(adSource3);
            } else {
                z = false;
            }
            if (z) {
                List<AdHideReason> H0 = j5g.H0(arrayList, 3);
                if ((H0 instanceof List) && (H0 instanceof RandomAccess)) {
                    List list = H0;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        AdHideReason adHideReason = (AdHideReason) list.get(i);
                        Context context = e43.a;
                        if (context == null) {
                            context = null;
                        }
                        Integer t = znk0.t(context, adHideReason.d);
                        gko gkoVar = t != null ? new gko(t.intValue()) : null;
                        String str = adHideReason.c;
                        if (str == null) {
                            str = "";
                        }
                        e.add(new d4v(gkoVar, str, new d4v.a.b(adHideReason.b), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e.size()));
                    }
                } else {
                    for (AdHideReason adHideReason2 : H0) {
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        Integer t2 = znk0.t(context2, adHideReason2.d);
                        gko gkoVar2 = t2 != null ? new gko(t2.intValue()) : null;
                        String str2 = adHideReason2.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        e.add(new d4v(gkoVar2, str2, new d4v.a.b(adHideReason2.b), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e.size()));
                    }
                }
                gko.b bVar = gko.Companion;
                e.add(new d4v(new gko(R.drawable.vk_icon_report_outline_28), y8g0.e(R.string.newsfeed_item_ignored_complain), d4v.a.h.a, R.attr.vk_ui_icon_negative, R.attr.vk_ui_text_negative, newsEntry, e.size()));
                return e.g();
            }
        }
        gko.b bVar2 = gko.Companion;
        e.add(new d4v(new gko(R.drawable.vk_icon_settings_outline_28), y8g0.e(R.string.newsfeed_item_ignored_settings), d4v.a.i.a, R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e.size()));
        gko.b bVar3 = gko.Companion;
        e.add(new d4v(new gko(R.drawable.vk_icon_report_outline_28), y8g0.e(R.string.newsfeed_item_ignored_complain), d4v.a.h.a, R.attr.vk_ui_icon_negative, R.attr.vk_ui_text_negative, newsEntry, e.size()));
        return e.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (xsna.rv60.g(r11) == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ListBuilder c(NewsEntry newsEntry) {
        boolean z;
        Caption caption;
        String e;
        Owner s;
        NewsfeedCoowners newsfeedCoowners;
        ListBuilder e2 = e43.e();
        Post R = di60.R(newsEntry);
        if (R != null && (newsfeedCoowners = R.f0) != null) {
            z = true;
            if (!newsfeedCoowners.f.isEmpty()) {
            }
        }
        z = false;
        String str = null;
        if (fkq0.c(k9q0.o(newsEntry)) && !z) {
            if (fkq0.d(k9q0.o(newsEntry))) {
                l490 l490Var = newsEntry instanceof l490 ? (l490) newsEntry : null;
                if (l490Var == null || (s = l490Var.s()) == null || (e = s.h) == null) {
                    e = "";
                }
            } else {
                e = y8g0.e(R.string.newdfeed_community_gen);
            }
            String str2 = e;
            String d = y8g0.d(R.plurals.days, 7, 7);
            gko.b bVar = gko.Companion;
            e2.add(new d4v(new gko(R.drawable.vk_icon_clock_outline_28), y8g0.f(R.string.newsfeed_item_ignored_ban_week, str2, d), d4v.a.f.a, R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e2.size()));
            e2.add(new d4v(new gko(R.drawable.vk_icon_block_outline_28), y8g0.f(R.string.newsfeed_item_ignored_ban, str2), d4v.a.c.a, R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e2.size()));
        }
        Post R2 = di60.R(newsEntry);
        if (R2 != null && (caption = R2.x) != null) {
            str = caption.l;
        }
        String str3 = str;
        if (str3 != null && str3.length() != 0) {
            gko.b bVar2 = gko.Companion;
            e2.add(new d4v(new gko(R.drawable.vk_icon_user_outline_28), str3, new d4v.a.d(R2), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e2.size()));
        }
        gko.b bVar3 = gko.Companion;
        e2.add(new d4v(new gko(R.drawable.vk_icon_settings_outline_28), y8g0.e(R.string.newsfeed_item_ignored_settings), d4v.a.i.a, R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry, e2.size()));
        e2.add(new d4v(new gko(R.drawable.vk_icon_report_outline_28), y8g0.e(R.string.newsfeed_item_ignored_complain), d4v.a.h.a, R.attr.vk_ui_icon_negative, R.attr.vk_ui_text_negative, newsEntry, e2.size()));
        return e2.g();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196  */
    @Override // xsna.gn60
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List x(NewsEntry newsEntry, wm60 wm60Var) {
        Integer num;
        Integer num2;
        List list;
        Integer num3;
        int i;
        int i2;
        List list2;
        Integer num4;
        String str;
        String str2;
        String str3;
        Integer num5;
        gko gkoVar;
        NewsEntry newsEntry2 = newsEntry;
        int i3 = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        if (!(newsEntry2 instanceof ShitAttachment) && !(newsEntry2 instanceof PromoPost) && !(newsEntry2 instanceof Html5Entry) && !(newsEntry2 instanceof MyTargetNativeAdEntry)) {
            if ((newsEntry2 instanceof Post) || (newsEntry2 instanceof Photos)) {
                return c(newsEntry2);
            }
            if (newsEntry2 instanceof Videos) {
                Videos videos = (Videos) newsEntry2;
                String str4 = videos.s;
                return (epx.f(str4, "clip") || epx.f(str4, "video")) ? c(videos) : EmptyList.b;
            }
            if (!(newsEntry2 instanceof TagsSuggestions)) {
                return EmptyList.b;
            }
            TagsSuggestions tagsSuggestions = (TagsSuggestions) newsEntry2;
            ListBuilder e = e43.e();
            gko.b bVar = gko.Companion;
            e.add(new d4v(new gko(R.drawable.vk_icon_block_outline_28), y8g0.e(R.string.photo_tags_ban_suggestions_from_feed), new d4v.a.e(tagsSuggestions), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, tagsSuggestions, e.size()));
            return e.g();
        }
        AdsChoices a = di60.a(newsEntry2);
        ArrayList c = di60.c("hide", newsEntry2);
        if (a == null) {
            return b(newsEntry);
        }
        String str5 = a.d;
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_market_outline_28);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_clock_outline_28);
        Integer valueOf3 = Integer.valueOf(R.drawable.vk_icon_place_outline_28);
        Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_hide_outline_28);
        ListBuilder e2 = e43.e();
        List<MyTargetAdsComplainOptions> H0 = j5g.H0(c, 3);
        String str6 = "missed_region";
        String str7 = "not_interested";
        if ((H0 instanceof List) && (H0 instanceof RandomAccess)) {
            List list3 = H0;
            int size = list3.size();
            int i4 = 0;
            while (i4 < size) {
                MyTargetAdsComplainOptions myTargetAdsComplainOptions = (MyTargetAdsComplainOptions) list3.get(i4);
                if (newsEntry2 instanceof MyTargetNativeAdEntry) {
                    String str8 = myTargetAdsComplainOptions.d;
                    if (str8 != null) {
                        switch (str8.hashCode()) {
                            case -1791517821:
                                if (str8.equals("purchased")) {
                                    num5 = valueOf;
                                    break;
                                }
                                break;
                            case -994856342:
                                if (str8.equals("too_many")) {
                                    num5 = valueOf2;
                                    break;
                                }
                                break;
                            case -770822888:
                                if (str8.equals(str6)) {
                                    num5 = valueOf3;
                                    break;
                                }
                                break;
                            case -701740491:
                                if (str8.equals(str7)) {
                                    num5 = valueOf4;
                                    break;
                                }
                                break;
                        }
                        if (num5 == null) {
                            list = list3;
                            gkoVar = new gko(num5.intValue());
                        } else {
                            list = list3;
                            gkoVar = null;
                        }
                        e2.add(new d4v(gkoVar, myTargetAdsComplainOptions.c, new d4v.a.g(myTargetAdsComplainOptions.d), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, (MyTargetNativeAdEntry) newsEntry2, e2.size()));
                    }
                    num5 = null;
                    if (num5 == null) {
                    }
                    e2.add(new d4v(gkoVar, myTargetAdsComplainOptions.c, new d4v.a.g(myTargetAdsComplainOptions.d), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, (MyTargetNativeAdEntry) newsEntry2, e2.size()));
                } else {
                    list = list3;
                    if (str5 != null) {
                        String str9 = myTargetAdsComplainOptions.d;
                        if (str9 != null) {
                            switch (str9.hashCode()) {
                                case -1791517821:
                                    if (str9.equals("purchased")) {
                                        num3 = valueOf;
                                        break;
                                    }
                                    break;
                                case -994856342:
                                    if (str9.equals("too_many")) {
                                        num3 = valueOf2;
                                        break;
                                    }
                                    break;
                                case -770822888:
                                    if (str9.equals(str6)) {
                                        num3 = valueOf3;
                                        break;
                                    }
                                    break;
                                case -701740491:
                                    if (str9.equals(str7)) {
                                        num3 = valueOf4;
                                        break;
                                    }
                                    break;
                            }
                            gko gkoVar2 = num3 == null ? new gko(num3.intValue()) : null;
                            String str10 = str6;
                            String str11 = myTargetAdsComplainOptions.c;
                            StringBuilder e3 = fw3.e(str5);
                            e3.append(myTargetAdsComplainOptions.b);
                            i = i4;
                            i2 = size;
                            list2 = list;
                            num4 = valueOf;
                            str = str7;
                            str2 = str5;
                            str3 = str10;
                            e2.add(new d4v(gkoVar2, str11, new d4v.a.C2706a(e3.toString()), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry2, e2.size()));
                            i4 = i + 1;
                            str6 = str3;
                            str7 = str;
                            list3 = list2;
                            str5 = str2;
                            size = i2;
                            valueOf = num4;
                        }
                        num3 = null;
                        if (num3 == null) {
                        }
                        String str102 = str6;
                        String str112 = myTargetAdsComplainOptions.c;
                        StringBuilder e32 = fw3.e(str5);
                        e32.append(myTargetAdsComplainOptions.b);
                        i = i4;
                        i2 = size;
                        list2 = list;
                        num4 = valueOf;
                        str = str7;
                        str2 = str5;
                        str3 = str102;
                        e2.add(new d4v(gkoVar2, str112, new d4v.a.C2706a(e32.toString()), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry2, e2.size()));
                        i4 = i + 1;
                        str6 = str3;
                        str7 = str;
                        list3 = list2;
                        str5 = str2;
                        size = i2;
                        valueOf = num4;
                    }
                }
                list2 = list;
                i2 = size;
                i = i4;
                str2 = str5;
                num4 = valueOf;
                str3 = str6;
                str = str7;
                i4 = i + 1;
                str6 = str3;
                str7 = str;
                list3 = list2;
                str5 = str2;
                size = i2;
                valueOf = num4;
            }
        } else {
            for (MyTargetAdsComplainOptions myTargetAdsComplainOptions2 : H0) {
                if (newsEntry2 instanceof MyTargetNativeAdEntry) {
                    String str12 = myTargetAdsComplainOptions2.d;
                    if (str12 != null) {
                        switch (str12.hashCode()) {
                            case -1791517821:
                                if (str12.equals("purchased")) {
                                    num2 = valueOf;
                                    break;
                                }
                                break;
                            case -994856342:
                                if (str12.equals("too_many")) {
                                    num2 = valueOf2;
                                    break;
                                }
                                break;
                            case -770822888:
                                if (str12.equals("missed_region")) {
                                    num2 = valueOf3;
                                    break;
                                }
                                break;
                            case -701740491:
                                if (str12.equals("not_interested")) {
                                    num2 = valueOf4;
                                    break;
                                }
                                break;
                        }
                        e2.add(new d4v(num2 == null ? new gko(num2.intValue()) : null, myTargetAdsComplainOptions2.c, new d4v.a.g(myTargetAdsComplainOptions2.d), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, (MyTargetNativeAdEntry) newsEntry2, e2.size()));
                    }
                    num2 = null;
                    e2.add(new d4v(num2 == null ? new gko(num2.intValue()) : null, myTargetAdsComplainOptions2.c, new d4v.a.g(myTargetAdsComplainOptions2.d), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, (MyTargetNativeAdEntry) newsEntry2, e2.size()));
                } else if (str5 != null) {
                    String str13 = myTargetAdsComplainOptions2.d;
                    if (str13 != null) {
                        switch (str13.hashCode()) {
                            case -1791517821:
                                if (str13.equals("purchased")) {
                                    num = valueOf;
                                    break;
                                }
                                break;
                            case -994856342:
                                if (str13.equals("too_many")) {
                                    num = valueOf2;
                                    break;
                                }
                                break;
                            case -770822888:
                                if (str13.equals("missed_region")) {
                                    num = valueOf3;
                                    break;
                                }
                                break;
                            case -701740491:
                                if (str13.equals("not_interested")) {
                                    num = valueOf4;
                                    break;
                                }
                                break;
                        }
                        gko gkoVar3 = num == null ? new gko(num.intValue()) : null;
                        String str14 = myTargetAdsComplainOptions2.c;
                        StringBuilder e4 = fw3.e(str5);
                        e4.append(myTargetAdsComplainOptions2.b);
                        e2.add(new d4v(gkoVar3, str14, new d4v.a.C2706a(e4.toString()), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry2, e2.size()));
                    }
                    num = null;
                    if (num == null) {
                    }
                    String str142 = myTargetAdsComplainOptions2.c;
                    StringBuilder e42 = fw3.e(str5);
                    e42.append(myTargetAdsComplainOptions2.b);
                    e2.add(new d4v(gkoVar3, str142, new d4v.a.C2706a(e42.toString()), R.attr.vk_ui_icon_secondary, R.attr.vk_ui_text_primary, newsEntry2, e2.size()));
                }
                newsEntry2 = newsEntry;
            }
        }
        ListBuilder g = e2.g();
        return g.isEmpty() ? b(newsEntry) : g;
    }
}
