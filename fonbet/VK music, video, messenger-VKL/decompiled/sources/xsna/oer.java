package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.features.filter.d;
import com.vkontakte.android.R;

/* compiled from: FilterViewHolder.kt */
/* loaded from: classes4.dex */
public final class oer extends RecyclerView.e0 {
    public final boolean l;
    public final d.b m;
    public final View n;
    public final ImageView o;
    public final TextView p;
    public final View q;
    public final View r;

    public oer(View view, boolean z, d.b bVar) {
        super(view);
        this.l = z;
        this.m = bVar;
        this.n = view.findViewById(R.id.selected_stroke_view);
        ImageView imageView = (ImageView) view.findViewById(R.id.image_filter_preview);
        imageView.setClipToOutline(true);
        this.o = imageView;
        this.p = (TextView) view.findViewById(R.id.text_filter_preview);
        this.q = view.findViewById(R.id.ic_arrow_left);
        this.r = view.findViewById(R.id.category_icon);
        view.setOnClickListener(new mo3(this, 6));
    }
}
