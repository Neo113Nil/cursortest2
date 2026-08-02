package defpackage;

import com.yandex.quark.alice.AliceSessionType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class ko implements uxs {
    public static final ko a;
    private static final SerialDescriptor descriptor;

    static {
        ko koVar = new ko();
        a = koVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.quark.alice.actions.Action.BinaryAction", koVar, 4);
        pluginGeneratedSerialDescriptor.j("payload", false);
        pluginGeneratedSerialDescriptor.j("dialogId", true);
        pluginGeneratedSerialDescriptor.j("folderId", true);
        pluginGeneratedSerialDescriptor.j("sessionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{p67.c, qke.n(eej.a), qke.n(owr.a), mo.e[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mo.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        byte[] bArr = null;
        gej gejVar = null;
        String str = null;
        AliceSessionType aliceSessionType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bArr = (byte[]) b.A(serialDescriptor, 0, p67.c, bArr);
                i |= 1;
            } else if (v == 1) {
                gejVar = (gej) b.s(serialDescriptor, 1, eej.a, gejVar);
                i |= 2;
            } else if (v == 2) {
                qwr qwrVar = (qwr) b.s(serialDescriptor, 2, owr.a, str != null ? new qwr(str) : null);
                str = qwrVar != null ? qwrVar.a : null;
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aliceSessionType = (AliceSessionType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), aliceSessionType);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new mo(i, bArr, gejVar, str, aliceSessionType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mo moVar = (mo) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mo.e;
        p67 p67Var = p67.c;
        byte[] bArr = moVar.a;
        AliceSessionType aliceSessionType = moVar.d;
        String str = moVar.c;
        gej gejVar = moVar.b;
        b.e(serialDescriptor, 0, p67Var, bArr);
        if (b.F() || gejVar != null) {
            b.g(serialDescriptor, 1, eej.a, gejVar);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 2, owr.a, str != null ? new qwr(str) : null);
        }
        if (b.F() || aliceSessionType != AliceSessionType.TEXT) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), aliceSessionType);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
