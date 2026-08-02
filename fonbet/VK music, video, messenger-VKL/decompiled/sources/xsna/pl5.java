package xsna;

import androidx.annotation.NonNull;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* loaded from: classes.dex */
public final class pl5 extends j5k.e.d.AbstractC3104d {
    public final String a;

    public pl5(String str) {
        this.a = str;
    }

    @Override // xsna.j5k.e.d.AbstractC3104d
    @NonNull
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j5k.e.d.AbstractC3104d) {
            return this.a.equals(((j5k.e.d.AbstractC3104d) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return i5s.a(new StringBuilder("Log{content="), this.a, "}");
    }
}
