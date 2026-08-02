package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.b0t;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pf00;
import defpackage.qke;
import defpackage.rf00;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zzs;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/OrderStatusInfo.AlternativeDestination.Point.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$Point;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$Point;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/OrderStatusInfo$AlternativeDestination$Point;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OrderStatusInfo$AlternativeDestination$Point$$serializer implements uxs {
    public static final OrderStatusInfo$AlternativeDestination$Point$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusInfo$AlternativeDestination$Point$$serializer orderStatusInfo$AlternativeDestination$Point$$serializer = new OrderStatusInfo$AlternativeDestination$Point$$serializer();
        INSTANCE = orderStatusInfo$AlternativeDestination$Point$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.OrderStatusInfo.AlternativeDestination.Point", orderStatusInfo$AlternativeDestination$Point$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderStatusInfo$AlternativeDestination$Point$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b0t.a, qke.n(pf00.a)};
    }

    @Override // defpackage.myi
    public final OrderStatusInfo.AlternativeDestination.Point deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        zzs zzsVar = null;
        rf00 rf00Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zzsVar = (zzs) b.A(serialDescriptor, 0, b0t.a, zzsVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                rf00Var = (rf00) b.s(serialDescriptor, 1, pf00.a, rf00Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new OrderStatusInfo.AlternativeDestination.Point(i, zzsVar, rf00Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OrderStatusInfo.AlternativeDestination.Point value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i2 i2Var = OrderStatusInfo.AlternativeDestination.Point.Companion;
        if (b.F() || !jl40.l(value.a, zzs.f)) {
            b.e(serialDescriptor, 0, b0t.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, pf00.a, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
