package defpackage;

/* loaded from: classes13.dex */
public final class bd31 implements kr4 {
    public final wp01 b;
    public boolean c;

    public bd31(wp01 wp01Var) {
        this.b = wp01Var;
    }

    @Override // defpackage.kr4
    public final void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.invoke();
    }

    @Override // defpackage.kr4
    public final void onDetach() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.invoke();
    }
}
