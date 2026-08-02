package com.yandex.go.transfer_requirement.experiment;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment.Card.$serializer", "Luxs;", "Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TransferRequirementExperiment$Card$$serializer implements uxs {
    public static final TransferRequirementExperiment$Card$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TransferRequirementExperiment$Card$$serializer transferRequirementExperiment$Card$$serializer = new TransferRequirementExperiment$Card$$serializer();
        INSTANCE = transferRequirementExperiment$Card$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment.Card", transferRequirementExperiment$Card$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("date_picker", true);
        pluginGeneratedSerialDescriptor.j("service_section", true);
        pluginGeneratedSerialDescriptor.j("meeting_section", true);
        pluginGeneratedSerialDescriptor.j("rules_section", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TransferRequirementExperiment$Card$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(TransferRequirementExperiment$Card$DatePicker$$serializer.INSTANCE), qke.n(TransferRequirementExperiment$Card$ServiceSectionDto$$serializer.INSTANCE), qke.n(TransferRequirementExperiment$Card$MeetingSectionDto$$serializer.INSTANCE), qke.n(TransferRequirementExperiment$Card$RulesSectionDto$$serializer.INSTANCE), qke.n(TransferRequirementExperiment$Card$ActionButtonDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final TransferRequirementExperiment.Card deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        TransferRequirementExperiment.Card.DatePicker datePicker = null;
        TransferRequirementExperiment.Card.ServiceSectionDto serviceSectionDto = null;
        TransferRequirementExperiment.Card.MeetingSectionDto meetingSectionDto = null;
        TransferRequirementExperiment.Card.RulesSectionDto rulesSectionDto = null;
        TransferRequirementExperiment.Card.ActionButtonDto actionButtonDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    datePicker = (TransferRequirementExperiment.Card.DatePicker) b.s(serialDescriptor, 1, TransferRequirementExperiment$Card$DatePicker$$serializer.INSTANCE, datePicker);
                    i |= 2;
                    break;
                case 2:
                    serviceSectionDto = (TransferRequirementExperiment.Card.ServiceSectionDto) b.s(serialDescriptor, 2, TransferRequirementExperiment$Card$ServiceSectionDto$$serializer.INSTANCE, serviceSectionDto);
                    i |= 4;
                    break;
                case 3:
                    meetingSectionDto = (TransferRequirementExperiment.Card.MeetingSectionDto) b.s(serialDescriptor, 3, TransferRequirementExperiment$Card$MeetingSectionDto$$serializer.INSTANCE, meetingSectionDto);
                    i |= 8;
                    break;
                case 4:
                    rulesSectionDto = (TransferRequirementExperiment.Card.RulesSectionDto) b.s(serialDescriptor, 4, TransferRequirementExperiment$Card$RulesSectionDto$$serializer.INSTANCE, rulesSectionDto);
                    i |= 16;
                    break;
                case 5:
                    actionButtonDto = (TransferRequirementExperiment.Card.ActionButtonDto) b.s(serialDescriptor, 5, TransferRequirementExperiment$Card$ActionButtonDto$$serializer.INSTANCE, actionButtonDto);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TransferRequirementExperiment.Card(i, str, datePicker, serviceSectionDto, meetingSectionDto, rulesSectionDto, actionButtonDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TransferRequirementExperiment.Card value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, TransferRequirementExperiment$Card$DatePicker$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, TransferRequirementExperiment$Card$ServiceSectionDto$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, TransferRequirementExperiment$Card$MeetingSectionDto$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, TransferRequirementExperiment$Card$RulesSectionDto$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, TransferRequirementExperiment$Card$ActionButtonDto$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
