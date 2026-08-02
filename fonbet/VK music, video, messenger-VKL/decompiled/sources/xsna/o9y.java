package xsna;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: JsonElement.kt */
/* loaded from: classes8.dex */
public final class o9y extends JsonPrimitive {
    public final boolean b;
    public final SerialDescriptor c;
    public final String d;

    public o9y(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        this.b = z;
        this.c = serialDescriptor;
        this.d = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o9y.class != obj.getClass()) {
            return false;
        }
        o9y o9yVar = (o9y) obj;
        return this.b == o9yVar.b && epx.f(this.d, o9yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.b;
        String str = this.d;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        jqm0.a(str, sb);
        return sb.toString();
    }
}
