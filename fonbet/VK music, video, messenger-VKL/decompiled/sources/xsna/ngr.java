package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: FiltersViewHolder.kt */
/* loaded from: classes16.dex */
public final class ngr extends RecyclerView.e0 {
    public final TextView l;
    public final ImageView m;
    public final ImageView n;

    public ngr(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.actions_popup_item, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.action_text);
        this.m = (ImageView) this.itemView.findViewById(R.id.action_icon);
        View findViewById = this.itemView.findViewById(R.id.action_check_icon);
        ((ImageView) findViewById).setImageResource(R.drawable.ic_check_fill_accent_24);
        this.n = (ImageView) findViewById;
    }
}
