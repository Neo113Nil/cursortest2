package com.yandex.go.scooters.mosru.data.model;

import com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.$serializer", "Luxs;", "Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/mosru/data/model/ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer implements uxs {
    public static final ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer scootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer = new ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer();
        INSTANCE = scootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto", scootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("show_modal", true);
        pluginGeneratedSerialDescriptor.j("show_info_panel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$ShowModal$$serializer.INSTANCE), qke.n((KSerializer) ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.ShowModal showModal = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                showModal = (ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.ShowModal) b.s(serialDescriptor, 0, ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$ShowModal$$serializer.INSTANCE, showModal);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto(i, showModal, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.c;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ScootersMosRuIntegrationExperiment$RemainingRidesTriggersDto$ShowModal$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
