package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: AspectRatioViewHolder.kt */
/* loaded from: classes16.dex */
public final class uu3 extends RecyclerView.e0 {
    public final ug8 l;
    public final VkImageSimple m;
    public final VkText n;
    public qu3 o;

    public uu3(ViewGroup viewGroup, ug8 ug8Var) {
        super(viewGroup);
        this.l = ug8Var;
        this.m = (VkImageSimple) this.itemView.findViewById(R.id.format_action_btn);
        this.n = (VkText) this.itemView.findViewById(R.id.format_action_text);
        viewGroup.setOnClickListener(new a50(this, 1));
    }
}
