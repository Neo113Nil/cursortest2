package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.data.model.SessionOfferType;

/* loaded from: classes6.dex */
public final /* synthetic */ class k1r0 implements uxs {
    public static final k1r0 a;
    private static final SerialDescriptor descriptor;

    static {
        k1r0 k1r0Var = new k1r0();
        a = k1r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegmentInfoSpecialsOffer", k1r0Var, 5);
        pluginGeneratedSerialDescriptor.j("prices", true);
        pluginGeneratedSerialDescriptor.j("offer_id", true);
        pluginGeneratedSerialDescriptor.j("finish_area_border", true);
        pluginGeneratedSerialDescriptor.j("finish", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = m1r0.f;
        KSerializer n = qke.n(n1r0.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = m1r0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        p1r0 p1r0Var = null;
        String str = null;
        List list = null;
        String str2 = null;
        SessionOfferType sessionOfferType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                p1r0Var = (p1r0) b.s(serialDescriptor, 0, n1r0.a, p1r0Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                sessionOfferType = (SessionOfferType) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), sessionOfferType);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new m1r0(i, p1r0Var, str, list, str2, sessionOfferType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m1r0 m1r0Var = (m1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = m1r0.f;
        if (b.F() || m1r0Var.a != null) {
            b.g(serialDescriptor, 0, n1r0.a, m1r0Var.a);
        }
        if (b.F() || m1r0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, m1r0Var.b);
        }
        if (b.F() || m1r0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), m1r0Var.c);
        }
        if (b.F() || m1r0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, m1r0Var.d);
        }
        if (b.F() || m1r0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), m1r0Var.e);
        }
        b.c(serialDescriptor);
    }
}
