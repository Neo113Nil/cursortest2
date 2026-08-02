package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.SharedPaymentExperiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/SharedPaymentExperiment.BusinessAccountCreationFlow.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/SharedPaymentExperiment$BusinessAccountCreationFlow;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/SharedPaymentExperiment$BusinessAccountCreationFlow;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/SharedPaymentExperiment$BusinessAccountCreationFlow;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer implements uxs {
    public static final int $stable = 0;
    public static final SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer sharedPaymentExperiment$BusinessAccountCreationFlow$$serializer = new SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer();
        INSTANCE = sharedPaymentExperiment$BusinessAccountCreationFlow$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.SharedPaymentExperiment.BusinessAccountCreationFlow", sharedPaymentExperiment$BusinessAccountCreationFlow$$serializer, 12);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("add_payment_method_title", true);
        pluginGeneratedSerialDescriptor.j("select_payment_method_title", true);
        pluginGeneratedSerialDescriptor.j("payment_method_title", true);
        pluginGeneratedSerialDescriptor.j("email_title", true);
        pluginGeneratedSerialDescriptor.j("invite_members_title", true);
        pluginGeneratedSerialDescriptor.j("invite_members_subtitle", true);
        pluginGeneratedSerialDescriptor.j("members_subtitle", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("create_enterprise_account", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SharedPaymentExperiment$BusinessAccountCreationFlow$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, SharedPaymentExperiment$Action$$serializer.INSTANCE, SharedPaymentExperiment$CreateCorporateAccount$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final SharedPaymentExperiment.BusinessAccountCreationFlow deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        SharedPaymentExperiment.CreateCorporateAccount createCorporateAccount = null;
        boolean z = true;
        SharedPaymentExperiment.Action action = null;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str7 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str8 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str9 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    action = (SharedPaymentExperiment.Action) b.A(serialDescriptor, 10, SharedPaymentExperiment$Action$$serializer.INSTANCE, action);
                    i |= 1024;
                    break;
                case 11:
                    createCorporateAccount = (SharedPaymentExperiment.CreateCorporateAccount) b.A(serialDescriptor, 11, SharedPaymentExperiment$CreateCorporateAccount$$serializer.INSTANCE, createCorporateAccount);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SharedPaymentExperiment.BusinessAccountCreationFlow(i, z2, str, str2, str3, str4, str5, str6, str7, str8, str9, action, createCorporateAccount);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedPaymentExperiment.BusinessAccountCreationFlow value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
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
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || !jl40.l(value.g, "")) {
            b.o(serialDescriptor, 6, value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || !jl40.l(value.i, "")) {
            b.o(serialDescriptor, 8, value.i);
        }
        if (b.F() || !jl40.l(value.j, "")) {
            b.o(serialDescriptor, 9, value.j);
        }
        if (b.F() || !jl40.l(value.k, new SharedPaymentExperiment.Action(0))) {
            b.e(serialDescriptor, 10, SharedPaymentExperiment$Action$$serializer.INSTANCE, value.k);
        }
        if (b.F() || !jl40.l(value.l, new SharedPaymentExperiment.CreateCorporateAccount(0))) {
            b.e(serialDescriptor, 11, SharedPaymentExperiment$CreateCorporateAccount$$serializer.INSTANCE, value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
