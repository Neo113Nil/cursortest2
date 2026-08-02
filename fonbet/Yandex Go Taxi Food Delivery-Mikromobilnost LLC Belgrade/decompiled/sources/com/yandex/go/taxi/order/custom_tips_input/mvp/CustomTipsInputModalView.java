package com.yandex.go.taxi.order.custom_tips_input.mvp;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.order.details.v2.domain.feedback.a;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import defpackage.a3y0;
import defpackage.a5f;
import defpackage.avu0;
import defpackage.bmf;
import defpackage.bvu0;
import defpackage.c230;
import defpackage.cma1;
import defpackage.cmf;
import defpackage.cvu0;
import defpackage.dye;
import defpackage.emf;
import defpackage.evu0;
import defpackage.fef;
import defpackage.fmf;
import defpackage.g8e;
import defpackage.gmf;
import defpackage.hst;
import defpackage.hxe;
import defpackage.imf;
import defpackage.ist;
import defpackage.jhd;
import defpackage.jmf;
import defpackage.jst;
import defpackage.ke00;
import defpackage.kmf;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.orq;
import defpackage.oxe;
import defpackage.p8h0;
import defpackage.qdb1;
import defpackage.qje;
import defpackage.to31;
import defpackage.tzx;
import defpackage.vsq;
import defpackage.w511;
import defpackage.xdf;
import defpackage.xng0;
import defpackage.zkh0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.TextChangedListener;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.KeyboardAwareRobotoEditText;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002<=B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J+\u0010&\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u001f\u0010/\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u0010\u0012J\u000f\u00102\u001a\u00020\u0010H\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0010H\u0002¢\u0006\u0004\b3\u0010\u0012J\u000f\u00104\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u0010\u0012J\u000f\u00105\u001a\u00020\u0010H\u0002¢\u0006\u0004\b5\u0010\u0012J\u001f\u00108\u001a\u00020\u00102\u0006\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\u001eH\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010:\u001a\u00020\u00102\b\u0010$\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b:\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/go/taxi/order/custom_tips_input/mvp/CustomTipsInputModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ltzx;", "Lemf;", "Landroid/content/Context;", "context", "Lgmf;", "presenter", "<init>", "(Landroid/content/Context;Lgmf;)V", "", "isArrowsPermanentlyHidden", "()Z", "Lc230;", "insetsType", "()Lc230;", "Lzy11;", "onAppearAnimationComplete", "()V", "onAttachedToWindow", "onModalViewDisappear", "onDetachedFromWindow", "Lkmf;", ClidProvider.STATE, "setInputState", "(Lkmf;)V", "enableConfirm", "enableConfirmButton", "(Z)V", "close", "", "previousValue", "setPreviousValue", "(Ljava/lang/String;)V", "", "hintResId", "priceSign", "priceCurrencyText", "showInputPriceSign", "(ILjava/lang/String;Ljava/lang/String;)V", "decimalDigitsCount", "showDecimalDigitsCount", "(I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ltzx;", "placeCursorAtEnd", "setupHeader", "setupInputField", "clearInputField", "confirmClicked", "errorResId", "param", "showInputError", "(ILjava/lang/String;)V", "showInputDefault", "Lgmf;", "DecimalDigitsInputFilter", "dmf", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CustomTipsInputModalView extends SlideableBindingModalView<tzx> implements emf {
    public static final int $stable = 8;
    private final gmf presenter;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/taxi/order/custom_tips_input/mvp/CustomTipsInputModalView$DecimalDigitsInputFilter;", "Landroid/text/InputFilter;", "digitsAfterDot", "", "<init>", "(I)V", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DecimalDigitsInputFilter implements InputFilter {
        private final int digitsAfterDot;

        public DecimalDigitsInputFilter(int i) {
            this.digitsAfterDot = i;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            String obj = source.subSequence(start, end).toString();
            String obj2 = dest.toString();
            String p = g8e.p(obj2.substring(0, dstart), obj, obj2.substring(dend));
            int max = Math.max(evu0.H(p, Extension.DOT_CHAR, 0, false, 6), evu0.G(p, HexString.CHAR_COMMA, 0, 6));
            if (max >= 0 && p.substring(max + 1).length() > this.digitsAfterDot) {
                return "";
            }
            if (max >= 0) {
                p = p.substring(0, max);
            }
            if (p.length() <= 1 || !cvu0.x(p, "0", false)) {
                return null;
            }
            return "";
        }
    }

    public CustomTipsInputModalView(Context context, gmf gmfVar) {
        super(context);
        this.presenter = gmfVar;
        qdb1.c(this, new oxe(5, gmfVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$cancelClicked(gmf gmfVar) {
        o61 o61Var = gmfVar.y.a;
        o61Var.getClass();
        o61Var.a.a("ArbitraryTips.DidTapCancelButton", new HashMap(), 1, new HashMap());
        ((emf) gmfVar.Dg()).close();
    }

    private final void clearInputField() {
        tzx binding = getBinding();
        binding.d.setOnEditorActionListener(new a5f(12));
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.d;
        animatedListItemInputComponent.setOnKeyboardClosed(new hxe(23));
        animatedListItemInputComponent.removeTextChangedListener(new TextChangedListener(new bmf(this, binding, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 clearInputField$lambda$0$0(int i) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 clearInputField$lambda$0$2(CustomTipsInputModalView customTipsInputModalView, tzx tzxVar, String str) {
        customTipsInputModalView.presenter.Kg(tzxVar.d.value().toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmClicked() {
        gmf gmfVar = this.presenter;
        String obj = getBinding().d.value().toString();
        fmf fmfVar = gmfVar.A;
        orq orqVar = gmfVar.y;
        xdf xdfVar = gmfVar.z;
        xdfVar.getClass();
        String e = xdf.e(obj);
        Float j = avu0.j(e);
        if (j == null) {
            a3y0 a3y0Var = gmfVar.B;
            String l = a3y0Var.l(new String[]{"confirmClicked"});
            hst hstVar = jst.e;
            String str = a3y0Var.a;
            hstVar.getClass();
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a == null || !a.b(15)) {
                return;
            }
            a.a(15, str, null, "Could not parse user input", m.a);
            return;
        }
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType = fmfVar.e;
        fef fefVar = fmfVar.f;
        String obj2 = taxiOrderTipsValueType.toString();
        o61 o61Var = orqVar.a;
        o61 o61Var2 = orqVar.a;
        o61.b(o61Var, obj2, bvu0.l(10, e));
        float floatValue = j.floatValue();
        float f = fmfVar.b;
        int i = 0;
        if (floatValue < f) {
            ((emf) gmfVar.Dg()).setInputState(new jmf(kyh0.tips_error_another_amount_too_small, xdfVar.b(fefVar, Double.valueOf(f))));
            gmfVar.C = false;
            ((emf) gmfVar.Dg()).enableConfirmButton(false);
            o61.a(o61Var2, "too_less");
            return;
        }
        float floatValue2 = j.floatValue();
        float f2 = fmfVar.c;
        if (floatValue2 > f2) {
            ((emf) gmfVar.Dg()).setInputState(new jmf(kyh0.tips_error_another_amount_too_big_template, xdfVar.b(fefVar, Double.valueOf(f2))));
            gmfVar.C = false;
            ((emf) gmfVar.Dg()).enableConfirmButton(false);
            o61.a(o61Var2, "too_much");
            return;
        }
        a aVar = gmfVar.x;
        aVar.getClass();
        aVar.g(new vsq(e, i));
        aVar.b();
        aVar.f();
        ((emf) gmfVar.Dg()).close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAppearAnimationComplete$lambda$0(CustomTipsInputModalView customTipsInputModalView) {
        customTipsInputModalView.getBinding().d.requestFocus();
        customTipsInputModalView.getBinding().d.showKeyboard();
    }

    private final void setupHeader() {
        getBinding().c.setTitle(kyh0.tips_modal_view_title);
    }

    private final void setupInputField() {
        tzx binding = getBinding();
        binding.d.setOnEditorActionListener(new dye(12, this));
        AnimatedListItemInputComponent animatedListItemInputComponent = binding.d;
        animatedListItemInputComponent.addTextChangedListener(new TextChangedListener(new bmf(this, binding, 1)));
        animatedListItemInputComponent.setOnKeyboardClosed(new jhd(20, binding, this));
        animatedListItemInputComponent.setTrailTextColor(qje.t(xng0.textMinor, getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInputField$lambda$0$0(CustomTipsInputModalView customTipsInputModalView, int i) {
        if (i == 6 && customTipsInputModalView.presenter.C) {
            customTipsInputModalView.confirmClicked();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInputField$lambda$0$1(CustomTipsInputModalView customTipsInputModalView, tzx tzxVar, String str) {
        customTipsInputModalView.presenter.Kg(tzxVar.d.value().toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupInputField$lambda$0$2(tzx tzxVar, CustomTipsInputModalView customTipsInputModalView) {
        tzxVar.d.clearFocus();
        customTipsInputModalView.requestFocus();
        return zy11.a;
    }

    private final void showInputDefault(String priceSign) {
        getBinding().d.cleanError();
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().d;
        if (priceSign == null) {
            priceSign = "";
        }
        animatedListItemInputComponent.setTrailText(priceSign);
    }

    private final void showInputError(int errorResId, String param) {
        getBinding().d.setErrorText(c.H(this, errorResId, param));
        getBinding().d.setTrailText("");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public tzx bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.layout_custom_tips_input_modal_view, parent, false);
        int i = p8h0.confirm;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.header;
            ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i, inflate);
            if (listTitleComponent != null) {
                i = p8h0.tips_input;
                AnimatedListItemInputComponent animatedListItemInputComponent = (AnimatedListItemInputComponent) cma1.O(i, inflate);
                if (animatedListItemInputComponent != null) {
                    return new tzx((GoLinearLayout) inflate, buttonComponent, listTitleComponent, animatedListItemInputComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.emf
    public void close() {
        onBackPressed();
    }

    @Override // defpackage.emf
    public void enableConfirmButton(boolean enableConfirm) {
        ButtonComponent buttonComponent = getBinding().b;
        buttonComponent.setEnabled(enableConfirm);
        buttonComponent.setButtonBackground(qje.t(enableConfirm ? xng0.controlMain : xng0.controlMinor, buttonComponent.getContext()));
        buttonComponent.setButtonTitleColor(qje.t(enableConfirm ? xng0.textOnControl : xng0.textOnControlMinor, buttonComponent.getContext()));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public c230 insetsType() {
        return new c230(true);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        getBinding().d.post(new cmf(this, 1));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        setupHeader();
        setupInputField();
        getBinding().b.setOnClickListener(new cmf(this, 0));
        gmf gmfVar = this.presenter;
        gmfVar.Bg(this);
        fmf fmfVar = gmfVar.A;
        String str2 = fmfVar.d;
        if (str2 != null && !evu0.J(str2)) {
            gmfVar.Lg();
            ((emf) gmfVar.Dg()).setPreviousValue(str2);
        }
        fef fefVar = fmfVar.f;
        String str3 = fefVar != null ? fefVar.a : null;
        if (fefVar == null || (str = fefVar.d) == null) {
            str = str3;
        }
        ((emf) gmfVar.Dg()).showInputPriceSign(kyh0.tips_another_amount_hint, str, str3);
        ((emf) gmfVar.Dg()).showDecimalDigitsCount(fmfVar.a);
        ((emf) gmfVar.Dg()).placeCursorAtEnd();
        ((emf) gmfVar.Dg()).enableConfirmButton(gmfVar.C);
        to31 to31Var = gmfVar.y.b;
        to31Var.getClass();
        to31Var.a.a("view.arbitrary_tips", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearInputField();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewDisappear() {
        super.onModalViewDisappear();
        getBinding().d.hideKeyboard();
    }

    @Override // defpackage.emf
    public void placeCursorAtEnd() {
        getBinding().d.setSelection(getBinding().d.value().length());
    }

    @Override // defpackage.emf
    public void setInputState(kmf state) {
        if (state instanceof imf) {
            String str = ((imf) state).a;
            if (str == null) {
                str = "";
            }
            showInputDefault(str);
            return;
        }
        if (!(state instanceof jmf)) {
            w511.b();
        } else {
            jmf jmfVar = (jmf) state;
            showInputError(jmfVar.a, jmfVar.b);
        }
    }

    @Override // defpackage.emf
    public void setPreviousValue(String previousValue) {
        getBinding().d.setValue(previousValue);
    }

    @Override // defpackage.emf
    public void showDecimalDigitsCount(int decimalDigitsCount) {
        KeyboardAwareRobotoEditText input = getBinding().d.getInput();
        input.setFilters(new DecimalDigitsInputFilter[]{new DecimalDigitsInputFilter(decimalDigitsCount)});
        input.setInputType(decimalDigitsCount == 0 ? 2 : 8194);
    }

    @Override // defpackage.emf
    public void showInputPriceSign(int hintResId, String priceSign, String priceCurrencyText) {
        String string;
        if (priceSign == null || (string = c.H(this, hintResId, priceSign)) == null) {
            string = getContext().getString(hintResId);
        }
        AnimatedListItemInputComponent animatedListItemInputComponent = getBinding().d;
        if (priceSign != null && !evu0.J(priceSign)) {
            animatedListItemInputComponent.setTrailText(priceSign);
        }
        if (priceCurrencyText != null && !evu0.J(priceCurrencyText)) {
            string = c.H(animatedListItemInputComponent, hintResId, priceCurrencyText);
        }
        animatedListItemInputComponent.setContentDescription(string);
    }
}
