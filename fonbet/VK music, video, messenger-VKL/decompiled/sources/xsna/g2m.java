package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: GoodDescriptionComposeViewHolders.kt */
/* loaded from: classes18.dex */
public final class g2m {
    public final List<h4u> a;

    public g2m(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2m) && epx.f(this.a, ((g2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("DescriptionPagesState(pages="), this.a);
    }
}
