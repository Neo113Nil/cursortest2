package defpackage;

import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinVisualState;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class c2c0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PinState.values().length];
        try {
            iArr[PinState.INVISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PinState.DUST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PinState.ICON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PinState.CLUSTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PinState.SUPERCLUSTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[PinState.ICON_LABEL_S.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[PinState.ICON_LABEL_M.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[PinVisualState.values().length];
        try {
            iArr2[PinVisualState.INVISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PinVisualState.DUST.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PinVisualState.ICON.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PinVisualState.CLUSTER.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PinVisualState.SUPERCLUSTER.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PinVisualState.ICON_LABEL_S.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PinVisualState.ICON_LABEL_M.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PinVisualState.SELECTED.ordinal()] = 8;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}
