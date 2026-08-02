package defpackage;

import ru.yandex.taxi.delivery.api.routers.PaidInsuranceScreenSource;
import ru.yandex.taxi.tariffs.model.ButtonStyleModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class bhi {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PaidInsuranceScreenSource.values().length];
        try {
            iArr[PaidInsuranceScreenSource.ORDER_BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PaidInsuranceScreenSource.REQUIREMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ButtonStyleModel.values().length];
        try {
            iArr2[ButtonStyleModel.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ButtonStyleModel.MINOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
