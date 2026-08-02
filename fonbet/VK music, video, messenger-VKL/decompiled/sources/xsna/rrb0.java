package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vkontakte.android.R;

/* compiled from: PollBackgroundSmallViewHolders.kt */
/* loaded from: classes4.dex */
public final class rrb0 extends bnb0<s3q0> implements View.OnClickListener {
    public final gzs<s3q0> t;

    public rrb0(ViewGroup viewGroup, fa6 fa6Var) {
        super(viewGroup, null);
        this.t = fa6Var;
        bwt0.h0(this, this.itemView);
        bwt0.p0(this.p, false);
        int color = e43.a.getColor(R.color.vk_blue_300);
        this.r.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        this.r.setImageResource(R.drawable.vk_icon_camera_24);
        this.r.setScaleType(ImageView.ScaleType.CENTER);
        t8m0 t8m0Var = (t8m0) this.r.getBackground();
        t8m0Var.e.setColor(color);
        t8m0Var.c(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.t.invoke();
    }

    @Override // xsna.bnb0
    public final String s6(s3q0 s3q0Var) {
        return this.itemView.getContext().getString(R.string.poll_accessibility_choose_background);
    }
}
