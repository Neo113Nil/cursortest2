package defpackage;

import android.app.Dialog;
import android.content.Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R$style;

/* loaded from: classes7.dex */
public final class ep81 {
    public static boolean d;
    public final op71 a;
    public final i971 b;
    public final qy71 c;

    public ep81() {
        op71 op71Var = new op71();
        i971 i971Var = new i971(12, new gul(1, op71Var));
        qy71 qy71Var = new qy71();
        this.a = op71Var;
        this.b = i971Var;
        this.c = qy71Var;
    }

    public final void a(Div2View div2View) {
        Context context = div2View.getContext();
        int i = R$style.MonetizationAdsInternal_FullscreenDialog;
        this.c.getClass();
        Dialog dialog = new Dialog(context, i);
        op71 op71Var = this.a;
        op71Var.a = dialog;
        dialog.setOnDismissListener(new zf6(6, op71Var));
        dialog.setContentView(div2View);
        dialog.setOnDismissListener(new no81(1));
        yga1.a(dialog);
        d = true;
        dialog.show();
    }
}
