package xsna;

import com.vk.channelrestrictions.WarningReason;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$ContentWarningBlockType;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoContentWarningModalClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.profile.analytics.ContentWarningModalClick;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoProfileContentWarningAnalytics.kt */
/* loaded from: classes6.dex */
public final class m7t0 {

    /* compiled from: VideoProfileContentWarningAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WarningReason.values().length];
            try {
                iArr[WarningReason.ADULT_CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WarningReason.ANTI_VACCINES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WarningReason.HIV_DENIALISM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WarningReason.QUARANTINE_GATHERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WarningReason.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContentWarningModalClick.values().length];
            try {
                iArr2[ContentWarningModalClick.Hide.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ContentWarningModalClick.Leave.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ContentWarningModalClick.Article.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static void a(WarningReason warningReason, long j, ContentWarningModalClick contentWarningModalClick) {
        CommonVideoStat$ContentWarningBlockType commonVideoStat$ContentWarningBlockType;
        CommonVideoStat$TypeVideoContentWarningModalClick.EventType eventType;
        int i = a.$EnumSwitchMapping$0[warningReason.ordinal()];
        if (i == 1) {
            commonVideoStat$ContentWarningBlockType = CommonVideoStat$ContentWarningBlockType.CONTROVERSIAL;
        } else if (i == 2 || i == 3 || i == 4) {
            commonVideoStat$ContentWarningBlockType = CommonVideoStat$ContentWarningBlockType.FALSE_INFO;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            commonVideoStat$ContentWarningBlockType = null;
        }
        int i2 = a.$EnumSwitchMapping$1[contentWarningModalClick.ordinal()];
        if (i2 == 1) {
            eventType = CommonVideoStat$TypeVideoContentWarningModalClick.EventType.WARNING_NOTIFICATION_HIDE;
        } else if (i2 == 2) {
            eventType = CommonVideoStat$TypeVideoContentWarningModalClick.EventType.WARNING_NOTIFICATION_LEAVE;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            eventType = CommonVideoStat$TypeVideoContentWarningModalClick.EventType.WARNING_NOTIFICATION_ARTICLE;
        }
        if (commonVideoStat$ContentWarningBlockType == null) {
            return;
        }
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoContentWarningModalClick(eventType, commonVideoStat$ContentWarningBlockType, j), 2)).q();
    }
}
