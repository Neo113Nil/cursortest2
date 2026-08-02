package defpackage;

import ru.yandex.taxi.communications.api.dto.RetryPolicy;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jux0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RetryPolicy.values().length];
        try {
            iArr[RetryPolicy.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RetryPolicy.SINGLE_ATTEMPT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
