package defpackage;

/* loaded from: classes2.dex */
public final class mwj0 {
    public final Object a;
    public final String b;

    public mwj0(Object obj, String str) {
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
        if (!(obj instanceof mwj0)) {
            return false;
        }
        mwj0 mwj0Var = (mwj0) obj;
        return jl40.l(this.a, mwj0Var.a) && jl40.l(this.b, mwj0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResponseWithRequestId(data=");
        sb.append(this.a);
        sb.append(", requestId=");
        return b64.p(sb, this.b, ')');
    }
}
