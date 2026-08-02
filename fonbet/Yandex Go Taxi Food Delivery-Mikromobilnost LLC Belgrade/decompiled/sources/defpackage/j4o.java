package defpackage;

import kotlin.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class j4o extends PluginGeneratedSerialDescriptor {
    public final fsq0 m;
    public final i3y n;

    public j4o(String str, int i) {
        super(str, null, i);
        this.m = fsq0.g;
        this.n = a.a(new i4o(i, str, this));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return ((SerialDescriptor[]) this.n.getValue())[i];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == fsq0.g && this.a.equals(serialDescriptor.h()) && jl40.l(uh6.f(this), uh6.f(serialDescriptor));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    public final jl40 getKind() {
        return this.m;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        h8 h8Var = new h8(this);
        int i = 1;
        while (h8Var.hasNext()) {
            int i2 = i * 31;
            String str = (String) h8Var.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final String toString() {
        return kotlin.collections.a.X(new g73(3, this), Extension.FIX_SPACE, this.a.concat(Extension.O_BRAKE), Extension.C_BRAKE, null, 56);
    }
}
