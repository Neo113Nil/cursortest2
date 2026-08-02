package xsna;

import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;

/* compiled from: PostingWithAuthorBottomSheetMvi.kt */
/* loaded from: classes4.dex */
public final class mqc0 extends ModalBottomSheetBehavior.d {
    public final /* synthetic */ lqc0 a;

    public mqc0(lqc0 lqc0Var) {
        this.a = lqc0Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        utk0 utk0Var = this.a.o1;
        Boolean valueOf = Boolean.valueOf(i == 3);
        utk0Var.getClass();
        utk0Var.i(null, valueOf);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
    }
}
