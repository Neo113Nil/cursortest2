package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class jgc implements uxs {
    public static final jgc a;
    private static final SerialDescriptor descriptor;

    static {
        jgc jgcVar = new jgc();
        a = jgcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("LinearGradient", jgcVar, 3);
        pluginGeneratedSerialDescriptor.j("colors", false);
        pluginGeneratedSerialDescriptor.j("startPoint", false);
        pluginGeneratedSerialDescriptor.j("endPoint", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = lgc.d;
        mgc mgcVar = mgc.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), mgcVar, mgcVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = lgc.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        ogc ogcVar = null;
        ogc ogcVar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                ogcVar = (ogc) b.A(serialDescriptor, 1, mgc.a, ogcVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                ogcVar2 = (ogc) b.A(serialDescriptor, 2, mgc.a, ogcVar2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new lgc(i, list, ogcVar, ogcVar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        lgc.e((lgc) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
