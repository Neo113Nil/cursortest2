package xsna;

import androidx.annotation.NonNull;
import java.util.List;
import xsna.j5k;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* loaded from: classes.dex */
public final class sl5 extends j5k.e.d.f {
    public final List<j5k.e.d.AbstractC3105e> a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    /* loaded from: classes13.dex */
    public static final class a extends j5k.e.d.f.a {
        public List<j5k.e.d.AbstractC3105e> a;

        public final sl5 a() {
            List<j5k.e.d.AbstractC3105e> list = this.a;
            if (list != null) {
                return new sl5(list);
            }
            throw new IllegalStateException("Missing required properties: rolloutAssignments");
        }

        public final a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.a = list;
            return this;
        }
    }

    public sl5() {
        throw null;
    }

    public sl5(List list) {
        this.a = list;
    }

    @Override // xsna.j5k.e.d.f
    @NonNull
    public final List<j5k.e.d.AbstractC3105e> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j5k.e.d.f) {
            return this.a.equals(((j5k.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return vp.b("}", new StringBuilder("RolloutsState{rolloutAssignments="), this.a);
    }
}
