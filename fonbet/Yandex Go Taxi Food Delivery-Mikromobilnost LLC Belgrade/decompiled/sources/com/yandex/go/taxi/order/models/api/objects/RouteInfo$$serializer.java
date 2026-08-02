package com.yandex.go.taxi.order.models.api.objects;

import defpackage.e6m;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/objects/RouteInfo.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/objects/RouteInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class RouteInfo$$serializer implements uxs {
    public static final RouteInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RouteInfo$$serializer routeInfo$$serializer = new RouteInfo$$serializer();
        INSTANCE = routeInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.objects.RouteInfo", routeInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("distance_left", true);
        pluginGeneratedSerialDescriptor.j("time_left", true);
        pluginGeneratedSerialDescriptor.j("max_time_left", true);
        pluginGeneratedSerialDescriptor.j("positions", true);
        pluginGeneratedSerialDescriptor.j("map_route_parameters", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RouteInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = RouteInfo.f;
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar, e6mVar, i3yVarArr[3].getValue(), qke.n(MapRouteParametersDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final RouteInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = RouteInfo.f;
        b.getClass();
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        List list = null;
        MapRouteParametersDto mapRouteParametersDto = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                d3 = b.E(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                mapRouteParametersDto = (MapRouteParametersDto) b.s(serialDescriptor, 4, MapRouteParametersDto$$serializer.INSTANCE, mapRouteParametersDto);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new RouteInfo(i, d, d2, d3, list, mapRouteParametersDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RouteInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = RouteInfo.f;
        if (b.F() || Double.compare(value.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, value.a);
        }
        if (b.F() || Double.compare(value.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, value.b);
        }
        if (b.F() || Double.compare(value.c, 0.0d) != 0) {
            b.E(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, MapRouteParametersDto$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
