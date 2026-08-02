package xsna;

import java.util.ArrayList;

/* compiled from: CommunityProfileLinksViewState.kt */
/* loaded from: classes3.dex */
public final class wqh implements lm50 {
    public final ArrayList b;

    public wqh(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqh) && this.b.equals(((wqh) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return bo.c(')', new StringBuilder("CommunityProfileLinksViewState(links="), this.b);
    }
}
