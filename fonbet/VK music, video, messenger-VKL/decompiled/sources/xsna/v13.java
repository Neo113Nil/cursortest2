package xsna;

import com.unity3d.services.core.di.ServiceProvider;

/* compiled from: AppCacheState.kt */
/* loaded from: classes6.dex */
public final class v13 {
    public final long a;
    public final int b;

    public v13(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v13)) {
            return false;
        }
        v13 v13Var = (v13) obj;
        v13Var.getClass();
        return this.a == v13Var.a && this.b == v13Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + bh10.a(Long.hashCode(ServiceProvider.HTTP_CACHE_DISK_SIZE) * 31, 31, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppCacheState(maxCapacity=20971520, availableCapacity=");
        sb.append(this.a);
        sb.append(", recordsCount=");
        return vu5.b(sb, this.b, ')');
    }
}
