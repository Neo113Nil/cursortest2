package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.auu0;
import defpackage.gef;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.ief;
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
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteStatsDataV2.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteStatsDataV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteStatsDataV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/RouteStatsDataV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class RouteStatsDataV2$$serializer implements uxs {
    public static final int $stable = 0;
    public static final RouteStatsDataV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RouteStatsDataV2$$serializer routeStatsDataV2$$serializer = new RouteStatsDataV2$$serializer();
        INSTANCE = routeStatsDataV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RouteStatsDataV2", routeStatsDataV2$$serializer, 8);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.TIME, false);
        pluginGeneratedSerialDescriptor.j("time_seconds", false);
        pluginGeneratedSerialDescriptor.j("currency_rules", false);
        pluginGeneratedSerialDescriptor.j("service_levels", false);
        pluginGeneratedSerialDescriptor.j("drive_offers", false);
        pluginGeneratedSerialDescriptor.j("mobility_hub_context", false);
        pluginGeneratedSerialDescriptor.j("due", false);
        pluginGeneratedSerialDescriptor.j("toll_roads", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RouteStatsDataV2$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = RouteStatsDataV2.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(h6w.a), qke.n(gef.a), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(HubContextParamV2$$serializer.INSTANCE), qke.n(auu0Var), qke.n(HubTollRoadsParam$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final RouteStatsDataV2 deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = RouteStatsDataV2.i;
        b.getClass();
        RouteStatsDataV2 routeStatsDataV2 = null;
        boolean z = true;
        HubTollRoadsParam hubTollRoadsParam = null;
        String str = null;
        Integer num = null;
        ief iefVar = null;
        List list = null;
        List list2 = null;
        HubContextParamV2 hubContextParamV2 = null;
        String str2 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    iefVar = (ief) b.s(serialDescriptor, 2, gef.a, iefVar);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    hubContextParamV2 = (HubContextParamV2) b.s(serialDescriptor, 5, HubContextParamV2$$serializer.INSTANCE, hubContextParamV2);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) b.s(serialDescriptor, 6, auu0.a, str2);
                    i |= 64;
                    break;
                case 7:
                    hubTollRoadsParam = (HubTollRoadsParam) b.s(serialDescriptor, 7, HubTollRoadsParam$$serializer.INSTANCE, hubTollRoadsParam);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return routeStatsDataV2;
            }
            routeStatsDataV2 = null;
        }
        b.c(serialDescriptor);
        return new RouteStatsDataV2(i, str, num, iefVar, list, list2, hubContextParamV2, str2, hubTollRoadsParam);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RouteStatsDataV2 value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = RouteStatsDataV2.i;
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 0, auu0Var, value.a);
        b.g(serialDescriptor, 1, h6w.a, value.b);
        b.g(serialDescriptor, 2, gef.a, value.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.g(serialDescriptor, 5, HubContextParamV2$$serializer.INSTANCE, value.f);
        b.g(serialDescriptor, 6, auu0Var, value.g);
        b.g(serialDescriptor, 7, HubTollRoadsParam$$serializer.INSTANCE, value.h);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
