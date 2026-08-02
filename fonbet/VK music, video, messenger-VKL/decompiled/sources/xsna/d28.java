package xsna;

import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;

/* compiled from: BorderViewController.kt */
/* loaded from: classes4.dex */
public final class d28 implements lb80 {
    public final /* synthetic */ n3g b;
    public final /* synthetic */ e28 c;
    public final /* synthetic */ c5p d;

    public d28(n3g n3gVar, e28 e28Var, c5p c5pVar) {
        this.b = n3gVar;
        this.c = e28Var;
        this.d = c5pVar;
    }

    @Override // xsna.lb80
    public final void b() {
        this.d.b(CollageStatEvent.d.a);
    }

    @Override // xsna.lb80
    public final void c(float f) {
        n3g n3gVar = this.b;
        com.vk.photo.editor.ivm.d dVar = n3gVar.b;
        if (dVar == null) {
            dVar = null;
        }
        bc0 i = n3g.i(dVar);
        if (i != null) {
            com.vk.photo.editor.ivm.d dVar2 = n3gVar.b;
            (dVar2 != null ? dVar2 : null).a(new EditorMessage.i(w1g.a(i, null, null, null, Float.valueOf(f), null, null, null, 239), EditorMessage.Source.UserInput, 4));
        }
        this.c.g.setText(String.valueOf(an10.b(f)));
    }

    @Override // xsna.lb80
    public final void g() {
    }
}
