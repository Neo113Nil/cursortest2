package defpackage;

import ru.yandex.taxi.communications.ticket.ui.component.TicketCardType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class c2z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TicketCardType.values().length];
        try {
            iArr[TicketCardType.TopCard.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TicketCardType.BottomCard.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
