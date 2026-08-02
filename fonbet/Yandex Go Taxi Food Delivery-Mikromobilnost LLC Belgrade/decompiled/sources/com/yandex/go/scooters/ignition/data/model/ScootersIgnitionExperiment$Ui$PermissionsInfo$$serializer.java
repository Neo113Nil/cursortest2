package com.yandex.go.scooters.ignition.data.model;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment.Ui.PermissionsInfo.$serializer", "Luxs;", "Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$PermissionsInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$PermissionsInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/ignition/data/model/ScootersIgnitionExperiment$Ui$PermissionsInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScootersIgnitionExperiment$Ui$PermissionsInfo$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersIgnitionExperiment$Ui$PermissionsInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersIgnitionExperiment$Ui$PermissionsInfo$$serializer scootersIgnitionExperiment$Ui$PermissionsInfo$$serializer = new ScootersIgnitionExperiment$Ui$PermissionsInfo$$serializer();
        INSTANCE = scootersIgnitionExperiment$Ui$PermissionsInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment.Ui.PermissionsInfo", scootersIgnitionExperiment$Ui$PermissionsInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("notifications", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("bluetooth", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersIgnitionExperiment$Ui$PermissionsInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer scootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer = ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE;
        return new KSerializer[]{qke.n(scootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer), qke.n(scootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer), qke.n(scootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer)};
    }

    @Override // defpackage.myi
    public final ScootersIgnitionExperiment.Ui.PermissionsInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ScootersIgnitionExperiment.Ui.PermissionsInfoItem permissionsInfoItem = null;
        ScootersIgnitionExperiment.Ui.PermissionsInfoItem permissionsInfoItem2 = null;
        ScootersIgnitionExperiment.Ui.PermissionsInfoItem permissionsInfoItem3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                permissionsInfoItem = (ScootersIgnitionExperiment.Ui.PermissionsInfoItem) b.s(serialDescriptor, 0, ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE, permissionsInfoItem);
                i |= 1;
            } else if (v == 1) {
                permissionsInfoItem2 = (ScootersIgnitionExperiment.Ui.PermissionsInfoItem) b.s(serialDescriptor, 1, ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE, permissionsInfoItem2);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                permissionsInfoItem3 = (ScootersIgnitionExperiment.Ui.PermissionsInfoItem) b.s(serialDescriptor, 2, ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE, permissionsInfoItem3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ScootersIgnitionExperiment.Ui.PermissionsInfo(i, permissionsInfoItem, permissionsInfoItem2, permissionsInfoItem3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersIgnitionExperiment.Ui.PermissionsInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ScootersIgnitionExperiment$Ui$PermissionsInfoItem$$serializer.INSTANCE, value.c);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
