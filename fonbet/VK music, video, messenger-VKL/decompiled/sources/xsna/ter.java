package xsna;

/* compiled from: FilterViewModelFactory.kt */
/* loaded from: classes4.dex */
public final class ter extends opf0<com.vk.photo.editor.features.filter.c> {
    public final mdr a;
    public final hdr b;
    public final com.vk.photo.editor.ivm.d c;
    public final c5p d;
    public final jpf e;

    public ter(com.vk.photo.editor.ivm.d dVar, jpf jpfVar, c5p c5pVar, hdr hdrVar, mdr mdrVar) {
        this.a = mdrVar;
        this.b = hdrVar;
        this.c = dVar;
        this.d = c5pVar;
        this.e = jpfVar;
    }

    @Override // xsna.opf0
    public final com.vk.photo.editor.features.filter.c e() {
        com.vk.photo.editor.features.filter.c cVar = new com.vk.photo.editor.features.filter.c();
        c5p c5pVar = this.d;
        cVar.o(this.c, this.e, c5pVar, this.b, this.a);
        return cVar;
    }

    @Override // xsna.opf0
    public final void f(com.vk.photo.editor.features.filter.c cVar) {
        c5p c5pVar = this.d;
        cVar.o(this.c, this.e, c5pVar, this.b, this.a);
    }
}
