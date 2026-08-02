package defpackage;

import com.yandex.plus.home.common.network.NetworkResponse;

/* loaded from: classes2.dex */
public final class mz50 extends NetworkResponse {
    public final Object a;
    public final String b;

    public mz50(Object obj, String str) {
        super(null);
        this.a = obj;
        this.b = str;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz50)) {
            return false;
        }
        mz50 mz50Var = (mz50) obj;
        return jl40.l(this.a, mz50Var.a) && jl40.l(this.b, mz50Var.b);
    }

    @Override // com.yandex.plus.home.common.network.NetworkResponse
    public final String getRequestId() {
        return this.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(data=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
