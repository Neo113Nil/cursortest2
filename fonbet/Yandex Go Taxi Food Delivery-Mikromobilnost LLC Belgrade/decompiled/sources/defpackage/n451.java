package defpackage;

import android.view.View;
import androidx.core.view.b;
import com.yandex.plus.plaquesdk.plaque.api.models.display.MicroWidgetDrawable;
import defpackage.n451;

/* loaded from: classes8.dex */
public abstract class n451 extends drd0 {
    public final void b(final eg20 eg20Var) {
        final ue20 ue20Var = eg20Var.c().a.b;
        e0k e0kVar = eg20Var.c().a.a;
        bb1.L(a(), eg20Var.getAction() != null ? new View.OnClickListener() { // from class: e451
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d().invoke(eg20Var);
            }
        } : null);
        a().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.plaquesdk.plaque.adapter.WidgetViewHolder$bind$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                view.setBackground(new MicroWidgetDrawable(n451.this.a().getContext(), ue20Var, view.getHeight()));
            }
        });
        a().setPaddingRelative(e0kVar.a.b(a().getContext().getResources().getDisplayMetrics()).intValue(), e0kVar.b.b(a().getContext().getResources().getDisplayMetrics()).intValue(), e0kVar.c.b(a().getContext().getResources().getDisplayMetrics()).intValue(), e0kVar.d.b(a().getContext().getResources().getDisplayMetrics()).intValue());
        a().setImportantForAccessibility(eg20Var.getContentDescription().a);
        a().setContentDescription(eg20Var.getContentDescription().b);
        e(eg20Var);
        c(eg20Var);
    }

    public abstract void c(eg20 eg20Var);

    public abstract tls d();

    public void e(eg20 eg20Var) {
        b.p(a(), new m451(eg20Var, this));
    }
}
