package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

import defpackage.auu0;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubDriveOfferParam.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubDriveOfferParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubDriveOfferParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubDriveOfferParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubDriveOfferParam$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubDriveOfferParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubDriveOfferParam$$serializer hubDriveOfferParam$$serializer = new HubDriveOfferParam$$serializer();
        INSTANCE = hubDriveOfferParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubDriveOfferParam", hubDriveOfferParam$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("class", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("offer_id", false);
        pluginGeneratedSerialDescriptor.j("selector_icon_tag", false);
        pluginGeneratedSerialDescriptor.j("ride_time", false);
        pluginGeneratedSerialDescriptor.j("estimated_waiting", false);
        pluginGeneratedSerialDescriptor.j("description_parts", false);
        pluginGeneratedSerialDescriptor.j("original_price", false);
        pluginGeneratedSerialDescriptor.j("max_price_as_decimal", false);
        pluginGeneratedSerialDescriptor.j("prices", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubDriveOfferParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(HubRideTimeParam$$serializer.INSTANCE), qke.n(HubEstimatedWaitingParam$$serializer.INSTANCE), qke.n(HubDescriptionsPartsParam$$serializer.INSTANCE), qke.n(auu0Var), qke.n(auu0Var), qke.n(HubPricesParam$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final HubDriveOfferParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        HubPricesParam hubPricesParam = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        HubRideTimeParam hubRideTimeParam = null;
        HubEstimatedWaitingParam hubEstimatedWaitingParam = null;
        HubDescriptionsPartsParam hubDescriptionsPartsParam = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) b.s(serialDescriptor, 1, auu0.a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) b.s(serialDescriptor, 2, auu0.a, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) b.s(serialDescriptor, 3, auu0.a, str5);
                    i |= 8;
                    break;
                case 4:
                    hubRideTimeParam = (HubRideTimeParam) b.s(serialDescriptor, 4, HubRideTimeParam$$serializer.INSTANCE, hubRideTimeParam);
                    i |= 16;
                    break;
                case 5:
                    hubEstimatedWaitingParam = (HubEstimatedWaitingParam) b.s(serialDescriptor, 5, HubEstimatedWaitingParam$$serializer.INSTANCE, hubEstimatedWaitingParam);
                    i |= 32;
                    break;
                case 6:
                    hubDescriptionsPartsParam = (HubDescriptionsPartsParam) b.s(serialDescriptor, 6, HubDescriptionsPartsParam$$serializer.INSTANCE, hubDescriptionsPartsParam);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) b.s(serialDescriptor, 7, auu0.a, str6);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                case 9:
                    hubPricesParam = (HubPricesParam) b.s(serialDescriptor, 9, HubPricesParam$$serializer.INSTANCE, hubPricesParam);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new HubDriveOfferParam(i, str2, str3, str4, str5, hubRideTimeParam, hubEstimatedWaitingParam, hubDescriptionsPartsParam, str6, str, hubPricesParam);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubDriveOfferParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.o(serialDescriptor, 0, value.a);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, value.b);
        b.g(serialDescriptor, 2, auu0Var, value.c);
        b.g(serialDescriptor, 3, auu0Var, value.d);
        b.g(serialDescriptor, 4, HubRideTimeParam$$serializer.INSTANCE, value.e);
        b.g(serialDescriptor, 5, HubEstimatedWaitingParam$$serializer.INSTANCE, value.f);
        b.g(serialDescriptor, 6, HubDescriptionsPartsParam$$serializer.INSTANCE, value.g);
        b.g(serialDescriptor, 7, auu0Var, value.h);
        b.g(serialDescriptor, 8, auu0Var, value.i);
        b.g(serialDescriptor, 9, HubPricesParam$$serializer.INSTANCE, value.j);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
