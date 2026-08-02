package defpackage;

import com.yandex.div.evaluable.EvaluableType;

/* loaded from: classes.dex */
public final class kms {
    public final EvaluableType a;
    public final boolean b;

    public kms(EvaluableType evaluableType, boolean z) {
        this.a = evaluableType;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kms)) {
            return false;
        }
        kms kmsVar = (kms) obj;
        return this.a == kmsVar.a && this.b == kmsVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FunctionArgument(type=");
        sb.append(this.a);
        sb.append(", isVariadic=");
        return unr0.u(sb, this.b, ')');
    }
}
