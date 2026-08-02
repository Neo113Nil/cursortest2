package defpackage;

import com.yandex.go.blockeduser.api.analytics.BlockedReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class d46 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BlockedReason.values().length];
        try {
            iArr[BlockedReason.LAUNCH_HAS_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlockedReason.HANDLE_FORBIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
