package xsna;

import android.graphics.Rect;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* compiled from: AnimatedFactoryV2Impl.java */
/* loaded from: classes.dex */
public final class pj2 implements ej2 {
    public final /* synthetic */ AnimatedFactoryV2Impl b;

    public pj2(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.b = animatedFactoryV2Impl;
    }

    @Override // xsna.ej2
    public final dj2 e(wk2 wk2Var, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.b;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new hj2();
        }
        return new dj2(animatedFactoryV2Impl.g, wk2Var, rect, animatedFactoryV2Impl.d);
    }
}
