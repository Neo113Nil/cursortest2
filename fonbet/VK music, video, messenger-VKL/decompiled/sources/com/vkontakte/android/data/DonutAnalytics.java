package com.vkontakte.android.data;

import android.net.Uri;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutSupportAuthor;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bjc;
import xsna.drm0;
import xsna.zrp;

/* compiled from: DonutAnalytics.kt */
/* loaded from: classes7.dex */
public final class DonutAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DonutAnalytics.kt */
    public static final class DonutCustomTeaserScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DonutCustomTeaserScreen[] $VALUES;
        public static final DonutCustomTeaserScreen DONUT_CONTENT_LINK;
        public static final DonutCustomTeaserScreen DONUT_CONTENT_PAYWALL;
        public static final DonutCustomTeaserScreen DONUT_CONTENT_REPOST;
        public static final DonutCustomTeaserScreen DONUT_CONTENT_WALL;

        static {
            DonutCustomTeaserScreen donutCustomTeaserScreen = new DonutCustomTeaserScreen("DONUT_CONTENT_PAYWALL", 0);
            DONUT_CONTENT_PAYWALL = donutCustomTeaserScreen;
            DonutCustomTeaserScreen donutCustomTeaserScreen2 = new DonutCustomTeaserScreen("DONUT_CONTENT_WALL", 1);
            DONUT_CONTENT_WALL = donutCustomTeaserScreen2;
            DonutCustomTeaserScreen donutCustomTeaserScreen3 = new DonutCustomTeaserScreen("DONUT_CONTENT_REPOST", 2);
            DONUT_CONTENT_REPOST = donutCustomTeaserScreen3;
            DonutCustomTeaserScreen donutCustomTeaserScreen4 = new DonutCustomTeaserScreen("DONUT_CONTENT_LINK", 3);
            DONUT_CONTENT_LINK = donutCustomTeaserScreen4;
            DonutCustomTeaserScreen[] donutCustomTeaserScreenArr = {donutCustomTeaserScreen, donutCustomTeaserScreen2, donutCustomTeaserScreen3, donutCustomTeaserScreen4};
            $VALUES = donutCustomTeaserScreenArr;
            $ENTRIES = new asp(donutCustomTeaserScreenArr);
        }

        public DonutCustomTeaserScreen() {
            throw null;
        }

        public static DonutCustomTeaserScreen valueOf(String str) {
            return (DonutCustomTeaserScreen) Enum.valueOf(DonutCustomTeaserScreen.class, str);
        }

        public static DonutCustomTeaserScreen[] values() {
            return (DonutCustomTeaserScreen[]) $VALUES.clone();
        }
    }

    /* compiled from: DonutAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DonutCustomTeaserScreen.values().length];
            try {
                iArr[DonutCustomTeaserScreen.DONUT_CONTENT_PAYWALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DonutCustomTeaserScreen.DONUT_CONTENT_WALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DonutCustomTeaserScreen.DONUT_CONTENT_REPOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DonutCustomTeaserScreen.DONUT_CONTENT_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ActionOpenUrl a(ActionOpenUrl actionOpenUrl, String str) {
        Uri parse = Uri.parse(actionOpenUrl.c);
        String path = parse.getPath();
        if (path != null && drm0.D(path, "@donut-faq", false)) {
            return actionOpenUrl;
        }
        String fragment = parse.getFragment();
        if (fragment != null) {
            parse = parse.buildUpon().encodedFragment(Uri.parse(fragment).buildUpon().appendQueryParameter("screen", str).build().toString()).build();
        }
        return new ActionOpenUrl(parse.toString(), actionOpenUrl.d);
    }

    public static String b(String str, String str2) {
        String encodedFragment;
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if ((path != null && drm0.D(path, "@donut-faq", false)) || (encodedFragment = parse.getEncodedFragment()) == null) {
            return str;
        }
        return parse.buildUpon().fragment(null).clearQuery().build().toString() + '#' + encodedFragment + (drm0.L(encodedFragment, '?', 0, 6) != -1 ? '&' : '?') + "screen=" + str2;
    }

    public static MobileOfficialAppsCoreNavStat$EventScreen c(DonutCustomTeaserScreen donutCustomTeaserScreen) {
        int i = a.$EnumSwitchMapping$0[donutCustomTeaserScreen.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsCoreNavStat$EventScreen.DONUT_CONTENT_PAYWALL;
        }
        if (i == 2) {
            return MobileOfficialAppsCoreNavStat$EventScreen.DONUT_CONTENT_WALL;
        }
        if (i == 3) {
            return MobileOfficialAppsCoreNavStat$EventScreen.DONUT_CONTENT_REPOST;
        }
        if (i == 4) {
            return MobileOfficialAppsCoreNavStat$EventScreen.DONUT_CONTENT_LINK;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void d(UserId userId, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, int i) {
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(i), Long.valueOf(userId.b), null, null, null, 56, null), new CommonCommunitiesStat$TypeDonutSupportAuthor(CommonCommunitiesStat$TypeDonutSupportAuthor.ItemType.DONUT_VIDEO_BLUR), 2)).q();
    }

    public static void e(UserId userId, DonutCustomTeaserScreen donutCustomTeaserScreen, int i) {
        new bjc(c(donutCustomTeaserScreen), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(i), Long.valueOf(userId.b), null, null, null, 56, null), new CommonCommunitiesStat$TypeDonutSupportAuthor(CommonCommunitiesStat$TypeDonutSupportAuthor.ItemType.TEASER_POST), 2)).q();
    }
}
