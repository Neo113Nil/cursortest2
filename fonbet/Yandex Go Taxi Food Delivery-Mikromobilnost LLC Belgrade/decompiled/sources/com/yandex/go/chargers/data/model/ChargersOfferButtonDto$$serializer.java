package com.yandex.go.chargers.data.model;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.rcx;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/data/model/ChargersOfferButtonDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/data/model/ChargersOfferButtonDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/data/model/ChargersOfferButtonDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/data/model/ChargersOfferButtonDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersOfferButtonDto$$serializer implements uxs {
    public static final ChargersOfferButtonDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersOfferButtonDto$$serializer chargersOfferButtonDto$$serializer = new ChargersOfferButtonDto$$serializer();
        INSTANCE = chargersOfferButtonDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.data.model.ChargersOfferButtonDto", chargersOfferButtonDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("is_enabled", true);
        pluginGeneratedSerialDescriptor.j("args", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("purchase_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersOfferButtonDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersOfferButtonDto.h;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar), qke.n(z96.a), qke.n(rcx.a), qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n(auu0.a), qke.n(ChargersOfferButtonDto$PurchaseParamsDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ChargersOfferButtonDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersOfferButtonDto.h;
        b.getClass();
        ChargersOfferButtonDto chargersOfferButtonDto = null;
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        Boolean bool = null;
        kotlinx.serialization.json.b bVar = null;
        ChargersOfferButtonDto.Action action = null;
        String str = null;
        ChargersOfferButtonDto.PurchaseParamsDto purchaseParamsDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                    i |= 4;
                    break;
                case 3:
                    bVar = (kotlinx.serialization.json.b) b.s(serialDescriptor, 3, rcx.a, bVar);
                    i |= 8;
                    break;
                case 4:
                    action = (ChargersOfferButtonDto.Action) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), action);
                    i |= 16;
                    break;
                case 5:
                    str = (String) b.s(serialDescriptor, 5, auu0.a, str);
                    i |= 32;
                    break;
                case 6:
                    purchaseParamsDto = (ChargersOfferButtonDto.PurchaseParamsDto) b.s(serialDescriptor, 6, ChargersOfferButtonDto$PurchaseParamsDto$$serializer.INSTANCE, purchaseParamsDto);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return chargersOfferButtonDto;
            }
            chargersOfferButtonDto = null;
        }
        b.c(serialDescriptor);
        return new ChargersOfferButtonDto(i, formattedText, formattedText2, bool, bVar, action, str, purchaseParamsDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersOfferButtonDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersOfferButtonDto.h;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, z96.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, rcx.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ChargersOfferButtonDto$PurchaseParamsDto$$serializer.INSTANCE, value.g);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
