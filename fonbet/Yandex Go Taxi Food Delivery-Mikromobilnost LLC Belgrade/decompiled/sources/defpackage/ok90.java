package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

/* loaded from: classes6.dex */
public final /* synthetic */ class ok90 implements uxs {
    public static final ok90 a;
    private static final SerialDescriptor descriptor;

    static {
        ok90 ok90Var = new ok90();
        a = ok90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PassPurchaseStatusResponse", ok90Var, 2);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) qk90.c[0].getValue()), qke.n(xzf0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qk90.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        PurchaseStatus purchaseStatus = null;
        b0g0 b0g0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                purchaseStatus = (PurchaseStatus) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), purchaseStatus);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                b0g0Var = (b0g0) b.s(serialDescriptor, 1, xzf0.a, b0g0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new qk90(i, purchaseStatus, b0g0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qk90 qk90Var = (qk90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qk90.c;
        if (b.F() || qk90Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), qk90Var.a);
        }
        if (b.F() || qk90Var.b != null) {
            b.g(serialDescriptor, 1, xzf0.a, qk90Var.b);
        }
        b.c(serialDescriptor);
    }
}
