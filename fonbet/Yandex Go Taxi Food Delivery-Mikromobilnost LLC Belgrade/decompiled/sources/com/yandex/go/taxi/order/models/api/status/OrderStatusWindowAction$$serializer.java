package com.yandex.go.taxi.order.models.api.status;

import com.adjust.sdk.Constants;
import defpackage.auu0;
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
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/status/OrderStatusWindowAction.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowAction;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowAction;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowAction;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OrderStatusWindowAction$$serializer implements uxs {
    public static final OrderStatusWindowAction$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusWindowAction$$serializer orderStatusWindowAction$$serializer = new OrderStatusWindowAction$$serializer();
        INSTANCE = orderStatusWindowAction$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.status.OrderStatusWindowAction", orderStatusWindowAction$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("required_card_balance", true);
        pluginGeneratedSerialDescriptor.j("required_balance", true);
        pluginGeneratedSerialDescriptor.j("payment_method_id", true);
        pluginGeneratedSerialDescriptor.j("payment_method_type", true);
        pluginGeneratedSerialDescriptor.j("suggest_payment_method_change_after_topup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderStatusWindowAction$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = OrderStatusWindowAction.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(RequiredCardBalance$$serializer.INSTANCE), qke.n(RequiredYangopayBalance$$serializer.INSTANCE), auu0Var, auu0Var, z96.a};
    }

    @Override // defpackage.myi
    public final OrderStatusWindowAction deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusWindowAction.i;
        b.getClass();
        OrderStatusWindowAction orderStatusWindowAction = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        ActionType actionType = null;
        ScreenType screenType = null;
        String str = null;
        RequiredCardBalance requiredCardBalance = null;
        RequiredYangopayBalance requiredYangopayBalance = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    actionType = (ActionType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), actionType);
                    i |= 1;
                    break;
                case 1:
                    screenType = (ScreenType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), screenType);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    requiredCardBalance = (RequiredCardBalance) b.s(serialDescriptor, 3, RequiredCardBalance$$serializer.INSTANCE, requiredCardBalance);
                    i |= 8;
                    break;
                case 4:
                    requiredYangopayBalance = (RequiredYangopayBalance) b.s(serialDescriptor, 4, RequiredYangopayBalance$$serializer.INSTANCE, requiredYangopayBalance);
                    i |= 16;
                    break;
                case 5:
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    str3 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return orderStatusWindowAction;
            }
            orderStatusWindowAction = null;
        }
        b.c(serialDescriptor);
        return new OrderStatusWindowAction(i, actionType, screenType, str, requiredCardBalance, requiredYangopayBalance, str2, str3, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OrderStatusWindowAction value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusWindowAction.i;
        if (b.F() || value.a != ActionType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != ScreenType.UNKNOWN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, RequiredCardBalance$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, RequiredYangopayBalance$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
