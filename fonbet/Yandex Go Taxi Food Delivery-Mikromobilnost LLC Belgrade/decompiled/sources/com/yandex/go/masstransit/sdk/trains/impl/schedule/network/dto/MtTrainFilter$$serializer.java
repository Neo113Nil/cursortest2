package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.auu0;
import defpackage.jf40;
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
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainFilter.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainFilter;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainFilter;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainFilter;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MtTrainFilter$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MtTrainFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MtTrainFilter$$serializer mtTrainFilter$$serializer = new MtTrainFilter$$serializer();
        INSTANCE = mtTrainFilter$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainFilter", mtTrainFilter$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("selected_state", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MtTrainFilter$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        MtTrainFilterState$$serializer mtTrainFilterState$$serializer = MtTrainFilterState$$serializer.INSTANCE;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, mtTrainFilterState$$serializer, mtTrainFilterState$$serializer, jf40.e};
    }

    @Override // defpackage.myi
    public final MtTrainFilter deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        MtTrainFilterState mtTrainFilterState = null;
        MtTrainFilterState mtTrainFilterState2 = null;
        l lVar = null;
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
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    mtTrainFilterState = (MtTrainFilterState) b.A(serialDescriptor, 3, MtTrainFilterState$$serializer.INSTANCE, mtTrainFilterState);
                    i |= 8;
                    break;
                case 4:
                    mtTrainFilterState2 = (MtTrainFilterState) b.A(serialDescriptor, 4, MtTrainFilterState$$serializer.INSTANCE, mtTrainFilterState2);
                    i |= 16;
                    break;
                case 5:
                    lVar = (l) b.A(serialDescriptor, 5, jf40.e, lVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MtTrainFilter(i, str, str2, str3, mtTrainFilterState, mtTrainFilterState2, lVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (defpackage.jl40.l(r0, r1) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, MtTrainFilter value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        k kVar = MtTrainFilter.Companion;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        boolean F = b.F();
        MtTrainFilterState mtTrainFilterState = MtTrainFilterState.d;
        if (!F) {
            MtTrainFilterState mtTrainFilterState2 = value.d;
            MtTrainFilterState.Companion.getClass();
        }
        b.e(serialDescriptor, 3, MtTrainFilterState$$serializer.INSTANCE, value.d);
        if (!b.F()) {
            MtTrainFilterState mtTrainFilterState3 = value.e;
            MtTrainFilterState.Companion.getClass();
        }
        b.e(serialDescriptor, 4, MtTrainFilterState$$serializer.INSTANCE, value.e);
        if (b.F() || !jl40.l(value.f, a.INSTANCE)) {
            b.e(serialDescriptor, 5, jf40.e, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
