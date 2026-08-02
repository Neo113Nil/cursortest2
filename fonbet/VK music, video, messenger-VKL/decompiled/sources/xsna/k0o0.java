package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: TagHolder.kt */
@ozl
/* loaded from: classes4.dex */
public final class k0o0 extends vif0<String> {
    public final TextView n;

    public k0o0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.discover_media_item_tag, 0);
        TextView textView = (TextView) this.itemView.findViewById(R.id.discover_media_item_tag_text);
        this.n = textView;
        textView.setBackground(new qog0(cn70.a() * 6.0f, this.itemView.getContext().getColor(R.color.vk_black_alpha35)));
    }

    @Override // xsna.vif0
    public final void i6(String str) {
        xo9.A(this.n, str);
    }
}
