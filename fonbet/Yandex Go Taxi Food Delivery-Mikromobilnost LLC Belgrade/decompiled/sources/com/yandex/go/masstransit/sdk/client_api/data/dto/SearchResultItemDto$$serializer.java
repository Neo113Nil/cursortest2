package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.auu0;
import defpackage.hwp0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.ttp0;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultItemDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultItemDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultItemDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/client_api/data/dto/SearchResultItemDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class SearchResultItemDto$$serializer implements uxs {
    public static final SearchResultItemDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchResultItemDto$$serializer searchResultItemDto$$serializer = new SearchResultItemDto$$serializer();
        INSTANCE = searchResultItemDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultItemDto", searchResultItemDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("list_item", false);
        pluginGeneratedSerialDescriptor.j("ticketing_system_context", false);
        pluginGeneratedSerialDescriptor.j("search_data", false);
        pluginGeneratedSerialDescriptor.j("deduplication_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchResultItemDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{hwp0.e, SearchResultItemDto.e[1].getValue(), ttp0.e, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final SearchResultItemDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SearchResultItemDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        h0 h0Var = null;
        Map map = null;
        a0 a0Var = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                h0Var = (h0) b.A(serialDescriptor, 0, hwp0.e, h0Var);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                a0Var = (a0) b.A(serialDescriptor, 2, ttp0.e, a0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SearchResultItemDto(i, h0Var, map, a0Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SearchResultItemDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SearchResultItemDto.e;
        hwp0 hwp0Var = hwp0.e;
        h0 h0Var = value.a;
        String str = value.d;
        b.e(serialDescriptor, 0, hwp0Var, h0Var);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        b.e(serialDescriptor, 2, ttp0.e, value.c);
        if (b.F() || str != null) {
            b.g(serialDescriptor, 3, auu0.a, str);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
