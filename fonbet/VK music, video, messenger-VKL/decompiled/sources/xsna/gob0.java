package xsna;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: PollEditorEditChanges.kt */
/* loaded from: classes4.dex */
public final class gob0 {
    public final List<Long> a;
    public final Map<String, String> b;
    public final Map<Integer, String> c;

    public gob0() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gob0 a(gob0 gob0Var, wow wowVar, bpw bpwVar, bpw bpwVar2, int i) {
        List list = wowVar;
        if ((i & 1) != 0) {
            list = gob0Var.a;
        }
        Map map = bpwVar;
        if ((i & 2) != 0) {
            map = gob0Var.b;
        }
        Map map2 = bpwVar2;
        if ((i & 4) != 0) {
            map2 = gob0Var.c;
        }
        return new gob0(list, map, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gob0)) {
            return false;
        }
        gob0 gob0Var = (gob0) obj;
        return epx.f(this.a, gob0Var.a) && epx.f(this.b, gob0Var.b) && epx.f(this.c, gob0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollEditorEditChanges(deletedAnswers=");
        sb.append(this.a);
        sb.append(", editedAnswers=");
        sb.append(this.b);
        sb.append(", addedAnswers=");
        return cjl0.a(sb, this.c, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gob0(int i) {
        this(EmptyList.b, r2, r2);
        jgp jgpVar = jgp.b;
    }

    public gob0(List<Long> list, Map<String, String> map, Map<Integer, String> map2) {
        this.a = list;
        this.b = map;
        this.c = map2;
    }
}
