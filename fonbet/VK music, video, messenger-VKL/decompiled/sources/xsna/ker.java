package xsna;

import com.vk.photo.editor.features.filter.FilterUiModel;
import com.vk.photo.editor.ivm.EditorState;
import xsna.xdr;

/* compiled from: FilterTool.kt */
/* loaded from: classes4.dex */
public final class ker implements lb80 {
    public final /* synthetic */ com.vk.photo.editor.features.filter.b b;

    public ker(com.vk.photo.editor.features.filter.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.lb80
    public final void b() {
        aa00 aa00Var;
        com.vk.photo.editor.features.filter.b bVar = this.b;
        v3p v3pVar = bVar.d;
        com.vk.photo.editor.features.filter.c cVar = bVar.c;
        FilterUiModel l = cVar.l();
        FilterUiModel k = l != null ? cVar.k(l) : null;
        nrk0 b = v3pVar.b();
        g5p g5pVar = ((EditorState) v3pVar.d().b.b.getValue()).b.get(ler.a);
        edr edrVar = g5pVar instanceof edr ? (edr) g5pVar : null;
        b.b(new xdr.c((edrVar == null || (aa00Var = edrVar.a) == null) ? null : aa00Var.b, k != null ? k.b : null, l != null ? l.i : null));
    }

    @Override // xsna.lb80
    public final void c(float f) {
        com.vk.photo.editor.features.filter.c cVar = this.b.c;
        int b = an10.b(f);
        cVar.getClass();
        myc0.h(zvj.g(fai.t(cVar), bdn.b), null, null, new qer(cVar, b, null), 3);
    }

    @Override // xsna.lb80
    public final void g() {
    }
}
