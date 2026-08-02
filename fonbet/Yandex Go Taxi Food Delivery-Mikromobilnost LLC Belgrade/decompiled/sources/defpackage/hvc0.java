package defpackage;

import io.flutter.embedding.engine.systemchannels.PlatformChannel$DeviceOrientation;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiMode;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class hvc0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[PlatformChannel$SystemUiMode.values().length];
        c = iArr;
        try {
            iArr[PlatformChannel$SystemUiMode.LEAN_BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            c[PlatformChannel$SystemUiMode.IMMERSIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            c[PlatformChannel$SystemUiMode.IMMERSIVE_STICKY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            c[PlatformChannel$SystemUiMode.EDGE_TO_EDGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[PlatformChannel$SystemUiOverlay.values().length];
        b = iArr2;
        try {
            iArr2[PlatformChannel$SystemUiOverlay.TOP_OVERLAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            b[PlatformChannel$SystemUiOverlay.BOTTOM_OVERLAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[PlatformChannel$DeviceOrientation.values().length];
        a = iArr3;
        try {
            iArr3[PlatformChannel$DeviceOrientation.PORTRAIT_UP.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[PlatformChannel$DeviceOrientation.PORTRAIT_DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[PlatformChannel$DeviceOrientation.LANDSCAPE_LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[PlatformChannel$DeviceOrientation.LANDSCAPE_RIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
