package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.auu0;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto.ReturnTripToggleScreenElementDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$ReturnTripToggleScreenElementDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$ReturnTripToggleScreenElementDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$ReturnTripToggleScreenElementDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class CheckoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer implements uxs {
    public static final CheckoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer checkoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer = new CheckoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer();
        INSTANCE = checkoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto.ReturnTripToggleScreenElementDto", checkoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("required_property_info", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("property", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        pluginGeneratedSerialDescriptor.j("is_readonly", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CheckoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(RequiredPropertyInfoDto$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        KSerializer n2 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, auu0Var, z96Var, qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final CheckoutScreenElementDto$ReturnTripToggleScreenElementDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        RequiredPropertyInfoDto requiredPropertyInfoDto = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                requiredPropertyInfoDto = (RequiredPropertyInfoDto) b.s(serialDescriptor, 0, RequiredPropertyInfoDto$$serializer.INSTANCE, requiredPropertyInfoDto);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutScreenElementDto$ReturnTripToggleScreenElementDto(i, requiredPropertyInfoDto, str, str2, z2, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CheckoutScreenElementDto$ReturnTripToggleScreenElementDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, RequiredPropertyInfoDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        String str = value.c;
        Boolean bool = value.e;
        b.o(serialDescriptor, 2, str);
        b.n(serialDescriptor, 3, value.d);
        if (b.F() || !jl40.l(bool, Boolean.FALSE)) {
            b.g(serialDescriptor, 4, z96.a, bool);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
