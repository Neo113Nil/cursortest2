package xsna;

/* compiled from: ClipsWrapperFocusedItemState.kt */
/* loaded from: classes17.dex */
public final class uqf {
    public final tqf a;

    public uqf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqf) && epx.f(this.a, ((uqf) obj).a);
    }

    public final int hashCode() {
        tqf tqfVar = this.a;
        if (tqfVar == null) {
            return 0;
        }
        return tqfVar.hashCode();
    }

    public final String toString() {
        return "ClipsWrapperFocusedItemState(focusedItem=" + this.a + ')';
    }

    public uqf(tqf tqfVar) {
        this.a = tqfVar;
    }
}
