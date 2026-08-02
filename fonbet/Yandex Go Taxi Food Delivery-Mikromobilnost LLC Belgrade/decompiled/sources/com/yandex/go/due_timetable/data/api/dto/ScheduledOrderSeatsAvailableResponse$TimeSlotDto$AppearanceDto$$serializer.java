package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;
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
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.$serializer", "Luxs;", "Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer implements uxs {
    public static final ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer scheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer = new ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer();
        INSTANCE = scheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto", scheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer, 5);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("show_bar_time", true);
        pluginGeneratedSerialDescriptor.j("should_hide_time_banner", true);
        pluginGeneratedSerialDescriptor.j("banners", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.f;
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[3].getValue());
        KSerializer n3 = qke.n(ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceButtonDto$$serializer.INSTANCE);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, z96Var, z96Var, n2, n3};
    }

    @Override // defpackage.myi
    public final ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        List list = null;
        ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceButtonDto appearanceButtonDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                appearanceButtonDto = (ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceButtonDto) b.s(serialDescriptor, 4, ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceButtonDto$$serializer.INSTANCE, appearanceButtonDto);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto(i, str, z2, z3, list, appearanceButtonDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.f;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b) {
            b.n(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c) {
            b.n(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, ScheduledOrderSeatsAvailableResponse$TimeSlotDto$AppearanceDto$AppearanceButtonDto$$serializer.INSTANCE, value.e);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
