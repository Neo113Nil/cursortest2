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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/BusinessAccountFlowExperiment.SettingsScreen.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$SettingsScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class BusinessAccountFlowExperiment$SettingsScreen$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BusinessAccountFlowExperiment$SettingsScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BusinessAccountFlowExperiment$SettingsScreen$$serializer businessAccountFlowExperiment$SettingsScreen$$serializer = new BusinessAccountFlowExperiment$SettingsScreen$$serializer();
        INSTANCE = businessAccountFlowExperiment$SettingsScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment.SettingsScreen", businessAccountFlowExperiment$SettingsScreen$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("account_name_input_field", true);
        pluginGeneratedSerialDescriptor.j("generic_limits_item", true);
        pluginGeneratedSerialDescriptor.j("report_item", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("delete_account_alert", true);
        pluginGeneratedSerialDescriptor.j("delete_account_process_view", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BusinessAccountFlowExperiment$SettingsScreen$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, BusinessAccountFlowExperiment$SettingsScreen$AccountNameInputField$$serializer.INSTANCE, BusinessAccountFlowExperiment$SettingsScreen$GenericLimitsItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$SettingsScreen$ReportItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$SettingsScreen$ActionButton$$serializer.INSTANCE, BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountAlert$$serializer.INSTANCE, BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountProcessView$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final BusinessAccountFlowExperiment.SettingsScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        BusinessAccountFlowExperiment.SettingsScreen.AccountNameInputField accountNameInputField = null;
        BusinessAccountFlowExperiment.SettingsScreen.GenericLimitsItem genericLimitsItem = null;
        BusinessAccountFlowExperiment.SettingsScreen.ReportItem reportItem = null;
        BusinessAccountFlowExperiment.SettingsScreen.ActionButton actionButton = null;
        BusinessAccountFlowExperiment.SettingsScreen.DeleteAccountAlert deleteAccountAlert = null;
        BusinessAccountFlowExperiment.SettingsScreen.DeleteAccountProcessView deleteAccountProcessView = null;
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
                    accountNameInputField = (BusinessAccountFlowExperiment.SettingsScreen.AccountNameInputField) b.A(serialDescriptor, 1, BusinessAccountFlowExperiment$SettingsScreen$AccountNameInputField$$serializer.INSTANCE, accountNameInputField);
                    i |= 2;
                    break;
                case 2:
                    genericLimitsItem = (BusinessAccountFlowExperiment.SettingsScreen.GenericLimitsItem) b.A(serialDescriptor, 2, BusinessAccountFlowExperiment$SettingsScreen$GenericLimitsItem$$serializer.INSTANCE, genericLimitsItem);
                    i |= 4;
                    break;
                case 3:
                    reportItem = (BusinessAccountFlowExperiment.SettingsScreen.ReportItem) b.A(serialDescriptor, 3, BusinessAccountFlowExperiment$SettingsScreen$ReportItem$$serializer.INSTANCE, reportItem);
                    i |= 8;
                    break;
                case 4:
                    actionButton = (BusinessAccountFlowExperiment.SettingsScreen.ActionButton) b.A(serialDescriptor, 4, BusinessAccountFlowExperiment$SettingsScreen$ActionButton$$serializer.INSTANCE, actionButton);
                    i |= 16;
                    break;
                case 5:
                    deleteAccountAlert = (BusinessAccountFlowExperiment.SettingsScreen.DeleteAccountAlert) b.A(serialDescriptor, 5, BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountAlert$$serializer.INSTANCE, deleteAccountAlert);
                    i |= 32;
                    break;
                case 6:
                    deleteAccountProcessView = (BusinessAccountFlowExperiment.SettingsScreen.DeleteAccountProcessView) b.A(serialDescriptor, 6, BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountProcessView$$serializer.INSTANCE, deleteAccountProcessView);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new BusinessAccountFlowExperiment.SettingsScreen(i, str, accountNameInputField, genericLimitsItem, reportItem, actionButton, deleteAccountAlert, deleteAccountProcessView);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BusinessAccountFlowExperiment.SettingsScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new BusinessAccountFlowExperiment.SettingsScreen.AccountNameInputField(0))) {
            b.e(serialDescriptor, 1, BusinessAccountFlowExperiment$SettingsScreen$AccountNameInputField$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new BusinessAccountFlowExperiment.SettingsScreen.GenericLimitsItem(0))) {
            b.e(serialDescriptor, 2, BusinessAccountFlowExperiment$SettingsScreen$GenericLimitsItem$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new BusinessAccountFlowExperiment.SettingsScreen.ReportItem(0))) {
            b.e(serialDescriptor, 3, BusinessAccountFlowExperiment$SettingsScreen$ReportItem$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new BusinessAccountFlowExperiment.SettingsScreen.ActionButton(0))) {
            b.e(serialDescriptor, 4, BusinessAccountFlowExperiment$SettingsScreen$ActionButton$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, new BusinessAccountFlowExperiment.SettingsScreen.DeleteAccountAlert(0))) {
            b.e(serialDescriptor, 5, BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountAlert$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, new BusinessAccountFlowExperiment.SettingsScreen.DeleteAccountProcessView(0))) {
            b.e(serialDescriptor, 6, BusinessAccountFlowExperiment$SettingsScreen$DeleteAccountProcessView$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
