package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class nzp0 implements uxs {
    public static final nzp0 a;
    private static final SerialDescriptor descriptor;

    static {
        nzp0 nzp0Var = new nzp0();
        a = nzp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.content.SectionContentSurrogate.Animations", nzp0Var, 2);
        pluginGeneratedSerialDescriptor.j("onShow", false);
        pluginGeneratedSerialDescriptor.j("onRefresh", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = pzp0.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pzp0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        tg2 tg2Var = null;
        tg2 tg2Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                tg2Var = (tg2) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), tg2Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                tg2Var2 = (tg2) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), tg2Var2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new pzp0(i, tg2Var, tg2Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pzp0 pzp0Var = (pzp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pzp0.c;
        b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), pzp0Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), pzp0Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
