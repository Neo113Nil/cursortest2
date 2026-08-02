package xsna;

import java.util.ArrayList;

/* compiled from: OnChannelArchivedEvent.kt */
/* loaded from: classes2.dex */
public final class h280 extends sxp {
    public final ArrayList b;

    public h280() {
        throw null;
    }

    public h280(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h280) && epx.f(this.b, ((h280) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }

    public final String toString() {
        return "OnChannelArchivedEvent(channelsIds=" + this.b + ", changerTag=null)";
    }
}
