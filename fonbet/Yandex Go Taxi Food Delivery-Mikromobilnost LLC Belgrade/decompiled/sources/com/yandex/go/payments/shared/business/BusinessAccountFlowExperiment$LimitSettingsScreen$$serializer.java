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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/BusinessAccountFlowExperiment.LimitSettingsScreen.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$LimitSettingsScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class BusinessAccountFlowExperiment$LimitSettingsScreen$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BusinessAccountFlowExperiment$LimitSettingsScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BusinessAccountFlowExperiment$LimitSettingsScreen$$serializer businessAccountFlowExperiment$LimitSettingsScreen$$serializer = new BusinessAccountFlowExperiment$LimitSettingsScreen$$serializer();
        INSTANCE = businessAccountFlowExperiment$LimitSettingsScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment.LimitSettingsScreen", businessAccountFlowExperiment$LimitSettingsScreen$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("unlimit_text", true);
        pluginGeneratedSerialDescriptor.j("empty_view", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("set_limit_alert", true);
        pluginGeneratedSerialDescriptor.j("reset_limit_alert", true);
        pluginGeneratedSerialDescriptor.j("invite_member_item", true);
        pluginGeneratedSerialDescriptor.j("all_members_limit_input_field", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BusinessAccountFlowExperiment$LimitSettingsScreen$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, BusinessAccountFlowExperiment$LimitSettingsScreen$EmptyView$$serializer.INSTANCE, BusinessAccountFlowExperiment$LimitSettingsScreen$ActionButton$$serializer.INSTANCE, BusinessAccountFlowExperiment$LimitSettingsScreen$SetLimitAlert$$serializer.INSTANCE, BusinessAccountFlowExperiment$LimitSettingsScreen$ResetLimitAlert$$serializer.INSTANCE, BusinessAccountFlowExperiment$LimitSettingsScreen$InviteMemberItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$LimitSettingsScreen$AllMembersLimitInputField$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final BusinessAccountFlowExperiment.LimitSettingsScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        BusinessAccountFlowExperiment.LimitSettingsScreen limitSettingsScreen = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        BusinessAccountFlowExperiment.LimitSettingsScreen.EmptyView emptyView = null;
        BusinessAccountFlowExperiment.LimitSettingsScreen.ActionButton actionButton = null;
        BusinessAccountFlowExperiment.LimitSettingsScreen.SetLimitAlert setLimitAlert = null;
        BusinessAccountFlowExperiment.LimitSettingsScreen.ResetLimitAlert resetLimitAlert = null;
        BusinessAccountFlowExperiment.LimitSettingsScreen.InviteMemberItem inviteMemberItem = null;
        BusinessAccountFlowExperiment.LimitSettingsScreen.AllMembersLimitInputField allMembersLimitInputField = null;
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
                    emptyView = (BusinessAccountFlowExperiment.LimitSettingsScreen.EmptyView) b.A(serialDescriptor, 2, BusinessAccountFlowExperiment$LimitSettingsScreen$EmptyView$$serializer.INSTANCE, emptyView);
                    i |= 4;
                    break;
                case 3:
                    actionButton = (BusinessAccountFlowExperiment.LimitSettingsScreen.ActionButton) b.A(serialDescriptor, 3, BusinessAccountFlowExperiment$LimitSettingsScreen$ActionButton$$serializer.INSTANCE, actionButton);
                    i |= 8;
                    break;
                case 4:
                    setLimitAlert = (BusinessAccountFlowExperiment.LimitSettingsScreen.SetLimitAlert) b.A(serialDescriptor, 4, BusinessAccountFlowExperiment$LimitSettingsScreen$SetLimitAlert$$serializer.INSTANCE, setLimitAlert);
                    i |= 16;
                    break;
                case 5:
                    resetLimitAlert = (BusinessAccountFlowExperiment.LimitSettingsScreen.ResetLimitAlert) b.A(serialDescriptor, 5, BusinessAccountFlowExperiment$LimitSettingsScreen$ResetLimitAlert$$serializer.INSTANCE, resetLimitAlert);
                    i |= 32;
                    break;
                case 6:
                    inviteMemberItem = (BusinessAccountFlowExperiment.LimitSettingsScreen.InviteMemberItem) b.A(serialDescriptor, 6, BusinessAccountFlowExperiment$LimitSettingsScreen$InviteMemberItem$$serializer.INSTANCE, inviteMemberItem);
                    i |= 64;
                    break;
                case 7:
                    allMembersLimitInputField = (BusinessAccountFlowExperiment.LimitSettingsScreen.AllMembersLimitInputField) b.A(serialDescriptor, 7, BusinessAccountFlowExperiment$LimitSettingsScreen$AllMembersLimitInputField$$serializer.INSTANCE, allMembersLimitInputField);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return limitSettingsScreen;
            }
            limitSettingsScreen = null;
        }
        b.c(serialDescriptor);
        return new BusinessAccountFlowExperiment.LimitSettingsScreen(i, str, str2, emptyView, actionButton, setLimitAlert, resetLimitAlert, inviteMemberItem, allMembersLimitInputField);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BusinessAccountFlowExperiment.LimitSettingsScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, new BusinessAccountFlowExperiment.LimitSettingsScreen.EmptyView(0))) {
            b.e(serialDescriptor, 2, BusinessAccountFlowExperiment$LimitSettingsScreen$EmptyView$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new BusinessAccountFlowExperiment.LimitSettingsScreen.ActionButton(0))) {
            b.e(serialDescriptor, 3, BusinessAccountFlowExperiment$LimitSettingsScreen$ActionButton$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new BusinessAccountFlowExperiment.LimitSettingsScreen.SetLimitAlert(0))) {
            b.e(serialDescriptor, 4, BusinessAccountFlowExperiment$LimitSettingsScreen$SetLimitAlert$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, new BusinessAccountFlowExperiment.LimitSettingsScreen.ResetLimitAlert(0))) {
            b.e(serialDescriptor, 5, BusinessAccountFlowExperiment$LimitSettingsScreen$ResetLimitAlert$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, new BusinessAccountFlowExperiment.LimitSettingsScreen.InviteMemberItem(0))) {
            b.e(serialDescriptor, 6, BusinessAccountFlowExperiment$LimitSettingsScreen$InviteMemberItem$$serializer.INSTANCE, value.g);
        }
        if (b.F() || !jl40.l(value.h, new BusinessAccountFlowExperiment.LimitSettingsScreen.AllMembersLimitInputField(0))) {
            b.e(serialDescriptor, 7, BusinessAccountFlowExperiment$LimitSettingsScreen$AllMembersLimitInputField$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
