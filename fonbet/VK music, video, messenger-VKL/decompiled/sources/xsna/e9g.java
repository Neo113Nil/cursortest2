package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.theme_chooser.c;
import com.vk.im.ui.components.theme_chooser.coloradapter.ColorView;
import com.vkontakte.android.R;

/* compiled from: ColorViewHolder.kt */
/* loaded from: classes2.dex */
public final class e9g extends RecyclerView.e0 {
    public final a l;
    public final ColorView m;
    public q6g n;

    /* compiled from: ColorViewHolder.kt */
    public interface a {
        void b(q6g q6gVar);
    }

    public e9g(View view, c.a aVar) {
        super(view);
        this.l = aVar;
        this.m = (ColorView) this.itemView.findViewById(R.id.vkim_color_preview);
        view.setOnClickListener(new i1(this, 4));
    }
}
