package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes13.dex */
public final /* synthetic */ class moe0 implements uxs {
    public static final moe0 a;
    private static final SerialDescriptor descriptor;

    static {
        moe0 moe0Var = new moe0();
        a = moe0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("core.flex.preload.actions.PreloadAction", moe0Var, 4);
        pluginGeneratedSerialDescriptor.j("query", false);
        pluginGeneratedSerialDescriptor.j("document", true);
        pluginGeneratedSerialDescriptor.j("timeToLifeTime", true);
        pluginGeneratedSerialDescriptor.j("tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ooe0.e;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(e6m.a), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ooe0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        u1m u1mVar = null;
        ywl ywlVar = null;
        Double d = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u1mVar = (u1m) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), u1mVar);
                i |= 1;
            } else if (v == 1) {
                ywlVar = (ywl) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), ywlVar);
                i |= 2;
            } else if (v == 2) {
                d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ooe0(i, u1mVar, ywlVar, d, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ooe0 ooe0Var = (ooe0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ooe0.e;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        u1m u1mVar = ooe0Var.a;
        String str = ooe0Var.d;
        Double d = ooe0Var.c;
        ywl ywlVar = ooe0Var.b;
        b.e(serialDescriptor, 0, kSerializer, u1mVar);
        if (b.F() || ywlVar != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ywlVar);
        }
        if (b.F() || d != null) {
            b.g(serialDescriptor, 2, e6m.a, d);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 3, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
