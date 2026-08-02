package defpackage;

import android.view.View;
import android.widget.Button;
import com.yandex.plus.pay.ui.core.mobile.view.error.buttons.PlusPayErrorButtonsView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class pbd0 {
    public static final /* synthetic */ kgx[] e = {new PropertyReference1Impl("primaryButton", 0, "getPrimaryButton()Landroid/widget/Button;", pbd0.class), b64.x(qoi0.a, pbd0.class, "secondaryButton", "getSecondaryButton()Landroid/widget/Button;", 0)};
    public final sls a;
    public final sls b;
    public final wv5 c;
    public final wv5 d;

    public pbd0(PlusPayErrorButtonsView plusPayErrorButtonsView, sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
        wv5 wv5Var = new wv5(new a450(plusPayErrorButtonsView, y9h0.error_primary_button, 24));
        this.c = wv5Var;
        wv5 wv5Var2 = new wv5(new a450(plusPayErrorButtonsView, y9h0.error_secondary_button, 25));
        this.d = wv5Var2;
        kgx[] kgxVarArr = e;
        final int i = 0;
        bb1.L((Button) wv5Var.a(kgxVarArr[0]), new View.OnClickListener(this) { // from class: obd0
            public final /* synthetic */ pbd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                pbd0 pbd0Var = this.b;
                switch (i2) {
                    case 0:
                        pbd0Var.a.invoke();
                        break;
                    default:
                        pbd0Var.b.invoke();
                        break;
                }
            }
        });
        final int i2 = 1;
        bb1.L((Button) wv5Var2.a(kgxVarArr[1]), new View.OnClickListener(this) { // from class: obd0
            public final /* synthetic */ pbd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                pbd0 pbd0Var = this.b;
                switch (i22) {
                    case 0:
                        pbd0Var.a.invoke();
                        break;
                    default:
                        pbd0Var.b.invoke();
                        break;
                }
            }
        });
    }
}
