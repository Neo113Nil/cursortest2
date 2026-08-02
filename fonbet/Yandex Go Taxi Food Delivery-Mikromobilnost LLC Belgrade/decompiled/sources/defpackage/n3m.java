package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class n3m implements uxs {
    public static final n3m a;
    private static final SerialDescriptor descriptor;

    static {
        n3m n3mVar = new n3m();
        a = n3mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.document.event.tracker.remote.visualEvents.DocumentVisualEventsTracker", n3mVar, 2);
        pluginGeneratedSerialDescriptor.j("onFirstVisibleItemChanged", false);
        pluginGeneratedSerialDescriptor.j("onLastVisibleItemChanged", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = p3m.c;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = p3m.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        kr krVar = null;
        kr krVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                krVar = (kr) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), krVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                krVar2 = (kr) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), krVar2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new p3m(i, krVar, krVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p3m p3mVar = (p3m) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = p3m.c;
        b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), p3mVar.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), p3mVar.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
