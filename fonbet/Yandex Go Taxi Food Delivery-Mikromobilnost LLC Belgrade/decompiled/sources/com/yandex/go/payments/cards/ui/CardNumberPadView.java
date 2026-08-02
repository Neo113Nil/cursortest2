package com.yandex.go.payments.cards.ui;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.dn7;
import defpackage.e6h0;
import defpackage.luh0;
import defpackage.mg;
import defpackage.nwy0;
import defpackage.rk6;
import defpackage.rp31;
import defpackage.vk8;
import defpackage.vng;
import defpackage.y2h0;
import defpackage.zy11;
import java.text.DecimalFormatSymbols;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010'J!\u0010+\u001a\u00020\u00122\b\b\u0001\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u001cH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0012H\u0002¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\u0012H\u0002¢\u0006\u0004\b.\u0010'J\u0017\u00101\u001a\u00020\u00122\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010AR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010B¨\u0006C"}, d2 = {"Lcom/yandex/go/payments/cards/ui/CardNumberPadView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Ljava/util/function/Supplier;", "Landroid/view/View;", "focusedViewSupplier", "Lzy11;", "setFocusedViewSupplier", "(Ljava/util/function/Supplier;)V", "resId", "setConfirmButtonText", "(I)V", "", BackendConfig.Restrictions.ENABLED, "setConfirmButtonEnabled", "(Z)V", "Landroid/view/View$OnClickListener;", "onConfirmClickedListener", "setOnConfirmClickedListener", "(Landroid/view/View$OnClickListener;)V", "show", "showDecimalSeparator", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "init", "()V", "bindClickListeners", "viewId", "onClick", "setOnClickListener", "(ILandroid/view/View$OnClickListener;)V", "handleConfirmClicked", "onBackspaceClick", "", "c", "addCharToFocusedView", "(C)V", "Landroidx/core/view/AccessibilityDelegateCompat;", "createConfirmButtonAccessibilityDelegate", "()Landroidx/core/view/AccessibilityDelegateCompat;", "Lru/yandex/taxi/design/ButtonComponent;", "confirmButton", "Lru/yandex/taxi/design/ButtonComponent;", "Landroid/widget/ImageView;", "backspace", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "decimalSeparatorButton", "Landroid/widget/TextView;", "decimalSeparatorSymbol", CA20Status.STATUS_REQUEST_C, "Landroid/view/View$OnClickListener;", "Ljava/util/function/Supplier;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardNumberPadView extends ConstraintLayout implements nwy0 {
    public static final int $stable = 8;
    private final ImageView backspace;
    private final ButtonComponent confirmButton;
    private final TextView decimalSeparatorButton;
    private char decimalSeparatorSymbol;
    private Supplier<View> focusedViewSupplier;
    private View.OnClickListener onConfirmClickedListener;

    public CardNumberPadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, luh0.card_number_pad, true);
        int i2 = e6h0.confirm;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.confirmButton = (ButtonComponent) ((View) rp31.d(this, i2));
        this.backspace = (ImageView) ((View) rp31.d(this, e6h0.backspace));
        this.decimalSeparatorButton = (TextView) ((View) rp31.d(this, e6h0.decimal_separator));
        this.decimalSeparatorSymbol = HexString.CHAR_SPACE;
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCharToFocusedView(char c) {
        View currentFocus;
        Supplier<View> supplier = this.focusedViewSupplier;
        if (supplier != null) {
            currentFocus = supplier.get();
        } else {
            Context context = getContext();
            currentFocus = context instanceof Activity ? ((Activity) context).getCurrentFocus() : null;
        }
        if (currentFocus instanceof EditText) {
            EditText editText = (EditText) currentFocus;
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            Editable text = editText.getText();
            if (selectionStart < 0) {
                text.append((CharSequence) String.valueOf(c));
                return;
            }
            if (selectionEnd > selectionStart) {
                text.replace(selectionStart, selectionEnd, "");
            }
            text.insert(selectionStart, String.valueOf(c));
        }
    }

    private final void bindClickListeners() {
        ru.yandex.taxi.design.utils.c.z(new rk6(26, this), this.decimalSeparatorButton);
        setOnClickListener(e6h0.num1, new vk8(this, 3));
        setOnClickListener(e6h0.num2, new vk8(this, 4));
        setOnClickListener(e6h0.num3, new vk8(this, 5));
        setOnClickListener(e6h0.num4, new vk8(this, 6));
        setOnClickListener(e6h0.num5, new vk8(this, 7));
        setOnClickListener(e6h0.num6, new vk8(this, 8));
        setOnClickListener(e6h0.num7, new vk8(this, 9));
        setOnClickListener(e6h0.num8, new vk8(this, 10));
        setOnClickListener(e6h0.num9, new vk8(this, 0));
        setOnClickListener(e6h0.num0, new vk8(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindClickListeners$lambda$0(CardNumberPadView cardNumberPadView) {
        cardNumberPadView.addCharToFocusedView(cardNumberPadView.decimalSeparatorSymbol);
        return zy11.a;
    }

    private final AccessibilityDelegateCompat createConfirmButtonAccessibilityDelegate() {
        return new mg(9, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConfirmClicked() {
        View.OnClickListener onClickListener = this.onConfirmClickedListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    private final void init() {
        bindClickListeners();
        this.confirmButton.setDebounceClickListener(new dn7(13, this));
        androidx.core.view.b.p(this.confirmButton, createConfirmButtonAccessibilityDelegate());
        this.backspace.setOnClickListener(new vk8(this, 1));
        this.backspace.setOnTouchListener(new OnClickRepeatingTouchListener());
        char decimalSeparator = DecimalFormatSymbols.getInstance().getDecimalSeparator();
        this.decimalSeparatorSymbol = decimalSeparator;
        this.decimalSeparatorButton.setText(String.valueOf(decimalSeparator));
        setLayoutDirection(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackspaceClick() {
        Context context = getContext();
        View currentFocus = context instanceof Activity ? ((Activity) context).getCurrentFocus() : null;
        if (currentFocus instanceof EditText) {
            EditText editText = (EditText) currentFocus;
            int selectionStart = editText.getSelectionStart();
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd > selectionStart) {
                editText.getText().replace(selectionStart, selectionEnd, "");
            } else if (selectionStart > 0) {
                editText.getText().replace(selectionStart - 1, selectionStart, "");
            }
        }
    }

    private final void setOnClickListener(int viewId, View.OnClickListener onClick) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ((View) rp31.d(this, viewId)).setOnClickListener(onClick);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        this.backspace.setImageDrawable(vng.t(y2h0.ic_backspace, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void setConfirmButtonEnabled(boolean enabled) {
        this.confirmButton.setEnabled(enabled);
        this.confirmButton.setAccent(enabled);
    }

    public final void setConfirmButtonText(int resId) {
        this.confirmButton.setText(resId);
    }

    public final void setFocusedViewSupplier(Supplier<View> focusedViewSupplier) {
        this.focusedViewSupplier = focusedViewSupplier;
    }

    public final void setOnConfirmClickedListener(View.OnClickListener onConfirmClickedListener) {
        this.onConfirmClickedListener = onConfirmClickedListener;
    }

    public final void showDecimalSeparator(boolean show) {
        this.decimalSeparatorButton.setVisibility(show ? 0 : 4);
    }

    public CardNumberPadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardNumberPadView(Context context) {
        this(context, null);
    }

    public CardNumberPadView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ru.yandex.taxi.design.utils.c.q(this, luh0.card_number_pad, true);
        int i3 = e6h0.confirm;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.confirmButton = (ButtonComponent) ((View) rp31.d(this, i3));
        this.backspace = (ImageView) ((View) rp31.d(this, e6h0.backspace));
        this.decimalSeparatorButton = (TextView) ((View) rp31.d(this, e6h0.decimal_separator));
        this.decimalSeparatorSymbol = HexString.CHAR_SPACE;
        init();
    }
}
