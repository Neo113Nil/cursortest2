package xsna;

import java.util.Collection;

/* compiled from: DialogsFoldersCountersMergeTask.kt */
/* loaded from: classes2.dex */
public final class dqm extends b920 {
    public final Collection<spm> c;

    public dqm(Collection<spm> collection) {
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqm) && epx.f(this.c, ((dqm) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        w2wVar.I0().u(new rh4(11, w2wVar, this));
        return s3q0.a;
    }

    public final String toString() {
        return l4.h(new StringBuilder("DialogsFoldersCountersMergeTask(counters="), this.c, ')');
    }
}
