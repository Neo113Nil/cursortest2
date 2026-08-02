package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.data.model.ChargersAttributeDto;
import com.yandex.go.chargers.data.model.ChargersAttributeDto$$serializer;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersProgressImageParamsDto$$serializer;
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
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersProgressDiscountDetailsDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersProgressDiscountDetailsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/discounts/data/models/ChargersProgressDiscountDetailsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/discounts/data/models/ChargersProgressDiscountDetailsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersProgressDiscountDetailsDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersProgressDiscountDetailsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersProgressDiscountDetailsDto$$serializer chargersProgressDiscountDetailsDto$$serializer = new ChargersProgressDiscountDetailsDto$$serializer();
        INSTANCE = chargersProgressDiscountDetailsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto", chargersProgressDiscountDetailsDto$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("attribute", true);
        pluginGeneratedSerialDescriptor.j("lead_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("lead_progress_image_params", true);
        pluginGeneratedSerialDescriptor.j("lead_subtitle", true);
        pluginGeneratedSerialDescriptor.j("trail_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("trail_progress_image_params", true);
        pluginGeneratedSerialDescriptor.j("trail_subtitle", true);
        pluginGeneratedSerialDescriptor.j("steps_count", true);
        pluginGeneratedSerialDescriptor.j("current_step", true);
        pluginGeneratedSerialDescriptor.j("current_step_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("perks", true);
        pluginGeneratedSerialDescriptor.j("legal", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersProgressDiscountDetailsDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersProgressDiscountDetailsDto.p;
        w7s w7sVar = w7s.a;
        auu0 auu0Var = auu0.a;
        ChargersProgressImageParamsDto$$serializer chargersProgressImageParamsDto$$serializer = ChargersProgressImageParamsDto$$serializer.INSTANCE;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{w7sVar, w7sVar, qke.n(ChargersAttributeDto$$serializer.INSTANCE), qke.n(auu0Var), qke.n(chargersProgressImageParamsDto$$serializer), w7sVar, qke.n(auu0Var), qke.n(chargersProgressImageParamsDto$$serializer), w7sVar, h6wVar, h6wVar, qke.n(auu0Var), i3yVarArr[12].getValue(), w7sVar, qke.n(ChargersDiscountDetailsButtonDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final ChargersProgressDiscountDetailsDto deserialize(Decoder decoder) {
        FormattedText formattedText;
        FormattedText formattedText2;
        FormattedText formattedText3;
        List list;
        FormattedText formattedText4;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersProgressDiscountDetailsDto.p;
        b.getClass();
        FormattedText formattedText5 = null;
        List list2 = null;
        String str = null;
        FormattedText formattedText6 = null;
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto = null;
        ChargersProgressImageParamsDto chargersProgressImageParamsDto = null;
        int i = 0;
        FormattedText formattedText7 = null;
        FormattedText formattedText8 = null;
        ChargersAttributeDto chargersAttributeDto = null;
        String str2 = null;
        ChargersProgressImageParamsDto chargersProgressImageParamsDto2 = null;
        FormattedText formattedText9 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    formattedText3 = formattedText5;
                    list = list2;
                    z = false;
                    list2 = list;
                    formattedText5 = formattedText3;
                case 0:
                    formattedText3 = formattedText5;
                    list = list2;
                    formattedText7 = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText7);
                    i |= 1;
                    list2 = list;
                    formattedText5 = formattedText3;
                case 1:
                    formattedText3 = formattedText5;
                    formattedText8 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText8);
                    i |= 2;
                    formattedText7 = formattedText7;
                    formattedText5 = formattedText3;
                case 2:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    chargersAttributeDto = (ChargersAttributeDto) b.s(serialDescriptor, 2, ChargersAttributeDto$$serializer.INSTANCE, chargersAttributeDto);
                    i |= 4;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 3:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 4:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    chargersProgressImageParamsDto2 = (ChargersProgressImageParamsDto) b.s(serialDescriptor, 4, ChargersProgressImageParamsDto$$serializer.INSTANCE, chargersProgressImageParamsDto2);
                    i |= 16;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 5:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    formattedText9 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText9);
                    i |= 32;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 6:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    str3 = (String) b.s(serialDescriptor, 6, auu0.a, str3);
                    i |= 64;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 7:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    chargersProgressImageParamsDto = (ChargersProgressImageParamsDto) b.s(serialDescriptor, 7, ChargersProgressImageParamsDto$$serializer.INSTANCE, chargersProgressImageParamsDto);
                    i |= 128;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 8:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    formattedText6 = (FormattedText) b.A(serialDescriptor, 8, w7s.a, formattedText6);
                    i |= 256;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 9:
                    formattedText4 = formattedText7;
                    i2 = b.h(serialDescriptor, 9);
                    i |= 512;
                    formattedText7 = formattedText4;
                case 10:
                    formattedText4 = formattedText7;
                    i3 = b.h(serialDescriptor, 10);
                    i |= 1024;
                    formattedText7 = formattedText4;
                case 11:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    str = (String) b.s(serialDescriptor, 11, auu0.a, str);
                    i |= 2048;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 12:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    list2 = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list2);
                    i |= 4096;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 13:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 13, w7s.a, formattedText5);
                    i |= 8192;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                case 14:
                    formattedText = formattedText7;
                    formattedText2 = formattedText8;
                    chargersDiscountDetailsButtonDto = (ChargersDiscountDetailsButtonDto) b.s(serialDescriptor, 14, ChargersDiscountDetailsButtonDto$$serializer.INSTANCE, chargersDiscountDetailsButtonDto);
                    i |= 16384;
                    formattedText7 = formattedText;
                    formattedText8 = formattedText2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        List list3 = list2;
        b.c(serialDescriptor);
        return new ChargersProgressDiscountDetailsDto(i, formattedText7, formattedText8, chargersAttributeDto, str2, chargersProgressImageParamsDto2, formattedText9, str3, chargersProgressImageParamsDto, formattedText6, i2, i3, str, list3, formattedText5, chargersDiscountDetailsButtonDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersProgressDiscountDetailsDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersProgressDiscountDetailsDto.p;
        if (b.F() || !jl40.l(value.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, ChargersAttributeDto$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, ChargersProgressImageParamsDto$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, ChargersProgressImageParamsDto$$serializer.INSTANCE, value.h);
        }
        if (b.F() || !jl40.l(value.i, FormattedText.c)) {
            b.e(serialDescriptor, 8, w7s.a, value.i);
        }
        if (b.F() || value.j != 0) {
            b.A(9, value.j, serialDescriptor);
        }
        if (b.F() || value.k != 0) {
            b.A(10, value.k, serialDescriptor);
        }
        if (b.F() || value.l != null) {
            b.g(serialDescriptor, 11, auu0.a, value.l);
        }
        if (b.F() || !jl40.l(value.m, EmptyList.a)) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), value.m);
        }
        if (b.F() || !jl40.l(value.n, FormattedText.c)) {
            b.e(serialDescriptor, 13, w7s.a, value.n);
        }
        if (b.F() || value.o != null) {
            b.g(serialDescriptor, 14, ChargersDiscountDetailsButtonDto$$serializer.INSTANCE, value.o);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
