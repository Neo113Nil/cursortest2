package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ShopConditionParams.kt */
/* loaded from: classes18.dex */
public final class iej0 {
    public final int a;
    public final List b;

    public iej0(int i, ListBuilder listBuilder) {
        this.a = i;
        this.b = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iej0)) {
            return false;
        }
        iej0 iej0Var = (iej0) obj;
        return this.a == iej0Var.a && epx.f(this.b, iej0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopConditionSection(title=");
        sb.append(this.a);
        sb.append(", unitedParagraphs=");
        return jr.a(')', sb, this.b);
    }
}
