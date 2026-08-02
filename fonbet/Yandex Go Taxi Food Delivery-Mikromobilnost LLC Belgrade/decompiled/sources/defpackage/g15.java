package defpackage;

import ru.yandex.taxi.utils.FeedbackConstantsDelegate$FeedbackIdentifierType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class g15 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeedbackConstantsDelegate$FeedbackIdentifierType.values().length];
        try {
            iArr[FeedbackConstantsDelegate$FeedbackIdentifierType.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedbackConstantsDelegate$FeedbackIdentifierType.ID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
