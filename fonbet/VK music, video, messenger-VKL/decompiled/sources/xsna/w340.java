package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: MultiAccountTextViewHolder.kt */
/* loaded from: classes6.dex */
public final class w340 extends RecyclerView.e0 {
    public final TextView l;

    public w340(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.vk_auth_multiaccount_info_item, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.info_item);
    }
}
