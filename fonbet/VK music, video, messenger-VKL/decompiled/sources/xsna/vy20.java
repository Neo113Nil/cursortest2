package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.qy20;

/* compiled from: ModalCardTopImpl.kt */
/* loaded from: classes17.dex */
public final class vy20 extends qy20.c {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public vy20(lg90 lg90Var, long j, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.qy20
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        aVar.K(1210202135);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1210202135, i, -1, "com.vk.core.compose.component.modal.card.ModalCardIconImpl.Content (ModalCardTopImpl.kt:33)");
        }
        pzu0.b((lg90) ((zak0) this.a).getValue(), null, com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue()), ((l5g) ((zak0) this.b).getValue()).a, aVar, 56, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
