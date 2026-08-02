package yads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import xsna.drm0;
import xsna.h2h;
import xsna.hmm;
import xsna.izs;

/* loaded from: classes10.dex */
public final class ns1 extends ea0 {
    public final z70 a;
    public final izs b;
    public final izs c;
    public et d;
    public final LinearLayout e;
    public final ImageView f;
    public final TextView g;
    public final ImageView h;
    public final TextView i;
    public final TextView j;
    public final ImageView k;

    public ns1(View view, z70 z70Var, wl3 wl3Var, xl3 xl3Var) {
        super(view);
        this.a = z70Var;
        this.b = wl3Var;
        this.c = xl3Var;
        this.e = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.f = (ImageView) view.findViewById(R$id.item_logo);
        this.g = (TextView) view.findViewById(R$id.item_name);
        this.h = (ImageView) view.findViewById(R$id.navigation_icon);
        this.i = (TextView) view.findViewById(R$id.item_info_first);
        this.j = (TextView) view.findViewById(R$id.item_info_second);
        this.k = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    public static final void b(ns1 ns1Var, y90 y90Var, View view) {
        ns1Var.b.invoke(y90Var);
    }

    @Override // yads.ea0
    public final void a(y90 y90Var) {
        Context context = this.itemView.getContext();
        this.g.setText(y90Var.a);
        x80 x80Var = y90Var.c;
        if (x80Var != null) {
            this.i.setVisibility(0);
            this.i.setText(x80Var.a);
            this.i.setTextAppearance(context, x80Var.d);
            this.i.setTextColor(ik.a(this.itemView.getContext(), x80Var.b));
            TextView textView = this.i;
            Integer num = x80Var.c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            this.i.setVisibility(8);
        }
        q50 q50Var = y90Var.d;
        this.j.setText(q50Var.a);
        this.j.setTextAppearance(context, q50Var.c);
        this.j.setTextColor(ik.a(this.itemView.getContext(), q50Var.b));
        LinearLayout linearLayout = this.e;
        String str = y90Var.e;
        linearLayout.setClickable(((str == null || drm0.N(str)) && y90Var.g == null) ? false : true);
        String str2 = y90Var.e;
        if (str2 == null || drm0.N(str2)) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
            this.e.setOnClickListener(new h2h(2, this, y90Var));
        }
        this.f.setImageResource(0);
        et etVar = this.d;
        if (etVar != null) {
            etVar.cancel();
        }
        z70 z70Var = this.a;
        String str3 = y90Var.b;
        if (str3 == null) {
            str3 = "";
        }
        this.d = z70Var.a(str3, this.f);
        if (y90Var.g == null) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
            this.e.setOnClickListener(new hmm(this, y90Var, 1));
        }
    }

    public static final void a(ns1 ns1Var, y90 y90Var, View view) {
        ns1Var.c.invoke(y90Var.e);
    }
}
