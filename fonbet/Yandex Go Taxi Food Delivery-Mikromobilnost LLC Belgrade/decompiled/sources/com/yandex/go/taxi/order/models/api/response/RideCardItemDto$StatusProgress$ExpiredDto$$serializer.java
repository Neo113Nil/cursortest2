package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto.StatusProgress.ExpiredDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$ExpiredDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$ExpiredDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$StatusProgress$ExpiredDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class RideCardItemDto$StatusProgress$ExpiredDto$$serializer implements uxs {
    public static final RideCardItemDto$StatusProgress$ExpiredDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RideCardItemDto$StatusProgress$ExpiredDto$$serializer rideCardItemDto$StatusProgress$ExpiredDto$$serializer = new RideCardItemDto$StatusProgress$ExpiredDto$$serializer();
        INSTANCE = rideCardItemDto$StatusProgress$ExpiredDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.StatusProgress.ExpiredDto", rideCardItemDto$StatusProgress$ExpiredDto$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("interval_millis", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RideCardItemDto$StatusProgress$ExpiredDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(pnz.a);
        RideCardItemDto$StatusProgress$StatusTextDto$$serializer rideCardItemDto$StatusProgress$StatusTextDto$$serializer = RideCardItemDto$StatusProgress$StatusTextDto$$serializer.INSTANCE;
        return new KSerializer[]{n, rideCardItemDto$StatusProgress$StatusTextDto$$serializer, qke.n(rideCardItemDto$StatusProgress$StatusTextDto$$serializer)};
    }

    @Override // defpackage.myi
    public final RideCardItemDto$StatusProgress.ExpiredDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Long l = null;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto = null;
        RideCardItemDto$StatusProgress.StatusTextDto statusTextDto2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else if (v == 1) {
                statusTextDto = (RideCardItemDto$StatusProgress.StatusTextDto) b.A(serialDescriptor, 1, RideCardItemDto$StatusProgress$StatusTextDto$$serializer.INSTANCE, statusTextDto);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                statusTextDto2 = (RideCardItemDto$StatusProgress.StatusTextDto) b.s(serialDescriptor, 2, RideCardItemDto$StatusProgress$StatusTextDto$$serializer.INSTANCE, statusTextDto2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new RideCardItemDto$StatusProgress.ExpiredDto(i, l, statusTextDto, statusTextDto2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.taxi.order.models.api.response.RideCardItemDto$StatusProgress.StatusTextDto.c) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, RideCardItemDto$StatusProgress.ExpiredDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, pnz.a, value.a);
        }
        if (!b.F()) {
            RideCardItemDto$StatusProgress.StatusTextDto statusTextDto = value.b;
            RideCardItemDto$StatusProgress.StatusTextDto.Companion.getClass();
        }
        b.e(serialDescriptor, 1, RideCardItemDto$StatusProgress$StatusTextDto$$serializer.INSTANCE, value.b);
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, RideCardItemDto$StatusProgress$StatusTextDto$$serializer.INSTANCE, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
