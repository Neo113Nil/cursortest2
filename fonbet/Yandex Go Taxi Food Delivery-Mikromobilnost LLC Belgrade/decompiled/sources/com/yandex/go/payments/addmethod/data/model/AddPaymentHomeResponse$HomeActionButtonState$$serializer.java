package com.yandex.go.payments.addmethod.data.model;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import defpackage.auu0;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse.HomeActionButtonState.$serializer", "Luxs;", "Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeActionButtonState;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeActionButtonState;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/addmethod/data/model/AddPaymentHomeResponse$HomeActionButtonState;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class AddPaymentHomeResponse$HomeActionButtonState$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AddPaymentHomeResponse$HomeActionButtonState$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddPaymentHomeResponse$HomeActionButtonState$$serializer addPaymentHomeResponse$HomeActionButtonState$$serializer = new AddPaymentHomeResponse$HomeActionButtonState$$serializer();
        INSTANCE = addPaymentHomeResponse$HomeActionButtonState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse.HomeActionButtonState", addPaymentHomeResponse$HomeActionButtonState$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("title_override", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("condition", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddPaymentHomeResponse$HomeActionButtonState$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), AddPaymentHomeResponse.HomeActionButtonState.d[1].getValue(), AddPaymentHomeResponse$HomeStateCondition$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final AddPaymentHomeResponse.HomeActionButtonState deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentHomeResponse.HomeActionButtonState.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        AddPaymentHomeResponse.ButtonState buttonState = null;
        AddPaymentHomeResponse.HomeStateCondition homeStateCondition = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                buttonState = (AddPaymentHomeResponse.ButtonState) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), buttonState);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                homeStateCondition = (AddPaymentHomeResponse.HomeStateCondition) b.A(serialDescriptor, 2, AddPaymentHomeResponse$HomeStateCondition$$serializer.INSTANCE, homeStateCondition);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new AddPaymentHomeResponse.HomeActionButtonState(i, str, buttonState, homeStateCondition);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AddPaymentHomeResponse.HomeActionButtonState value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentHomeResponse.HomeActionButtonState.d;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != AddPaymentHomeResponse.ButtonState.ENABLED) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, new AddPaymentHomeResponse.HomeStateCondition(0))) {
            b.e(serialDescriptor, 2, AddPaymentHomeResponse$HomeStateCondition$$serializer.INSTANCE, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
