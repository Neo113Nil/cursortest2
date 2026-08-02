package xsna;

import com.vk.superapp.multiaccount.api.UserSecurityStatus;

/* compiled from: SecurityNotificationHelper.kt */
/* loaded from: classes6.dex */
public final class b3i0 {
    public boolean a;

    /* compiled from: SecurityNotificationHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserSecurityStatus.values().length];
            try {
                iArr[UserSecurityStatus.PROTECTION_RECOMMENDATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserSecurityStatus.CRITICAL_VULNERABILITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
