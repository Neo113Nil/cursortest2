package defpackage;

import defpackage.rct;
import java.util.Calendar;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class pct implements uxs {
    public static final pct a;
    private static final SerialDescriptor descriptor;

    static {
        pct pctVar = new pct();
        a = pctVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.data.dto.GetRideHistoryOrderByIdResponse.RideHistoryOrderDetailsDto", pctVar, 7);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j("tariff_internal_name", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        pluginGeneratedSerialDescriptor.j("driver", true);
        pluginGeneratedSerialDescriptor.j("route", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, vmt.a, auu0Var, auu0Var, z96.a, sct.a, uct.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        Calendar calendar = null;
        String str2 = null;
        String str3 = null;
        rct.b bVar = null;
        rct.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    calendar = (Calendar) b.A(serialDescriptor, 1, vmt.a, calendar);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    bVar = (rct.b) b.A(serialDescriptor, 5, sct.a, bVar);
                    i |= 32;
                    break;
                case 6:
                    cVar = (rct.c) b.A(serialDescriptor, 6, uct.a, cVar);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new rct.a(i, str, calendar, str2, str3, z2, bVar, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rct.a aVar = (rct.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, Calendar.getInstance())) {
            b.e(serialDescriptor, 1, vmt.a, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, "")) {
            b.o(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, "")) {
            b.o(serialDescriptor, 3, aVar.d);
        }
        if (b.F() || aVar.e) {
            b.n(serialDescriptor, 4, aVar.e);
        }
        if (b.F() || !jl40.l(aVar.f, new rct.b(0))) {
            b.e(serialDescriptor, 5, sct.a, aVar.f);
        }
        if (b.F() || !jl40.l(aVar.g, new rct.c(0))) {
            b.e(serialDescriptor, 6, uct.a, aVar.g);
        }
        b.c(serialDescriptor);
    }
}
