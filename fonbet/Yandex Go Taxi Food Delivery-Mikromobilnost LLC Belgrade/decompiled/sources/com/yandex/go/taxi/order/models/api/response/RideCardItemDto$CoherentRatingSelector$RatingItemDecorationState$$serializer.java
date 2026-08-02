package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$CoherentRatingSelector;
import defpackage.auu0;
import defpackage.c7v;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.n7v;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto.CoherentRatingSelector.RatingItemDecorationState.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer implements uxs {
    public static final RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer rideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer = new RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer();
        INSTANCE = rideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.CoherentRatingSelector.RatingItemDecorationState", rideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("main_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RideCardItemDto$CoherentRatingSelector$RatingItemDecorationState$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState.d[0].getValue(), c7v.a, qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        RideCardItemDto$CoherentRatingSelector.DecorationStateType decorationStateType = null;
        n7v n7vVar = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                decorationStateType = (RideCardItemDto$CoherentRatingSelector.DecorationStateType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), decorationStateType);
                i |= 1;
            } else if (v == 1) {
                n7vVar = (n7v) b.A(serialDescriptor, 1, c7v.a, n7vVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState(i, decorationStateType, n7vVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = RideCardItemDto$CoherentRatingSelector.RatingItemDecorationState.d;
        if (b.F() || value.a != RideCardItemDto$CoherentRatingSelector.DecorationStateType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, n7v.f)) {
            b.e(serialDescriptor, 1, c7v.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
