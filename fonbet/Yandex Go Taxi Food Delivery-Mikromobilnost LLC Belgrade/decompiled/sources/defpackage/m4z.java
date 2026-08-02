package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class m4z implements uxs {
    public static final m4z a;
    private static final SerialDescriptor descriptor;

    static {
        m4z m4zVar = new m4z();
        a = m4zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.graphql.configuration.LocalSdkConfigurationModel", m4zVar, 10);
        pluginGeneratedSerialDescriptor.j("readyMessageTimeoutMillis", false);
        pluginGeneratedSerialDescriptor.j("animationDurationMillis", false);
        pluginGeneratedSerialDescriptor.j("hostsForOpenInSystem", false);
        pluginGeneratedSerialDescriptor.j("allowedHosts", false);
        pluginGeneratedSerialDescriptor.j("jsBridgeAllowedHosts", false);
        pluginGeneratedSerialDescriptor.j("forbiddenHosts", false);
        pluginGeneratedSerialDescriptor.j("webViewHideThreshold", false);
        pluginGeneratedSerialDescriptor.j("webViewDownwardScrollFriction", false);
        pluginGeneratedSerialDescriptor.j("isPanelDiagnosticEnabled", false);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = o4z.k;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(h6wVar), qke.n(h6wVar), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(h6wVar), qke.n(h6wVar), qke.n(z96.a), x3n.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = o4z.k;
        b.getClass();
        e3n e3nVar = null;
        Boolean bool = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        Integer num2 = null;
        Integer num3 = null;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        Set set4 = null;
        Integer num4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    num2 = (Integer) b.s(serialDescriptor, 0, h6w.a, num2);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    num3 = (Integer) b.s(serialDescriptor, 1, h6w.a, num3);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    set = (Set) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    set2 = (Set) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), set2);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    set3 = (Set) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), set3);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    set4 = (Set) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), set4);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    num4 = (Integer) b.s(serialDescriptor, 6, h6w.a, num4);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    num = (Integer) b.s(serialDescriptor, 7, h6w.a, num);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    e3nVar = (e3n) b.A(serialDescriptor, 9, x3n.a, e3nVar);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new o4z(i, num2, num3, set, set2, set3, set4, num4, num, bool, e3nVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o4z o4zVar = (o4z) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = o4z.k;
        h6w h6wVar = h6w.a;
        b.g(serialDescriptor, 0, h6wVar, o4zVar.a);
        b.g(serialDescriptor, 1, h6wVar, o4zVar.b);
        b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), o4zVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), o4zVar.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), o4zVar.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), o4zVar.f);
        b.g(serialDescriptor, 6, h6wVar, o4zVar.g);
        b.g(serialDescriptor, 7, h6wVar, o4zVar.h);
        b.g(serialDescriptor, 8, z96.a, o4zVar.i);
        b.e(serialDescriptor, 9, x3n.a, new e3n(o4zVar.j));
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
