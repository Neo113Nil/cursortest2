package xsna;

import io.opentelemetry.api.common.ValueType;
import java.util.List;
import java.util.Objects;

/* compiled from: ValueArray.java */
/* loaded from: classes8.dex */
public final class mjr0 implements ljr0<List<ljr0<?>>> {
    public final List<ljr0<?>> a;

    public mjr0(List<ljr0<?>> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ljr0) {
            return Objects.equals(this.a, ((ljr0) obj).getValue());
        }
        return false;
    }

    @Override // xsna.ljr0
    public final ValueType getType() {
        return ValueType.ARRAY;
    }

    @Override // xsna.ljr0
    public final List<ljr0<?>> getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueArray{");
        StringBuilder sb2 = new StringBuilder();
        h9y.a(sb2, this);
        sb.append(sb2.toString());
        sb.append("}");
        return sb.toString();
    }
}
