package defpackage;

import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;

/* loaded from: classes2.dex */
public final class ef41 {
    public final String a;
    public final String b;
    public final SubscriptionConfiguration c;
    public final boolean d;

    public ef41(String str, String str2, SubscriptionConfiguration subscriptionConfiguration, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = subscriptionConfiguration;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef41)) {
            return false;
        }
        ef41 ef41Var = (ef41) obj;
        return jl40.l(this.a, ef41Var.a) && jl40.l(this.b, ef41Var.b) && jl40.l(this.c, ef41Var.c) && this.d == ef41Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SubscriptionConfiguration subscriptionConfiguration = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (subscriptionConfiguration != null ? subscriptionConfiguration.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebConfiguration(message=");
        sb.append(this.a);
        sb.append(", place=");
        sb.append(this.b);
        sb.append(", subscriptionConfiguration=");
        sb.append(this.c);
        sb.append(", isTreasuryWidgetExists=");
        return unr0.u(sb, this.d, ')');
    }
}
