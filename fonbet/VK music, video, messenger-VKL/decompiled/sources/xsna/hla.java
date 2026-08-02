package xsna;

import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: CategoryItemViewHolder.kt */
/* loaded from: classes16.dex */
public final class hla extends RecyclerView.e0 {
    public final izs<vka, s3q0> l;
    public final VkText m;
    public final VkText n;
    public final pxo0 o;
    public final fla p;

    public hla(ViewGroup viewGroup, t9 t9Var) {
        super(tf3.b(viewGroup, R.layout.clips_interests_item, viewGroup, false));
        this.l = t9Var;
        VkText vkText = (VkText) this.itemView.findViewById(R.id.interest_icon);
        this.m = vkText;
        VkText vkText2 = (VkText) this.itemView.findViewById(R.id.interest_name);
        this.n = vkText2;
        this.o = new pxo0(600L);
        this.p = new fla(this.itemView, vkText, vkText2);
    }

    public final void V5() {
        Drawable background = this.m.getBackground();
        AnimatedStateListDrawable animatedStateListDrawable = background instanceof AnimatedStateListDrawable ? (AnimatedStateListDrawable) background : null;
        Object current = animatedStateListDrawable != null ? animatedStateListDrawable.getCurrent() : null;
        AnimatedVectorDrawable animatedVectorDrawable = current instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) current : null;
        if (animatedVectorDrawable != null) {
            animatedVectorDrawable.stop();
        }
    }
}
