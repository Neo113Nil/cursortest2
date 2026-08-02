package com.yandex.go.multimodal_route.network.models;

import defpackage.gef;
import defpackage.h6w;
import defpackage.ief;
import defpackage.jl40;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/multimodal_route/network/models/TaxiFeedbackDto.$serializer", "Luxs;", "Lcom/yandex/go/multimodal_route/network/models/TaxiFeedbackDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/multimodal_route/network/models/TaxiFeedbackDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/multimodal_route/network/models/TaxiFeedbackDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class TaxiFeedbackDto$$serializer implements uxs {
    public static final int $stable = 0;
    public static final TaxiFeedbackDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TaxiFeedbackDto$$serializer taxiFeedbackDto$$serializer = new TaxiFeedbackDto$$serializer();
        INSTANCE = taxiFeedbackDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.multimodal_route.network.models.TaxiFeedbackDto", taxiFeedbackDto$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("lifetime", false);
        pluginGeneratedSerialDescriptor.j("rating_selector", false);
        pluginGeneratedSerialDescriptor.j("support_button", false);
        pluginGeneratedSerialDescriptor.j("tips_choices", false);
        pluginGeneratedSerialDescriptor.j("done_button", false);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TaxiFeedbackDto$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(SupportButtonDto$$serializer.INSTANCE);
        KSerializer n2 = qke.n(TipsChoicesDto$$serializer.INSTANCE);
        KSerializer n3 = qke.n(gef.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, h6w.a, HubRatingSelectorDto$$serializer.INSTANCE, n, n2, HubDoneButtonDto$$serializer.INSTANCE, n3};
    }

    @Override // defpackage.myi
    public final TaxiFeedbackDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        TaxiFeedbackDto taxiFeedbackDto = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        HubRatingSelectorDto hubRatingSelectorDto = null;
        SupportButtonDto supportButtonDto = null;
        TipsChoicesDto tipsChoicesDto = null;
        HubDoneButtonDto hubDoneButtonDto = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    hubRatingSelectorDto = (HubRatingSelectorDto) b.A(serialDescriptor, 3, HubRatingSelectorDto$$serializer.INSTANCE, hubRatingSelectorDto);
                    i |= 8;
                    break;
                case 4:
                    supportButtonDto = (SupportButtonDto) b.s(serialDescriptor, 4, SupportButtonDto$$serializer.INSTANCE, supportButtonDto);
                    i |= 16;
                    break;
                case 5:
                    tipsChoicesDto = (TipsChoicesDto) b.s(serialDescriptor, 5, TipsChoicesDto$$serializer.INSTANCE, tipsChoicesDto);
                    i |= 32;
                    break;
                case 6:
                    hubDoneButtonDto = (HubDoneButtonDto) b.A(serialDescriptor, 6, HubDoneButtonDto$$serializer.INSTANCE, hubDoneButtonDto);
                    i |= 64;
                    break;
                case 7:
                    iefVar = (ief) b.s(serialDescriptor, 7, gef.a, iefVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return taxiFeedbackDto;
            }
            taxiFeedbackDto = null;
        }
        b.c(serialDescriptor);
        return new TaxiFeedbackDto(i, formattedText, formattedText2, i2, hubRatingSelectorDto, supportButtonDto, tipsChoicesDto, hubDoneButtonDto, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TaxiFeedbackDto value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        w7s w7sVar = w7s.a;
        FormattedText formattedText = value.a;
        ief iefVar = value.h;
        FormattedText formattedText2 = value.b;
        b.e(serialDescriptor, 0, w7sVar, formattedText);
        if (b.F() || !jl40.l(formattedText2, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7sVar, formattedText2);
        }
        b.A(2, value.c, serialDescriptor);
        b.e(serialDescriptor, 3, HubRatingSelectorDto$$serializer.INSTANCE, value.d);
        b.g(serialDescriptor, 4, SupportButtonDto$$serializer.INSTANCE, value.e);
        b.g(serialDescriptor, 5, TipsChoicesDto$$serializer.INSTANCE, value.f);
        b.e(serialDescriptor, 6, HubDoneButtonDto$$serializer.INSTANCE, value.g);
        if (b.F() || iefVar != null) {
            b.g(serialDescriptor, 7, gef.a, iefVar);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
