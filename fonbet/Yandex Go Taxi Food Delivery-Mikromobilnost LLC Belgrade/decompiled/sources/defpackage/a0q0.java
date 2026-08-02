package defpackage;

import just.adapter.scroll.experimental.OptimizedPaginationTriggerFeatureConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class a0q0 implements uxs {
    public static final a0q0 a;
    private static final SerialDescriptor descriptor;

    static {
        a0q0 a0q0Var = new a0q0();
        a = a0q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.engine.section.parser.content.SectionContentSurrogate.Settings", a0q0Var, 9);
        pluginGeneratedSerialDescriptor.j("refreshable", false);
        pluginGeneratedSerialDescriptor.j("scrollable", false);
        pluginGeneratedSerialDescriptor.j("paging", false);
        pluginGeneratedSerialDescriptor.j("supportsPredictiveItemAnimations", false);
        pluginGeneratedSerialDescriptor.j("paddings", false);
        pluginGeneratedSerialDescriptor.j("enableSnippetsAnimations", true);
        pluginGeneratedSerialDescriptor.j("overscroll", false);
        pluginGeneratedSerialDescriptor.j("useOptimizedPaginationTriggerFeature", true);
        pluginGeneratedSerialDescriptor.j("optimizedPaginationTriggerFeatureConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = c0q0.j;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var), qke.n(xzp0.a), qke.n(z96Var), qke.n(uzp0.a), qke.n(z96Var), qke.n(z96Var), qke.n(z96Var), qke.n((KSerializer) i3yVarArr[8].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c0q0.j;
        b.getClass();
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        Boolean bool2 = null;
        Boolean bool3 = null;
        zzp0 zzp0Var = null;
        Boolean bool4 = null;
        wzp0 wzp0Var = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool2 = (Boolean) b.s(serialDescriptor, 0, z96.a, bool2);
                    i |= 1;
                    break;
                case 1:
                    bool3 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool3);
                    i |= 2;
                    break;
                case 2:
                    zzp0Var = (zzp0) b.s(serialDescriptor, 2, xzp0.a, zzp0Var);
                    i |= 4;
                    break;
                case 3:
                    bool4 = (Boolean) b.s(serialDescriptor, 3, z96.a, bool4);
                    i |= 8;
                    break;
                case 4:
                    wzp0Var = (wzp0) b.s(serialDescriptor, 4, uzp0.a, wzp0Var);
                    i |= 16;
                    break;
                case 5:
                    bool5 = (Boolean) b.s(serialDescriptor, 5, z96.a, bool5);
                    i |= 32;
                    break;
                case 6:
                    bool6 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool6);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    break;
                case 8:
                    optimizedPaginationTriggerFeatureConfig = (OptimizedPaginationTriggerFeatureConfig) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), optimizedPaginationTriggerFeatureConfig);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new c0q0(i, bool2, bool3, zzp0Var, bool4, wzp0Var, bool5, bool6, bool, optimizedPaginationTriggerFeatureConfig);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c0q0 c0q0Var = (c0q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c0q0.j;
        z96 z96Var = z96.a;
        Boolean bool = c0q0Var.a;
        OptimizedPaginationTriggerFeatureConfig optimizedPaginationTriggerFeatureConfig = c0q0Var.i;
        Boolean bool2 = c0q0Var.h;
        Boolean bool3 = c0q0Var.f;
        b.g(serialDescriptor, 0, z96Var, bool);
        b.g(serialDescriptor, 1, z96Var, c0q0Var.b);
        b.g(serialDescriptor, 2, xzp0.a, c0q0Var.c);
        b.g(serialDescriptor, 3, z96Var, c0q0Var.d);
        b.g(serialDescriptor, 4, uzp0.a, c0q0Var.e);
        if (b.F() || !jl40.l(bool3, Boolean.TRUE)) {
            b.g(serialDescriptor, 5, z96Var, bool3);
        }
        b.g(serialDescriptor, 6, z96Var, c0q0Var.g);
        if (b.F() || !jl40.l(bool2, Boolean.FALSE)) {
            b.g(serialDescriptor, 7, z96Var, bool2);
        }
        if (b.F() || optimizedPaginationTriggerFeatureConfig != OptimizedPaginationTriggerFeatureConfig.DISABLED) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), optimizedPaginationTriggerFeatureConfig);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
