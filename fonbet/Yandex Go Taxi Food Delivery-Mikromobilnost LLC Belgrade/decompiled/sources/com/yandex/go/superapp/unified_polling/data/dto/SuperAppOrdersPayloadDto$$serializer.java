package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.rcx;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersPayloadDto.$serializer", "Luxs;", "Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersPayloadDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersPayloadDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersPayloadDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SuperAppOrdersPayloadDto$$serializer implements uxs {
    public static final SuperAppOrdersPayloadDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SuperAppOrdersPayloadDto$$serializer superAppOrdersPayloadDto$$serializer = new SuperAppOrdersPayloadDto$$serializer();
        INSTANCE = superAppOrdersPayloadDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersPayloadDto", superAppOrdersPayloadDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("trackedOrders", true);
        pluginGeneratedSerialDescriptor.j("scootersOrders", true);
        pluginGeneratedSerialDescriptor.j("driveOrders", true);
        pluginGeneratedSerialDescriptor.j("chargersOrders", true);
        pluginGeneratedSerialDescriptor.j("deliveryOrders", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SuperAppOrdersPayloadDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        rcx rcxVar = rcx.a;
        return new KSerializer[]{qke.n(rcxVar), qke.n(rcxVar), qke.n(rcxVar), qke.n(rcxVar), qke.n(rcxVar)};
    }

    @Override // defpackage.myi
    public final SuperAppOrdersPayloadDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        kotlinx.serialization.json.b bVar = null;
        kotlinx.serialization.json.b bVar2 = null;
        kotlinx.serialization.json.b bVar3 = null;
        kotlinx.serialization.json.b bVar4 = null;
        kotlinx.serialization.json.b bVar5 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 0, rcx.a, bVar);
                i |= 1;
            } else if (v == 1) {
                bVar2 = (kotlinx.serialization.json.b) b.s(serialDescriptor, 1, rcx.a, bVar2);
                i |= 2;
            } else if (v == 2) {
                bVar3 = (kotlinx.serialization.json.b) b.s(serialDescriptor, 2, rcx.a, bVar3);
                i |= 4;
            } else if (v == 3) {
                bVar4 = (kotlinx.serialization.json.b) b.s(serialDescriptor, 3, rcx.a, bVar4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bVar5 = (kotlinx.serialization.json.b) b.s(serialDescriptor, 4, rcx.a, bVar5);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SuperAppOrdersPayloadDto(i, bVar, bVar2, bVar3, bVar4, bVar5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SuperAppOrdersPayloadDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, rcx.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, rcx.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, rcx.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, rcx.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, rcx.a, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
