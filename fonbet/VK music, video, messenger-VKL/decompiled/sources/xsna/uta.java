package xsna;

import java.util.ArrayList;

/* compiled from: ChannelActionsModel.kt */
/* loaded from: classes16.dex */
public final class uta {
    public final long a;
    public final ArrayList b;

    public uta(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uta)) {
            return false;
        }
        uta utaVar = (uta) obj;
        return this.a == utaVar.a && this.b.equals(utaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelActionsModel(channelId=");
        sb.append(this.a);
        sb.append(", actions=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
    }
}
