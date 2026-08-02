package xsna;

import xsna.tlo0;

/* compiled from: ClipMetaCenteredViewState.kt */
/* loaded from: classes2.dex */
public final class w7d {
    public final tlo0.h a;

    public w7d(tlo0.h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w7d) && this.a.equals(((w7d) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return jq.c(new StringBuilder("ClipMetaCenteredViewState(viewCount="), this.a, ')');
    }
}
