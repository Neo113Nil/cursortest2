package xsna;

import xsna.y7f;

/* compiled from: ClipsTemplateEditorCropperActionsHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class o6f extends ysi {
    public final y7f.e c;
    public final k8f d;
    public final z8d e;
    public final i8f f;
    public final h6f g;
    public final m8f h;

    public o6f(y7f.e eVar, k8f k8fVar, z8d z8dVar, i8f i8fVar, h6f h6fVar, m8f m8fVar) {
        this.c = eVar;
        this.d = k8fVar;
        this.e = z8dVar;
        this.f = i8fVar;
        this.g = h6fVar;
        this.h = m8fVar;
    }

    public final void j7() {
        z7f B = y7f.this.B();
        if (B == null) {
            return;
        }
        io.reactivex.rxjava3.internal.operators.single.x b = this.d.b(B);
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        this.b.b(b.q(asu0.k()).m(asu0Var.d()).subscribe(new mf1(new com.vk.voip.ui.menu.feature.a(this, 28), 12), new nf1(new ci3(12), 17)));
    }
}
