package yads;

import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class zu1 implements av1 {
    public final List a;

    public zu1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu1) && epx.f(this.a, ((zu1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("IncorrectIntegration(causes=", ")", this.a);
    }
}
