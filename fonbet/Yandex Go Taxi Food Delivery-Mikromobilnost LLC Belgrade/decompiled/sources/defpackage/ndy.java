package defpackage;

import com.ybsdk.utils.poller.PollerScopeType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class ndy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PollerScopeType.values().length];
        try {
            iArr[PollerScopeType.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PollerScopeType.SDK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PollerScopeType.HOST_ACTIVITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
