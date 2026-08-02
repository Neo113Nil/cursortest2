package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.component.misc.EnterAnimation;
import ru.yandex.taxi.logistics.sdk.ui.component.misc.ExitAnimation;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class kz2 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[EnterAnimation.values().length];
        try {
            iArr[EnterAnimation.FADE_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnterAnimation.SCALE_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnterAnimation.SLIDE_IN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnterAnimation.SLIDE_IN_HORIZONTALLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnterAnimation.SLIDE_IN_VERTICALLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnterAnimation.EXPAND_IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnterAnimation.EXPAND_HORIZONTALLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[EnterAnimation.EXPAND_VERTICALLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[EnterAnimation.DEFAULT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        a = iArr;
        int[] iArr2 = new int[ExitAnimation.values().length];
        try {
            iArr2[ExitAnimation.FADE_OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ExitAnimation.SCALE_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ExitAnimation.SLIDE_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ExitAnimation.SLIDE_OUT_HORIZONTALLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ExitAnimation.SLIDE_OUT_VERTICALLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[ExitAnimation.SHRINK_OUT.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[ExitAnimation.SHRINK_HORIZONTALLY.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[ExitAnimation.SHRINK_VERTICALLY.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[ExitAnimation.DEFAULT.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        b = iArr2;
    }
}
