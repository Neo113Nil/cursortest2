package xsna;

import com.vk.stat.scheme.MobileOfficialAppsProfileStat$ServiceItem;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileMetricsCollectorImpl.kt */
/* loaded from: classes5.dex */
public final class oyd0 {

    /* compiled from: ProfileMetricsCollectorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType.values().length];
            try {
                iArr[MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType.QUESTIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType nativeServiceType) {
        if (a.$EnumSwitchMapping$0[nativeServiceType.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
