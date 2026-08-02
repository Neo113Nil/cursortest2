package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import xsna.a0q;

/* compiled from: AutoValue_EventInternal.java */
/* loaded from: classes.dex */
public final class yl5 extends a0q {
    public final String a;
    public final Integer b;
    public final uip c;
    public final long d;
    public final long e;
    public final Map<String, String> f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    /* compiled from: AutoValue_EventInternal.java */
    public static final class a extends a0q.a {
        public String a;
        public Integer b;
        public uip c;
        public Long d;
        public Long e;
        public HashMap f;
        public Integer g;
        public String h;
        public byte[] i;
        public byte[] j;

        public final yl5 b() {
            String str = this.a == null ? " transportName" : "";
            if (this.c == null) {
                str = str.concat(" encodedPayload");
            }
            if (this.d == null) {
                str = fo8.a(str, " eventMillis");
            }
            if (this.e == null) {
                str = fo8.a(str, " uptimeMillis");
            }
            if (this.f == null) {
                str = fo8.a(str, " autoMetadata");
            }
            if (str.isEmpty()) {
                return new yl5(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public yl5() {
        throw null;
    }

    public yl5(String str, Integer num, uip uipVar, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = uipVar;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // xsna.a0q
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // xsna.a0q
    @Nullable
    public final Integer c() {
        return this.b;
    }

    @Override // xsna.a0q
    public final uip d() {
        return this.c;
    }

    @Override // xsna.a0q
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0q)) {
            return false;
        }
        a0q a0qVar = (a0q) obj;
        if (!this.a.equals(a0qVar.k())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (a0qVar.c() != null) {
                return false;
            }
        } else if (!num.equals(a0qVar.c())) {
            return false;
        }
        if (!this.c.equals(a0qVar.d()) || this.d != a0qVar.e() || this.e != a0qVar.l() || !this.f.equals(a0qVar.b())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (a0qVar.i() != null) {
                return false;
            }
        } else if (!num2.equals(a0qVar.i())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (a0qVar.j() != null) {
                return false;
            }
        } else if (!str.equals(a0qVar.j())) {
            return false;
        }
        boolean z = a0qVar instanceof yl5;
        if (Arrays.equals(this.i, z ? ((yl5) a0qVar).i : a0qVar.f())) {
            return Arrays.equals(this.j, z ? ((yl5) a0qVar).j : a0qVar.g());
        }
        return false;
    }

    @Override // xsna.a0q
    @Nullable
    public final byte[] f() {
        return this.i;
    }

    @Override // xsna.a0q
    @Nullable
    public final byte[] g() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int hashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int hashCode4 = (hashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.j);
    }

    @Override // xsna.a0q
    @Nullable
    public final Integer i() {
        return this.g;
    }

    @Override // xsna.a0q
    @Nullable
    public final String j() {
        return this.h;
    }

    @Override // xsna.a0q
    public final String k() {
        return this.a;
    }

    @Override // xsna.a0q
    public final long l() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
