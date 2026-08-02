package xsna;

/* compiled from: ResolveScreenNameResult.kt */
/* loaded from: classes6.dex */
public final class aag0 {
    public final long a;
    public final long b;
    public final String c;

    public aag0(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean a() {
        String str = this.c;
        return epx.f(str, "vk_app") || epx.f(str, "mini_app") || epx.f(str, "application") || epx.f(str, "internal_vkui") || epx.f(str, "community_application");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aag0)) {
            return false;
        }
        aag0 aag0Var = (aag0) obj;
        return this.a == aag0Var.a && this.b == aag0Var.b && epx.f(this.c, aag0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResolveScreenNameResult(objectId=");
        sb.append(this.a);
        sb.append(", groupId=");
        sb.append(this.b);
        sb.append(", type=");
        return ho8.a(sb, this.c, ')');
    }
}
