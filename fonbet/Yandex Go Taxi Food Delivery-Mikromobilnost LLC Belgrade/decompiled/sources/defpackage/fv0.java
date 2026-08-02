package defpackage;

import com.yandex.go.mainscreen.superapp.impl.header.experiment.CurrentAddressModalExperiment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CurrentAddressModalExperiment.OnMapClickActionType.values().length];
        try {
            iArr[CurrentAddressModalExperiment.OnMapClickActionType.UNDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CurrentAddressModalExperiment.OnMapClickActionType.OPEN_SUGGEST_MENU.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CurrentAddressModalExperiment.OnMapClickActionType.SELECT_ON_MAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
