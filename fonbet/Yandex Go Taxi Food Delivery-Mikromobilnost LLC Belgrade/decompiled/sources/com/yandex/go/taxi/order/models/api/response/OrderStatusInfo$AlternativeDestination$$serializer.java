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
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderStatusInfo.AlternativeDestination.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OrderStatusInfo$AlternativeDestination$$serializer implements uxs {
    public static final OrderStatusInfo$AlternativeDestination$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusInfo$AlternativeDestination$$serializer orderStatusInfo$AlternativeDestination$$serializer = new OrderStatusInfo$AlternativeDestination$$serializer();
        INSTANCE = orderStatusInfo$AlternativeDestination$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.AlternativeDestination", orderStatusInfo$AlternativeDestination$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("original_point", true);
        pluginGeneratedSerialDescriptor.j("alternative_point", true);
        pluginGeneratedSerialDescriptor.j("walk_time", true);
        pluginGeneratedSerialDescriptor.j("route", true);
        pluginGeneratedSerialDescriptor.j("seconds_after_finish", true);
        pluginGeneratedSerialDescriptor.j("info_block", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderStatusInfo$AlternativeDestination$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = OrderStatusInfo.AlternativeDestination.g;
        OrderStatusInfo$AlternativeDestination$Point$$serializer orderStatusInfo$AlternativeDestination$Point$$serializer = OrderStatusInfo$AlternativeDestination$Point$$serializer.INSTANCE;
        return new KSerializer[]{orderStatusInfo$AlternativeDestination$Point$$serializer, orderStatusInfo$AlternativeDestination$Point$$serializer, auu0.a, i3yVarArr[3].getValue(), h6w.a, qke.n(OrderStatusInfo$AlternativeDestination$InfoBlock$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final OrderStatusInfo.AlternativeDestination deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusInfo.AlternativeDestination.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        OrderStatusInfo.AlternativeDestination.Point point = null;
        OrderStatusInfo.AlternativeDestination.Point point2 = null;
        String str = null;
        List list = null;
        OrderStatusInfo.AlternativeDestination.InfoBlock infoBlock = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    point = (OrderStatusInfo.AlternativeDestination.Point) b.A(serialDescriptor, 0, OrderStatusInfo$AlternativeDestination$Point$$serializer.INSTANCE, point);
                    i |= 1;
                    break;
                case 1:
                    point2 = (OrderStatusInfo.AlternativeDestination.Point) b.A(serialDescriptor, 1, OrderStatusInfo$AlternativeDestination$Point$$serializer.INSTANCE, point2);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    infoBlock = (OrderStatusInfo.AlternativeDestination.InfoBlock) b.s(serialDescriptor, 5, OrderStatusInfo$AlternativeDestination$InfoBlock$$serializer.INSTANCE, infoBlock);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new OrderStatusInfo.AlternativeDestination(i, point, point2, str, list, i2, infoBlock);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.AlternativeDestination.Point.c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.AlternativeDestination.Point.c) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, OrderStatusInfo.AlternativeDestination value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusInfo.AlternativeDestination.g;
        if (!b.F()) {
            OrderStatusInfo.AlternativeDestination.Point point = value.a;
            OrderStatusInfo.AlternativeDestination.Point.Companion.getClass();
        }
        b.e(serialDescriptor, 0, OrderStatusInfo$AlternativeDestination$Point$$serializer.INSTANCE, value.a);
        if (!b.F()) {
            OrderStatusInfo.AlternativeDestination.Point point2 = value.b;
            OrderStatusInfo.AlternativeDestination.Point.Companion.getClass();
        }
        b.e(serialDescriptor, 1, OrderStatusInfo$AlternativeDestination$Point$$serializer.INSTANCE, value.b);
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, OrderStatusInfo$AlternativeDestination$InfoBlock$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
