package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i3w implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i3w(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                n3w n3wVar = (n3w) this.c;
                h0w h0wVar = (h0w) n3wVar.y.getValue();
                bay bayVar = n3wVar.a.l;
                l1j0 l1j0Var = l1j0.a;
                n3wVar.k = new a1a0(h0wVar, "vkim_settings.sqlite");
                break;
            default:
                ((com.my.tracker.obfuscated.v0) this.c).a();
                break;
        }
    }
}
