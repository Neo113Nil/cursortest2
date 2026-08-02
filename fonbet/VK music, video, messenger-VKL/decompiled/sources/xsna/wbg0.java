package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: RestoreAccessViewHolder.kt */
/* loaded from: classes3.dex */
public final class wbg0 extends RecyclerView.e0 {
    public final TextView l;

    public wbg0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_auth_method_selector_restore_item, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.method_selector_restore_button);
    }
}
