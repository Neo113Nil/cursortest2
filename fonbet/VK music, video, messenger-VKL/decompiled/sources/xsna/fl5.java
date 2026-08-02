package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes.dex */
public final class fl5 extends j5k.e.d {
    public final long a;
    public final String b;
    public final j5k.e.d.a c;
    public final j5k.e.d.c d;
    public final j5k.e.d.AbstractC3104d e;
    public final j5k.e.d.f f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    public static final class a extends j5k.e.d.b {
        public long a;
        public String b;
        public j5k.e.d.a c;
        public j5k.e.d.c d;
        public j5k.e.d.AbstractC3104d e;
        public j5k.e.d.f f;
        public byte g;

        public final fl5 a() {
            String str;
            j5k.e.d.a aVar;
            j5k.e.d.c cVar;
            if (this.g == 1 && (str = this.b) != null && (aVar = this.c) != null && (cVar = this.d) != null) {
                return new fl5(this.a, str, aVar, cVar, this.e, this.f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.g) == 0) {
                sb.append(" timestamp");
            }
            if (this.b == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" app");
            }
            if (this.d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException(t9c.b("Missing required properties:", sb));
        }
    }

    public fl5(long j, String str, j5k.e.d.a aVar, j5k.e.d.c cVar, j5k.e.d.AbstractC3104d abstractC3104d, j5k.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC3104d;
        this.f = fVar;
    }

    @Override // xsna.j5k.e.d
    @NonNull
    public final j5k.e.d.a a() {
        return this.c;
    }

    @Override // xsna.j5k.e.d
    @NonNull
    public final j5k.e.d.c b() {
        return this.d;
    }

    @Override // xsna.j5k.e.d
    @Nullable
    public final j5k.e.d.AbstractC3104d c() {
        return this.e;
    }

    @Override // xsna.j5k.e.d
    @Nullable
    public final j5k.e.d.f d() {
        return this.f;
    }

    @Override // xsna.j5k.e.d
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d)) {
            return false;
        }
        j5k.e.d dVar = (j5k.e.d) obj;
        if (this.a != dVar.e() || !this.b.equals(dVar.f()) || !this.c.equals(dVar.a()) || !this.d.equals(dVar.b())) {
            return false;
        }
        j5k.e.d.AbstractC3104d abstractC3104d = this.e;
        if (abstractC3104d == null) {
            if (dVar.c() != null) {
                return false;
            }
        } else if (!abstractC3104d.equals(dVar.c())) {
            return false;
        }
        j5k.e.d.f fVar = this.f;
        return fVar == null ? dVar.d() == null : fVar.equals(dVar.d());
    }

    @Override // xsna.j5k.e.d
    @NonNull
    public final String f() {
        return this.b;
    }

    public final a g() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = (byte) 1;
        return aVar;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        j5k.e.d.AbstractC3104d abstractC3104d = this.e;
        int hashCode2 = (hashCode ^ (abstractC3104d == null ? 0 : abstractC3104d.hashCode())) * 1000003;
        j5k.e.d.f fVar = this.f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
