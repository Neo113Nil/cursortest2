package com.yandex.go.zone.dto.objects;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.auu0;
import defpackage.hw11;
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
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/TariffUnavailable.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/TariffUnavailable;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/TariffUnavailable;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/TariffUnavailable;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TariffUnavailable$$serializer implements uxs {
    public static final TariffUnavailable$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TariffUnavailable$$serializer tariffUnavailable$$serializer = new TariffUnavailable$$serializer();
        INSTANCE = tariffUnavailable$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.TariffUnavailable", tariffUnavailable$$serializer, 11);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_CODE, true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("order_button_action", true);
        pluginGeneratedSerialDescriptor.j("preorder_unsupported", true);
        pluginGeneratedSerialDescriptor.j("show_price", true);
        pluginGeneratedSerialDescriptor.j("subtitle_back_icon", true);
        pluginGeneratedSerialDescriptor.j("fallback_tariff", true);
        pluginGeneratedSerialDescriptor.j("no_service_offered", true);
        pluginGeneratedSerialDescriptor.j("order_button_color", true);
        pluginGeneratedSerialDescriptor.j("order_button_text_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TariffUnavailable$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TariffUnavailable.l;
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(hw11.e);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[6].getValue());
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, n, z96Var, z96Var, n2, auu0Var, z96Var, n3, n4};
    }

    @Override // defpackage.myi
    public final TariffUnavailable deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffUnavailable.l;
        b.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        com.yandex.go.dto.response.d2 d2Var = null;
        boolean z2 = false;
        boolean z3 = false;
        SuffixSpanType suffixSpanType = null;
        String str6 = null;
        boolean z4 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str4 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str5 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d2Var = (com.yandex.go.dto.response.d2) b.s(serialDescriptor, 3, hw11.e, d2Var);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    suffixSpanType = (SuffixSpanType) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), suffixSpanType);
                    i |= 64;
                    break;
                case 7:
                    str6 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z4 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str2);
                    i |= 512;
                    break;
                case 10:
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TariffUnavailable(i, str3, str4, str5, d2Var, z2, z3, suffixSpanType, str6, z4, str2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TariffUnavailable value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TariffUnavailable.l;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, hw11.e, value.d);
        }
        if (b.F() || value.e) {
            b.n(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f) {
            b.n(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || value.i) {
            b.n(serialDescriptor, 8, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, auu0.a, value.k);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
