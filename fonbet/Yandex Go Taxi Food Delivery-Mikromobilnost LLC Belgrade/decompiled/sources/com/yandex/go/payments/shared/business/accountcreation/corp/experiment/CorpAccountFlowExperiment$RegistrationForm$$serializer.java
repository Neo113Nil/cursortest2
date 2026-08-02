package com.yandex.go.payments.shared.business.accountcreation.corp.experiment;

import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment.RegistrationForm.$serializer", "Luxs;", "Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$RegistrationForm;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$RegistrationForm;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/shared/business/accountcreation/corp/experiment/CorpAccountFlowExperiment$RegistrationForm;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class CorpAccountFlowExperiment$RegistrationForm$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CorpAccountFlowExperiment$RegistrationForm$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CorpAccountFlowExperiment$RegistrationForm$$serializer corpAccountFlowExperiment$RegistrationForm$$serializer = new CorpAccountFlowExperiment$RegistrationForm$$serializer();
        INSTANCE = corpAccountFlowExperiment$RegistrationForm$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment.RegistrationForm", corpAccountFlowExperiment$RegistrationForm$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("business_account_item", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("accept_button", true);
        pluginGeneratedSerialDescriptor.j("description_text", true);
        pluginGeneratedSerialDescriptor.j("privacy_policy", true);
        pluginGeneratedSerialDescriptor.j("city_input_field", true);
        pluginGeneratedSerialDescriptor.j("email_input_field", true);
        pluginGeneratedSerialDescriptor.j("phone_input_field", true);
        pluginGeneratedSerialDescriptor.j("contact_input_field", true);
        pluginGeneratedSerialDescriptor.j("company_name_input_field", true);
        pluginGeneratedSerialDescriptor.j("create_account_error_dialog", true);
        pluginGeneratedSerialDescriptor.j("contract_type", true);
        pluginGeneratedSerialDescriptor.j("country", true);
        pluginGeneratedSerialDescriptor.j("create_account_utm", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CorpAccountFlowExperiment$RegistrationForm$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{CorpAccountFlowExperiment$BusinessAccountItem$$serializer.INSTANCE, auu0Var, auu0Var, CorpAccountFlowExperiment$AcceptButton$$serializer.INSTANCE, auu0Var, CorpAccountFlowExperiment$PrivacyPolicy$$serializer.INSTANCE, CorpAccountFlowExperiment$CityInputField$$serializer.INSTANCE, CorpAccountFlowExperiment$EmailInputField$$serializer.INSTANCE, CorpAccountFlowExperiment$PhoneInputField$$serializer.INSTANCE, CorpAccountFlowExperiment$ContactInputField$$serializer.INSTANCE, CorpAccountFlowExperiment$CompanyNameInputField$$serializer.INSTANCE, CorpAccountFlowExperiment$CreateAccountErrorDialog$$serializer.INSTANCE, auu0Var, auu0Var, CorpAccountFlowExperiment$CreateAccountUtm$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final CorpAccountFlowExperiment.RegistrationForm deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        CorpAccountFlowExperiment.CreateAccountErrorDialog createAccountErrorDialog = null;
        CorpAccountFlowExperiment.CompanyNameInputField companyNameInputField = null;
        CorpAccountFlowExperiment.ContactInputField contactInputField = null;
        CorpAccountFlowExperiment.CreateAccountUtm createAccountUtm = null;
        CorpAccountFlowExperiment.PhoneInputField phoneInputField = null;
        int i = 0;
        CorpAccountFlowExperiment.BusinessAccountItem businessAccountItem = null;
        String str4 = null;
        String str5 = null;
        CorpAccountFlowExperiment.AcceptButton acceptButton = null;
        String str6 = null;
        CorpAccountFlowExperiment.PrivacyPolicy privacyPolicy = null;
        CorpAccountFlowExperiment.CityInputField cityInputField = null;
        CorpAccountFlowExperiment.EmailInputField emailInputField = null;
        boolean z = true;
        String str7 = null;
        String str8 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    str3 = str4;
                    z = false;
                    str4 = str3;
                case 0:
                    str = str4;
                    str2 = str5;
                    businessAccountItem = (CorpAccountFlowExperiment.BusinessAccountItem) b.A(serialDescriptor, 0, CorpAccountFlowExperiment$BusinessAccountItem$$serializer.INSTANCE, businessAccountItem);
                    i |= 1;
                    str4 = str;
                    str5 = str2;
                case 1:
                    str2 = str5;
                    i |= 2;
                    str4 = b.k(serialDescriptor, 1);
                    str5 = str2;
                case 2:
                    str3 = str4;
                    str5 = b.k(serialDescriptor, 2);
                    i |= 4;
                    str4 = str3;
                case 3:
                    str = str4;
                    str2 = str5;
                    acceptButton = (CorpAccountFlowExperiment.AcceptButton) b.A(serialDescriptor, 3, CorpAccountFlowExperiment$AcceptButton$$serializer.INSTANCE, acceptButton);
                    i |= 8;
                    str4 = str;
                    str5 = str2;
                case 4:
                    str3 = str4;
                    str6 = b.k(serialDescriptor, 4);
                    i |= 16;
                    str4 = str3;
                case 5:
                    str = str4;
                    str2 = str5;
                    privacyPolicy = (CorpAccountFlowExperiment.PrivacyPolicy) b.A(serialDescriptor, 5, CorpAccountFlowExperiment$PrivacyPolicy$$serializer.INSTANCE, privacyPolicy);
                    i |= 32;
                    str4 = str;
                    str5 = str2;
                case 6:
                    str = str4;
                    str2 = str5;
                    cityInputField = (CorpAccountFlowExperiment.CityInputField) b.A(serialDescriptor, 6, CorpAccountFlowExperiment$CityInputField$$serializer.INSTANCE, cityInputField);
                    i |= 64;
                    str4 = str;
                    str5 = str2;
                case 7:
                    str = str4;
                    str2 = str5;
                    emailInputField = (CorpAccountFlowExperiment.EmailInputField) b.A(serialDescriptor, 7, CorpAccountFlowExperiment$EmailInputField$$serializer.INSTANCE, emailInputField);
                    i |= 128;
                    str4 = str;
                    str5 = str2;
                case 8:
                    str = str4;
                    str2 = str5;
                    phoneInputField = (CorpAccountFlowExperiment.PhoneInputField) b.A(serialDescriptor, 8, CorpAccountFlowExperiment$PhoneInputField$$serializer.INSTANCE, phoneInputField);
                    i |= 256;
                    str4 = str;
                    str5 = str2;
                case 9:
                    str = str4;
                    str2 = str5;
                    contactInputField = (CorpAccountFlowExperiment.ContactInputField) b.A(serialDescriptor, 9, CorpAccountFlowExperiment$ContactInputField$$serializer.INSTANCE, contactInputField);
                    i |= 512;
                    str4 = str;
                    str5 = str2;
                case 10:
                    str = str4;
                    str2 = str5;
                    companyNameInputField = (CorpAccountFlowExperiment.CompanyNameInputField) b.A(serialDescriptor, 10, CorpAccountFlowExperiment$CompanyNameInputField$$serializer.INSTANCE, companyNameInputField);
                    i |= 1024;
                    str4 = str;
                    str5 = str2;
                case 11:
                    str = str4;
                    str2 = str5;
                    createAccountErrorDialog = (CorpAccountFlowExperiment.CreateAccountErrorDialog) b.A(serialDescriptor, 11, CorpAccountFlowExperiment$CreateAccountErrorDialog$$serializer.INSTANCE, createAccountErrorDialog);
                    i |= 2048;
                    str4 = str;
                    str5 = str2;
                case 12:
                    str3 = str4;
                    str7 = b.k(serialDescriptor, 12);
                    i |= 4096;
                    str4 = str3;
                case 13:
                    str3 = str4;
                    str8 = b.k(serialDescriptor, 13);
                    i |= 8192;
                    str4 = str3;
                case 14:
                    str = str4;
                    str2 = str5;
                    createAccountUtm = (CorpAccountFlowExperiment.CreateAccountUtm) b.A(serialDescriptor, 14, CorpAccountFlowExperiment$CreateAccountUtm$$serializer.INSTANCE, createAccountUtm);
                    i |= 16384;
                    str4 = str;
                    str5 = str2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CorpAccountFlowExperiment.RegistrationForm(i, businessAccountItem, str4, str5, acceptButton, str6, privacyPolicy, cityInputField, emailInputField, phoneInputField, contactInputField, companyNameInputField, createAccountErrorDialog, str7, str8, createAccountUtm);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CorpAccountFlowExperiment.RegistrationForm value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new CorpAccountFlowExperiment.BusinessAccountItem(0))) {
            b.e(serialDescriptor, 0, CorpAccountFlowExperiment$BusinessAccountItem$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || !jl40.l(value.d, new CorpAccountFlowExperiment.AcceptButton(0))) {
            b.e(serialDescriptor, 3, CorpAccountFlowExperiment$AcceptButton$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, new CorpAccountFlowExperiment.PrivacyPolicy(0))) {
            b.e(serialDescriptor, 5, CorpAccountFlowExperiment$PrivacyPolicy$$serializer.INSTANCE, value.f);
        }
        if (b.F() || !jl40.l(value.g, new CorpAccountFlowExperiment.CityInputField(0))) {
            b.e(serialDescriptor, 6, CorpAccountFlowExperiment$CityInputField$$serializer.INSTANCE, value.g);
        }
        if (b.F() || !jl40.l(value.h, new CorpAccountFlowExperiment.EmailInputField(0))) {
            b.e(serialDescriptor, 7, CorpAccountFlowExperiment$EmailInputField$$serializer.INSTANCE, value.h);
        }
        if (b.F() || !jl40.l(value.i, new CorpAccountFlowExperiment.PhoneInputField(0))) {
            b.e(serialDescriptor, 8, CorpAccountFlowExperiment$PhoneInputField$$serializer.INSTANCE, value.i);
        }
        if (b.F() || !jl40.l(value.j, new CorpAccountFlowExperiment.ContactInputField(0))) {
            b.e(serialDescriptor, 9, CorpAccountFlowExperiment$ContactInputField$$serializer.INSTANCE, value.j);
        }
        if (b.F() || !jl40.l(value.k, new CorpAccountFlowExperiment.CompanyNameInputField(0))) {
            b.e(serialDescriptor, 10, CorpAccountFlowExperiment$CompanyNameInputField$$serializer.INSTANCE, value.k);
        }
        if (b.F() || !jl40.l(value.l, new CorpAccountFlowExperiment.CreateAccountErrorDialog(0))) {
            b.e(serialDescriptor, 11, CorpAccountFlowExperiment$CreateAccountErrorDialog$$serializer.INSTANCE, value.l);
        }
        if (b.F() || !jl40.l(value.m, "")) {
            b.o(serialDescriptor, 12, value.m);
        }
        if (b.F() || !jl40.l(value.n, "")) {
            b.o(serialDescriptor, 13, value.n);
        }
        if (b.F() || !jl40.l(value.o, new CorpAccountFlowExperiment.CreateAccountUtm(0))) {
            b.e(serialDescriptor, 14, CorpAccountFlowExperiment$CreateAccountUtm$$serializer.INSTANCE, value.o);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
