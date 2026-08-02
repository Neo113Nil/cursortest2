package com.yandex.go.transfer_requirement.experiment;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto.$serializer", "Luxs;", "Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/transfer_requirement/experiment/TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer implements uxs {
    public static final TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer transferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer = new TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer();
        INSTANCE = transferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto", transferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("lead_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("default_value", true);
        pluginGeneratedSerialDescriptor.j("count_limit", true);
        pluginGeneratedSerialDescriptor.j("bubble_modal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TransferRequirementExperiment$Card$ServiceSectionDto$LuggageInfoDto$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto.h[0].getValue(), qke.n(w7sVar), qke.n(w7sVar), qke.n(auu0.a), qke.n(z96.a), qke.n(h6w.a), qke.n(TransferRequirementExperiment$Card$ServiceSectionDto$BubbleModalDto$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto.h;
        b.getClass();
        TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto luggageInfoDto = null;
        boolean z = true;
        int i = 0;
        TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType luggageUiType = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        Boolean bool = null;
        Integer num = null;
        TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    luggageUiType = (TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), luggageUiType);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                case 6:
                    bubbleModalDto = (TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto) b.s(serialDescriptor, 6, TransferRequirementExperiment$Card$ServiceSectionDto$BubbleModalDto$$serializer.INSTANCE, bubbleModalDto);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return luggageInfoDto;
            }
            luggageInfoDto = null;
        }
        b.c(serialDescriptor);
        return new TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto(i, luggageUiType, formattedText, formattedText2, str, bool, num, bubbleModalDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        KSerializer kSerializer = (KSerializer) TransferRequirementExperiment.Card.ServiceSectionDto.LuggageInfoDto.h[0].getValue();
        TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType luggageUiType = value.a;
        TransferRequirementExperiment.Card.ServiceSectionDto.BubbleModalDto bubbleModalDto = value.g;
        Integer num = value.f;
        Boolean bool = value.e;
        String str = value.d;
        FormattedText formattedText = value.c;
        FormattedText formattedText2 = value.b;
        b.e(serialDescriptor, 0, kSerializer, luggageUiType);
        if (b.F() || formattedText2 != null) {
            b.g(serialDescriptor, 1, w7s.a, formattedText2);
        }
        if (b.F() || formattedText != null) {
            b.g(serialDescriptor, 2, w7s.a, formattedText);
        }
        if (b.F() || str != null) {
            b.g(serialDescriptor, 3, auu0.a, str);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 4, z96.a, bool);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 5, h6w.a, num);
        }
        if (b.F() || bubbleModalDto != null) {
            b.g(serialDescriptor, 6, TransferRequirementExperiment$Card$ServiceSectionDto$BubbleModalDto$$serializer.INSTANCE, bubbleModalDto);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
