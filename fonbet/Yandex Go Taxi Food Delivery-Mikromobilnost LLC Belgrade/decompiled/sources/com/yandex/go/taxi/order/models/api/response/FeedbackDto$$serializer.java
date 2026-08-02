package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices$$serializer;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
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
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/FeedbackDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/FeedbackDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/FeedbackDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/FeedbackDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class FeedbackDto$$serializer implements uxs {
    public static final FeedbackDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FeedbackDto$$serializer feedbackDto$$serializer = new FeedbackDto$$serializer();
        INSTANCE = feedbackDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.FeedbackDto", feedbackDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("msg", true);
        pluginGeneratedSerialDescriptor.j("choices", true);
        pluginGeneratedSerialDescriptor.j("rating_display_policy", true);
        pluginGeneratedSerialDescriptor.j("flow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeedbackDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(h6w.a), qke.n(auu0.a), qke.n(FeedbackChoices$$serializer.INSTANCE), qke.n(RatingDisplayPolicy$$serializer.INSTANCE), FeedbackDto.f[4].getValue()};
    }

    @Override // defpackage.myi
    public final FeedbackDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackDto.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        FeedbackChoices feedbackChoices = null;
        RatingDisplayPolicy ratingDisplayPolicy = null;
        TaxiOrderFeedbackFlow taxiOrderFeedbackFlow = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                feedbackChoices = (FeedbackChoices) b.s(serialDescriptor, 2, FeedbackChoices$$serializer.INSTANCE, feedbackChoices);
                i |= 4;
            } else if (v == 3) {
                ratingDisplayPolicy = (RatingDisplayPolicy) b.s(serialDescriptor, 3, RatingDisplayPolicy$$serializer.INSTANCE, ratingDisplayPolicy);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                taxiOrderFeedbackFlow = (TaxiOrderFeedbackFlow) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), taxiOrderFeedbackFlow);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new FeedbackDto(i, num, str, feedbackChoices, ratingDisplayPolicy, taxiOrderFeedbackFlow);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FeedbackDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackDto.f;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, h6w.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, FeedbackChoices$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, RatingDisplayPolicy$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != TaxiOrderFeedbackFlow.FORCE_SCREEN) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
