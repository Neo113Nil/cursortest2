package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bmg0;
import defpackage.cg91;
import defpackage.evu0;
import defpackage.fch0;
import defpackage.m020;
import defpackage.mg;
import defpackage.pk31;
import defpackage.poh0;
import defpackage.sm91;
import defpackage.t3i0;
import defpackage.tls;
import defpackage.tm60;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rJ1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\u000e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e0\u001f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000e¢\u0006\u0004\b$\u0010\u0011R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/ybsdk/widgets/common/MoneyInputView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "initialize", "announceAmount", "()V", "", BackendConfig.Restrictions.ENABLED, "setEnabled", "(Z)V", "", "getText", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "getTextAsDecimal", "()Ljava/math/BigDecimal;", "text", "setText", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "", "onTextChanged", "addTextChangedListener", "(Ltls;)V", "vibrate", "Lcom/ybsdk/widgets/common/MoneyInputEditView;", "textInput", "Lcom/ybsdk/widgets/common/MoneyInputEditView;", "Landroid/widget/TextView;", "textCurrency", "Landroid/widget/TextView;", "isSettingText", "Z", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoneyInputView extends ConstraintLayout {
    private boolean isSettingText;
    private TextView textCurrency;
    private MoneyInputEditView textInput;

    public MoneyInputView(Context context) {
        super(context);
        initialize(context, null, 0, 0);
    }

    private final void announceAmount() {
        MoneyInputEditView moneyInputEditView = this.textInput;
        if (moneyInputEditView == null) {
            moneyInputEditView = null;
        }
        Editable text = moneyInputEditView.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        TextView textView = this.textCurrency;
        if (textView == null) {
            textView = null;
        }
        CharSequence text2 = textView.getText();
        String obj2 = text2 != null ? text2.toString() : null;
        String str = obj + " " + (obj2 != null ? obj2 : "");
        setContentDescription(str);
        androidx.core.view.b.r(this, str);
    }

    private final void initialize(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        LayoutInflater.from(context).inflate(poh0.ybsdk_layout_moneyinput, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, t3i0.YbSdkMoneyInputView, defStyleAttr, defStyleRes);
        try {
            this.textCurrency = (TextView) findViewById(fch0.text_moneyinput_currency);
            String string = obtainStyledAttributes.getString(t3i0.YbSdkMoneyInputView_ybsdk_text);
            this.textInput = (MoneyInputEditView) findViewById(fch0.text_moneyinput_input);
            setText(string);
            int integer = obtainStyledAttributes.getInteger(t3i0.YbSdkMoneyInputView_android_imeOptions, 0);
            MoneyInputEditView moneyInputEditView = this.textInput;
            if (moneyInputEditView == null) {
                moneyInputEditView = null;
            }
            moneyInputEditView.setImeOptions(integer);
            MoneyInputEditView moneyInputEditView2 = this.textInput;
            if (moneyInputEditView2 == null) {
                moneyInputEditView2 = null;
            }
            moneyInputEditView2.setOnInputFilterError(new m020(14, this));
            obtainStyledAttributes.recycle();
            MoneyInputEditView moneyInputEditView3 = this.textInput;
            if (moneyInputEditView3 == null) {
                moneyInputEditView3 = null;
            }
            androidx.core.view.b.p(moneyInputEditView3, new mg(21, this));
            MoneyInputEditView moneyInputEditView4 = this.textInput;
            (moneyInputEditView4 != null ? moneyInputEditView4 : null).setAccessibilityLiveRegion(1);
            setImportantForAccessibility(2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initialize$lambda$1$lambda$0(MoneyInputView moneyInputView) {
        moneyInputView.vibrate();
        sm91.h(bmg0.ybsdk_animation_wiggle, moneyInputView);
        return zy11.a;
    }

    public final void addTextChangedListener(final tls onTextChanged) {
        MoneyInputEditView moneyInputEditView = this.textInput;
        if (moneyInputEditView == null) {
            moneyInputEditView = null;
        }
        moneyInputEditView.addTextChangedListener(new TextWatcher() { // from class: com.ybsdk.widgets.common.MoneyInputView$addTextChangedListener$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                boolean z;
                MoneyInputEditView moneyInputEditView2;
                TextView textView;
                z = MoneyInputView.this.isSettingText;
                if (z) {
                    return;
                }
                if (s != null && evu0.y(s, Extension.DOT_CHAR, false)) {
                    MoneyInputView.this.setText(s.toString());
                }
                tls tlsVar = onTextChanged;
                String valueOf = String.valueOf(s);
                Locale locale = tm60.a;
                tlsVar.invoke(tm60.i(valueOf));
                MoneyInputView moneyInputView = MoneyInputView.this;
                moneyInputEditView2 = moneyInputView.textInput;
                if (moneyInputEditView2 == null) {
                    moneyInputEditView2 = null;
                }
                Editable text = moneyInputEditView2.getText();
                String obj = text != null ? text.toString() : null;
                if (obj == null) {
                    obj = "";
                }
                textView = MoneyInputView.this.textCurrency;
                if (textView == null) {
                    textView = null;
                }
                CharSequence text2 = textView.getText();
                String obj2 = text2 != null ? text2.toString() : null;
                moneyInputView.setContentDescription(obj + " " + (obj2 != null ? obj2 : ""));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    public final EditText getEditText() {
        MoneyInputEditView moneyInputEditView = this.textInput;
        if (moneyInputEditView == null) {
            return null;
        }
        return moneyInputEditView;
    }

    public final String getText() {
        MoneyInputEditView moneyInputEditView = this.textInput;
        if (moneyInputEditView == null) {
            moneyInputEditView = null;
        }
        Editable text = moneyInputEditView.getText();
        String obj = text != null ? text.toString() : null;
        return obj == null ? "" : obj;
    }

    public final BigDecimal getTextAsDecimal() {
        MoneyInputEditView moneyInputEditView = this.textInput;
        if (moneyInputEditView == null) {
            moneyInputEditView = null;
        }
        return moneyInputEditView.getMoney();
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        MoneyInputEditView moneyInputEditView = this.textInput;
        if (moneyInputEditView == null) {
            moneyInputEditView = null;
        }
        moneyInputEditView.setEnabled(enabled);
        TextView textView = this.textCurrency;
        (textView != null ? textView : null).setEnabled(enabled);
    }

    public final void setText(String text) {
        MoneyInputEditView moneyInputEditView = this.textInput;
        String str = null;
        if (moneyInputEditView == null) {
            moneyInputEditView = null;
        }
        this.isSettingText = true;
        if (text != null) {
            Locale locale = tm60.a;
            str = tm60.i(text);
        }
        moneyInputEditView.setText(str);
        moneyInputEditView.setSelection(getText().length());
        this.isSettingText = false;
        if (moneyInputEditView.isEnabled()) {
            announceAmount();
        }
    }

    public final void vibrate() {
        cg91.c(this, pk31.c);
    }

    public MoneyInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet, 0, 0);
    }

    public MoneyInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet, i, 0);
    }

    public MoneyInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet, i, i2);
    }
}
