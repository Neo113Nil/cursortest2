package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: HelpButtonViewHolder.kt */
/* loaded from: classes3.dex */
public final class y1v extends RecyclerView.e0 {
    public final TextView l;

    public y1v(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_auth_method_selector_help_item, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.method_selector_help_button);
    }
}
