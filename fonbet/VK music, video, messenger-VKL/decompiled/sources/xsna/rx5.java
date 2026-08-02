package xsna;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.mw5;

/* compiled from: BackgroundViewHolder.kt */
/* loaded from: classes2.dex */
public class rx5<T extends mw5> extends RecyclerView.e0 {
    public final a l;
    public mw5 m;
    public final ImageView n;
    public final occ o;

    /* compiled from: BackgroundViewHolder.kt */
    public interface a {
        void a(mw5 mw5Var);
    }

    public /* synthetic */ rx5(View view, a aVar) {
        this(view, aVar, R.drawable.bg_chooser_round_corners);
    }

    public void V5(T t) {
        this.m = t;
    }

    public rx5(View view, a aVar, int i) {
        super(view);
        this.l = aVar;
        this.n = (ImageView) view.findViewById(R.id.vkim_icon_check_view);
        this.o = new occ(enj.c(R.drawable.vk_icon_check_circle_shadow_36, -1, this.itemView.getContext()), e3m.a(R.dimen.theme_chooser_borders_width, this.itemView.getContext()), e3m.f(R.attr.vk_legacy_image_border, this.itemView.getContext()), iah0.a(6));
        this.itemView.setBackgroundResource(i);
        bwt0.i0(this.itemView, new m7(this, 8));
    }
}
