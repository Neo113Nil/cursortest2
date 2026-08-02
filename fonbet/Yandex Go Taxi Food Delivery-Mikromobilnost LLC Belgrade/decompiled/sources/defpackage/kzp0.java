package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class kzp0 implements uxs {
    public static final kzp0 a;
    private static final SerialDescriptor descriptor;

    static {
        kzp0 kzp0Var = new kzp0();
        a = kzp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.content.SectionContentSurrogate.Actions", kzp0Var, 7);
        pluginGeneratedSerialDescriptor.j("onShow", false);
        pluginGeneratedSerialDescriptor.j("afterShown", false);
        pluginGeneratedSerialDescriptor.j("onUpdate", false);
        pluginGeneratedSerialDescriptor.j("onCancel", false);
        pluginGeneratedSerialDescriptor.j("onPullToRefresh", false);
        pluginGeneratedSerialDescriptor.j("onLoadMore", false);
        pluginGeneratedSerialDescriptor.j("multiStrategiesOnLoadMores", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = mzp0.h;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = mzp0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        kr krVar = null;
        kr krVar2 = null;
        kr krVar3 = null;
        kr krVar4 = null;
        kr krVar5 = null;
        kr krVar6 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    krVar = (kr) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), krVar);
                    i |= 1;
                    break;
                case 1:
                    krVar2 = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar2);
                    i |= 2;
                    break;
                case 2:
                    krVar3 = (kr) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), krVar3);
                    i |= 4;
                    break;
                case 3:
                    krVar4 = (kr) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), krVar4);
                    i |= 8;
                    break;
                case 4:
                    krVar5 = (kr) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), krVar5);
                    i |= 16;
                    break;
                case 5:
                    krVar6 = (kr) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), krVar6);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new mzp0(i, krVar, krVar2, krVar3, krVar4, krVar5, krVar6, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mzp0 mzp0Var = (mzp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = mzp0.h;
        b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), mzp0Var.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), mzp0Var.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), mzp0Var.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), mzp0Var.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), mzp0Var.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), mzp0Var.f);
        b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), mzp0Var.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
