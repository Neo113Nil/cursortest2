package xsna;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VmojiCharacterView.kt */
/* loaded from: classes7.dex */
public final class c8w0 extends RecyclerView.t {
    public final /* synthetic */ GridLayoutManager b;
    public final /* synthetic */ e8w0 c;
    public final /* synthetic */ int d;

    public c8w0(GridLayoutManager gridLayoutManager, e8w0 e8w0Var, int i) {
        this.b = gridLayoutManager;
        this.c = e8w0Var;
        this.d = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        View findViewByPosition = this.b.findViewByPosition(0);
        int i3 = this.d;
        e8w0 e8w0Var = this.c;
        if (findViewByPosition == null) {
            e8w0Var.j.setVisibility(0);
            e8w0Var.j.setAlpha(1.0f);
            e8w0Var.f.setBackgroundColor(i3);
            return;
        }
        int b = cn70.b(48);
        int b2 = cn70.b(4);
        float y = (findViewByPosition.getY() + findViewByPosition.getHeight()) - b;
        if (y <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            e8w0Var.j.setVisibility(0);
            e8w0Var.j.setAlpha(1.0f);
            e8w0Var.f.setBackgroundColor(i3);
            return;
        }
        float f = b2;
        if (y >= f) {
            e8w0Var.j.setVisibility(4);
            e8w0Var.f.setBackground(null);
        } else {
            float f2 = 1 - (y / f);
            e8w0Var.j.setVisibility(0);
            e8w0Var.j.setAlpha(f2);
            e8w0Var.f.setBackgroundColor(n8g.l(i3, (int) (f2 * 255.0f)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
    }
}
