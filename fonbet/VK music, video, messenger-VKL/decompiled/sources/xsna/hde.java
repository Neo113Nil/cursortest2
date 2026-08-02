package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipsGridHeaderTextHolder.kt */
/* loaded from: classes17.dex */
public final class hde extends RecyclerView.e0 {
    public final VkText l;

    public hde(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.clip_grid_header_text, viewGroup, false));
        this.l = (VkText) this.itemView.findViewById(R.id.clip_grid_header_text);
    }
}
