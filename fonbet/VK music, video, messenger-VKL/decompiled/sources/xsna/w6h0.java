package xsna;

import java.util.List;

/* compiled from: ScheduledCallsContent.kt */
/* loaded from: classes7.dex */
public final class w6h0 {
    public final List<x5h0> a;

    public w6h0(List<x5h0> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6h0) && epx.f(this.a, ((w6h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ScheduledCallsContent(scheduledCalls="), this.a);
    }
}
