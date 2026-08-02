package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import yads.ri3;
import yads.si3;

/* loaded from: classes7.dex */
public final class aq81 extends p971 {
    public final ne81 N;
    public final ri3 O;
    public final si3 P;
    public me81 Q;
    public final LinearLayout R;
    public final ImageView S;
    public final TextView T;
    public final ImageView U;
    public final TextView V;
    public final TextView W;
    public final ImageView Z;

    public aq81(View view, ne81 ne81Var, ri3 ri3Var, si3 si3Var) {
        super(view);
        this.N = ne81Var;
        this.O = ri3Var;
        this.P = si3Var;
        this.R = (LinearLayout) view.findViewById(R$id.item_mediation_adapter);
        this.S = (ImageView) view.findViewById(R$id.item_logo);
        this.T = (TextView) view.findViewById(R$id.item_name);
        this.U = (ImageView) view.findViewById(R$id.navigation_icon);
        this.V = (TextView) view.findViewById(R$id.item_info_first);
        this.W = (TextView) view.findViewById(R$id.item_info_second);
        this.Z = (ImageView) view.findViewById(R$id.item_warning_button);
    }

    @Override // defpackage.p971
    public final void W(zz61 zz61Var) {
        final fh61 fh61Var = (fh61) zz61Var;
        View view = this.a;
        Context context = view.getContext();
        String str = fh61Var.a;
        String str2 = fh61Var.g;
        String str3 = fh61Var.e;
        this.T.setText(str);
        fx81 fx81Var = fh61Var.c;
        final int i = 0;
        TextView textView = this.V;
        if (fx81Var != null) {
            textView.setVisibility(0);
            textView.setText(fx81Var.a);
            textView.setTextAppearance(context, fx81Var.d);
            textView.setTextColor(zba1.a(fx81Var.b, view.getContext()));
            Integer num = fx81Var.c;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
        } else {
            textView.setVisibility(8);
        }
        vl71 vl71Var = fh61Var.d;
        String str4 = vl71Var.a;
        TextView textView2 = this.W;
        textView2.setText(str4);
        textView2.setTextAppearance(context, vl71Var.c);
        textView2.setTextColor(zba1.a(vl71Var.b, view.getContext()));
        final int i2 = 1;
        boolean z = ((str3 == null || evu0.J(str3)) && str2 == null) ? false : true;
        LinearLayout linearLayout = this.R;
        linearLayout.setClickable(z);
        ImageView imageView = this.Z;
        if (str3 == null || evu0.J(str3)) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zp81
                public final /* synthetic */ aq81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i;
                    fh61 fh61Var2 = fh61Var;
                    aq81 aq81Var = this.b;
                    switch (i3) {
                        case 0:
                            aq81Var.P.invoke(fh61Var2.e);
                            break;
                        default:
                            aq81Var.O.invoke(fh61Var2);
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = this.S;
        imageView2.setImageResource(0);
        me81 me81Var = this.Q;
        if (me81Var != null) {
            me81Var.a.a();
        }
        String str5 = fh61Var.b;
        if (str5 == null) {
            str5 = "";
        }
        ne81 ne81Var = this.N;
        me81 me81Var2 = new me81(ne81Var.a.b(str5, new qs71(imageView2, 1), 0, 0));
        ne81Var.b.add(me81Var2);
        this.Q = me81Var2;
        ImageView imageView3 = this.U;
        if (str2 == null) {
            imageView3.setVisibility(8);
        } else {
            imageView3.setVisibility(0);
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zp81
                public final /* synthetic */ aq81 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i2;
                    fh61 fh61Var2 = fh61Var;
                    aq81 aq81Var = this.b;
                    switch (i3) {
                        case 0:
                            aq81Var.P.invoke(fh61Var2.e);
                            break;
                        default:
                            aq81Var.O.invoke(fh61Var2);
                            break;
                    }
                }
            });
        }
    }
}
