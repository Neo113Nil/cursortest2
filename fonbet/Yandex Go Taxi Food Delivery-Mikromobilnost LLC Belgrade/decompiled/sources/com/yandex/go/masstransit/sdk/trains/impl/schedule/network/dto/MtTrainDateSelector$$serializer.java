package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto;
import defpackage.auu0;
import defpackage.jl40;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelector.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelector;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelector;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelector;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MtTrainDateSelector$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MtTrainDateSelector$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MtTrainDateSelector$$serializer mtTrainDateSelector$$serializer = new MtTrainDateSelector$$serializer();
        INSTANCE = mtTrainDateSelector$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelector", mtTrainDateSelector$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("date_picker", true);
        pluginGeneratedSerialDescriptor.j("selected_date", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("selected_state", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MtTrainDateSelector$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        MtTrainFilterState$$serializer mtTrainFilterState$$serializer = MtTrainFilterState$$serializer.INSTANCE;
        return new KSerializer[]{MtTrainDateSelectorDto$DatePicker$$serializer.INSTANCE, auu0Var, mtTrainFilterState$$serializer, mtTrainFilterState$$serializer, n};
    }

    @Override // defpackage.myi
    public final MtTrainDateSelector deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        MtTrainDateSelectorDto.DatePicker datePicker = null;
        String str = null;
        MtTrainFilterState mtTrainFilterState = null;
        MtTrainFilterState mtTrainFilterState2 = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                datePicker = (MtTrainDateSelectorDto.DatePicker) b.A(serialDescriptor, 0, MtTrainDateSelectorDto$DatePicker$$serializer.INSTANCE, datePicker);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                mtTrainFilterState = (MtTrainFilterState) b.A(serialDescriptor, 2, MtTrainFilterState$$serializer.INSTANCE, mtTrainFilterState);
                i |= 4;
            } else if (v == 3) {
                mtTrainFilterState2 = (MtTrainFilterState) b.A(serialDescriptor, 3, MtTrainFilterState$$serializer.INSTANCE, mtTrainFilterState2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new MtTrainDateSelector(i, datePicker, str, mtTrainFilterState, mtTrainFilterState2, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, MtTrainDateSelector value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b bVar = MtTrainDateSelector.Companion;
        if (b.F() || !jl40.l(value.a, new MtTrainDateSelectorDto.DatePicker(0))) {
            b.e(serialDescriptor, 0, MtTrainDateSelectorDto$DatePicker$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        boolean F = b.F();
        MtTrainFilterState mtTrainFilterState = MtTrainFilterState.d;
        if (!F) {
            MtTrainFilterState mtTrainFilterState2 = value.c;
            MtTrainFilterState.Companion.getClass();
        }
        b.e(serialDescriptor, 2, MtTrainFilterState$$serializer.INSTANCE, value.c);
        if (!b.F()) {
            MtTrainFilterState mtTrainFilterState3 = value.d;
            MtTrainFilterState.Companion.getClass();
        }
        b.e(serialDescriptor, 3, MtTrainFilterState$$serializer.INSTANCE, value.d);
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
