package xsna;

import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* compiled from: SwapItemsDragCallback.kt */
/* loaded from: classes18.dex */
public final class lln0 extends r.d {
    public final eyl0 e;
    public final z6d f;

    public lln0(eyl0 eyl0Var, z6d z6dVar) {
        this.e = eyl0Var;
        this.f = z6dVar;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void b(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        this.f.d();
        if (e0Var instanceof z21) {
            z21 z21Var = (z21) e0Var;
            qq2.b(z21Var.m, woo.p, 1.0f, 0.75f, 200.0f).j(1.0f);
            qq2.b(z21Var.m, woo.o, 1.0f, 0.75f, 200.0f).j(1.0f);
        }
        super.b(recyclerView, e0Var);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final int f(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
        this.f.a(e0Var.getBindingAdapterPosition());
        return r.d.l(49, 0);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean j() {
        return false;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void m(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f, float f2, int i, boolean z) {
        int width = e0Var.itemView.getWidth();
        ViewGroup.LayoutParams layoutParams = e0Var.itemView.getLayoutParams();
        int marginStart = width + (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
        ViewGroup.LayoutParams layoutParams2 = e0Var.itemView.getLayoutParams();
        int marginEnd = marginStart + (layoutParams2 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd() : 0);
        int bindingAdapterPosition = e0Var.getBindingAdapterPosition() * marginEnd;
        int i2 = bindingAdapterPosition + marginEnd;
        super.m(canvas, recyclerView, e0Var, ((Number) swe0.k(Float.valueOf(f), new awf(-bindingAdapterPosition, (marginEnd * (recyclerView.getAdapter() != null ? r4.getItemCount() : 0)) - i2))).floatValue(), ((Number) swe0.k(Float.valueOf(f2), new awf((e0Var.itemView.getHeight() * 0.100000024f) + (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - recyclerView.getPaddingTop()), (e0Var.itemView.getHeight() * 1.1f) + recyclerView.getHeight()))).floatValue(), i, z);
    }

    @Override // androidx.recyclerview.widget.r.d
    public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
        int bindingAdapterPosition = e0Var.getBindingAdapterPosition();
        int bindingAdapterPosition2 = e0Var2.getBindingAdapterPosition();
        Collections.swap(this.e.y0(), bindingAdapterPosition, bindingAdapterPosition2);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        }
        this.f.c(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void o(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof z21) {
            if (i == 2 || i == 8) {
                z21 z21Var = (z21) e0Var;
                qq2.b(z21Var.m, woo.p, 1.0f, 0.75f, 200.0f).j(1.1f);
                qq2.b(z21Var.m, woo.o, 1.0f, 0.75f, 200.0f).j(1.1f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.r.d
    public final void p(RecyclerView.e0 e0Var) {
    }
}
