package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse;
import defpackage.auu0;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.yjd;
import defpackage.z96;
import java.util.Calendar;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse.CalculationDto.$serializer", "Luxs;", "Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse$CalculationDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse$CalculationDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsResponse$CalculationDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ScheduledOrderCalculationsResponse$CalculationDto$$serializer implements uxs {
    public static final ScheduledOrderCalculationsResponse$CalculationDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduledOrderCalculationsResponse$CalculationDto$$serializer scheduledOrderCalculationsResponse$CalculationDto$$serializer = new ScheduledOrderCalculationsResponse$CalculationDto$$serializer();
        INSTANCE = scheduledOrderCalculationsResponse$CalculationDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderCalculationsResponse.CalculationDto", scheduledOrderCalculationsResponse$CalculationDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("calculation_id", true);
        pluginGeneratedSerialDescriptor.j("is_ondemand", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("due", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("price_localized", true);
        pluginGeneratedSerialDescriptor.j("is_promo_price", true);
        pluginGeneratedSerialDescriptor.j("is_surge", true);
        pluginGeneratedSerialDescriptor.j("original_price_localized", true);
        pluginGeneratedSerialDescriptor.j("arrival_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScheduledOrderCalculationsResponse$CalculationDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScheduledOrderCalculationsResponse.CalculationDto.k;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        z96 z96Var = z96.a;
        KSerializer n2 = qke.n(z96Var);
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[2].getValue());
        vmt vmtVar = vmt.a;
        return new KSerializer[]{n, n2, n3, qke.n(vmtVar), qke.n(e6m.a), qke.n(auu0Var), qke.n(z96Var), qke.n(z96Var), qke.n(auu0Var), qke.n(vmtVar)};
    }

    @Override // defpackage.myi
    public final ScheduledOrderCalculationsResponse.CalculationDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = ScheduledOrderCalculationsResponse.CalculationDto.k;
        b.getClass();
        Calendar calendar = null;
        String str = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        String str2 = null;
        Boolean bool2 = null;
        ScheduledOrderCalculationsResponse.SlotType slotType = null;
        Calendar calendar2 = null;
        Double d = null;
        String str3 = null;
        Boolean bool3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 0, auu0.a, str2);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    slotType = (ScheduledOrderCalculationsResponse.SlotType) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), slotType);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    calendar2 = (Calendar) b.s(serialDescriptor, 3, vmt.a, calendar2);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    d = (Double) b.s(serialDescriptor, 4, e6m.a, d);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    bool3 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool3);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    bool = (Boolean) b.s(serialDescriptor, 7, z96.a, bool);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    calendar = (Calendar) b.s(serialDescriptor, 9, vmt.a, calendar);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new ScheduledOrderCalculationsResponse.CalculationDto(i, str2, bool2, slotType, calendar2, d, str3, bool3, bool, str, calendar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScheduledOrderCalculationsResponse.CalculationDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScheduledOrderCalculationsResponse.CalculationDto.k;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, Boolean.FALSE)) {
            b.g(serialDescriptor, 1, z96.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, vmt.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, e6m.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, z96.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, z96.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, vmt.a, value.j);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
