package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.component.ads.ClipMarketCardView;

/* compiled from: MarketAdCardViewHolder.kt */
/* loaded from: classes17.dex */
public final class oo00 extends RecyclerView.e0 {
    public final bcr0<ImageView> l;
    public final dg1 m;
    public cle n;

    /* compiled from: MarketAdCardViewHolder.kt */
    public final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            String str;
            oo00 oo00Var = oo00.this;
            cle cleVar = oo00Var.n;
            if (cleVar == null || (str = cleVar.a) == null || !(view instanceof ViewGroup)) {
                return;
            }
            oo00Var.m.a(new uq00((ViewGroup) view, str));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            String str;
            oo00 oo00Var = oo00.this;
            cle cleVar = oo00Var.n;
            if (cleVar == null || (str = cleVar.a) == null) {
                return;
            }
            oo00Var.m.a(new vq00(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo00(bcr0<? extends ImageView> bcr0Var, dg1 dg1Var, ClipMarketCardView.ImageSize imageSize, ViewGroup viewGroup) {
        super(new ClipMarketCardView(viewGroup.getContext(), imageSize));
        this.l = bcr0Var;
        this.m = dg1Var;
        this.itemView.addOnAttachStateChangeListener(new a());
    }
}
