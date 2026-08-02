package defpackage;

import android.view.View;
import com.yandex.go.platform.ui.components.SpinnerProgressView;

/* loaded from: classes13.dex */
public final class p790 extends x3 {
    @Override // defpackage.x3
    public final x3 Pg(String str) {
        String l = mt71.l(str);
        w040 w040Var = (w040) this.b;
        boolean equals = l.equals(((ss2) w040Var.f).c);
        ujf0 ujf0Var = (ujf0) w040Var.c;
        if (ujf0Var instanceof rjf0) {
            if (equals) {
                oj91.a(((rjf0) ujf0Var).a, 0L);
            } else {
                SpinnerProgressView spinnerProgressView = ((rjf0) ujf0Var).b;
                oj91.a(spinnerProgressView, 0L);
                if (!equals) {
                    View spinner = spinnerProgressView.getSpinner();
                    spinner.setAlpha(0.0f);
                    oj91.a(spinner, 300L);
                }
            }
        } else if (ujf0Var instanceof tjf0) {
            SpinnerProgressView spinnerProgressView2 = ((tjf0) ujf0Var).a;
            oj91.a(spinnerProgressView2, 0L);
            if (!equals) {
                View spinner2 = spinnerProgressView2.getSpinner();
                spinner2.setAlpha(0.0f);
                oj91.a(spinner2, 300L);
            }
        }
        return new r790(w040Var, false);
    }
}
