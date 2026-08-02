package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class ru0 {
    public final x41 a;

    public ru0(x41 x41Var) {
        this.a = x41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru0) && epx.f(this.a, ((ru0) obj).a);
    }

    public final int hashCode() {
        x41 x41Var = this.a;
        if (x41Var == null) {
            return 0;
        }
        return x41Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.a + ")";
    }
}
