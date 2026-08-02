package core.divkit.wrap.factory;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.Window;
import defpackage.a851;
import defpackage.eja1;
import defpackage.k751;
import defpackage.n751;
import defpackage.qke;
import defpackage.s7s0;
import defpackage.u1w;
import defpackage.x131;
import defpackage.x751;
import defpackage.xnl;
import defpackage.y751;
import defpackage.z751;
import flex.utils.android.WindowInsetsProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001$\b\u0002\u0018\u00002\u00020\u0001:\u0002\u001e\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u001aR\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u00060\u001eR\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"core/divkit/wrap/factory/DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener", "Landroid/view/View$OnAttachStateChangeListener;", "Lcom/yandex/div/core/expression/variables/a;", "divVariableController", "Lflex/utils/android/WindowInsetsProvider;", "windowInsetsProvider", "", "density", "La851;", "windowMetricsCalculatorFeature", "<init>", "(Lcom/yandex/div/core/expression/variables/a;Lflex/utils/android/WindowInsetsProvider;FLa851;)V", "Ln751;", "insets", "Lzy11;", "setInsetsVariables", "(Ln751;)V", "Landroid/view/View;", "container", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lcom/yandex/div/core/expression/variables/a;", "Lflex/utils/android/WindowInsetsProvider;", "F", "La851;", "Lcore/divkit/wrap/factory/b;", "Lcore/divkit/wrap/factory/DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener;", "boundsCalculator", "Lcore/divkit/wrap/factory/b;", "Lxnl;", "insetsCalculator", "Lxnl;", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangedListener", "Landroid/view/View$OnLayoutChangeListener;", "core/divkit/wrap/factory/c", "windowInsetsListener", "Lcore/divkit/wrap/factory/c;", "divkit-wrap_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final class DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener implements View.OnAttachStateChangeListener {
    private final float density;
    private final com.yandex.div.core.expression.variables.a divVariableController;
    private View.OnLayoutChangeListener layoutChangedListener;
    private final WindowInsetsProvider windowInsetsProvider;
    private final a851 windowMetricsCalculatorFeature;
    private final b boundsCalculator = new b(this);
    private final xnl insetsCalculator = new xnl();
    private final c windowInsetsListener = new c(this);

    public DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener(com.yandex.div.core.expression.variables.a aVar, WindowInsetsProvider windowInsetsProvider, float f, a851 a851Var) {
        this.divVariableController = aVar;
        this.windowInsetsProvider = windowInsetsProvider;
        this.density = f;
        this.windowMetricsCalculatorFeature = a851Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewAttachedToWindow$setDocumentSize(View view, DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener) {
        float width = view.getWidth() / divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.density;
        float height = view.getHeight() / divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.density;
        x131 b = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.divVariableController, "flex.document_width");
        if (b != null) {
            b.j(width);
        }
        x131 b2 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.divVariableController, "flex.document_height");
        if (b2 != null) {
            b2.j(height);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInsetsVariables(n751 insets) {
        u1w g;
        k751 k751Var = insets.a;
        u1w g2 = k751Var.g(519);
        s7s0 s7s0Var = this.windowMetricsCalculatorFeature.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        xnl xnlVar = this.insetsCalculator;
        if (booleanValue) {
            xnlVar.getClass();
            g = k751Var.g(647);
        } else {
            xnlVar.getClass();
            g = k751Var.g(16);
        }
        x131 b = qke.b(this.divVariableController, "flex.statusbar_height");
        if (b != null) {
            b.j(g2.b / this.density);
        }
        x131 b2 = qke.b(this.divVariableController, "flex.navigationbar_height");
        if (b2 != null) {
            b2.j(g2.d / this.density);
        }
        x131 b3 = qke.b(this.divVariableController, "flex.safe_area_top");
        if (b3 != null) {
            b3.j(g.b / this.density);
        }
        x131 b4 = qke.b(this.divVariableController, "flex.safe_area_bottom");
        if (b4 != null) {
            b4.j(g.d / this.density);
        }
        x131 b5 = qke.b(this.divVariableController, "flex.safe_area_left");
        if (b5 != null) {
            b5.j(g.a / this.density);
        }
        x131 b6 = qke.b(this.divVariableController, "flex.safe_area_right");
        if (b6 != null) {
            b6.j(g.c / this.density);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(final View container) {
        boolean z;
        Window window;
        n751 n751Var;
        onViewAttachedToWindow$setDocumentSize(container, this);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: core.divkit.wrap.factory.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.onViewAttachedToWindow$setDocumentSize(container, this);
            }
        };
        this.layoutChangedListener = onLayoutChangeListener;
        container.addOnLayoutChangeListener(onLayoutChangeListener);
        WindowInsetsProvider windowInsetsProvider = this.windowInsetsProvider;
        if (windowInsetsProvider != null) {
            windowInsetsProvider.a.add(this.windowInsetsListener);
        }
        WindowInsetsProvider windowInsetsProvider2 = this.windowInsetsProvider;
        if (windowInsetsProvider2 != null && (n751Var = windowInsetsProvider2.c) != null) {
            this.windowInsetsListener.a(n751Var);
        }
        s7s0 s7s0Var = this.windowMetricsCalculatorFeature.a;
        boolean booleanValue = Boolean.FALSE.booleanValue();
        b bVar = this.boundsCalculator;
        float f = this.density;
        if (booleanValue) {
            DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener = bVar.a;
            Activity l = eja1.l(container.getContext());
            if (l != null) {
                y751.a.getClass();
                Rect a = ((z751) x751.a()).a(l).a();
                x131 b = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.divVariableController, "flex.window_width");
                if (b != null) {
                    b.j(a.width() / f);
                }
                x131 b2 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.divVariableController, "flex.window_height");
                if (b2 != null) {
                    b2.j(a.height() / f);
                }
                Size v = eja1.v(l);
                x131 b3 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.divVariableController, "flex.screen_width");
                if (b3 != null) {
                    b3.j(v.getWidth() / f);
                }
                x131 b4 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener.divVariableController, "flex.screen_height");
                if (b4 != null) {
                    b4.j(v.getHeight() / f);
                    return;
                }
                return;
            }
            return;
        }
        DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener2 = bVar.a;
        Context context = container.getContext();
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        View view = null;
        Activity activity = z ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            view = window.getDecorView();
        }
        if (view != null) {
            float width = view.getWidth() / f;
            float height = view.getHeight() / f;
            x131 b5 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener2.divVariableController, "flex.window_width");
            if (b5 != null) {
                b5.j(width);
            }
            x131 b6 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener2.divVariableController, "flex.window_height");
            if (b6 != null) {
                b6.j(height);
            }
        }
        if (activity != null) {
            Size v2 = eja1.v(activity);
            float width2 = v2.getWidth() / f;
            float height2 = v2.getHeight() / f;
            x131 b7 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener2.divVariableController, "flex.screen_width");
            if (b7 != null) {
                b7.j(width2);
            }
            x131 b8 = qke.b(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener2.divVariableController, "flex.screen_height");
            if (b8 != null) {
                b8.j(height2);
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View container) {
        View.OnLayoutChangeListener onLayoutChangeListener = this.layoutChangedListener;
        if (onLayoutChangeListener != null) {
            container.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        this.layoutChangedListener = null;
        WindowInsetsProvider windowInsetsProvider = this.windowInsetsProvider;
        if (windowInsetsProvider != null) {
            windowInsetsProvider.a.remove(this.windowInsetsListener);
        }
    }
}
