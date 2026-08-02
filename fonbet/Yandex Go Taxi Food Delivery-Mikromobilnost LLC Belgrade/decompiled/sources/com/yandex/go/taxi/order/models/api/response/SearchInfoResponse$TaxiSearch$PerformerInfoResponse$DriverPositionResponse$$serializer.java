package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import defpackage.auu0;
import defpackage.e6m;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse.TaxiSearch.PerformerInfoResponse.DriverPositionResponse.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer implements uxs {
    public static final SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer searchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer = new SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer();
        INSTANCE = searchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.SearchInfoResponse.TaxiSearch.PerformerInfoResponse.DriverPositionResponse", searchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("lon", true);
        pluginGeneratedSerialDescriptor.j("lat", true);
        pluginGeneratedSerialDescriptor.j("direction", true);
        pluginGeneratedSerialDescriptor.j("speed", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.TIMESTAMP, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(e6mVar), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final SearchInfoResponse$TaxiSearch.PerformerInfoResponse.DriverPositionResponse deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = (Double) b.s(serialDescriptor, 0, e6m.a, d);
                i |= 1;
            } else if (v == 1) {
                d2 = (Double) b.s(serialDescriptor, 1, e6m.a, d2);
                i |= 2;
            } else if (v == 2) {
                d3 = (Double) b.s(serialDescriptor, 2, e6m.a, d3);
                i |= 4;
            } else if (v == 3) {
                d4 = (Double) b.s(serialDescriptor, 3, e6m.a, d4);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new SearchInfoResponse$TaxiSearch.PerformerInfoResponse.DriverPositionResponse(i, d, d2, d3, d4, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SearchInfoResponse$TaxiSearch.PerformerInfoResponse.DriverPositionResponse value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, e6m.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, e6m.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, e6m.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, e6m.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
