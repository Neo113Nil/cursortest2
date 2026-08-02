package defpackage;

import flex.feature.divkit.scaffold.ScaffoldAnimations;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class njm0 implements uxs {
    public static final njm0 a;
    private static final SerialDescriptor descriptor;

    static {
        njm0 njm0Var = new njm0();
        a = njm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.divkit.scaffold.ScaffoldAnimations", njm0Var, 4);
        pluginGeneratedSerialDescriptor.j("topView", true);
        pluginGeneratedSerialDescriptor.j("bottomView", true);
        pluginGeneratedSerialDescriptor.j("overlayView", true);
        pluginGeneratedSerialDescriptor.j("backgroundView", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        tj2 tj2Var = tj2.a;
        return new KSerializer[]{qke.n(tj2Var), qke.n(tj2Var), qke.n(tj2Var), qke.n(tj2Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        vj2 vj2Var = null;
        vj2 vj2Var2 = null;
        vj2 vj2Var3 = null;
        vj2 vj2Var4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                vj2Var = (vj2) b.s(serialDescriptor, 0, tj2.a, vj2Var);
                i |= 1;
            } else if (v == 1) {
                vj2Var2 = (vj2) b.s(serialDescriptor, 1, tj2.a, vj2Var2);
                i |= 2;
            } else if (v == 2) {
                vj2Var3 = (vj2) b.s(serialDescriptor, 2, tj2.a, vj2Var3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                vj2Var4 = (vj2) b.s(serialDescriptor, 3, tj2.a, vj2Var4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ScaffoldAnimations(i, vj2Var, vj2Var2, vj2Var3, vj2Var4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ScaffoldAnimations scaffoldAnimations = (ScaffoldAnimations) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || scaffoldAnimations.a != null) {
            b.g(serialDescriptor, 0, tj2.a, scaffoldAnimations.a);
        }
        if (b.F() || scaffoldAnimations.b != null) {
            b.g(serialDescriptor, 1, tj2.a, scaffoldAnimations.b);
        }
        if (b.F() || scaffoldAnimations.c != null) {
            b.g(serialDescriptor, 2, tj2.a, scaffoldAnimations.c);
        }
        if (b.F() || scaffoldAnimations.d != null) {
            b.g(serialDescriptor, 3, tj2.a, scaffoldAnimations.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
