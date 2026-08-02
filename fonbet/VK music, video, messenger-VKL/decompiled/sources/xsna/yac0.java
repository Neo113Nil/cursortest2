package xsna;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PosterScrolledListener.kt */
/* loaded from: classes4.dex */
public final class yac0 extends jb80 {
    public final ArrayList<WeakReference<gac0>> b;

    public yac0(ArrayList<WeakReference<gac0>> arrayList) {
        this.b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        gac0 gac0Var;
        ArrayList<WeakReference<gac0>> arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WeakReference weakReference = (WeakReference) j5g.b0(i3, arrayList);
            if (weakReference != null && (gac0Var = (gac0) weakReference.get()) != null) {
                jac0 jac0Var = gac0Var.D;
                ViewParent parent = gac0Var.itemView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int height = gac0Var.itemView.getHeight() + (viewGroup != null ? viewGroup.getHeight() : 0);
                if (height != 0) {
                    float y = (((gac0Var.itemView.getY() + gac0Var.itemView.getHeight()) / height) * 2.0f) - 1.0f;
                    if (-0.6714286f <= y && y <= 0.4714286f) {
                        jac0Var.b.a(jac0Var.getParallaxTranslationX(), jac0Var.getParallaxTranslationY() - ((y - gac0Var.F) * 1.75f));
                    }
                    gac0Var.F = y;
                }
            }
        }
    }
}
