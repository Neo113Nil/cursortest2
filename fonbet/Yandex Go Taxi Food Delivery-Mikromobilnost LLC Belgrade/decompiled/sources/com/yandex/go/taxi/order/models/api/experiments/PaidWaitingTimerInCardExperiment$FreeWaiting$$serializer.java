package com.yandex.go.taxi.order.models.api.experiments;

import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment.FreeWaiting.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$FreeWaiting;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$FreeWaiting;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/experiments/PaidWaitingTimerInCardExperiment$FreeWaiting;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class PaidWaitingTimerInCardExperiment$FreeWaiting$$serializer implements uxs {
    public static final PaidWaitingTimerInCardExperiment$FreeWaiting$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaidWaitingTimerInCardExperiment$FreeWaiting$$serializer paidWaitingTimerInCardExperiment$FreeWaiting$$serializer = new PaidWaitingTimerInCardExperiment$FreeWaiting$$serializer();
        INSTANCE = paidWaitingTimerInCardExperiment$FreeWaiting$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment.FreeWaiting", paidWaitingTimerInCardExperiment$FreeWaiting$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("show_timer", true);
        pluginGeneratedSerialDescriptor.j("normal_state", true);
        pluginGeneratedSerialDescriptor.j("expiring_state", true);
        pluginGeneratedSerialDescriptor.j("expiring_state_start_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaidWaitingTimerInCardExperiment$FreeWaiting$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        PaidWaitingTimerInCardExperiment$State$$serializer paidWaitingTimerInCardExperiment$State$$serializer = PaidWaitingTimerInCardExperiment$State$$serializer.INSTANCE;
        return new KSerializer[]{z96.a, qke.n(paidWaitingTimerInCardExperiment$State$$serializer), qke.n(paidWaitingTimerInCardExperiment$State$$serializer), h6w.a};
    }

    @Override // defpackage.myi
    public final PaidWaitingTimerInCardExperiment.FreeWaiting deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        PaidWaitingTimerInCardExperiment.State state = null;
        PaidWaitingTimerInCardExperiment.State state2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                state = (PaidWaitingTimerInCardExperiment.State) b.s(serialDescriptor, 1, PaidWaitingTimerInCardExperiment$State$$serializer.INSTANCE, state);
                i |= 2;
            } else if (v == 2) {
                state2 = (PaidWaitingTimerInCardExperiment.State) b.s(serialDescriptor, 2, PaidWaitingTimerInCardExperiment$State$$serializer.INSTANCE, state2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new PaidWaitingTimerInCardExperiment.FreeWaiting(i, z2, state, state2, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaidWaitingTimerInCardExperiment.FreeWaiting value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a) {
            b.n(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, PaidWaitingTimerInCardExperiment$State$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, PaidWaitingTimerInCardExperiment$State$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != 0) {
            b.A(3, value.d, serialDescriptor);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
