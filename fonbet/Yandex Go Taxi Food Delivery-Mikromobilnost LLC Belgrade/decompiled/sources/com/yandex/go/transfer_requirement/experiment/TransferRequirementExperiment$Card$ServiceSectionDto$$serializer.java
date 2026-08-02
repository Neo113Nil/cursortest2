package com.yandex.go.transfer_requirement.experiment;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment.Card.ServiceSectionDto.$serializer", "Luxs;", "Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TransferRequirementExperiment$Card$ServiceSectionDto$$serializer implements uxs {
    public static final TransferRequirementExperiment$Card$ServiceSectionDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TransferRequirementExperiment$Card$ServiceSectionDto$$serializer transferRequirementExperiment$Card$ServiceSectionDto$$serializer = new TransferRequirementExperiment$Card$ServiceSectionDto$$serializer();
        INSTANCE = transferRequirementExperiment$Card$ServiceSectionDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment.Card.ServiceSectionDto", transferRequirementExperiment$Card$ServiceSectionDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("number_info", true);
        pluginGeneratedSerialDescriptor.j("time_info", true);
        pluginGeneratedSerialDescriptor.j("carriage_number_info", true);
        pluginGeneratedSerialDescriptor.j("luggage_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TransferRequirementExperiment$Card$ServiceSectionDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer transferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer = TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer.INSTANCE;
        return new KSerializer[]{qke.n(transferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer), qke.n(transferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer), qke.n(TransferRequirementExperiment$Card$ServiceSectionDto$CarriageNumberInfoDto$$serializer.INSTANCE), qke.n(TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final TransferRequirementExperiment.Card.ServiceSectionDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto labeledIconInfoDto = null;
        TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto labeledIconInfoDto2 = null;
        TransferRequirementExperiment.Card.ServiceSectionDto.CarriageNumberInfoDto carriageNumberInfoDto = null;
        TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                labeledIconInfoDto = (TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto) b.s(serialDescriptor, 0, TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer.INSTANCE, labeledIconInfoDto);
                i |= 1;
            } else if (v == 1) {
                labeledIconInfoDto2 = (TransferRequirementExperiment.Card.ServiceSectionDto.LabeledIconInfoDto) b.s(serialDescriptor, 1, TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer.INSTANCE, labeledIconInfoDto2);
                i |= 2;
            } else if (v == 2) {
                carriageNumberInfoDto = (TransferRequirementExperiment.Card.ServiceSectionDto.CarriageNumberInfoDto) b.s(serialDescriptor, 2, TransferRequirementExperiment$Card$ServiceSectionDto$CarriageNumberInfoDto$$serializer.INSTANCE, carriageNumberInfoDto);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                luggageInfoDto = (TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto) b.s(serialDescriptor, 3, TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer.INSTANCE, luggageInfoDto);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new TransferRequirementExperiment.Card.ServiceSectionDto(i, labeledIconInfoDto, labeledIconInfoDto2, carriageNumberInfoDto, luggageInfoDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TransferRequirementExperiment.Card.ServiceSectionDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, TransferRequirementExperiment$Card$ServiceSectionDto$LabeledIconInfoDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, TransferRequirementExperiment$Card$ServiceSectionDto$CarriageNumberInfoDto$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer.INSTANCE, value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
