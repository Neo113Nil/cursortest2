package xsna;

import xsna.l7x0;

/* compiled from: VotingStateUiDto.kt */
/* loaded from: classes4.dex */
public final class m7x0 {
    public l7x0 a;

    public m7x0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7x0) && epx.f(this.a, ((m7x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VotingStateUiDto(state=" + this.a + ')';
    }

    public m7x0(l7x0 l7x0Var) {
        this.a = l7x0Var;
    }

    public /* synthetic */ m7x0(int i) {
        this(l7x0.b.a);
    }
}
