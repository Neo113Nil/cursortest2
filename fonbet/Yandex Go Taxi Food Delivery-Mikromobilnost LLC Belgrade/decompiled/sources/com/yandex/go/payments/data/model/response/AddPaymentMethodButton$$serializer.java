package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/AddPaymentMethodButton.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/AddPaymentMethodButton;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class AddPaymentMethodButton$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AddPaymentMethodButton$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AddPaymentMethodButton$$serializer addPaymentMethodButton$$serializer = new AddPaymentMethodButton$$serializer();
        INSTANCE = addPaymentMethodButton$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.AddPaymentMethodButton", addPaymentMethodButton$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("flow", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AddPaymentMethodButton$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = AddPaymentMethodButton.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), i3yVarArr[2].getValue(), qke.n(auu0Var), AddPaymentMethodButton$AddButtonFlow$$serializer.INSTANCE, i3yVarArr[5].getValue()};
    }

    @Override // defpackage.myi
    public final AddPaymentMethodButton deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentMethodButton.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        AddPaymentMethodButton.AddButtonType addButtonType = null;
        String str3 = null;
        AddPaymentMethodButton.AddButtonFlow addButtonFlow = null;
        AddSbpTokenButtonDto.StateType stateType = null;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    addButtonType = (AddPaymentMethodButton.AddButtonType) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), addButtonType);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    addButtonFlow = (AddPaymentMethodButton.AddButtonFlow) b.A(serialDescriptor, 4, AddPaymentMethodButton$AddButtonFlow$$serializer.INSTANCE, addButtonFlow);
                    i |= 16;
                    break;
                case 5:
                    stateType = (AddSbpTokenButtonDto.StateType) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), stateType);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new AddPaymentMethodButton(i, str, str2, addButtonType, str3, addButtonFlow, stateType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AddPaymentMethodButton value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AddPaymentMethodButton.g;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != AddPaymentMethodButton.AddButtonType.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, new AddPaymentMethodButton.AddButtonFlow(0))) {
            b.e(serialDescriptor, 4, AddPaymentMethodButton$AddButtonFlow$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != AddSbpTokenButtonDto.StateType.DISABLED) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
