package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.u0x;

/* compiled from: InnerActionItemHolderImpl.kt */
/* loaded from: classes15.dex */
public final class v0x extends u0x {
    public final jba0 m;
    public final ImageView n;
    public final TextView o;

    public v0x(ViewGroup viewGroup, jba0 jba0Var, u0x.a aVar) {
        super(tf3.b(viewGroup, R.layout.picker_inner_action_item, viewGroup, false), aVar);
        this.m = jba0Var;
        this.n = (ImageView) this.itemView.findViewById(R.id.iv_action_image);
        this.o = (TextView) this.itemView.findViewById(R.id.tv_action_text);
    }

    @Override // xsna.u0x
    public final void V5(com.vk.attachpicker.adapter.a aVar) {
        aVar.getClass();
        this.n.setImageResource(R.drawable.vk_icon_camera_outline_48);
        this.o.setText(R.string.picker_inner_action_story_camera);
        bwt0.i0(this.itemView, new td0(20, this, aVar));
    }
}
