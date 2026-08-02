package defpackage;

import ru.yandex.taxi.masstransit.MtHubTicket$Type;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class mm30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtHubTicket$Type.values().length];
        try {
            iArr[MtHubTicket$Type.MASSTRANSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtHubTicket$Type.AEROEXPRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtHubTicket$Type.SUBURBAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
