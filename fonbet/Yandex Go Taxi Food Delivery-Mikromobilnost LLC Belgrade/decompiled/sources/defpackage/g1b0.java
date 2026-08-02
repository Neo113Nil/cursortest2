package defpackage;

import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class g1b0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PersistenceTypeDto.values().length];
        try {
            iArr[PersistenceTypeDto.LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PersistenceTypeDto.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
