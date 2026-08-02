package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferHeaderDto.$serializer", "Luxs;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferHeaderDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferHeaderDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/DefaultOfferHeaderDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class DefaultOfferHeaderDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final DefaultOfferHeaderDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DefaultOfferHeaderDto$$serializer defaultOfferHeaderDto$$serializer = new DefaultOfferHeaderDto$$serializer();
        INSTANCE = defaultOfferHeaderDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.DefaultOfferHeaderDto", defaultOfferHeaderDto$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("center_text", true);
        pluginGeneratedSerialDescriptor.j("end_text", true);
        pluginGeneratedSerialDescriptor.j("end_text_min_width", true);
        pluginGeneratedSerialDescriptor.j("title_content_description", true);
        pluginGeneratedSerialDescriptor.j("subtitle_content_description", true);
        pluginGeneratedSerialDescriptor.j("center_text_content_description", true);
        pluginGeneratedSerialDescriptor.j("end_text_content_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DefaultOfferHeaderDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(auu0Var);
        KSerializer n3 = qke.n(auu0Var);
        KSerializer n4 = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, w7sVar, w7sVar, h6w.a, n, n2, n3, n4};
    }

    @Override // defpackage.myi
    public final DefaultOfferHeaderDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        DefaultOfferHeaderDto defaultOfferHeaderDto = null;
        boolean z = true;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText4);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.s(serialDescriptor, 5, auu0.a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) b.s(serialDescriptor, 7, auu0.a, str4);
                    i |= 128;
                    break;
                case 8:
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return defaultOfferHeaderDto;
            }
            defaultOfferHeaderDto = null;
        }
        b.c(serialDescriptor);
        return new DefaultOfferHeaderDto(i, formattedText, formattedText2, formattedText3, formattedText4, i2, str2, str3, str4, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DefaultOfferHeaderDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        f fVar = DefaultOfferHeaderDto.Companion;
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
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
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
            b.g(serialDescriptor, 8, auu0.a, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
