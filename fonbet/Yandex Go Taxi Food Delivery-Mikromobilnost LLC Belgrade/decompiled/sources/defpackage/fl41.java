package defpackage;

import com.yandex.plus.home.api.config.PlusHomeBundle;

/* loaded from: classes2.dex */
public final class fl41 {
    public final String a;
    public final String b;
    public final PlusHomeBundle c;

    public fl41(String str, String str2, PlusHomeBundle plusHomeBundle) {
        this.a = str;
        this.b = str2;
        this.c = plusHomeBundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl41)) {
            return false;
        }
        fl41 fl41Var = (fl41) obj;
        return jl40.l(this.a, fl41Var.a) && jl40.l(this.b, fl41Var.b) && jl40.l(this.c, fl41Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebStoriesViewBundle(data=");
        sb.append(this.a);
        sb.append(", token=");
        sb.append(this.b != null ? "<token_hidden>" : null);
        sb.append(", plusHomeBundle=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
