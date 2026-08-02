package com.yandex.go.suggest.impl.data.experiments;

import defpackage.gsq0;
import defpackage.xn11;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/suggest/impl/data/experiments/SuperappSuggestGeoDependentExperiment;", "Lxn11;", "Companion", "com/yandex/go/suggest/impl/data/experiments/i", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperappSuggestGeoDependentExperiment implements xn11 {
    public static final i Companion = new i();
    public static final SuperappSuggestGeoDependentExperiment c = new SuperappSuggestGeoDependentExperiment(0);
    public final boolean b;

    public /* synthetic */ SuperappSuggestGeoDependentExperiment(int i, boolean z) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
    }

    public SuperappSuggestGeoDependentExperiment(int i) {
        this.b = false;
    }

    public SuperappSuggestGeoDependentExperiment() {
        this(0);
    }
}
