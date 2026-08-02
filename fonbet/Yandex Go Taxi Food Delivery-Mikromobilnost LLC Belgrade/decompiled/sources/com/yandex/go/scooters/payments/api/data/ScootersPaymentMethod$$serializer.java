package com.yandex.go.scooters.payments.api.data;

import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/payments/api/data/ScootersPaymentMethod.$serializer", "Luxs;", "Lcom/yandex/go/scooters/payments/api/data/ScootersPaymentMethod;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/payments/api/data/ScootersPaymentMethod;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/payments/api/data/ScootersPaymentMethod;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class ScootersPaymentMethod$$serializer implements uxs {
    public static final ScootersPaymentMethod$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersPaymentMethod$$serializer scootersPaymentMethod$$serializer = new ScootersPaymentMethod$$serializer();
        INSTANCE = scootersPaymentMethod$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.payments.api.data.ScootersPaymentMethod", scootersPaymentMethod$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("account_id", false);
        pluginGeneratedSerialDescriptor.j("card", true);
        pluginGeneratedSerialDescriptor.j("corp", true);
        pluginGeneratedSerialDescriptor.j("nequi_token", true);
        pluginGeneratedSerialDescriptor.j("sbp_token", true);
        pluginGeneratedSerialDescriptor.j("kaspi", true);
        pluginGeneratedSerialDescriptor.j("click_wallet", true);
        pluginGeneratedSerialDescriptor.j("easypaisa_wallet", true);
        pluginGeneratedSerialDescriptor.j("jazzcash_wallet", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersPaymentMethod$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final ScootersPaymentMethod deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ScootersPaymentMethod scootersPaymentMethod = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) b.s(serialDescriptor, 1, auu0.a, str3);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) b.s(serialDescriptor, 2, auu0.a, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) b.s(serialDescriptor, 3, auu0.a, str5);
                    i |= 8;
                    break;
                case 4:
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    break;
                case 5:
                    str7 = (String) b.s(serialDescriptor, 5, auu0.a, str7);
                    i |= 32;
                    break;
                case 6:
                    str8 = (String) b.s(serialDescriptor, 6, auu0.a, str8);
                    i |= 64;
                    break;
                case 7:
                    str9 = (String) b.s(serialDescriptor, 7, auu0.a, str9);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return scootersPaymentMethod;
            }
            scootersPaymentMethod = null;
        }
        b.c(serialDescriptor);
        return new ScootersPaymentMethod(i, str2, str3, str4, str5, str6, str7, str8, str9, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersPaymentMethod value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = value.a;
        String str2 = value.i;
        String str3 = value.h;
        String str4 = value.g;
        String str5 = value.f;
        String str6 = value.e;
        String str7 = value.d;
        String str8 = value.c;
        String str9 = value.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || str9 != null) {
            b.g(serialDescriptor, 1, auu0.a, str9);
        }
        if (b.F() || str8 != null) {
            b.g(serialDescriptor, 2, auu0.a, str8);
        }
        if (b.F() || str7 != null) {
            b.g(serialDescriptor, 3, auu0.a, str7);
        }
        if (b.F() || str6 != null) {
            b.g(serialDescriptor, 4, auu0.a, str6);
        }
        if (b.F() || str5 != null) {
            b.g(serialDescriptor, 5, auu0.a, str5);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 6, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 7, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 8, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
