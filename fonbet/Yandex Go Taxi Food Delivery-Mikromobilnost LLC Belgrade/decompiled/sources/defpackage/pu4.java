package defpackage;

/* loaded from: classes14.dex */
public final class pu4 implements kr4 {
    public final /* synthetic */ Runnable b;

    public pu4(Runnable runnable) {
        this.b = runnable;
    }

    @Override // defpackage.kr4
    public final void a() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.kr4
    public final void b() {
    }

    @Override // defpackage.kr4
    public final void c() {
    }

    @Override // defpackage.kr4
    public final void onDetach() {
    }
}
