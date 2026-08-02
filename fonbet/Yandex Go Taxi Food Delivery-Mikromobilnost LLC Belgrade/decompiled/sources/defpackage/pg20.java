package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import io.appmetrica.analytics.IReporter;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plaque.widgets.BalanceMicroWidgetView;
import ru.yandex.taxi.plaque.widgets.ButtonMicroWidgetView;
import ru.yandex.taxi.plaque.widgets.HorizontalGroupMicroWidgetView;
import ru.yandex.taxi.plaque.widgets.IconMicroWidgetView;
import ru.yandex.taxi.plaque.widgets.SwitchMicroWidgetView;
import ru.yandex.taxi.plaque.widgets.TextMicroWidgetView;

/* loaded from: classes6.dex */
public final class pg20 extends erd0 {
    public List A;
    public final sg20 x;
    public final brd0 y;
    public final v8o z;

    public pg20(LinearLayout linearLayout, sg20 sg20Var, brd0 brd0Var, v8o v8oVar) {
        super(linearLayout, v8oVar);
        this.x = sg20Var;
        this.y = brd0Var;
        this.z = v8oVar;
        this.A = EmptyList.a;
    }

    @Override // defpackage.erd0
    public final void d(crd0 crd0Var, int i) {
        dg20 dg20Var = (dg20) this.A.get(i);
        if (dg20Var instanceof hf20) {
            gg20 gg20Var = crd0Var instanceof gg20 ? (gg20) crd0Var : null;
            if (gg20Var != null) {
                gg20Var.d.updateModel((hf20) dg20Var);
                return;
            } else {
                g(crd0Var, dg20Var);
                return;
            }
        }
        if (dg20Var instanceof jf20) {
            hg20 hg20Var = crd0Var instanceof hg20 ? (hg20) crd0Var : null;
            if (hg20Var != null) {
                hg20Var.d.updateModel((jf20) dg20Var);
                return;
            } else {
                g(crd0Var, dg20Var);
                return;
            }
        }
        if (dg20Var instanceof nf20) {
            jg20 jg20Var = crd0Var instanceof jg20 ? (jg20) crd0Var : null;
            if (jg20Var != null) {
                jg20Var.d.updateModel((nf20) dg20Var);
                return;
            } else {
                g(crd0Var, dg20Var);
                return;
            }
        }
        if (dg20Var instanceof uf20) {
            if ((crd0Var instanceof kg20 ? (kg20) crd0Var : null) != null) {
                return;
            }
            g(crd0Var, dg20Var);
            return;
        }
        if (dg20Var instanceof xf20) {
            lg20 lg20Var = crd0Var instanceof lg20 ? (lg20) crd0Var : null;
            if (lg20Var != null) {
                lg20Var.d.updateModel((xf20) dg20Var);
                return;
            } else {
                g(crd0Var, dg20Var);
                return;
            }
        }
        if (dg20Var instanceof zf20) {
            mg20 mg20Var = crd0Var instanceof mg20 ? (mg20) crd0Var : null;
            if (mg20Var != null) {
                mg20Var.d.updateModel((zf20) dg20Var);
                return;
            } else {
                g(crd0Var, dg20Var);
                return;
            }
        }
        if (!(dg20Var instanceof mf20)) {
            w511.b();
            return;
        }
        ig20 ig20Var = crd0Var instanceof ig20 ? (ig20) crd0Var : null;
        if (ig20Var != null) {
            ig20Var.d.updateModel((mf20) dg20Var);
        } else {
            g(crd0Var, dg20Var);
        }
    }

    @Override // defpackage.erd0
    public final crd0 e(ViewGroup viewGroup, int i) {
        dg20 dg20Var = (dg20) this.A.get(i);
        boolean z = dg20Var instanceof hf20;
        sg20 sg20Var = this.x;
        if (z) {
            Context context = viewGroup.getContext();
            sg20Var.getClass();
            BalanceMicroWidgetView balanceMicroWidgetView = new BalanceMicroWidgetView(context);
            sg20Var.a(balanceMicroWidgetView, (hf20) dg20Var);
            return new gg20(balanceMicroWidgetView);
        }
        if (dg20Var instanceof jf20) {
            Context context2 = viewGroup.getContext();
            sg20Var.getClass();
            ButtonMicroWidgetView buttonMicroWidgetView = new ButtonMicroWidgetView(context2);
            sg20Var.a(buttonMicroWidgetView, (jf20) dg20Var);
            return new hg20(buttonMicroWidgetView);
        }
        if (dg20Var instanceof nf20) {
            Context context3 = viewGroup.getContext();
            sg20Var.getClass();
            IconMicroWidgetView iconMicroWidgetView = new IconMicroWidgetView(context3);
            sg20Var.a(iconMicroWidgetView, (nf20) dg20Var);
            return new jg20(iconMicroWidgetView);
        }
        if (dg20Var instanceof uf20) {
            Context context4 = viewGroup.getContext();
            sg20Var.getClass();
            Space space = new Space(context4);
            sg20Var.a(space, (uf20) dg20Var);
            return new kg20(space);
        }
        if (dg20Var instanceof xf20) {
            Context context5 = viewGroup.getContext();
            sg20Var.getClass();
            SwitchMicroWidgetView switchMicroWidgetView = new SwitchMicroWidgetView(context5);
            sg20Var.a(switchMicroWidgetView, (xf20) dg20Var);
            return new lg20(switchMicroWidgetView);
        }
        if (dg20Var instanceof zf20) {
            Context context6 = viewGroup.getContext();
            sg20Var.getClass();
            TextMicroWidgetView textMicroWidgetView = new TextMicroWidgetView(context6);
            sg20Var.a(textMicroWidgetView, (zf20) dg20Var);
            return new mg20(textMicroWidgetView);
        }
        if (!(dg20Var instanceof mf20)) {
            w511.b();
            return null;
        }
        mf20 mf20Var = (mf20) dg20Var;
        Context context7 = viewGroup.getContext();
        sg20Var.getClass();
        HorizontalGroupMicroWidgetView horizontalGroupMicroWidgetView = new HorizontalGroupMicroWidgetView(context7, sg20Var, sg20Var.a);
        if (mf20Var.a() != null) {
            c.z(new g700(18, sg20Var, mf20Var), horizontalGroupMicroWidgetView);
        }
        return new ig20(horizontalGroupMicroWidgetView);
    }

    public final void g(crd0 crd0Var, dg20 dg20Var) {
        String simpleName = crd0Var.getClass().getSimpleName();
        int i = crd0Var.c;
        String b = dg20Var.b();
        StringBuilder u = b64.u(i, "bind error on ", simpleName, " at ", " position with model id=");
        u.append(b);
        ((IReporter) this.z.b.getValue()).reportError("MicroWidgetsAdapter: bind error", u.toString(), new IllegalStateException());
    }
}
