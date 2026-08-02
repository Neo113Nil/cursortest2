package xsna;

import android.net.Uri;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$SharingItemType;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeSharingLinkOpen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.ui.share.api.ShareItemType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: VideoShareLinkModifierImpl.kt */
/* loaded from: classes7.dex */
public final class mgt0 implements com.vk.video.ui.share.api.b {
    public final Object a = pn00.k(new Pair("org.telegram.messenger", 1), new Pair("org.telegram.messenger.web", 1), new Pair("com.whatsapp", 2), new Pair("ru.oneme.app", 3), new Pair("com.vkontakte.android", 5), new Pair("com.vk.im", 5));

    /* compiled from: VideoShareLinkModifierImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShareItemType.values().length];
            try {
                iArr[ShareItemType.EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareItemType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareItemType.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareItemType.VIDEO_PLAYLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShareItemType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String e(int i, String str) {
        Uri g = jeq0.g(str);
        return !g.getQueryParameterNames().contains("uh") ? str : g.buildUpon().appendQueryParameter(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, String.valueOf(i)).build().toString();
    }

    @Override // com.vk.video.ui.share.api.b
    public final void a(ShareItemType shareItemType, String str, long j, long j2) {
        SchemeStat$EventItem.Type type;
        MobileOfficialAppsSharingStat$SharingItemType mobileOfficialAppsSharingStat$SharingItemType;
        MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod urlSharedMethod;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[shareItemType.ordinal()];
        if (i == 1 || i == 2) {
            type = SchemeStat$EventItem.Type.VIDEO;
        } else if (i == 3) {
            type = SchemeStat$EventItem.Type.CLIP;
        } else if (i == 4) {
            type = SchemeStat$EventItem.Type.VIDEO_PLAYLIST;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            type = SchemeStat$EventItem.Type.LINK;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, Long.valueOf(j), Long.valueOf(j2), null, null, null, 56, null);
        int i2 = iArr[shareItemType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.VIDEO;
        } else if (i2 == 3) {
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.CLIP;
        } else if (i2 == 4) {
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.VIDEO_PLAYLIST;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            mobileOfficialAppsSharingStat$SharingItemType = MobileOfficialAppsSharingStat$SharingItemType.UNKNOWN;
        }
        Uri g = jeq0.g(str);
        String queryParameter = g.getQueryParameter("uh");
        String queryParameter2 = g.getQueryParameter(com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH);
        Integer m = queryParameter2 != null ? arm0.m(10, queryParameter2) : null;
        if (queryParameter == null && m == null) {
            return;
        }
        if (m == null) {
            urlSharedMethod = MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.OTHER;
        } else {
            int intValue = m.intValue();
            urlSharedMethod = intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.OTHER : MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.SHARE_TO_MESSAGE : MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.COPY_LINK : MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.SEND_MAX : MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.SEND_WHATSAPP : MobileOfficialAppsSharingStat$TypeSharingLinkOpen.UrlSharedMethod.SEND_TELEGRAM;
        }
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(schemeStat$EventItem, new MobileOfficialAppsSharingStat$TypeSharingLinkOpen(MobileOfficialAppsSharingStat$TypeSharingLinkOpen.EventType.SHARING_LINK_OPEN, str, urlSharedMethod, mobileOfficialAppsSharingStat$SharingItemType), 2);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), b).q();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.video.ui.share.api.b
    public final String b(String str, String str2) {
        int i = 6;
        if (str2 != null) {
            Object obj = this.a.get(str2);
            if (obj == null) {
                obj = 6;
            }
            i = ((Number) obj).intValue();
        }
        return e(i, str);
    }

    @Override // com.vk.video.ui.share.api.b
    public final String c(String str) {
        return e(4, str);
    }

    @Override // com.vk.video.ui.share.api.b
    public final String d(String str) {
        return e(5, str);
    }
}
