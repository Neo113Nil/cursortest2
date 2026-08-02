package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.api.model.MobilityHubSourceAction;
import com.yandex.go.taxi.summary.api.model.MobilityHubSourceType;
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
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubScreenRequestParamsV2$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubScreenRequestParamsV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubScreenRequestParamsV2$$serializer hubScreenRequestParamsV2$$serializer = new HubScreenRequestParamsV2$$serializer();
        INSTANCE = hubScreenRequestParamsV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenRequestParamsV2", hubScreenRequestParamsV2$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("routestats", false);
        pluginGeneratedSerialDescriptor.j("zone_name", false);
        pluginGeneratedSerialDescriptor.j("filters", false);
        pluginGeneratedSerialDescriptor.j("selected_transport_ids", false);
        pluginGeneratedSerialDescriptor.j("selected_offer_id", false);
        pluginGeneratedSerialDescriptor.j("selected_taxi_tariff_class", false);
        pluginGeneratedSerialDescriptor.j("hub_session_id", false);
        pluginGeneratedSerialDescriptor.j("source_action", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("guaranteed_first_offer_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubScreenRequestParamsV2$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = HubScreenRequestParamsV2.l;
        KSerializer n = qke.n(RouteStatsDataV2$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{RouteParamV2$$serializer.INSTANCE, n, auu0Var, qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n((KSerializer) i3yVarArr[9].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final HubScreenRequestParamsV2 deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = HubScreenRequestParamsV2.l;
        b.getClass();
        String str = null;
        MobilityHubSourceType mobilityHubSourceType = null;
        MobilityHubSourceAction mobilityHubSourceAction = null;
        boolean z2 = true;
        String str2 = null;
        int i = 0;
        RouteParamV2 routeParamV2 = null;
        RouteStatsDataV2 routeStatsDataV2 = null;
        String str3 = null;
        List list = null;
        Set set = null;
        String str4 = null;
        String str5 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    routeParamV2 = (RouteParamV2) b.A(serialDescriptor, 0, RouteParamV2$$serializer.INSTANCE, routeParamV2);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    routeStatsDataV2 = (RouteStatsDataV2) b.s(serialDescriptor, 1, RouteStatsDataV2$$serializer.INSTANCE, routeStatsDataV2);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    i3yVarArr2 = i3yVarArr2;
                    continue;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    set = (Set) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), set);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str2);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    mobilityHubSourceAction = (MobilityHubSourceAction) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), mobilityHubSourceAction);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    mobilityHubSourceType = (MobilityHubSourceType) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), mobilityHubSourceType);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new HubScreenRequestParamsV2(i, routeParamV2, routeStatsDataV2, str3, list, set, str4, str5, str2, mobilityHubSourceAction, mobilityHubSourceType, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubScreenRequestParamsV2 value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubScreenRequestParamsV2.l;
        RouteParamV2$$serializer routeParamV2$$serializer = RouteParamV2$$serializer.INSTANCE;
        RouteParamV2 routeParamV2 = value.a;
        String str = value.k;
        b.e(serialDescriptor, 0, routeParamV2$$serializer, routeParamV2);
        b.g(serialDescriptor, 1, RouteStatsDataV2$$serializer.INSTANCE, value.b);
        b.o(serialDescriptor, 2, value.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 5, auu0Var, value.f);
        b.g(serialDescriptor, 6, auu0Var, value.g);
        b.g(serialDescriptor, 7, auu0Var, value.h);
        b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), value.j);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 10, auu0Var, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
