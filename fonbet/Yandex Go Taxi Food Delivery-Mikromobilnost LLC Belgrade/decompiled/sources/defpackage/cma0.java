package defpackage;

import com.ybsdk.feature.qr.payments.api.data.SubscriptionInfoEntity;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cma0 {
    public final SubscriptionStatus a;
    public final SubscriptionInfoEntity b;
    public final String c;
    public final String d;
    public final String e;

    public cma0(SubscriptionStatus subscriptionStatus, SubscriptionInfoEntity subscriptionInfoEntity, String str, String str2, String str3) {
        this.a = subscriptionStatus;
        this.b = subscriptionInfoEntity;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public static cma0 a(cma0 cma0Var, SubscriptionStatus subscriptionStatus, String str, String str2, int i) {
        if ((i & 1) != 0) {
            subscriptionStatus = cma0Var.a;
        }
        SubscriptionStatus subscriptionStatus2 = subscriptionStatus;
        SubscriptionInfoEntity subscriptionInfoEntity = cma0Var.b;
        if ((i & 4) != 0) {
            str = cma0Var.c;
        }
        String str3 = str;
        cma0Var.getClass();
        String str4 = cma0Var.d;
        if ((i & 32) != 0) {
            str2 = cma0Var.e;
        }
        cma0Var.getClass();
        return new cma0(subscriptionStatus2, subscriptionInfoEntity, str3, str4, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cma0)) {
            return false;
        }
        cma0 cma0Var = (cma0) obj;
        return this.a == cma0Var.a && jl40.l(this.b, cma0Var.b) && jl40.l(this.c, cma0Var.c) && jl40.l(this.d, cma0Var.d) && jl40.l(this.e, cma0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentWithoutExtraActionsState(status=");
        sb.append(this.a);
        sb.append(", subscriptionInfo=");
        sb.append(this.b);
        sb.append(", selectedAgreementId=");
        g8e.D(sb, this.c, ", snackBarText=null, redirectLink=", this.d, ", subscriptionOperationId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
