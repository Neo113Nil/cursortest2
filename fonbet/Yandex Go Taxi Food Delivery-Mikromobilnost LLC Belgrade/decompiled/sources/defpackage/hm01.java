package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.Status;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class hm01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Status.values().length];
        try {
            iArr[Status.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Status.CONFIRMING_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Status.INITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
