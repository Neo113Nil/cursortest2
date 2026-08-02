package com.yandex.div.core.dagger;

import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.histogram.HistogramRecordConfiguration;

/* compiled from: DivKitComponent.kt */
/* loaded from: classes7.dex */
public interface DivKitComponent {

    /* compiled from: DivKitComponent.kt */
    public interface Builder {
        Builder applicationContext(Context context);

        DivKitComponent build();

        Builder configuration(DivKitConfiguration divKitConfiguration);
    }

    Div2Component.Builder div2Component();

    HistogramRecordConfiguration getHistogramRecordConfiguration();
}
