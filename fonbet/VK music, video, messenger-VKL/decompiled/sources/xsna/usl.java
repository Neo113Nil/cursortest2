package xsna;

import com.vk.libdelayedjobs.WorkPolicy;

/* compiled from: DelayedJobConfig.kt */
/* loaded from: classes.dex */
public final class usl {
    public static final usl h = new usl(null, 0, 253);
    public final WorkPolicy a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public usl(WorkPolicy workPolicy, long j, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.a = workPolicy;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
    }

    public static usl a(usl uslVar, WorkPolicy workPolicy, int i) {
        if ((i & 1) != 0) {
            workPolicy = uslVar.a;
        }
        WorkPolicy workPolicy2 = workPolicy;
        long j = uslVar.b;
        boolean z = (i & 4) != 0 ? uslVar.c : true;
        boolean z2 = (i & 8) != 0 ? uslVar.d : true;
        boolean z3 = uslVar.e;
        uslVar.getClass();
        boolean z4 = uslVar.f;
        String str = uslVar.g;
        uslVar.getClass();
        return new usl(workPolicy2, j, z, z2, z3, z4, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usl)) {
            return false;
        }
        usl uslVar = (usl) obj;
        return this.a == uslVar.a && this.b == uslVar.b && this.c == uslVar.c && this.d == uslVar.d && this.e == uslVar.e && this.f == uslVar.f && epx.f(this.g, uslVar.g);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, false), 31, this.f);
        String str = this.g;
        return b + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DelayedJobConfig(workPolicy=");
        sb.append(this.a);
        sb.append(", delayMs=");
        sb.append(this.b);
        sb.append(", isNetworkRequired=");
        sb.append(this.c);
        sb.append(", isDeviceIdleRequired=");
        sb.append(this.d);
        sb.append(", isChargingRequired=");
        sb.append(this.e);
        sb.append(", isBatteryNotLowRequired=false, isStorageNotLowRequired=");
        sb.append(this.f);
        sb.append(", tag=");
        return ho8.a(sb, this.g, ')');
    }

    public /* synthetic */ usl(WorkPolicy workPolicy, long j, int i) {
        this((i & 1) != 0 ? WorkPolicy.KEEP : workPolicy, j, (i & 4) == 0, false, (i & 16) == 0, (i & 64) == 0, (i & 128) != 0 ? null : "com.vk.im.engine.synchelper.ImMessagesHistorySynchronizer.BackgroundSyncJob");
    }
}
