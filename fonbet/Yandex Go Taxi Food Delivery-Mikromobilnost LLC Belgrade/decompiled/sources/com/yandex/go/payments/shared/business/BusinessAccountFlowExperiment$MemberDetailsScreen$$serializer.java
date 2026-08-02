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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/BusinessAccountFlowExperiment.MemberDetailsScreen.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$MemberDetailsScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class BusinessAccountFlowExperiment$MemberDetailsScreen$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BusinessAccountFlowExperiment$MemberDetailsScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BusinessAccountFlowExperiment$MemberDetailsScreen$$serializer businessAccountFlowExperiment$MemberDetailsScreen$$serializer = new BusinessAccountFlowExperiment$MemberDetailsScreen$$serializer();
        INSTANCE = businessAccountFlowExperiment$MemberDetailsScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment.MemberDetailsScreen", businessAccountFlowExperiment$MemberDetailsScreen$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("name_input_field", true);
        pluginGeneratedSerialDescriptor.j("enable_limit_item", true);
        pluginGeneratedSerialDescriptor.j("phone_input_field", true);
        pluginGeneratedSerialDescriptor.j("delete_member_alert", true);
        pluginGeneratedSerialDescriptor.j("amount_limit_input_field", true);
        pluginGeneratedSerialDescriptor.j("pick_from_contacts_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BusinessAccountFlowExperiment$MemberDetailsScreen$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, BusinessAccountFlowExperiment$MemberDetailsScreen$ActionButton$$serializer.INSTANCE, BusinessAccountFlowExperiment$MemberDetailsScreen$NameInputField$$serializer.INSTANCE, BusinessAccountFlowExperiment$MemberDetailsScreen$EnableLimitItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$MemberDetailsScreen$PhoneInputField$$serializer.INSTANCE, BusinessAccountFlowExperiment$MemberDetailsScreen$DeleteMemberAlert$$serializer.INSTANCE, BusinessAccountFlowExperiment$MemberDetailsScreen$AmountLimitInputField$$serializer.INSTANCE, BusinessAccountFlowExperiment$MemberDetailsScreen$PickFromContactsButton$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final BusinessAccountFlowExperiment.MemberDetailsScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        BusinessAccountFlowExperiment.MemberDetailsScreen memberDetailsScreen = null;
        boolean z = true;
        int i = 0;
        String str = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.ActionButton actionButton = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.NameInputField nameInputField = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.EnableLimitItem enableLimitItem = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.PhoneInputField phoneInputField = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.DeleteMemberAlert deleteMemberAlert = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.AmountLimitInputField amountLimitInputField = null;
        BusinessAccountFlowExperiment.MemberDetailsScreen.PickFromContactsButton pickFromContactsButton = null;
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
                    actionButton = (BusinessAccountFlowExperiment.MemberDetailsScreen.ActionButton) b.A(serialDescriptor, 1, BusinessAccountFlowExperiment$MemberDetailsScreen$ActionButton$$serializer.INSTANCE, actionButton);
                    i |= 2;
                    break;
                case 2:
                    nameInputField = (BusinessAccountFlowExperiment.MemberDetailsScreen.NameInputField) b.A(serialDescriptor, 2, BusinessAccountFlowExperiment$MemberDetailsScreen$NameInputField$$serializer.INSTANCE, nameInputField);
                    i |= 4;
                    break;
                case 3:
                    enableLimitItem = (BusinessAccountFlowExperiment.MemberDetailsScreen.EnableLimitItem) b.A(serialDescriptor, 3, BusinessAccountFlowExperiment$MemberDetailsScreen$EnableLimitItem$$serializer.INSTANCE, enableLimitItem);
                    i |= 8;
                    break;
                case 4:
                    phoneInputField = (BusinessAccountFlowExperiment.MemberDetailsScreen.PhoneInputField) b.A(serialDescriptor, 4, BusinessAccountFlowExperiment$MemberDetailsScreen$PhoneInputField$$serializer.INSTANCE, phoneInputField);
                    i |= 16;
                    break;
                case 5:
                    deleteMemberAlert = (BusinessAccountFlowExperiment.MemberDetailsScreen.DeleteMemberAlert) b.A(serialDescriptor, 5, BusinessAccountFlowExperiment$MemberDetailsScreen$DeleteMemberAlert$$serializer.INSTANCE, deleteMemberAlert);
                    i |= 32;
                    break;
                case 6:
                    amountLimitInputField = (BusinessAccountFlowExperiment.MemberDetailsScreen.AmountLimitInputField) b.A(serialDescriptor, 6, BusinessAccountFlowExperiment$MemberDetailsScreen$AmountLimitInputField$$serializer.INSTANCE, amountLimitInputField);
                    i |= 64;
                    break;
                case 7:
                    pickFromContactsButton = (BusinessAccountFlowExperiment.MemberDetailsScreen.PickFromContactsButton) b.A(serialDescriptor, 7, BusinessAccountFlowExperiment$MemberDetailsScreen$PickFromContactsButton$$serializer.INSTANCE, pickFromContactsButton);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return memberDetailsScreen;
            }
            memberDetailsScreen = null;
        }
        b.c(serialDescriptor);
        return new BusinessAccountFlowExperiment.MemberDetailsScreen(i, str, actionButton, nameInputField, enableLimitItem, phoneInputField, deleteMemberAlert, amountLimitInputField, pickFromContactsButton);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BusinessAccountFlowExperiment.MemberDetailsScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new BusinessAccountFlowExperiment.MemberDetailsScreen.ActionButton(0))) {
            b.e(serialDescriptor, 1, BusinessAccountFlowExperiment$MemberDetailsScreen$ActionButton$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new BusinessAccountFlowExperiment.MemberDetailsScreen.NameInputField(0))) {
            b.e(serialDescriptor, 2, BusinessAccountFlowExperiment$MemberDetailsScreen$NameInputField$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new BusinessAccountFlowExperiment.MemberDetailsScreen.EnableLimitItem(0))) {
            b.e(serialDescriptor, 3, BusinessAccountFlowExperiment$MemberDetailsScreen$EnableLimitItem$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new BusinessAccountFlowExperiment.MemberDetailsScreen.PhoneInputField(0))) {
            b.e(serialDescriptor, 4, BusinessAccountFlowExperiment$MemberDetailsScreen$PhoneInputField$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, new BusinessAccountFlowExperiment.MemberDetailsScreen.DeleteMemberAlert(0))) {
            b.e(serialDescriptor, 5, BusinessAccountFlowExperiment$MemberDetailsScreen$DeleteMemberAlert$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, new BusinessAccountFlowExperiment.MemberDetailsScreen.AmountLimitInputField(0))) {
            b.e(serialDescriptor, 6, BusinessAccountFlowExperiment$MemberDetailsScreen$AmountLimitInputField$$serializer.INSTANCE, value.g);
        }
        if (b.F() || !jl40.l(value.h, new BusinessAccountFlowExperiment.MemberDetailsScreen.PickFromContactsButton(0))) {
            b.e(serialDescriptor, 7, BusinessAccountFlowExperiment$MemberDetailsScreen$PickFromContactsButton$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
