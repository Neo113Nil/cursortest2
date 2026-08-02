package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;

/* loaded from: classes10.dex */
public final class sm3 {
    public final List a;

    public sm3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm3) && epx.f(this.a, ((sm3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xsna.wq.c("ViewableImpression(viewableUrls=", ")", this.a);
    }
}
