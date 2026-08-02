package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;

/* compiled from: ProfileCounter.kt */
/* loaded from: classes17.dex */
public final class lvd0 {
    public final long a;
    public final CounterType b;
    public final boolean c;

    public lvd0(long j, CounterType counterType, boolean z) {
        this.a = j;
        this.b = counterType;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvd0)) {
            return false;
        }
        lvd0 lvd0Var = (lvd0) obj;
        return this.a == lvd0Var.a && this.b == lvd0Var.b && this.c == lvd0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCounter(count=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", clickable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
