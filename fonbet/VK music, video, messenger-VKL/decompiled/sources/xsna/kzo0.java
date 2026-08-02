package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: TitleHolder.kt */
/* loaded from: classes15.dex */
public final class kzo0 extends RecyclerView.e0 {
    public final TextView l;

    public kzo0(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.story_title_holder, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.tv_title);
    }
}
