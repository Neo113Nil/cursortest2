package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.core.view2.Div2View;
import core.divkit.view.DivViewLayout;
import core.divkit.wrap.factory.d;
import defpackage.cyl;
import defpackage.l3k;

/* loaded from: classes9.dex */
public final class l3k {
    public final cyl a;
    public final a851 b;

    public l3k(cyl cylVar) {
        this(cylVar, new a851(new s7s0(23)));
    }

    public static DivViewLayout b(l3k l3kVar, Div2Context div2Context, ViewGroup.LayoutParams layoutParams) {
        Div2View a = l3kVar.a(div2Context, layoutParams);
        DivViewLayout.Companion.getClass();
        DivViewLayout divViewLayout = new DivViewLayout(a.getContext(), a);
        divViewLayout.setLayoutParams(layoutParams);
        return divViewLayout;
    }

    public final Div2View a(Div2Context div2Context, ViewGroup.LayoutParams layoutParams) {
        a divVariableController = div2Context.getDivVariableController();
        final d dVar = new d(divVariableController, this.b);
        final Div2View div2View = new Div2View(div2Context, null, 0, 4, null);
        div2View.setLayoutParams(layoutParams);
        final k3k k3kVar = new k3k(div2View);
        div2View.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: core.divkit.wrap.factory.Div2ViewFactory$create$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                cyl cylVar = l3k.this.a;
                cylVar.a.add(k3kVar);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                cyl cylVar = l3k.this.a;
                cylVar.a.remove(k3kVar);
            }
        });
        for (c231 c231Var : scc.g(new x131("flex.document_width", 0.0d), new x131("flex.document_height", 0.0d), new x131("flex.window_width", 0.0d), new x131("flex.window_height", 0.0d), new x131("flex.statusbar_height", 0.0d), new x131("flex.navigationbar_height", 0.0d), new x131("flex.screen_width", 0.0d), new x131("flex.screen_height", 0.0d), new x131("flex.density", 1.0d), new u131("flex.is_tablet", false), new x131("flex.safe_area_top", 0.0d), new x131("flex.safe_area_bottom", 0.0d), new x131("flex.safe_area_left", 0.0d), new x131("flex.safe_area_right", 0.0d))) {
            if (!divVariableController.h(c231Var.c())) {
                divVariableController.f(c231Var);
            }
        }
        if (div2View.isAttachedToWindow()) {
            dVar.a(div2View);
            return div2View;
        }
        div2View.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: core.divkit.wrap.factory.Div2ViewFactory$create$$inlined$doOnAttach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                div2View.removeOnAttachStateChangeListener(this);
                dVar.a(view);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        return div2View;
    }

    public l3k(cyl cylVar, a851 a851Var) {
        this.a = cylVar;
        this.b = a851Var;
    }
}
