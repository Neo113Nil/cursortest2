package defpackage;

import com.yandex.go.design.compose.haptic.HapticEffect;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ggd {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HapticEffect.values().length];
        try {
            iArr[HapticEffect.PromoAppear.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[HapticEffect.ClickLight.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[HapticEffect.ClickMedium.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[HapticEffect.ClickHard.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[HapticEffect.Tick.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
