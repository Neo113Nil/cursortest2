package com.yandex.go.zone.dto.objects;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/SupportedFeedbackChoices.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/SupportedFeedbackChoices;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/SupportedFeedbackChoices;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/SupportedFeedbackChoices;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class SupportedFeedbackChoices$$serializer implements uxs {
    public static final SupportedFeedbackChoices$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SupportedFeedbackChoices$$serializer supportedFeedbackChoices$$serializer = new SupportedFeedbackChoices$$serializer();
        INSTANCE = supportedFeedbackChoices$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.SupportedFeedbackChoices", supportedFeedbackChoices$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("text_hint", true);
        pluginGeneratedSerialDescriptor.j("feedback_badges", true);
        pluginGeneratedSerialDescriptor.j("feedback_rating_mapping", true);
        pluginGeneratedSerialDescriptor.j("cancelled_reason", true);
        pluginGeneratedSerialDescriptor.j("low_rating_reason", true);
        pluginGeneratedSerialDescriptor.j("cancel_reasons_presentation", true);
        pluginGeneratedSerialDescriptor.j("cancelled_reason_grouped", true);
        pluginGeneratedSerialDescriptor.j("ask_cancel_reasons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SupportedFeedbackChoices$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SupportedFeedbackChoices.i;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), qke.n(CancelReasonsPresentation$$serializer.INSTANCE), qke.n(CancelReasonsGrouped$$serializer.INSTANCE), z96.a};
    }

    @Override // defpackage.myi
    public final SupportedFeedbackChoices deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SupportedFeedbackChoices.i;
        b.getClass();
        SupportedFeedbackChoices supportedFeedbackChoices = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        CancelReasonsPresentation cancelReasonsPresentation = null;
        CancelReasonsGrouped cancelReasonsGrouped = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list2);
                    i |= 4;
                    break;
                case 3:
                    list3 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                    i |= 8;
                    break;
                case 4:
                    list4 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list4);
                    i |= 16;
                    break;
                case 5:
                    cancelReasonsPresentation = (CancelReasonsPresentation) b.s(serialDescriptor, 5, CancelReasonsPresentation$$serializer.INSTANCE, cancelReasonsPresentation);
                    i |= 32;
                    break;
                case 6:
                    cancelReasonsGrouped = (CancelReasonsGrouped) b.s(serialDescriptor, 6, CancelReasonsGrouped$$serializer.INSTANCE, cancelReasonsGrouped);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    ny61.c(v);
                    return supportedFeedbackChoices;
            }
            supportedFeedbackChoices = null;
        }
        b.c(serialDescriptor);
        return new SupportedFeedbackChoices(i, str, list, list2, list3, list4, cancelReasonsPresentation, cancelReasonsGrouped, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SupportedFeedbackChoices value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SupportedFeedbackChoices.i;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        }
        if (b.F() || !jl40.l(value.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || !jl40.l(value.e, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, CancelReasonsPresentation$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, CancelReasonsGrouped$$serializer.INSTANCE, value.g);
        }
        if (b.F() || value.h) {
            b.n(serialDescriptor, 7, value.h);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
