package xsna;

import com.vk.cachecontrol.api.CacheTarget;

/* compiled from: CacheTargetItem.kt */
/* loaded from: classes15.dex */
public final class sx8 implements hfz {
    public final int b;
    public final int c;
    public final long d;
    public final CacheTarget e;
    public final boolean f;
    public final boolean g;

    public sx8(int i, int i2, long j, CacheTarget cacheTarget, boolean z, boolean z2) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = cacheTarget;
        this.f = z;
        this.g = z2;
    }

    public static sx8 a(sx8 sx8Var, boolean z) {
        int i = sx8Var.b;
        int i2 = sx8Var.c;
        long j = sx8Var.d;
        CacheTarget cacheTarget = sx8Var.e;
        boolean z2 = sx8Var.g;
        sx8Var.getClass();
        return new sx8(i, i2, j, cacheTarget, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx8)) {
            return false;
        }
        sx8 sx8Var = (sx8) obj;
        return this.b == sx8Var.b && this.c == sx8Var.c && this.d == sx8Var.d && this.e == sx8Var.e && this.f == sx8Var.f && this.g == sx8Var.g;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + bh10.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheTargetItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", sizeInBytes=");
        sb.append(this.d);
        sb.append(", target=");
        sb.append(this.e);
        sb.append(", isChecked=");
        sb.append(this.f);
        sb.append(", isDividerVisible=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
