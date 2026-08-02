package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class bfo0 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ ffo0 c;

    public bfo0(ViewGroup viewGroup, ffo0 ffo0Var) {
        this.b = viewGroup;
        this.c = ffo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ffo0 ffo0Var = this.c;
        ViewGroup viewGroup = ffo0Var.k;
        if (viewGroup == null) {
            viewGroup = null;
        }
        RecyclerView recyclerView = ffo0Var.n;
        if (recyclerView == null) {
            recyclerView = null;
        }
        viewGroup.setTranslationX((-recyclerView.getWidth()) + (ffo0Var.q != null ? r0 : null).getWidth());
    }
}
