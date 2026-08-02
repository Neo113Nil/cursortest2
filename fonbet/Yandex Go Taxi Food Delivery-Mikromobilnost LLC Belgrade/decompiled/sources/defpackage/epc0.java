package defpackage;

import com.yandex.plus.core.graphql.type.UNIFYING_PREDICATE_TYPE;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class epc0 {
    public final UNIFYING_PREDICATE_TYPE a;
    public final ArrayList b;

    public epc0(UNIFYING_PREDICATE_TYPE unifying_predicate_type, ArrayList arrayList) {
        this.a = unifying_predicate_type;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epc0)) {
            return false;
        }
        epc0 epc0Var = (epc0) obj;
        return this.a == epc0Var.a && this.b.equals(epc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnifyingPredicate(type=");
        sb.append(this.a);
        sb.append(", nodeIds=");
        return smw0.m(sb, this.b, ')');
    }
}
