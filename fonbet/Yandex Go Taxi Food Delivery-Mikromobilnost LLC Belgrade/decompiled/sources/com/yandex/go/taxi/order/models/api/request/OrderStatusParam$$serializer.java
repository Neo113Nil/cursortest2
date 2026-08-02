package com.yandex.go.taxi.order.models.api.request;

import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.scc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/request/OrderStatusParam.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/request/OrderStatusParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class OrderStatusParam$$serializer implements uxs {
    public static final OrderStatusParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OrderStatusParam$$serializer orderStatusParam$$serializer = new OrderStatusParam$$serializer();
        INSTANCE = orderStatusParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.request.OrderStatusParam", orderStatusParam$$serializer, 18);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("orderid", false);
        pluginGeneratedSerialDescriptor.j("version", true);
        pluginGeneratedSerialDescriptor.j("break", true);
        pluginGeneratedSerialDescriptor.j("cancel_state", true);
        pluginGeneratedSerialDescriptor.j("user_actions", true);
        pluginGeneratedSerialDescriptor.j("order_contact", true);
        pluginGeneratedSerialDescriptor.j("supported", true);
        pluginGeneratedSerialDescriptor.j("search_state_info", true);
        pluginGeneratedSerialDescriptor.j("is_multiorder", true);
        pluginGeneratedSerialDescriptor.j("format_currency", true);
        pluginGeneratedSerialDescriptor.j("supported_widgets", true);
        pluginGeneratedSerialDescriptor.j("supported_promo_actions", true);
        pluginGeneratedSerialDescriptor.j("ultima_mode", true);
        pluginGeneratedSerialDescriptor.j("choose_appearance_mode", true);
        pluginGeneratedSerialDescriptor.j("user_power_prc", true);
        pluginGeneratedSerialDescriptor.j("user_plugged_state", true);
        pluginGeneratedSerialDescriptor.j("is_lightweight", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OrderStatusParam$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = OrderStatusParam.s;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(OrderStatusParam$OrderContact$$serializer.INSTANCE), i3yVarArr[7].getValue(), qke.n(OrderStatusParam$SearchStateInfoRequest$$serializer.INSTANCE), qke.n(z96Var), z96Var, i3yVarArr[11].getValue(), i3yVarArr[12].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(h6w.a), qke.n(auu0Var), z96Var};
    }

    @Override // defpackage.myi
    public final OrderStatusParam deserialize(Decoder decoder) {
        OrderStatusParam.Break r23;
        jsq0 jsq0Var;
        String str;
        OrderStatusParam.Break r232;
        OrderStatusParam.Break r233;
        OrderStatusParam.Break r234;
        String str2;
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusParam.s;
        b.getClass();
        jsq0 jsq0Var2 = null;
        jsq0 jsq0Var3 = null;
        Boolean bool = null;
        OrderStatusParam.SearchStateInfoRequest searchStateInfoRequest = null;
        String str3 = null;
        List list = null;
        int i2 = 0;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        OrderStatusParam.Break r12 = null;
        String str6 = null;
        Map map = null;
        OrderStatusParam.OrderContact orderContact = null;
        boolean z = true;
        boolean z2 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    jsq0Var = jsq0Var2;
                    str = str6;
                    z = false;
                    str6 = str;
                    jsq0Var2 = jsq0Var;
                case 0:
                    jsq0Var = jsq0Var2;
                    r232 = r12;
                    str = str6;
                    str7 = b.k(serialDescriptor, 0);
                    i2 |= 1;
                    r12 = r232;
                    str6 = str;
                    jsq0Var2 = jsq0Var;
                case 1:
                    jsq0Var = jsq0Var2;
                    r233 = r12;
                    str8 = b.k(serialDescriptor, 1);
                    i2 |= 2;
                    r12 = r233;
                    jsq0Var2 = jsq0Var;
                case 2:
                    jsq0Var = jsq0Var2;
                    str = str6;
                    r232 = r12;
                    str9 = (String) b.s(serialDescriptor, 2, auu0.a, str9);
                    i2 |= 4;
                    r12 = r232;
                    str6 = str;
                    jsq0Var2 = jsq0Var;
                case 3:
                    jsq0Var = jsq0Var2;
                    str = str6;
                    r12 = (OrderStatusParam.Break) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), r12);
                    i2 |= 8;
                    str6 = str;
                    jsq0Var2 = jsq0Var;
                case 4:
                    r233 = r12;
                    jsq0Var = jsq0Var2;
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i2 |= 16;
                    r12 = r233;
                    jsq0Var2 = jsq0Var;
                case 5:
                    r234 = r12;
                    str2 = str6;
                    map = (Map) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map);
                    i2 |= 32;
                    r12 = r234;
                    str6 = str2;
                case 6:
                    r234 = r12;
                    str2 = str6;
                    orderContact = (OrderStatusParam.OrderContact) b.s(serialDescriptor, 6, OrderStatusParam$OrderContact$$serializer.INSTANCE, orderContact);
                    i2 |= 64;
                    r12 = r234;
                    str6 = str2;
                case 7:
                    r234 = r12;
                    str2 = str6;
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i2 |= 128;
                    r12 = r234;
                    str6 = str2;
                case 8:
                    r234 = r12;
                    str2 = str6;
                    searchStateInfoRequest = (OrderStatusParam.SearchStateInfoRequest) b.s(serialDescriptor, 8, OrderStatusParam$SearchStateInfoRequest$$serializer.INSTANCE, searchStateInfoRequest);
                    i2 |= 256;
                    r12 = r234;
                    str6 = str2;
                case 9:
                    r234 = r12;
                    str2 = str6;
                    bool = (Boolean) b.s(serialDescriptor, 9, z96.a, bool);
                    i2 |= 512;
                    r12 = r234;
                    str6 = str2;
                case 10:
                    r23 = r12;
                    z2 = b.C(serialDescriptor, 10);
                    i2 |= 1024;
                    r12 = r23;
                case 11:
                    r234 = r12;
                    str2 = str6;
                    jsq0Var3 = (jsq0) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), jsq0Var3);
                    i2 |= 2048;
                    r12 = r234;
                    str6 = str2;
                case 12:
                    r234 = r12;
                    str2 = str6;
                    jsq0Var2 = (jsq0) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), jsq0Var2);
                    i2 |= 4096;
                    r12 = r234;
                    str6 = str2;
                case 13:
                    r234 = r12;
                    str2 = str6;
                    str3 = (String) b.s(serialDescriptor, 13, auu0.a, str3);
                    i2 |= 8192;
                    r12 = r234;
                    str6 = str2;
                case 14:
                    r234 = r12;
                    str2 = str6;
                    str4 = (String) b.s(serialDescriptor, 14, auu0.a, str4);
                    i2 |= 16384;
                    r12 = r234;
                    str6 = str2;
                case 15:
                    r234 = r12;
                    str2 = str6;
                    num = (Integer) b.s(serialDescriptor, 15, h6w.a, num);
                    i = 32768;
                    i2 |= i;
                    r12 = r234;
                    str6 = str2;
                case 16:
                    r234 = r12;
                    str2 = str6;
                    str5 = (String) b.s(serialDescriptor, 16, auu0.a, str5);
                    i = 65536;
                    i2 |= i;
                    r12 = r234;
                    str6 = str2;
                case 17:
                    r23 = r12;
                    z3 = b.C(serialDescriptor, 17);
                    i2 |= 131072;
                    r12 = r23;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        jsq0 jsq0Var4 = jsq0Var2;
        b.c(serialDescriptor);
        return new OrderStatusParam(i2, str7, str8, str9, r12, str6, map, orderContact, list, searchStateInfoRequest, bool, z2, jsq0Var3, jsq0Var4, str3, str4, num, str5, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        if (defpackage.jl40.l(r11, new defpackage.jsq0(r0)) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0129, code lost:
    
        if (defpackage.jl40.l(r10, new defpackage.jsq0(r0)) == false) goto L59;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, OrderStatusParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = OrderStatusParam.s;
        String str = value.a;
        boolean z = value.r;
        String str2 = value.q;
        Integer num = value.p;
        String str3 = value.o;
        String str4 = value.n;
        jsq0 jsq0Var = value.m;
        jsq0 jsq0Var2 = value.l;
        boolean z2 = value.k;
        Boolean bool = value.j;
        OrderStatusParam.SearchStateInfoRequest searchStateInfoRequest = value.i;
        List list = value.h;
        OrderStatusParam.OrderContact orderContact = value.g;
        Map map = value.f;
        String str5 = value.e;
        OrderStatusParam.Break r7 = value.d;
        String str6 = value.c;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, value.b);
        if (b.F() || str6 != null) {
            b.g(serialDescriptor, 2, auu0.a, str6);
        }
        if (b.F() || r7 != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), r7);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 4, auu0.a, str5);
        }
        if (b.F() || map != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), map);
        }
        if (b.F() || orderContact != null) {
            b.g(serialDescriptor, 6, OrderStatusParam$OrderContact$$serializer.INSTANCE, orderContact);
        }
        if (b.F() || !jl40.l(list, scc.g("midpointchange", "code_dispatch"))) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), list);
        }
        if (b.F() || searchStateInfoRequest != null) {
            b.g(serialDescriptor, 8, OrderStatusParam$SearchStateInfoRequest$$serializer.INSTANCE, searchStateInfoRequest);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 9, z96.a, bool);
        }
        if (b.F() || !z2) {
            b.n(serialDescriptor, 10, z2);
        }
        if (!b.F()) {
            k4o b2 = OrderStatusParam.Widget.b();
            jsq0 jsq0Var3 = ksq0.a;
        }
        b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), jsq0Var2);
        if (!b.F()) {
            k4o b3 = OrderStatusParam.PromoAction.b();
            jsq0 jsq0Var4 = ksq0.a;
        }
        b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), jsq0Var);
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 13, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 14, auu0.a, str3);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 15, h6w.a, num);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 16, auu0.a, str2);
        }
        if (b.F() || z) {
            b.n(serialDescriptor, 17, z);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
