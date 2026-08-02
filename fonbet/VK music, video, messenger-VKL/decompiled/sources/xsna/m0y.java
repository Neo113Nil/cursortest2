package xsna;

import com.vk.dto.common.GroupsSuggestions;

/* compiled from: ExecuteJoinGroup.kt */
/* loaded from: classes15.dex */
public final class m0y {
    public final boolean a;
    public final GroupsSuggestions b;

    public m0y(boolean z, GroupsSuggestions groupsSuggestions) {
        this.a = z;
        this.b = groupsSuggestions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0y)) {
            return false;
        }
        m0y m0yVar = (m0y) obj;
        return this.a == m0yVar.a && epx.f(this.b, m0yVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        GroupsSuggestions groupsSuggestions = this.b;
        return hashCode + (groupsSuggestions == null ? 0 : groupsSuggestions.hashCode());
    }

    public final String toString() {
        return "JoinGroupResult(joined=" + this.a + ", suggestions=" + this.b + ')';
    }
}
