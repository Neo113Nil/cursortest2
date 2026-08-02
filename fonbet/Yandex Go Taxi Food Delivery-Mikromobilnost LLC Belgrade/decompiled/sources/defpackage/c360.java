package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.NeuroPostcardButtonModel$ButtonSizeModel;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.NeuroPostcardButtonModel$ButtonStyleModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c360 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[NeuroPostcardButtonModel$ButtonSizeModel.values().length];
        try {
            iArr[NeuroPostcardButtonModel$ButtonSizeModel.S.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NeuroPostcardButtonModel$ButtonSizeModel.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NeuroPostcardButtonModel$ButtonSizeModel.L.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[NeuroPostcardButtonModel$ButtonStyleModel.values().length];
        try {
            iArr2[NeuroPostcardButtonModel$ButtonStyleModel.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NeuroPostcardButtonModel$ButtonStyleModel.FLOATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NeuroPostcardButtonModel$ButtonStyleModel.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
