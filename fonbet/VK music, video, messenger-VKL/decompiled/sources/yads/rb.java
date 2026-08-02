package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class rb extends ea0 {
    public final gzs a;
    public final TextView b;

    public rb(View view, yl3 yl3Var) {
        super(view);
        this.a = yl3Var;
        this.b = (TextView) view.findViewById(R$id.item_text);
    }

    public final void a() {
        this.b.setText(this.itemView.getContext().getString(R$string.debug_panel_ad_units));
        this.b.setOnClickListener(new xsna.bg0(this, 16));
    }

    @Override // yads.ea0
    public final /* bridge */ /* synthetic */ void a(ba0 ba0Var) {
        a();
    }

    public static final void a(rb rbVar, View view) {
        rbVar.a.invoke();
    }
}
