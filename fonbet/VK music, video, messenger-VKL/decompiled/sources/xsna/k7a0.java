package xsna;

/* compiled from: PhotoEditorViewModelFactory.kt */
/* loaded from: classes4.dex */
public final class k7a0 extends opf0<j7a0> {
    public final com.vk.photo.editor.ivm.d a;
    public final cf00 b;
    public final tu80 c;

    public k7a0(com.vk.photo.editor.ivm.d dVar, cf00 cf00Var, tu80 tu80Var) {
        this.a = dVar;
        this.b = cf00Var;
        this.c = tu80Var;
    }

    @Override // xsna.opf0
    public final j7a0 e() {
        j7a0 j7a0Var = new j7a0();
        j7a0Var.c = this.a;
        j7a0Var.e = this.b;
        j7a0Var.d = this.c;
        return j7a0Var;
    }

    @Override // xsna.opf0
    public final void f(j7a0 j7a0Var) {
        j7a0 j7a0Var2 = j7a0Var;
        j7a0Var2.c = this.a;
        j7a0Var2.e = this.b;
        j7a0Var2.d = this.c;
    }
}
