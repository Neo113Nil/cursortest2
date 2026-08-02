package com.yandex.go.taxi.order.models.api.preorder;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.yjd;
import java.util.Calendar;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/preorder/ScheduledOrder.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/preorder/ScheduledOrder;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/preorder/ScheduledOrder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/preorder/ScheduledOrder;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScheduledOrder$$serializer implements uxs {
    public static final ScheduledOrder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduledOrder$$serializer scheduledOrder$$serializer = new ScheduledOrder$$serializer();
        INSTANCE = scheduledOrder$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.preorder.ScheduledOrder", scheduledOrder$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("due", true);
        pluginGeneratedSerialDescriptor.j("lastSelectedDue", true);
        pluginGeneratedSerialDescriptor.j("scheduledOrderId", true);
        pluginGeneratedSerialDescriptor.j("additionalMinutes", true);
        pluginGeneratedSerialDescriptor.j("duePrecisionMinutes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScheduledOrder$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        vmt vmtVar = vmt.a;
        KSerializer n = qke.n(vmtVar);
        KSerializer n2 = qke.n(vmtVar);
        KSerializer n3 = qke.n(auu0.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, n2, n3, h6wVar, qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final ScheduledOrder deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Calendar calendar = null;
        Calendar calendar2 = null;
        String str = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                calendar = (Calendar) b.s(serialDescriptor, 0, vmt.a, calendar);
                i |= 1;
            } else if (v == 1) {
                calendar2 = (Calendar) b.s(serialDescriptor, 1, vmt.a, calendar2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        ScheduledOrder scheduledOrder = new ScheduledOrder();
        if ((i & 1) == 0) {
            scheduledOrder.a = null;
        } else {
            scheduledOrder.a = calendar;
        }
        if ((i & 2) == 0) {
            scheduledOrder.b = scheduledOrder.a;
        } else {
            scheduledOrder.b = calendar2;
        }
        if ((i & 4) == 0) {
            scheduledOrder.c = null;
        } else {
            scheduledOrder.c = str;
        }
        if ((i & 8) == 0) {
            scheduledOrder.d = 0;
        } else {
            scheduledOrder.d = i2;
        }
        if ((i & 16) == 0) {
            scheduledOrder.e = null;
            return scheduledOrder;
        }
        scheduledOrder.e = num;
        return scheduledOrder;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScheduledOrder value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, vmt.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, value.a)) {
            b.g(serialDescriptor, 1, vmt.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != 0) {
            b.A(3, value.d, serialDescriptor);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, h6w.a, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
