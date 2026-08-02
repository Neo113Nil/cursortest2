package com.yandex.go.superapp.tracking.models.dto;

import defpackage.a501;
import defpackage.b501;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.x401;
import defpackage.y401;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/superapp/tracking/models/dto/TrackingCardStatusDto.$serializer", "Luxs;", "Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/superapp/tracking/models/dto/TrackingCardStatusDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.superapp.tracking:models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TrackingCardStatusDto$$serializer implements uxs {
    public static final TrackingCardStatusDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TrackingCardStatusDto$$serializer trackingCardStatusDto$$serializer = new TrackingCardStatusDto$$serializer();
        INSTANCE = trackingCardStatusDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.superapp.tracking.models.dto.TrackingCardStatusDto", trackingCardStatusDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("lead", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("trail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TrackingCardStatusDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(x401.e);
        TrackingCardStatusTextDto$$serializer trackingCardStatusTextDto$$serializer = TrackingCardStatusTextDto$$serializer.INSTANCE;
        return new KSerializer[]{n, qke.n(trackingCardStatusTextDto$$serializer), qke.n(trackingCardStatusTextDto$$serializer), qke.n(a501.e)};
    }

    @Override // defpackage.myi
    public final TrackingCardStatusDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        y401 y401Var = null;
        TrackingCardStatusTextDto trackingCardStatusTextDto = null;
        TrackingCardStatusTextDto trackingCardStatusTextDto2 = null;
        b501 b501Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                y401Var = (y401) b.s(serialDescriptor, 0, x401.e, y401Var);
                i |= 1;
            } else if (v == 1) {
                trackingCardStatusTextDto = (TrackingCardStatusTextDto) b.s(serialDescriptor, 1, TrackingCardStatusTextDto$$serializer.INSTANCE, trackingCardStatusTextDto);
                i |= 2;
            } else if (v == 2) {
                trackingCardStatusTextDto2 = (TrackingCardStatusTextDto) b.s(serialDescriptor, 2, TrackingCardStatusTextDto$$serializer.INSTANCE, trackingCardStatusTextDto2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                b501Var = (b501) b.s(serialDescriptor, 3, a501.e, b501Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new TrackingCardStatusDto(i, y401Var, trackingCardStatusTextDto, trackingCardStatusTextDto2, b501Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TrackingCardStatusDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, x401.e, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, TrackingCardStatusTextDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, TrackingCardStatusTextDto$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, a501.e, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
