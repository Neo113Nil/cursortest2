package defpackage;

import ru.yandex.taxi.summary.solid.interactor.CommunicationsPriorityInteractor$DataPriorityType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class euc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CommunicationsPriorityInteractor$DataPriorityType.values().length];
        try {
            iArr[CommunicationsPriorityInteractor$DataPriorityType.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CommunicationsPriorityInteractor$DataPriorityType.HIDE_BUBBLES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CommunicationsPriorityInteractor$DataPriorityType.HIDE_NOTIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
