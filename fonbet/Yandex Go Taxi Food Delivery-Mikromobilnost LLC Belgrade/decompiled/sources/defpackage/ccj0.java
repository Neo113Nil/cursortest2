package defpackage;

import ru.yandex.taxi.domain.RequirementAddressInputType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ccj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RequirementAddressInputType.values().length];
        try {
            iArr[RequirementAddressInputType.PORCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RequirementAddressInputType.FLOOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RequirementAddressInputType.DOOR_PHONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RequirementAddressInputType.APARTMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[RequirementAddressInputType.COMMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
