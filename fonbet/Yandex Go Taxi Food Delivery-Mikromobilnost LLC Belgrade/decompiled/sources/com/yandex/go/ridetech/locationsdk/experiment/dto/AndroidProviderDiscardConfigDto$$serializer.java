package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/ridetech/locationsdk/experiment/dto/AndroidProviderDiscardConfigDto.$serializer", "Luxs;", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/AndroidProviderDiscardConfigDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/ridetech/locationsdk/experiment/dto/AndroidProviderDiscardConfigDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/ridetech/locationsdk/experiment/dto/AndroidProviderDiscardConfigDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class AndroidProviderDiscardConfigDto$$serializer implements uxs {
    public static final AndroidProviderDiscardConfigDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AndroidProviderDiscardConfigDto$$serializer androidProviderDiscardConfigDto$$serializer = new AndroidProviderDiscardConfigDto$$serializer();
        INSTANCE = androidProviderDiscardConfigDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.ridetech.locationsdk.experiment.dto.AndroidProviderDiscardConfigDto", androidProviderDiscardConfigDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("throttle_logging_ms", true);
        pluginGeneratedSerialDescriptor.j("allow_mock", true);
        pluginGeneratedSerialDescriptor.j("max_age_realtime_ms", true);
        pluginGeneratedSerialDescriptor.j("max_ahead_of_time_realtime_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AndroidProviderDiscardConfigDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{qke.n(pnzVar), z96.a, qke.n(pnzVar), qke.n(pnzVar)};
    }

    @Override // defpackage.myi
    public final AndroidProviderDiscardConfigDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                l = (Long) b.s(serialDescriptor, 0, pnz.a, l);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                l2 = (Long) b.s(serialDescriptor, 2, pnz.a, l2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                l3 = (Long) b.s(serialDescriptor, 3, pnz.a, l3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new AndroidProviderDiscardConfigDto(i, l, z2, l2, l3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AndroidProviderDiscardConfigDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        a aVar = AndroidProviderDiscardConfigDto.Companion;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, pnz.a, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, pnz.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, pnz.a, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
