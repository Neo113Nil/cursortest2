package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pfa0;
import defpackage.rfa0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto.$serializer", "Luxs;", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListRequestDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PromoCodeListRequestDto$$serializer implements uxs {
    public static final PromoCodeListRequestDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PromoCodeListRequestDto$$serializer promoCodeListRequestDto$$serializer = new PromoCodeListRequestDto$$serializer();
        INSTANCE = promoCodeListRequestDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list.PromoCodeListRequestDto", promoCodeListRequestDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("services", false);
        pluginGeneratedSerialDescriptor.j("supported_features", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PromoCodeListRequestDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PromoCodeListRequestDto.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, pfa0.a, i3yVarArr[3].getValue(), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final PromoCodeListRequestDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PromoCodeListRequestDto.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        rfa0 rfa0Var = null;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                rfa0Var = (rfa0) b.A(serialDescriptor, 2, pfa0.a, rfa0Var);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new PromoCodeListRequestDto(i, str, str2, rfa0Var, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PromoCodeListRequestDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PromoCodeListRequestDto.f;
        b.o(serialDescriptor, 0, value.a);
        b.o(serialDescriptor, 1, value.b);
        b.e(serialDescriptor, 2, pfa0.a, value.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
