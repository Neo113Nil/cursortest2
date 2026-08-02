package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: MorePopupViewState.kt */
/* loaded from: classes16.dex */
public final class s930 {
    public final boolean a;
    public final List b;

    public s930(boolean z, List list) {
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s930)) {
            return false;
        }
        s930 s930Var = (s930) obj;
        return this.a == s930Var.a && epx.f(this.b, s930Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MorePopupViewState(isVisible=");
        sb.append(this.a);
        sb.append(", choiceItems=");
        return jr.a(')', sb, this.b);
    }

    public s930() {
        this(false, EmptyList.b);
    }
}
