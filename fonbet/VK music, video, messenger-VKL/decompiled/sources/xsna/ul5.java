package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* loaded from: classes.dex */
public final class ul5 extends j5k.e.f {
    public final String a;

    public ul5(String str) {
        this.a = str;
    }

    @Override // xsna.j5k.e.f
    @NonNull
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j5k.e.f) {
            return this.a.equals(((j5k.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return i5s.a(new StringBuilder("User{identifier="), this.a, "}");
    }
}
