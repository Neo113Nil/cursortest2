package com.yandex.go.masstransit.sdk.order.impl.orders;

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
import defpackage.w7s;
import defpackage.x311;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/order/impl/orders/MasstransitTicketDto.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitTicketDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitTicketDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/order/impl/orders/MasstransitTicketDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MasstransitTicketDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MasstransitTicketDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MasstransitTicketDto$$serializer masstransitTicketDto$$serializer = new MasstransitTicketDto$$serializer();
        INSTANCE = masstransitTicketDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto", masstransitTicketDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("header", true);
        pluginGeneratedSerialDescriptor.j("transport_pass", true);
        pluginGeneratedSerialDescriptor.j("additional_info_title", true);
        pluginGeneratedSerialDescriptor.j("additional_info", true);
        pluginGeneratedSerialDescriptor.j("expiration_date", true);
        pluginGeneratedSerialDescriptor.j("expiration_title", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("is_valid", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MasstransitTicketDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MasstransitTicketDto.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, HeaderDto$$serializer.INSTANCE, x311.e, w7s.a, i3yVarArr[4].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final MasstransitTicketDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MasstransitTicketDto.j;
        b.getClass();
        Boolean bool = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        HeaderDto headerDto = null;
        x xVar = null;
        FormattedText formattedText = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    headerDto = (HeaderDto) b.A(serialDescriptor, 1, HeaderDto$$serializer.INSTANCE, headerDto);
                    i |= 2;
                    break;
                case 2:
                    xVar = (x) b.A(serialDescriptor, 2, x311.e, xVar);
                    i |= 4;
                    break;
                case 3:
                    formattedText = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                case 7:
                    str = (String) b.s(serialDescriptor, 7, auu0.a, str);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MasstransitTicketDto(i, str2, headerDto, xVar, formattedText, list, str3, str4, str, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MasstransitTicketDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MasstransitTicketDto.j;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, new HeaderDto(0))) {
            b.e(serialDescriptor, 1, HeaderDto$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, w.INSTANCE)) {
            b.e(serialDescriptor, 2, x311.e, value.c);
        }
        if (b.F() || !jl40.l(value.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, z96.a, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
