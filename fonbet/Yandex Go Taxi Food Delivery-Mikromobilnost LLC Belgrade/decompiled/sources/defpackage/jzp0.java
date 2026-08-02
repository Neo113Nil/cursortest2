package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class jzp0 implements uxs {
    public static final jzp0 a;
    private static final SerialDescriptor descriptor;

    static {
        jzp0 jzp0Var = new jzp0();
        a = jzp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.content.SectionContentSurrogate", jzp0Var, 6);
        pluginGeneratedSerialDescriptor.j("settings", false);
        pluginGeneratedSerialDescriptor.j("sections", false);
        pluginGeneratedSerialDescriptor.j("nextPageToken", false);
        pluginGeneratedSerialDescriptor.j("actions", false);
        pluginGeneratedSerialDescriptor.j("animations", false);
        pluginGeneratedSerialDescriptor.j("loadingSettings", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(a0q0.a), d0q0.g[1].getValue(), qke.n(auu0.a), qke.n(kzp0.a), qke.n(nzp0.a), qke.n(rzp0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d0q0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        c0q0 c0q0Var = null;
        List list = null;
        String str = null;
        mzp0 mzp0Var = null;
        pzp0 pzp0Var = null;
        tzp0 tzp0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    c0q0Var = (c0q0) b.s(serialDescriptor, 0, a0q0.a, c0q0Var);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    mzp0Var = (mzp0) b.s(serialDescriptor, 3, kzp0.a, mzp0Var);
                    i |= 8;
                    break;
                case 4:
                    pzp0Var = (pzp0) b.s(serialDescriptor, 4, nzp0.a, pzp0Var);
                    i |= 16;
                    break;
                case 5:
                    tzp0Var = (tzp0) b.s(serialDescriptor, 5, rzp0.a, tzp0Var);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new d0q0(i, c0q0Var, list, str, mzp0Var, pzp0Var, tzp0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d0q0 d0q0Var = (d0q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d0q0.g;
        b.g(serialDescriptor, 0, a0q0.a, d0q0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), d0q0Var.b);
        b.g(serialDescriptor, 2, auu0.a, d0q0Var.c);
        b.g(serialDescriptor, 3, kzp0.a, d0q0Var.d);
        b.g(serialDescriptor, 4, nzp0.a, d0q0Var.e);
        b.g(serialDescriptor, 5, rzp0.a, d0q0Var.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
