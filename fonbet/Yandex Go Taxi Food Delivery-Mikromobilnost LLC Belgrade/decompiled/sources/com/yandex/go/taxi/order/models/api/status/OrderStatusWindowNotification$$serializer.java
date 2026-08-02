package com.yandex.go.taxi.order.models.api.status;

import defpackage.auu0;
import defpackage.f8s0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.o8s0;
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
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/status/OrderStatusWindowNotification.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowNotification;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowNotification;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/status/OrderStatusWindowNotification;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OrderStatusWindowNotification$$serializer implements uxs {
    public static final OrderStatusWindowNotification$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusWindowNotification$$serializer orderStatusWindowNotification$$serializer = new OrderStatusWindowNotification$$serializer();
        INSTANCE = orderStatusWindowNotification$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification", orderStatusWindowNotification$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("notification_message", true);
        pluginGeneratedSerialDescriptor.j(CRLReasonCodeExtension.REASON, true);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("main_button", true);
        pluginGeneratedSerialDescriptor.j("extra_button", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("image_type", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("available_statuses", true);
        pluginGeneratedSerialDescriptor.j("show_change_payment_method_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderStatusWindowNotification$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = OrderStatusWindowNotification.m;
        auu0 auu0Var = auu0.a;
        OrderStatusWindowButton$$serializer orderStatusWindowButton$$serializer = OrderStatusWindowButton$$serializer.INSTANCE;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, orderStatusWindowButton$$serializer, qke.n(orderStatusWindowButton$$serializer), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n(f8s0.a), i3yVarArr[10].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final OrderStatusWindowNotification deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = OrderStatusWindowNotification.m;
        b.getClass();
        jsq0 jsq0Var = null;
        o8s0 o8s0Var = null;
        ImageType imageType = null;
        boolean z2 = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        OrderStatusWindowButton orderStatusWindowButton = null;
        OrderStatusWindowButton orderStatusWindowButton2 = null;
        boolean z3 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr;
                case 2:
                    i3yVarArr = i3yVarArr3;
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    str5 = b.k(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    str6 = b.k(serialDescriptor, 4);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                case 5:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    orderStatusWindowButton = (OrderStatusWindowButton) b.A(serialDescriptor, 5, OrderStatusWindowButton$$serializer.INSTANCE, orderStatusWindowButton);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 6:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    orderStatusWindowButton2 = (OrderStatusWindowButton) b.s(serialDescriptor, 6, OrderStatusWindowButton$$serializer.INSTANCE, orderStatusWindowButton2);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 7:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    imageType = (ImageType) b.s(serialDescriptor, 8, (myi) i3yVarArr2[8].getValue(), imageType);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    o8s0Var = (o8s0) b.s(serialDescriptor, 9, f8s0.a, o8s0Var);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    jsq0Var = (jsq0) b.A(serialDescriptor, 10, (myi) i3yVarArr2[10].getValue(), jsq0Var);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    z3 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    i3yVarArr3 = i3yVarArr;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new OrderStatusWindowNotification(i, str2, str3, str4, str5, str6, orderStatusWindowButton, orderStatusWindowButton2, str, imageType, o8s0Var, jsq0Var, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.taxi.order.models.api.status.OrderStatusWindowButton.e) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, OrderStatusWindowNotification value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusWindowNotification.m;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (!b.F()) {
            OrderStatusWindowButton orderStatusWindowButton = value.f;
            OrderStatusWindowButton.Companion.getClass();
        }
        b.e(serialDescriptor, 5, OrderStatusWindowButton$$serializer.INSTANCE, value.f);
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, OrderStatusWindowButton$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, f8s0.a, value.j);
        }
        if (b.F() || !jl40.l(value.k, ksq0.a)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        }
        if (b.F() || value.l) {
            b.n(serialDescriptor, 11, value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
