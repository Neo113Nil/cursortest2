package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class h1j0 implements uxs {
    public static final h1j0 a;
    private static final SerialDescriptor descriptor;

    static {
        h1j0 h1j0Var = new h1j0();
        a = h1j0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.sections.action.ReplaceSnippetsAction", h1j0Var, 5);
        pluginGeneratedSerialDescriptor.j("sectionId", false);
        pluginGeneratedSerialDescriptor.j("hideSnippetIds", true);
        pluginGeneratedSerialDescriptor.j("hideSnippetTags", true);
        pluginGeneratedSerialDescriptor.j("showSnippetIds", true);
        pluginGeneratedSerialDescriptor.j("showSnippetTags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = j1j0.f;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = j1j0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Set set = null;
        Set set2 = null;
        Set set3 = null;
        Set set4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                i |= 2;
            } else if (v == 2) {
                set2 = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set2);
                i |= 4;
            } else if (v == 3) {
                set3 = (Set) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), set3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                set4 = (Set) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), set4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new j1j0(i, str, set, set2, set3, set4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j1j0 j1j0Var = (j1j0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = j1j0.f;
        String str = j1j0Var.a;
        Set set = j1j0Var.e;
        Set set2 = j1j0Var.d;
        Set set3 = j1j0Var.c;
        Set set4 = j1j0Var.b;
        b.o(serialDescriptor, 0, str);
        boolean F = b.F();
        EmptySet emptySet = EmptySet.a;
        if (F || !jl40.l(set4, emptySet)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), set4);
        }
        if (b.F() || !jl40.l(set3, emptySet)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), set3);
        }
        if (b.F() || !jl40.l(set2, emptySet)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), set2);
        }
        if (b.F() || !jl40.l(set, emptySet)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), set);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
