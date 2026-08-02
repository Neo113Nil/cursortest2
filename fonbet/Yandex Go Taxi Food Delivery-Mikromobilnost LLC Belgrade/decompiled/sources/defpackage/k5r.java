package defpackage;

import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class k5r {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType.values().length];
        try {
            iArr[TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransportOnSummaryExperiment.LiveTagsSettings.LiveTagsFilterType.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
