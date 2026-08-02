package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class nzl implements uxs {
    public static final nzl a;
    private static final SerialDescriptor descriptor;

    static {
        nzl nzlVar = new nzl();
        a = nzlVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.document.event.tracker.remote.DocumentEventCallbacksTracker", nzlVar, 6);
        pluginGeneratedSerialDescriptor.j("renderingStarted", false);
        pluginGeneratedSerialDescriptor.j("renderingFinished", false);
        pluginGeneratedSerialDescriptor.j("didAppear", false);
        pluginGeneratedSerialDescriptor.j("didDisappear", false);
        pluginGeneratedSerialDescriptor.j("onForeground", false);
        pluginGeneratedSerialDescriptor.j("onBackground", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = pzl.g;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pzl.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        kr krVar = null;
        kr krVar2 = null;
        kr krVar3 = null;
        kr krVar4 = null;
        kr krVar5 = null;
        kr krVar6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
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
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new pzl(i, krVar, krVar2, krVar3, krVar4, krVar5, krVar6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pzl pzlVar = (pzl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pzl.g;
        b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), pzlVar.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), pzlVar.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), pzlVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), pzlVar.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), pzlVar.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), pzlVar.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
