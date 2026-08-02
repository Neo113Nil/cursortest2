package com.yandex.go.plus.experiment;

import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.cashback.models.response.CashbackInactiveTariffBadgeStyleDto;
import ru.yandex.taxi.cashback.models.response.CashbackTariffBadgeStyleDto;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/plus/experiment/CashbackStyleScheme.$serializer", "Luxs;", "Lcom/yandex/go/plus/experiment/CashbackStyleScheme;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/plus/experiment/CashbackStyleScheme;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/plus/experiment/CashbackStyleScheme;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class CashbackStyleScheme$$serializer implements uxs {
    public static final CashbackStyleScheme$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CashbackStyleScheme$$serializer cashbackStyleScheme$$serializer = new CashbackStyleScheme$$serializer();
        INSTANCE = cashbackStyleScheme$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.plus.experiment.CashbackStyleScheme", cashbackStyleScheme$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("summary_tariff_inactive_state", true);
        pluginGeneratedSerialDescriptor.j("summary_tariff", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CashbackStyleScheme$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CashbackStyleScheme.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final CashbackStyleScheme deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CashbackStyleScheme.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        CashbackInactiveTariffBadgeStyleDto cashbackInactiveTariffBadgeStyleDto = null;
        CashbackTariffBadgeStyleDto cashbackTariffBadgeStyleDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cashbackInactiveTariffBadgeStyleDto = (CashbackInactiveTariffBadgeStyleDto) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), cashbackInactiveTariffBadgeStyleDto);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                cashbackTariffBadgeStyleDto = (CashbackTariffBadgeStyleDto) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), cashbackTariffBadgeStyleDto);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new CashbackStyleScheme(i, cashbackInactiveTariffBadgeStyleDto, cashbackTariffBadgeStyleDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CashbackStyleScheme value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CashbackStyleScheme.c;
        if (b.F() || value.a != CashbackInactiveTariffBadgeStyleDto.DISABLED) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != CashbackTariffBadgeStyleDto.DARK) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
