package defpackage;

import com.yandex.go.chargers.surge.domain.ChargersScreenWithSurge;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class do9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersScreenWithSurge.values().length];
        try {
            iArr[ChargersScreenWithSurge.STATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersScreenWithSurge.OFFER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
