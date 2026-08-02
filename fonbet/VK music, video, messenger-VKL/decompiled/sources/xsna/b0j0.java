package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: SettingTitleViewHolder.kt */
/* loaded from: classes18.dex */
public final class b0j0 extends j0n0<a0j0> {
    public final TextView n;

    public b0j0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.settings_title_item, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        this.n.setText(((a0j0) obj).c);
    }
}
