package com.yandex.go.taxi.order.net.taxi.dto.response;

import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import defpackage.ant;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.e6m;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import defpackage.zzs;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse.DriverInfo.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/net/taxi/dto/response/TaxiRouteResponse$DriverInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class TaxiRouteResponse$DriverInfo$$serializer implements uxs {
    public static final int $stable = 0;
    public static final TaxiRouteResponse$DriverInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiRouteResponse$DriverInfo$$serializer taxiRouteResponse$DriverInfo$$serializer = new TaxiRouteResponse$DriverInfo$$serializer();
        INSTANCE = taxiRouteResponse$DriverInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse.DriverInfo", taxiRouteResponse$DriverInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("speed", true);
        pluginGeneratedSerialDescriptor.j("direction", true);
        pluginGeneratedSerialDescriptor.j("coordinates", true);
        pluginGeneratedSerialDescriptor.j("distance_left", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, true);
        pluginGeneratedSerialDescriptor.j("shade_car", true);
        pluginGeneratedSerialDescriptor.j("shade_car_tooltip_title", true);
        pluginGeneratedSerialDescriptor.j("shade_car_tooltip_text", true);
        pluginGeneratedSerialDescriptor.j("shade_car_accessibility_tooltip_title", true);
        pluginGeneratedSerialDescriptor.j("shade_car_accessibility_tooltip_text", true);
        pluginGeneratedSerialDescriptor.j("accuracy_radius", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiRouteResponse$DriverInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        KSerializer n = qke.n(e6mVar);
        KSerializer n2 = qke.n(e6mVar);
        KSerializer n3 = qke.n(b0t.a);
        KSerializer n4 = qke.n(e6mVar);
        KSerializer n5 = qke.n(ant.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, n4, n5, z96.a, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), h6w.a};
    }

    @Override // defpackage.myi
    public final TaxiRouteResponse.DriverInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        Double d = null;
        Double d2 = null;
        zzs zzsVar = null;
        Double d3 = null;
        Date date = null;
        boolean z2 = false;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d = (Double) b.s(serialDescriptor, 0, e6m.a, d);
                    i |= 1;
                    break;
                case 1:
                    d2 = (Double) b.s(serialDescriptor, 1, e6m.a, d2);
                    i |= 2;
                    break;
                case 2:
                    zzsVar = (zzs) b.s(serialDescriptor, 2, b0t.a, zzsVar);
                    i |= 4;
                    break;
                case 3:
                    d3 = (Double) b.s(serialDescriptor, 3, e6m.a, d3);
                    i |= 8;
                    break;
                case 4:
                    date = (Date) b.s(serialDescriptor, 4, ant.a, date);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str3 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    break;
                case 9:
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                case 10:
                    i2 = b.h(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TaxiRouteResponse.DriverInfo(i, d, d2, zzsVar, d3, date, z2, str3, str4, str2, str, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiRouteResponse.DriverInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, e6m.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, e6m.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, b0t.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, e6m.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, ant.a, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || value.k != 0) {
            b.A(10, value.k, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
