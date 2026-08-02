package com.yandex.go.order.external.unifiedpolling.dto.details;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.k6z;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.v6z;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/order/external/unifiedpolling/dto/details/EatsOrderDetailsDto.$serializer", "Luxs;", "Lcom/yandex/go/order/external/unifiedpolling/dto/details/EatsOrderDetailsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/order/external/unifiedpolling/dto/details/EatsOrderDetailsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/order/external/unifiedpolling/dto/details/EatsOrderDetailsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class EatsOrderDetailsDto$$serializer implements uxs {
    public static final EatsOrderDetailsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EatsOrderDetailsDto$$serializer eatsOrderDetailsDto$$serializer = new EatsOrderDetailsDto$$serializer();
        INSTANCE = eatsOrderDetailsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.order.external.unifiedpolling.dto.details.EatsOrderDetailsDto", eatsOrderDetailsDto$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("orderNr", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("isAsap", true);
        pluginGeneratedSerialDescriptor.j("deliveryTime", true);
        pluginGeneratedSerialDescriptor.j("deliveryType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EatsOrderDetailsDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = EatsOrderDetailsDto.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(EatsOrderDetailsStatusDto$$serializer.INSTANCE), qke.n(k6z.a), z96.a, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue())};
    }

    @Override // defpackage.myi
    public final EatsOrderDetailsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = EatsOrderDetailsDto.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        EatsOrderDetailsStatusDto eatsOrderDetailsStatusDto = null;
        v6z v6zVar = null;
        String str2 = null;
        EatsOrderDetailsDeliveryTypeDto eatsOrderDetailsDeliveryTypeDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    eatsOrderDetailsStatusDto = (EatsOrderDetailsStatusDto) b.s(serialDescriptor, 1, EatsOrderDetailsStatusDto$$serializer.INSTANCE, eatsOrderDetailsStatusDto);
                    i |= 2;
                    break;
                case 2:
                    v6zVar = (v6z) b.s(serialDescriptor, 2, k6z.a, v6zVar);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    eatsOrderDetailsDeliveryTypeDto = (EatsOrderDetailsDeliveryTypeDto) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), eatsOrderDetailsDeliveryTypeDto);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new EatsOrderDetailsDto(i, str, eatsOrderDetailsStatusDto, v6zVar, z2, str2, eatsOrderDetailsDeliveryTypeDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EatsOrderDetailsDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = EatsOrderDetailsDto.g;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, EatsOrderDetailsStatusDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, k6z.a, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
