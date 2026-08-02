package defpackage;

import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class fic {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CarIconPart$Layer.values().length];
        try {
            iArr[CarIconPart$Layer.MASK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CarIconPart$Layer.GLOSSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CarIconPart$Layer.SHADOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CarIconPart$Layer.HARD_LIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CarIconPart$Layer.SOFT_LIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[CarIconPart$Layer.WARM_LIGHT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[CarIconPart$Layer.DETAILS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
