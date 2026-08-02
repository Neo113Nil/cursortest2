package defpackage;

import android.os.Build;
import defpackage.f7u0;

/* loaded from: classes.dex */
public final class m84 extends f7u0.b {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public m84(int i, int i2, long j, long j2, boolean z, int i3) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.a = i;
        if (str == null) {
            ny61.t("Null model");
            throw null;
        }
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        if (str2 == null) {
            ny61.t("Null manufacturer");
            throw null;
        }
        this.h = str2;
        if (str3 != null) {
            this.i = str3;
        } else {
            ny61.t("Null modelClass");
            throw null;
        }
    }

    @Override // f7u0.b
    public final int a() {
        return this.a;
    }

    @Override // f7u0.b
    public final int b() {
        return this.c;
    }

    @Override // f7u0.b
    public final long c() {
        return this.e;
    }

    @Override // f7u0.b
    public final boolean d() {
        return this.f;
    }

    @Override // f7u0.b
    public final String e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f7u0.b)) {
            return false;
        }
        f7u0.b bVar = (f7u0.b) obj;
        return this.a == bVar.a() && this.b.equals(bVar.f()) && this.c == bVar.b() && this.d == bVar.i() && this.e == bVar.c() && this.f == bVar.d() && this.g == bVar.h() && this.h.equals(bVar.e()) && this.i.equals(bVar.g());
    }

    @Override // f7u0.b
    public final String f() {
        return this.b;
    }

    @Override // f7u0.b
    public final String g() {
        return this.i;
    }

    @Override // f7u0.b
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.i.hashCode() ^ ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    @Override // f7u0.b
    public final long i() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return oyr.t(sb, this.i, "}");
    }
}
