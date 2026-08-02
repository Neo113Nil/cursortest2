package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class bdx implements KSerializer {
    public static final bdx a = new bdx();
    public static final o2f0 b = d6z.a("kotlinx.serialization.json.JsonLiteral", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx e = y5e.e(decoder);
        b t = e.t();
        if (t instanceof adx) {
            return (adx) t;
        }
        String str = "Unexpected JSON element, expected JsonLiteral, had " + qoi0.a(t.getClass());
        String obj = e.d().a.n ? qje.G(-1, t.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str, null, null, obj), str, null, obj, -1, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        adx adxVar = (adx) obj;
        String str = adxVar.c;
        y5e.f(encoder);
        if (adxVar.a) {
            encoder.t(str);
            return;
        }
        SerialDescriptor serialDescriptor = adxVar.b;
        if (serialDescriptor != null) {
            encoder.i(serialDescriptor).t(str);
            return;
        }
        Long m = bvu0.m(10, str);
        if (m != null) {
            encoder.w(m.longValue());
            return;
        }
        yq11 K0 = cma1.K0(10, str);
        if (K0 != null) {
            encoder.i(cr11.b).w(K0.a);
            return;
        }
        Double i = avu0.i(str);
        if (i != null) {
            encoder.u(i.doubleValue());
            return;
        }
        Boolean j0 = evu0.j0(str);
        if (j0 != null) {
            encoder.l(j0.booleanValue());
        } else {
            encoder.t(str);
        }
    }
}
