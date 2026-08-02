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
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubServiceLevelParam.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubServiceLevelParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubServiceLevelParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubServiceLevelParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubServiceLevelParam$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubServiceLevelParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubServiceLevelParam$$serializer hubServiceLevelParam$$serializer = new HubServiceLevelParam$$serializer();
        INSTANCE = hubServiceLevelParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubServiceLevelParam", hubServiceLevelParam$$serializer, 15);
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
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubServiceLevelParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = HubServiceLevelParam.p;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        KSerializer n5 = qke.n(auu0Var);
        KSerializer n6 = qke.n(HubPricesParam$$serializer.INSTANCE);
        KSerializer n7 = qke.n(HubTariffUnavailableParam$$serializer.INSTANCE);
        KSerializer n8 = qke.n((KSerializer) i3yVarArr[10].getValue());
        KSerializer n9 = qke.n(HubRideTimeParam$$serializer.INSTANCE);
        KSerializer n10 = qke.n(HubEstimatedWaitingParam$$serializer.INSTANCE);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, n, n2, n3, n4, n5, z96Var, z96Var, n6, n7, n8, n9, n10, HubPaidOptionsParam$$serializer.INSTANCE, HubSummaryStyleParam$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final HubServiceLevelParam deserialize(Decoder decoder) {
        String str;
        boolean z;
        HubEstimatedWaitingParam hubEstimatedWaitingParam;
        boolean z2;
        String str2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubServiceLevelParam.p;
        b.getClass();
        HubEstimatedWaitingParam hubEstimatedWaitingParam2 = null;
        HubRideTimeParam hubRideTimeParam = null;
        List list = null;
        HubTariffUnavailableParam hubTariffUnavailableParam = null;
        HubPaidOptionsParam hubPaidOptionsParam = null;
        HubPricesParam hubPricesParam = null;
        int i = 0;
        HubSummaryStyleParam hubSummaryStyleParam = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = true;
        String str8 = null;
        while (z5) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    hubEstimatedWaitingParam = hubEstimatedWaitingParam2;
                    z2 = z3;
                    str2 = str3;
                    z5 = false;
                    str3 = str2;
                    hubEstimatedWaitingParam2 = hubEstimatedWaitingParam;
                    z3 = z2;
                case 0:
                    hubEstimatedWaitingParam = hubEstimatedWaitingParam2;
                    z2 = z3;
                    str2 = str3;
                    str8 = b.k(serialDescriptor, 0);
                    i |= 1;
                    str3 = str2;
                    hubEstimatedWaitingParam2 = hubEstimatedWaitingParam;
                    z3 = z2;
                case 1:
                    z2 = z3;
                    hubEstimatedWaitingParam = hubEstimatedWaitingParam2;
                    str3 = (String) b.s(serialDescriptor, 1, auu0.a, str3);
                    i |= 2;
                    hubEstimatedWaitingParam2 = hubEstimatedWaitingParam;
                    z3 = z2;
                case 2:
                    str = str3;
                    z = z3;
                    str4 = (String) b.s(serialDescriptor, 2, auu0.a, str4);
                    i |= 4;
                    z3 = z;
                    str3 = str;
                case 3:
                    str = str3;
                    z = z3;
                    str5 = (String) b.s(serialDescriptor, 3, auu0.a, str5);
                    i |= 8;
                    z3 = z;
                    str3 = str;
                case 4:
                    str = str3;
                    z = z3;
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    z3 = z;
                    str3 = str;
                case 5:
                    str = str3;
                    z = z3;
                    str7 = (String) b.s(serialDescriptor, 5, auu0.a, str7);
                    i |= 32;
                    z3 = z;
                    str3 = str;
                case 6:
                    str = str3;
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    str3 = str;
                case 7:
                    str = str3;
                    z4 = b.C(serialDescriptor, 7);
                    i |= 128;
                    str3 = str;
                case 8:
                    str = str3;
                    z = z3;
                    hubPricesParam = (HubPricesParam) b.s(serialDescriptor, 8, HubPricesParam$$serializer.INSTANCE, hubPricesParam);
                    i |= 256;
                    z3 = z;
                    str3 = str;
                case 9:
                    str = str3;
                    z = z3;
                    hubTariffUnavailableParam = (HubTariffUnavailableParam) b.s(serialDescriptor, 9, HubTariffUnavailableParam$$serializer.INSTANCE, hubTariffUnavailableParam);
                    i |= 512;
                    z3 = z;
                    str3 = str;
                case 10:
                    str = str3;
                    z = z3;
                    list = (List) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    z3 = z;
                    str3 = str;
                case 11:
                    str = str3;
                    z = z3;
                    hubRideTimeParam = (HubRideTimeParam) b.s(serialDescriptor, 11, HubRideTimeParam$$serializer.INSTANCE, hubRideTimeParam);
                    i |= 2048;
                    z3 = z;
                    str3 = str;
                case 12:
                    str = str3;
                    z = z3;
                    hubEstimatedWaitingParam2 = (HubEstimatedWaitingParam) b.s(serialDescriptor, 12, HubEstimatedWaitingParam$$serializer.INSTANCE, hubEstimatedWaitingParam2);
                    i |= 4096;
                    z3 = z;
                    str3 = str;
                case 13:
                    str = str3;
                    z = z3;
                    hubPaidOptionsParam = (HubPaidOptionsParam) b.A(serialDescriptor, 13, HubPaidOptionsParam$$serializer.INSTANCE, hubPaidOptionsParam);
                    i |= 8192;
                    z3 = z;
                    str3 = str;
                case 14:
                    z = z3;
                    str = str3;
                    hubSummaryStyleParam = (HubSummaryStyleParam) b.A(serialDescriptor, 14, HubSummaryStyleParam$$serializer.INSTANCE, hubSummaryStyleParam);
                    i |= 16384;
                    z3 = z;
                    str3 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        boolean z6 = z3;
        String str9 = str3;
        b.c(serialDescriptor);
        return new HubServiceLevelParam(i, str8, str9, str4, str5, str6, str7, z6, z4, hubPricesParam, hubTariffUnavailableParam, list, hubRideTimeParam, hubEstimatedWaitingParam2, hubPaidOptionsParam, hubSummaryStyleParam);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubServiceLevelParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubServiceLevelParam.p;
        b.o(serialDescriptor, 0, value.a);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, value.b);
        b.g(serialDescriptor, 2, auu0Var, value.c);
        b.g(serialDescriptor, 3, auu0Var, value.d);
        b.g(serialDescriptor, 4, auu0Var, value.e);
        b.g(serialDescriptor, 5, auu0Var, value.f);
        b.n(serialDescriptor, 6, value.g);
        b.n(serialDescriptor, 7, value.h);
        b.g(serialDescriptor, 8, HubPricesParam$$serializer.INSTANCE, value.i);
        b.g(serialDescriptor, 9, HubTariffUnavailableParam$$serializer.INSTANCE, value.j);
        b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        b.g(serialDescriptor, 11, HubRideTimeParam$$serializer.INSTANCE, value.l);
        b.g(serialDescriptor, 12, HubEstimatedWaitingParam$$serializer.INSTANCE, value.m);
        b.e(serialDescriptor, 13, HubPaidOptionsParam$$serializer.INSTANCE, value.n);
        b.e(serialDescriptor, 14, HubSummaryStyleParam$$serializer.INSTANCE, value.o);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
