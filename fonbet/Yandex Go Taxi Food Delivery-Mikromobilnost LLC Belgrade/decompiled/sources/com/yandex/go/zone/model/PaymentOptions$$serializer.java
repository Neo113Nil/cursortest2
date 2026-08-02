package com.yandex.go.zone.model;

import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/model/PaymentOptions.$serializer", "Luxs;", "Lcom/yandex/go/zone/model/PaymentOptions;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/model/PaymentOptions;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/model/PaymentOptions;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PaymentOptions$$serializer implements uxs {
    public static final PaymentOptions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentOptions$$serializer paymentOptions$$serializer = new PaymentOptions$$serializer();
        INSTANCE = paymentOptions$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.model.PaymentOptions", paymentOptions$$serializer, 24);
        pluginGeneratedSerialDescriptor.j("coupon", true);
        pluginGeneratedSerialDescriptor.j("creditcard", true);
        pluginGeneratedSerialDescriptor.j("corp", true);
        pluginGeneratedSerialDescriptor.j("cargocorp", true);
        pluginGeneratedSerialDescriptor.j("googlepay", true);
        pluginGeneratedSerialDescriptor.j("personal_wallet", true);
        pluginGeneratedSerialDescriptor.j("coop_account", true);
        pluginGeneratedSerialDescriptor.j("yandex_card", true);
        pluginGeneratedSerialDescriptor.j("sbp_token", true);
        pluginGeneratedSerialDescriptor.j("yango_pay", true);
        pluginGeneratedSerialDescriptor.j("cash", true);
        pluginGeneratedSerialDescriptor.j("cash_like", true);
        pluginGeneratedSerialDescriptor.j("mbank_account", true);
        pluginGeneratedSerialDescriptor.j("yape_token", true);
        pluginGeneratedSerialDescriptor.j("nequi_token", true);
        pluginGeneratedSerialDescriptor.j("sbp", true);
        pluginGeneratedSerialDescriptor.j("transport_card", true);
        pluginGeneratedSerialDescriptor.j("birbonus_wallet", true);
        pluginGeneratedSerialDescriptor.j("transport_external", true);
        pluginGeneratedSerialDescriptor.j("kaspi", true);
        pluginGeneratedSerialDescriptor.j("click_wallet", true);
        pluginGeneratedSerialDescriptor.j("easypaisa_wallet", true);
        pluginGeneratedSerialDescriptor.j("jazzcash_wallet", true);
        pluginGeneratedSerialDescriptor.j("fastshift_account", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentOptions$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final PaymentOptions deserialize(Decoder decoder) {
        int i;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        boolean z25 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    z4 = b.C(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    z5 = b.C(serialDescriptor, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    z6 = b.C(serialDescriptor, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    z7 = b.C(serialDescriptor, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    z8 = b.C(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    z9 = b.C(serialDescriptor, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    z10 = b.C(serialDescriptor, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    z11 = b.C(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    z12 = b.C(serialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    z13 = b.C(serialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    z14 = b.C(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    z15 = b.C(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    z16 = b.C(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    z17 = b.C(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    z18 = b.C(serialDescriptor, 16);
                    i = 65536;
                    break;
                case 17:
                    z19 = b.C(serialDescriptor, 17);
                    i = 131072;
                    break;
                case 18:
                    z20 = b.C(serialDescriptor, 18);
                    i = 262144;
                    break;
                case 19:
                    z21 = b.C(serialDescriptor, 19);
                    i = 524288;
                    break;
                case 20:
                    z22 = b.C(serialDescriptor, 20);
                    i = 1048576;
                    break;
                case 21:
                    z23 = b.C(serialDescriptor, 21);
                    i = 2097152;
                    break;
                case 22:
                    z24 = b.C(serialDescriptor, 22);
                    i = SelfTester_JCP.ENCRYPT_CBC;
                    break;
                case 23:
                    z25 = b.C(serialDescriptor, 23);
                    i = SelfTester_JCP.ENCRYPT_CNT;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i2 |= i;
        }
        b.c(serialDescriptor);
        return new PaymentOptions(i2, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentOptions value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d) {
            b.n(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i) {
            b.n(serialDescriptor, 8, value.i);
        }
        if (b.F() || value.j) {
            b.n(serialDescriptor, 9, value.j);
        }
        if (b.F() || value.k) {
            b.n(serialDescriptor, 10, value.k);
        }
        if (b.F() || value.l) {
            b.n(serialDescriptor, 11, value.l);
        }
        if (b.F() || value.m) {
            b.n(serialDescriptor, 12, value.m);
        }
        if (b.F() || value.n) {
            b.n(serialDescriptor, 13, value.n);
        }
        if (b.F() || value.o) {
            b.n(serialDescriptor, 14, value.o);
        }
        if (b.F() || value.p) {
            b.n(serialDescriptor, 15, value.p);
        }
        if (b.F() || value.q) {
            b.n(serialDescriptor, 16, value.q);
        }
        if (b.F() || value.r) {
            b.n(serialDescriptor, 17, value.r);
        }
        if (b.F() || value.s) {
            b.n(serialDescriptor, 18, value.s);
        }
        if (b.F() || value.t) {
            b.n(serialDescriptor, 19, value.t);
        }
        if (b.F() || value.u) {
            b.n(serialDescriptor, 20, value.u);
        }
        if (b.F() || value.v) {
            b.n(serialDescriptor, 21, value.v);
        }
        if (b.F() || value.w) {
            b.n(serialDescriptor, 22, value.w);
        }
        if (b.F() || value.x) {
            b.n(serialDescriptor, 23, value.x);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
