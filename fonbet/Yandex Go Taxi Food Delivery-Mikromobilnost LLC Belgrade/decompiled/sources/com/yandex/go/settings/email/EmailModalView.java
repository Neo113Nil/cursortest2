package com.yandex.go.settings.email;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import defpackage.avj0;
import defpackage.bxl;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.csn;
import defpackage.dkh0;
import defpackage.dsn;
import defpackage.e230;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.t7h0;
import defpackage.tje;
import defpackage.trn;
import defpackage.tse;
import defpackage.u1n;
import defpackage.urn;
import defpackage.vrn;
import defpackage.xrn;
import defpackage.y130;
import kotlin.Metadata;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;
import ru.yandex.taxi.design.utils.TextChangedListener;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u000bJ\u000f\u0010\u0017\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/yandex/go/settings/email/EmailModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lvrn;", "Landroid/content/Context;", "context", "Lcom/yandex/go/settings/email/a;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/settings/email/a;)V", "Lzy11;", "cleanup", "()V", "processGoBack", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lvrn;", "onAttachedToWindow", "onModalViewDisappear", "onDetachedFromWindow", "Lcom/yandex/go/settings/email/a;", "Lru/yandex/taxi/design/utils/TextChangedListener;", "mailValueTextChangeListener", "Lru/yandex/taxi/design/utils/TextChangedListener;", "", "isProgressing", "Z", "urn", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailModalView extends SlideableBindingModalView<vrn> {
    public static final int $stable = 8;
    private boolean isProgressing;
    private final TextChangedListener mailValueTextChangeListener;
    private final a presenter;

    public EmailModalView(Context context, a aVar) {
        super(context);
        this.presenter = aVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        TextChangedListener textChangedListener = new TextChangedListener(new EmailModalView$mailValueTextChangeListener$1(1, aVar, a.class, "onTextChanged", "onTextChanged(Ljava/lang/CharSequence;)V", 0));
        this.mailValueTextChangeListener = textChangedListener;
        setDismissOnBackPressed(false);
        getBinding().e.setDebounceClickListener(new trn(this, 1));
        getBinding().f.setOnBackClickListener(new trn(this, 2));
        getBinding().f.setToolbarItemAction(new trn(this, 3));
        getBinding().d.addTextChangedListener(textChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(EmailModalView emailModalView) {
        if (emailModalView.isProgressing) {
            return;
        }
        a aVar = emailModalView.presenter;
        String obj = emailModalView.getBinding().d.value().toString();
        if (!aVar.A) {
            ((xrn) aVar.Dg()).dismiss();
            return;
        }
        ((xrn) aVar.Dg()).setProgressing(true);
        xrn xrnVar = (xrn) aVar.Dg();
        c cVar = aVar.y;
        tse Jg = aVar.Jg();
        u1n u1nVar = new u1n(4, xrnVar, aVar);
        if (jl40.l(obj, cVar.d) && cVar.c) {
            xrnVar.setProgressing(false);
            aVar.Kg();
        } else if (cVar.e) {
            u1nVar.j(((avj0) cVar.b).h(kyh0.email_change_error_send_general), true);
        } else {
            cVar.e = true;
            cVar.d = obj;
            cVar.c = false;
            tje.N(Jg, null, null, new EmailSectionInteractor$setEmail$1(cVar, obj, u1nVar, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(EmailModalView emailModalView) {
        if (emailModalView.isProgressing) {
            return;
        }
        a aVar = emailModalView.presenter;
        int i = 1;
        ((xrn) aVar.Dg()).setProgressing(true);
        c cVar = aVar.y;
        tse Jg = aVar.Jg();
        dsn dsnVar = new dsn(aVar, i);
        csn csnVar = new csn(aVar, i);
        if (!cVar.e) {
            tje.N(Jg, null, null, new EmailSectionInteractor$deleteEmail$1(cVar, dsnVar, csnVar, null), 3);
            return;
        }
        csnVar.accept(((avj0) cVar.b).h(kyh0.email_change_error_send_general));
        cVar.e = true;
    }

    private final void cleanup() {
        getBinding().d.removeTextChangedListener(this.mailValueTextChangeListener);
        getBinding().e.setDebounceClickListener(null);
        getBinding().f.setOnBackClickListener(null);
        getBinding().f.setToolbarItemAction(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View insetsType$lambda$0(EmailModalView emailModalView) {
        return emailModalView.getBinding().a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processGoBack() {
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().d;
        animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
        a aVar = this.presenter;
        aVar.getClass();
        tje.N(aVar.Jg(), null, null, new EmailPresenter$refreshEmailIfNeed$1(aVar, new dsn(aVar, 0), null), 3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public vrn bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dkh0.email_modal_view, parent, false);
        FrameLayout frameLayout = (FrameLayout) inflate;
        int i = t7h0.mail_status_message;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            i = t7h0.mail_value;
            AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
            if (animatedListItemInputComponent != null) {
                i = t7h0.save;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
                if (buttonComponent != null) {
                    i = t7h0.scroll;
                    if (((ScrollView) cma1.O(i, inflate)) != null) {
                        i = t7h0.toolbar;
                        FloatingTitleToolbarComponent floatingTitleToolbarComponent = (FloatingTitleToolbarComponent) cma1.O(i, inflate);
                        if (floatingTitleToolbarComponent != null) {
                            return new vrn(frameLayout, frameLayout, robotoTextView, animatedListItemInputComponent, buttonComponent, floatingTitleToolbarComponent);
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new y130(0, new bxl(27, this), true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        urn urnVar = new urn(this);
        aVar.Bg(urnVar);
        c cVar = aVar.y;
        pzt0 pzt0Var = cVar.a.e;
        int i = 0;
        if (pzt0Var != null ? pzt0Var.isActive() : false) {
            urnVar.setProgressing(true);
            tje.N(aVar.Jg(), null, null, new EmailPresenter$attachView$1(aVar, urnVar, null), 3);
        } else {
            aVar.Kg();
            aVar.C = cVar.a.c();
        }
        setOnBackPressedListener(new trn(this, i));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cleanup();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().d;
        animatedListItemInputComponent.post(new ce0(animatedListItemInputComponent, 15));
        super.onModalViewDisappear();
    }
}
