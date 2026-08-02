package yads;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R$id;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* loaded from: classes10.dex */
public final class vm2 implements zf0 {
    public final y00 a;
    public final wm2 b;
    public final hz1 c;
    public final c02 d;

    public vm2(y00 y00Var, wm2 wm2Var, hz1 hz1Var, c02 c02Var) {
        this.a = y00Var;
        this.b = wm2Var;
        this.c = hz1Var;
        this.d = c02Var;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        String valueOf;
        this.d.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R$id.rating_container);
        Float f = this.a.k;
        if (f == null) {
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
                return;
            }
            return;
        }
        this.c.getClass();
        TextView textView = (TextView) viewGroup.findViewById(R$id.rating_text);
        if (textView != null) {
            wm2 wm2Var = this.b;
            float floatValue = f.floatValue();
            wm2Var.getClass();
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                valueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(floatValue);
            } catch (RuntimeException unused) {
                valueOf = String.valueOf(floatValue);
            }
            textView.setText(valueOf);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
