package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* loaded from: classes.dex */
public final class yk5 extends j5k.c {
    public final String a;
    public final String b;

    public yk5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // xsna.j5k.c
    @NonNull
    public final String a() {
        return this.a;
    }

    @Override // xsna.j5k.c
    @NonNull
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j5k.c)) {
            return false;
        }
        j5k.c cVar = (j5k.c) obj;
        return this.a.equals(cVar.a()) && this.b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return i5s.a(sb, this.b, "}");
    }
}
