package defpackage;

import ru.yandex.taxi.masstransit.geopayment.linkcard.network.model.LinkCardStatusResponse$LinkCardStatus;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class hn30 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkCardStatusResponse$LinkCardStatus.values().length];
        try {
            iArr[LinkCardStatusResponse$LinkCardStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkCardStatusResponse$LinkCardStatus.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LinkCardStatusResponse$LinkCardStatus.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LinkCardStatusResponse$LinkCardStatus.IN_PROGRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
