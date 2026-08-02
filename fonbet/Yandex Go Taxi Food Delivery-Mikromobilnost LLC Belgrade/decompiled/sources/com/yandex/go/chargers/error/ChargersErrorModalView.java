package com.yandex.go.chargers.error;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersErrorCardButtonName;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersErrorCardCloseReason;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.cy9;
import defpackage.dn7;
import defpackage.em9;
import defpackage.ey9;
import defpackage.fy9;
import defpackage.nhh0;
import defpackage.ny61;
import defpackage.ny9;
import defpackage.osh0;
import defpackage.pwy0;
import defpackage.pya;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.qy9;
import defpackage.sk7;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uh6;
import defpackage.uyj;
import java.util.HashMap;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/chargers/error/ChargersErrorModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lfy9;", "Landroid/content/Context;", "context", "Lny9;", "chargersErrorPresenter", "Lpya;", "chargersTypefaceDelegate", "<init>", "(Landroid/content/Context;Lny9;Lpya;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lfy9;", "Lzy11;", "onAttachedToWindow", "()V", "onBackPressed", "onDetachedFromWindow", "Lny9;", "Lpya;", "", "margin16", CA20Status.STATUS_USER_I, "margin8", "ey9", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersErrorModalView extends SlideableBindingModalView<fy9> {
    private final ny9 chargersErrorPresenter;
    private final pya chargersTypefaceDelegate;
    private final int margin16;
    private final int margin8;

    public ChargersErrorModalView(Context context, ny9 ny9Var, pya pyaVar) {
        super(context);
        this.chargersErrorPresenter = ny9Var;
        this.chargersTypefaceDelegate = pyaVar;
        qdb1.b(this, new dn7(28, ny9Var));
        this.margin16 = (int) uh6.p(context, 16.0f);
        this.margin8 = (int) uh6.p(context, 8.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$backButtonClicked(ny9 ny9Var) {
        cy9 cy9Var = ny9Var.z;
        String str = cy9Var.a;
        String str2 = cy9Var.d;
        em9 em9Var = ny9Var.x;
        em9Var.i(str, ChargersAnalytics$ChargersErrorCardButtonName.Back, str2);
        em9Var.h(str, ChargersAnalytics$ChargersErrorCardCloseReason.Back, str2);
        ((qy9) ny9Var.A.b).r(new qu(9));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public fy9 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(osh0.chargers_error_modal_view, parent, false);
        int i = nhh0.error_image_view;
        GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
        if (goImageView != null) {
            i = nhh0.primary_button;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = nhh0.secondary_button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent2 != null) {
                    i = nhh0.subtitle_text_view;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                    if (robotoTextView != null) {
                        i = nhh0.title_text_view;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new fy9((GoLinearLayout) inflate, goImageView, buttonComponent, buttonComponent2, robotoTextView, robotoTextView2);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        ny9 ny9Var = this.chargersErrorPresenter;
        ey9 ey9Var = new ey9(this);
        ny9Var.Bg(ey9Var);
        em9 em9Var = ny9Var.x;
        cy9 cy9Var = ny9Var.z;
        String str = cy9Var.a;
        String str2 = cy9Var.d;
        em9Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", str);
        if (str2 != null) {
            hashMap.put("trace_id", str2);
        }
        em9Var.a.a("Chargers.ErrorCard.Shown", hashMap, 2, new HashMap());
        sk7 sk7Var = ny9Var.y;
        tpr t = e.t(new c(((pwy0) sk7Var.w).a(), sk7Var, cy9Var));
        ((tt2) sk7Var.b).getClass();
        tje.N(ny9Var.Jg(), null, null, new ChargersErrorPresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, ey9Var), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        ny9 ny9Var = this.chargersErrorPresenter;
        cy9 cy9Var = ny9Var.z;
        String str = cy9Var.a;
        String str2 = cy9Var.d;
        em9 em9Var = ny9Var.x;
        em9Var.i(str, ChargersAnalytics$ChargersErrorCardButtonName.Back, str2);
        em9Var.h(str, ChargersAnalytics$ChargersErrorCardCloseReason.Back, str2);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.chargersErrorPresenter.Cg();
    }
}
