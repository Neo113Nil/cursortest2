package defpackage;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.R$string;
import kotlin.jvm.internal.Lambda;
import yads.oi3;
import yads.qi3;
import yads.ti3;

/* loaded from: classes7.dex */
public final class q271 extends p971 {
    public final /* synthetic */ int N = 1;
    public final Lambda O;
    public final TextView P;

    public q271(View view, oi3 oi3Var) {
        super(view);
        this.O = oi3Var;
        this.P = (TextView) view.findViewById(R$id.item_button);
    }

    @Override // defpackage.p971
    public final void W(zz61 zz61Var) {
        int i = this.N;
        TextView textView = this.P;
        switch (i) {
            case 0:
                ap61 ap61Var = (ap61) zz61Var;
                Switch r1 = (Switch) textView;
                r1.setOnCheckedChangeListener(null);
                ap61Var.getClass();
                r1.setText("Debug Error Indicator");
                r1.setChecked(ap61Var.a);
                r1.setOnCheckedChangeListener(new hab0(1, this, ap61Var));
                break;
            case 1:
                ho81 ho81Var = (ho81) zz61Var;
                ho81Var.getClass();
                textView.setText("Enable Test mode");
                textView.setOnClickListener(new y7z0(19, this, ho81Var));
                break;
            default:
                textView.setText(this.a.getContext().getString(R$string.debug_panel_ad_units));
                textView.setOnClickListener(new aq41(6, this));
                break;
        }
    }

    public q271(View view, qi3 qi3Var) {
        super(view);
        this.O = qi3Var;
        this.P = (Switch) view.findViewById(R$id.item_switch);
    }

    public q271(View view, ti3 ti3Var) {
        super(view);
        this.O = ti3Var;
        this.P = (TextView) view.findViewById(R$id.item_text);
    }
}
