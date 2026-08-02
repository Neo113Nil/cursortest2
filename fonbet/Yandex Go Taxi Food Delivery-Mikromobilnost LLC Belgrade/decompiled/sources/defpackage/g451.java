package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.plus.pay.ui.core.mobile.ui.kit.PlusPayUiKitInflaterFactory;
import com.yandex.plus.plaquesdk.widget.RobotoTextView;

/* loaded from: classes2.dex */
public final class g451 extends n451 {
    public final tls b;
    public final RobotoTextView c;

    public g451(Context context, tls tlsVar) {
        this.b = tlsVar;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        this.c = robotoTextView;
        robotoTextView.setTransitionName("plaque_button_widget_transition_name");
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    @Override // defpackage.n451
    public final void c(eg20 eg20Var) {
        kf20 kf20Var = (kf20) eg20Var;
        CharSequence charSequence = kf20Var.e.a;
        RobotoTextView robotoTextView = this.c;
        robotoTextView.setText(charSequence);
        robotoTextView.setGravity(kf20Var.d.c);
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    public final String toString() {
        return PlusPayUiKitInflaterFactory.NAME_BUTTON;
    }
}
