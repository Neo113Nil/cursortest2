package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class adx extends d {
    public final boolean a;
    public final SerialDescriptor b;
    public final String c;

    public adx(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        this.a = z;
        this.b = serialDescriptor;
        this.c = obj.toString();
        if (serialDescriptor == null || serialDescriptor.isInline()) {
            return;
        }
        ny61.g("Failed requirement.");
        throw null;
    }

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return this.c;
    }

    @Override // kotlinx.serialization.json.d
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || adx.class != obj.getClass()) {
            return false;
        }
        adx adxVar = (adx) obj;
        return this.a == adxVar.a && jl40.l(this.c, adxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final String toString() {
        boolean z = this.a;
        String str = this.c;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        ytu0.a(str, sb);
        return sb.toString();
    }
}
