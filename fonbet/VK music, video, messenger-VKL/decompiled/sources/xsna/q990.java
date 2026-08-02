package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PageLoadingErrorHolder.kt */
/* loaded from: classes15.dex */
public final class q990 extends vfz<cns> {
    public final iw3 l;
    public final TextView m;

    public q990(ViewGroup viewGroup, iw3 iw3Var) {
        super(R.layout.vk_view_default_list_error_view, viewGroup);
        this.l = iw3Var;
        this.m = (TextView) this.itemView.findViewById(R.id.error_button);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(cns cnsVar) {
        jjc.g(this.m, new h440(this, 6));
    }
}
