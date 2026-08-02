package com.yandex.go.flex.main_screen.experiments;

import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenFeaturesExperiment;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment.Features.$serializer", "Luxs;", "Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment$Features;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment$Features;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/main_screen/experiments/SuperAppMainScreenFeaturesExperiment$Features;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class SuperAppMainScreenFeaturesExperiment$Features$$serializer implements uxs {
    public static final SuperAppMainScreenFeaturesExperiment$Features$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppMainScreenFeaturesExperiment$Features$$serializer superAppMainScreenFeaturesExperiment$Features$$serializer = new SuperAppMainScreenFeaturesExperiment$Features$$serializer();
        INSTANCE = superAppMainScreenFeaturesExperiment$Features$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenFeaturesExperiment.Features", superAppMainScreenFeaturesExperiment$Features$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("superapp_main_searchbar", true);
        pluginGeneratedSerialDescriptor.j("superapp_new_search_screen", true);
        pluginGeneratedSerialDescriptor.j("superapp_floating_header", true);
        pluginGeneratedSerialDescriptor.j("superapp_compact_top_plaque", true);
        pluginGeneratedSerialDescriptor.j("supermap", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppMainScreenFeaturesExperiment$Features$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        SuperAppMainScreenFeaturesExperiment$Feature$$serializer superAppMainScreenFeaturesExperiment$Feature$$serializer = SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE;
        return new KSerializer[]{superAppMainScreenFeaturesExperiment$Feature$$serializer, superAppMainScreenFeaturesExperiment$Feature$$serializer, superAppMainScreenFeaturesExperiment$Feature$$serializer, superAppMainScreenFeaturesExperiment$Feature$$serializer, superAppMainScreenFeaturesExperiment$Feature$$serializer};
    }

    @Override // defpackage.myi
    public final SuperAppMainScreenFeaturesExperiment.Features deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SuperAppMainScreenFeaturesExperiment.Feature feature = null;
        SuperAppMainScreenFeaturesExperiment.Feature feature2 = null;
        SuperAppMainScreenFeaturesExperiment.Feature feature3 = null;
        SuperAppMainScreenFeaturesExperiment.Feature feature4 = null;
        SuperAppMainScreenFeaturesExperiment.Feature feature5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                feature = (SuperAppMainScreenFeaturesExperiment.Feature) b.A(serialDescriptor, 0, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, feature);
                i |= 1;
            } else if (v == 1) {
                feature2 = (SuperAppMainScreenFeaturesExperiment.Feature) b.A(serialDescriptor, 1, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, feature2);
                i |= 2;
            } else if (v == 2) {
                feature3 = (SuperAppMainScreenFeaturesExperiment.Feature) b.A(serialDescriptor, 2, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, feature3);
                i |= 4;
            } else if (v == 3) {
                feature4 = (SuperAppMainScreenFeaturesExperiment.Feature) b.A(serialDescriptor, 3, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, feature4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                feature5 = (SuperAppMainScreenFeaturesExperiment.Feature) b.A(serialDescriptor, 4, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, feature5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppMainScreenFeaturesExperiment.Features(i, feature, feature2, feature3, feature4, feature5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppMainScreenFeaturesExperiment.Features value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new SuperAppMainScreenFeaturesExperiment.Feature(0))) {
            b.e(serialDescriptor, 0, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new SuperAppMainScreenFeaturesExperiment.Feature(0))) {
            b.e(serialDescriptor, 1, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new SuperAppMainScreenFeaturesExperiment.Feature(0))) {
            b.e(serialDescriptor, 2, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new SuperAppMainScreenFeaturesExperiment.Feature(0))) {
            b.e(serialDescriptor, 3, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new SuperAppMainScreenFeaturesExperiment.Feature(0))) {
            b.e(serialDescriptor, 4, SuperAppMainScreenFeaturesExperiment$Feature$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
