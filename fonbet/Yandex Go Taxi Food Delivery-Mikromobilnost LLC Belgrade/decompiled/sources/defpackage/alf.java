package defpackage;

import com.yandex.go.sdk.SourceType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class alf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SourceType.values().length];
        try {
            iArr[SourceType.LBS_GSM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourceType.LBS_WIFI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SourceType.MAPKIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
