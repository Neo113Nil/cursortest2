package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: VmojiCharacterPageLoadingErrorViewHolder.kt */
/* loaded from: classes7.dex */
public final class k7w0 extends u6w0<n990> {
    public final gzs<s3q0> l;
    public final TextView m;

    public k7w0(ViewGroup viewGroup, gzs<s3q0> gzsVar) {
        super(R.layout.vk_view_default_list_error_view, viewGroup);
        this.l = gzsVar;
        this.m = (TextView) this.itemView.findViewById(R.id.error_button);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        bwt0.i0(this.m, new ykt0(this, 6));
    }
}
