package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPaidOptionsParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPaidOptionsParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubPricesParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubRideTimeParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubSummaryStyleParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubSummaryStyleParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubTariffUnavailableParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubTariffUnavailableParam$$serializer;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.rcx;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubServiceLevelParamV2.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubServiceLevelParamV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubServiceLevelParamV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubServiceLevelParamV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubServiceLevelParamV2$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubServiceLevelParamV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubServiceLevelParamV2$$serializer hubServiceLevelParamV2$$serializer = new HubServiceLevelParamV2$$serializer();
        INSTANCE = hubServiceLevelParamV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubServiceLevelParamV2", hubServiceLevelParamV2$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("class", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("offer", false);
        pluginGeneratedSerialDescriptor.j("price", false);
        pluginGeneratedSerialDescriptor.j("original_price", false);
        pluginGeneratedSerialDescriptor.j("max_price_as_decimal", false);
        pluginGeneratedSerialDescriptor.j("is_fixed", false);
        pluginGeneratedSerialDescriptor.j("is_hidden", false);
        pluginGeneratedSerialDescriptor.j("prices", false);
        pluginGeneratedSerialDescriptor.j("tariff_unavailable", false);
        pluginGeneratedSerialDescriptor.j("details_tariff", false);
        pluginGeneratedSerialDescriptor.j("ride_time", false);
        pluginGeneratedSerialDescriptor.j("estimated_waiting", false);
        pluginGeneratedSerialDescriptor.j("paid_options", false);
        pluginGeneratedSerialDescriptor.j("summary_style", false);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubServiceLevelParamV2$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = HubServiceLevelParamV2.q;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, n, n2, n3, n4, n5, qke.n(z96Var), qke.n(z96Var), qke.n(HubPricesParam$$serializer.INSTANCE), qke.n(HubTariffUnavailableParam$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[10].getValue()), qke.n(HubRideTimeParam$$serializer.INSTANCE), qke.n(HubEstimatedWaitingParamV2$$serializer.INSTANCE), HubPaidOptionsParam$$serializer.INSTANCE, HubSummaryStyleParam$$serializer.INSTANCE, qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final HubServiceLevelParamV2 deserialize(Decoder decoder) {
        String str;
        String str2;
        HubRideTimeParam hubRideTimeParam;
        String str3;
        String str4;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubServiceLevelParamV2.q;
        b.getClass();
        HubRideTimeParam hubRideTimeParam2 = null;
        List list = null;
        HubTariffUnavailableParam hubTariffUnavailableParam = null;
        HubPricesParam hubPricesParam = null;
        HubEstimatedWaitingParamV2 hubEstimatedWaitingParamV2 = null;
        Boolean bool = null;
        int i = 0;
        HubPaidOptionsParam hubPaidOptionsParam = null;
        HubSummaryStyleParam hubSummaryStyleParam = null;
        kotlinx.serialization.json.b bVar = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool2 = null;
        boolean z = true;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    hubRideTimeParam = hubRideTimeParam2;
                    str3 = str5;
                    str4 = str6;
                    z = false;
                    str5 = str3;
                    str6 = str4;
                    hubRideTimeParam2 = hubRideTimeParam;
                case 0:
                    hubRideTimeParam = hubRideTimeParam2;
                    str3 = str5;
                    str4 = str6;
                    str8 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str5 = str3;
                    str6 = str4;
                    hubRideTimeParam2 = hubRideTimeParam;
                case 1:
                    hubRideTimeParam = hubRideTimeParam2;
                    str3 = str5;
                    str4 = str6;
                    str9 = (String) b.s(serialDescriptor, 1, auu0.a, str9);
                    i |= 2;
                    str10 = str10;
                    str5 = str3;
                    str6 = str4;
                    hubRideTimeParam2 = hubRideTimeParam;
                case 2:
                    hubRideTimeParam = hubRideTimeParam2;
                    str4 = str6;
                    str3 = str5;
                    str10 = (String) b.s(serialDescriptor, 2, auu0.a, str10);
                    i |= 4;
                    str5 = str3;
                    str6 = str4;
                    hubRideTimeParam2 = hubRideTimeParam;
                case 3:
                    hubRideTimeParam = hubRideTimeParam2;
                    str4 = str6;
                    str5 = (String) b.s(serialDescriptor, 3, auu0.a, str5);
                    i |= 8;
                    str6 = str4;
                    hubRideTimeParam2 = hubRideTimeParam;
                case 4:
                    hubRideTimeParam = hubRideTimeParam2;
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    str5 = str5;
                    hubRideTimeParam2 = hubRideTimeParam;
                case 5:
                    str = str5;
                    str2 = str6;
                    str7 = (String) b.s(serialDescriptor, 5, auu0.a, str7);
                    i |= 32;
                    str5 = str;
                    str6 = str2;
                case 6:
                    str = str5;
                    str2 = str6;
                    bool2 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool2);
                    i |= 64;
                    str5 = str;
                    str6 = str2;
                case 7:
                    str = str5;
                    str2 = str6;
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    str5 = str;
                    str6 = str2;
                case 8:
                    str = str5;
                    str2 = str6;
                    hubPricesParam = (HubPricesParam) b.s(serialDescriptor, 8, HubPricesParam$$serializer.INSTANCE, hubPricesParam);
                    i |= 256;
                    str5 = str;
                    str6 = str2;
                case 9:
                    str = str5;
                    str2 = str6;
                    hubTariffUnavailableParam = (HubTariffUnavailableParam) b.s(serialDescriptor, 9, HubTariffUnavailableParam$$serializer.INSTANCE, hubTariffUnavailableParam);
                    i |= 512;
                    str5 = str;
                    str6 = str2;
                case 10:
                    str = str5;
                    str2 = str6;
                    list = (List) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    str5 = str;
                    str6 = str2;
                case 11:
                    str = str5;
                    str2 = str6;
                    hubRideTimeParam2 = (HubRideTimeParam) b.s(serialDescriptor, 11, HubRideTimeParam$$serializer.INSTANCE, hubRideTimeParam2);
                    i |= 2048;
                    str5 = str;
                    str6 = str2;
                case 12:
                    str = str5;
                    str2 = str6;
                    hubEstimatedWaitingParamV2 = (HubEstimatedWaitingParamV2) b.s(serialDescriptor, 12, HubEstimatedWaitingParamV2$$serializer.INSTANCE, hubEstimatedWaitingParamV2);
                    i |= 4096;
                    str5 = str;
                    str6 = str2;
                case 13:
                    str = str5;
                    str2 = str6;
                    hubPaidOptionsParam = (HubPaidOptionsParam) b.A(serialDescriptor, 13, HubPaidOptionsParam$$serializer.INSTANCE, hubPaidOptionsParam);
                    i |= 8192;
                    str5 = str;
                    str6 = str2;
                case 14:
                    str = str5;
                    str2 = str6;
                    hubSummaryStyleParam = (HubSummaryStyleParam) b.A(serialDescriptor, 14, HubSummaryStyleParam$$serializer.INSTANCE, hubSummaryStyleParam);
                    i |= 16384;
                    str5 = str;
                    str6 = str2;
                case 15:
                    str = str5;
                    str2 = str6;
                    bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 15, rcx.a, bVar);
                    i |= 32768;
                    str5 = str;
                    str6 = str2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        String str11 = str5;
        String str12 = str6;
        String str13 = str9;
        String str14 = str10;
        b.c(serialDescriptor);
        return new HubServiceLevelParamV2(i, str8, str13, str14, str11, str12, str7, bool2, bool, hubPricesParam, hubTariffUnavailableParam, list, hubRideTimeParam2, hubEstimatedWaitingParamV2, hubPaidOptionsParam, hubSummaryStyleParam, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubServiceLevelParamV2 value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubServiceLevelParamV2.q;
        String str = value.a;
        kotlinx.serialization.json.b bVar = value.p;
        b.o(serialDescriptor, 0, str);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, value.b);
        b.g(serialDescriptor, 2, auu0Var, value.c);
        b.g(serialDescriptor, 3, auu0Var, value.d);
        b.g(serialDescriptor, 4, auu0Var, value.e);
        b.g(serialDescriptor, 5, auu0Var, value.f);
        z96 z96Var = z96.a;
        b.g(serialDescriptor, 6, z96Var, value.g);
        b.g(serialDescriptor, 7, z96Var, value.h);
        b.g(serialDescriptor, 8, HubPricesParam$$serializer.INSTANCE, value.i);
        b.g(serialDescriptor, 9, HubTariffUnavailableParam$$serializer.INSTANCE, value.j);
        b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        b.g(serialDescriptor, 11, HubRideTimeParam$$serializer.INSTANCE, value.l);
        b.g(serialDescriptor, 12, HubEstimatedWaitingParamV2$$serializer.INSTANCE, value.m);
        b.e(serialDescriptor, 13, HubPaidOptionsParam$$serializer.INSTANCE, value.n);
        b.e(serialDescriptor, 14, HubSummaryStyleParam$$serializer.INSTANCE, value.o);
        if (b.F() || bVar != null) {
            b.g(serialDescriptor, 15, rcx.a, bVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
