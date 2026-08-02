package xsna;

import android.view.View;
import xsna.r5;

/* compiled from: AboutVideoBottomSheet.kt */
/* loaded from: classes2.dex */
public final class n5 extends p6s0 {
    public final /* synthetic */ r5.a b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(r5.a aVar, l6s0[] l6s0VarArr) {
        super(l6s0VarArr);
        this.b = aVar;
    }

    @Override // xsna.p6s0, xsna.k6s0, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
        gzs<s3q0> gzsVar;
        super.b(i, view);
        if (i != 5 || (gzsVar = this.b.p) == null) {
            return;
        }
        gzsVar.invoke();
    }
}
