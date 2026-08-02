package com.yandex.go.shortcuts.experiments;

import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment.ShortcutsParams.$serializer", "Luxs;", "Lcom/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment$ShortcutsParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment$ShortcutsParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/shortcuts/experiments/OrderShortcutsParamsExperiment$ShortcutsParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class OrderShortcutsParamsExperiment$ShortcutsParams$$serializer implements uxs {
    public static final OrderShortcutsParamsExperiment$ShortcutsParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderShortcutsParamsExperiment$ShortcutsParams$$serializer orderShortcutsParamsExperiment$ShortcutsParams$$serializer = new OrderShortcutsParamsExperiment$ShortcutsParams$$serializer();
        INSTANCE = orderShortcutsParamsExperiment$ShortcutsParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment.ShortcutsParams", orderShortcutsParamsExperiment$ShortcutsParams$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("products_response_ttl_sec", true);
        pluginGeneratedSerialDescriptor.j("use_all_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderShortcutsParamsExperiment$ShortcutsParams$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, z96.a};
    }

    @Override // defpackage.myi
    public final OrderShortcutsParamsExperiment.ShortcutsParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new OrderShortcutsParamsExperiment.ShortcutsParams(z2, i, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OrderShortcutsParamsExperiment.ShortcutsParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != 0) {
            b.s(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
