package defpackage;

import com.yandex.mapkit.navigation.JamType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class i901 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JamType.values().length];
        try {
            iArr[JamType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JamType.BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JamType.FREE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JamType.LIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[JamType.HARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[JamType.VERY_HARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
