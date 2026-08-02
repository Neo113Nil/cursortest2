package xsna;

/* compiled from: FadeAudioEffectListenerChain.kt */
/* loaded from: classes3.dex */
public final class giq implements qx40 {
    public final fiq a;
    public final hx40 b;
    public hiq c;

    public giq(fiq fiqVar, hx40 hx40Var) {
        this.a = fiqVar;
        this.b = hx40Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qx40
    public final px40 a(px40 px40Var) {
        hiq hiqVar = this.c;
        if (hiqVar != null) {
            ((kiq) hiqVar.d.getValue()).a();
        }
        hiq hiqVar2 = new hiq(this.a, px40Var, this.b);
        this.c = hiqVar2;
        return hiqVar2;
    }
}
