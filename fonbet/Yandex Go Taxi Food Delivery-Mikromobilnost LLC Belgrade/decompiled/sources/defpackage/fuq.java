package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.domain.api.data.FeedbackType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class fuq {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeedbackType.values().length];
        try {
            iArr[FeedbackType.CANCEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedbackType.FINAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeedbackType.REGULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
