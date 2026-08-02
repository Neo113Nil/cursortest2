package xsna;

import com.vk.toggle.data.StartupBackoffMode;

/* compiled from: ApiWrapper.kt */
/* loaded from: classes11.dex */
public final /* synthetic */ class u03 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[StartupBackoffMode.values().length];
        try {
            iArr[StartupBackoffMode.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StartupBackoffMode.DO_NOT_WAIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StartupBackoffMode.WAIT_REQUESTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StartupBackoffMode.WAIT_RESPONSES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
