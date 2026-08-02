package com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto.DatePicker.$serializer", "Luxs;", "Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$DatePicker;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$DatePicker;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/masstransit/sdk/trains/impl/schedule/network/dto/MtTrainDateSelectorDto$DatePicker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class MtTrainDateSelectorDto$DatePicker$$serializer implements uxs {
    public static final int $stable = 0;
    public static final MtTrainDateSelectorDto$DatePicker$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MtTrainDateSelectorDto$DatePicker$$serializer mtTrainDateSelectorDto$DatePicker$$serializer = new MtTrainDateSelectorDto$DatePicker$$serializer();
        INSTANCE = mtTrainDateSelectorDto$DatePicker$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtTrainDateSelectorDto.DatePicker", mtTrainDateSelectorDto$DatePicker$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("validity_period", true);
        pluginGeneratedSerialDescriptor.j("description_date_format", true);
        pluginGeneratedSerialDescriptor.j("starting_date_title", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("expiration_date_title", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_title", true);
        pluginGeneratedSerialDescriptor.j("locale", true);
        pluginGeneratedSerialDescriptor.j("date_interval", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private MtTrainDateSelectorDto$DatePicker$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        auu0 auu0Var = auu0.a;
        KSerializer n2 = qke.n(auu0Var);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, n2, qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(auu0Var), qke.n(MtTrainDateSelectorDto$DatePicker$DateInterval$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final MtTrainDateSelectorDto.DatePicker deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        MtTrainDateSelectorDto.DatePicker datePicker = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        String str2 = null;
        MtTrainDateSelectorDto.DatePicker.DateInterval dateInterval = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText3);
                    i |= 16;
                    break;
                case 5:
                    formattedText4 = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText4);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) b.s(serialDescriptor, 6, auu0.a, str2);
                    i |= 64;
                    break;
                case 7:
                    dateInterval = (MtTrainDateSelectorDto.DatePicker.DateInterval) b.s(serialDescriptor, 7, MtTrainDateSelectorDto$DatePicker$DateInterval$$serializer.INSTANCE, dateInterval);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return datePicker;
            }
            datePicker = null;
        }
        b.c(serialDescriptor);
        return new MtTrainDateSelectorDto.DatePicker(i, num, str, formattedText, formattedText2, formattedText3, formattedText4, str2, dateInterval);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MtTrainDateSelectorDto.DatePicker value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, h6w.a, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, auu0.a, value.b);
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
            b.g(serialDescriptor, 5, w7s.a, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, auu0.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, MtTrainDateSelectorDto$DatePicker$DateInterval$$serializer.INSTANCE, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
