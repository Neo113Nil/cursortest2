package defpackage;

import com.yandex.plus.core.graphql.type.USER_SYNC_STATUS;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class c0u {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[USER_SYNC_STATUS.values().length];
        try {
            iArr[USER_SYNC_STATUS.SYNCHRONIZATION_IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[USER_SYNC_STATUS.SYNCHRONIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
