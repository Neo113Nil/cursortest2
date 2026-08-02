package com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.apj;
import defpackage.c230;
import defpackage.cma1;
import defpackage.da0;
import defpackage.dvh0;
import defpackage.e230;
import defpackage.ny61;
import defpackage.qdb1;
import defpackage.qu;
import defpackage.rpj;
import defpackage.rza;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uxh;
import defpackage.uyj;
import defpackage.xw31;
import defpackage.y6h0;
import defpackage.zoj;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00042345B'\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0014¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010/¨\u00066"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lapj;", "Landroid/content/Context;", "context", "", "initialPromoCodeValue", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/b;", "presenter", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/b;)V", "", "isKeyboardVisible", "Lzy11;", "changeKeyboardVisibility", "(Z)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lapj;", "onAttachedToWindow", "()V", "onAppearAnimationComplete", "onDetachedFromWindow", "dismiss", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onBackPressed", "onTouchOutside", "screenName", "()Ljava/lang/String;", "canHandleScreenTracking", "()Z", "Ljava/lang/String;", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/b;", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeModalView$SwitchableChangeTextWatcher;", "promoCodeInputTextWatcher", "Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeModalView$SwitchableChangeTextWatcher;", "", "standardMinHeight", CA20Status.STATUS_USER_I, "errorMinHeight", "Companion", "com/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/a", "SwitchableChangeTextWatcher", "NoSpacesInputFilter", "zoj", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DiscountsAddPromoCodeModalView extends SlideableBindingModalView<apj> {
    public static final zoj Companion = new zoj();
    private final int errorMinHeight;
    private final String initialPromoCodeValue;
    private final b presenter;
    private final SwitchableChangeTextWatcher promoCodeInputTextWatcher;
    private final int standardMinHeight;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeModalView$NoSpacesInputFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class NoSpacesInputFilter implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            StringBuilder sb = new StringBuilder();
            int length = source.length();
            for (int i = 0; i < length; i++) {
                char charAt = source.charAt(i);
                if (!rza.b(charAt)) {
                    sb.append(charAt);
                }
            }
            return sb;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0011\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/presentation/ui/add/DiscountsAddPromoCodeModalView$SwitchableChangeTextWatcher;", "Landroid/text/TextWatcher;", "Lkotlin/Function1;", "", "Lzy11;", "doAfterTextChanged", "<init>", "(Ltls;)V", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "Ltls;", "getDoAfterTextChanged", "()Ltls;", "Ljava/lang/String;", "", "ignore", "Z", BackendConfig.Restrictions.ENABLED, "getEnabled", "()Z", "setEnabled", "(Z)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SwitchableChangeTextWatcher implements TextWatcher {
        private final tls doAfterTextChanged;
        private boolean ignore;
        private String before = "";
        private boolean enabled = true;

        public SwitchableChangeTextWatcher(tls tlsVar) {
            this.doAfterTextChanged = tlsVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (s == null || this.ignore) {
                return;
            }
            if (this.enabled) {
                this.doAfterTextChanged.invoke(s.toString());
                return;
            }
            this.ignore = true;
            s.replace(0, s.length(), this.before);
            this.ignore = false;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            String obj = s != null ? s.toString() : null;
            if (obj == null) {
                obj = "";
            }
            this.before = obj;
        }

        public final tls getDoAfterTextChanged() {
            return this.doAfterTextChanged;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }
    }

    public DiscountsAddPromoCodeModalView(Context context, String str, b bVar) {
        super(context);
        this.initialPromoCodeValue = str;
        this.presenter = bVar;
        SwitchableChangeTextWatcher switchableChangeTextWatcher = new SwitchableChangeTextWatcher(new DiscountsAddPromoCodeModalView$promoCodeInputTextWatcher$1(1, bVar, b.class, "promoCodeInputChanged", "promoCodeInputChanged(Ljava/lang/String;)V", 0));
        this.promoCodeInputTextWatcher = switchableChangeTextWatcher;
        this.standardMinHeight = tje.u(56, getContext());
        this.errorMinHeight = tje.u(68, getContext());
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        qdb1.b(this, new uxh(17, bVar));
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().c;
        animatedListItemInputComponent.addTextChangedListener(switchableChangeTextWatcher);
        animatedListItemInputComponent.setOnKeyboardClosed(new DiscountsAddPromoCodeModalView$2$1(0, this, DiscountsAddPromoCodeModalView.class, "onBackPressed", "onBackPressed()V", 0));
        animatedListItemInputComponent.setFilters(new InputFilter[]{new NoSpacesInputFilter()});
        animatedListItemInputComponent.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$backButtonClicked(b bVar) {
        bVar.Mg(true);
        ((da0) bVar.D.a).r(new qu(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeKeyboardVisibility(boolean isKeyboardVisible) {
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().c;
        if (!isKeyboardVisible) {
            animatedListItemInputComponent.hideKeyboard();
            return;
        }
        if (!animatedListItemInputComponent.isFocused()) {
            animatedListItemInputComponent.sendAccessibilityEvent(8);
        }
        animatedListItemInputComponent.focusInput();
        animatedListItemInputComponent.showKeyboard();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public apj bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(dvh0.discounts_add_promo_code_modal_view, parent, false);
        int i = y6h0.button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = y6h0.input_component;
            AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
            if (animatedListItemInputComponent != null) {
                i = y6h0.title_component;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
                if (robotoTextView != null) {
                    return new apj((GoLinearLayout) inflate, buttonComponent, animatedListItemInputComponent, robotoTextView);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public boolean canHandleScreenTracking() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void dismiss() {
        super.dismiss();
        changeKeyboardVisibility(false);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        changeKeyboardVisibility(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.presenter;
        a aVar = new a(this);
        bVar.Bg(aVar);
        rpj rpjVar = bVar.B;
        tpr t = e.t(e.n(rpjVar.b.a(), bVar.G, bVar.H, new DiscountsAddPromoCodeUiStateInteractor$uiStateFlow$1(rpjVar, null)));
        rpjVar.a.getClass();
        tje.N(bVar.Jg(), null, null, new DiscountsAddPromoCodePresenter$attachView$$inlined$collectIn$1(e.F(t, uyj.a), null, bVar, aVar), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.presenter.Mg(true);
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.m(getCardContentView(), event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        this.presenter.Mg(false);
        super.onTouchOutside();
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    /* renamed from: screenName */
    public String getModalScreenName() {
        return "add_promocode";
    }
}
