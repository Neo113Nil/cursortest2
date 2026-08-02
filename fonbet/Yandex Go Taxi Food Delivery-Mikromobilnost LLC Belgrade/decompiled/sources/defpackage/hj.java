package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hj implements lj {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;

    public hj(long j, String str, boolean z, List list) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj)) {
            return false;
        }
        hj hjVar = (hj) obj;
        return this.a == hjVar.a && jl40.l(this.b, hjVar.b) && this.c == hjVar.c && jl40.l(this.d, hjVar.d);
    }

    @Override // defpackage.lj
    public final String getAuthToken() {
        return this.b;
    }

    @Override // defpackage.lj
    public final Long getId() {
        return Long.valueOf(this.a);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User.Authorized(id=");
        sb.append(this.a);
        sb.append(", isYandexEmployee=");
        sb.append(this.c);
        sb.append(", partitions=");
        return unr0.t(sb, this.d, ')');
    }
}
