package com.yandex.go.transfer_requirement.ui.flight_input;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.flh0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.mi01;
import defpackage.mrg0;
import defpackage.n751;
import defpackage.ny61;
import defpackage.op31;
import defpackage.qje;
import defpackage.rnr;
import defpackage.sm01;
import defpackage.tls;
import defpackage.v8h0;
import defpackage.w511;
import defpackage.xng0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u000b*\u0001)\u0018\u0000 .2\u00020\u0001:\u0004/012B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\n2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\n\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00063"}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setupInput", "()V", "", "isFocused", "onInputFocusChanged", "(Z)V", "setErrorColors", "setNormalColors", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$ValidationMode;", "mode", "setValidationMode", "(Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$ValidationMode;)V", "Lkotlin/Function1;", "", "listener", "setOnEditFinishedListener", "(Ltls;)V", "Lrnr;", "uiState", "render", "(Lrnr;)V", "Lmi01;", "binding", "Lmi01;", "onNumberFinishedTextListener", "Ltls;", "minCommitLength", CA20Status.STATUS_USER_I, "com/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$inputTextListener$1", "inputTextListener", "Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$inputTextListener$1;", "hasError", "Z", "Companion", "ValidationMode", "FlightNumberInputFilter", "PlainAlphanumericInputFilter", "sm01", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransferNumberInputView extends GoLinearLayout {
    public static final sm01 Companion = new sm01();
    private static final int MAX_INPUT_LENGTH_FLIGHT = 8;
    private static final int MAX_INPUT_LENGTH_PLAIN = Integer.MAX_VALUE;
    private static final int MIN_INPUT_LENGTH_FLIGHT = 4;
    private static final int MIN_INPUT_LENGTH_PLAIN = 1;
    private final mi01 binding;
    private boolean hasError;
    private final TransferNumberInputView$inputTextListener$1 inputTextListener;
    private int minCommitLength;
    private tls onNumberFinishedTextListener;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\f\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$FlightNumberInputFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "filterAvailableSymbols", "", "isSpace", "", "", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class FlightNumberInputFilter implements InputFilter {
        private final String filterAvailableSymbols(String str) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (Character.isLetterOrDigit(charAt) || isSpace(charAt)) {
                    sb.append(charAt);
                }
            }
            return sb.toString();
        }

        private final boolean isSpace(char c) {
            return c == ' ';
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            int i;
            String obj = source.subSequence(start, end).toString();
            String obj2 = dest.toString();
            int i2 = 0;
            String p = g8e.p(obj2.substring(0, dstart), obj, obj2.substring(dend));
            if ((cvu0.x(p, " ", false) && evu0.J(obj)) || jl40.l(obj, ". ")) {
                return "";
            }
            if (p.length() > 2) {
                while (true) {
                    if (i2 < p.length()) {
                        if (!Character.isLetterOrDigit(p.charAt(i2))) {
                            break;
                        }
                        i2++;
                    } else if (obj.length() > 0 && start <= (i = 2 - start) && i <= end) {
                        return filterAvailableSymbols(new StringBuilder(obj).insert(i, " ").toString());
                    }
                }
            }
            return filterAvailableSymbols(obj);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$PlainAlphanumericInputFilter;", "Landroid/text/InputFilter;", "<init>", "()V", "filter", "", "source", "start", "", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class PlainAlphanumericInputFilter implements InputFilter {
        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            String obj = source.subSequence(start, end).toString();
            for (int i = 0; i < obj.length(); i++) {
                char charAt = obj.charAt(i);
                if (!Character.isLetterOrDigit(charAt) && charAt != ' ') {
                    return "";
                }
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/transfer_requirement/ui/flight_input/TransferNumberInputView$ValidationMode;", "", "FLIGHT_NUMBER", "PLAIN_TEXT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ValidationMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ValidationMode[] $VALUES;
        public static final ValidationMode FLIGHT_NUMBER;
        public static final ValidationMode PLAIN_TEXT;

        static {
            ValidationMode validationMode = new ValidationMode("FLIGHT_NUMBER", 0);
            FLIGHT_NUMBER = validationMode;
            ValidationMode validationMode2 = new ValidationMode("PLAIN_TEXT", 1);
            PLAIN_TEXT = validationMode2;
            ValidationMode[] validationModeArr = {validationMode, validationMode2};
            $VALUES = validationModeArr;
            $ENTRIES = kotlin.enums.a.a(validationModeArr);
        }

        public static ValidationMode valueOf(String str) {
            return (ValidationMode) Enum.valueOf(ValidationMode.class, str);
        }

        public static ValidationMode[] values() {
            return (ValidationMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView$inputTextListener$1] */
    public TransferNumberInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(flh0.transfer_flight_input_layout, this);
        int i2 = v8h0.flight_info_message;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
        if (robotoTextView != null) {
            i2 = v8h0.number_info_input;
            FlightNumberInputComponent flightNumberInputComponent = (FlightNumberInputComponent) cma1.O(i2, this);
            if (flightNumberInputComponent != null) {
                this.binding = new mi01(this, robotoTextView, flightNumberInputComponent);
                this.minCommitLength = 4;
                this.inputTextListener = new TextWatcher() { // from class: com.yandex.go.transfer_requirement.ui.flight_input.TransferNumberInputView$inputTextListener$1
                    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
                    
                        r2 = r2.this$0.onNumberFinishedTextListener;
                     */
                    @Override // android.text.TextWatcher
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public void afterTextChanged(Editable s) {
                        mi01 mi01Var;
                        int i3;
                        tls tlsVar;
                        mi01Var = TransferNumberInputView.this.binding;
                        String obj = mi01Var.c.value().toString();
                        int length = obj.length();
                        i3 = TransferNumberInputView.this.minCommitLength;
                        if ((length >= i3 || obj.length() == 0) && tlsVar != null) {
                            tlsVar.invoke(obj);
                        }
                    }

                    @Override // android.text.TextWatcher
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override // android.text.TextWatcher
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }
                };
                setOrientation(1);
                setupInput();
                return;
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInputFocusChanged(boolean isFocused) {
        if (this.hasError) {
            return;
        }
        this.binding.c.setDividerColor(isFocused ? xng0.textMain : xng0.textMinor);
    }

    private final void setErrorColors() {
        mi01 mi01Var = this.binding;
        int t = qje.t(xng0.error, getContext());
        mi01Var.c.getInput().setTextColor(t);
        mi01Var.b.setTextColor(t);
        mi01Var.c.setDividerColor(xng0.error);
    }

    private final void setNormalColors() {
        mi01 mi01Var = this.binding;
        mi01Var.c.getInput().setTextColor(qje.t(xng0.textMain, getContext()));
        mi01Var.b.setTextColor(qje.t(xng0.textMinor, getContext()));
        FlightNumberInputComponent flightNumberInputComponent = mi01Var.c;
        flightNumberInputComponent.setDividerColor(flightNumberInputComponent.getInputFocused() ? xng0.textMain : xng0.textMinor);
    }

    private final void setupInput() {
        mi01 mi01Var = this.binding;
        mi01Var.c.setOnFocusStateChanged(new TransferNumberInputView$setupInput$1$1(1, this, TransferNumberInputView.class, "onInputFocusChanged", "onInputFocusChanged(Z)V", 0));
        mi01Var.c.setDividerVisibility(true);
        setValidationMode(ValidationMode.FLIGHT_NUMBER);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.binding.c.addTextChangedListener(this.inputTextListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.binding.c.removeTextChangedListener(this.inputTextListener);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if ((r5 == null ? false : r5.a.q(8)) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void render(rnr uiState) {
        mi01 mi01Var = this.binding;
        int dimensionPixelSize = getResources().getDimensionPixelSize(mrg0.go_design_m_space);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(mrg0.list_item_component_size_L);
        FlightNumberInputComponent flightNumberInputComponent = mi01Var.c;
        RobotoTextView robotoTextView = mi01Var.b;
        flightNumberInputComponent.setVisibility(0);
        if (flightNumberInputComponent.getInputFocused()) {
            WeakHashMap weakHashMap = b.a;
            n751 a = op31.a(flightNumberInputComponent);
        }
        CharSequence charSequence = uiState.d;
        if (charSequence != null) {
            flightNumberInputComponent.setValue(charSequence);
        }
        if (uiState.b == null) {
            flightNumberInputComponent.updateDividerMargins(dimensionPixelSize, dimensionPixelSize);
        } else {
            flightNumberInputComponent.updateDividerMargins(dimensionPixelSize2, dimensionPixelSize);
        }
        CharSequence charSequence2 = uiState.a;
        CharSequence charSequence3 = uiState.c;
        Drawable drawable = uiState.b;
        String obj = charSequence2 != null ? charSequence2.toString() : null;
        if (obj == null) {
            obj = "";
        }
        flightNumberInputComponent.setInputTitle(obj);
        flightNumberInputComponent.setLeadImage(drawable);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) robotoTextView.getLayoutParams();
        if (drawable != null) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        robotoTextView.setVisibility((charSequence3 == null || charSequence3.length() == 0) ? 8 : 0);
        robotoTextView.setText(charSequence3);
        boolean z = uiState.e;
        this.hasError = z;
        if (z) {
            setErrorColors();
        } else {
            setNormalColors();
        }
    }

    public final void setOnEditFinishedListener(tls listener) {
        this.onNumberFinishedTextListener = listener;
    }

    public final void setValidationMode(ValidationMode mode) {
        int i;
        int i2;
        InputFilter[] inputFilterArr;
        int[] iArr = a.a;
        int i3 = iArr[mode.ordinal()];
        if (i3 == 1) {
            i = 4;
        } else {
            if (i3 != 2) {
                w511.b();
                return;
            }
            i = 1;
        }
        this.minCommitLength = i;
        int i4 = iArr[mode.ordinal()];
        if (i4 == 1) {
            i2 = 8;
        } else {
            if (i4 != 2) {
                w511.b();
                return;
            }
            i2 = Integer.MAX_VALUE;
        }
        FlightNumberInputComponent flightNumberInputComponent = this.binding.c;
        int i5 = iArr[mode.ordinal()];
        if (i5 == 1) {
            inputFilterArr = new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(i2), new FlightNumberInputFilter()};
        } else {
            if (i5 != 2) {
                w511.b();
                return;
            }
            inputFilterArr = new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(i2), new PlainAlphanumericInputFilter()};
        }
        flightNumberInputComponent.setFilters(inputFilterArr);
    }

    public TransferNumberInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TransferNumberInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TransferNumberInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
