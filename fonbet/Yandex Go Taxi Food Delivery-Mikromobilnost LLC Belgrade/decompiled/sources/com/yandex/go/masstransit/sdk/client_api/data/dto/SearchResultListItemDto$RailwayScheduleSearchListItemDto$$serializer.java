package com.yandex.go.masstransit.sdk.client_api.data.dto;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto$$serializer;
import defpackage.auu0;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultListItemDto.RailwayScheduleSearchListItemDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultListItemDto$RailwayScheduleSearchListItemDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultListItemDto$RailwayScheduleSearchListItemDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultListItemDto$RailwayScheduleSearchListItemDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class SearchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer implements uxs {
    public static final SearchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer searchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer = new SearchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer();
        INSTANCE = searchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultListItemDto.RailwayScheduleSearchListItemDto", searchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("departure_time", true);
        pluginGeneratedSerialDescriptor.j("departure_detail", true);
        pluginGeneratedSerialDescriptor.j("arrival_time", true);
        pluginGeneratedSerialDescriptor.j("arrival_detail", true);
        pluginGeneratedSerialDescriptor.j("duration_text", true);
        pluginGeneratedSerialDescriptor.j("service_title", false);
        pluginGeneratedSerialDescriptor.j("route_description", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchResultListItemDto$RailwayScheduleSearchListItemDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(CurrencyRulesDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final SearchResultListItemDto$RailwayScheduleSearchListItemDto deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        CurrencyRulesDto currencyRulesDto = null;
        String str = null;
        boolean z2 = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    str3 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 1, auu0.a, str4);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 2, auu0.a, str5);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    str7 = (String) b.s(serialDescriptor, 4, auu0.a, str7);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    str8 = (String) b.s(serialDescriptor, 5, auu0.a, str8);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    str9 = (String) b.s(serialDescriptor, 6, auu0.a, str9);
                    i |= 64;
                    break;
                case 7:
                    str10 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    currencyRulesDto = (CurrencyRulesDto) b.s(serialDescriptor, 10, CurrencyRulesDto$$serializer.INSTANCE, currencyRulesDto);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new SearchResultListItemDto$RailwayScheduleSearchListItemDto(i, str3, str4, str5, str6, str7, str8, str9, str10, str2, str, currencyRulesDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SearchResultListItemDto$RailwayScheduleSearchListItemDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "railway_schedule")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        String str = value.h;
        CurrencyRulesDto currencyRulesDto = value.k;
        String str2 = value.j;
        String str3 = value.i;
        b.o(serialDescriptor, 7, str);
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 8, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 9, auu0.a, str2);
        }
        if (b.F() || currencyRulesDto != null) {
            b.g(serialDescriptor, 10, CurrencyRulesDto$$serializer.INSTANCE, currencyRulesDto);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
