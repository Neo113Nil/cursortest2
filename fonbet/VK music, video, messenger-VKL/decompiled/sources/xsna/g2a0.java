package xsna;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$id;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2a0 implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        FrameLayout frameLayout;
        int i = h2a0.j1;
        com.google.android.material.bottomsheet.b bVar = dialogInterface instanceof com.google.android.material.bottomsheet.b ? (com.google.android.material.bottomsheet.b) dialogInterface : null;
        if (bVar == null || (frameLayout = (FrameLayout) bVar.findViewById(R$id.design_bottom_sheet)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar != null) {
            float f = 16;
            ((ViewGroup.MarginLayoutParams) fVar).leftMargin = iah0.a(f);
            ((ViewGroup.MarginLayoutParams) fVar).rightMargin = iah0.a(f);
            frameLayout.setLayoutParams(fVar);
        }
        frameLayout.setBackgroundColor(0);
    }
}
