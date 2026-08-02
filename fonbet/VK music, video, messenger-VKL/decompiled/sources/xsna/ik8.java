package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.vkontakte.android.R;
import xsna.ji8;

/* compiled from: BroadcastViewHolder.kt */
/* loaded from: classes7.dex */
public final class ik8 extends RecyclerView.e0 {
    public static final /* synthetic */ int u = 0;
    public final SimpleDraweeView l;
    public final View m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final View q;
    public final vj8 r;
    public ji8.a s;
    public r6 t;

    public ik8(View view) {
        super(view);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.image);
        this.l = simpleDraweeView;
        this.m = view.findViewById(R.id.icon_label);
        this.n = (TextView) view.findViewById(R.id.title);
        this.o = (TextView) view.findViewById(R.id.owner);
        this.p = (TextView) view.findViewById(R.id.date);
        this.q = view.findViewById(R.id.selection);
        this.r = new vj8(view.getContext());
        bwt0.i0(view, new h5(this, 12));
        simpleDraweeView.getHierarchy().p(enj.e(R.drawable.vk_icon_video_28, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, view.getContext()), 1);
    }
}
