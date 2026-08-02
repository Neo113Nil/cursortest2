package com.yandex.passport.internal.ui.sloth.menu;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yandex.passport.sloth.ui.i2;
import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.li91;
import defpackage.sls;

/* loaded from: classes2.dex */
public final class q {
    public final h a;
    public final com.yandex.passport.sloth.ui.string.a b;

    public q(h hVar, com.yandex.passport.sloth.ui.string.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    public final void a(boolean z, sls slsVar) {
        i2 i2Var = this.a.w;
        ((LinearLayout) i2Var.getRoot()).setVisibility(0);
        i2Var.w.setVisibility(8);
        i2Var.y.setVisibility(0);
        TextView textView = i2Var.z;
        textView.setVisibility(0);
        SlothString slothString = z ? SlothString.ERROR_CONNECTION_LOST : SlothString.ERROR_UNEXPECTED;
        com.yandex.passport.internal.ui.sloth.k kVar = (com.yandex.passport.internal.ui.sloth.k) this.b;
        textView.setText(kVar.a(slothString));
        Button button = i2Var.A;
        button.setVisibility(0);
        button.setText(kVar.a(SlothString.BACK_BUTTON));
        li91.e(new UserMenuUiController$showError$1$1$1(slsVar, null), button);
    }
}
