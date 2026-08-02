package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: MessengerRepostViewHolder.kt */
/* loaded from: classes4.dex */
public final class uh20 extends RecyclerView.e0 {
    public final TextView l;

    public uh20(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.messenger_repost_item, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.messenger_repost_item_text);
    }
}
