package com.yandex.div.internal.widget.tabs;

import com.yandex.div.internal.widget.tabs.TabMeasurement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements TabMeasurement.TabMeasurementFunction {
    public final /* synthetic */ BaseCardHeightCalculator a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ a(BaseCardHeightCalculator baseCardHeightCalculator, int i, int i2) {
        this.a = baseCardHeightCalculator;
        this.b = i;
        this.c = i2;
    }

    public final int a(int i) {
        int lambda$measureHeight$0;
        lambda$measureHeight$0 = this.a.lambda$measureHeight$0(this.b, this.c, i);
        return lambda$measureHeight$0;
    }
}
