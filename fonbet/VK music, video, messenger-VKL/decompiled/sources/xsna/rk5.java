package xsna;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AutoValue_BatchedLogRequest.java */
/* loaded from: classes.dex */
public final class rk5 extends gv6 {
    public final ArrayList a;

    public rk5(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.gv6
    @NonNull
    public final List<q000> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gv6) {
            return this.a.equals(((gv6) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
