package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.navigation.modals.coroutines.a;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;
import ru.yandex.taxi.summary.requirements.list.ui.SpecialNeedsModalView;
import ru.yandex.taxi.surge.dialog.feedback_sent.SurgeFeedbackSentModalView;
import ru.yandex.taxi.surge.interactor.p;

/* loaded from: classes6.dex */
public final class kpw0 extends a {
    public final /* synthetic */ int F;
    public final boolean G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpw0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(null);
        this.F = i;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.L = obj5;
        this.M = obj6;
        this.G = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        switch (this.F) {
            case 0:
                return ((i130) this.H).a();
            default:
                return (w030) this.H;
        }
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        switch (this.F) {
        }
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.summary.requirements.list.router.SpecialNeedsViewRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        int i = this.F;
        Object obj2 = this.I;
        Object obj3 = this.J;
        switch (i) {
            case 0:
                wor0 wor0Var = new wor0(this);
                zxs0 zxs0Var = ((jpw0) obj3).a;
                return new SurgeFeedbackSentModalView((Context) ((gpw0) obj2).a.a.get(), new ipw0((nuq) obj, wor0Var, (p) ((sit0) zxs0Var.a).get(), (xcv0) ((xvf0) zxs0Var.b).get()));
            default:
                TariffInfoGroupDefinition tariffInfoGroupDefinition = ((tot0) obj).a;
                f580 f580Var = (f580) this.K;
                wor0 wor0Var2 = new wor0(this);
                sbm0 sbm0Var = ((wot0) obj3).a;
                vot0 vot0Var = new vot0((roj0) ((xvf0) sbm0Var.a).get(), (k0) ((xvf0) sbm0Var.b).get(), (lot0) ((xvf0) sbm0Var.c).get(), (ru.yandex.taxi.preorder.summary.tariffpage.requirements.a) ((xvf0) sbm0Var.d).get(), (pav) ((xvf0) sbm0Var.e).get(), (g580) ((xvf0) sbm0Var.f).get(), (ru.yandex.taxi.summary.requirements.list.router.a) ((xvf0) sbm0Var.g).get(), (b) ((p6g) sbm0Var.h).get(), (pwy0) ((xvf0) sbm0Var.i).get(), tariffInfoGroupDefinition, f580Var, wor0Var2);
                final String str = "SpecialNeedsScreenView";
                fva0.f((fva0) this.M, "SpecialNeedsScreenView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                final SpecialNeedsModalView specialNeedsModalView = new SpecialNeedsModalView((Context) obj2, vot0Var, (xg) this.L);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r2 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.summary.requirements.list.router.SpecialNeedsViewRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = specialNeedsModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str);
                        }
                        View view = specialNeedsModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r2;
                specialNeedsModalView.addOnAttachStateChangeListener(r2);
                return specialNeedsModalView;
        }
    }
}
