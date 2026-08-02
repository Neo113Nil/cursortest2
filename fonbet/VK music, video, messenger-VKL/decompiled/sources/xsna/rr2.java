package xsna;

import ru.ok.call_effects.AnimojiEffect;
import ru.ok.gl.util.Consumer4;
import ru.ok.gleffects.EffectRegistry;
import ru.ok.gleffects.EffectResourceProvider;
import xsna.exy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class rr2 implements EffectResourceProvider, Consumer4, exy0.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rr2(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.ok.gl.util.Consumer4
    public void accept(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Consumer4) this.b).lambda$andThen$0((Consumer4) this.c, obj, obj2, obj3, obj4);
    }

    @Override // xsna.exy0.a
    public void b() {
        pbz0 pbz0Var = (pbz0) this.b;
        pbz0Var.c.e((tez0) this.c);
    }

    @Override // ru.ok.gleffects.EffectResourceProvider
    public void getEffectResourcepackFile(EffectRegistry.EffectId effectId, o7j o7jVar) {
        AnimojiEffect.m391maybeRecreateBufferForSize$lambda0((EffectRegistry.EffectId) this.b, (AnimojiEffect) this.c, effectId, o7jVar);
    }
}
