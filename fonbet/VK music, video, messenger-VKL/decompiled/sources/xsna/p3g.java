package xsna;

/* compiled from: CollageViewModelFactory.kt */
/* loaded from: classes4.dex */
public final class p3g extends opf0<n3g> {
    public final com.vk.photo.editor.ivm.d a;
    public final u3p b;
    public final ng1 c;
    public final c5p d;

    public p3g(com.vk.photo.editor.ivm.d dVar, u3p u3pVar, ng1 ng1Var, c5p c5pVar) {
        this.a = dVar;
        this.b = u3pVar;
        this.c = ng1Var;
        this.d = c5pVar;
    }

    @Override // xsna.opf0
    public final n3g e() {
        n3g n3gVar = new n3g();
        n3gVar.l(this.a, this.b, this.c, this.d);
        return n3gVar;
    }

    @Override // xsna.opf0
    public final void f(n3g n3gVar) {
        n3gVar.l(this.a, this.b, this.c, this.d);
    }
}
