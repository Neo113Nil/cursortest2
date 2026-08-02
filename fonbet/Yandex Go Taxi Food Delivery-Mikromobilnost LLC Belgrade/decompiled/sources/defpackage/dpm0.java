package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import ru.yandex.taxi.scooters.data.model.OfferType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class dpm0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OfferType.values().length];
        try {
            iArr[OfferType.FIX_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OfferType.STANDARD_OFFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersInsuranceType.values().length];
        try {
            iArr2[ScootersInsuranceType.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScootersInsuranceType.STANDART.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
