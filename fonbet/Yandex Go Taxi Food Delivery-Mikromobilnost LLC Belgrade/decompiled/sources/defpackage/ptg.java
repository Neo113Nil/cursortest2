package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.scooters.data.model.DebtStatus;

/* loaded from: classes6.dex */
public final /* synthetic */ class ptg implements uxs {
    public static final ptg a;
    private static final SerialDescriptor descriptor;

    static {
        ptg ptgVar = new ptg();
        a = ptgVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Debt", ptgVar, 3);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("amount", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) rtg.d[0].getValue()), qke.n(h6w.a), qke.n(gef.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rtg.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        DebtStatus debtStatus = null;
        Integer num = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                debtStatus = (DebtStatus) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), debtStatus);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.s(serialDescriptor, 2, gef.a, iefVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new rtg(i, debtStatus, num, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rtg rtgVar = (rtg) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rtg.d;
        if (b.F() || rtgVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), rtgVar.a);
        }
        if (b.F() || rtgVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, rtgVar.b);
        }
        if (b.F() || rtgVar.c != null) {
            b.g(serialDescriptor, 2, gef.a, rtgVar.c);
        }
        b.c(serialDescriptor);
    }
}
