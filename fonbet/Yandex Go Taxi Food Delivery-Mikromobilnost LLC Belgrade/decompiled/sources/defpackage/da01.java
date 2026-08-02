package defpackage;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class da01 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.values().length];
        try {
            iArr[SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.CHANGE_VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour.CHANGE_ENABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
