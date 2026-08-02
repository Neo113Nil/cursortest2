package defpackage;

import com.yandex.go.flex.common.FlexibleGridVersion;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class n580 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FlexibleGridVersion.values().length];
        try {
            iArr[FlexibleGridVersion.V3.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlexibleGridVersion.V2.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FlexibleGridVersion.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
