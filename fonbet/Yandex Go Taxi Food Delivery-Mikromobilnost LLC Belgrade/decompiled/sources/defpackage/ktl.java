package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ktl implements uxs {
    public static final ktl a;
    private static final SerialDescriptor descriptor;

    static {
        ktl ktlVar = new ktl();
        a = ktlVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.content.DivkitContentSerializer.DivKitContentSurrogate", ktlVar, 2);
        pluginGeneratedSerialDescriptor.j("card", false);
        pluginGeneratedSerialDescriptor.j("animations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{htl.a, qke.n(ltl.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        jtl jtlVar = null;
        ntl ntlVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                jtlVar = (jtl) b.A(serialDescriptor, 0, htl.a, jtlVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                ntlVar = (ntl) b.s(serialDescriptor, 1, ltl.a, ntlVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ptl(i, jtlVar, ntlVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ptl ptlVar = (ptl) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        htl htlVar = htl.a;
        jtl jtlVar = ptlVar.a;
        ntl ntlVar = ptlVar.b;
        b.e(serialDescriptor, 0, htlVar, jtlVar);
        if (b.F() || ntlVar != null) {
            b.g(serialDescriptor, 1, ltl.a, ntlVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
