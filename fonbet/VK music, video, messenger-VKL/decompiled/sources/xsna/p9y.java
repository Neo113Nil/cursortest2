package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import xsna.gbd0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class p9y implements KSerializer<o9y> {
    public static final p9y a = new p9y();
    public static final mbd0 b = cmi0.a("kotlinx.serialization.json.JsonLiteral", gbd0.i.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        JsonElement l = kn4.d(decoder).l();
        if (l instanceof o9y) {
            return (o9y) l;
        }
        throw ne7.d("Unexpected JSON element, expected JsonLiteral, had " + fpf0.a(l.getClass()), l.toString(), -1);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        o9y o9yVar = (o9y) obj;
        String str = o9yVar.d;
        kn4.e(encoder);
        if (o9yVar.b) {
            encoder.r(str);
            return;
        }
        SerialDescriptor serialDescriptor = o9yVar.c;
        if (serialDescriptor != null) {
            encoder.i(serialDescriptor).r(str);
            return;
        }
        Long n = arm0.n(str);
        if (n != null) {
            encoder.u(n.longValue());
            return;
        }
        oxp0 z = his0.z(str);
        if (z != null) {
            encoder.i(sxp0.b).u(z.b);
            return;
        }
        Double k = arm0.k(str);
        if (k != null) {
            encoder.H(k.doubleValue());
            return;
        }
        Boolean o0 = drm0.o0(str);
        if (o0 != null) {
            encoder.k(o0.booleanValue());
        } else {
            encoder.r(str);
        }
    }
}
