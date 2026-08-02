package com.yandex.go.telemetry.ui;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.coroutines.b;
import defpackage.cma1;
import defpackage.elh0;
import defpackage.kux0;
import defpackage.ny61;
import defpackage.rdy0;
import defpackage.sdy0;
import defpackage.tje;
import defpackage.u8h0;
import defpackage.udy0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/telemetry/ui/TelemetryReportModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lrdy0;", "Landroid/content/Context;", "context", "Ludy0;", "presenter", "<init>", "(Landroid/content/Context;Ludy0;)V", "Lzy11;", "setupViews", "()V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lrdy0;", "Landroid/content/Context;", "Ludy0;", "sdy0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TelemetryReportModalView extends SlideableBindingModalView<rdy0> {
    private final Context context;
    private final udy0 presenter;

    public TelemetryReportModalView(Context context, udy0 udy0Var) {
        super(context);
        this.context = context;
        this.presenter = udy0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setClickable(false);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        setOnBackPressedListener(new kux0(6, this));
    }

    private final void setupViews() {
        getBinding().b.setDebounceClickListener(new kux0(7, this.presenter));
        getBinding().d.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupViews$collectReport(udy0 udy0Var) {
        b.g(udy0Var.Jg(), null, null, new TelemetryReportPresenter$collectReport$1(udy0Var, null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public rdy0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(elh0.telemetry_report_layout, parent, false);
        int i = u8h0.btn_collect;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = u8h0.btn_share;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = u8h0.content_text;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    i = u8h0.progress_layout;
                    FrameLayout frameLayout = (FrameLayout) cma1.O(i, inflate);
                    if (frameLayout != null) {
                        i = u8h0.progress_text;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, inflate);
                        if (robotoTextView2 != null) {
                            return new rdy0((LinearLayout) inflate, buttonComponent, buttonComponent2, robotoTextView, frameLayout, robotoTextView2);
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
        udy0 udy0Var = this.presenter;
        sdy0 sdy0Var = new sdy0(this);
        udy0Var.Bg(sdy0Var);
        tje.N(udy0Var.Jg(), null, null, new TelemetryReportPresenter$attachView$$inlined$safeCollectIn$1(udy0Var.F, null, sdy0Var), 3);
        setupViews();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }
}
