package defpackage;

import android.graphics.Typeface;
import android.view.View;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class cuy0 extends wys {
    public static final /* synthetic */ int S = 0;
    public final j1s0 R;

    public cuy0(View view, j1s0 j1s0Var) {
        super(view);
        this.R = j1s0Var;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        Typeface w;
        qry0 qry0Var = (qry0) obj;
        RobotoTextView robotoTextView = (RobotoTextView) this.a;
        robotoTextView.setTextSize(1, qry0Var.c * this.R.a);
        robotoTextView.disableAutoSize();
        robotoTextView.setMaxLines(qry0Var.d);
        robotoTextView.setText(qry0Var.a);
        int i = buy0.b[qry0Var.e.ordinal()];
        if (i == 1) {
            int[] iArr = up11.a;
            w = eja1.w(x8s.b(FormattedText.FontWeight.LIGHT), 0);
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            int[] iArr2 = up11.a;
            w = eja1.w(x8s.b(FormattedText.FontWeight.MEDIUM), 0);
        }
        robotoTextView.setTypeface(w);
        robotoTextView.setTextAlignment(0);
        int i2 = buy0.a[qry0Var.f.ordinal()];
        if (i2 == 1) {
            robotoTextView.setTextColor(new bdc(xng0.textOnControlMinor));
        } else {
            if (i2 == 2) {
                return;
            }
            w511.b();
        }
    }
}
