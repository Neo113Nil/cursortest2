package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.plus.plaquesdk.widget.RobotoTextView;

/* loaded from: classes2.dex */
public final class l451 extends n451 {
    public final tls b;
    public final RobotoTextView c;

    public l451(Context context, tls tlsVar) {
        this.b = tlsVar;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        this.c = robotoTextView;
        robotoTextView.setTransitionName("plaque_text_widget_transition_name");
    }

    @Override // defpackage.drd0
    public final View a() {
        return this.c;
    }

    @Override // defpackage.n451
    public final void c(eg20 eg20Var) {
        ag20 ag20Var = (ag20) eg20Var;
        CharSequence charSequence = ag20Var.e.a;
        RobotoTextView robotoTextView = this.c;
        robotoTextView.setText(charSequence);
        tkj tkjVar = ag20Var.f;
        if (tkjVar != null && tkjVar.a() > 0) {
            robotoTextView.setLineHeight(tkjVar.b(robotoTextView.getContext().getResources().getDisplayMetrics()).intValue());
        }
        robotoTextView.setGravity(ag20Var.d.c);
    }

    @Override // defpackage.n451
    public final tls d() {
        return this.b;
    }

    public final String toString() {
        return "Text";
    }
}
