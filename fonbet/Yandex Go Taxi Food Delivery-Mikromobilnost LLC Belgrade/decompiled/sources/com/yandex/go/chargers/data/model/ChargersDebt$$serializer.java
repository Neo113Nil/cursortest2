package com.yandex.go.chargers.data.model;

import com.yandex.go.chargers.data.model.ChargersDebt;
import defpackage.auu0;
import defpackage.gef;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.w7s;
import defpackage.yjd;
import java.util.Calendar;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/data/model/ChargersDebt.$serializer", "Luxs;", "Lcom/yandex/go/chargers/data/model/ChargersDebt;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/data/model/ChargersDebt;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/data/model/ChargersDebt;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersDebt$$serializer implements uxs {
    public static final ChargersDebt$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersDebt$$serializer chargersDebt$$serializer = new ChargersDebt$$serializer();
        INSTANCE = chargersDebt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.data.model.ChargersDebt", chargersDebt$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("order_info_title", true);
        pluginGeneratedSerialDescriptor.j("order_info_subtitle", true);
        pluginGeneratedSerialDescriptor.j("order_info_price", true);
        pluginGeneratedSerialDescriptor.j("order_start_datetime", true);
        pluginGeneratedSerialDescriptor.j("order_id", true);
        pluginGeneratedSerialDescriptor.j("order_status", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("current_operation_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersDebt$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersDebt.k;
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        KSerializer n2 = qke.n(w7sVar);
        KSerializer n3 = qke.n(w7sVar);
        KSerializer n4 = qke.n(w7sVar);
        KSerializer n5 = qke.n(w7sVar);
        KSerializer n6 = qke.n(vmt.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, n4, n5, n6, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(gef.a), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final ChargersDebt deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = ChargersDebt.k;
        b.getClass();
        String str = null;
        ief iefVar = null;
        boolean z = true;
        ChargersDebt.OrderStatus orderStatus = null;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        Calendar calendar = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    formattedText4 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText4);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    formattedText5 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText5);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    calendar = (Calendar) b.s(serialDescriptor, 5, vmt.a, calendar);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 6, auu0.a, str2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    orderStatus = (ChargersDebt.OrderStatus) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), orderStatus);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    iefVar = (ief) b.s(serialDescriptor, 8, gef.a, iefVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new ChargersDebt(i, formattedText, formattedText2, formattedText3, formattedText4, formattedText5, calendar, str2, orderStatus, iefVar, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersDebt value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersDebt.k;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, w7s.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, w7s.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, vmt.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, gef.a, value.i);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
