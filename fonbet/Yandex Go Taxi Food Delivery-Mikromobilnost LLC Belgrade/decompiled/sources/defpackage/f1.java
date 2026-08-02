package defpackage;

import com.yandex.mobile.drive.sdk.full.Environment;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class f1 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Environment.values().length];
        try {
            iArr[Environment.STABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Environment.PRESTABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Environment.TESTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Environment.QA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
