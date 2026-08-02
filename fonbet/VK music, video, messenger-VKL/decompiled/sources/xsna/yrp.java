package xsna;

import io.jsonwebtoken.JwtParser;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.gmi0;
import xsna.prm0;

/* compiled from: Enums.kt */
/* loaded from: classes8.dex */
public final class yrp extends xfb0 {
    public final gmi0.b l;
    public final bpn0 m;

    public yrp(final String str, final int i) {
        super(str, null, i);
        this.l = gmi0.b.a;
        this.m = new bpn0(new gzs() { // from class: xsna.xrp
            @Override // xsna.gzs
            public final Object invoke() {
                int i2 = i;
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    StringBuilder b = v1v.b(str, JwtParser.SEPARATOR_CHAR);
                    b.append(this.e[i3]);
                    serialDescriptorArr[i3] = cmi0.c(b.toString(), prm0.d.a, new SerialDescriptor[0]);
                }
                return serialDescriptorArr;
            }
        });
    }

    @Override // xsna.xfb0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == gmi0.b.a && epx.f(this.a, serialDescriptor.f()) && epx.f(fvr.f(this), fvr.f(serialDescriptor));
    }

    @Override // xsna.xfb0, kotlinx.serialization.descriptors.SerialDescriptor
    public final gmi0 getKind() {
        return this.l;
    }

    @Override // xsna.xfb0, kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return ((SerialDescriptor[]) this.m.getValue())[i];
    }

    @Override // xsna.xfb0
    public final int hashCode() {
        int hashCode = this.a.hashCode();
        ami0 ami0Var = new ami0(this);
        int i = 1;
        while (ami0Var.hasNext()) {
            int i2 = i * 31;
            String str = (String) ami0Var.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // xsna.xfb0
    public final String toString() {
        return j5g.g0(new bmi0(this), ", ", ho8.a(new StringBuilder(), this.a, '('), ")", 0, null, 56);
    }
}
