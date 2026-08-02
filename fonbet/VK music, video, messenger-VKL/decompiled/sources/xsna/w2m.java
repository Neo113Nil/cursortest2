package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;

/* compiled from: DescriptionWithActionsHolder.kt */
/* loaded from: classes4.dex */
public abstract class w2m<T extends NewsEntry> extends qi6<T> implements View.OnClickListener {
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;

    public w2m(ViewGroup viewGroup) {
        super(R.layout.news_description, viewGroup);
        this.C = (TextView) this.itemView.findViewById(R.id.title);
        this.D = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.E = (TextView) this.itemView.findViewById(R.id.body);
        this.F = (TextView) hvt0.b(this.itemView, R.id.first_button, this);
        this.G = (TextView) hvt0.b(this.itemView, R.id.second_button, this);
        this.itemView.setOnClickListener(this);
    }
}
