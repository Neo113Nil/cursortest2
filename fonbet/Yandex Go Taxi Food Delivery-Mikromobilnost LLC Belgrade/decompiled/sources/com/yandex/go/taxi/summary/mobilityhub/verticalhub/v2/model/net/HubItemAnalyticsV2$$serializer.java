package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.auu0;
import defpackage.e6m;
import defpackage.h6w;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemAnalyticsV2.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemAnalyticsV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemAnalyticsV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemAnalyticsV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubItemAnalyticsV2$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubItemAnalyticsV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubItemAnalyticsV2$$serializer hubItemAnalyticsV2$$serializer = new HubItemAnalyticsV2$$serializer();
        INSTANCE = hubItemAnalyticsV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemAnalyticsV2", hubItemAnalyticsV2$$serializer, 13);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("route_duration_min", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("offer_id", true);
        pluginGeneratedSerialDescriptor.j("eta", true);
        pluginGeneratedSerialDescriptor.j("section_id", true);
        pluginGeneratedSerialDescriptor.j("walking_time_min", true);
        pluginGeneratedSerialDescriptor.j("item_id", true);
        pluginGeneratedSerialDescriptor.j("id_hint", true);
        pluginGeneratedSerialDescriptor.j("presentation", true);
        pluginGeneratedSerialDescriptor.j("transfers", true);
        pluginGeneratedSerialDescriptor.j("multimodal_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubItemAnalyticsV2$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = HubItemAnalyticsV2.n;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, h6wVar, qke.n(e6m.a), qke.n(auu0Var), auu0Var, qke.n(h6wVar), qke.n(auu0Var), qke.n(h6wVar), qke.n(auu0Var), qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[10].getValue()), qke.n(h6wVar), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final HubItemAnalyticsV2 deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubItemAnalyticsV2.n;
        b.getClass();
        Integer num = null;
        PresentationTypeDto presentationTypeDto = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num2 = null;
        int i2 = 0;
        String str6 = null;
        int i3 = 0;
        Double d = null;
        String str7 = null;
        String str8 = null;
        Integer num3 = null;
        String str9 = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i = i3;
                    z = false;
                    i3 = i;
                case 0:
                    i = i3;
                    i2 |= 1;
                    str6 = b.k(serialDescriptor, 0);
                    i3 = i;
                case 1:
                    str2 = str6;
                    i3 = b.h(serialDescriptor, 1);
                    i2 |= 2;
                    str6 = str2;
                case 2:
                    str = str6;
                    i = i3;
                    d = (Double) b.s(serialDescriptor, 2, e6m.a, d);
                    i2 |= 4;
                    str6 = str;
                    i3 = i;
                case 3:
                    str = str6;
                    i = i3;
                    str7 = (String) b.s(serialDescriptor, 3, auu0.a, str7);
                    i2 |= 8;
                    str6 = str;
                    i3 = i;
                case 4:
                    str2 = str6;
                    str8 = b.k(serialDescriptor, 4);
                    i2 |= 16;
                    str6 = str2;
                case 5:
                    str = str6;
                    i = i3;
                    num3 = (Integer) b.s(serialDescriptor, 5, h6w.a, num3);
                    i2 |= 32;
                    str6 = str;
                    i3 = i;
                case 6:
                    str = str6;
                    i = i3;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i2 |= 64;
                    str6 = str;
                    i3 = i;
                case 7:
                    str = str6;
                    i = i3;
                    num2 = (Integer) b.s(serialDescriptor, 7, h6w.a, num2);
                    i2 |= 128;
                    str6 = str;
                    i3 = i;
                case 8:
                    str = str6;
                    i = i3;
                    str4 = (String) b.s(serialDescriptor, 8, auu0.a, str4);
                    i2 |= 256;
                    str6 = str;
                    i3 = i;
                case 9:
                    str = str6;
                    i = i3;
                    str3 = (String) b.s(serialDescriptor, 9, auu0.a, str3);
                    i2 |= 512;
                    str6 = str;
                    i3 = i;
                case 10:
                    str = str6;
                    i = i3;
                    presentationTypeDto = (PresentationTypeDto) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), presentationTypeDto);
                    i2 |= 1024;
                    str6 = str;
                    i3 = i;
                case 11:
                    str = str6;
                    i = i3;
                    num = (Integer) b.s(serialDescriptor, 11, h6w.a, num);
                    i2 |= 2048;
                    str6 = str;
                    i3 = i;
                case 12:
                    str = str6;
                    i = i3;
                    str5 = (String) b.s(serialDescriptor, 12, auu0.a, str5);
                    i2 |= 4096;
                    str6 = str;
                    i3 = i;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new HubItemAnalyticsV2(i2, str6, i3, d, str7, str8, num3, str9, num2, str4, str3, presentationTypeDto, num, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubItemAnalyticsV2 value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = HubItemAnalyticsV2.n;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != 0) {
            b.A(1, value.b, serialDescriptor);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, e6m.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, h6w.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, h6w.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        }
        if (b.F() || value.l != null) {
            b.g(serialDescriptor, 11, h6w.a, value.l);
        }
        if (b.F() || value.m != null) {
            b.g(serialDescriptor, 12, auu0.a, value.m);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
