package defpackage;

import ru.yandex.taxi.communications.api.dto.ticket.TicketTopAsset;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class i3z0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TicketTopAsset.TicketTopAssetType.values().length];
        try {
            iArr[TicketTopAsset.TicketTopAssetType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TicketTopAsset.TicketTopAssetType.LOTTIE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TicketTopAsset.TicketTopAssetReplayMode.values().length];
        try {
            iArr2[TicketTopAsset.TicketTopAssetReplayMode.FOREVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TicketTopAsset.TicketTopAssetReplayMode.FIXED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
