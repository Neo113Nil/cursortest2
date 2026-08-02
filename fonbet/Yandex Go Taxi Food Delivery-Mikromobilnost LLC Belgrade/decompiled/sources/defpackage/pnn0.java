package defpackage;

import ru.yandex.taxi.scooters.experiments.FinishCard;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pnn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FinishCard.Statistics.StatisticsItem.values().length];
        try {
            iArr[FinishCard.Statistics.StatisticsItem.DISTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinishCard.Statistics.StatisticsItem.SPEED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FinishCard.Statistics.StatisticsItem.DURATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinishCard.Statistics.StatisticsItem.PRICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
