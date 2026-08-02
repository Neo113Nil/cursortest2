package defpackage;

import com.yandex.messaging.internal.MessageStatus;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class c4b {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessageStatus.values().length];
        try {
            iArr[MessageStatus.SENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessageStatus.SENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MessageStatus.READ.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MessageStatus.DETAINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MessageStatus.OTHER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
