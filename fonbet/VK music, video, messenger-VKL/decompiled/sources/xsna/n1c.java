package xsna;

import com.vk.superapp.api.dto.auth.InitPasswordCheckResponse;

/* compiled from: CheckUserAccessTracker.kt */
/* loaded from: classes15.dex */
public final class n1c {

    /* compiled from: CheckUserAccessTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitPasswordCheckResponse.AccessFactor.values().length];
            try {
                iArr[InitPasswordCheckResponse.AccessFactor.PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitPasswordCheckResponse.AccessFactor.SMS_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
