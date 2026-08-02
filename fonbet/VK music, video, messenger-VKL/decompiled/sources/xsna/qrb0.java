package xsna;

import android.view.ViewGroup;
import com.vkontakte.android.R;

/* compiled from: PollSelectPhotoViewHolder.kt */
/* loaded from: classes4.dex */
public final class qrb0 extends vif0<s3q0> {
    public final gzs<s3q0> n;

    public qrb0(ViewGroup viewGroup, fa6 fa6Var) {
        super(viewGroup, R.layout.poll_select_photo_view, 0);
        this.n = fa6Var;
        this.itemView.setLayerType(1, null);
    }

    @Override // xsna.vif0
    public final void i6(s3q0 s3q0Var) {
        this.itemView.setOnClickListener(new vg(this, 4));
    }
}
