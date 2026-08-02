package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i64 extends rfo {
    public final String a;
    public final Integer b;
    public final qyn c;
    public final long d;
    public final long e;
    public final Map f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    public i64(String str, Integer num, qyn qynVar, long j, long j2, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = qynVar;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // defpackage.rfo
    public final Map b() {
        return this.f;
    }

    @Override // defpackage.rfo
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.rfo
    public final qyn d() {
        return this.c;
    }

    @Override // defpackage.rfo
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rfo)) {
            return false;
        }
        rfo rfoVar = (rfo) obj;
        if (!this.a.equals(rfoVar.k())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (rfoVar.c() != null) {
                return false;
            }
        } else if (!num.equals(rfoVar.c())) {
            return false;
        }
        if (!this.c.equals(rfoVar.d()) || this.d != rfoVar.e() || this.e != rfoVar.l() || !this.f.equals(rfoVar.b())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (rfoVar.i() != null) {
                return false;
            }
        } else if (!num2.equals(rfoVar.i())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (rfoVar.j() != null) {
                return false;
            }
        } else if (!str.equals(rfoVar.j())) {
            return false;
        }
        boolean z = rfoVar instanceof i64;
        if (Arrays.equals(this.i, z ? ((i64) rfoVar).i : rfoVar.f())) {
            return Arrays.equals(this.j, z ? ((i64) rfoVar).j : rfoVar.g());
        }
        return false;
    }

    @Override // defpackage.rfo
    public final byte[] f() {
        return this.i;
    }

    @Override // defpackage.rfo
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
        return Arrays.hashCode(this.j) ^ ((((hashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003);
    }

    @Override // defpackage.rfo
    public final Integer i() {
        return this.g;
    }

    @Override // defpackage.rfo
    public final String j() {
        return this.h;
    }

    @Override // defpackage.rfo
    public final String k() {
        return this.a;
    }

    @Override // defpackage.rfo
    public final long l() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
