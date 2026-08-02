package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/discounts/data/models/ChargersPromoDetailsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersPromoDetailsDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersPromoDetailsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersPromoDetailsDto$$serializer chargersPromoDetailsDto$$serializer = new ChargersPromoDetailsDto$$serializer();
        INSTANCE = chargersPromoDetailsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto", chargersPromoDetailsDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("expiration", true);
        pluginGeneratedSerialDescriptor.j("usage", true);
        pluginGeneratedSerialDescriptor.j("stations_info", true);
        pluginGeneratedSerialDescriptor.j("legal", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersPromoDetailsDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, w7sVar, w7sVar, qke.n(ChargersPromoDetailsDto$PromoUsage$$serializer.INSTANCE), qke.n(w7sVar), w7sVar, qke.n(ChargersPromoDetailsDto$PromoDetailsButtonDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ChargersPromoDetailsDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        ChargersPromoDetailsDto.PromoUsage promoUsage = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        ChargersPromoDetailsDto.PromoDetailsButtonDto promoDetailsButtonDto = null;
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
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    promoUsage = (ChargersPromoDetailsDto.PromoUsage) b.s(serialDescriptor, 3, ChargersPromoDetailsDto$PromoUsage$$serializer.INSTANCE, promoUsage);
                    i |= 8;
                    break;
                case 4:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText3);
                    i |= 16;
                    break;
                case 5:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText4);
                    i |= 32;
                    break;
                case 6:
                    promoDetailsButtonDto = (ChargersPromoDetailsDto.PromoDetailsButtonDto) b.s(serialDescriptor, 6, ChargersPromoDetailsDto$PromoDetailsButtonDto$$serializer.INSTANCE, promoDetailsButtonDto);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ChargersPromoDetailsDto(i, str, formattedText, formattedText2, promoUsage, formattedText3, formattedText4, promoDetailsButtonDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersPromoDetailsDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, ChargersPromoDetailsDto$PromoUsage$$serializer.INSTANCE, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, w7s.a, value.e);
        }
        if (b.F() || !jl40.l(value.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ChargersPromoDetailsDto$PromoDetailsButtonDto$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
