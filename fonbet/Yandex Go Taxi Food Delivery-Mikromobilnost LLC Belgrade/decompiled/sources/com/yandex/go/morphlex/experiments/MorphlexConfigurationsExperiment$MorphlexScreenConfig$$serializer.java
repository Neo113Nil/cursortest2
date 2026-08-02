package com.yandex.go.morphlex.experiments;

import com.yandex.div.state.db.StateEntry;
import com.yandex.go.morphlex.data.dto.MorphlexDimension;
import com.yandex.go.morphlex.data.dto.MorphlexDimension$$serializer;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;
import com.yandex.go.morphlex.experiments.MorphlexConfigurationsExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/morphlex/experiments/MorphlexConfigurationsExperiment.MorphlexScreenConfig.$serializer", "Luxs;", "Lcom/yandex/go/morphlex/experiments/MorphlexConfigurationsExperiment$MorphlexScreenConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/morphlex/experiments/MorphlexConfigurationsExperiment$MorphlexScreenConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/morphlex/experiments/MorphlexConfigurationsExperiment$MorphlexScreenConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer implements uxs {
    public static final MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer morphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer = new MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer();
        INSTANCE = morphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.morphlex.experiments.MorphlexConfigurationsExperiment.MorphlexScreenConfig", morphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("screen_name", true);
        pluginGeneratedSerialDescriptor.j(StateEntry.COLUMN_PATH, true);
        pluginGeneratedSerialDescriptor.j("params", true);
        pluginGeneratedSerialDescriptor.j("skeleton", true);
        pluginGeneratedSerialDescriptor.j("present_type", true);
        pluginGeneratedSerialDescriptor.j("should_cache", true);
        pluginGeneratedSerialDescriptor.j("save_on_disk_enabled", true);
        pluginGeneratedSerialDescriptor.j("min_height", true);
        pluginGeneratedSerialDescriptor.j("can_drag_to_expand", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MorphlexConfigurationsExperiment$MorphlexScreenConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MorphlexConfigurationsExperiment.MorphlexScreenConfig.j;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0Var), i3yVarArr[4].getValue(), z96Var, z96Var, qke.n(MorphlexDimension$$serializer.INSTANCE), z96Var};
    }

    @Override // defpackage.myi
    public final MorphlexConfigurationsExperiment.MorphlexScreenConfig deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MorphlexConfigurationsExperiment.MorphlexScreenConfig.j;
        b.getClass();
        MorphlexConfigurationsExperiment.MorphlexScreenConfig morphlexScreenConfig = null;
        boolean z = true;
        MorphlexDimension morphlexDimension = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        MorphlexScreenPresentType morphlexScreenPresentType = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    morphlexScreenPresentType = (MorphlexScreenPresentType) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), morphlexScreenPresentType);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    morphlexDimension = (MorphlexDimension) b.s(serialDescriptor, 7, MorphlexDimension$$serializer.INSTANCE, morphlexDimension);
                    i |= 128;
                    break;
                case 8:
                    z4 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return morphlexScreenConfig;
            }
            morphlexScreenConfig = null;
        }
        b.c(serialDescriptor);
        return new MorphlexConfigurationsExperiment.MorphlexScreenConfig(i, str, str2, list, str3, morphlexScreenPresentType, z2, z3, morphlexDimension, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MorphlexConfigurationsExperiment.MorphlexScreenConfig value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MorphlexConfigurationsExperiment.MorphlexScreenConfig.j;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, EmptyList.a)) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != MorphlexScreenPresentType.UNSUPPORTED) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, MorphlexDimension$$serializer.INSTANCE, value.h);
        }
        if (b.F() || value.i) {
            b.n(serialDescriptor, 8, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
