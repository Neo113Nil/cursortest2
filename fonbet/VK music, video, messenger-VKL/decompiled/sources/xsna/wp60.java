package xsna;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NewsfeedListEvent.kt */
/* loaded from: classes4.dex */
public final class wp60 implements yo60 {
    public final RecyclerView.e0 a;

    public wp60(RecyclerView.e0 e0Var) {
        this.a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wp60) && epx.f(this.a, ((wp60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ToHolder(holder=" + this.a + ')';
    }
}
