package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.common.data.ApiApplication;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: AvailableGamesGameHolder.kt */
/* loaded from: classes17.dex */
public final class ip5 extends hf6<gp5> {
    public final VKImageView m;
    public final TextView n;

    public ip5(View view, nfj nfjVar) {
        super(view);
        VKImageView vKImageView = (VKImageView) bwt0.p(this.itemView, R.id.game_icon, null, null, 6);
        this.m = vKImageView;
        this.n = (TextView) bwt0.p(this.itemView, R.id.game_title, null, null, 6);
        vKImageView.setAspectRatio(1.0f);
        bwt0.i0(this.itemView, new o9(4, nfjVar, this));
    }

    @Override // xsna.hf6
    public final void W5(gp5 gp5Var) {
        ApiApplication apiApplication = gp5Var.a;
        this.m.load(apiApplication.d.Fb(iah0.a(94), false).d.d);
        this.n.setText(apiApplication.c);
    }
}
