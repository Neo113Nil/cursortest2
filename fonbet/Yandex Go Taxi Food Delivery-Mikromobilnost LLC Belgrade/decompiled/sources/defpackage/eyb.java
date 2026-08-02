package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public final /* synthetic */ class eyb implements uxs {
    public static final eyb a;
    private static final SerialDescriptor descriptor;

    static {
        eyb eybVar = new eyb();
        a = eybVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.clarifypoints.ClarifyPoint", eybVar, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("completion_timeout_ms", true);
        pluginGeneratedSerialDescriptor.j("initial_zoom_level", true);
        pluginGeneratedSerialDescriptor.j("subtitle_text", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{gyb.f[0].getValue(), h6w.a, qke.n(e6m.a), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gyb.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        RoutePointType routePointType = null;
        Double d = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                routePointType = (RoutePointType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), routePointType);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new gyb(i, routePointType, i2, d, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gyb gybVar = (gyb) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gyb.f;
        if (b.F() || gybVar.a != RoutePointType.POINT_A) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), gybVar.a);
        }
        if (b.F() || gybVar.b != 0) {
            b.A(1, gybVar.b, serialDescriptor);
        }
        if (b.F() || gybVar.c != null) {
            b.g(serialDescriptor, 2, e6m.a, gybVar.c);
        }
        if (b.F() || !jl40.l(gybVar.d, "")) {
            b.o(serialDescriptor, 3, gybVar.d);
        }
        if (b.F() || !jl40.l(gybVar.e, "")) {
            b.o(serialDescriptor, 4, gybVar.e);
        }
        b.c(serialDescriptor);
    }
}
