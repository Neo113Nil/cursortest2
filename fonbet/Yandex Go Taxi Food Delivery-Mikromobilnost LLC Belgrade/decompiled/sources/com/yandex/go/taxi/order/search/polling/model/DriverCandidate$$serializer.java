package com.yandex.go.taxi.order.search.polling.model;

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
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/search/polling/model/DriverCandidate.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/search/polling/model/DriverCandidate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/search/polling/model/DriverCandidate;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/search/polling/model/DriverCandidate;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class DriverCandidate$$serializer implements uxs {
    public static final int $stable = 0;
    public static final DriverCandidate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DriverCandidate$$serializer driverCandidate$$serializer = new DriverCandidate$$serializer();
        INSTANCE = driverCandidate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.search.polling.model.DriverCandidate", driverCandidate$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("tariff_name", true);
        pluginGeneratedSerialDescriptor.j("positions", true);
        pluginGeneratedSerialDescriptor.j("car_color_code", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("photo_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DriverCandidate$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DriverCandidate.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final DriverCandidate deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DriverCandidate.h;
        b.getClass();
        DriverCandidate driverCandidate = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) b.s(serialDescriptor, 6, auu0.a, str6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return driverCandidate;
            }
            driverCandidate = null;
        }
        b.c(serialDescriptor);
        return new DriverCandidate(i, str, str2, list, str3, str4, str5, str6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DriverCandidate value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DriverCandidate.h;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
