package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: ChannelsListViewState.kt */
/* loaded from: classes16.dex */
public final class bhb implements ao50 {
    public final List<hfz> a;

    public bhb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhb) && epx.f(this.a, ((bhb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("ChannelsListViewState(listItems="), this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bhb(List<? extends hfz> list) {
        this.a = list;
    }

    public bhb(int i) {
        this((List<? extends hfz>) Collections.singletonList(xpz.b));
    }
}
