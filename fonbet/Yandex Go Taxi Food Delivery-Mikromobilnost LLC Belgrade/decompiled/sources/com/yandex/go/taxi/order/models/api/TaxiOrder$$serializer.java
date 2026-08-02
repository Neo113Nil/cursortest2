package com.yandex.go.taxi.order.models.api;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData$$serializer;
import com.yandex.go.taxi.order.models.api.objects.UserActions;
import com.yandex.go.taxi.order.models.api.objects.UserActions$$serializer;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.Preorder$$serializer;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam$OrderContact$$serializer;
import defpackage.a78;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.v780;
import defpackage.x68;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/TaxiOrder.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/TaxiOrder;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/TaxiOrder;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiOrder$$serializer implements uxs {
    public static final TaxiOrder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiOrder$$serializer taxiOrder$$serializer = new TaxiOrder$$serializer();
        INSTANCE = taxiOrder$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.TaxiOrder", taxiOrder$$serializer, 12);
        pluginGeneratedSerialDescriptor.j(FinishFlowStatus.ORDER_ID_FIELD_NAME, true);
        pluginGeneratedSerialDescriptor.j("preorder", true);
        pluginGeneratedSerialDescriptor.j("startTime", true);
        pluginGeneratedSerialDescriptor.j("statusInfo", true);
        pluginGeneratedSerialDescriptor.j("userActions", true);
        pluginGeneratedSerialDescriptor.j("orderContact", true);
        pluginGeneratedSerialDescriptor.j("platesFormatter", true);
        pluginGeneratedSerialDescriptor.j("overrides", true);
        pluginGeneratedSerialDescriptor.j("pendingChanges", true);
        pluginGeneratedSerialDescriptor.j("additionalData", true);
        pluginGeneratedSerialDescriptor.j("searchStartDate", true);
        pluginGeneratedSerialDescriptor.j("local", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiOrder$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pnz pnzVar = pnz.a;
        return new KSerializer[]{auu0.a, Preorder$$serializer.INSTANCE, pnzVar, qke.n(v780.Companion.serializer()), qke.n(UserActions$$serializer.INSTANCE), qke.n(OrderStatusParam$OrderContact$$serializer.INSTANCE), qke.n(x68.a), TaxiOrderOverrides$$serializer.INSTANCE, TaxiOrderPendingChanges$$serializer.INSTANCE, qke.n(TaxiOrderAdditionalData$$serializer.INSTANCE), qke.n(pnzVar), TaxiOrderLocalData$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final TaxiOrder deserialize(Decoder decoder) {
        long j;
        String str;
        String str2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        long j2 = 0;
        Long l = null;
        TaxiOrderAdditionalData taxiOrderAdditionalData = null;
        TaxiOrderPendingChanges taxiOrderPendingChanges = null;
        TaxiOrderLocalData taxiOrderLocalData = null;
        a78 a78Var = null;
        TaxiOrderOverrides taxiOrderOverrides = null;
        int i = 0;
        String str3 = null;
        Preorder preorder = null;
        v780 v780Var = null;
        UserActions userActions = null;
        OrderStatusParam.OrderContact orderContact = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str2 = str3;
                    z = false;
                    str3 = str2;
                case 0:
                    j = j2;
                    i |= 1;
                    str3 = b.k(serialDescriptor, 0);
                    j2 = j;
                case 1:
                    str = str3;
                    j = j2;
                    preorder = (Preorder) b.A(serialDescriptor, 1, Preorder$$serializer.INSTANCE, preorder);
                    i |= 2;
                    str3 = str;
                    j2 = j;
                case 2:
                    str2 = str3;
                    j2 = b.f(serialDescriptor, 2);
                    i |= 4;
                    str3 = str2;
                case 3:
                    str = str3;
                    j = j2;
                    v780Var = (v780) b.s(serialDescriptor, 3, v780.Companion.serializer(), v780Var);
                    i |= 8;
                    str3 = str;
                    j2 = j;
                case 4:
                    str = str3;
                    j = j2;
                    userActions = (UserActions) b.s(serialDescriptor, 4, UserActions$$serializer.INSTANCE, userActions);
                    i |= 16;
                    str3 = str;
                    j2 = j;
                case 5:
                    str = str3;
                    j = j2;
                    orderContact = (OrderStatusParam.OrderContact) b.s(serialDescriptor, 5, OrderStatusParam$OrderContact$$serializer.INSTANCE, orderContact);
                    i |= 32;
                    str3 = str;
                    j2 = j;
                case 6:
                    str = str3;
                    j = j2;
                    a78Var = (a78) b.s(serialDescriptor, 6, x68.a, a78Var);
                    i |= 64;
                    str3 = str;
                    j2 = j;
                case 7:
                    str = str3;
                    j = j2;
                    taxiOrderOverrides = (TaxiOrderOverrides) b.A(serialDescriptor, 7, TaxiOrderOverrides$$serializer.INSTANCE, taxiOrderOverrides);
                    i |= 128;
                    str3 = str;
                    j2 = j;
                case 8:
                    str = str3;
                    j = j2;
                    taxiOrderPendingChanges = (TaxiOrderPendingChanges) b.A(serialDescriptor, 8, TaxiOrderPendingChanges$$serializer.INSTANCE, taxiOrderPendingChanges);
                    i |= 256;
                    str3 = str;
                    j2 = j;
                case 9:
                    str = str3;
                    j = j2;
                    taxiOrderAdditionalData = (TaxiOrderAdditionalData) b.s(serialDescriptor, 9, TaxiOrderAdditionalData$$serializer.INSTANCE, taxiOrderAdditionalData);
                    i |= 512;
                    str3 = str;
                    j2 = j;
                case 10:
                    str = str3;
                    j = j2;
                    l = (Long) b.s(serialDescriptor, 10, pnz.a, l);
                    i |= 1024;
                    str3 = str;
                    j2 = j;
                case 11:
                    str = str3;
                    j = j2;
                    taxiOrderLocalData = (TaxiOrderLocalData) b.A(serialDescriptor, 11, TaxiOrderLocalData$$serializer.INSTANCE, taxiOrderLocalData);
                    i |= 2048;
                    str3 = str;
                    j2 = j;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TaxiOrder(i, str3, preorder, j2, v780Var, userActions, orderContact, a78Var, taxiOrderOverrides, taxiOrderPendingChanges, taxiOrderAdditionalData, l, taxiOrderLocalData);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiOrder value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        f fVar = TaxiOrder.Companion;
        int i = 0;
        if (b.F() || !jl40.l(value.a, "preorder")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new Preorder(0))) {
            b.e(serialDescriptor, 1, Preorder$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != System.currentTimeMillis()) {
            b.s(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, v780.Companion.serializer(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, UserActions$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, OrderStatusParam$OrderContact$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, x68.a, value.g);
        }
        if (b.F() || !jl40.l(value.h, new TaxiOrderOverrides(i))) {
            b.e(serialDescriptor, 7, TaxiOrderOverrides$$serializer.INSTANCE, value.h);
        }
        if (b.F() || !jl40.l(value.i, new TaxiOrderPendingChanges(0))) {
            b.e(serialDescriptor, 8, TaxiOrderPendingChanges$$serializer.INSTANCE, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, TaxiOrderAdditionalData$$serializer.INSTANCE, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, pnz.a, value.k);
        }
        if (b.F() || !jl40.l(value.l, new TaxiOrderLocalData(0))) {
            b.e(serialDescriptor, 11, TaxiOrderLocalData$$serializer.INSTANCE, value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
