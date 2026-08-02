package com.yandex.div.core.view2.logging.bind;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Log;
import com.yandex.div2.j3;

/* compiled from: BindingEventReporterProvider.kt */
/* loaded from: classes7.dex */
public final class BindingEventReporterProvider {
    private final Div2View div2View;

    public BindingEventReporterProvider(Div2View div2View) {
        this.div2View = div2View;
    }

    public final BindingEventReporter get(j3 j3Var, j3 j3Var2) {
        return Log.isEnabled() ? new BindingEventReporterImpl(this.div2View, j3Var, j3Var2) : BindingEventReporter.Companion.getSTUB();
    }
}
