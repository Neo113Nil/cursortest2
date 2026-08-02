package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.auu0;
import defpackage.i3y;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubScreenRequestParams$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubScreenRequestParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubScreenRequestParams$$serializer hubScreenRequestParams$$serializer = new HubScreenRequestParams$$serializer();
        INSTANCE = hubScreenRequestParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubScreenRequestParams", hubScreenRequestParams$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("mapkit", false);
        pluginGeneratedSerialDescriptor.j("routestats", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("filters", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubScreenRequestParams$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RouteParam$$serializer.INSTANCE, MapkitDataParam$$serializer.INSTANCE, RouteStatsData$$serializer.INSTANCE, auu0.a, qke.n((KSerializer) HubScreenRequestParams.f[4].getValue())};
    }

    @Override // defpackage.myi
    public final HubScreenRequestParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubScreenRequestParams.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        RouteParam routeParam = null;
        MapkitDataParam mapkitDataParam = null;
        RouteStatsData routeStatsData = null;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                routeParam = (RouteParam) b.A(serialDescriptor, 0, RouteParam$$serializer.INSTANCE, routeParam);
                i |= 1;
            } else if (v == 1) {
                mapkitDataParam = (MapkitDataParam) b.A(serialDescriptor, 1, MapkitDataParam$$serializer.INSTANCE, mapkitDataParam);
                i |= 2;
            } else if (v == 2) {
                routeStatsData = (RouteStatsData) b.A(serialDescriptor, 2, RouteStatsData$$serializer.INSTANCE, routeStatsData);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new HubScreenRequestParams(i, routeParam, mapkitDataParam, routeStatsData, str, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubScreenRequestParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubScreenRequestParams.f;
        b.e(serialDescriptor, 0, RouteParam$$serializer.INSTANCE, value.a);
        b.e(serialDescriptor, 1, MapkitDataParam$$serializer.INSTANCE, value.b);
        b.e(serialDescriptor, 2, RouteStatsData$$serializer.INSTANCE, value.c);
        b.o(serialDescriptor, 3, value.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
