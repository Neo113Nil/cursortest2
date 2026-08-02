package xsna;

import android.content.Context;
import com.vk.superapp.api.dto.menu.WidgetIds;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.api.dto.widgets.actions.WebActionCallback;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;
import xsna.u7n0;

/* compiled from: DefaultSuperAppClickListener.kt */
/* loaded from: classes6.dex */
public class fnl implements u7n0 {
    @Override // xsna.u7n0
    public void u0(Context context, u7n0.a aVar, WebAction webAction) {
        UniversalWidget universalWidget = aVar.a;
        if (webAction instanceof WebActionCallback) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            vdx0Var.B().a(universalWidget.d().d, universalWidget.d().c, (WebActionCallback) webAction).h(new ia(new nkc(context, 1), 22));
        }
    }

    @Override // xsna.u7n0
    public final void Y0(String str) {
    }

    @Override // xsna.u7n0
    public final void d0(SuperAppWidget superAppWidget) {
    }

    @Override // xsna.u7n0
    public final void f0(String str) {
    }

    @Override // xsna.u7n0
    public final void g0(String str) {
    }

    @Override // xsna.u7n0
    public final void i0(WidgetIds widgetIds) {
    }

    @Override // xsna.u7n0
    public final void i1(obn0 obn0Var) {
    }

    @Override // xsna.u7n0
    public final void x0(String str) {
    }

    @Override // xsna.u7n0
    public final void z(SuperAppWidget superAppWidget) {
    }

    @Override // xsna.u7n0
    public final void D0(yk ykVar, m84 m84Var) {
    }

    @Override // xsna.u7n0
    public final void e0(WidgetIds widgetIds, int i) {
    }

    @Override // xsna.u7n0
    public final void g(CharSequence charSequence, CharSequence charSequence2) {
    }

    @Override // xsna.u7n0
    public final void h0(Context context, b9n0 b9n0Var) {
    }

    @Override // xsna.u7n0
    public final void h1(j8q j8qVar, ExpandableMenuState expandableMenuState) {
    }

    @Override // xsna.u7n0
    public final void Z(Context context, WebAction webAction, SuperAppWidget superAppWidget) {
    }

    @Override // xsna.u7n0
    public final void b(Context context, WebAction webAction, f9n0 f9n0Var, Integer num) {
    }

    @Override // xsna.u7n0
    public final void x(Context context, z8n0 z8n0Var, WebAction webAction, int i, boolean z) {
    }
}
