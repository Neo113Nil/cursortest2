package defpackage;

import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionTimelineTracker$Session$State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h6y0 {
    public final f6y0 a;
    public final String b;
    public final long c;
    public final List d;
    public final TaxiOrderSessionTimelineTracker$Session$State e;
    public final ArrayList f;

    public h6y0(f6y0 f6y0Var, String str, long j, List list, TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State) {
        this.a = f6y0Var;
        this.b = str;
        this.c = j;
        this.d = list;
        this.e = taxiOrderSessionTimelineTracker$Session$State;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c6y0) it.next()).a());
        }
        this.f = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    public static h6y0 a(h6y0 h6y0Var, f6y0 f6y0Var, ArrayList arrayList, TaxiOrderSessionTimelineTracker$Session$State taxiOrderSessionTimelineTracker$Session$State, int i) {
        if ((i & 1) != 0) {
            f6y0Var = h6y0Var.a;
        }
        f6y0 f6y0Var2 = f6y0Var;
        String str = h6y0Var.b;
        long j = h6y0Var.c;
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = h6y0Var.d;
        }
        return new h6y0(f6y0Var2, str, j, arrayList2, taxiOrderSessionTimelineTracker$Session$State);
    }

    public final f6y0 b() {
        return this.a;
    }

    public final boolean c() {
        return this.e == TaxiOrderSessionTimelineTracker$Session$State.FINISHED;
    }

    public final h6y0 d(c6y0 c6y0Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((TaxiOrderSessionCheckpoint) it.next()) == c6y0Var.a()) {
                    return this;
                }
            }
        }
        return a(this, null, a.o0(this.d, c6y0Var), c6y0Var.a() == TaxiOrderSessionCheckpoint.LCP ? TaxiOrderSessionTimelineTracker$Session$State.FINISHED : TaxiOrderSessionTimelineTracker$Session$State.EVENT_ADDED, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6y0)) {
            return false;
        }
        h6y0 h6y0Var = (h6y0) obj;
        return jl40.l(this.a, h6y0Var.a) && this.b.equals(h6y0Var.b) && this.c == h6y0Var.c && jl40.l(this.d, h6y0Var.d) && this.e == h6y0Var.e;
    }

    public final int hashCode() {
        f6y0 f6y0Var = this.a;
        return this.e.hashCode() + unr0.c(qv10.c(unr0.b((f6y0Var == null ? 0 : f6y0Var.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "SessionImpl(scenarioPayload=" + this.a + ", uuid=" + this.b + ", startTimestamp=" + this.c + ", timeline=" + this.d + ", state=" + this.e + Extension.C_BRAKE;
    }
}
