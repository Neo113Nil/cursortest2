package com.yandex.go.navigator.focus;

import android.animation.TypeEvaluator;
import com.yandex.mapkit.ScreenPoint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016Ê\u0001\f\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/yandex/go/navigator/focus/ScreenPointEvaluator;", "Landroid/animation/TypeEvaluator;", "Lcom/yandex/mapkit/ScreenPoint;", "<init>", "()V", "evaluate", "fraction", "", "startValue", "endValue", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScreenPointEvaluator implements TypeEvaluator<ScreenPoint> {
    public static final int $stable = 0;

    @Override // android.animation.TypeEvaluator
    public ScreenPoint evaluate(float fraction, ScreenPoint startValue, ScreenPoint endValue) {
        return new ScreenPoint(startValue.getX() + ((int) ((endValue.getX() - startValue.getX()) * fraction)), startValue.getY() + ((int) ((endValue.getY() - startValue.getY()) * fraction)));
    }
}
