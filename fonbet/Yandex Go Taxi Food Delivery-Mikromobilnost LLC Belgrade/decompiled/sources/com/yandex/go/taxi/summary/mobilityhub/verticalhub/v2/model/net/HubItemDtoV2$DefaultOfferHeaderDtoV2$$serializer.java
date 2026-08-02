package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2.DefaultOfferHeaderDtoV2.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$DefaultOfferHeaderDtoV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$DefaultOfferHeaderDtoV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubItemDtoV2$DefaultOfferHeaderDtoV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer implements uxs {
    public static final int $stable = 0;
    public static final HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer hubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer = new HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer();
        INSTANCE = hubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubItemDtoV2.DefaultOfferHeaderDtoV2", hubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("selected_title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("center_text", true);
        pluginGeneratedSerialDescriptor.j("end_text", true);
        pluginGeneratedSerialDescriptor.j("selected_end_text", true);
        pluginGeneratedSerialDescriptor.j("end_text_min_width", true);
        pluginGeneratedSerialDescriptor.j("title_content_description", true);
        pluginGeneratedSerialDescriptor.j("subtitle_content_description", true);
        pluginGeneratedSerialDescriptor.j("center_text_content_description", true);
        pluginGeneratedSerialDescriptor.j("end_text_content_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private HubItemDtoV2$DefaultOfferHeaderDtoV2$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, w7sVar, w7sVar, w7sVar, w7sVar, h6w.a, n, n2, n3, n4};
    }

    @Override // defpackage.myi
    public final HubItemDtoV2$DefaultOfferHeaderDtoV2 deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        String str = null;
        String str2 = null;
        boolean z2 = true;
        String str3 = null;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        FormattedText formattedText6 = null;
        int i2 = 0;
        String str4 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText4);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText5);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    formattedText6 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText6);
                    i |= 32;
                    break;
                case 6:
                    i2 = b.h(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 8, auu0.a, str3);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 9, auu0.a, str2);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new HubItemDtoV2$DefaultOfferHeaderDtoV2(i, formattedText, formattedText2, formattedText3, formattedText4, formattedText5, formattedText6, i2, str4, str3, str2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HubItemDtoV2$DefaultOfferHeaderDtoV2 value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        v0 v0Var = HubItemDtoV2$DefaultOfferHeaderDtoV2.Companion;
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, value.e);
        }
        if (b.F() || !jl40.l(value.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, value.f);
        }
        if (b.F() || value.g != 0) {
            b.A(6, value.g, serialDescriptor);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, auu0.a, value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, auu0.a, value.i);
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
