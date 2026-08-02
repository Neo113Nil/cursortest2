package com.yandex.go.chargers.tariff_item_info.api.data.model;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto;
import defpackage.auu0;
import defpackage.bxa;
import defpackage.cxa;
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
import defpackage.zwa;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/tariff_item_info/api/data/model/ChargersTariffDetailItemDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersTariffDetailItemDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersTariffDetailItemDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersTariffDetailItemDto$$serializer chargersTariffDetailItemDto$$serializer = new ChargersTariffDetailItemDto$$serializer();
        INSTANCE = chargersTariffDetailItemDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto", chargersTariffDetailItemDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("value_action", true);
        pluginGeneratedSerialDescriptor.j("hint", true);
        pluginGeneratedSerialDescriptor.j("is_hidden", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersTariffDetailItemDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersTariffDetailItemDto.i;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, w7sVar, qke.n(w7sVar), qke.n(w7sVar), zwa.e, qke.n(ChargersTariffDetailItemDto$Hint$$serializer.INSTANCE), z96.a, i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final ChargersTariffDetailItemDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersTariffDetailItemDto.i;
        b.getClass();
        ChargersTariffDetailItemDto chargersTariffDetailItemDto = null;
        boolean z = true;
        ChargersTariffDetailItemDto.Type type = null;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        cxa cxaVar = null;
        ChargersTariffDetailItemDto.Hint hint = null;
        int i = 0;
        boolean z2 = false;
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
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    cxaVar = (cxa) b.A(serialDescriptor, 4, zwa.e, cxaVar);
                    i |= 16;
                    break;
                case 5:
                    hint = (ChargersTariffDetailItemDto.Hint) b.s(serialDescriptor, 5, ChargersTariffDetailItemDto$Hint$$serializer.INSTANCE, hint);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    type = (ChargersTariffDetailItemDto.Type) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), type);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return chargersTariffDetailItemDto;
            }
            chargersTariffDetailItemDto = null;
        }
        b.c(serialDescriptor);
        return new ChargersTariffDetailItemDto(i, str, formattedText, formattedText2, formattedText3, cxaVar, hint, z2, type);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersTariffDetailItemDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersTariffDetailItemDto.i;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || !jl40.l(value.e, bxa.INSTANCE)) {
            b.e(serialDescriptor, 4, zwa.e, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, ChargersTariffDetailItemDto$Hint$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g) {
            b.n(serialDescriptor, 6, value.g);
        }
        if (b.F() || value.h != ChargersTariffDetailItemDto.Type.TARIFF_DETAIL) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
