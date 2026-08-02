package com.ybsdk.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.c;
import defpackage.jah0;
import defpackage.lob1;
import defpackage.ny61;
import defpackage.qmh0;
import defpackage.ria0;
import defpackage.tls;
import defpackage.uyo0;
import defpackage.xia0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.sequences.b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u00020\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u001cR\u0016\u0010#\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010'\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/ybsdk/widgets/CvnInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lria0;", "paymentSdkAdapter", "Lzy11;", "initialize", "(Lria0;)V", "Lxia0;", "provideCvnInputInterface", "()Lxia0;", "Lkotlin/Function1;", "", "listener", "setOnReadyListener", "(Ltls;)V", "focusInput", "()V", "reset", "", "systemName", "setPaymentSystem", "(Ljava/lang/String;)V", "disableSoftKeyboard", "paymentSdkInputInterface", "Lxia0;", "Landroidx/appcompat/widget/AppCompatEditText;", "value", "textInput", "Landroidx/appcompat/widget/AppCompatEditText;", "getTextInput", "()Landroidx/appcompat/widget/AppCompatEditText;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CvnInputView extends ConstraintLayout {
    private xia0 paymentSdkInputInterface;
    private AppCompatEditText textInput;

    public CvnInputView(Context context) {
        super(context);
    }

    public final void disableSoftKeyboard() {
        AppCompatEditText appCompatEditText = this.textInput;
        if (appCompatEditText != null) {
            appCompatEditText.setShowSoftInputOnFocus(false);
        }
    }

    public final void focusInput() {
        xia0 xia0Var = this.paymentSdkInputInterface;
        if (xia0Var == null) {
            xia0Var = null;
        }
        xia0Var.focusInput();
    }

    public final AppCompatEditText getTextInput() {
        return this.textInput;
    }

    public final void initialize(ria0 paymentSdkAdapter) {
        LayoutInflater.from(getContext()).inflate(qmh0.ybsdk_cvn_input_layout, (ViewGroup) this, true);
        Pair b = paymentSdkAdapter.b(getContext(), lob1.f(getContext()));
        ViewGroup viewGroup = (ViewGroup) b.getFirst();
        xia0 xia0Var = (xia0) b.getSecond();
        ((ViewGroup) findViewById(jah0.inputContainer)).addView(viewGroup);
        this.paymentSdkInputInterface = xia0Var;
        this.textInput = (AppCompatEditText) b.j(b.g(c.a(viewGroup), new uyo0(28, AppCompatEditText.class)));
    }

    public final xia0 provideCvnInputInterface() {
        xia0 xia0Var = this.paymentSdkInputInterface;
        if (xia0Var == null) {
            xia0Var = null;
        }
        if (!xia0Var.isReady()) {
            ny61.r("You can call this click listener only when the CVN is ready.");
            return null;
        }
        xia0 xia0Var2 = this.paymentSdkInputInterface;
        if (xia0Var2 == null) {
            return null;
        }
        return xia0Var2;
    }

    public final void reset() {
        xia0 xia0Var = this.paymentSdkInputInterface;
        if (xia0Var == null) {
            xia0Var = null;
        }
        xia0Var.reset();
    }

    public final void setOnReadyListener(tls listener) {
        xia0 xia0Var = this.paymentSdkInputInterface;
        if (xia0Var == null) {
            xia0Var = null;
        }
        xia0Var.setOnReadyListener(listener);
    }

    public final void setPaymentSystem(String systemName) {
        xia0 xia0Var = this.paymentSdkInputInterface;
        if (xia0Var == null) {
            xia0Var = null;
        }
        xia0Var.a(systemName);
    }

    public CvnInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CvnInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CvnInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
