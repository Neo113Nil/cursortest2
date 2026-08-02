package com.yandex.go.due.data.api.dto;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due/data/api/dto/TimetableInfo.$serializer", "Luxs;", "Lcom/yandex/go/due/data/api/dto/TimetableInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due/data/api/dto/TimetableInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due/data/api/dto/TimetableInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class TimetableInfo$$serializer implements uxs {
    public static final TimetableInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TimetableInfo$$serializer timetableInfo$$serializer = new TimetableInfo$$serializer();
        INSTANCE = timetableInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due.data.api.dto.TimetableInfo", timetableInfo$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("title_calculation_in_progress", true);
        pluginGeneratedSerialDescriptor.j("title_calculation_failed", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("ondemand_tariff_override", true);
        pluginGeneratedSerialDescriptor.j("preorder_tariff_override", true);
        pluginGeneratedSerialDescriptor.j("hide_ondemand", true);
        pluginGeneratedSerialDescriptor.j("warn_about_departure_time", true);
        pluginGeneratedSerialDescriptor.j("ride_info", true);
        pluginGeneratedSerialDescriptor.j("days_low_price_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TimetableInfo$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TimetableInfo.j;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        TariffOverride$$serializer tariffOverride$$serializer = TariffOverride$$serializer.INSTANCE;
        KSerializer n4 = qke.n(tariffOverride$$serializer);
        KSerializer n5 = qke.n(tariffOverride$$serializer);
        z96 z96Var = z96.a;
        return new KSerializer[]{n, n2, n3, n4, n5, qke.n(z96Var), qke.n(z96Var), qke.n(RideInfo$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[8].getValue())};
    }

    @Override // defpackage.myi
    public final TimetableInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TimetableInfo.j;
        b.getClass();
        List list = null;
        boolean z = true;
        RideInfo rideInfo = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        TariffOverride tariffOverride = null;
        TariffOverride tariffOverride2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    tariffOverride = (TariffOverride) b.s(serialDescriptor, 3, TariffOverride$$serializer.INSTANCE, tariffOverride);
                    i |= 8;
                    break;
                case 4:
                    tariffOverride2 = (TariffOverride) b.s(serialDescriptor, 4, TariffOverride$$serializer.INSTANCE, tariffOverride2);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) b.s(serialDescriptor, 5, z96.a, bool);
                    i |= 32;
                    break;
                case 6:
                    bool2 = (Boolean) b.s(serialDescriptor, 6, z96.a, bool2);
                    i |= 64;
                    break;
                case 7:
                    rideInfo = (RideInfo) b.s(serialDescriptor, 7, RideInfo$$serializer.INSTANCE, rideInfo);
                    i |= 128;
                    break;
                case 8:
                    list = (List) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TimetableInfo(i, str, str2, str3, tariffOverride, tariffOverride2, bool, bool2, rideInfo, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TimetableInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TimetableInfo.j;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, TariffOverride$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, TariffOverride$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, z96.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, z96.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, RideInfo$$serializer.INSTANCE, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
