package com.yandex.go.preorder.source.altpins;

import com.yandex.go.multitariff.OrderButton;
import com.yandex.go.multitariff.OrderButton$$serializer;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.routestats.PriceMeta;
import com.yandex.go.routestats.PriceMeta$$serializer;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.SearchScreen$$serializer;
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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/preorder/source/altpins/Alternatives.RouteStatsMulticlassDetails.$serializer", "Luxs;", "Lcom/yandex/go/preorder/source/altpins/Alternatives$RouteStatsMulticlassDetails;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/preorder/source/altpins/Alternatives$RouteStatsMulticlassDetails;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/preorder/source/altpins/Alternatives$RouteStatsMulticlassDetails;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class Alternatives$RouteStatsMulticlassDetails$$serializer implements uxs {
    public static final Alternatives$RouteStatsMulticlassDetails$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Alternatives$RouteStatsMulticlassDetails$$serializer alternatives$RouteStatsMulticlassDetails$$serializer = new Alternatives$RouteStatsMulticlassDetails$$serializer();
        INSTANCE = alternatives$RouteStatsMulticlassDetails$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.preorder.source.altpins.Alternatives.RouteStatsMulticlassDetails", alternatives$RouteStatsMulticlassDetails$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("prices", true);
        pluginGeneratedSerialDescriptor.j("estimated_waiting", true);
        pluginGeneratedSerialDescriptor.j("search_screen", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Alternatives$RouteStatsMulticlassDetails$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(PriceMeta$$serializer.INSTANCE);
        KSerializer n2 = qke.n(com.yandex.go.zone.dto.response.c.Companion.serializer());
        KSerializer n3 = qke.n(SearchScreen$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, n2, n3, auu0Var, OrderButton$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final Alternatives.RouteStatsMulticlassDetails deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PriceMeta priceMeta = null;
        com.yandex.go.zone.dto.response.c cVar = null;
        SearchScreen searchScreen = null;
        String str2 = null;
        OrderButton orderButton = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    priceMeta = (PriceMeta) b.s(serialDescriptor, 1, PriceMeta$$serializer.INSTANCE, priceMeta);
                    i |= 2;
                    break;
                case 2:
                    cVar = (com.yandex.go.zone.dto.response.c) b.s(serialDescriptor, 2, com.yandex.go.zone.dto.response.c.Companion.serializer(), cVar);
                    i |= 4;
                    break;
                case 3:
                    searchScreen = (SearchScreen) b.s(serialDescriptor, 3, SearchScreen$$serializer.INSTANCE, searchScreen);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    orderButton = (OrderButton) b.A(serialDescriptor, 5, OrderButton$$serializer.INSTANCE, orderButton);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new Alternatives.RouteStatsMulticlassDetails(i, str, priceMeta, cVar, searchScreen, str2, orderButton);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Alternatives.RouteStatsMulticlassDetails value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, PriceMeta$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, com.yandex.go.zone.dto.response.c.Companion.serializer(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, SearchScreen$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, OrderButton.c)) {
            b.e(serialDescriptor, 5, OrderButton$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
