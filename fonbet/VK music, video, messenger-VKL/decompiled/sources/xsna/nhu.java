package xsna;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.vk.voip.ui.groupcalls.grid.dots.GridPaginationDotsView;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.qhu;

/* compiled from: GroupCallGridViewPager.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class nhu extends FunctionReferenceImpl implements izs<qhu.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(qhu.a aVar) {
        int i;
        int b;
        qhu.a aVar2 = aVar;
        com.vk.voip.ui.groupcalls.grid.a aVar3 = (com.vk.voip.ui.groupcalls.grid.a) this.receiver;
        GridPaginationDotsView gridPaginationDotsView = aVar3.z;
        ViewGroup.LayoutParams layoutParams = gridPaginationDotsView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = aVar2.a;
        int i3 = aVar2.b;
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i3;
        gridPaginationDotsView.setLayoutParams(marginLayoutParams);
        Guideline guideline = aVar3.I;
        ViewGroup.LayoutParams layoutParams2 = guideline.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams2;
        if (aVar3.v.getItemCount() > 1) {
            i = com.vk.voip.ui.groupcalls.grid.a.P;
            b = cn70.b(8);
        } else {
            i = com.vk.voip.ui.groupcalls.grid.a.N;
            b = cn70.b(8);
        }
        bVar.b = i3 + b + i;
        guideline.setLayoutParams(bVar);
        return s3q0.a;
    }
}
