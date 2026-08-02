package com.yandex.go.payments.shared.business;

import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/BusinessAccountFlowExperiment.ViewBusinessAccount.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ViewBusinessAccount;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ViewBusinessAccount;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$ViewBusinessAccount;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class BusinessAccountFlowExperiment$ViewBusinessAccount$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BusinessAccountFlowExperiment$ViewBusinessAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BusinessAccountFlowExperiment$ViewBusinessAccount$$serializer businessAccountFlowExperiment$ViewBusinessAccount$$serializer = new BusinessAccountFlowExperiment$ViewBusinessAccount$$serializer();
        INSTANCE = businessAccountFlowExperiment$ViewBusinessAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment.ViewBusinessAccount", businessAccountFlowExperiment$ViewBusinessAccount$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("email_title", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("members_subtitle", true);
        pluginGeneratedSerialDescriptor.j("invite_members_title", true);
        pluginGeneratedSerialDescriptor.j("payment_method_title", true);
        pluginGeneratedSerialDescriptor.j("invite_members_subtitle", true);
        pluginGeneratedSerialDescriptor.j("add_payment_method_title", true);
        pluginGeneratedSerialDescriptor.j("select_payment_method_title", true);
        pluginGeneratedSerialDescriptor.j("create_enterprise_account", true);
        pluginGeneratedSerialDescriptor.j("create_corp_account", true);
        pluginGeneratedSerialDescriptor.j("settings_item", true);
        pluginGeneratedSerialDescriptor.j("done_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BusinessAccountFlowExperiment$ViewBusinessAccount$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, BusinessAccountFlowExperiment$ActionButton$$serializer.INSTANCE, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, BusinessAccountFlowExperiment$CreateEnterpriseAccount$$serializer.INSTANCE, BusinessAccountFlowExperiment$BusinessAccountLinkItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$ViewBusinessAccount$SettingsItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$ViewBusinessAccount$DoneButton$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final BusinessAccountFlowExperiment.ViewBusinessAccount deserialize(Decoder decoder) {
        String str;
        boolean z;
        boolean z2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        BusinessAccountFlowExperiment.ViewBusinessAccount.DoneButton doneButton = null;
        BusinessAccountFlowExperiment.ViewBusinessAccount.SettingsItem settingsItem = null;
        BusinessAccountFlowExperiment.BusinessAccountLinkItem businessAccountLinkItem = null;
        boolean z3 = true;
        BusinessAccountFlowExperiment.CreateEnterpriseAccount createEnterpriseAccount = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        BusinessAccountFlowExperiment.ActionButton actionButton = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str = str2;
                    z3 = false;
                    str2 = str;
                case 0:
                    z2 = z3;
                    i |= 1;
                    str2 = b.k(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z2 = z3;
                    str3 = b.k(serialDescriptor, 1);
                    i |= 2;
                    z3 = z2;
                case 2:
                    z2 = z3;
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    z3 = z2;
                case 3:
                    z = z3;
                    str = str2;
                    actionButton = (BusinessAccountFlowExperiment.ActionButton) b.A(serialDescriptor, 3, BusinessAccountFlowExperiment$ActionButton$$serializer.INSTANCE, actionButton);
                    i |= 8;
                    z3 = z;
                    str2 = str;
                case 4:
                    z2 = z3;
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    z3 = z2;
                case 5:
                    z2 = z3;
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    z3 = z2;
                case 6:
                    z2 = z3;
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    z3 = z2;
                case 7:
                    z2 = z3;
                    str8 = b.k(serialDescriptor, 7);
                    i |= 128;
                    z3 = z2;
                case 8:
                    z2 = z3;
                    str9 = b.k(serialDescriptor, 8);
                    i |= 256;
                    z3 = z2;
                case 9:
                    z2 = z3;
                    str10 = b.k(serialDescriptor, 9);
                    i |= 512;
                    z3 = z2;
                case 10:
                    z = z3;
                    str = str2;
                    createEnterpriseAccount = (BusinessAccountFlowExperiment.CreateEnterpriseAccount) b.A(serialDescriptor, 10, BusinessAccountFlowExperiment$CreateEnterpriseAccount$$serializer.INSTANCE, createEnterpriseAccount);
                    i |= 1024;
                    z3 = z;
                    str2 = str;
                case 11:
                    z = z3;
                    str = str2;
                    businessAccountLinkItem = (BusinessAccountFlowExperiment.BusinessAccountLinkItem) b.A(serialDescriptor, 11, BusinessAccountFlowExperiment$BusinessAccountLinkItem$$serializer.INSTANCE, businessAccountLinkItem);
                    i |= 2048;
                    z3 = z;
                    str2 = str;
                case 12:
                    z = z3;
                    str = str2;
                    settingsItem = (BusinessAccountFlowExperiment.ViewBusinessAccount.SettingsItem) b.A(serialDescriptor, 12, BusinessAccountFlowExperiment$ViewBusinessAccount$SettingsItem$$serializer.INSTANCE, settingsItem);
                    i |= 4096;
                    z3 = z;
                    str2 = str;
                case 13:
                    z = z3;
                    str = str2;
                    doneButton = (BusinessAccountFlowExperiment.ViewBusinessAccount.DoneButton) b.A(serialDescriptor, 13, BusinessAccountFlowExperiment$ViewBusinessAccount$DoneButton$$serializer.INSTANCE, doneButton);
                    i |= 8192;
                    z3 = z;
                    str2 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new BusinessAccountFlowExperiment.ViewBusinessAccount(i, str2, str3, str4, actionButton, str5, str6, str7, str8, str9, str10, createEnterpriseAccount, businessAccountLinkItem, settingsItem, doneButton);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BusinessAccountFlowExperiment.ViewBusinessAccount value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, new BusinessAccountFlowExperiment.ActionButton(0))) {
            b.e(serialDescriptor, 3, BusinessAccountFlowExperiment$ActionButton$$serializer.INSTANCE, value.d);
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
        if (b.F() || !jl40.l(value.k, new BusinessAccountFlowExperiment.CreateEnterpriseAccount(0))) {
            b.e(serialDescriptor, 10, BusinessAccountFlowExperiment$CreateEnterpriseAccount$$serializer.INSTANCE, value.k);
        }
        if (b.F() || !jl40.l(value.l, new BusinessAccountFlowExperiment.BusinessAccountLinkItem(0))) {
            b.e(serialDescriptor, 11, BusinessAccountFlowExperiment$BusinessAccountLinkItem$$serializer.INSTANCE, value.l);
        }
        if (b.F() || !jl40.l(value.m, new BusinessAccountFlowExperiment.ViewBusinessAccount.SettingsItem(0))) {
            b.e(serialDescriptor, 12, BusinessAccountFlowExperiment$ViewBusinessAccount$SettingsItem$$serializer.INSTANCE, value.m);
        }
        if (b.F() || !jl40.l(value.n, new BusinessAccountFlowExperiment.ViewBusinessAccount.DoneButton(0))) {
            b.e(serialDescriptor, 13, BusinessAccountFlowExperiment$ViewBusinessAccount$DoneButton$$serializer.INSTANCE, value.n);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
