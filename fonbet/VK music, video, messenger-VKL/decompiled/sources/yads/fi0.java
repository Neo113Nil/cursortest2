package yads;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.yandex.div.R$style;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;
import xsna.bpn0;
import xsna.epx;
import xsna.m950;

/* loaded from: classes10.dex */
public final class fi0 implements ow {
    public final x12 a;
    public final kz b;
    public final jp2 c;
    public final ni0 d;
    public final xi0 e;
    public Dialog f;

    public fi0(x12 x12Var, kz kzVar, bu1 bu1Var, ni0 ni0Var, xi0 xi0Var) {
        this.a = x12Var;
        this.b = kzVar;
        this.c = bu1Var;
        this.d = ni0Var;
        this.e = xi0Var;
    }

    public final void a(Context context) {
        hi0 hi0Var;
        Object obj;
        try {
            ni0 ni0Var = this.d;
            x12 x12Var = this.a;
            ni0Var.getClass();
            List d = x12Var.d();
            if (d != null) {
                Iterator it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = ((hi0) obj).a;
                    fg0[] fg0VarArr = fg0.b;
                    if (epx.f(str, "close_dialog")) {
                        break;
                    }
                }
                hi0Var = (hi0) obj;
            } else {
                hi0Var = null;
            }
            if (hi0Var == null) {
                this.b.e();
                return;
            }
            bpn0 bpn0Var = new bpn0(new gi0(context, null));
            xi0 xi0Var = this.e;
            DivConfiguration divConfiguration = (DivConfiguration) bpn0Var.getValue();
            xi0Var.getClass();
            AttributeSet attributeSet = null;
            int i = 0;
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, R$style.Div), divConfiguration, 0, null, 4, null), attributeSet, i, 6, null);
            div2View.setTag("");
            Dialog dialog = new Dialog(context, com.yandex.mobile.ads.R$style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new m950(this, 2));
            div2View.setActionHandler(new nw(new mw(dialog, this.b)));
            div2View.setData(hi0Var.e, hi0Var.f);
            dialog.setContentView(div2View);
            og0.a(dialog);
            this.f = dialog;
            dialog.show();
        } catch (Throwable th) {
            this.c.reportError("Failed to show DivKit close dialog", th);
        }
    }

    public static final void a(fi0 fi0Var, DialogInterface dialogInterface) {
        fi0Var.f = null;
    }
}
