package xsna;

import android.view.View;
import android.view.ViewGroup;
import xsna.xnt0;

/* compiled from: InteractiveMiniPlayerController.kt */
/* loaded from: classes7.dex */
public final class jbx extends xnt0.a {
    public qcx a;
    public final /* synthetic */ ibx b;

    public jbx(ibx ibxVar) {
        this.b = ibxVar;
    }

    @Override // xsna.xnt0.a
    public final void d(View view, float f) {
        if (this.a == null) {
            ibx ibxVar = this.b;
            ViewGroup viewGroup = (ViewGroup) ibxVar.e().getView();
            tn10 q3 = ibxVar.e().q3();
            this.a = new qcx(viewGroup, view, e43.m(q3 != null ? q3.b() : null));
        }
        qcx qcxVar = this.a;
        if (qcxVar != null) {
            qcxVar.d(view, f);
        }
    }

    @Override // xsna.xnt0.a, com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
    public final void b(int i, View view) {
    }
}
