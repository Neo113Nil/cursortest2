package xsna;

/* compiled from: DrawViewModelFactory.kt */
/* loaded from: classes4.dex */
public final class kjo extends opf0<jjo> {
    public final int a;
    public final com.vk.photo.editor.ivm.d b;
    public final boolean c;

    public kjo(int i, com.vk.photo.editor.ivm.d dVar, boolean z) {
        this.a = i;
        this.b = dVar;
        this.c = z;
    }

    @Override // xsna.opf0
    public final jjo e() {
        jjo jjoVar = new jjo();
        boolean z = this.c;
        jjoVar.i(this.a, this.b, z);
        return jjoVar;
    }

    @Override // xsna.opf0
    public final void f(jjo jjoVar) {
        boolean z = this.c;
        jjoVar.i(this.a, this.b, z);
    }
}
