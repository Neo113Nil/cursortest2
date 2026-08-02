package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.data.model.ChargersAttributeDto$$serializer;
import com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto;
import defpackage.auu0;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto.DiscountsEntryPoint.$serializer", "Luxs;", "Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$DiscountsEntryPoint;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$DiscountsEntryPoint;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/offer/data/api/ChargersOfferResponseDto$DiscountsEntryPoint;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersOfferResponseDto$DiscountsEntryPoint$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersOfferResponseDto$DiscountsEntryPoint$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersOfferResponseDto$DiscountsEntryPoint$$serializer chargersOfferResponseDto$DiscountsEntryPoint$$serializer = new ChargersOfferResponseDto$DiscountsEntryPoint$$serializer();
        INSTANCE = chargersOfferResponseDto$DiscountsEntryPoint$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.offer.data.api.ChargersOfferResponseDto.DiscountsEntryPoint", chargersOfferResponseDto$DiscountsEntryPoint$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersOfferResponseDto$DiscountsEntryPoint$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(ChargersAttributeDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ChargersOfferResponseDto.DiscountsEntryPoint deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ChargersAttributeDto chargersAttributeDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                chargersAttributeDto = (ChargersAttributeDto) b.s(serialDescriptor, 1, ChargersAttributeDto$$serializer.INSTANCE, chargersAttributeDto);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ChargersOfferResponseDto.DiscountsEntryPoint(i, str, chargersAttributeDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersOfferResponseDto.DiscountsEntryPoint value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, ChargersAttributeDto$$serializer.INSTANCE, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
