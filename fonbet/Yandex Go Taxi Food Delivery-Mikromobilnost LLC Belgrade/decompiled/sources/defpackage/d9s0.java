package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class d9s0 implements uxs {
    public static final d9s0 a;
    private static final SerialDescriptor descriptor;

    static {
        d9s0 d9s0Var = new d9s0();
        a = d9s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.sections.action.ShowSnippetsAction", d9s0Var, 3);
        pluginGeneratedSerialDescriptor.j("sectionId", false);
        pluginGeneratedSerialDescriptor.j("showSnippetIds", true);
        pluginGeneratedSerialDescriptor.j("showSnippetTags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = f9s0.d;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = f9s0.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Set set = null;
        Set set2 = null;
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                set2 = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new f9s0(i, str, set, set2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f9s0 f9s0Var = (f9s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = f9s0.d;
        String str = f9s0Var.a;
        Set set = f9s0Var.c;
        Set set2 = f9s0Var.b;
        b.o(serialDescriptor, 0, str);
        boolean F = b.F();
        EmptySet emptySet = EmptySet.a;
        if (F || !jl40.l(set2, emptySet)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), set2);
        }
        if (b.F() || !jl40.l(set, emptySet)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), set);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
