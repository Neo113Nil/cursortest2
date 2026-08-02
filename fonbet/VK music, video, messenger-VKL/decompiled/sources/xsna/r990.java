package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.aig;

/* compiled from: PageLoadingErrorViewHolder.kt */
/* loaded from: classes7.dex */
public final class r990 extends mj8 {
    public final k59<aig.d> m;
    public final TextView n;

    /* JADX WARN: Multi-variable type inference failed */
    public r990(ViewGroup viewGroup, k59<? super aig.d> k59Var) {
        super(viewGroup, R.layout.vk_view_default_list_error_view, 1);
        this.m = k59Var;
        this.n = (TextView) this.itemView.findViewById(R.id.error_button);
    }

    @Override // xsna.mj8, xsna.vfz
    /* renamed from: W5 */
    public final void h6(hfz hfzVar) {
        bwt0.i0(this.n, new ux40(this, 9));
    }

    @Override // xsna.mj8
    public final void i6(l59 l59Var) {
        bwt0.i0(this.n, new ux40(this, 9));
    }
}
