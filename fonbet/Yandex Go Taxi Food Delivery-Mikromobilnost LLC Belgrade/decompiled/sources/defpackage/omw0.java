package defpackage;

import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;
import ru.yandex.taxi.requirements.models.net.OptionViewStyleDto;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class omw0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[OptionViewStyleDto.values().length];
        try {
            iArr[OptionViewStyleDto.SPINNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OptionViewStyleDto.CHECK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OptionViewStyleDto.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[CompoundSelectDto.CompoundSelectItemTypeDto.values().length];
        try {
            iArr2[CompoundSelectDto.CompoundSelectItemTypeDto.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[CompoundSelectDto.CompoundSelectItemTypeDto.CHILD_SEATS.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
