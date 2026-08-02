package defpackage;

import flex.section.divkit.DivkitSnippet;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class cyk implements uxs {
    public static final cyk a;
    private static final SerialDescriptor descriptor;

    static {
        cyk cykVar = new cyk();
        a = cykVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.section.divkit.DivKitSectionSurrogate", cykVar, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("reloadable", false);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("loadingSnippet", false);
        pluginGeneratedSerialDescriptor.j("layout", true);
        pluginGeneratedSerialDescriptor.j("appearance", true);
        pluginGeneratedSerialDescriptor.j("errorSnippet", false);
        pluginGeneratedSerialDescriptor.j("bindingMethod", true);
        pluginGeneratedSerialDescriptor.j("origType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = eyk.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, z96.a, i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue()), v1q0.a, qyp0.a, qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = eyk.j;
        b.getClass();
        String str = null;
        boolean z = true;
        mw5 mw5Var = null;
        int i = 0;
        String str2 = null;
        boolean z2 = false;
        List list = null;
        DivkitSnippet divkitSnippet = null;
        x1q0 x1q0Var = null;
        syp0 syp0Var = null;
        DivkitSnippet divkitSnippet2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    divkitSnippet = (DivkitSnippet) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), divkitSnippet);
                    i |= 8;
                    break;
                case 4:
                    x1q0Var = (x1q0) b.A(serialDescriptor, 4, v1q0.a, x1q0Var);
                    i |= 16;
                    break;
                case 5:
                    syp0Var = (syp0) b.A(serialDescriptor, 5, qyp0.a, syp0Var);
                    i |= 32;
                    break;
                case 6:
                    divkitSnippet2 = (DivkitSnippet) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), divkitSnippet2);
                    i |= 64;
                    break;
                case 7:
                    mw5Var = (mw5) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), mw5Var);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new eyk(i, str2, z2, list, divkitSnippet, x1q0Var, syp0Var, divkitSnippet2, mw5Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        eyk eykVar = (eyk) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = eyk.j;
        String str = eykVar.a;
        String str2 = eykVar.i;
        mw5 mw5Var = eykVar.h;
        syp0 syp0Var = eykVar.f;
        x1q0 x1q0Var = eykVar.e;
        b.o(serialDescriptor, 0, str);
        b.n(serialDescriptor, 1, eykVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), eykVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), eykVar.d);
        if (b.F() || !jl40.l(x1q0Var, gvl.a)) {
            b.e(serialDescriptor, 4, v1q0.a, x1q0Var);
        }
        if (b.F() || !jl40.l(syp0Var, gvl.b)) {
            b.e(serialDescriptor, 5, qyp0.a, syp0Var);
        }
        b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), eykVar.g);
        if (b.F() || mw5Var != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), mw5Var);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 8, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
