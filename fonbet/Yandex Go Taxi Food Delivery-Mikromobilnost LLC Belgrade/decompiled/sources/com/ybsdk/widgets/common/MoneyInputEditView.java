package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import defpackage.i8m;
import defpackage.m020;
import defpackage.sls;
import defpackage.t3i0;
import defpackage.tm60;
import defpackage.x530;
import defpackage.y530;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001e\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001e\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*¨\u0006/"}, d2 = {"Lcom/ybsdk/widgets/common/MoneyInputEditView;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "initialize", "()V", "textLength", "forceCursorToEnd", "(I)V", "selStart", "selEnd", "onSelectionChanged", "(II)V", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "", "requestFocus", "(ILandroid/graphics/Rect;)Z", "Ljava/math/BigDecimal;", "getMoney", "()Ljava/math/BigDecimal;", "isNormalizingSelection", "Z", "Lkotlin/Function0;", "onInputFilterError", "Lsls;", "getOnInputFilterError", "()Lsls;", "setOnInputFilterError", "(Lsls;)V", "hideKeyboardOnFocus", "getHideKeyboardOnFocus", "()Z", "setHideKeyboardOnFocus", "(Z)V", "isCursorFixedInPosition", "setCursorFixedInPosition", "Companion", "x530", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoneyInputEditView extends AppCompatEditText {
    private static final x530 Companion = new x530();

    @Deprecated
    public static final char DEFAULT_VALUE = '0';

    @Deprecated
    public static final long SHOW_KEYBOARD_DELAY_MS = 100;
    private boolean hideKeyboardOnFocus;
    private boolean isCursorFixedInPosition;
    private boolean isNormalizingSelection;
    private sls onInputFilterError;

    public MoneyInputEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isCursorFixedInPosition = true;
        initialize();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkMoneyInputEditView);
        this.hideKeyboardOnFocus = obtainStyledAttributes.getBoolean(t3i0.YbSdkMoneyInputEditView_ybsdk_hide_soft_keyboard_on_focus, false);
        this.isCursorFixedInPosition = obtainStyledAttributes.getBoolean(t3i0.YbSdkMoneyInputEditView_ybsdk_is_cursor_fixed, false);
        obtainStyledAttributes.recycle();
    }

    private final void forceCursorToEnd(int textLength) {
        this.isNormalizingSelection = true;
        setSelection(textLength, textLength);
        this.isNormalizingSelection = false;
    }

    private final void initialize() {
        y530 y530Var = j.a;
        j.a(this, false, false, new m020(12, this), 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initialize$lambda$3(MoneyInputEditView moneyInputEditView) {
        sls slsVar = moneyInputEditView.onInputFilterError;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    public final boolean getHideKeyboardOnFocus() {
        return this.hideKeyboardOnFocus;
    }

    public final BigDecimal getMoney() {
        String obj;
        Editable text = getText();
        if (text == null || (obj = text.toString()) == null) {
            return BigDecimal.ZERO;
        }
        Locale locale = tm60.a;
        BigDecimal g = tm60.g(obj);
        return g == null ? BigDecimal.ZERO : g;
    }

    public final sls getOnInputFilterError() {
        return this.onInputFilterError;
    }

    /* renamed from: isCursorFixedInPosition, reason: from getter */
    public final boolean getIsCursorFixedInPosition() {
        return this.isCursorFixedInPosition;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int selStart, int selEnd) {
        if (this.isNormalizingSelection) {
            return;
        }
        Editable text = getText();
        if (text != null) {
            int length = text.length();
            if (length == 1 && text.charAt(0) == '0' && selStart == 0 && selEnd == 0) {
                forceCursorToEnd(length);
            } else if (this.isCursorFixedInPosition && (selStart != length || selEnd != length)) {
                forceCursorToEnd(length);
            }
        }
        super.onSelectionChanged(selStart, selEnd);
    }

    @Override // android.view.View
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        boolean requestFocus = super.requestFocus(direction, previouslyFocusedRect);
        if (this.hideKeyboardOnFocus) {
            postDelayed(new i8m(28, this), 100L);
        }
        return requestFocus;
    }

    public final void setCursorFixedInPosition(boolean z) {
        this.isCursorFixedInPosition = z;
    }

    public final void setHideKeyboardOnFocus(boolean z) {
        this.hideKeyboardOnFocus = z;
    }

    public final void setOnInputFilterError(sls slsVar) {
        this.onInputFilterError = slsVar;
    }

    public MoneyInputEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ MoneyInputEditView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public MoneyInputEditView(Context context) {
        this(context, null, 0, 6, null);
    }
}
