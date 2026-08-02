package defpackage;

import android.net.NetworkRequest;
import androidx.work.NetworkType;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class k8e {
    public static final k8e j = new k8e();
    public final NetworkType a;
    public final jz50 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public k8e(k8e k8eVar) {
        this.c = k8eVar.c;
        this.d = k8eVar.d;
        this.b = k8eVar.b;
        this.a = k8eVar.a;
        this.e = k8eVar.e;
        this.f = k8eVar.f;
        this.i = k8eVar.i;
        this.g = k8eVar.g;
        this.h = k8eVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !k8e.class.equals(obj.getClass())) {
            return false;
        }
        k8e k8eVar = (k8e) obj;
        if (this.c == k8eVar.c && this.d == k8eVar.d && this.e == k8eVar.e && this.f == k8eVar.f && this.g == k8eVar.g && this.h == k8eVar.h && jl40.l(a(), k8eVar.a()) && this.a == k8eVar.a) {
            return jl40.l(this.i, k8eVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int e = g8e.e(this.i, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        NetworkRequest a = a();
        return e + (a != null ? a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Constraints{requiredNetworkType=");
        sb.append(this.a);
        sb.append(", requiresCharging=");
        sb.append(this.c);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.d);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.e);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.f);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.g);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.h);
        sb.append(", contentUriTriggers=");
        return vfc.q(sb, this.i, ", }");
    }

    public k8e(jz50 jz50Var, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        this.b = jz50Var;
        this.a = networkType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public k8e() {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        this.b = new jz50(null);
        this.a = networkType;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = EmptySet.a;
    }
}
