package xsna;

import com.vk.core.preference.Preference;
import com.vk.fcmerrorhandler.taostutils.EventType;

/* compiled from: FcmErrorPreferenceHelper.kt */
/* loaded from: classes18.dex */
public final class rtq {

    /* compiled from: FcmErrorPreferenceHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.PUSH_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static void a() {
        Preference.B("fcm_toast");
    }
}
