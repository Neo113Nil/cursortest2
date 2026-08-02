package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.v3s;

/* compiled from: PageLoadingErrorHolder.kt */
/* loaded from: classes15.dex */
public final class o990 extends vfz<v3s.d> {
    public final pa l;
    public final TextView m;

    public o990(ViewGroup viewGroup, pa paVar) {
        super(R.layout.vk_view_default_list_error_view, viewGroup);
        this.l = paVar;
        this.m = (TextView) this.itemView.findViewById(R.id.error_button);
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(v3s.d dVar) {
        jjc.g(this.m, new fa00(this, 13));
    }
}
