package xsna;

import android.view.View;
import xsna.osp;

/* compiled from: EpisodeBottomSheet.kt */
/* loaded from: classes2.dex */
public final class msp extends p6s0 {
    public final /* synthetic */ osp.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msp(osp.a aVar, l6s0[] l6s0VarArr) {
        super(l6s0VarArr);
        this.b = aVar;
    }

    @Override // xsna.p6s0, xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void a(View view, float f) {
        if (this.b.f) {
            return;
        }
        super.a(view, f);
    }

    @Override // xsna.p6s0, xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        if (this.b.f) {
            return;
        }
        super.b(i, view);
    }
}
