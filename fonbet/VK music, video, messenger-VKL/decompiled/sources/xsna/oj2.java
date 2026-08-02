package xsna;

import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

/* compiled from: AnimatedFactoryV2Impl.java */
/* loaded from: classes.dex */
public final class oj2 implements niw {
    public final /* synthetic */ AnimatedFactoryV2Impl a;

    public oj2(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        this.a = animatedFactoryV2Impl;
    }

    @Override // xsna.niw
    public final svf a(rip ripVar, int i, cpe0 cpe0Var, liw liwVar) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = this.a;
        if (animatedFactoryV2Impl.e == null) {
            animatedFactoryV2Impl.e = new uk2(new rj01(animatedFactoryV2Impl), animatedFactoryV2Impl.a, animatedFactoryV2Impl.k);
        }
        return animatedFactoryV2Impl.e.a(ripVar, liwVar, liwVar.c);
    }
}
