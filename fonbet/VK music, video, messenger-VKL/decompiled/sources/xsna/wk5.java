package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes.dex */
public final class wk5 extends j5k.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List<j5k.a.AbstractC3094a> i;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* loaded from: classes13.dex */
    public static final class a extends j5k.a.b {
        public int a;
        public String b;
        public int c;
        public int d;
        public long e;
        public long f;
        public long g;
        public String h;
        public List<j5k.a.AbstractC3094a> i;
        public byte j;

        public final wk5 a() {
            String str;
            if (this.j == 63 && (str = this.b) != null) {
                return new wk5(this.a, str, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.b == null) {
                sb.append(" processName");
            }
            if ((this.j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.j & AmfConstants.TYPE_TYPED_OBJECT_MARKER) == 0) {
                sb.append(" rss");
            }
            if ((this.j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }

        public final a b(@Nullable List list) {
            this.i = list;
            return this;
        }

        public final a c(int i) {
            this.d = i;
            this.j = (byte) (this.j | 4);
            return this;
        }

        public final a d(int i) {
            this.a = i;
            this.j = (byte) (this.j | 1);
            return this;
        }

        public final a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.b = str;
            return this;
        }

        public final a f(long j) {
            this.e = j;
            this.j = (byte) (this.j | 8);
            return this;
        }

        public final a g(int i) {
            this.c = i;
            this.j = (byte) (this.j | 2);
            return this;
        }

        public final a h(long j) {
            this.f = j;
            this.j = (byte) (this.j | AmfConstants.TYPE_TYPED_OBJECT_MARKER);
            return this;
        }

        public final a i(long j) {
            this.g = j;
            this.j = (byte) (this.j | 32);
            return this;
        }

        public final a j(@Nullable String str) {
            this.h = str;
            return this;
        }
    }

    public wk5() {
        throw null;
    }

    public wk5(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = list;
    }

    @Override // xsna.j5k.a
    @Nullable
    public final List<j5k.a.AbstractC3094a> a() {
        return this.i;
    }

    @Override // xsna.j5k.a
    @NonNull
    public final int b() {
        return this.d;
    }

    @Override // xsna.j5k.a
    @NonNull
    public final int c() {
        return this.a;
    }

    @Override // xsna.j5k.a
    @NonNull
    public final String d() {
        return this.b;
    }

    @Override // xsna.j5k.a
    @NonNull
    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.a)) {
            return false;
        }
        j5k.a aVar = (j5k.a) obj;
        if (this.a != aVar.c() || !this.b.equals(aVar.d()) || this.c != aVar.f() || this.d != aVar.b() || this.e != aVar.e() || this.f != aVar.g() || this.g != aVar.h()) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (aVar.i() != null) {
                return false;
            }
        } else if (!str.equals(aVar.i())) {
            return false;
        }
        List<j5k.a.AbstractC3094a> list = this.i;
        return list == null ? aVar.a() == null : list.equals(aVar.a());
    }

    @Override // xsna.j5k.a
    @NonNull
    public final int f() {
        return this.c;
    }

    @Override // xsna.j5k.a
    @NonNull
    public final long g() {
        return this.f;
    }

    @Override // xsna.j5k.a
    @NonNull
    public final long h() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        int hashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<j5k.a.AbstractC3094a> list = this.i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // xsna.j5k.a
    @Nullable
    public final String i() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationExitInfo{pid=");
        sb.append(this.a);
        sb.append(", processName=");
        sb.append(this.b);
        sb.append(", reasonCode=");
        sb.append(this.c);
        sb.append(", importance=");
        sb.append(this.d);
        sb.append(", pss=");
        sb.append(this.e);
        sb.append(", rss=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append(", traceFile=");
        sb.append(this.h);
        sb.append(", buildIdMappingForArch=");
        return vp.b("}", sb, this.i);
    }
}
