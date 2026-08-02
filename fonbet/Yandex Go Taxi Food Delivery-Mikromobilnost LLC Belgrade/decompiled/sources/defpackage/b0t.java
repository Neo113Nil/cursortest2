package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class b0t implements KSerializer {
    public static final b0t a = new b0t();
    public static final s43 b;

    static {
        e6m e6mVar = e6m.a;
        b = new s43(e6m.b, 1);
    }

    public static zzs a(b bVar) {
        if (bVar instanceof a) {
            a aVar = (a) bVar;
            List list = aVar.a;
            if (list.size() < 2) {
                yci0.m(oyr.i(list.size(), "GeoPoint has unsupported array size "));
                return null;
            }
            Double i = qcx.i(qcx.n(aVar.get(0)));
            Double i2 = qcx.i(qcx.n(aVar.get(1)));
            if (i2 != null && i != null) {
                return new zzs(i2.doubleValue(), i.doubleValue(), 0, null, Long.valueOf(System.currentTimeMillis()), 12);
            }
            throw new SerializationException("GeoPoint has unsupported values format " + i2 + Extension.FIX_SPACE + i);
        }
        if (bVar instanceof JsonNull) {
            return zzs.f;
        }
        if (!(bVar instanceof d)) {
            yci0.v(bVar, "GeoPoint receive unsupported element: ");
            return null;
        }
        d dVar = (d) bVar;
        if (!dVar.b()) {
            yci0.m(g8e.o("GeoPoint receive invalid primitive: ", dVar.a()));
            return null;
        }
        uzs uzsVar = zzs.Companion;
        String a2 = dVar.a();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        uzsVar.getClass();
        zzs a3 = uzs.a(valueOf, a2, true);
        if (a3 != null) {
            return a3;
        }
        yci0.m(oyr.p("GeoPoint can't parse from fromCommaString. Raw value \"", dVar.a(), "\""));
        return null;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return a(ncxVar.t());
        }
        yci0.m("GeoPoint can only be deserialized from JSON");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zzs zzsVar = (zzs) obj;
        encoder.C();
        s43 s43Var = b;
        yjd r = encoder.r(s43Var);
        r.E(s43Var, 0, zzsVar.b);
        r.E(s43Var, 1, zzsVar.a);
        r.c(s43Var);
    }
}
