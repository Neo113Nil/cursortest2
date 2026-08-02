package xsna;

import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.qy20;

/* compiled from: ModalCardTopImpl.kt */
/* loaded from: classes17.dex */
public final class yy20 extends qy20.e {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public yy20(phw phwVar, float f) {
        this.a = androidx.compose.runtime.k.b(phwVar);
        this.b = cq.f(f);
    }

    @Override // xsna.qy20
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(473445624);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(473445624, i, -1, "com.vk.core.compose.component.modal.card.ModalCardPictureImpl.Content (ModalCardTopImpl.kt:80)");
        }
        gdv0.c((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.b).getValue()).b, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue()), PictureRadius.Medium, null, null, null, aVar, 3072, 112);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
