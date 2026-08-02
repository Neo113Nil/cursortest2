package yads;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import xsna.drm0;

/* loaded from: classes10.dex */
public final class me1 extends ea0 {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public me1(View view) {
        super(view);
        this.a = (TextView) view.findViewById(R$id.item_title);
        this.b = (TextView) view.findViewById(R$id.item_subtitle);
        this.c = (TextView) view.findViewById(R$id.item_text);
    }

    @Override // yads.ea0
    public final void a(ba0 ba0Var) {
        x90 x90Var = (x90) ba0Var;
        String str = x90Var.a;
        x80 x80Var = x90Var.b;
        q50 q50Var = x90Var.c;
        Context context = this.itemView.getContext();
        if (str != null) {
            this.a.setVisibility(0);
            this.a.setText(str);
        } else {
            this.a.setVisibility(8);
        }
        if (x80Var == null || drm0.N(x80Var.a)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(x80Var.a);
            this.b.setTextColor(ik.a(context, x80Var.b));
            Integer num = x80Var.c;
            this.b.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        }
        if (q50Var == null || drm0.N(q50Var.a)) {
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        this.c.setText(q50Var.a);
        this.c.setTextColor(ik.a(context, q50Var.b));
    }
}
