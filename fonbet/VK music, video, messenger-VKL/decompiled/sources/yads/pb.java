package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import xsna.izs;
import xsna.mna;

/* loaded from: classes10.dex */
public final class pb extends ea0 {
    public final izs a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public pb(zl3 zl3Var, View view) {
        super(view);
        this.a = zl3Var;
        this.b = (TextView) view.findViewById(R$id.item_name);
        this.c = (TextView) view.findViewById(R$id.item_ad_unit_format);
        this.d = (TextView) view.findViewById(R$id.item_ad_unit_id);
    }

    @Override // yads.ea0
    public final void a(r90 r90Var) {
        this.b.setText(r90Var.a);
        this.c.setText(r90Var.b);
        this.d.setText(r90Var.c);
        this.itemView.setOnClickListener(new mna(4, this, r90Var));
    }

    public static final void a(pb pbVar, r90 r90Var, View view) {
        pbVar.a.invoke(r90Var.c);
    }
}
