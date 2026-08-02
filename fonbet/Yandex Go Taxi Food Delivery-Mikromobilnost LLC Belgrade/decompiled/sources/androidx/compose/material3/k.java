package androidx.compose.material3;

import defpackage.je4;
import defpackage.mx60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes10.dex */
public final class k extends mx60 {
    public final tse d;
    public final androidx.compose.animation.core.a e;
    public final j f;

    public k(boolean z, tse tseVar, androidx.compose.animation.core.a aVar, j jVar) {
        super(z);
        this.d = tseVar;
        this.e = aVar;
        this.f = jVar;
    }

    @Override // defpackage.mx60
    public final void c() {
        tje.N(this.d, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1(this, null), 3);
    }

    @Override // defpackage.mx60
    public final void d() {
        this.f.invoke();
    }

    @Override // defpackage.mx60
    public final void e(je4 je4Var) {
        tje.N(this.d, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1(this, je4Var, null), 3);
    }

    @Override // defpackage.mx60
    public final void f(je4 je4Var) {
        tje.N(this.d, null, null, new ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1(this, je4Var, null), 3);
    }
}
