package defpackage;

import androidx.loader.content.ModernAsyncTask$Status;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b530 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ModernAsyncTask$Status.values().length];
        a = iArr;
        try {
            iArr[ModernAsyncTask$Status.RUNNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ModernAsyncTask$Status.FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
