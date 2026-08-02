package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes.dex */
public final class kl5 extends j5k.e.d.a.b.c {
    public final String a;
    public final String b;
    public final long c;

    public kl5(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // xsna.j5k.e.d.a.b.c
    @NonNull
    public final long a() {
        return this.c;
    }

    @Override // xsna.j5k.e.d.a.b.c
    @NonNull
    public final String b() {
        return this.b;
    }

    @Override // xsna.j5k.e.d.a.b.c
    @NonNull
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.e.d.a.b.c)) {
            return false;
        }
        j5k.e.d.a.b.c cVar = (j5k.e.d.a.b.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        return efz.b(this.c, "}", sb);
    }
}
