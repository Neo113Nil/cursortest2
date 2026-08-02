package defpackage;

import com.yandex.plus.home.common.network.NetworkResponse;

/* loaded from: classes8.dex */
public final class kz50 extends NetworkResponse {
    public final kzj0 a;
    public final String b;

    public kz50(kzj0 kzj0Var, String str) {
        super(null);
        this.a = kzj0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz50)) {
            return false;
        }
        kz50 kz50Var = (kz50) obj;
        return jl40.l(this.a, kz50Var.a) && jl40.l(this.b, kz50Var.b);
    }

    @Override // com.yandex.plus.home.common.network.NetworkResponse
    public final String getRequestId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Failure(resultError=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
