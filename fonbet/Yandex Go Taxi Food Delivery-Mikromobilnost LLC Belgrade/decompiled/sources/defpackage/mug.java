package defpackage;

import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.PaymentState;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class mug {
    public static final mug k;
    public final List a;
    public final List b;
    public final boolean c;
    public final List d;
    public final DebtFlow e;
    public final List f;
    public final List g;
    public final fef h;
    public final PaymentState i;
    public final i3y j = a.b(LazyThreadSafetyMode.NONE, new sbc(5, this));

    static {
        PaymentState paymentState = PaymentState.UNKNOWN;
        EmptyList emptyList = EmptyList.a;
        k = new mug(emptyList, emptyList, false, emptyList, null, emptyList, null, null, paymentState);
    }

    public mug(List list, List list2, boolean z, List list3, DebtFlow debtFlow, List list4, List list5, fef fefVar, PaymentState paymentState) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = list3;
        this.e = debtFlow;
        this.f = list4;
        this.g = list5;
        this.h = fefVar;
        this.i = paymentState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mug)) {
            return false;
        }
        mug mugVar = (mug) obj;
        return jl40.l(this.a, mugVar.a) && jl40.l(this.b, mugVar.b) && this.c == mugVar.c && this.d.equals(mugVar.d) && jl40.l(this.e, mugVar.e) && jl40.l(this.f, mugVar.f) && jl40.l(this.g, mugVar.g) && jl40.l(this.h, mugVar.h) && this.i == mugVar.i;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.e(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        DebtFlow debtFlow = this.e;
        int hashCode = (c + (debtFlow == null ? 0 : debtFlow.hashCode())) * 31;
        List list = this.f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        fef fefVar = this.h;
        return this.i.hashCode() + ((hashCode3 + (fefVar != null ? fefVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = qv10.v("DebtsInfo(debts=", this.a, ", debtOrderIds=", this.b, ", isOverdraftAvailable=");
        v.append(this.c);
        v.append(", processingDebts=");
        v.append(this.d);
        v.append(", debtFlow=");
        v.append(this.e);
        v.append(", availablePaymentMethods=");
        v.append(this.f);
        v.append(", orderPaymentMethodSettings=");
        v.append(this.g);
        v.append(", rootCurrencyRules=");
        v.append(this.h);
        v.append(", paymentState=");
        v.append(this.i);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
