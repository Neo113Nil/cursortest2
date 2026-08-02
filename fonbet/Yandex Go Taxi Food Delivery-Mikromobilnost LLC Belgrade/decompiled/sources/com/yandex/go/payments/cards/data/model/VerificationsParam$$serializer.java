package com.yandex.go.payments.cards.data.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/cards/data/model/VerificationsParam.$serializer", "Luxs;", "Lcom/yandex/go/payments/cards/data/model/VerificationsParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/cards/data/model/VerificationsParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/cards/data/model/VerificationsParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class VerificationsParam$$serializer implements uxs {
    public static final int $stable = 0;
    public static final VerificationsParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VerificationsParam$$serializer verificationsParam$$serializer = new VerificationsParam$$serializer();
        INSTANCE = verificationsParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.cards.data.model.VerificationsParam", verificationsParam$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("card_id", false);
        pluginGeneratedSerialDescriptor.j("payment_type", false);
        pluginGeneratedSerialDescriptor.j("country_iso2", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("supported_features", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VerificationsParam$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = VerificationsParam.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final VerificationsParam deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = VerificationsParam.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PaymentMethod$Type paymentMethod$Type = null;
        String str2 = null;
        String str3 = null;
        Set set = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                paymentMethod$Type = (PaymentMethod$Type) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), paymentMethod$Type);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                set = (Set) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), set);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new VerificationsParam(i, str, paymentMethod$Type, str2, str3, set);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VerificationsParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = VerificationsParam.f;
        b.o(serialDescriptor, 0, value.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 2, auu0Var, value.c);
        b.g(serialDescriptor, 3, auu0Var, value.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
