package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.superapp.tracking.models.dto.TrackingCardDto;
import com.yandex.go.superapp.tracking.models.dto.TrackingCardDto$$serializer;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardInfoResponse.PresentationsDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class RideCardInfoResponse$PresentationsDto$$serializer implements uxs {
    public static final RideCardInfoResponse$PresentationsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RideCardInfoResponse$PresentationsDto$$serializer rideCardInfoResponse$PresentationsDto$$serializer = new RideCardInfoResponse$PresentationsDto$$serializer();
        INSTANCE = rideCardInfoResponse$PresentationsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse.PresentationsDto", rideCardInfoResponse$PresentationsDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("compact", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("sharing", true);
        pluginGeneratedSerialDescriptor.j("superapp", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RideCardInfoResponse$PresentationsDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RideCardInfoResponse$PresentationsDto$Compact$$serializer.INSTANCE, RideCardInfoResponse$PresentationsDto$Details$$serializer.INSTANCE, RideCardInfoResponse$PresentationsDto$Sharing$$serializer.INSTANCE, qke.n(TrackingCardDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final RideCardInfoResponse.PresentationsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        RideCardInfoResponse.PresentationsDto.Compact compact = null;
        RideCardInfoResponse.PresentationsDto.Details details = null;
        RideCardInfoResponse.PresentationsDto.Sharing sharing = null;
        TrackingCardDto trackingCardDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                compact = (RideCardInfoResponse.PresentationsDto.Compact) b.A(serialDescriptor, 0, RideCardInfoResponse$PresentationsDto$Compact$$serializer.INSTANCE, compact);
                i |= 1;
            } else if (v == 1) {
                details = (RideCardInfoResponse.PresentationsDto.Details) b.A(serialDescriptor, 1, RideCardInfoResponse$PresentationsDto$Details$$serializer.INSTANCE, details);
                i |= 2;
            } else if (v == 2) {
                sharing = (RideCardInfoResponse.PresentationsDto.Sharing) b.A(serialDescriptor, 2, RideCardInfoResponse$PresentationsDto$Sharing$$serializer.INSTANCE, sharing);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                trackingCardDto = (TrackingCardDto) b.s(serialDescriptor, 3, TrackingCardDto$$serializer.INSTANCE, trackingCardDto);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new RideCardInfoResponse.PresentationsDto(i, compact, details, sharing, trackingCardDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RideCardInfoResponse.PresentationsDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.a, new RideCardInfoResponse.PresentationsDto.Compact(emptyList, 6))) {
            b.e(serialDescriptor, 0, RideCardInfoResponse$PresentationsDto$Compact$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new RideCardInfoResponse.PresentationsDto.Details(emptyList, 18))) {
            b.e(serialDescriptor, 1, RideCardInfoResponse$PresentationsDto$Details$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new RideCardInfoResponse.PresentationsDto.Sharing(emptyList))) {
            b.e(serialDescriptor, 2, RideCardInfoResponse$PresentationsDto$Sharing$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, TrackingCardDto$$serializer.INSTANCE, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
