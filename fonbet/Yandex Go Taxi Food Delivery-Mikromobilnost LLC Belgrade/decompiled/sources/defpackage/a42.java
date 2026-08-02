package defpackage;

import com.yandex.go.suggest.impl.analytics.FindInGoSearchAnalytics$Style;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;

/* loaded from: classes8.dex */
public abstract class a42 {
    public static final FindInGoSearchAnalytics$Style a(SuperappSuggestExperiment.SearchScaffoldStyle searchScaffoldStyle) {
        int i = z32.a[searchScaffoldStyle.ordinal()];
        if (i == 1) {
            return FindInGoSearchAnalytics$Style.Normal;
        }
        if (i == 2) {
            return FindInGoSearchAnalytics$Style.FloatingInput;
        }
        w511.b();
        return null;
    }
}
