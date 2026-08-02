package defpackage;

import com.yandex.messaging.internal.authorized.sync.SyncController$SyncErrorSource;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class m5e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SyncController$SyncErrorSource.values().length];
        try {
            iArr[SyncController$SyncErrorSource.HISTORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SyncController$SyncErrorSource.WHOAMI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
