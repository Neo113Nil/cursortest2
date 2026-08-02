package defpackage;

import android.view.View;
import android.webkit.WebView;
import com.yandex.go.platform.ui.components.errordialog.LoadErrorDialog;

/* loaded from: classes13.dex */
public final class bkf0 implements ci41 {
    public final w040 a;
    public final WebView b;
    public x3 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [akf0, android.view.View$OnClickListener] */
    /* JADX WARN: Type inference failed for: r0v4, types: [akf0, android.view.View$OnClickListener] */
    public bkf0(w040 w040Var) {
        this.a = w040Var;
        this.b = (WebView) w040Var.b;
        this.c = new q790(12, w040Var);
        h7o h7oVar = (h7o) w040Var.g;
        final int i = 0;
        ?? r0 = new View.OnClickListener(this) { // from class: akf0
            public final /* synthetic */ bkf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                bkf0 bkf0Var = this.b;
                switch (i2) {
                    case 0:
                        bkf0Var.c = bkf0Var.c.Qg();
                        break;
                    default:
                        bkf0Var.c = bkf0Var.c.Lg();
                        break;
                }
            }
        };
        h7oVar.d = r0;
        LoadErrorDialog loadErrorDialog = h7oVar.b;
        if (loadErrorDialog != 0) {
            loadErrorDialog.setOnActionClickListener(r0);
        }
        final int i2 = 1;
        ?? r02 = new View.OnClickListener(this) { // from class: akf0
            public final /* synthetic */ bkf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                bkf0 bkf0Var = this.b;
                switch (i22) {
                    case 0:
                        bkf0Var.c = bkf0Var.c.Qg();
                        break;
                    default:
                        bkf0Var.c = bkf0Var.c.Lg();
                        break;
                }
            }
        };
        h7oVar.c = r02;
        LoadErrorDialog loadErrorDialog2 = h7oVar.b;
        if (loadErrorDialog2 != 0) {
            loadErrorDialog2.setOnCancelClickListener(r02);
        }
        this.c = this.c.Og();
    }

    @Override // defpackage.ci41
    public final void b(n790 n790Var) {
        this.c = this.c.Mg(n790Var);
    }

    @Override // defpackage.ci41
    public final void onPageFinished(String str) {
        this.c = this.c.Ng(str);
        this.b.evaluateJavascript("(() => true)()", new ymf(str, 1, this));
    }

    @Override // defpackage.ci41
    public final void onPageStarted(String str) {
        this.c = this.c.Pg(str);
    }
}
