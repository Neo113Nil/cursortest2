package com.yandex.go.chargers.subscription.data.model;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/subscription/data/model/ChargersPlusOfferParametersDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/subscription/data/model/ChargersPlusOfferParametersDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/subscription/data/model/ChargersPlusOfferParametersDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/subscription/data/model/ChargersPlusOfferParametersDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersPlusOfferParametersDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersPlusOfferParametersDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersPlusOfferParametersDto$$serializer chargersPlusOfferParametersDto$$serializer = new ChargersPlusOfferParametersDto$$serializer();
        INSTANCE = chargersPlusOfferParametersDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.subscription.data.model.ChargersPlusOfferParametersDto", chargersPlusOfferParametersDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("service_name", true);
        pluginGeneratedSerialDescriptor.j("product_target", true);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("analytics_params", true);
        pluginGeneratedSerialDescriptor.j("service_channel", true);
        pluginGeneratedSerialDescriptor.j("offline_mode_enabled", true);
        pluginGeneratedSerialDescriptor.j("filters", true);
        pluginGeneratedSerialDescriptor.j("loaded_offers_filters", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersPlusOfferParametersDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, qke.n(ChargersPlusAnalyticsParams$$serializer.INSTANCE), qke.n(auu0Var), z96.a, qke.n(ChargersPlusFilters$$serializer.INSTANCE), qke.n(ChargersPlusLoadedFilters$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ChargersPlusOfferParametersDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ChargersPlusOfferParametersDto chargersPlusOfferParametersDto = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ChargersPlusAnalyticsParams chargersPlusAnalyticsParams = null;
        String str4 = null;
        ChargersPlusFilters chargersPlusFilters = null;
        ChargersPlusLoadedFilters chargersPlusLoadedFilters = null;
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
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    chargersPlusAnalyticsParams = (ChargersPlusAnalyticsParams) b.s(serialDescriptor, 3, ChargersPlusAnalyticsParams$$serializer.INSTANCE, chargersPlusAnalyticsParams);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    chargersPlusFilters = (ChargersPlusFilters) b.s(serialDescriptor, 6, ChargersPlusFilters$$serializer.INSTANCE, chargersPlusFilters);
                    i |= 64;
                    break;
                case 7:
                    chargersPlusLoadedFilters = (ChargersPlusLoadedFilters) b.s(serialDescriptor, 7, ChargersPlusLoadedFilters$$serializer.INSTANCE, chargersPlusLoadedFilters);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return chargersPlusOfferParametersDto;
            }
            chargersPlusOfferParametersDto = null;
        }
        b.c(serialDescriptor);
        return new ChargersPlusOfferParametersDto(i, str, str2, str3, chargersPlusAnalyticsParams, str4, z2, chargersPlusFilters, chargersPlusLoadedFilters);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersPlusOfferParametersDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ChargersPlusAnalyticsParams$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ChargersPlusFilters$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, ChargersPlusLoadedFilters$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
