package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class jhu implements uxs {
    public static final jhu a;
    private static final SerialDescriptor descriptor;

    static {
        jhu jhuVar = new jhu();
        a = jhuVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.sections.action.HideAllSnippetsAction", jhuVar, 2);
        pluginGeneratedSerialDescriptor.j("hideSnippetIds", true);
        pluginGeneratedSerialDescriptor.j("hideSnippetTags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = lhu.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lhu.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        Set set2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                set = (Set) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), set);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                set2 = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new lhu(i, set, set2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lhu lhuVar = (lhu) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lhu.c;
        boolean F = b.F();
        EmptySet emptySet = EmptySet.a;
        if (F || !jl40.l(lhuVar.a, emptySet)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), lhuVar.a);
        }
        if (b.F() || !jl40.l(lhuVar.b, emptySet)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), lhuVar.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
