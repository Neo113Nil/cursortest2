package com.yandex.go.chargers.offer.data.api;

import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.data.model.ChargersStationDto$$serializer;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/offer/data/api/ChargersOfferParams.$serializer", "Luxs;", "Lcom/yandex/go/chargers/offer/data/api/ChargersOfferParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/offer/data/api/ChargersOfferParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/offer/data/api/ChargersOfferParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersOfferParams$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersOfferParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersOfferParams$$serializer chargersOfferParams$$serializer = new ChargersOfferParams$$serializer();
        INSTANCE = chargersOfferParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.offer.data.api.ChargersOfferParams", chargersOfferParams$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("discount", false);
        pluginGeneratedSerialDescriptor.j("station", false);
        pluginGeneratedSerialDescriptor.j("payment_methods", false);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersOfferParams$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ChargersSelectedDiscountDto$$serializer.INSTANCE), ChargersStationDto$$serializer.INSTANCE, ChargersOfferParams.e[2].getValue(), qke.n(ChargersOfferToggleRequestDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ChargersOfferParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersOfferParams.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        ChargersSelectedDiscountDto chargersSelectedDiscountDto = null;
        ChargersStationDto chargersStationDto = null;
        List list = null;
        ChargersOfferToggleRequestDto chargersOfferToggleRequestDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                chargersSelectedDiscountDto = (ChargersSelectedDiscountDto) b.s(serialDescriptor, 0, ChargersSelectedDiscountDto$$serializer.INSTANCE, chargersSelectedDiscountDto);
                i |= 1;
            } else if (v == 1) {
                chargersStationDto = (ChargersStationDto) b.A(serialDescriptor, 1, ChargersStationDto$$serializer.INSTANCE, chargersStationDto);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                chargersOfferToggleRequestDto = (ChargersOfferToggleRequestDto) b.s(serialDescriptor, 3, ChargersOfferToggleRequestDto$$serializer.INSTANCE, chargersOfferToggleRequestDto);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ChargersOfferParams(i, chargersSelectedDiscountDto, chargersStationDto, list, chargersOfferToggleRequestDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersOfferParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersOfferParams.e;
        ChargersSelectedDiscountDto$$serializer chargersSelectedDiscountDto$$serializer = ChargersSelectedDiscountDto$$serializer.INSTANCE;
        ChargersSelectedDiscountDto chargersSelectedDiscountDto = value.a;
        ChargersOfferToggleRequestDto chargersOfferToggleRequestDto = value.d;
        b.g(serialDescriptor, 0, chargersSelectedDiscountDto$$serializer, chargersSelectedDiscountDto);
        b.e(serialDescriptor, 1, ChargersStationDto$$serializer.INSTANCE, value.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        if (b.F() || chargersOfferToggleRequestDto != null) {
            b.g(serialDescriptor, 3, ChargersOfferToggleRequestDto$$serializer.INSTANCE, chargersOfferToggleRequestDto);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
