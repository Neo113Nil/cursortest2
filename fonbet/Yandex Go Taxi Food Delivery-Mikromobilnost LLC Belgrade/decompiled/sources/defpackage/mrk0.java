package defpackage;

import com.yandex.go.sdk.SourceType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class mrk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SourceType.values().length];
        try {
            iArr[SourceType.OUTPUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SourceType.GPS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SourceType.NETWORK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SourceType.FUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SourceType.MAPKIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SourceType.LBS_GSM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SourceType.LBS_WIFI.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
