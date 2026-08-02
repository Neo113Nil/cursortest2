package com.yandex.go.due.data.api.dto;

import defpackage.auu0;
import defpackage.h6w;
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
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/due/data/api/dto/AllowedTimeInfo.$serializer", "Luxs;", "Lcom/yandex/go/due/data/api/dto/AllowedTimeInfo;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/due/data/api/dto/AllowedTimeInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/due/data/api/dto/AllowedTimeInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class AllowedTimeInfo$$serializer implements uxs {
    public static final AllowedTimeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AllowedTimeInfo$$serializer allowedTimeInfo$$serializer = new AllowedTimeInfo$$serializer();
        INSTANCE = allowedTimeInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.due.data.api.dto.AllowedTimeInfo", allowedTimeInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("interval_minutes", true);
        pluginGeneratedSerialDescriptor.j("precision_minutes", true);
        pluginGeneratedSerialDescriptor.j("allowed_time_ranges", true);
        pluginGeneratedSerialDescriptor.j("class", true);
        pluginGeneratedSerialDescriptor.j("price_prefetch", true);
        pluginGeneratedSerialDescriptor.j("default_time", true);
        pluginGeneratedSerialDescriptor.j("asap_time_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AllowedTimeInfo$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = AllowedTimeInfo.h;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, i3yVarArr[2].getValue(), auu0.a, qke.n(PricePrefetch$$serializer.INSTANCE), qke.n(vmt.a), qke.n(AsapTimeInfo$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final AllowedTimeInfo deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AllowedTimeInfo.h;
        b.getClass();
        AllowedTimeInfo allowedTimeInfo = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        List list = null;
        String str = null;
        PricePrefetch pricePrefetch = null;
        Calendar calendar = null;
        AsapTimeInfo asapTimeInfo = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    pricePrefetch = (PricePrefetch) b.s(serialDescriptor, 4, PricePrefetch$$serializer.INSTANCE, pricePrefetch);
                    i |= 16;
                    break;
                case 5:
                    calendar = (Calendar) b.s(serialDescriptor, 5, vmt.a, calendar);
                    i |= 32;
                    break;
                case 6:
                    asapTimeInfo = (AsapTimeInfo) b.s(serialDescriptor, 6, AsapTimeInfo$$serializer.INSTANCE, asapTimeInfo);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return allowedTimeInfo;
            }
            allowedTimeInfo = null;
        }
        b.c(serialDescriptor);
        return new AllowedTimeInfo(i, i2, i3, list, str, pricePrefetch, calendar, asapTimeInfo);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AllowedTimeInfo value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AllowedTimeInfo.h;
        if (b.F() || value.a != 5) {
            b.A(0, value.a, serialDescriptor);
        }
        if (b.F() || value.b != 0) {
            b.A(1, value.b, serialDescriptor);
        }
        if (b.F() || !jl40.l(value.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, PricePrefetch$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, vmt.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, AsapTimeInfo$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
