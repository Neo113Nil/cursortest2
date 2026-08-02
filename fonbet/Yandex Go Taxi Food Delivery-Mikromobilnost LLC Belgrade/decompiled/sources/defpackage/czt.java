package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class czt implements uxs {
    public static final czt a;
    private static final SerialDescriptor descriptor;

    static {
        czt cztVar = new czt();
        a = cztVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("radial", cztVar, 3);
        pluginGeneratedSerialDescriptor.j("colors", false);
        pluginGeneratedSerialDescriptor.j("radius", false);
        pluginGeneratedSerialDescriptor.j("center", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        vud0 vud0Var = vud0.a;
        return new KSerializer[]{ezt.e[0].getValue(), vud0Var, vud0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ezt.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        xud0 xud0Var = null;
        xud0 xud0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                xud0Var = (xud0) b.A(serialDescriptor, 1, vud0.a, xud0Var);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                xud0Var2 = (xud0) b.A(serialDescriptor, 2, vud0.a, xud0Var2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ezt(i, list, xud0Var, xud0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ezt eztVar = (ezt) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) ezt.e[0].getValue(), eztVar.b);
        vud0 vud0Var = vud0.a;
        b.e(serialDescriptor, 1, vud0Var, eztVar.c);
        b.e(serialDescriptor, 2, vud0Var, eztVar.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
