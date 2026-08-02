package defpackage;

import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class dww {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharedAccountType.values().length];
        try {
            iArr[SharedAccountType.FAMILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedAccountType.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharedAccountType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
