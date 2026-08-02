package defpackage;

import com.yandex.messaging.domain.user.DeletedShownStatus;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class hsh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeletedShownStatus.values().length];
        try {
            iArr[DeletedShownStatus.EmptyStatus.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeletedShownStatus.NormalStatus.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DeletedShownStatus.DeletedInOrg.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DeletedShownStatus.DeletedAccount.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
