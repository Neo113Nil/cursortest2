package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class gm implements kgn {
    public final /* synthetic */ gzs a;
    public final /* synthetic */ f5z b;
    public final /* synthetic */ fm c;

    public gm(gzs gzsVar, f5z f5zVar, fm fmVar) {
        this.a = gzsVar;
        this.b = f5zVar;
        this.c = fmVar;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.invoke();
        this.b.getLifecycle().removeObserver(this.c);
    }
}
