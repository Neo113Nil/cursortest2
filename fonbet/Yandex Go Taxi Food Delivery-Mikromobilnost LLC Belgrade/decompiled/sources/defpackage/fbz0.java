package defpackage;

import com.yandex.messaging.internal.net.Error;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class fbz0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Error.values().length];
        try {
            iArr[Error.PRIVACY_RESTRICTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Error.GENERIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Error.INVITE_LINK_INVALID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Error.ALIAS_INVALID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Error.HAS_NO_RIGHTS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
