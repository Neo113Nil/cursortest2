package defpackage;

import ru.yandex.taxi.jobs.request.RetryPolicy;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class k6j0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RetryPolicy.values().length];
        try {
            iArr[RetryPolicy.EXPONENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RetryPolicy.LINEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
