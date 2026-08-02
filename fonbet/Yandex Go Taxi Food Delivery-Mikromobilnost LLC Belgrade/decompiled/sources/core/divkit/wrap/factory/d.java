package core.divkit.wrap.factory;

import android.content.Context;
import android.view.View;
import defpackage.a851;
import defpackage.amr;
import defpackage.c231;
import defpackage.hch0;
import defpackage.jl40;
import defpackage.mch0;
import defpackage.pog0;
import defpackage.qke;
import defpackage.qoi0;
import defpackage.u131;
import defpackage.w511;
import defpackage.x131;
import flex.utils.android.WindowInsetsProvider;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class d {
    public final com.yandex.div.core.expression.variables.a a;
    public final a851 b;
    public View.OnAttachStateChangeListener c;

    public d(com.yandex.div.core.expression.variables.a aVar, a851 a851Var) {
        this.a = aVar;
        this.b = a851Var;
    }

    public final void a(View view) {
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View.OnAttachStateChangeListener onAttachStateChangeListener2;
        View view2 = view;
        while (true) {
            if (view2 == null || jl40.l(view2.getTag(mch0.containerTag), Boolean.TRUE)) {
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (view2 == null) {
            w511.g(view2, " is not in container attached to DocumentEngine");
            return;
        }
        Object tag = view2.getTag(hch0.screenVariablesAttachedTag);
        Boolean bool = Boolean.TRUE;
        if (jl40.l(tag, bool)) {
            return;
        }
        Context context = view.getContext();
        float f = context.getResources().getDisplayMetrics().density;
        boolean z = context.getResources().getBoolean(pog0.isTablet);
        com.yandex.div.core.expression.variables.a aVar = this.a;
        x131 b = qke.b(aVar, "flex.density");
        if (b != null) {
            b.j(f);
        }
        c231 g = aVar.g("flex.is_tablet");
        u131 u131Var = g instanceof u131 ? (u131) g : null;
        if (u131Var != null) {
            u131Var.j(z);
        }
        if (view2.isAttachedToWindow() && (onAttachStateChangeListener2 = this.c) != null) {
            onAttachStateChangeListener2.onViewDetachedFromWindow(view2);
        }
        amr amrVar = amr.c;
        Integer valueOf = Integer.valueOf(view2.hashCode());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) amrVar.b.get(qoi0.a(WindowInsetsProvider.class));
        Object obj = concurrentHashMap != null ? concurrentHashMap.get(valueOf) : null;
        DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener = new DivVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener(aVar, (WindowInsetsProvider) (obj != null ? obj : null), f, this.b);
        this.c = divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener;
        view2.addOnAttachStateChangeListener(divVariablesConfigurator$ScreenVariablesOnAttachStateChangeListener);
        if (view2.isAttachedToWindow() && (onAttachStateChangeListener = this.c) != null) {
            onAttachStateChangeListener.onViewAttachedToWindow(view2);
        }
        view2.setTag(hch0.screenVariablesAttachedTag, bool);
    }
}
