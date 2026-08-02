package com.yandex.go.superapp.order_tracking.eats.presentation.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.superapp.order_tracking.eats.domain.c;
import com.yandex.go.superapp.order_tracking.eats.presentation.navigation.g;
import com.yandex.go.superapp.orders.card.OrderCardView;
import defpackage.c21;
import defpackage.cfn;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.cxq0;
import defpackage.czo0;
import defpackage.d3p;
import defpackage.h1p;
import defpackage.hbp0;
import defpackage.jkh0;
import defpackage.jl40;
import defpackage.k501;
import defpackage.kfn;
import defpackage.l501;
import defpackage.lvx;
import defpackage.m501;
import defpackage.m950;
import defpackage.mvx;
import defpackage.n501;
import defpackage.ny61;
import defpackage.o501;
import defpackage.p3p;
import defpackage.p501;
import defpackage.pav;
import defpackage.q501;
import defpackage.qoi0;
import defpackage.r501;
import defpackage.s501;
import defpackage.sy60;
import defpackage.t0w0;
import defpackage.tn70;
import defpackage.u1n;
import defpackage.v130;
import defpackage.v770;
import defpackage.w201;
import defpackage.w49;
import defpackage.w511;
import defpackage.wsv0;
import defpackage.xen;
import defpackage.xw31;
import defpackage.y49;
import defpackage.yen;
import defpackage.z7h0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.BackButtonIconComponent;
import ru.yandex.taxi.eats_orders.domain.entities.order.status.EatsOrderStatus;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000245B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010 \u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u0010J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010\u0010J\u0017\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0017H\u0014¢\u0006\u0004\b)\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/yandex/go/superapp/order_tracking/eats/presentation/ui/EatsOrderDetailsModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lw49;", "cashbackViewFactory", "Lcom/yandex/go/superapp/order_tracking/eats/presentation/ui/a;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Lw49;Lcom/yandex/go/superapp/order_tracking/eats/presentation/ui/a;)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "isMotionEventInsideContent", "(Landroid/view/MotionEvent;)Z", "Lv130;", "insetsType", "()Lv130;", "Landroid/widget/LinearLayout;", "contentView", "()Landroid/widget/LinearLayout;", "Lzy11;", "onAttachedToWindow", "()V", "changed", "", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "ev", "dispatchTouchEvent", "onTouchEvent", "Ljava/lang/Runnable;", "onAnimationEnd", "dismissInternal", "(Ljava/lang/Runnable;)V", "onDetachedFromWindow", "Lcom/yandex/go/superapp/order_tracking/eats/presentation/ui/a;", "Lkfn;", "binding", "Lkfn;", "Ly49;", "cashbackView", "Ly49;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "yen", "zen", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsOrderDetailsModalView extends ModalView {
    private final kfn binding;
    private final y49 cashbackView;
    private final a presenter;
    private final hbp0 scopeDelegate;

    public EatsOrderDetailsModalView(Context context, pav pavVar, w49 w49Var, a aVar) {
        super(context);
        View O;
        this.presenter = aVar;
        int i = 0;
        View inflate = LayoutInflater.from(context).inflate(jkh0.eats_order_modal_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = z7h0.back_button;
        BackButtonIconComponent backButtonIconComponent = (BackButtonIconComponent) cma1.O(i2, inflate);
        if (backButtonIconComponent != null) {
            i2 = z7h0.card;
            OrderCardView orderCardView = (OrderCardView) cma1.O(i2, inflate);
            if (orderCardView != null && (O = cma1.O((i2 = z7h0.plus_badge), inflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) inflate;
                this.binding = new kfn(linearLayout, backButtonIconComponent, orderCardView, O);
                this.cashbackView = ((t0w0) w49Var).a(linearLayout);
                String d = qoi0.a(EatsOrderDetailsModalView.class).d();
                hbp0 hbp0Var = new hbp0(new czo0(15), d == null ? "" : d, null);
                this.scopeDelegate = hbp0Var;
                this.animateOnAppearing = false;
                backButtonIconComponent.setOnClickListener(new cmi(13, this));
                setEnableBackgroundOnAppearing(false);
                setDismissOnTouchOutside(false);
                OrderCardView.init$default(orderCardView, tn70.a, hbp0Var, pavVar, new xen(i, this), null, 16, null);
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final boolean isMotionEventInsideContent(MotionEvent event) {
        return xw31.o(this, this.binding.c, event) || xw31.o(this, this.binding.b, event) || xw31.o(this, this.binding.d, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public static final void lambda$1$0(EatsOrderDetailsModalView eatsOrderDetailsModalView, s501 s501Var) {
        d3p d3pVar;
        EatsOrderStatus eatsOrderStatus;
        if (!jl40.l(s501Var, q501.b)) {
            if (jl40.l(s501Var, m501.b) || (s501Var instanceof n501) || jl40.l(s501Var, o501.b) || (s501Var instanceof p501) || (s501Var instanceof l501) || (s501Var instanceof k501) || jl40.l(s501Var, r501.b)) {
                return;
            }
            w511.b();
            return;
        }
        a aVar = eatsOrderDetailsModalView.presenter;
        c cVar = aVar.C;
        String str = aVar.A;
        Iterator it = ((List) cVar.a.u.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                d3pVar = 0;
                break;
            } else {
                d3pVar = it.next();
                if (jl40.l(((w201) d3pVar).getId(), str)) {
                    break;
                }
            }
        }
        d3p d3pVar2 = d3pVar instanceof d3p ? d3pVar : null;
        boolean isActive = (d3pVar2 == null || (eatsOrderStatus = d3pVar2.f) == null) ? false : eatsOrderStatus.getIsActive();
        u1n u1nVar = aVar.B;
        c21 c21Var = sy60.Q2;
        if (!isActive) {
            u1nVar.getClass();
            wsv0 wsv0Var = new wsv0(((cfn) u1nVar.b).b, 10);
            g gVar = (g) u1nVar.c;
            gVar.A((m950) gVar.O.get(), new p3p(new lvx(wsv0Var, v770.b)), c21Var);
            return;
        }
        cfn cfnVar = (cfn) u1nVar.b;
        h1p h1pVar = cfnVar.b;
        String str2 = cfnVar.a;
        g gVar2 = (g) u1nVar.c;
        gVar2.A((m950) gVar2.O.get(), new p3p(new mvx(h1pVar, str2, true)), c21Var);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void dismissInternal(Runnable onAnimationEnd) {
        this.binding.d.setVisibility(8);
        super.dismissInternal(onAnimationEnd);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return isMotionEventInsideContent(ev) && super.dispatchTouchEvent(ev);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public v130 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.scopeDelegate.a();
        this.presenter.Bg(new yen(this));
        ((cxq0) this.cashbackView).D();
        requestApplyInsets();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        ((cxq0) this.cashbackView).z();
        this.scopeDelegate.b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.presenter.F.g(Integer.valueOf(this.binding.c.getHeight()));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public LinearLayout getContentView() {
        return this.binding.a;
    }
}
