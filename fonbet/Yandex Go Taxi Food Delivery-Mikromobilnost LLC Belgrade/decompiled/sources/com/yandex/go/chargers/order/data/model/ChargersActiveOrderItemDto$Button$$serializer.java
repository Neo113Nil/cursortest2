package com.yandex.go.chargers.order.data.model;

import defpackage.auu0;
import defpackage.bk9;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderItemDto.Button.$serializer", "Luxs;", "Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderItemDto$Button;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderItemDto$Button;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderItemDto$Button;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersActiveOrderItemDto$Button$$serializer implements uxs {
    public static final ChargersActiveOrderItemDto$Button$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersActiveOrderItemDto$Button$$serializer chargersActiveOrderItemDto$Button$$serializer = new ChargersActiveOrderItemDto$Button$$serializer();
        INSTANCE = chargersActiveOrderItemDto$Button$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto.Button", chargersActiveOrderItemDto$Button$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("lead_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("show_timer", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_square", true);
        pluginGeneratedSerialDescriptor.j("mode_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersActiveOrderItemDto$Button$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{w7s.a, auu0Var, qke.n(z96Var), bk9.e, auu0Var, z96Var, z96Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final ChargersActiveOrderItemDto$Button deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ChargersActiveOrderItemDto$Button chargersActiveOrderItemDto$Button = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        FormattedText formattedText = null;
        String str = null;
        Boolean bool = null;
        o oVar = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                    i |= 4;
                    break;
                case 3:
                    oVar = (o) b.A(serialDescriptor, 3, bk9.e, oVar);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z2 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z3 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) b.s(serialDescriptor, 7, auu0.a, str3);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return chargersActiveOrderItemDto$Button;
            }
            chargersActiveOrderItemDto$Button = null;
        }
        b.c(serialDescriptor);
        return new ChargersActiveOrderItemDto$Button(i, formattedText, str, bool, oVar, str2, z2, z3, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersActiveOrderItemDto$Button value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, z96.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, n.INSTANCE)) {
            b.e(serialDescriptor, 3, bk9.e, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
