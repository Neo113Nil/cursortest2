package xsna;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;

/* compiled from: MsgPartChannelPostHeaderHolder.kt */
/* loaded from: classes2.dex */
public final class yo30 extends hr30<AttachWall, zo30> {
    public TextView d;
    public View e;
    public View f;
    public View g;
    public ImageView h;
    public final ShapeDrawable i;
    public Peer j;
    public final v5t k;

    public yo30() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setIntrinsicWidth(iah0.a(8));
        shapeDrawable.getPaint().setColor(0);
        this.i = shapeDrawable;
        this.j = Peer.Unknown.e;
        this.k = new v5t(R.layout.vkim_msg_part_channel_post_author_header);
    }

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(bubbleColors.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    @Override // xsna.hr30
    public final void p(zo30 zo30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        zo30 zo30Var2 = zo30Var;
        this.j = zo30Var2.b;
        boolean z = zo30Var2.d;
        boolean z2 = zo30Var2.e;
        if (z) {
            View view = this.e;
            if (view == null) {
                view = null;
            }
            view.setVisibility(0);
        } else {
            View view2 = this.e;
            if (view2 == null) {
                view2 = null;
            }
            f4m.j(view2);
        }
        View view3 = this.g;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.p0(view3, z2);
        String str = zo30Var2.c;
        Peer peer = this.j;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        if (epx.f(peer, Peer.Unknown.e)) {
            ?? r2 = this.f;
            f4m.j(r2 != 0 ? r2 : null);
            return;
        }
        View view4 = this.f;
        if (view4 == null) {
            view4 = null;
        }
        view4.setVisibility(0);
        TextView textView = this.d;
        (textView != null ? textView : null).setText(str);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View c = this.k.c(layoutInflater, viewGroup);
        this.f = c.findViewById(R.id.author_info);
        this.g = c.findViewById(R.id.donut_info);
        this.h = (ImageView) c.findViewById(R.id.donut_icon);
        this.d = (TextView) c.findViewById(R.id.post_author);
        this.e = c.findViewById(R.id.advertisement_mark);
        ((FlexboxLayout) c.findViewById(R.id.container)).setDividerDrawable(this.i);
        ImageView imageView = this.h;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageResource(R.drawable.vk_icon_donut_color_12);
        return c;
    }
}
