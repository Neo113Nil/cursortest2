package defpackage;

import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class k1r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileProgressObservable$Listener$Status.values().length];
        try {
            iArr[FileProgressObservable$Listener$Status.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FileProgressObservable$Listener$Status.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FileProgressObservable$Listener$Status.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FileProgressObservable$Listener$Status.CANCELED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FileProgressObservable$Listener$Status.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
