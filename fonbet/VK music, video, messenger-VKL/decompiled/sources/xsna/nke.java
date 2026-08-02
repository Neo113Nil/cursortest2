package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;

/* compiled from: ClipsListHashtagViewControllerImpl.kt */
/* loaded from: classes16.dex */
public final class nke extends VkBottomSheetBehavior.a {
    public Drawable a;
    public final /* synthetic */ oke b;

    public nke(oke okeVar) {
        this.b = okeVar;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior.a
    public final void j(int i, View view) {
        Drawable drawable = this.a;
        oke okeVar = this.b;
        if (drawable == null) {
            View view2 = okeVar.e;
            drawable = view2 != null ? view2.getBackground() : null;
        }
        this.a = drawable;
        if (i != 3) {
            View view3 = okeVar.e;
            if (view3 != null) {
                view3.setBackground(drawable);
                return;
            }
            return;
        }
        View view4 = okeVar.e;
        if (view4 != null) {
            RecyclerView recyclerView = okeVar.c;
            view4.setBackground(((ViewGroup) (recyclerView != null ? recyclerView.getParent() : null)).getBackground());
        }
    }
}
