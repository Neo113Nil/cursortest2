package defpackage;

import com.yandex.go.payments.api.composite.CompositePaymentState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class mrd {
    public static final mrd f = new mrd(CompositePaymentState.DISABLED, "", "", null, false);
    public final CompositePaymentState a;
    public final String b;
    public final String c;
    public final lv90 d;
    public final boolean e;

    public mrd(CompositePaymentState compositePaymentState, String str, String str2, lv90 lv90Var, boolean z) {
        this.a = compositePaymentState;
        this.b = str;
        this.c = str2;
        this.d = lv90Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrd)) {
            return false;
        }
        mrd mrdVar = (mrd) obj;
        return this.a == mrdVar.a && this.b.equals(mrdVar.b) && this.c.equals(mrdVar.c) && jl40.l(this.d, mrdVar.d) && this.e == mrdVar.e;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        lv90 lv90Var = this.d;
        return Boolean.hashCode(this.e) + ((b + (lv90Var == null ? 0 : lv90Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositePaymentStateModel(state=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", suggestedWallet=");
        sb.append(this.d);
        sb.append(", isFullPriced=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
