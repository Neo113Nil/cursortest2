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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/BusinessAccountFlowExperiment.AddMemberScreen.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/BusinessAccountFlowExperiment$AddMemberScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class BusinessAccountFlowExperiment$AddMemberScreen$$serializer implements uxs {
    public static final int $stable = 0;
    public static final BusinessAccountFlowExperiment$AddMemberScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BusinessAccountFlowExperiment$AddMemberScreen$$serializer businessAccountFlowExperiment$AddMemberScreen$$serializer = new BusinessAccountFlowExperiment$AddMemberScreen$$serializer();
        INSTANCE = businessAccountFlowExperiment$AddMemberScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment.AddMemberScreen", businessAccountFlowExperiment$AddMemberScreen$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("contact_pick_permission_error_message", true);
        pluginGeneratedSerialDescriptor.j("name_input_field", true);
        pluginGeneratedSerialDescriptor.j("phone_input_field", true);
        pluginGeneratedSerialDescriptor.j("pick_from_contacts_item", true);
        pluginGeneratedSerialDescriptor.j("invite_button", true);
        pluginGeneratedSerialDescriptor.j("unregistered_error_alert", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BusinessAccountFlowExperiment$AddMemberScreen$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, BusinessAccountFlowExperiment$AddMemberScreen$NameInputField$$serializer.INSTANCE, BusinessAccountFlowExperiment$AddMemberScreen$PhoneInputField$$serializer.INSTANCE, BusinessAccountFlowExperiment$AddMemberScreen$PickFromContactsItem$$serializer.INSTANCE, BusinessAccountFlowExperiment$AddMemberScreen$InviteButton$$serializer.INSTANCE, BusinessAccountFlowExperiment$AddMemberScreen$UnregisteredErrorAlert$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final BusinessAccountFlowExperiment.AddMemberScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        BusinessAccountFlowExperiment.AddMemberScreen.NameInputField nameInputField = null;
        BusinessAccountFlowExperiment.AddMemberScreen.PhoneInputField phoneInputField = null;
        BusinessAccountFlowExperiment.AddMemberScreen.PickFromContactsItem pickFromContactsItem = null;
        BusinessAccountFlowExperiment.AddMemberScreen.InviteButton inviteButton = null;
        BusinessAccountFlowExperiment.AddMemberScreen.UnregisteredErrorAlert unregisteredErrorAlert = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    nameInputField = (BusinessAccountFlowExperiment.AddMemberScreen.NameInputField) b.A(serialDescriptor, 2, BusinessAccountFlowExperiment$AddMemberScreen$NameInputField$$serializer.INSTANCE, nameInputField);
                    i |= 4;
                    break;
                case 3:
                    phoneInputField = (BusinessAccountFlowExperiment.AddMemberScreen.PhoneInputField) b.A(serialDescriptor, 3, BusinessAccountFlowExperiment$AddMemberScreen$PhoneInputField$$serializer.INSTANCE, phoneInputField);
                    i |= 8;
                    break;
                case 4:
                    pickFromContactsItem = (BusinessAccountFlowExperiment.AddMemberScreen.PickFromContactsItem) b.A(serialDescriptor, 4, BusinessAccountFlowExperiment$AddMemberScreen$PickFromContactsItem$$serializer.INSTANCE, pickFromContactsItem);
                    i |= 16;
                    break;
                case 5:
                    inviteButton = (BusinessAccountFlowExperiment.AddMemberScreen.InviteButton) b.A(serialDescriptor, 5, BusinessAccountFlowExperiment$AddMemberScreen$InviteButton$$serializer.INSTANCE, inviteButton);
                    i |= 32;
                    break;
                case 6:
                    unregisteredErrorAlert = (BusinessAccountFlowExperiment.AddMemberScreen.UnregisteredErrorAlert) b.A(serialDescriptor, 6, BusinessAccountFlowExperiment$AddMemberScreen$UnregisteredErrorAlert$$serializer.INSTANCE, unregisteredErrorAlert);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new BusinessAccountFlowExperiment.AddMemberScreen(i, str, str2, nameInputField, phoneInputField, pickFromContactsItem, inviteButton, unregisteredErrorAlert);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BusinessAccountFlowExperiment.AddMemberScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, new BusinessAccountFlowExperiment.AddMemberScreen.NameInputField(0))) {
            b.e(serialDescriptor, 2, BusinessAccountFlowExperiment$AddMemberScreen$NameInputField$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new BusinessAccountFlowExperiment.AddMemberScreen.PhoneInputField(0))) {
            b.e(serialDescriptor, 3, BusinessAccountFlowExperiment$AddMemberScreen$PhoneInputField$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new BusinessAccountFlowExperiment.AddMemberScreen.PickFromContactsItem(0))) {
            b.e(serialDescriptor, 4, BusinessAccountFlowExperiment$AddMemberScreen$PickFromContactsItem$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, new BusinessAccountFlowExperiment.AddMemberScreen.InviteButton(0))) {
            b.e(serialDescriptor, 5, BusinessAccountFlowExperiment$AddMemberScreen$InviteButton$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, new BusinessAccountFlowExperiment.AddMemberScreen.UnregisteredErrorAlert(0))) {
            b.e(serialDescriptor, 6, BusinessAccountFlowExperiment$AddMemberScreen$UnregisteredErrorAlert$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
