package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersTaskDiscountDetailsDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersTaskDiscountDetailsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/discounts/data/models/ChargersTaskDiscountDetailsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/discounts/data/models/ChargersTaskDiscountDetailsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersTaskDiscountDetailsDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersTaskDiscountDetailsDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersTaskDiscountDetailsDto$$serializer chargersTaskDiscountDetailsDto$$serializer = new ChargersTaskDiscountDetailsDto$$serializer();
        INSTANCE = chargersTaskDiscountDetailsDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.discounts.data.models.ChargersTaskDiscountDetailsDto", chargersTaskDiscountDetailsDto$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("discount", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("steps_count", true);
        pluginGeneratedSerialDescriptor.j("current_step", true);
        pluginGeneratedSerialDescriptor.j("trail_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("progress_description_text", true);
        pluginGeneratedSerialDescriptor.j("right_body", true);
        pluginGeneratedSerialDescriptor.j("perks", true);
        pluginGeneratedSerialDescriptor.j("legal", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("active_progress_color", true);
        pluginGeneratedSerialDescriptor.j("base_progress_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersTaskDiscountDetailsDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersTaskDiscountDetailsDto.n;
        w7s w7sVar = w7s.a;
        h6w h6wVar = h6w.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(ChargersDiscountDto$$serializer.INSTANCE), w7sVar, w7sVar, h6wVar, h6wVar, qke.n(auu0Var), w7sVar, w7sVar, i3yVarArr[8].getValue(), w7sVar, qke.n(ChargersDiscountDetailsButtonDto$$serializer.INSTANCE), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final ChargersTaskDiscountDetailsDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        i3y[] i3yVarArr2;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = ChargersTaskDiscountDetailsDto.n;
        b.getClass();
        ChargersDiscountDetailsButtonDto chargersDiscountDetailsButtonDto = null;
        FormattedText formattedText = null;
        List list = null;
        boolean z2 = true;
        FormattedText formattedText2 = null;
        int i = 0;
        ChargersDiscountDto chargersDiscountDto = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        FormattedText formattedText5 = null;
        String str2 = null;
        String str3 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    chargersDiscountDto = (ChargersDiscountDto) b.s(serialDescriptor, 0, ChargersDiscountDto$$serializer.INSTANCE, chargersDiscountDto);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 1:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText3);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 2:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText4);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    i3 = b.h(serialDescriptor, 4);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                case 5:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 5, auu0.a, str);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 6:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 6, w7s.a, formattedText5);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 7:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 7, w7s.a, formattedText2);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 8:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr2[8].getValue(), list);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    formattedText = (FormattedText) b.A(serialDescriptor, 9, w7s.a, formattedText);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z = z2;
                    chargersDiscountDetailsButtonDto = (ChargersDiscountDetailsButtonDto) b.s(serialDescriptor, 10, ChargersDiscountDetailsButtonDto$$serializer.INSTANCE, chargersDiscountDetailsButtonDto);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                    z2 = z;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    str2 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    i3yVarArr3 = i3yVarArr;
                case 12:
                    i3yVarArr = i3yVarArr3;
                    str3 = b.k(serialDescriptor, 12);
                    i |= 4096;
                    i3yVarArr3 = i3yVarArr;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ChargersTaskDiscountDetailsDto(i, chargersDiscountDto, formattedText3, formattedText4, i2, i3, str, formattedText5, formattedText2, list, formattedText, chargersDiscountDetailsButtonDto, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersTaskDiscountDetailsDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersTaskDiscountDetailsDto.n;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, ChargersDiscountDto$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || !jl40.l(value.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != 0) {
            b.A(3, value.d, serialDescriptor);
        }
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        if (b.F() || !jl40.l(value.g, FormattedText.c)) {
            b.e(serialDescriptor, 6, w7s.a, value.g);
        }
        if (b.F() || !jl40.l(value.h, FormattedText.c)) {
            b.e(serialDescriptor, 7, w7s.a, value.h);
        }
        if (b.F() || !jl40.l(value.i, EmptyList.a)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        if (b.F() || !jl40.l(value.j, FormattedText.c)) {
            b.e(serialDescriptor, 9, w7s.a, value.j);
        }
        if (b.F() || value.k != null) {
            b.g(serialDescriptor, 10, ChargersDiscountDetailsButtonDto$$serializer.INSTANCE, value.k);
        }
        if (b.F() || !jl40.l(value.l, "")) {
            b.o(serialDescriptor, 11, value.l);
        }
        if (b.F() || !jl40.l(value.m, "")) {
            b.o(serialDescriptor, 12, value.m);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
