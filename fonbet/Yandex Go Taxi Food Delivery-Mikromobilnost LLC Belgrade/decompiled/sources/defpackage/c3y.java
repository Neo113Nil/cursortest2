package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class c3y implements uxs {
    public static final c3y a;
    private static final SerialDescriptor descriptor;

    static {
        c3y c3yVar = new c3y();
        a = c3yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.meta.LayoutableSectionSurrogate", c3yVar, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("reloadable", false);
        pluginGeneratedSerialDescriptor.j("revision", false);
        pluginGeneratedSerialDescriptor.j("gridLayout", false);
        pluginGeneratedSerialDescriptor.j("sections", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = e3y.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, z96.a, qke.n(auu0Var), b1u.a, i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = e3y.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        d1u d1uVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                d1uVar = (d1u) b.A(serialDescriptor, 3, b1u.a, d1uVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new e3y(i, str, z2, str2, d1uVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e3y e3yVar = (e3y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = e3y.f;
        b.o(serialDescriptor, 0, e3yVar.a);
        b.n(serialDescriptor, 1, e3yVar.b);
        b.g(serialDescriptor, 2, auu0.a, e3yVar.c);
        b.e(serialDescriptor, 3, b1u.a, e3yVar.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), e3yVar.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
