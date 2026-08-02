package xsna;

import java.util.List;

/* compiled from: AudioBookPersonViewState.kt */
/* loaded from: classes3.dex */
public final class si4 implements fm50 {
    public final yzt0<List<vh4>> a;

    public si4(h0u0 h0u0Var) {
        this.a = h0u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof si4) && epx.f(this.a, ((si4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr.c(new StringBuilder("PersonActionItemList(actionItemList="), this.a, ')');
    }
}
