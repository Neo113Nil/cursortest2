package xsna;

/* compiled from: GeoSideEffectChannel.kt */
/* loaded from: classes2.dex */
public final class gnt implements nhl {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gnt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.nhl
    public final void onCreate(f5z f5zVar) {
        int i = this.b;
    }

    @Override // xsna.nhl
    public final void onDestroy(f5z f5zVar) {
        switch (this.b) {
            case 0:
                f5zVar.getLifecycle().removeObserver(this);
                ((hnt) this.c).cancel();
                break;
            default:
                z8a0 z8a0Var = (z8a0) this.c;
                z8a0Var.i.v();
                com.vk.core.view.components.spinner.c cVar = z8a0Var.l;
                if (cVar != null) {
                    cVar.dismiss();
                    break;
                }
                break;
        }
    }

    @Override // xsna.nhl
    public final void onPause(f5z f5zVar) {
        int i = this.b;
    }

    @Override // xsna.nhl
    public final void onResume(f5z f5zVar) {
        int i = this.b;
    }

    @Override // xsna.nhl
    public final void onStart(f5z f5zVar) {
        int i = this.b;
    }

    @Override // xsna.nhl
    public final void onStop(f5z f5zVar) {
        int i = this.b;
    }

    private final void a(f5z f5zVar) {
    }

    private final void b(f5z f5zVar) {
    }

    private final void c(f5z f5zVar) {
    }

    private final void d(f5z f5zVar) {
    }

    private final void e(f5z f5zVar) {
    }

    private final void f(f5z f5zVar) {
    }

    private final void g(f5z f5zVar) {
    }

    private final void h(f5z f5zVar) {
    }

    private final void i(f5z f5zVar) {
    }

    private final void j(f5z f5zVar) {
    }
}
