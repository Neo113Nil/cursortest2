package defpackage;

import ru.yandex.taxi.scooters.domain.model.ScootersInsuranceVersion;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class h5n0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersInsuranceVersion.values().length];
        try {
            iArr[ScootersInsuranceVersion.V2.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersInsuranceVersion.V3.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
