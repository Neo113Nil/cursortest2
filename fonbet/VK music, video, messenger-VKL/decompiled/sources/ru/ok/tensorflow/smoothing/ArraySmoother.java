package ru.ok.tensorflow.smoothing;

import ru.ok.tensorflow.smoothing.filter.IFilter;
import ru.ok.tensorflow.util.Function2;

/* loaded from: classes9.dex */
public class ArraySmoother {
    private Function2<Long, Float, IFilter> filterFunc;
    IFilter[] filters = null;

    public ArraySmoother(Function2<Long, Float, IFilter> function2) {
        this.filterFunc = function2;
    }

    public float[] filter(float[] fArr) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.filters == null) {
            this.filters = new IFilter[fArr.length];
            for (int i = 0; i < fArr.length; i++) {
                this.filters[i] = this.filterFunc.apply(Long.valueOf(currentTimeMillis), Float.valueOf(fArr[i]));
            }
        }
        float[] fArr2 = new float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = this.filters[i2].filter(currentTimeMillis, fArr[i2]);
        }
        return fArr2;
    }
}
