package yads;

/* loaded from: classes10.dex */
public final class fd implements Runnable {
    public final /* synthetic */ gd b;

    public fd(gd gdVar) {
        this.b = gdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((uh1) this.b.a.a).b("OPT_OUT_ENABLED", true);
    }
}
