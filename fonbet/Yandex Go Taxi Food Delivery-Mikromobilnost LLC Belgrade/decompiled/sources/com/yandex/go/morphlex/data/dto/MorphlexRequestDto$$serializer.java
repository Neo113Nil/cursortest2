package com.yandex.go.morphlex.data.dto;

import com.yandex.go.morphlex.data.dto.MorphlexRequestDto;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pfa0;
import defpackage.qke;
import defpackage.rfa0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.yjd;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/morphlex/data/dto/MorphlexRequestDto.$serializer", "Luxs;", "Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/morphlex/data/dto/MorphlexRequestDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MorphlexRequestDto$$serializer implements uxs {
    public static final MorphlexRequestDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MorphlexRequestDto$$serializer morphlexRequestDto$$serializer = new MorphlexRequestDto$$serializer();
        INSTANCE = morphlexRequestDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.morphlex.data.dto.MorphlexRequestDto", morphlexRequestDto$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("user_location", true);
        pluginGeneratedSerialDescriptor.j("point_a", true);
        pluginGeneratedSerialDescriptor.j("selected_payment_method", false);
        pluginGeneratedSerialDescriptor.j("selected_class", false);
        pluginGeneratedSerialDescriptor.j("preorder_due", false);
        pluginGeneratedSerialDescriptor.j("additional_preorder_info", true);
        pluginGeneratedSerialDescriptor.j("route", false);
        pluginGeneratedSerialDescriptor.j("tariff_requirements", false);
        pluginGeneratedSerialDescriptor.j("order_comment", true);
        pluginGeneratedSerialDescriptor.j("open_reason", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MorphlexRequestDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MorphlexRequestDto.k;
        MorphlexRequestDto$Location$$serializer morphlexRequestDto$Location$$serializer = MorphlexRequestDto$Location$$serializer.INSTANCE;
        KSerializer n = qke.n(morphlexRequestDto$Location$$serializer);
        KSerializer n2 = qke.n(morphlexRequestDto$Location$$serializer);
        KSerializer n3 = qke.n(pfa0.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(vmt.a), qke.n(MorphlexRequestDto$AdditionalPreorderInfo$$serializer.INSTANCE), qke.n((KSerializer) i3yVarArr[6].getValue()), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(MorphlexRequestDto$OrderComment$$serializer.INSTANCE), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final MorphlexRequestDto deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = MorphlexRequestDto.k;
        b.getClass();
        String str = null;
        MorphlexRequestDto.OrderComment orderComment = null;
        boolean z = true;
        List list = null;
        int i = 0;
        MorphlexRequestDto.Location location = null;
        MorphlexRequestDto.Location location2 = null;
        rfa0 rfa0Var = null;
        String str2 = null;
        Calendar calendar = null;
        MorphlexRequestDto.AdditionalPreorderInfo additionalPreorderInfo = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    location = (MorphlexRequestDto.Location) b.s(serialDescriptor, 0, MorphlexRequestDto$Location$$serializer.INSTANCE, location);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    location2 = (MorphlexRequestDto.Location) b.s(serialDescriptor, 1, MorphlexRequestDto$Location$$serializer.INSTANCE, location2);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    rfa0Var = (rfa0) b.s(serialDescriptor, 2, pfa0.a, rfa0Var);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    calendar = (Calendar) b.s(serialDescriptor, 4, vmt.a, calendar);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    additionalPreorderInfo = (MorphlexRequestDto.AdditionalPreorderInfo) b.s(serialDescriptor, 5, MorphlexRequestDto$AdditionalPreorderInfo$$serializer.INSTANCE, additionalPreorderInfo);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    list2 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    orderComment = (MorphlexRequestDto.OrderComment) b.s(serialDescriptor, 8, MorphlexRequestDto$OrderComment$$serializer.INSTANCE, orderComment);
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
        return new MorphlexRequestDto(i, location, location2, rfa0Var, str2, calendar, additionalPreorderInfo, list2, list, orderComment, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MorphlexRequestDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MorphlexRequestDto.k;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, MorphlexRequestDto$Location$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, MorphlexRequestDto$Location$$serializer.INSTANCE, value.b);
        }
        pfa0 pfa0Var = pfa0.a;
        rfa0 rfa0Var = value.c;
        MorphlexRequestDto.OrderComment orderComment = value.i;
        MorphlexRequestDto.AdditionalPreorderInfo additionalPreorderInfo = value.f;
        b.g(serialDescriptor, 2, pfa0Var, rfa0Var);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 3, auu0Var, value.d);
        b.g(serialDescriptor, 4, vmt.a, value.e);
        if (b.F() || additionalPreorderInfo != null) {
            b.g(serialDescriptor, 5, MorphlexRequestDto$AdditionalPreorderInfo$$serializer.INSTANCE, additionalPreorderInfo);
        }
        b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        if (b.F() || orderComment != null) {
            b.g(serialDescriptor, 8, MorphlexRequestDto$OrderComment$$serializer.INSTANCE, orderComment);
        }
        b.g(serialDescriptor, 9, auu0Var, value.j);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
