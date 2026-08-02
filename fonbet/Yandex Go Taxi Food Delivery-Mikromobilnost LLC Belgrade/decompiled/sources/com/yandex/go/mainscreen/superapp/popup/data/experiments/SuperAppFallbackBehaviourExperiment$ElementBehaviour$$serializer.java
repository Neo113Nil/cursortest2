package com.yandex.go.mainscreen.superapp.popup.data.experiments;

import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment.ElementBehaviour.$serializer", "Luxs;", "Lcom/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment$ElementBehaviour;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment$ElementBehaviour;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/mainscreen/superapp/popup/data/experiments/SuperAppFallbackBehaviourExperiment$ElementBehaviour;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "popup"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer implements uxs {
    public static final SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer superAppFallbackBehaviourExperiment$ElementBehaviour$$serializer = new SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer();
        INSTANCE = superAppFallbackBehaviourExperiment$ElementBehaviour$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment.ElementBehaviour", superAppFallbackBehaviourExperiment$ElementBehaviour$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("states", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("visible", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SuperAppFallbackBehaviourExperiment.ElementBehaviour.d[0].getValue(), auu0.a, z96.a};
    }

    @Override // defpackage.myi
    public final SuperAppFallbackBehaviourExperiment.ElementBehaviour deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppFallbackBehaviourExperiment.ElementBehaviour.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        jsq0 jsq0Var = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                jsq0Var = (jsq0) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), jsq0Var);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppFallbackBehaviourExperiment.ElementBehaviour(i, jsq0Var, str, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppFallbackBehaviourExperiment.ElementBehaviour value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SuperAppFallbackBehaviourExperiment.ElementBehaviour.d;
        if (b.F() || !jl40.l(value.a, ksq0.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
