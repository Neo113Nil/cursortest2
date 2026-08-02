package defpackage;

/* loaded from: classes12.dex */
public final class ez00 implements pft0 {
    public final l110 a;
    public gas0 b;

    public ez00(l110 l110Var) {
        this.a = l110Var;
    }

    @Override // defpackage.pft0
    public final void c() {
        ((m110) this.a).b(this.b);
    }

    @Override // defpackage.pft0
    public final void onDestroyView() {
        ((m110) this.a).a(this.b);
    }
}
