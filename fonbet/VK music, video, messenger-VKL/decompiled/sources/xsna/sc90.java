package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PagerTargetSnapHelper.kt */
/* loaded from: classes17.dex */
public final class sc90 extends androidx.recyclerview.widget.g0 implements e4o0 {
    public final ArrayList a = new ArrayList();
    public final sc90 b = this;

    @Override // xsna.e4o0
    public final void a() {
        this.a.clear();
    }

    @Override // xsna.e4o0
    public final androidx.recyclerview.widget.o0 b() {
        return this.b;
    }

    @Override // xsna.e4o0
    public final void c(izs<? super Integer, s3q0> izsVar) {
        this.a.add(izsVar);
    }

    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        View findSnapView = super.findSnapView(oVar);
        if (findSnapView == null) {
            return null;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(Integer.valueOf(oVar.getPosition(findSnapView)));
        }
        return findSnapView;
    }

    @Override // androidx.recyclerview.widget.g0, androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        int findTargetSnapPosition = super.findTargetSnapPosition(oVar, i, i2);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((izs) it.next()).invoke(Integer.valueOf(findTargetSnapPosition));
        }
        return findTargetSnapPosition;
    }
}
