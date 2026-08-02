package defpackage;

import ru.yandex.taxi.settings.support.SupportPushMessageInteractor$UpdateMessagesStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class d1g0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportPushMessageInteractor$UpdateMessagesStatus.values().length];
        try {
            iArr[SupportPushMessageInteractor$UpdateMessagesStatus.PARTIALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportPushMessageInteractor$UpdateMessagesStatus.UPDATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SupportPushMessageInteractor$UpdateMessagesStatus.NOT_UPDATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SupportPushMessageInteractor$UpdateMessagesStatus.NOT_APPLICABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
