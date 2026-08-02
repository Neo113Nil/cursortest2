package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kor implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kor(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        izs<? super Integer, s3q0> izsVar;
        int[] calculateDistanceToFinalSnap;
        int i;
        switch (this.b) {
            case 0:
                ror rorVar = (ror) this.d;
                rorVar.requestLayout();
                rorVar.invalidate();
                if (!rorVar.h && (izsVar = rorVar.e) != null) {
                    izsVar.invoke(Integer.valueOf(this.c));
                }
                break;
            case 1:
                ((izs) this.d).invoke(new sx40.n.e(this.c));
                break;
            case 2:
                nib0 nib0Var = (nib0) this.d;
                LinearLayoutManager linearLayoutManager = nib0Var.s;
                RecyclerView recyclerView = nib0Var.c;
                View findViewByPosition = linearLayoutManager.findViewByPosition(this.c);
                if (findViewByPosition != null && ((i = (calculateDistanceToFinalSnap = nib0Var.d.calculateDistanceToFinalSnap(linearLayoutManager, findViewByPosition))[0]) != 0 || calculateDistanceToFinalSnap[1] != 0)) {
                    recyclerView.scrollBy(i, calculateDistanceToFinalSnap[1]);
                }
                recyclerView.addOnScrollListener(nib0Var.t);
                break;
            default:
                lko0 lko0Var = ((ikc0) this.d).z;
                if (lko0Var == null) {
                    lko0Var = null;
                }
                kko0 kko0Var = lko0Var.c;
                kko0Var.w();
                kko0Var.q2(this.c);
                break;
        }
        return s3q0.a;
    }
}
