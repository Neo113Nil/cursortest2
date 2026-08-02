package com.yandex.div.core.animation;

import android.view.animation.Interpolator;
import defpackage.b64;
import defpackage.g8e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/yandex/div/core/animation/LookupTableInterpolator;", "Landroid/view/animation/Interpolator;", "values", "", "([F)V", "stepSize", "", "getInterpolation", "input", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LookupTableInterpolator implements Interpolator {
    private final float stepSize;
    private final float[] values;

    public LookupTableInterpolator(float[] fArr) {
        this.values = fArr;
        this.stepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        if (input <= 0.0f) {
            return 0.0f;
        }
        if (input >= 1.0f) {
            return 1.0f;
        }
        float[] fArr = this.values;
        int length = (int) ((fArr.length - 1) * input);
        int length2 = fArr.length - 2;
        if (length > length2) {
            length = length2;
        }
        float f = this.stepSize;
        float a = b64.a(length, f, input, f);
        float f2 = fArr[length];
        return g8e.b(fArr[length + 1], f2, a, f2);
    }
}
