package xsna;

import com.vk.dto.group.Group;

/* compiled from: ExecuteBoardGetTopics.kt */
/* loaded from: classes6.dex */
public final class di7 {
    public final fj7 a;
    public final Group b;

    public di7(fj7 fj7Var, Group group) {
        this.a = fj7Var;
        this.b = group;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di7)) {
            return false;
        }
        di7 di7Var = (di7) obj;
        return epx.f(this.a, di7Var.a) && epx.f(this.b, di7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Group group = this.b;
        return hashCode + (group == null ? 0 : group.hashCode());
    }

    public final String toString() {
        return "BoardGetTopicsResult(result=" + this.a + ", group=" + this.b + ')';
    }
}
