package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.jxi;
import defpackage.nor;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigDto.AndroidDto.$serializer", "Luxs;", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigDto$AndroidDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigDto$AndroidDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigDto$AndroidDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ProviderConfigDto$AndroidDto$$serializer implements uxs {
    public static final ProviderConfigDto$AndroidDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProviderConfigDto$AndroidDto$$serializer providerConfigDto$AndroidDto$$serializer = new ProviderConfigDto$AndroidDto$$serializer();
        INSTANCE = providerConfigDto$AndroidDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto.AndroidDto", providerConfigDto$AndroidDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("interval_ms", true);
        pluginGeneratedSerialDescriptor.j("min_distance_m", true);
        pluginGeneratedSerialDescriptor.j("discard_config", true);
        pluginGeneratedSerialDescriptor.j("retry_timeout_ms", true);
        pluginGeneratedSerialDescriptor.j("retry_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("include_passive", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProviderConfigDto$AndroidDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{pnzVar, qke.n(nor.a), AndroidProviderDiscardConfigDto$$serializer.INSTANCE, qke.n(pnzVar), pnzVar, z96.a};
    }

    @Override // defpackage.myi
    public final ProviderConfigDto$AndroidDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = 0;
        Float f = null;
        AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto = null;
        Long l = null;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    j = b.f(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    f = (Float) b.s(serialDescriptor, 1, nor.a, f);
                    i |= 2;
                    break;
                case 2:
                    androidProviderDiscardConfigDto = (AndroidProviderDiscardConfigDto) b.A(serialDescriptor, 2, AndroidProviderDiscardConfigDto$$serializer.INSTANCE, androidProviderDiscardConfigDto);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) b.s(serialDescriptor, 3, pnz.a, l);
                    i |= 8;
                    break;
                case 4:
                    j2 = b.f(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ProviderConfigDto$AndroidDto(i, j, f, androidProviderDiscardConfigDto, l, j2, z);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.ridetech.locationsdk.experiment.dto.AndroidProviderDiscardConfigDto.e) == false) goto L19;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ProviderConfigDto$AndroidDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        d dVar = ProviderConfigDto$AndroidDto.Companion;
        if (b.F() || value.b != 0) {
            b.s(serialDescriptor, 0, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 1, nor.a, value.c);
        }
        if (!b.F()) {
            AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto = value.d;
            AndroidProviderDiscardConfigDto.Companion.getClass();
        }
        b.e(serialDescriptor, 2, AndroidProviderDiscardConfigDto$$serializer.INSTANCE, value.d);
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 3, pnz.a, value.e);
        }
        if (b.F() || value.f != 0) {
            b.s(serialDescriptor, 4, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 5, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
