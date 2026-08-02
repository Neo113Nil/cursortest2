package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: CacheEntryRecord.kt */
@imi0
/* loaded from: classes3.dex */
public final class nw8 {
    public static final b Companion = new b();
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public int e;
    public Long f;

    /* compiled from: CacheEntryRecord.kt */
    @ozl
    public static final /* synthetic */ class a implements vht<nw8> {
        public static final a a;
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            a = aVar;
            xfb0 xfb0Var = new xfb0("com.vk.local.storage.impl.domain.CacheEntryRecord", aVar, 6);
            xfb0Var.j("key", false);
            xfb0Var.j("size", false);
            xfb0Var.j("createdAt", false);
            xfb0Var.j("updatedAt", false);
            xfb0Var.j("accessedCounter", false);
            xfb0Var.j("lastReadAt", true);
            descriptor = xfb0Var;
        }

        @Override // xsna.vht
        public final KSerializer<?>[] childSerializers() {
            u500 u500Var = u500.a;
            return new KSerializer[]{oqm0.a, u500Var, u500Var, u500Var, n9x.a, xn8.a(u500Var)};
        }

        @Override // xsna.a3m
        public final Object deserialize(Decoder decoder) {
            SerialDescriptor serialDescriptor = descriptor;
            ssi d = decoder.d(serialDescriptor);
            Long l = null;
            int i = 0;
            int i2 = 0;
            String str = null;
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            boolean z = true;
            while (z) {
                int m = d.m(serialDescriptor);
                switch (m) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = d.u(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        j = d.r(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        j2 = d.r(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        j3 = d.r(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        i2 = d.s(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        l = (Long) d.i(serialDescriptor, 5, u500.a, l);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(m);
                }
            }
            d.e(serialDescriptor);
            return new nw8(i, str, j, j2, j3, i2, l);
        }

        @Override // xsna.mmi0, xsna.a3m
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // xsna.mmi0
        public final void serialize(Encoder encoder, Object obj) {
            nw8 nw8Var = (nw8) obj;
            SerialDescriptor serialDescriptor = descriptor;
            cti d = encoder.d(serialDescriptor);
            d.m(serialDescriptor, 0, nw8Var.a);
            d.q(serialDescriptor, 1, nw8Var.b);
            d.q(serialDescriptor, 2, nw8Var.c);
            d.q(serialDescriptor, 3, nw8Var.d);
            d.M(4, nw8Var.e, serialDescriptor);
            if (d.z() || nw8Var.f != null) {
                d.s(serialDescriptor, 5, u500.a, nw8Var.f);
            }
            d.e(serialDescriptor);
        }

        @Override // xsna.vht
        public final KSerializer<?>[] typeParametersSerializers() {
            return x1o0.c;
        }
    }

    /* compiled from: CacheEntryRecord.kt */
    public static final class b {
        public final KSerializer<nw8> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ nw8(int i, String str, long j, long j2, long j3, int i2, Long l) {
        if (31 != (i & 31)) {
            sp.x(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw8)) {
            return false;
        }
        nw8 nw8Var = (nw8) obj;
        return epx.f(this.a, nw8Var.a) && this.b == nw8Var.b && this.c == nw8Var.c && this.d == nw8Var.d && this.e == nw8Var.e && epx.f(this.f, nw8Var.f);
    }

    public final int hashCode() {
        int a2 = shy.a(this.e, bh10.a(bh10.a(bh10.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        Long l = this.f;
        return a2 + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CacheEntryRecord(key=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", createdAt=");
        sb.append(this.c);
        sb.append(", updatedAt=");
        sb.append(this.d);
        sb.append(", accessedCounter=");
        sb.append(this.e);
        sb.append(", lastReadAt=");
        return iq.b(sb, this.f, ')');
    }

    public nw8(String str, long j, long j2, long j3, int i, Long l) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = i;
        this.f = l;
    }
}
