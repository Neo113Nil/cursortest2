package com.yandex.go.chargers.order.data.model;

import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto;
import com.yandex.go.chargers.error.api.ChargersErrorDetailsDto$$serializer;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDto;
import defpackage.auu0;
import defpackage.gef;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.ief;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/order/data/model/ChargersActiveOrderDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/order/data/model/ChargersActiveOrderDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class ChargersActiveOrderDto$$serializer implements uxs {
    public static final ChargersActiveOrderDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersActiveOrderDto$$serializer chargersActiveOrderDto$$serializer = new ChargersActiveOrderDto$$serializer();
        INSTANCE = chargersActiveOrderDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.order.data.model.ChargersActiveOrderDto", chargersActiveOrderDto$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("order_status", true);
        pluginGeneratedSerialDescriptor.j("primary_label", true);
        pluginGeneratedSerialDescriptor.j("secondary_label", true);
        pluginGeneratedSerialDescriptor.j("power_bank_number", true);
        pluginGeneratedSerialDescriptor.j("power_bank_number_text", true);
        pluginGeneratedSerialDescriptor.j("power_bank_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("status_text", true);
        pluginGeneratedSerialDescriptor.j("pricing_plan_text", true);
        pluginGeneratedSerialDescriptor.j("duration_text", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("error_details", true);
        pluginGeneratedSerialDescriptor.j("multiorder", true);
        pluginGeneratedSerialDescriptor.j("active_card_modes", true);
        pluginGeneratedSerialDescriptor.j("free_check_seconds", true);
        pluginGeneratedSerialDescriptor.j("free_check_delta_seconds", true);
        pluginGeneratedSerialDescriptor.j("popups", true);
        pluginGeneratedSerialDescriptor.j("notifications", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersActiveOrderDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = ChargersActiveOrderDto.u;
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[1].getValue()), w7sVar, w7sVar, auu0Var, w7sVar, auu0Var, w7sVar, w7sVar, w7sVar, gef.a, i3yVarArr[11].getValue(), i3yVarArr[12].getValue(), ChargersErrorDetailsDto$$serializer.INSTANCE, qke.n(ChargersActiveOrderMultiOrderDto$$serializer.INSTANCE), qke.n(ChargersActiveOrderDto$ActiveCardModes$$serializer.INSTANCE), qke.n(h6wVar), qke.n(h6wVar), qke.n((KSerializer) i3yVarArr[18].getValue()), qke.n((KSerializer) i3yVarArr[19].getValue())};
    }

    @Override // defpackage.myi
    public final ChargersActiveOrderDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        List list;
        FormattedText formattedText;
        FormattedText formattedText2;
        FormattedText formattedText3;
        int i;
        List list2;
        String str;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = ChargersActiveOrderDto.u;
        b.getClass();
        List list3 = null;
        ief iefVar = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        List list4 = null;
        FormattedText formattedText6 = null;
        int i2 = 0;
        ChargersActiveOrderDto.ActiveCardModes activeCardModes = null;
        Integer num = null;
        Integer num2 = null;
        List list5 = null;
        ChargersErrorDetailsDto chargersErrorDetailsDto = null;
        List list6 = null;
        ChargersActiveOrderMultiOrderDto chargersActiveOrderMultiOrderDto = null;
        int i3 = 1;
        boolean z = true;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto = null;
        FormattedText formattedText7 = null;
        FormattedText formattedText8 = null;
        FormattedText formattedText9 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    list2 = list3;
                    str = str4;
                    z = false;
                    iefVar = iefVar;
                    formattedText6 = formattedText6;
                    i3 = 1;
                    str4 = str;
                    list3 = list2;
                case 0:
                    list2 = list3;
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str4);
                    i2 |= 1;
                    iefVar = iefVar;
                    formattedText6 = formattedText6;
                    formattedText5 = formattedText5;
                    i3 = 1;
                    str4 = str;
                    list3 = list2;
                case 1:
                    list2 = list3;
                    FormattedText formattedText10 = formattedText6;
                    int i4 = i3;
                    chargersActiveOrderStatusDto = (ChargersActiveOrderStatusDto) b.s(serialDescriptor, i4, (myi) i3yVarArr[i3].getValue(), chargersActiveOrderStatusDto);
                    i2 |= 2;
                    formattedText7 = formattedText7;
                    formattedText6 = formattedText10;
                    formattedText5 = formattedText5;
                    i3 = i4;
                    list3 = list2;
                case 2:
                    list = list3;
                    formattedText = formattedText5;
                    formattedText2 = formattedText6;
                    formattedText7 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText7);
                    i2 |= 4;
                    formattedText6 = formattedText2;
                    list3 = list;
                    formattedText5 = formattedText;
                case 3:
                    list = list3;
                    formattedText = formattedText5;
                    formattedText2 = formattedText6;
                    formattedText8 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText8);
                    i2 |= 8;
                    formattedText6 = formattedText2;
                    list3 = list;
                    formattedText5 = formattedText;
                case 4:
                    list = list3;
                    formattedText = formattedText5;
                    str2 = b.k(serialDescriptor, 4);
                    i2 |= 16;
                    list3 = list;
                    formattedText5 = formattedText;
                case 5:
                    list = list3;
                    formattedText = formattedText5;
                    formattedText2 = formattedText6;
                    formattedText9 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText9);
                    i2 |= 32;
                    formattedText6 = formattedText2;
                    list3 = list;
                    formattedText5 = formattedText;
                case 6:
                    list = list3;
                    formattedText = formattedText5;
                    str3 = b.k(serialDescriptor, 6);
                    i2 |= 64;
                    list3 = list;
                    formattedText5 = formattedText;
                case 7:
                    list = list3;
                    formattedText = formattedText5;
                    formattedText6 = (FormattedText) b.A(serialDescriptor, 7, w7s.a, formattedText6);
                    i2 |= 128;
                    list3 = list;
                    formattedText5 = formattedText;
                case 8:
                    list2 = list3;
                    formattedText5 = (FormattedText) b.A(serialDescriptor, 8, w7s.a, formattedText5);
                    i2 |= 256;
                    formattedText6 = formattedText6;
                    list3 = list2;
                case 9:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 9, w7s.a, formattedText4);
                    i2 |= 512;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 10:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    iefVar = (ief) b.A(serialDescriptor, 10, gef.a, iefVar);
                    i2 |= 1024;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 11:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    list3 = (List) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list3);
                    i2 |= 2048;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 12:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    list4 = (List) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), list4);
                    i2 |= 4096;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 13:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    chargersErrorDetailsDto = (ChargersErrorDetailsDto) b.A(serialDescriptor, 13, ChargersErrorDetailsDto$$serializer.INSTANCE, chargersErrorDetailsDto);
                    i2 |= 8192;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 14:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    chargersActiveOrderMultiOrderDto = (ChargersActiveOrderMultiOrderDto) b.s(serialDescriptor, 14, ChargersActiveOrderMultiOrderDto$$serializer.INSTANCE, chargersActiveOrderMultiOrderDto);
                    i2 |= 16384;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 15:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    activeCardModes = (ChargersActiveOrderDto.ActiveCardModes) b.s(serialDescriptor, 15, ChargersActiveOrderDto$ActiveCardModes$$serializer.INSTANCE, activeCardModes);
                    i = 32768;
                    i2 |= i;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 16:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    num = (Integer) b.s(serialDescriptor, 16, h6w.a, num);
                    i = 65536;
                    i2 |= i;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 17:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    num2 = (Integer) b.s(serialDescriptor, 17, h6w.a, num2);
                    i = 131072;
                    i2 |= i;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 18:
                    formattedText = formattedText5;
                    formattedText3 = formattedText6;
                    list5 = (List) b.s(serialDescriptor, 18, (myi) i3yVarArr[18].getValue(), list5);
                    i = 262144;
                    i2 |= i;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                case 19:
                    formattedText3 = formattedText6;
                    formattedText = formattedText5;
                    list6 = (List) b.s(serialDescriptor, 19, (myi) i3yVarArr[19].getValue(), list6);
                    i = 524288;
                    i2 |= i;
                    formattedText6 = formattedText3;
                    formattedText5 = formattedText;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        List list7 = list3;
        FormattedText formattedText11 = formattedText6;
        String str5 = str4;
        ChargersActiveOrderStatusDto chargersActiveOrderStatusDto2 = chargersActiveOrderStatusDto;
        FormattedText formattedText12 = formattedText7;
        b.c(serialDescriptor);
        return new ChargersActiveOrderDto(i2, str5, chargersActiveOrderStatusDto2, formattedText12, formattedText8, str2, formattedText9, str3, formattedText11, formattedText5, formattedText4, iefVar, list7, list4, chargersErrorDetailsDto, chargersActiveOrderMultiOrderDto, activeCardModes, num, num2, list5, list6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersActiveOrderDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        ChargersActiveOrderDto.v(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
