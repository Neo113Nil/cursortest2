package defpackage;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final class exv extends PluginGeneratedSerialDescriptor {
    public final boolean m;

    public exv(String str, uxs uxsVar) {
        super(str, uxsVar, 1);
        this.m = true;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof exv) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.h())) {
                exv exvVar = (exv) obj;
                if (exvVar.m && Arrays.equals((SerialDescriptor[]) this.k.getValue(), (SerialDescriptor[]) exvVar.k.getValue())) {
                    int e = serialDescriptor.e();
                    int i2 = this.c;
                    if (i2 == e) {
                        for (0; i < i2; i + 1) {
                            i = (jl40.l(d(i).h(), serialDescriptor.d(i).h()) && jl40.l(d(i).getKind(), serialDescriptor.d(i).getKind())) ? i + 1 : 0;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.m;
    }
}
