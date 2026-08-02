package xsna;

import com.vk.im.reporters.api.analytics.click.ImCallTypeAnalyticsItem;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$CallType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImCallTypeAnalytics.kt */
/* loaded from: classes5.dex */
public final class gyv {

    /* compiled from: ImCallTypeAnalytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImCallTypeAnalyticsItem.values().length];
            try {
                iArr[ImCallTypeAnalyticsItem.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImCallTypeAnalyticsItem.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImCallTypeAnalyticsItem.CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsCallsStat$CallType a(ImCallTypeAnalyticsItem imCallTypeAnalyticsItem) {
        int i = a.$EnumSwitchMapping$0[imCallTypeAnalyticsItem.ordinal()];
        if (i == 1) {
            return MobileOfficialAppsCallsStat$CallType.USER;
        }
        if (i == 2) {
            return MobileOfficialAppsCallsStat$CallType.GROUP;
        }
        if (i == 3) {
            return MobileOfficialAppsCallsStat$CallType.CONTACT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
