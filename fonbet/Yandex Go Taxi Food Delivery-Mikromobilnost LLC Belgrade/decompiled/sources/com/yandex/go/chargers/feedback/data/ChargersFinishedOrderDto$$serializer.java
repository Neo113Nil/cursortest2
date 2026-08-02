package com.yandex.go.chargers.feedback.data;

import com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto;
import com.yandex.go.chargers.surge.data.ChargersSurgeModalDto$$serializer;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/feedback/data/ChargersFinishedOrderDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/feedback/data/ChargersFinishedOrderDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/feedback/data/ChargersFinishedOrderDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/feedback/data/ChargersFinishedOrderDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersFinishedOrderDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersFinishedOrderDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersFinishedOrderDto$$serializer chargersFinishedOrderDto$$serializer = new ChargersFinishedOrderDto$$serializer();
        INSTANCE = chargersFinishedOrderDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.feedback.data.ChargersFinishedOrderDto", chargersFinishedOrderDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("powerbank_number", true);
        pluginGeneratedSerialDescriptor.j("powerbank_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("surge_modal", true);
        pluginGeneratedSerialDescriptor.j("is_rating_enabled", true);
        pluginGeneratedSerialDescriptor.j("finishing_stage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersFinishedOrderDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersFinishedOrderDto.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), ChargersOrderDetailsDto$$serializer.INSTANCE, qke.n(ChargersSurgeModalDto$$serializer.INSTANCE), qke.n(z96.a), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final ChargersFinishedOrderDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersFinishedOrderDto.h;
        b.getClass();
        ChargersFinishedOrderDto chargersFinishedOrderDto = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        ChargersOrderDetailsDto chargersOrderDetailsDto = null;
        ChargersSurgeModalDto chargersSurgeModalDto = null;
        Boolean bool = null;
        ChargersFinishedOrderDto.FinishingStage finishingStage = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    chargersOrderDetailsDto = (ChargersOrderDetailsDto) b.A(serialDescriptor, 3, ChargersOrderDetailsDto$$serializer.INSTANCE, chargersOrderDetailsDto);
                    i |= 8;
                    break;
                case 4:
                    chargersSurgeModalDto = (ChargersSurgeModalDto) b.s(serialDescriptor, 4, ChargersSurgeModalDto$$serializer.INSTANCE, chargersSurgeModalDto);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) b.s(serialDescriptor, 5, z96.a, bool);
                    i |= 32;
                    break;
                case 6:
                    finishingStage = (ChargersFinishedOrderDto.FinishingStage) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), finishingStage);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return chargersFinishedOrderDto;
            }
            chargersFinishedOrderDto = null;
        }
        b.c(serialDescriptor);
        return new ChargersFinishedOrderDto(i, str, str2, str3, chargersOrderDetailsDto, chargersSurgeModalDto, bool, finishingStage);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersFinishedOrderDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersFinishedOrderDto.h;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, new ChargersOrderDetailsDto(0))) {
            b.e(serialDescriptor, 3, ChargersOrderDetailsDto$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, ChargersSurgeModalDto$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, z96.a, value.f);
        }
        if (b.F() || value.g != ChargersFinishedOrderDto.FinishingStage.DEFAULT) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
