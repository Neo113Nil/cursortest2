package defpackage;

import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes8.dex */
public final class hdd0 {
    public final int a;
    public final LogPriority b;
    public final String c;
    public final String d;
    public final Throwable e;

    public hdd0(int i, LogPriority logPriority, String str, String str2, Throwable th) {
        this.a = i;
        this.b = logPriority;
        this.c = str;
        this.d = str2;
        this.e = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdd0)) {
            return false;
        }
        hdd0 hdd0Var = (hdd0) obj;
        return this.a == hdd0Var.a && this.b == hdd0Var.b && jl40.l(this.c, hdd0Var.c) && jl40.l(this.d, hdd0Var.d) && jl40.l(this.e, hdd0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d);
        Throwable th = this.e;
        return b + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayLogEntry(id=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", error=");
        return unr0.s(sb, this.e, ')');
    }
}
