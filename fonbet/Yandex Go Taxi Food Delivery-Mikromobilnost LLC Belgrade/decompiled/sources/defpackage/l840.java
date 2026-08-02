package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.MtTicketsPagerItemHelper$ExpirationAnimationDelayKind;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class l840 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.values().length];
        try {
            iArr[MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.ReplayFadeInThenDelay.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.HeldOffScreenDelay.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtTicketsPagerItemHelper$ExpirationAnimationDelayKind.StandardExpirationDelay.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
