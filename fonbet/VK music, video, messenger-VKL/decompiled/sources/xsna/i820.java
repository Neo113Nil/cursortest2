package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.c9w;

/* compiled from: MenuTitleVh.kt */
/* loaded from: classes2.dex */
public final class i820 extends vfz<g820> {
    public final h820 l;
    public final ImageView m;
    public final TextView n;

    public i820(View view, kkm kkmVar, c9w.a aVar) {
        super(view);
        this.l = aVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.vkim_search_btn);
        this.m = imageView;
        TextView textView = (TextView) view.findViewById(R.id.vkim_title);
        this.n = textView;
        bwt0.i0(imageView, new lwh(this, 26));
        kkmVar.d(imageView, R.attr.vk_legacy_accent);
        kkmVar.c(textView, R.attr.vk_legacy_accent);
    }

    @Override // xsna.vfz
    public final void W5(g820 g820Var) {
        g820Var.getClass();
        this.m.setVisibility(0);
        TextView textView = this.n;
        textView.setVisibility(0);
        textView.setText(R.string.vkim_picker_menu_item_place);
    }
}
