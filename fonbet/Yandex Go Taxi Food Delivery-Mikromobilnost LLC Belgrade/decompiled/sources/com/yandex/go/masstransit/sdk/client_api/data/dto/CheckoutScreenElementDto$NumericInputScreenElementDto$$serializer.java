package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.auu0;
import defpackage.h6w;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto.NumericInputScreenElementDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$NumericInputScreenElementDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$NumericInputScreenElementDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$NumericInputScreenElementDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class CheckoutScreenElementDto$NumericInputScreenElementDto$$serializer implements uxs {
    public static final CheckoutScreenElementDto$NumericInputScreenElementDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutScreenElementDto$NumericInputScreenElementDto$$serializer checkoutScreenElementDto$NumericInputScreenElementDto$$serializer = new CheckoutScreenElementDto$NumericInputScreenElementDto$$serializer();
        INSTANCE = checkoutScreenElementDto$NumericInputScreenElementDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto.NumericInputScreenElementDto", checkoutScreenElementDto$NumericInputScreenElementDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("required_property_info", true);
        pluginGeneratedSerialDescriptor.j("min_value", true);
        pluginGeneratedSerialDescriptor.j("max_value", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("property", false);
        pluginGeneratedSerialDescriptor.j("value", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CheckoutScreenElementDto$NumericInputScreenElementDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(RequiredPropertyInfoDto$$serializer.INSTANCE);
        h6w h6wVar = h6w.a;
        KSerializer n2 = qke.n(h6wVar);
        KSerializer n3 = qke.n(h6wVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(auu0Var), auu0Var, qke.n(pnz.a)};
    }

    @Override // defpackage.myi
    public final CheckoutScreenElementDto$NumericInputScreenElementDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        RequiredPropertyInfoDto requiredPropertyInfoDto = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    requiredPropertyInfoDto = (RequiredPropertyInfoDto) b.s(serialDescriptor, 0, RequiredPropertyInfoDto$$serializer.INSTANCE, requiredPropertyInfoDto);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) b.s(serialDescriptor, 6, pnz.a, l);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CheckoutScreenElementDto$NumericInputScreenElementDto(i, requiredPropertyInfoDto, num, num2, str, str2, str3, l);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CheckoutScreenElementDto$NumericInputScreenElementDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, RequiredPropertyInfoDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, h6w.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        String str = value.f;
        Long l = value.g;
        b.o(serialDescriptor, 5, str);
        if (b.F() || l != null) {
            b.g(serialDescriptor, 6, pnz.a, l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
