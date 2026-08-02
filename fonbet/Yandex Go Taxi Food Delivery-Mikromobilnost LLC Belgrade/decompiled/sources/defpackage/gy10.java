package defpackage;

import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class gy10 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessagesRange$LoadingType.values().length];
        try {
            iArr[MessagesRange$LoadingType.FromNewest.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessagesRange$LoadingType.FromOldest.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessagesRange$LoadingType.AroundNewest.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
