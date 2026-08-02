package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class hw implements jw {
    public final u1m a;
    public final String b;
    public final String c;
    public final Throwable d;

    public hw(u1m u1mVar, String str, String str2, Throwable th) {
        this.a = u1mVar;
        this.b = str;
        this.c = str2;
        this.d = th;
    }

    public final String a() {
        return this.c;
    }

    public final u1m b() {
        return this.a;
    }

    public final Throwable c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!hw.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        hw hwVar = (hw) obj;
        return jl40.l(this.a, hwVar.a) && jl40.l(this.b, hwVar.b) && jl40.l(this.c, hwVar.c) && this.d.equals(hwVar.d);
    }

    public final int hashCode() {
        u1m u1mVar = this.a;
        int hashCode = (u1mVar != null ? u1mVar.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Corrupted(query=" + this.a + ", requestId=" + this.b + ", actionType=" + this.c + ", throwable=" + this.d + Extension.C_BRAKE;
    }
}
