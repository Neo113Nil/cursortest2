package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class bkc implements uxs {
    public static final bkc a;
    private static final SerialDescriptor descriptor;

    static {
        bkc bkcVar = new bkc();
        a = bkcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.quark.js.command.Command.RegisterPlatformCapabilityCommand.Payload", bkcVar, 4);
        pluginGeneratedSerialDescriptor.j("capabilityId", false);
        pluginGeneratedSerialDescriptor.j("initialState", false);
        pluginGeneratedSerialDescriptor.j("supportedDirectives", false);
        pluginGeneratedSerialDescriptor.j("isLocal", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = dkc.e;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = dkc.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        png pngVar = null;
        List list = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                pngVar = (png) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), pngVar);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new dkc(i, str, pngVar, list, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dkc dkcVar = (dkc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = dkc.e;
        b.o(serialDescriptor, 0, dkcVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dkcVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), dkcVar.c);
        b.g(serialDescriptor, 3, z96.a, dkcVar.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
