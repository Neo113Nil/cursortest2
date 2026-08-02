package xsna;

import android.view.View;
import xsna.vdg;

/* compiled from: ClipsNegativeRepliesBannerViewHolder.kt */
/* loaded from: classes4.dex */
public final class ome extends aa implements View.OnClickListener {
    public ud60 o;
    public vdg.a p;

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void i6(iag iagVar) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        ud60 ud60Var = this.o;
        if (ud60Var != null) {
            ud60Var.w9();
        }
        vdg.a aVar = this.p;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // xsna.aa
    public final void s6() {
    }
}
