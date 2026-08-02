package com.yandex.go.taxi.order.util.driver;

import android.view.animation.Interpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\n"}, d2 = {"Lcom/yandex/go/taxi/order/util/driver/BounceInterpolator;", "Landroid/view/animation/Interpolator;", "amplitude", "", "frequency", "<init>", "(DD)V", "getInterpolation", "", RemoteBioParameters.TIME, "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BounceInterpolator implements Interpolator {
    public static final int $stable = 0;
    private final double amplitude;
    private final double frequency;

    public /* synthetic */ BounceInterpolator(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.2d : d, (i & 2) != 0 ? 10.0d : d2);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float time) {
        return (float) (1.0d - (Math.cos(this.frequency * time) * Math.pow(2.718281828459045d, (-time) / this.amplitude)));
    }

    public BounceInterpolator(double d, double d2) {
        this.amplitude = d;
        this.frequency = d2;
    }

    public BounceInterpolator() {
        this(0.0d, 0.0d, 3, null);
    }
}
