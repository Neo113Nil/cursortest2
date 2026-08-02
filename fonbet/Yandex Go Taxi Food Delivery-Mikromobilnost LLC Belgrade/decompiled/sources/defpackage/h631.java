package defpackage;

import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class h631 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VariantStyle.VariantType.values().length];
        try {
            iArr[VariantStyle.VariantType.VEHICLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VariantStyle.VariantType.MARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VariantStyle.VariantType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VariantStyle.VariantType.DOT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
