package com.yandex.go.multimodal_route.network.models;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.w7s;
import defpackage.yjd;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto.$serializer", "Luxs;", "Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/multimodal_route/network/models/TaxiTransportInfoResponseDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class TaxiTransportInfoResponseDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final TaxiTransportInfoResponseDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiTransportInfoResponseDto$$serializer taxiTransportInfoResponseDto$$serializer = new TaxiTransportInfoResponseDto$$serializer();
        INSTANCE = taxiTransportInfoResponseDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto", taxiTransportInfoResponseDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("taxi_order_id", true);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j("route_uris", false);
        pluginGeneratedSerialDescriptor.j("masstransit_route_uri", true);
        pluginGeneratedSerialDescriptor.j("taxi_complete_time", true);
        pluginGeneratedSerialDescriptor.j("taxi_feedback", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiTransportInfoResponseDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TaxiTransportInfoResponseDto.i;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(w7s.a), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[4].getValue(), qke.n(auu0Var), qke.n(vmt.a), qke.n(TaxiFeedbackDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final TaxiTransportInfoResponseDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiTransportInfoResponseDto.i;
        b.getClass();
        TaxiTransportInfoResponseDto taxiTransportInfoResponseDto = null;
        boolean z = true;
        TaxiFeedbackDto taxiFeedbackDto = null;
        String str = null;
        FormattedText formattedText = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        String str4 = null;
        Calendar calendar = null;
        int i = 0;
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
                    formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    calendar = (Calendar) b.s(serialDescriptor, 6, vmt.a, calendar);
                    i |= 64;
                    break;
                case 7:
                    taxiFeedbackDto = (TaxiFeedbackDto) b.s(serialDescriptor, 7, TaxiFeedbackDto$$serializer.INSTANCE, taxiFeedbackDto);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return taxiTransportInfoResponseDto;
            }
            taxiTransportInfoResponseDto = null;
        }
        b.c(serialDescriptor);
        return new TaxiTransportInfoResponseDto(i, str, formattedText, str2, str3, list, str4, calendar, taxiFeedbackDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiTransportInfoResponseDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TaxiTransportInfoResponseDto.i;
        String str = value.a;
        TaxiFeedbackDto taxiFeedbackDto = value.h;
        Calendar calendar = value.g;
        String str2 = value.f;
        String str3 = value.d;
        String str4 = value.c;
        FormattedText formattedText = value.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || formattedText != null) {
            b.g(serialDescriptor, 1, w7s.a, formattedText);
        }
        if (b.F() || str4 != null) {
            b.g(serialDescriptor, 2, auu0.a, str4);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 3, auu0.a, str3);
        }
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 5, auu0.a, str2);
        }
        if (b.F() || calendar != null) {
            b.g(serialDescriptor, 6, vmt.a, calendar);
        }
        if (b.F() || taxiFeedbackDto != null) {
            b.g(serialDescriptor, 7, TaxiFeedbackDto$$serializer.INSTANCE, taxiFeedbackDto);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
