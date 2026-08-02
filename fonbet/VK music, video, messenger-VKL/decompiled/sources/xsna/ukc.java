package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: ClickableTitleHolder.kt */
/* loaded from: classes15.dex */
public final class ukc extends RecyclerView.e0 {
    public final TextView l;
    public final ImageView m;
    public vkc n;

    public ukc(ViewGroup viewGroup) {
        super(tf3.b(viewGroup, R.layout.story_clickable_title_holder, viewGroup, false));
        this.l = (TextView) this.itemView.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.icon);
        this.m = imageView;
        this.itemView.setOnClickListener(new tkc(this, 0));
        imageView.setOnClickListener(new hn2(this, 1));
    }
}
