package com.yandex.go.payments.cards.domainverification.data;

import defpackage.auu0;
import defpackage.h6w;
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
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResult.$serializer", "Luxs;", "Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResult;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResult;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/cards/domainverification/data/PaymentMethodVerificationResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class PaymentMethodVerificationResult$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PaymentMethodVerificationResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethodVerificationResult$$serializer paymentMethodVerificationResult$$serializer = new PaymentMethodVerificationResult$$serializer();
        INSTANCE = paymentMethodVerificationResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationResult", paymentMethodVerificationResult$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("verification_id", true);
        pluginGeneratedSerialDescriptor.j("method", true);
        pluginGeneratedSerialDescriptor.j(ACSPConstants.STATUS, true);
        pluginGeneratedSerialDescriptor.j("challenge_url", true);
        pluginGeneratedSerialDescriptor.j("random_amount_tries_left", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("currency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentMethodVerificationResult$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PaymentMethodVerificationResult.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), qke.n(auu0Var), qke.n(h6w.a), qke.n(PaymentMethodVerificationError$$serializer.INSTANCE), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final PaymentMethodVerificationResult deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentMethodVerificationResult.h;
        b.getClass();
        PaymentMethodVerificationResult paymentMethodVerificationResult = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        PaymentMethodVerificationStatus paymentMethodVerificationStatus = null;
        String str3 = null;
        Integer num = null;
        PaymentMethodVerificationError paymentMethodVerificationError = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    paymentMethodVerificationStatus = (PaymentMethodVerificationStatus) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), paymentMethodVerificationStatus);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) b.s(serialDescriptor, 4, h6w.a, num);
                    i |= 16;
                    break;
                case 5:
                    paymentMethodVerificationError = (PaymentMethodVerificationError) b.s(serialDescriptor, 5, PaymentMethodVerificationError$$serializer.INSTANCE, paymentMethodVerificationError);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return paymentMethodVerificationResult;
            }
            paymentMethodVerificationResult = null;
        }
        b.c(serialDescriptor);
        return new PaymentMethodVerificationResult(i, str, str2, paymentMethodVerificationStatus, str3, num, paymentMethodVerificationError, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentMethodVerificationResult value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentMethodVerificationResult.h;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != PaymentMethodVerificationStatus.UNKNOWN) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, h6w.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, PaymentMethodVerificationError$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
