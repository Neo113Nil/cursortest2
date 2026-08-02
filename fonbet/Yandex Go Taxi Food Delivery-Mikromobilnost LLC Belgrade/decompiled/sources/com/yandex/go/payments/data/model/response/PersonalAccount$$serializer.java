package com.yandex.go.payments.data.model.response;

import com.yandex.go.payments.data.model.response.PersonalAccount;
import defpackage.auu0;
import defpackage.gef;
import defpackage.ief;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/data/model/response/PersonalAccount.$serializer", "Luxs;", "Lcom/yandex/go/payments/data/model/response/PersonalAccount;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/data/model/response/PersonalAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/data/model/response/PersonalAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class PersonalAccount$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PersonalAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PersonalAccount$$serializer personalAccount$$serializer = new PersonalAccount$$serializer();
        INSTANCE = personalAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.data.model.response.PersonalAccount", personalAccount$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("money_left_as_str", true);
        pluginGeneratedSerialDescriptor.j("money_left_as_decimal", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("payment_available", true);
        pluginGeneratedSerialDescriptor.j("is_complement", true);
        pluginGeneratedSerialDescriptor.j("complement_attributes", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        pluginGeneratedSerialDescriptor.j("name_menu", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PersonalAccount$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(gef.a);
        KSerializer n3 = qke.n(PersonalAccount$ComplementAttributes$$serializer.INSTANCE);
        KSerializer n4 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, n, n2, z96Var, z96Var, n3, Availability$$serializer.INSTANCE, n4};
    }

    @Override // defpackage.myi
    public final PersonalAccount deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        String str = null;
        Availability availability = null;
        boolean z2 = true;
        PersonalAccount.ComplementAttributes complementAttributes = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        ief iefVar = null;
        boolean z3 = false;
        boolean z4 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    str5 = b.k(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 4, auu0.a, str6);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    iefVar = (ief) b.s(serialDescriptor, 5, gef.a, iefVar);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z4 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z = z2;
                    complementAttributes = (PersonalAccount.ComplementAttributes) b.s(serialDescriptor, 8, PersonalAccount$ComplementAttributes$$serializer.INSTANCE, complementAttributes);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    availability = (Availability) b.A(serialDescriptor, 9, Availability$$serializer.INSTANCE, availability);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new PersonalAccount(i, str2, str3, str4, str5, str6, iefVar, z3, z4, complementAttributes, availability, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PersonalAccount value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        k1 k1Var = PersonalAccount.Companion;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, gef.a, value.f);
        }
        if (b.F() || !value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, PersonalAccount$ComplementAttributes$$serializer.INSTANCE, value.i);
        }
        if (b.F() || !jl40.l(value.j, Availability.d)) {
            b.e(serialDescriptor, 9, Availability$$serializer.INSTANCE, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, auu0.a, value.k);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
