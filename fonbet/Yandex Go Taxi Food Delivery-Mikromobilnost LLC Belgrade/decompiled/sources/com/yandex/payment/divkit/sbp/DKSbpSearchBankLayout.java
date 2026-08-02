package com.yandex.payment.divkit.sbp;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.ci8;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.l9h0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.ulh0;
import defpackage.wj91;
import defpackage.zoa0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/payment/divkit/sbp/DKSbpSearchBankLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", "", "Lzy11;", "listener", "setOnTextChangeListener", "(Ltls;)V", "requestInputFocus", "()V", "Lzoa0;", "binding", "Lzoa0;", "divkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DKSbpSearchBankLayout extends FrameLayout {
    private final zoa0 binding;

    public DKSbpSearchBankLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(ulh0.paymentsdk_divkit_bank_search_input_layout, this);
        int i = l9h0.bankInputEditText;
        TextInputEditText textInputEditText = (TextInputEditText) cma1.O(i, this);
        if (textInputEditText != null) {
            i = l9h0.bankInputLayout;
            if (((TextInputLayout) cma1.O(i, this)) != null) {
                i = l9h0.clearInputButton;
                ImageView imageView = (ImageView) cma1.O(i, this);
                if (imageView != null) {
                    this.binding = new zoa0(this, textInputEditText, imageView);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnTextChangeListener$lambda$1(DKSbpSearchBankLayout dKSbpSearchBankLayout, View view) {
        dKSbpSearchBankLayout.binding.b.setText((CharSequence) null);
    }

    public final void requestInputFocus() {
        TextInputEditText textInputEditText = this.binding.b;
        textInputEditText.requestFocus();
        wj91.c(textInputEditText);
    }

    public final void setOnTextChangeListener(final tls listener) {
        this.binding.b.addTextChangedListener(new TextWatcher() { // from class: com.yandex.payment.divkit.sbp.DKSbpSearchBankLayout$setOnTextChangeListener$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                zoa0 zoa0Var;
                tls tlsVar = tls.this;
                String obj = s != null ? s.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                tlsVar.invoke(obj);
                zoa0Var = this.binding;
                zoa0Var.c.setVisibility((s == null || evu0.J(s)) ? 8 : 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
        this.binding.c.setOnClickListener(new ci8(23, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DKSbpSearchBankLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DKSbpSearchBankLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
