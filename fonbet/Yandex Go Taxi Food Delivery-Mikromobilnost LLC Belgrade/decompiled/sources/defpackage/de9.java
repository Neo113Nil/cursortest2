package defpackage;

import com.ybsdk.screens.changephone.push.ChangePhoneApplicationSilentPushParser$Companion$Statuses;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class de9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangePhoneApplicationSilentPushParser$Companion$Statuses.values().length];
        try {
            iArr[ChangePhoneApplicationSilentPushParser$Companion$Statuses.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangePhoneApplicationSilentPushParser$Companion$Statuses.READY_FOR_CONFIRMATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
