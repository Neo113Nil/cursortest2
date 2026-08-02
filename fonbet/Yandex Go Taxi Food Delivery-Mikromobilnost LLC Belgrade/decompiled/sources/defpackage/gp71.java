package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes7.dex */
public final class gp71 extends p971 {
    public final TextView N;
    public final TextView O;
    public final TextView P;

    public gp71(View view) {
        super(view);
        this.N = (TextView) view.findViewById(R$id.item_title);
        this.O = (TextView) view.findViewById(R$id.item_subtitle);
        this.P = (TextView) view.findViewById(R$id.item_text);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // defpackage.p971
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(zz61 zz61Var) {
        gx81 gx81Var = (gx81) zz61Var;
        String str = gx81Var.a;
        fx81 fx81Var = gx81Var.b;
        vl71 vl71Var = gx81Var.c;
        Context context = this.a.getContext();
        TextView textView = this.N;
        if (str != null) {
            textView.setVisibility(0);
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
        TextView textView2 = this.O;
        if (fx81Var != null) {
            String str2 = fx81Var.a;
            if (!evu0.J(str2)) {
                textView2.setVisibility(0);
                textView2.setText(str2);
                textView2.setTextColor(zba1.a(fx81Var.b, context));
                Integer num = fx81Var.c;
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, num != null ? num.intValue() : 0, 0);
                TextView textView3 = this.P;
                if (vl71Var != null) {
                    String str3 = vl71Var.a;
                    if (!evu0.J(str3)) {
                        textView3.setVisibility(0);
                        textView3.setText(str3);
                        textView3.setTextColor(zba1.a(vl71Var.b, context));
                        return;
                    }
                }
                textView3.setVisibility(8);
            }
        }
        textView2.setVisibility(8);
        TextView textView32 = this.P;
        if (vl71Var != null) {
        }
        textView32.setVisibility(8);
    }
}
