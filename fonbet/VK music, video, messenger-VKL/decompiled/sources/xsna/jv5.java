package xsna;

import java.util.ArrayList;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public final class jv5 {
    public final ArrayList a;

    public jv5(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv5) && this.a.equals(((jv5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("BackStack(stack="), this.a);
    }
}
