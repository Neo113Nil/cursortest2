package xsna;

import java.util.Collection;

/* compiled from: VoipBroadcastStopResponse.kt */
/* loaded from: classes7.dex */
public final class gfw0 {
    public final int a;
    public final Collection<qvw0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public gfw0(int i, Collection<? extends qvw0> collection) {
        this.a = i;
        this.b = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfw0)) {
            return false;
        }
        gfw0 gfw0Var = (gfw0) obj;
        return this.a == gfw0Var.a && epx.f(this.b, gfw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipBroadcastStopResponse(viewersUniqueCount=");
        sb.append(this.a);
        sb.append(", viewersFriends=");
        return l4.h(sb, this.b, ')');
    }
}
