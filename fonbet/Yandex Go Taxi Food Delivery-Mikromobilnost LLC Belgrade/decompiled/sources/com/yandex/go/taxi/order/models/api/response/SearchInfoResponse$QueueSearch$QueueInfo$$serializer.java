package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.zone.dto.objects.QueueScreen;
import com.yandex.go.zone.dto.objects.QueueScreen$$serializer;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/SearchInfoResponse.QueueSearch.QueueInfo.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$QueueSearch$QueueInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$QueueSearch$QueueInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/SearchInfoResponse$QueueSearch$QueueInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class SearchInfoResponse$QueueSearch$QueueInfo$$serializer implements uxs {
    public static final SearchInfoResponse$QueueSearch$QueueInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchInfoResponse$QueueSearch$QueueInfo$$serializer searchInfoResponse$QueueSearch$QueueInfo$$serializer = new SearchInfoResponse$QueueSearch$QueueInfo$$serializer();
        INSTANCE = searchInfoResponse$QueueSearch$QueueInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.SearchInfoResponse.QueueSearch.QueueInfo", searchInfoResponse$QueueSearch$QueueInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("main_screen", true);
        pluginGeneratedSerialDescriptor.j("confirm_screen", true);
        pluginGeneratedSerialDescriptor.j("update_screen", true);
        pluginGeneratedSerialDescriptor.j("confirm_error_screen", true);
        pluginGeneratedSerialDescriptor.j("price_changed_notification", true);
        pluginGeneratedSerialDescriptor.j("price_change", true);
        pluginGeneratedSerialDescriptor.j("version", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SearchInfoResponse$QueueSearch$QueueInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        QueueScreen$$serializer queueScreen$$serializer = QueueScreen$$serializer.INSTANCE;
        return new KSerializer[]{queueScreen$$serializer, queueScreen$$serializer, queueScreen$$serializer, queueScreen$$serializer, SearchInfoResponse$QueueSearch$QueueInfo$QueueNotification$$serializer.INSTANCE, auu0.a, h6w.a};
    }

    @Override // defpackage.myi
    public final SearchInfoResponse$QueueSearch.QueueInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        QueueScreen queueScreen = null;
        QueueScreen queueScreen2 = null;
        QueueScreen queueScreen3 = null;
        QueueScreen queueScreen4 = null;
        SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification queueNotification = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    queueScreen = (QueueScreen) b.A(serialDescriptor, 0, QueueScreen$$serializer.INSTANCE, queueScreen);
                    i |= 1;
                    break;
                case 1:
                    queueScreen2 = (QueueScreen) b.A(serialDescriptor, 1, QueueScreen$$serializer.INSTANCE, queueScreen2);
                    i |= 2;
                    break;
                case 2:
                    queueScreen3 = (QueueScreen) b.A(serialDescriptor, 2, QueueScreen$$serializer.INSTANCE, queueScreen3);
                    i |= 4;
                    break;
                case 3:
                    queueScreen4 = (QueueScreen) b.A(serialDescriptor, 3, QueueScreen$$serializer.INSTANCE, queueScreen4);
                    i |= 8;
                    break;
                case 4:
                    queueNotification = (SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification) b.A(serialDescriptor, 4, SearchInfoResponse$QueueSearch$QueueInfo$QueueNotification$$serializer.INSTANCE, queueNotification);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i2 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SearchInfoResponse$QueueSearch.QueueInfo(i, queueScreen, queueScreen2, queueScreen3, queueScreen4, queueNotification, str, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SearchInfoResponse$QueueSearch.QueueInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        k7 k7Var = SearchInfoResponse$QueueSearch.QueueInfo.Companion;
        if (b.F() || !jl40.l(value.a, QueueScreen.g)) {
            b.e(serialDescriptor, 0, QueueScreen$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, QueueScreen.g)) {
            b.e(serialDescriptor, 1, QueueScreen$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, QueueScreen.g)) {
            b.e(serialDescriptor, 2, QueueScreen$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, QueueScreen.g)) {
            b.e(serialDescriptor, 3, QueueScreen$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification(0))) {
            b.e(serialDescriptor, 4, SearchInfoResponse$QueueSearch$QueueInfo$QueueNotification$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g != 0) {
            b.A(6, value.g, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
