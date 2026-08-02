package com.yandex.go.scooters.qr.unavailable_scooter.data.model;

import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall.$serializer", "Luxs;", "Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/qr/unavailable_scooter/data/model/ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer implements uxs {
    public static final ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer scootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer = new ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer();
        INSTANCE = scootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall", scootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("allowed_vendors", true);
        pluginGeneratedSerialDescriptor.j("allow_to_find_nearest", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersQrUnavailableScooterExperiment$AvailabilityCheckCall$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall.c[0].getValue(), z96.a};
    }

    @Override // defpackage.myi
    public final ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall(i, z2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScootersQrUnavailableScooterExperiment.AvailabilityCheckCall.c;
        if (b.F() || !jl40.l(value.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
