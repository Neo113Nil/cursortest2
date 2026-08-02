package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto$$serializer;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitOrderDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class MasstransitOrderDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MasstransitOrderDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MasstransitOrderDto$$serializer masstransitOrderDto$$serializer = new MasstransitOrderDto$$serializer();
        INSTANCE = masstransitOrderDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto", masstransitOrderDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("tickets", true);
        pluginGeneratedSerialDescriptor.j("presentations", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("onboarding_id", true);
        pluginGeneratedSerialDescriptor.j("nfc_animations", true);
        pluginGeneratedSerialDescriptor.j("screen_brightness", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MasstransitOrderDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = MasstransitOrderDto.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), MasstransitOrderPresentationsDto$$serializer.INSTANCE, CurrencyRulesDto$$serializer.INSTANCE, auu0Var, NfcAnimationsDto$$serializer.INSTANCE, qke.n(h6w.a)};
    }

    @Override // defpackage.myi
    public final MasstransitOrderDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = MasstransitOrderDto.h;
        b.getClass();
        MasstransitOrderDto masstransitOrderDto = null;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        MasstransitOrderPresentationsDto masstransitOrderPresentationsDto = null;
        CurrencyRulesDto currencyRulesDto = null;
        String str2 = null;
        NfcAnimationsDto nfcAnimationsDto = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    masstransitOrderPresentationsDto = (MasstransitOrderPresentationsDto) b.A(serialDescriptor, 2, MasstransitOrderPresentationsDto$$serializer.INSTANCE, masstransitOrderPresentationsDto);
                    i |= 4;
                    break;
                case 3:
                    currencyRulesDto = (CurrencyRulesDto) b.A(serialDescriptor, 3, CurrencyRulesDto$$serializer.INSTANCE, currencyRulesDto);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    nfcAnimationsDto = (NfcAnimationsDto) b.A(serialDescriptor, 5, NfcAnimationsDto$$serializer.INSTANCE, nfcAnimationsDto);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) b.s(serialDescriptor, 6, h6w.a, num);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return masstransitOrderDto;
            }
            masstransitOrderDto = null;
        }
        b.c(serialDescriptor);
        return new MasstransitOrderDto(i, str, list, masstransitOrderPresentationsDto, currencyRulesDto, str2, nfcAnimationsDto, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MasstransitOrderDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        MasstransitOrderDto.h(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
