package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class kz1 implements v9k0 {
    public final /* synthetic */ f12<Object> a;
    public final /* synthetic */ izs<Float, Float> b;
    public final /* synthetic */ com.vk.movika.sdk.base.logic.processor.actions.f c;

    public kz1(f12 f12Var, izs izsVar, com.vk.movika.sdk.base.logic.processor.actions.f fVar) {
        this.a = f12Var;
        this.b = izsVar;
        this.c = fVar;
    }

    @Override // xsna.v9k0
    public final float a(float f) {
        f12<Object> f12Var = this.a;
        float f2 = f12Var.f();
        Object c = lz1.c(f12Var.c(), f2, f, this.b, this.c);
        if (!f12Var.a.invoke(c).booleanValue()) {
            c = ((zak0) f12Var.h).getValue();
        }
        return f12Var.c().c(c) - f2;
    }

    @Override // xsna.v9k0
    public final float b(float f, float f2) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
