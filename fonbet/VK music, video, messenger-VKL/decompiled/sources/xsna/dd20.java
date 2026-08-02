package xsna;

import android.view.View;
import android.widget.Button;
import xsna.jgz0;
import xsna.kkz0;
import xsna.ydz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class dd20 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dd20(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        kkz0.a aVar;
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                brj0 brj0Var = (brj0) this.d;
                if (izsVar != null) {
                    izsVar.invoke(brj0Var);
                    break;
                }
                break;
            default:
                lly0 lly0Var = (lly0) this.c;
                ydz0.a aVar2 = (ydz0.a) this.d;
                Button button = lly0Var.i;
                int i = 1;
                int i2 = view == button ? 2 : 1;
                kdy0 kdy0Var = lly0Var.c;
                if (view == button) {
                    i = 64;
                } else if (view != kdy0Var.getLeftText()) {
                    i = view == kdy0Var.getRightBorderedView() ? 128 : view == lly0Var.j ? 4 : view == lly0Var.b ? 2 : view == lly0Var.f ? 16 : view == lly0Var.g ? 32 : view == lly0Var.h ? 512 : 2048;
                }
                viy0 viy0Var = new viy0(i, lly0Var.p);
                ydz0 ydz0Var = (ydz0) ((bj50) aVar2).c;
                if (view.isEnabled() && (aVar = ydz0Var.t) != null) {
                    ((jgz0.b) aVar).a(i2, viy0Var);
                    break;
                }
                break;
        }
    }
}
