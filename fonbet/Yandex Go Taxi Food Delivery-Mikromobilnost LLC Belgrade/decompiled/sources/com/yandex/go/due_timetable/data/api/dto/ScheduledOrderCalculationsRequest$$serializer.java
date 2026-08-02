package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due.data.api.dto.DuePricingDataParam;
import com.yandex.go.due.data.api.dto.DuePricingDataParam$$serializer;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsRequest.$serializer", "Luxs;", "Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ScheduledOrderCalculationsRequest$$serializer implements uxs {
    public static final ScheduledOrderCalculationsRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduledOrderCalculationsRequest$$serializer scheduledOrderCalculationsRequest$$serializer = new ScheduledOrderCalculationsRequest$$serializer();
        INSTANCE = scheduledOrderCalculationsRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsRequest", scheduledOrderCalculationsRequest$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("due_timepoints", false);
        pluginGeneratedSerialDescriptor.j("with_ondemand", false);
        pluginGeneratedSerialDescriptor.j("pricing_data", false);
        pluginGeneratedSerialDescriptor.j("selected_class", false);
        pluginGeneratedSerialDescriptor.j("intercity_preorder_flow", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScheduledOrderCalculationsRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{ScheduledOrderCalculationsRequest.f[0].getValue(), qke.n(z96Var), DuePricingDataParam$$serializer.INSTANCE, auu0.a, qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final ScheduledOrderCalculationsRequest deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScheduledOrderCalculationsRequest.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        Boolean bool = null;
        DuePricingDataParam duePricingDataParam = null;
        String str = null;
        Boolean bool2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            } else if (v == 2) {
                duePricingDataParam = (DuePricingDataParam) b.A(serialDescriptor, 2, DuePricingDataParam$$serializer.INSTANCE, duePricingDataParam);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool2 = (Boolean) b.s(serialDescriptor, 4, z96.a, bool2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ScheduledOrderCalculationsRequest(i, list, bool, duePricingDataParam, str, bool2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScheduledOrderCalculationsRequest value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) ScheduledOrderCalculationsRequest.f[0].getValue(), value.a);
        z96 z96Var = z96.a;
        b.g(serialDescriptor, 1, z96Var, value.b);
        b.e(serialDescriptor, 2, DuePricingDataParam$$serializer.INSTANCE, value.c);
        b.o(serialDescriptor, 3, value.d);
        b.g(serialDescriptor, 4, z96Var, value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
