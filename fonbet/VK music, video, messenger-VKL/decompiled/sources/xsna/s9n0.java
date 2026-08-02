package xsna;

import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import java.util.ArrayList;

/* compiled from: SuperAppMenuV3Analytics.kt */
/* loaded from: classes6.dex */
public final class s9n0 {
    public ArrayList a;
    public p820 b;

    /* compiled from: SuperAppMenuV3Analytics.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProfileNavigationInfo.SecurityInfo.values().length];
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.NO_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.NO_PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.HAS_WARNINGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProfileNavigationInfo.SecurityInfo.ALL_GOOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
