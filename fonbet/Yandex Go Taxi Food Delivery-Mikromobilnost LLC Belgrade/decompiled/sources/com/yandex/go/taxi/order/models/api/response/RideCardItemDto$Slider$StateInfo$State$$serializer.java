package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Slider;
import defpackage.c7v;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/RideCardItemDto.Slider.StateInfo.State.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider$StateInfo$State;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider$StateInfo$State;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/RideCardItemDto$Slider$StateInfo$State;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class RideCardItemDto$Slider$StateInfo$State$$serializer implements uxs {
    public static final RideCardItemDto$Slider$StateInfo$State$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RideCardItemDto$Slider$StateInfo$State$$serializer rideCardItemDto$Slider$StateInfo$State$$serializer = new RideCardItemDto$Slider$StateInfo$State$$serializer();
        INSTANCE = rideCardItemDto$Slider$StateInfo$State$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.RideCardItemDto.Slider.StateInfo.State", rideCardItemDto$Slider$StateInfo$State$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RideCardItemDto$Slider$StateInfo$State$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{RideCardItemDto$Slider.StateInfo.State.e[0].getValue(), qke.n(w7sVar), qke.n(w7sVar), qke.n(c7v.a)};
    }

    @Override // defpackage.myi
    public final RideCardItemDto$Slider.StateInfo.State deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = RideCardItemDto$Slider.StateInfo.State.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        RideCardItemDto$Slider.StateInfo.StateType stateType = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        n7v n7vVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                stateType = (RideCardItemDto$Slider.StateInfo.StateType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), stateType);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                n7vVar = (n7v) b.s(serialDescriptor, 3, c7v.a, n7vVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new RideCardItemDto$Slider.StateInfo.State(i, stateType, formattedText, formattedText2, n7vVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RideCardItemDto$Slider.StateInfo.State value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = RideCardItemDto$Slider.StateInfo.State.e;
        if (b.F() || value.a != RideCardItemDto$Slider.StateInfo.StateType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, c7v.a, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
