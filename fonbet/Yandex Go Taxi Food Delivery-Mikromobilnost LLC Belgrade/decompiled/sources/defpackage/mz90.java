package defpackage;

import com.yandex.plus.pay.ui.common.internal.error.content.PaymentErrorButtonContent$ClickAction;

/* loaded from: classes2.dex */
public final class mz90 {
    public final String a;
    public final PaymentErrorButtonContent$ClickAction b;

    public mz90(String str, PaymentErrorButtonContent$ClickAction paymentErrorButtonContent$ClickAction) {
        this.a = str;
        this.b = paymentErrorButtonContent$ClickAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz90)) {
            return false;
        }
        mz90 mz90Var = (mz90) obj;
        return this.a.equals(mz90Var.a) && this.b == mz90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentErrorButtonContent(text=" + this.a + ", clickAction=" + this.b + ')';
    }
}
