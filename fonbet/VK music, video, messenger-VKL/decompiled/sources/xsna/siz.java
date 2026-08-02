package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.profile.community.impl.livecover.LiveCoverType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LiveCoverTracker.kt */
/* loaded from: classes5.dex */
public final class siz {

    /* compiled from: LiveCoverTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LiveCoverType.values().length];
            try {
                iArr[LiveCoverType.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiveCoverType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LiveCoverType.VIDEO_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverType a(LiveCoverType liveCoverType) {
        int i = a.$EnumSwitchMapping$0[liveCoverType.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverType.PHOTO;
        }
        if (i == 2) {
            return MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverType.VIDEO;
        }
        if (i == 3) {
            return MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverType.VIDEO_PREVIEW;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void b(Long l, MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType liveCoverEventType, MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverType liveCoverType, Integer num, Integer num2) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, null, null, null, null, null, 62, null), MobileOfficialAppsGroupsStat$TypeGroupsEventItem.a.a(l.longValue(), null, null, new MobileOfficialAppsGroupsStat$LiveCoverEvent(liveCoverEventType, liveCoverType, num, num2), 30), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
