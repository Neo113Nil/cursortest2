package xsna;

import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;
import xsna.zno;

/* compiled from: BuiltInSerializers.kt */
/* loaded from: classes8.dex */
public final class goo implements KSerializer<zno> {
    public static final goo a = new goo();
    public static final mbd0 b = new mbd0("kotlin.time.Duration", gbd0.i.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        zno.a aVar = zno.c;
        String x = decoder.x();
        try {
            long d = eoo.d(x);
            if (zno.d(d, zno.f)) {
                throw new IllegalStateException("invariant failed");
            }
            return new zno(d);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(zr.a("Invalid ISO duration string format: '", x, "'."), e);
        }
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((zno) obj).b;
        zno.a aVar = zno.c;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long n = j < 0 ? zno.n(j) : j;
        long l = zno.l(n, DurationUnit.HOURS);
        boolean z = false;
        int l2 = zno.g(n) ? 0 : (int) (zno.l(n, DurationUnit.MINUTES) % 60);
        int l3 = zno.g(n) ? 0 : (int) (zno.l(n, DurationUnit.SECONDS) % 60);
        int f = zno.f(n);
        if (zno.g(j)) {
            l = 9999999999999L;
        }
        boolean z2 = l != 0;
        boolean z3 = (l3 == 0 && f == 0) ? false : true;
        if (l2 != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(l);
            sb.append('H');
        }
        if (z) {
            sb.append(l2);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            zno.b(sb, l3, f, 9, "S", true);
        }
        encoder.r(sb.toString());
    }
}
