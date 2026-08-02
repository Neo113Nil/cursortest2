package xsna;

import io.opentelemetry.api.common.ValueType;
import java.util.Objects;

/* compiled from: ValueString.java */
/* loaded from: classes8.dex */
public final class akr0 implements ljr0<String> {
    public final String a;

    public akr0(String str) {
        this.a = str;
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
        return ValueType.STRING;
    }

    @Override // xsna.ljr0
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i5s.a(new StringBuilder("ValueString{"), this.a, "}");
    }
}
