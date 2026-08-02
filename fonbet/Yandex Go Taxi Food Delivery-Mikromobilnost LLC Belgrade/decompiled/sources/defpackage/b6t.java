package defpackage;

import com.yandex.messaging.domain.user.UserNameType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class b6t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserNameType.values().length];
        try {
            iArr[UserNameType.DELETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserNameType.NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserNameType.NORMAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
