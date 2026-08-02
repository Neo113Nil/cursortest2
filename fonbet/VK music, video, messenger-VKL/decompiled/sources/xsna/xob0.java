package xsna;

import java.util.List;

/* compiled from: PollEditorPatch.kt */
/* loaded from: classes4.dex */
public final class xob0 implements yob0 {
    public final List<Long> b;

    public xob0(List<Long> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xob0) && epx.f(this.b, ((xob0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("UpdateDeletedAnswers(deletedAnswers="), this.b);
    }
}
