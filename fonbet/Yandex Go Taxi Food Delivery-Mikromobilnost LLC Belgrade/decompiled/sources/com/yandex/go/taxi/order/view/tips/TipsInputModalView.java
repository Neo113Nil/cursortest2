package com.yandex.go.taxi.order.view.tips;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import defpackage.bdc;
import defpackage.bgz0;
import defpackage.bvu0;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.diz0;
import defpackage.e230;
import defpackage.evu0;
import defpackage.ff2;
import defpackage.g8e;
import defpackage.gwk0;
import defpackage.ief;
import defpackage.kux0;
import defpackage.kyh0;
import defpackage.l8x;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o61;
import defpackage.p8h0;
import defpackage.pxy0;
import defpackage.t1w;
import defpackage.tje;
import defpackage.to31;
import defpackage.tse;
import defpackage.w130;
import defpackage.wfz0;
import defpackage.wnb1;
import defpackage.wze0;
import defpackage.xdf;
import defpackage.xfz0;
import defpackage.xng0;
import defpackage.yfz0;
import defpackage.zfz0;
import defpackage.zkh0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BindingModalView;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001GB%\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001c\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001c\u0010\u000eJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0016¢\u0006\u0004\b.\u0010\u000eJ+\u00102\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00172\b\u00100\u001a\u0004\u0018\u00010\u00132\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\f2\u0006\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b5\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010C\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/yandex/go/taxi/order/view/tips/TipsInputModalView;", "Lru/yandex/taxi/widget/BindingModalView;", "Lxfz0;", "Lyfz0;", "Landroid/content/Context;", "context", "Ltse;", "coroutineScope", "Lzfz0;", "presenter", "<init>", "(Landroid/content/Context;Ltse;Lzfz0;)V", "Lzy11;", "setupInputField", "()V", "confirmClicked", "Le230;", "insetsType", "()Le230;", "", "previousValue", "setPreviousValue", "(Ljava/lang/String;)V", "", "contentTop", "onModalViewAppear", "(I)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxfz0;", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "errorId", "param", "showInputError", "(ILjava/lang/String;)V", "", "enableConfirm", "enableConfirmButton", "(Z)V", "close", "hintResId", "priceSign", "priceCurrencyText", "showInputHint", "(ILjava/lang/String;Ljava/lang/String;)V", "decimalDigitsCount", "showDecimalDigitsCount", "Ltse;", "Lzfz0;", "Landroid/widget/LinearLayout;", "content", "Landroid/widget/LinearLayout;", "Lru/yandex/taxi/design/ButtonComponent;", "confirm", "Lru/yandex/taxi/design/ButtonComponent;", "cancel", "Lru/yandex/taxi/design/ListItemInputComponent;", "inputComponent", "Lru/yandex/taxi/design/ListItemInputComponent;", "Ll8x;", "textChangeJob", "Ll8x;", "confirmAvailable", "Z", "DecimalDigitsInputFilter", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TipsInputModalView extends BindingModalView<xfz0> implements yfz0 {
    public static final int $stable = 8;
    private final ButtonComponent cancel;
    private final ButtonComponent confirm;
    private boolean confirmAvailable;
    private final LinearLayout content;
    private final tse coroutineScope;
    private final ListItemInputComponent inputComponent;
    private final zfz0 presenter;
    private l8x textChangeJob;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000f"}, d2 = {"Lcom/yandex/go/taxi/order/view/tips/TipsInputModalView$DecimalDigitsInputFilter;", "Landroid/text/InputFilter;", "digitsAfterDot", "", "<init>", "(I)V", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DecimalDigitsInputFilter implements InputFilter {
        public static final int $stable = 0;
        private final int digitsAfterDot;

        public DecimalDigitsInputFilter(int i) {
            this.digitsAfterDot = i;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            String obj = source.subSequence(start, end).toString();
            String obj2 = dest.toString();
            String p = g8e.p(obj2.substring(0, dstart), obj, obj2.substring(dend));
            int max = (int) Math.max(evu0.H(p, Extension.DOT_CHAR, 0, false, 6), evu0.G(p, HexString.CHAR_COMMA, 0, 6));
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

    public TipsInputModalView(Context context, tse tseVar, zfz0 zfz0Var) {
        super(context);
        this.coroutineScope = tseVar;
        this.presenter = zfz0Var;
        LinearLayout linearLayout = getBinding().a;
        this.content = linearLayout;
        this.confirm = getBinding().c;
        this.cancel = getBinding().b;
        this.inputComponent = getBinding().d;
        wnb1.d(linearLayout.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmClicked() {
        String str;
        zfz0 zfz0Var = this.presenter;
        Editable text = this.inputComponent.getText();
        if (text == null || (str = text.toString()) == null) {
            str = "";
        }
        zfz0Var.x.getClass();
        String e = xdf.e(str);
        o61.b(zfz0Var.y.a, zfz0Var.w.c().b().name().toLowerCase(Locale.US), bvu0.l(10, e));
        bgz0 bgz0Var = zfz0Var.w;
        bgz0Var.getClass();
        if (new BigDecimal(e).compareTo(new BigDecimal(cvu0.v(bgz0Var.c().a().c, ",", Extension.DOT_CHAR, false))) < 0) {
            o61.a(zfz0Var.y.a, "too_less");
            yfz0 yfz0Var = (yfz0) zfz0Var.Dg();
            int i = kyh0.tips_error_another_amount_too_small;
            bgz0 bgz0Var2 = zfz0Var.w;
            String v = cvu0.v(bgz0Var2.c().a().c, ",", Extension.DOT_CHAR, false);
            xdf xdfVar = bgz0Var2.g;
            ief iefVar = bgz0Var2.d.b(bgz0Var2.c.b()).d;
            yfz0Var.showInputError(i, xdfVar.c(iefVar != null ? gwk0.h(iefVar) : null, v, true));
            ((yfz0) zfz0Var.Dg()).enableConfirmButton(false);
            return;
        }
        bgz0 bgz0Var3 = zfz0Var.w;
        bgz0Var3.getClass();
        if (new BigDecimal(e).compareTo(new BigDecimal(cvu0.v(bgz0Var3.c().a().d, ",", Extension.DOT_CHAR, false))) > 0) {
            o61.a(zfz0Var.y.a, "too_much");
            yfz0 yfz0Var2 = (yfz0) zfz0Var.Dg();
            int i2 = kyh0.tips_error_another_amount_too_big_template;
            bgz0 bgz0Var4 = zfz0Var.w;
            String v2 = cvu0.v(bgz0Var4.c().a().d, ",", Extension.DOT_CHAR, false);
            xdf xdfVar2 = bgz0Var4.g;
            ief iefVar2 = bgz0Var4.d.b(bgz0Var4.c.b()).d;
            yfz0Var2.showInputError(i2, xdfVar2.c(iefVar2 != null ? gwk0.h(iefVar2) : null, v2, true));
            ((yfz0) zfz0Var.Dg()).enableConfirmButton(false);
            return;
        }
        bgz0 bgz0Var5 = zfz0Var.w;
        TaxiOrder b = bgz0Var5.c.b();
        TipsType b2 = bgz0Var5.c().b();
        b.getClass();
        synchronized (b) {
            b.l = b.l.T(diz0.a(diz0.g(b2), e));
        }
        bgz0Var5.b(e, bgz0Var5.c().b());
        zfz0Var.w.a();
        ((yfz0) zfz0Var.Dg()).close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(final TipsInputModalView tipsInputModalView, t1w t1wVar) {
        final float f = t1wVar.g;
        int height = tipsInputModalView.content.getHeight();
        LinearLayout linearLayout = tipsInputModalView.content;
        if (height > 0) {
            cma1.h(-f, linearLayout);
        } else {
            WeakHashMap weakHashMap = b.a;
            if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
                linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.taxi.order.view.tips.TipsInputModalView$insetsType$lambda$0$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        cma1.h(-f, TipsInputModalView.this.content);
                    }
                });
            } else {
                cma1.h(-f, tipsInputModalView.content);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$cancelClicked(zfz0 zfz0Var) {
        o61 o61Var = zfz0Var.y.a;
        o61Var.getClass();
        o61Var.a.a("ArbitraryTips.DidTapCancelButton", new HashMap(), 1, new HashMap());
        ((yfz0) zfz0Var.Dg()).close();
    }

    private final void setupInputField() {
        this.inputComponent.setMaxLines(1);
        this.inputComponent.setTextSize(mrg0.component_text_size_body);
        this.inputComponent.setOnEditorActionListener(new ff2(16, this));
        this.inputComponent.setOnKeyboardCloseListener(new wfz0(this, 1));
        this.textChangeJob = tje.N(this.coroutineScope, null, null, new TipsInputModalView$setupInputField$$inlined$safeCollectIn$1(this.inputComponent.textValueFlow(), null, this), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupInputField$lambda$0(TipsInputModalView tipsInputModalView, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 || !tipsInputModalView.confirmAvailable) {
            return true;
        }
        tipsInputModalView.confirmClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupInputField$lambda$1(TipsInputModalView tipsInputModalView) {
        ListItemInputComponent listItemInputComponent = tipsInputModalView.inputComponent;
        if (listItemInputComponent != null) {
            listItemInputComponent.post(new ce0(listItemInputComponent, 15));
        }
        tipsInputModalView.inputComponent.clearFocus();
        tipsInputModalView.requestFocus();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.BindingModalView
    public xfz0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(zkh0.tips_input_modal_view, parent, false);
        int i = p8h0.cancel;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = p8h0.confirm;
            ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent2 != null) {
                i = p8h0.tips_input;
                ListItemInputComponent listItemInputComponent = (ListItemInputComponent) cma1.O(i, inflate);
                if (listItemInputComponent != null) {
                    return new xfz0((LinearLayout) inflate, buttonComponent, buttonComponent2, listItemInputComponent);
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.yfz0
    public void close() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.BindingModalView, ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    @Override // defpackage.yfz0
    public void enableConfirmButton(boolean enableConfirm) {
        this.confirmAvailable = enableConfirm;
        this.confirm.setEnabled(enableConfirm);
        this.confirm.setButtonBackground(new bdc(enableConfirm ? xng0.controlMain : xng0.controlMinor));
        this.confirm.setButtonTitleColor(new bdc(enableConfirm ? xng0.textOnControl : xng0.textOnControlMinor));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new pxy0(5, this));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        setupInputField();
        this.cancel.setDebounceClickListener(new kux0(14, this.presenter));
        this.confirm.setDebounceClickListener(new wfz0(this, 0));
        enableConfirmButton(this.confirmAvailable);
        zfz0 zfz0Var = this.presenter;
        zfz0Var.Bg(this);
        int i = kyh0.tips_another_amount_hint;
        bgz0 bgz0Var = zfz0Var.w;
        wze0 wze0Var = bgz0Var.d;
        o2y0 o2y0Var = bgz0Var.c;
        ief iefVar = wze0Var.b(o2y0Var.b()).d;
        if (iefVar != null) {
            str = iefVar.d;
            if (str == null) {
                str = iefVar.a;
            }
        } else {
            str = null;
        }
        ief iefVar2 = bgz0Var.d.b(o2y0Var.b()).d;
        showInputHint(i, str, (iefVar2 != null ? iefVar2.a : null) != null ? iefVar2.a : null);
        showDecimalDigitsCount(bgz0Var.c().a().a);
        to31 to31Var = zfz0Var.y.b;
        to31Var.getClass();
        to31Var.a.a("view.arbitrary_tips", new HashMap(), 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        l8x l8xVar = this.textChangeJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onModalViewAppear(int contentTop) {
        super.onModalViewAppear(contentTop);
        this.inputComponent.requestFocus();
    }

    public final void setPreviousValue(String previousValue) {
        this.inputComponent.setText(previousValue == null ? "" : previousValue);
        boolean z = (previousValue == null || previousValue.length() == 0) ? false : true;
        this.confirmAvailable = z;
        enableConfirmButton(z);
    }

    @Override // defpackage.yfz0
    public void showDecimalDigitsCount(int decimalDigitsCount) {
        this.inputComponent.getInput().setFilters(new DecimalDigitsInputFilter[]{new DecimalDigitsInputFilter(decimalDigitsCount)});
        this.inputComponent.getInput().setInputType(decimalDigitsCount == 0 ? 2 : 8194);
    }

    @Override // defpackage.yfz0
    public void showInputError(int errorId, String param) {
        this.inputComponent.setAlertText(c.H(this, errorId, param));
    }

    @Override // defpackage.yfz0
    public void showInputHint(int hintResId, String priceSign, String priceCurrencyText) {
        String string;
        if (priceSign == null || (string = c.H(this, hintResId, priceSign)) == null) {
            string = getContext().getString(hintResId);
        }
        this.inputComponent.setTitle(string);
        if (priceCurrencyText == null || priceCurrencyText.length() == 0) {
            this.inputComponent.setTitleContentDescription(string);
        } else {
            this.inputComponent.setTitleContentDescription(c.H(this, hintResId, priceCurrencyText));
        }
    }
}
