package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogModalView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class kkn0 extends m230 {
    public final w030 E;
    public final fva0 F;
    public final xjn0 G;

    public kkn0(w030 w030Var, fva0 fva0Var, xjn0 xjn0Var) {
        super(null);
        this.E = w030Var;
        this.F = fva0Var;
        this.G = xjn0Var;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogRouterImpl$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        zjn0 zjn0Var = (zjn0) obj;
        final String str = "ScootersAlert";
        fva0.f(this.F, "ScootersAlert", PerformanceAnalytics$Type.Inflate, 0L, 4);
        Throwable th = zjn0Var.a;
        List list = zjn0Var.b;
        if (list == null) {
            list = EmptyList.a;
        }
        String str2 = zjn0Var.c;
        ndl0 ndl0Var = new ndl0(13, this);
        yx1 yx1Var = this.G.a;
        final ScootersErrorDialogModalView scootersErrorDialogModalView = new ScootersErrorDialogModalView((Context) ((xvf0) yx1Var.a).get(), (Set) ((y2r0) yx1Var.g).get(), (pav) ((xvf0) yx1Var.b).get(), (pdc) ((xvf0) yx1Var.c).get(), (k7x0) ((xvf0) yx1Var.d).get(), (pwy0) ((xvf0) yx1Var.e).get(), (c) ((xvf0) yx1Var.f).get(), (rjn0) ((z4k0) yx1Var.h).get(), th, str2, list, ndl0Var);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogRouterImpl$provideModalView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = scootersErrorDialogModalView.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = scootersErrorDialogModalView;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r1;
        scootersErrorDialogModalView.addOnAttachStateChangeListener(r1);
        return scootersErrorDialogModalView;
    }
}
