package xsna;

import androidx.annotation.NonNull;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes.dex */
public final class el5 extends j5k.e.c {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    public static final class a extends j5k.e.c.a {
        public int a;
        public String b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        public int g;
        public String h;
        public String i;
        public byte j;

        public final el5 a() {
            String str;
            String str2;
            String str3;
            if (this.j == 63 && (str = this.b) != null && (str2 = this.h) != null && (str3 = this.i) != null) {
                return new el5(this.a, str, this.c, this.d, this.e, this.f, this.g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.b == null) {
                sb.append(" model");
            }
            if ((this.j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.j & AmfConstants.TYPE_TYPED_OBJECT_MARKER) == 0) {
                sb.append(" simulator");
            }
            if ((this.j & 32) == 0) {
                sb.append(" state");
            }
            if (this.h == null) {
                sb.append(" manufacturer");
            }
            if (this.i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public el5(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    @Override // xsna.j5k.e.c
    @NonNull
    public final int a() {
        return this.a;
    }

    @Override // xsna.j5k.e.c
    public final int b() {
        return this.c;
    }

    @Override // xsna.j5k.e.c
    public final long c() {
        return this.e;
    }

    @Override // xsna.j5k.e.c
    @NonNull
    public final String d() {
        return this.h;
    }

    @Override // xsna.j5k.e.c
    @NonNull
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.c)) {
            return false;
        }
        j5k.e.c cVar = (j5k.e.c) obj;
        return this.a == cVar.a() && this.b.equals(cVar.e()) && this.c == cVar.b() && this.d == cVar.g() && this.e == cVar.c() && this.f == cVar.i() && this.g == cVar.h() && this.h.equals(cVar.d()) && this.i.equals(cVar.f());
    }

    @Override // xsna.j5k.e.c
    @NonNull
    public final String f() {
        return this.i;
    }

    @Override // xsna.j5k.e.c
    public final long g() {
        return this.d;
    }

    @Override // xsna.j5k.e.c
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((((((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // xsna.j5k.e.c
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return i5s.a(sb, this.i, "}");
    }
}
