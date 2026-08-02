package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: PageLoadingErrorHolder.kt */
/* loaded from: classes15.dex */
public final class p990 extends vfz<kks> {
    public final q7 l;
    public final TextView m;

    public p990(ViewGroup viewGroup, q7 q7Var) {
        super(R.layout.vk_view_default_list_error_view, viewGroup);
        this.l = q7Var;
        this.m = (TextView) this.itemView.findViewById(R.id.error_button);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(kks kksVar) {
        jjc.g(this.m, new b810(this, 13));
    }
}
