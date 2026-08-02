package com.yandex.go.ridetech.locationsdk.experiment.dto;

import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigSetDto.$serializer", "Luxs;", "Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigSetDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigSetDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/ridetech/locationsdk/experiment/dto/ProviderConfigSetDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ProviderConfigSetDto$$serializer implements uxs {
    public static final ProviderConfigSetDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProviderConfigSetDto$$serializer providerConfigSetDto$$serializer = new ProviderConfigSetDto$$serializer();
        INSTANCE = providerConfigSetDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigSetDto", providerConfigSetDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("android_gps", true);
        pluginGeneratedSerialDescriptor.j("android_network", true);
        pluginGeneratedSerialDescriptor.j("android_passive", true);
        pluginGeneratedSerialDescriptor.j("android_fused", true);
        pluginGeneratedSerialDescriptor.j("mapkit_toggle", true);
        pluginGeneratedSerialDescriptor.j("go_lbs_toggle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProviderConfigSetDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        ProviderConfigDto$AndroidDto$$serializer providerConfigDto$AndroidDto$$serializer = ProviderConfigDto$AndroidDto$$serializer.INSTANCE;
        KSerializer n = qke.n(providerConfigDto$AndroidDto$$serializer);
        KSerializer n2 = qke.n(providerConfigDto$AndroidDto$$serializer);
        KSerializer n3 = qke.n(providerConfigDto$AndroidDto$$serializer);
        KSerializer n4 = qke.n(ProviderConfigDto$FusedDto$$serializer.INSTANCE);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, n3, n4, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final ProviderConfigSetDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto = null;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto2 = null;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto3 = null;
        ProviderConfigDto$FusedDto providerConfigDto$FusedDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    providerConfigDto$AndroidDto = (ProviderConfigDto$AndroidDto) b.s(serialDescriptor, 0, ProviderConfigDto$AndroidDto$$serializer.INSTANCE, providerConfigDto$AndroidDto);
                    i |= 1;
                    break;
                case 1:
                    providerConfigDto$AndroidDto2 = (ProviderConfigDto$AndroidDto) b.s(serialDescriptor, 1, ProviderConfigDto$AndroidDto$$serializer.INSTANCE, providerConfigDto$AndroidDto2);
                    i |= 2;
                    break;
                case 2:
                    providerConfigDto$AndroidDto3 = (ProviderConfigDto$AndroidDto) b.s(serialDescriptor, 2, ProviderConfigDto$AndroidDto$$serializer.INSTANCE, providerConfigDto$AndroidDto3);
                    i |= 4;
                    break;
                case 3:
                    providerConfigDto$FusedDto = (ProviderConfigDto$FusedDto) b.s(serialDescriptor, 3, ProviderConfigDto$FusedDto$$serializer.INSTANCE, providerConfigDto$FusedDto);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ProviderConfigSetDto(i, providerConfigDto$AndroidDto, providerConfigDto$AndroidDto2, providerConfigDto$AndroidDto3, providerConfigDto$FusedDto, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ProviderConfigSetDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ProviderConfigDto$AndroidDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, ProviderConfigDto$AndroidDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ProviderConfigDto$AndroidDto$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ProviderConfigDto$FusedDto$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
