package com.yandex.go.chargers.discounts.data.models;

import com.yandex.go.chargers.data.model.ChargersStationDto;
import com.yandex.go.chargers.data.model.ChargersStationDto$$serializer;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersSelectedDiscountDto$$serializer;
import defpackage.auu0;
import defpackage.b0t;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/chargers/discounts/data/models/ChargersDiscountsListParams.$serializer", "Luxs;", "Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListParams;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListParams;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/chargers/discounts/data/models/ChargersDiscountsListParams;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class ChargersDiscountsListParams$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ChargersDiscountsListParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChargersDiscountsListParams$$serializer chargersDiscountsListParams$$serializer = new ChargersDiscountsListParams$$serializer();
        INSTANCE = chargersDiscountsListParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsListParams", chargersDiscountsListParams$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("discount", false);
        pluginGeneratedSerialDescriptor.j("offer_id", false);
        pluginGeneratedSerialDescriptor.j("station", false);
        pluginGeneratedSerialDescriptor.j("coordinates", false);
        pluginGeneratedSerialDescriptor.j("payment_methods", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ChargersDiscountsListParams$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ChargersSelectedDiscountDto$$serializer.INSTANCE), qke.n(auu0.a), qke.n(ChargersStationDto$$serializer.INSTANCE), b0t.a, ChargersDiscountsListParams.f[4].getValue()};
    }

    @Override // defpackage.myi
    public final ChargersDiscountsListParams deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersDiscountsListParams.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        ChargersSelectedDiscountDto chargersSelectedDiscountDto = null;
        String str = null;
        ChargersStationDto chargersStationDto = null;
        zzs zzsVar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                chargersSelectedDiscountDto = (ChargersSelectedDiscountDto) b.s(serialDescriptor, 0, ChargersSelectedDiscountDto$$serializer.INSTANCE, chargersSelectedDiscountDto);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                chargersStationDto = (ChargersStationDto) b.s(serialDescriptor, 2, ChargersStationDto$$serializer.INSTANCE, chargersStationDto);
                i |= 4;
            } else if (v == 3) {
                zzsVar = (zzs) b.A(serialDescriptor, 3, b0t.a, zzsVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ChargersDiscountsListParams(i, chargersSelectedDiscountDto, str, chargersStationDto, zzsVar, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChargersDiscountsListParams value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ChargersDiscountsListParams.f;
        b.g(serialDescriptor, 0, ChargersSelectedDiscountDto$$serializer.INSTANCE, value.a);
        b.g(serialDescriptor, 1, auu0.a, value.b);
        b.g(serialDescriptor, 2, ChargersStationDto$$serializer.INSTANCE, value.c);
        b.e(serialDescriptor, 3, b0t.a, value.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
