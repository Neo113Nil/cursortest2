package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes.dex */
public final class bl5 extends j5k.e {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final Long e;
    public final boolean f;
    public final j5k.e.a g;
    public final j5k.e.f h;
    public final j5k.e.AbstractC3106e i;
    public final j5k.e.c j;
    public final List<j5k.e.d> k;
    public final int l;

    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    public static final class a extends j5k.e.b {
        public String a;
        public String b;
        public String c;
        public long d;
        public Long e;
        public boolean f;
        public j5k.e.a g;
        public j5k.e.f h;
        public j5k.e.AbstractC3106e i;
        public j5k.e.c j;
        public List<j5k.e.d> k;
        public int l;
        public byte m;

        public final bl5 a() {
            String str;
            String str2;
            j5k.e.a aVar;
            if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (aVar = this.g) != null) {
                return new bl5(str, str2, this.c, this.d, this.e, this.f, aVar, this.h, this.i, this.j, this.k, this.l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" generator");
            }
            if (this.b == null) {
                sb.append(" identifier");
            }
            if ((this.m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.g == null) {
                sb.append(" app");
            }
            if ((this.m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public bl5() {
        throw null;
    }

    public bl5(String str, String str2, String str3, long j, Long l, boolean z, j5k.e.a aVar, j5k.e.f fVar, j5k.e.AbstractC3106e abstractC3106e, j5k.e.c cVar, List list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = abstractC3106e;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }

    @Override // xsna.j5k.e
    @NonNull
    public final j5k.e.a a() {
        return this.g;
    }

    @Override // xsna.j5k.e
    @Nullable
    public final String b() {
        return this.c;
    }

    @Override // xsna.j5k.e
    @Nullable
    public final j5k.e.c c() {
        return this.j;
    }

    @Override // xsna.j5k.e
    @Nullable
    public final Long d() {
        return this.e;
    }

    @Override // xsna.j5k.e
    @Nullable
    public final List<j5k.e.d> e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e)) {
            return false;
        }
        j5k.e eVar = (j5k.e) obj;
        if (!this.a.equals(eVar.f()) || !this.b.equals(eVar.h())) {
            return false;
        }
        String str = this.c;
        if (str == null) {
            if (eVar.b() != null) {
                return false;
            }
        } else if (!str.equals(eVar.b())) {
            return false;
        }
        if (this.d != eVar.j()) {
            return false;
        }
        Long l = this.e;
        if (l == null) {
            if (eVar.d() != null) {
                return false;
            }
        } else if (!l.equals(eVar.d())) {
            return false;
        }
        if (this.f != eVar.l() || !this.g.equals(eVar.a())) {
            return false;
        }
        j5k.e.f fVar = this.h;
        if (fVar == null) {
            if (eVar.k() != null) {
                return false;
            }
        } else if (!fVar.equals(eVar.k())) {
            return false;
        }
        j5k.e.AbstractC3106e abstractC3106e = this.i;
        if (abstractC3106e == null) {
            if (eVar.i() != null) {
                return false;
            }
        } else if (!abstractC3106e.equals(eVar.i())) {
            return false;
        }
        j5k.e.c cVar = this.j;
        if (cVar == null) {
            if (eVar.c() != null) {
                return false;
            }
        } else if (!cVar.equals(eVar.c())) {
            return false;
        }
        List<j5k.e.d> list = this.k;
        if (list == null) {
            if (eVar.e() != null) {
                return false;
            }
        } else if (!list.equals(eVar.e())) {
            return false;
        }
        return this.l == eVar.g();
    }

    @Override // xsna.j5k.e
    @NonNull
    public final String f() {
        return this.a;
    }

    @Override // xsna.j5k.e
    public final int g() {
        return this.l;
    }

    @Override // xsna.j5k.e
    @NonNull
    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j = this.d;
        int i = (((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        Long l = this.e;
        int hashCode3 = (((((i ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003;
        j5k.e.f fVar = this.h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        j5k.e.AbstractC3106e abstractC3106e = this.i;
        int hashCode5 = (hashCode4 ^ (abstractC3106e == null ? 0 : abstractC3106e.hashCode())) * 1000003;
        j5k.e.c cVar = this.j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<j5k.e.d> list = this.k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.l;
    }

    @Override // xsna.j5k.e
    @Nullable
    public final j5k.e.AbstractC3106e i() {
        return this.i;
    }

    @Override // xsna.j5k.e
    public final long j() {
        return this.d;
    }

    @Override // xsna.j5k.e
    @Nullable
    public final j5k.e.f k() {
        return this.h;
    }

    @Override // xsna.j5k.e
    public final boolean l() {
        return this.f;
    }

    @Override // xsna.j5k.e
    public final a m() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = (byte) 7;
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", appQualitySessionId=");
        sb.append(this.c);
        sb.append(", startedAt=");
        sb.append(this.d);
        sb.append(", endedAt=");
        sb.append(this.e);
        sb.append(", crashed=");
        sb.append(this.f);
        sb.append(", app=");
        sb.append(this.g);
        sb.append(", user=");
        sb.append(this.h);
        sb.append(", os=");
        sb.append(this.i);
        sb.append(", device=");
        sb.append(this.j);
        sb.append(", events=");
        sb.append(this.k);
        sb.append(", generatorType=");
        return h5s.c(this.l, "}", sb);
    }
}
