package com.yandex.go.payments.cards.data.model;

import com.yandex.go.payments.cards.data.model.VerificationRequest;
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
import defpackage.z96;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/cards/data/model/VerificationRequest.$serializer", "Luxs;", "Lcom/yandex/go/payments/cards/data/model/VerificationRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/cards/data/model/VerificationRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/cards/data/model/VerificationRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class VerificationRequest$$serializer implements uxs {
    public static final int $stable = 0;
    public static final VerificationRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VerificationRequest$$serializer verificationRequest$$serializer = new VerificationRequest$$serializer();
        INSTANCE = verificationRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.cards.data.model.VerificationRequest", verificationRequest$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("binding_id", false);
        pluginGeneratedSerialDescriptor.j("verification_id", false);
        pluginGeneratedSerialDescriptor.j("force_cache_invalidate", true);
        pluginGeneratedSerialDescriptor.j("antifraud_payload", false);
        pluginGeneratedSerialDescriptor.j("country_iso2", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("supported_features", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VerificationRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = VerificationRequest.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), z96.a, qke.n(VerificationRequest$AntifraudPayload$$serializer.INSTANCE), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final VerificationRequest deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = VerificationRequest.i;
        b.getClass();
        VerificationRequest verificationRequest = null;
        boolean z = true;
        Set set = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        VerificationRequest.AntifraudPayload antifraudPayload = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
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
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    antifraudPayload = (VerificationRequest.AntifraudPayload) b.s(serialDescriptor, 4, VerificationRequest$AntifraudPayload$$serializer.INSTANCE, antifraudPayload);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    i |= 64;
                    break;
                case 7:
                    set = (Set) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), set);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return verificationRequest;
            }
            verificationRequest = null;
        }
        b.c(serialDescriptor);
        return new VerificationRequest(i, str, str2, str3, z2, antifraudPayload, str4, str5, set);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VerificationRequest value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = VerificationRequest.i;
        String str = value.a;
        boolean z = value.d;
        b.o(serialDescriptor, 0, str);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, value.b);
        b.g(serialDescriptor, 2, auu0Var, value.c);
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        b.g(serialDescriptor, 4, VerificationRequest$AntifraudPayload$$serializer.INSTANCE, value.e);
        b.g(serialDescriptor, 5, auu0Var, value.f);
        b.g(serialDescriptor, 6, auu0Var, value.g);
        b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
