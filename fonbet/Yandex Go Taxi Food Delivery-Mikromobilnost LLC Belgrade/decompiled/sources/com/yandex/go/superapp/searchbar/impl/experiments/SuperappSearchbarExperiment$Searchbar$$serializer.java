package com.yandex.go.superapp.searchbar.impl.experiments;

import com.yandex.go.dto.response.e0;
import com.yandex.go.dto.response.q1;
import com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xx;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment.Searchbar.$serializer", "Luxs;", "Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/searchbar/impl/experiments/SuperappSearchbarExperiment$Searchbar;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SuperappSearchbarExperiment$Searchbar$$serializer implements uxs {
    public static final SuperappSearchbarExperiment$Searchbar$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperappSearchbarExperiment$Searchbar$$serializer superappSearchbarExperiment$Searchbar$$serializer = new SuperappSearchbarExperiment$Searchbar$$serializer();
        INSTANCE = superappSearchbarExperiment$Searchbar$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.searchbar.impl.experiments.SuperappSearchbarExperiment.Searchbar", superappSearchbarExperiment$Searchbar$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("title_text_key", true);
        pluginGeneratedSerialDescriptor.j("animated_title", true);
        pluginGeneratedSerialDescriptor.j("subtitle_text_key", true);
        pluginGeneratedSerialDescriptor.j("subtitle_leading_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("action_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperappSearchbarExperiment$Searchbar$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, auu0Var, auu0Var, xx.f};
    }

    @Override // defpackage.myi
    public final SuperappSearchbarExperiment.Searchbar deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SuperappSearchbarExperiment.Searchbar.AnimatedText animatedText = null;
        String str2 = null;
        String str3 = null;
        q1 q1Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                animatedText = (SuperappSearchbarExperiment.Searchbar.AnimatedText) b.s(serialDescriptor, 1, SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer.INSTANCE, animatedText);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                q1Var = (q1) b.A(serialDescriptor, 4, xx.f, q1Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SuperappSearchbarExperiment.Searchbar(i, str, animatedText, str2, str3, q1Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperappSearchbarExperiment.Searchbar value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, SuperappSearchbarExperiment$Searchbar$AnimatedText$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, e0.INSTANCE)) {
            b.e(serialDescriptor, 4, xx.f, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
