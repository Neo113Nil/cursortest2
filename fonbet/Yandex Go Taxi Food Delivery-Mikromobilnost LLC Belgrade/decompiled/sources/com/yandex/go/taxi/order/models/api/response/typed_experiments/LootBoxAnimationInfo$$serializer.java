package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.nor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/LootBoxAnimationInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class LootBoxAnimationInfo$$serializer implements uxs {
    public static final LootBoxAnimationInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LootBoxAnimationInfo$$serializer lootBoxAnimationInfo$$serializer = new LootBoxAnimationInfo$$serializer();
        INSTANCE = lootBoxAnimationInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo", lootBoxAnimationInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("loading_url", true);
        pluginGeneratedSerialDescriptor.j("opening_url", true);
        pluginGeneratedSerialDescriptor.j("completion_url", true);
        pluginGeneratedSerialDescriptor.j("image_fade_in_duration", true);
        pluginGeneratedSerialDescriptor.j("image_move_duration", true);
        pluginGeneratedSerialDescriptor.j("image_delay_between_animations", true);
        pluginGeneratedSerialDescriptor.j("image_initial_animation_delay", true);
        pluginGeneratedSerialDescriptor.j("image_width_scale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LootBoxAnimationInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        nor norVar = nor.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, norVar, norVar, norVar, norVar, norVar};
    }

    @Override // defpackage.myi
    public final LootBoxAnimationInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    f = b.y(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    f2 = b.y(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    f3 = b.y(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    f4 = b.y(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    f5 = b.y(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new LootBoxAnimationInfo(i, str, str2, str3, str4, f, f2, f3, f4, f5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LootBoxAnimationInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || Float.compare(value.e, 0.0f) != 0) {
            b.z(serialDescriptor, 4, value.e);
        }
        if (b.F() || Float.compare(value.f, 0.0f) != 0) {
            b.z(serialDescriptor, 5, value.f);
        }
        if (b.F() || Float.compare(value.g, 0.0f) != 0) {
            b.z(serialDescriptor, 6, value.g);
        }
        if (b.F() || Float.compare(value.h, 0.0f) != 0) {
            b.z(serialDescriptor, 7, value.h);
        }
        if (b.F() || Float.compare(value.i, 0.0f) != 0) {
            b.z(serialDescriptor, 8, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
