package com.yandex.go.taxi.order.detailed_price.data.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.SlotItemDto$$serializer;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$DetailedPrice;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem.DetailedPrice.DetailedPriceContent.DetailedPriceItem.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/detailed_price/data/api/response/DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer implements uxs {
    public static final int $stable = 0;
    public static final DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer detailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer = new DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer();
        INSTANCE = detailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem.DetailedPrice.DetailedPriceContent.DetailedPriceItem", detailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("slot", true);
        pluginGeneratedSerialDescriptor.j("additional_leading_inset", true);
        pluginGeneratedSerialDescriptor.j("top_inset", true);
        pluginGeneratedSerialDescriptor.j("divider_type", true);
        pluginGeneratedSerialDescriptor.j("tooltip", true);
        pluginGeneratedSerialDescriptor.j("is_header", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.g;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{SlotItemDto$$serializer.INSTANCE, e6mVar, e6mVar, i3yVarArr[3].getValue(), DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceTooltip$$serializer.INSTANCE, z96.a};
    }

    @Override // defpackage.myi
    public final DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.g;
        b.getClass();
        DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem detailedPriceItem = null;
        int i = 0;
        boolean z = false;
        SlotItemDto slotItemDto = null;
        DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType dividerType = null;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z2 = true;
        DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceTooltip detailedPriceTooltip = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    slotItemDto = (SlotItemDto) b.A(serialDescriptor, 0, SlotItemDto$$serializer.INSTANCE, slotItemDto);
                    i |= 1;
                    break;
                case 1:
                    d = b.E(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d2 = b.E(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dividerType = (DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), dividerType);
                    i |= 8;
                    break;
                case 4:
                    detailedPriceTooltip = (DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceTooltip) b.A(serialDescriptor, 4, DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceTooltip$$serializer.INSTANCE, detailedPriceTooltip);
                    i |= 16;
                    break;
                case 5:
                    z = b.C(serialDescriptor, 5);
                    i |= 32;
                    continue;
                default:
                    ny61.c(v);
                    return detailedPriceItem;
            }
            detailedPriceItem = null;
        }
        b.c(serialDescriptor);
        return new DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem(i, slotItemDto, d, d2, dividerType, detailedPriceTooltip, z);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.g;
        if (b.F() || !jl40.l(value.a, new SlotItemDto(0))) {
            b.e(serialDescriptor, 0, SlotItemDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || Double.compare(value.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, value.b);
        }
        if (b.F() || Double.compare(value.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType.UNKNOWN) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || !jl40.l(value.e, new DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceTooltip(0))) {
            b.e(serialDescriptor, 4, DetailedPriceItem$DetailedPrice$DetailedPriceContent$DetailedPriceTooltip$$serializer.INSTANCE, value.e);
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
