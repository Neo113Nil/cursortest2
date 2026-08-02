package com.yandex.go.safety.center.safetycenter_web.ui.error;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import com.yandex.go.safety.center.safetycenter_web.b;
import defpackage.cma1;
import defpackage.do5;
import defpackage.dzg0;
import defpackage.eul0;
import defpackage.hg;
import defpackage.hxj0;
import defpackage.i7h0;
import defpackage.ip11;
import defpackage.iul0;
import defpackage.kul0;
import defpackage.nul0;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.ppl0;
import defpackage.sul0;
import defpackage.tje;
import defpackage.tjh0;
import defpackage.tse0;
import defpackage.xw31;
import defpackage.zmh;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/safety/center/safetycenter_web/ui/error/SafetyCenterWebErrorView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lnul0;", "presenter", "Lip11;", "typefaceDelegate", "<init>", "(Landroid/content/Context;Lnul0;Lip11;)V", "Lzy11;", "initViews", "()V", "onAttachedToWindow", "Lnul0;", "Lip11;", "Lkul0;", "binding", "Lkul0;", "", "lastGradientColors", "[I", "iul0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterWebErrorView extends GoFrameLayout {
    private kul0 binding;
    private int[] lastGradientColors;
    private final nul0 presenter;
    private final ip11 typefaceDelegate;

    public SafetyCenterWebErrorView(Context context, nul0 nul0Var, ip11 ip11Var) {
        super(context, null, 0, 0, 14, null);
        View O;
        View O2;
        View O3;
        this.presenter = nul0Var;
        this.typefaceDelegate = ip11Var;
        LayoutInflater.from(context).inflate(tjh0.safety_center_web_error_view, this);
        int i = i7h0.back_float_btn;
        GoImageView goImageView = (GoImageView) cma1.O(i, this);
        if (goImageView != null) {
            i = i7h0.buttons_container;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout != null && (O = cma1.O((i = i7h0.call_emergency_btn), this)) != null) {
                do5 p = do5.p(O);
                i = i7h0.gradient;
                GoView goView = (GoView) cma1.O(i, this);
                if (goView != null && (O2 = cma1.O((i = i7h0.open_support_btn), this)) != null) {
                    do5 p2 = do5.p(O2);
                    i = i7h0.reload_btn;
                    ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
                    if (buttonComponent != null && (O3 = cma1.O((i = i7h0.share_route_btn), this)) != null) {
                        do5 p3 = do5.p(O3);
                        i = i7h0.subtitle;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                        if (robotoTextView != null) {
                            i = i7h0.title;
                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                            if (robotoTextView2 != null) {
                                i = i7h0.title_image;
                                GoImageView goImageView2 = (GoImageView) cma1.O(i, this);
                                if (goImageView2 != null) {
                                    this.binding = new kul0(this, goImageView, goLinearLayout, p, goView, p2, buttonComponent, p3, robotoTextView, robotoTextView2, goImageView2);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void initViews() {
        kul0 kul0Var = this.binding;
        RobotoTextView robotoTextView = kul0Var.j;
        ip11 ip11Var = this.typefaceDelegate;
        getContext();
        robotoTextView.setTypeface(((zmh) ip11Var).d());
        ButtonComponent buttonComponent = kul0Var.g;
        buttonComponent.setTypeface(buttonComponent.getTypeface(), 1);
        GoFrameLayout goFrameLayout = kul0Var.d.b;
        c.z(new SafetyCenterWebErrorView$initViews$1$1(0, this.presenter, nul0.class, "onOpenEmergencyButtonClicked", "onOpenEmergencyButtonClicked()V", 0), goFrameLayout);
        GoFrameLayout goFrameLayout2 = kul0Var.f.b;
        c.z(new SafetyCenterWebErrorView$initViews$1$2(0, this.presenter, nul0.class, "onOpenSupportButtonClicked", "onOpenSupportButtonClicked()V", 0), goFrameLayout2);
        GoFrameLayout goFrameLayout3 = kul0Var.h.b;
        c.z(new SafetyCenterWebErrorView$initViews$1$3(0, this.presenter, nul0.class, "onShareUrlButtonClicked", "onShareUrlButtonClicked()V", 0), goFrameLayout3);
        hg.a(goFrameLayout);
        hg.a(goFrameLayout2);
        hg.a(goFrameLayout3);
        buttonComponent.setDebounceClickListener(new hxj0(19, this.presenter));
        GoImageView goImageView = kul0Var.b;
        c.z(new SafetyCenterWebErrorView$initViews$1$5(0, this.presenter, nul0.class, "onBackButtonClicked", "onBackButtonClicked()V", 0), goImageView);
        if (xw31.n(getContext())) {
            goImageView.setBackgroundResource(dzg0.ic_arrow_right);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0$onReloadButtonClicked(nul0 nul0Var) {
        com.yandex.go.safety.center.safetycenter_web.a aVar = nul0Var.y;
        b bVar = aVar.b;
        eul0 eul0Var = bVar.N;
        sul0 sul0Var = aVar.a;
        ppl0 ppl0Var = eul0Var.d;
        SafetyCenterAnalytics$SafetyCenterNavigationSource e = eul0.e(sul0Var.d);
        boolean c = eul0Var.c();
        boolean z = sul0Var.b;
        String b = eul0Var.b();
        String d = eul0Var.d();
        String str = sul0Var.a;
        HashMap o = tse0.o(ppl0Var);
        o.put("source", e.getEventValue());
        o.put("has_account", Boolean.valueOf(c));
        o.put("is_checklist", Boolean.valueOf(z));
        if (b != null) {
            o.put("country", b);
        }
        if (d != null) {
            o.put("zone_name", d);
        }
        if (str != null) {
            o.put("source_order_id", str);
        }
        ppl0Var.a.a("SafetyCenter.WebErrorScreen.Reload.Clicked", o, 1, new HashMap());
        o8k0 o8k0Var = bVar.R;
        if (o8k0Var != null) {
            o8k0Var.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initViews();
        nul0 nul0Var = this.presenter;
        iul0 iul0Var = new iul0(this);
        nul0Var.Bg(iul0Var);
        tje.N(nul0Var.Jg(), null, null, new SafetyCenterWebErrorViewPresenter$attachView$$inlined$collectLatestIn$1(nul0Var.A.a(), null, nul0Var, iul0Var), 3);
    }
}
