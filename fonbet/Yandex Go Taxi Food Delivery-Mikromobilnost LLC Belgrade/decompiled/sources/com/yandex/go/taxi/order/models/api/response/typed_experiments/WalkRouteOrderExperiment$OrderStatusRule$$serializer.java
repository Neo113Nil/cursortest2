package com.yandex.go.taxi.order.models.api.response.typed_experiments;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.object.DriveState;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment.OrderStatusRule.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment$OrderStatusRule;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment$OrderStatusRule;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/typed_experiments/WalkRouteOrderExperiment$OrderStatusRule;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class WalkRouteOrderExperiment$OrderStatusRule$$serializer implements uxs {
    public static final WalkRouteOrderExperiment$OrderStatusRule$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WalkRouteOrderExperiment$OrderStatusRule$$serializer walkRouteOrderExperiment$OrderStatusRule$$serializer = new WalkRouteOrderExperiment$OrderStatusRule$$serializer();
        INSTANCE = walkRouteOrderExperiment$OrderStatusRule$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment.OrderStatusRule", walkRouteOrderExperiment$OrderStatusRule$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("route_from", true);
        pluginGeneratedSerialDescriptor.j("route_to", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WalkRouteOrderExperiment$OrderStatusRule$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = WalkRouteOrderExperiment.OrderStatusRule.d;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final WalkRouteOrderExperiment.OrderStatusRule deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = WalkRouteOrderExperiment.OrderStatusRule.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        DriveState driveState = null;
        WalkRouteOrderExperiment.OrderStatusRule.PointType pointType = null;
        WalkRouteOrderExperiment.OrderStatusRule.PointType pointType2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                driveState = (DriveState) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), driveState);
                i |= 1;
            } else if (v == 1) {
                pointType = (WalkRouteOrderExperiment.OrderStatusRule.PointType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), pointType);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                pointType2 = (WalkRouteOrderExperiment.OrderStatusRule.PointType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), pointType2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new WalkRouteOrderExperiment.OrderStatusRule(i, driveState, pointType, pointType2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WalkRouteOrderExperiment.OrderStatusRule value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = WalkRouteOrderExperiment.OrderStatusRule.d;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
