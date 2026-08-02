package defpackage;

import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class ny31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FileProgressObservable$Listener$Status.values().length];
        try {
            iArr[FileProgressObservable$Listener$Status.FINISHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
