package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderStatusInfo.RidaSearchInfo.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$RidaSearchInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OrderStatusInfo$RidaSearchInfo$$serializer implements uxs {
    public static final OrderStatusInfo$RidaSearchInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusInfo$RidaSearchInfo$$serializer orderStatusInfo$RidaSearchInfo$$serializer = new OrderStatusInfo$RidaSearchInfo$$serializer();
        INSTANCE = orderStatusInfo$RidaSearchInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.RidaSearchInfo", orderStatusInfo$RidaSearchInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("iteration", true);
        pluginGeneratedSerialDescriptor.j("background_colors", true);
        pluginGeneratedSerialDescriptor.j("lookup_title", true);
        pluginGeneratedSerialDescriptor.j("lookup_subtitle", true);
        pluginGeneratedSerialDescriptor.j("view_info", true);
        pluginGeneratedSerialDescriptor.j("increase_price_info", true);
        pluginGeneratedSerialDescriptor.j("bids", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderStatusInfo$RidaSearchInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, OrderStatusInfo$RidaSearchInfo$BackgroundColors$$serializer.INSTANCE, qke.n(w7s.a), qke.n(auu0.a), qke.n(OrderStatusInfo$RidaSearchInfo$ViewInfo$$serializer.INSTANCE), qke.n(OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo$$serializer.INSTANCE), OrderStatusInfo.RidaSearchInfo.h[6].getValue()};
    }

    @Override // defpackage.myi
    public final OrderStatusInfo.RidaSearchInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusInfo.RidaSearchInfo.h;
        b.getClass();
        OrderStatusInfo.RidaSearchInfo ridaSearchInfo = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        OrderStatusInfo.RidaSearchInfo.BackgroundColors backgroundColors = null;
        FormattedText formattedText = null;
        String str = null;
        OrderStatusInfo.RidaSearchInfo.ViewInfo viewInfo = null;
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo increasePriceInfo = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    backgroundColors = (OrderStatusInfo.RidaSearchInfo.BackgroundColors) b.A(serialDescriptor, 1, OrderStatusInfo$RidaSearchInfo$BackgroundColors$$serializer.INSTANCE, backgroundColors);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    viewInfo = (OrderStatusInfo.RidaSearchInfo.ViewInfo) b.s(serialDescriptor, 4, OrderStatusInfo$RidaSearchInfo$ViewInfo$$serializer.INSTANCE, viewInfo);
                    i |= 16;
                    break;
                case 5:
                    increasePriceInfo = (OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo) b.s(serialDescriptor, 5, OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo$$serializer.INSTANCE, increasePriceInfo);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return ridaSearchInfo;
            }
            ridaSearchInfo = null;
        }
        b.c(serialDescriptor);
        return new OrderStatusInfo.RidaSearchInfo(i, i2, backgroundColors, formattedText, str, viewInfo, increasePriceInfo, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OrderStatusInfo.RidaSearchInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusInfo.RidaSearchInfo.h;
        if (b.F() || value.a != 0) {
            b.A(0, value.a, serialDescriptor);
        }
        if (b.F() || !jl40.l(value.b, new OrderStatusInfo.RidaSearchInfo.BackgroundColors(0))) {
            b.e(serialDescriptor, 1, OrderStatusInfo$RidaSearchInfo$BackgroundColors$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, OrderStatusInfo$RidaSearchInfo$ViewInfo$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, OrderStatusInfo$RidaSearchInfo$IncreasePriceInfo$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, EmptyList.a)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
