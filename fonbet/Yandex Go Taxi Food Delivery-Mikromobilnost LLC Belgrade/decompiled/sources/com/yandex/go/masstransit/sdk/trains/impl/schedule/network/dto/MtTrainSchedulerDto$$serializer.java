package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainSchedulerDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MtTrainSchedulerDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MtTrainSchedulerDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MtTrainSchedulerDto$$serializer mtTrainSchedulerDto$$serializer = new MtTrainSchedulerDto$$serializer();
        INSTANCE = mtTrainSchedulerDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainSchedulerDto", mtTrainSchedulerDto$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("departure_time", true);
        pluginGeneratedSerialDescriptor.j("arrival_time", true);
        pluginGeneratedSerialDescriptor.j("departure_track", true);
        pluginGeneratedSerialDescriptor.j("arrival_track", true);
        pluginGeneratedSerialDescriptor.j("route_time", true);
        pluginGeneratedSerialDescriptor.j("transport_type", true);
        pluginGeneratedSerialDescriptor.j("route_name", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("purchase_button_title", true);
        pluginGeneratedSerialDescriptor.j("is_trip_creating_available", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("details_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MtTrainSchedulerDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MtTrainSchedulerDto.n;
        w7s w7sVar = w7s.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), MtTrainNotification$$serializer.INSTANCE, qke.n(w7sVar), z96Var, z96Var, i3yVarArr[11].getValue(), i3yVarArr[12].getValue()};
    }

    @Override // defpackage.myi
    public final MtTrainSchedulerDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = MtTrainSchedulerDto.n;
        b.getClass();
        Map map = null;
        Map map2 = null;
        FormattedText formattedText = null;
        boolean z2 = true;
        MtTrainNotification mtTrainNotification = null;
        int i = 0;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        FormattedText formattedText6 = null;
        FormattedText formattedText7 = null;
        FormattedText formattedText8 = null;
        boolean z3 = false;
        boolean z4 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText2);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText3);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 2:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText4 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText4);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText5 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText5);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText6 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText6);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 5:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText7 = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText7);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 6:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText8 = (FormattedText) b.s(serialDescriptor, 6, w7s.a, formattedText8);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 7:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    mtTrainNotification = (MtTrainNotification) b.A(serialDescriptor, 7, MtTrainNotification$$serializer.INSTANCE, mtTrainNotification);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 8:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText = (FormattedText) b.s(serialDescriptor, 8, w7s.a, formattedText);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z3 = b.C(serialDescriptor, 9);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr2;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z4 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    map2 = (Map) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), map2);
                    i |= 2048;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 12:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    map = (Map) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), map);
                    i |= 4096;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MtTrainSchedulerDto(i, formattedText2, formattedText3, formattedText4, formattedText5, formattedText6, formattedText7, formattedText8, mtTrainNotification, formattedText, z3, z4, map2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainNotification.c) == false) goto L49;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, MtTrainSchedulerDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MtTrainSchedulerDto.n;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, w7s.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, w7s.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, w7s.a, value.g);
        }
        if (!b.F()) {
            MtTrainNotification mtTrainNotification = value.h;
            MtTrainNotification.Companion.getClass();
        }
        b.e(serialDescriptor, 7, MtTrainNotification$$serializer.INSTANCE, value.h);
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, w7s.a, value.i);
        }
        if (b.F() || !value.j) {
            b.n(serialDescriptor, 9, value.j);
        }
        if (b.F() || value.k) {
            b.n(serialDescriptor, 10, value.k);
        }
        if (b.F() || !jl40.l(value.l, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), value.l);
        }
        if (b.F() || !jl40.l(value.m, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), value.m);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
