package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.e5z0;
import defpackage.g8e;
import defpackage.i5z0;
import defpackage.k4o;
import defpackage.t3i0;
import defpackage.t530;
import defpackage.w511;
import java.util.Locale;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u001aB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/widgets/common/MoneyAmountTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/ybsdk/widgets/common/MoneyAmountTextView$State;", "viewState", "Lzy11;", "render", "(Lcom/ybsdk/widgets/common/MoneyAmountTextView$State;)V", "currentState", "Lcom/ybsdk/widgets/common/MoneyAmountTextView$State;", "normalTextColor", CA20Status.STATUS_USER_I, "errorTextColor", "successTextColor", "progressTextColor", "Companion", "State", "t530", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoneyAmountTextView extends AppCompatTextView {
    public static final t530 Companion = new t530();
    private static final String TAG = "MoneyAmountTextView";
    private State currentState;
    private int errorTextColor;
    private int normalTextColor;
    private int progressTextColor;
    private int successTextColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/widgets/common/MoneyAmountTextView$State;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "SUCCESS", "ERROR", "PROCESSING", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NORMAL = new State("NORMAL", 0);
        public static final State SUCCESS = new State("SUCCESS", 1);
        public static final State ERROR = new State("ERROR", 2);
        public static final State PROCESSING = new State("PROCESSING", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NORMAL, SUCCESS, ERROR, PROCESSING};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private State(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public MoneyAmountTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentState = State.NORMAL;
        this.normalTextColor = getCurrentTextColor();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkMoneyAmountTextView);
        try {
            if (obtainStyledAttributes.hasValue(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneyErrorTextColor)) {
                this.errorTextColor = obtainStyledAttributes.getColor(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneyErrorTextColor, 0);
            }
            if (obtainStyledAttributes.hasValue(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneySuccessTextColor)) {
                this.successTextColor = obtainStyledAttributes.getColor(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneySuccessTextColor, 0);
            }
            this.progressTextColor = obtainStyledAttributes.getColor(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneyProgressTextColor, 0);
            if (obtainStyledAttributes.hasValue(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneyState)) {
                render(State.values()[obtainStyledAttributes.getInt(t3i0.YbSdkMoneyAmountTextView_ybsdk_moneyState, 0)]);
            }
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void render(State viewState) {
        int i;
        if (this.currentState == viewState) {
            return;
        }
        this.currentState = viewState;
        int i2 = i.a[viewState.ordinal()];
        if (i2 == 1) {
            i = this.normalTextColor;
        } else if (i2 == 2) {
            i = this.successTextColor;
        } else if (i2 == 3) {
            i = this.errorTextColor;
        } else {
            if (i2 != 4) {
                w511.b();
                return;
            }
            i = this.progressTextColor;
        }
        String hexString = Integer.toHexString(this.normalTextColor);
        Locale locale = Locale.ROOT;
        String upperCase = hexString.toUpperCase(locale);
        String upperCase2 = Integer.toHexString(this.successTextColor).toUpperCase(locale);
        String upperCase3 = Integer.toHexString(this.errorTextColor).toUpperCase(locale);
        String upperCase4 = Integer.toHexString(this.progressTextColor).toUpperCase(locale);
        e5z0 e5z0Var = i5z0.a;
        e5z0Var.m(TAG);
        StringBuilder sb = new StringBuilder("setState: n=");
        sb.append(upperCase);
        sb.append(", s=");
        g8e.D(sb, upperCase2, ", e=", upperCase3, ", p=");
        sb.append(upperCase4);
        e5z0Var.a(sb.toString(), new Object[0]);
        setTextColor(i);
    }

    public MoneyAmountTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MoneyAmountTextView(Context context) {
        this(context, null, 0);
    }
}
