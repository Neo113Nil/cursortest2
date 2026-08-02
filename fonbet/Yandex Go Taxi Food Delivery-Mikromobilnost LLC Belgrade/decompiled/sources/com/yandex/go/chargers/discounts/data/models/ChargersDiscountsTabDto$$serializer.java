package com.yandex.go.chargers.discounts.data.models;

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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsTabDto.$serializer", "Luxs;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsTabDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsTabDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsTabDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersDiscountsTabDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersDiscountsTabDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersDiscountsTabDto$$serializer chargersDiscountsTabDto$$serializer = new ChargersDiscountsTabDto$$serializer();
        INSTANCE = chargersDiscountsTabDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsTabDto", chargersDiscountsTabDto$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("badge_count", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersDiscountsTabDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ChargersDiscountsTabDto.e;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), w7s.a, qke.n(h6w.a), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final ChargersDiscountsTabDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersDiscountsTabDto.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        ChargersDiscountsTypeDto chargersDiscountsTypeDto = null;
        FormattedText formattedText = null;
        Integer num = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                chargersDiscountsTypeDto = (ChargersDiscountsTypeDto) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), chargersDiscountsTypeDto);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ChargersDiscountsTabDto(i, chargersDiscountsTypeDto, formattedText, num, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersDiscountsTabDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersDiscountsTabDto.e;
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || !jl40.l(value.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
