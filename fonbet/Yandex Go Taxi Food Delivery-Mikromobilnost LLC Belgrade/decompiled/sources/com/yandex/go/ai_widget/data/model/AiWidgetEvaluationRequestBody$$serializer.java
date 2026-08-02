package com.yandex.go.ai_widget.data.model;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody.$serializer", "Luxs;", "Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/ai_widget/data/model/AiWidgetEvaluationRequestBody;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class AiWidgetEvaluationRequestBody$$serializer implements uxs {
    public static final int $stable = 0;
    public static final AiWidgetEvaluationRequestBody$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AiWidgetEvaluationRequestBody$$serializer aiWidgetEvaluationRequestBody$$serializer = new AiWidgetEvaluationRequestBody$$serializer();
        INSTANCE = aiWidgetEvaluationRequestBody$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.ai_widget.data.model.AiWidgetEvaluationRequestBody", aiWidgetEvaluationRequestBody$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("user_power_prc", false);
        pluginGeneratedSerialDescriptor.j("user_plugged_state", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private AiWidgetEvaluationRequestBody$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(AiWidgetEvaluationGeopointWrapper$$serializer.INSTANCE), qke.n(h6w.a), qke.n(auu0.a), qke.n(AiWidgetEvaluationState$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final AiWidgetEvaluationRequestBody deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        AiWidgetEvaluationGeopointWrapper aiWidgetEvaluationGeopointWrapper = null;
        Integer num = null;
        String str = null;
        AiWidgetEvaluationState aiWidgetEvaluationState = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aiWidgetEvaluationGeopointWrapper = (AiWidgetEvaluationGeopointWrapper) b.s(serialDescriptor, 0, AiWidgetEvaluationGeopointWrapper$$serializer.INSTANCE, aiWidgetEvaluationGeopointWrapper);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aiWidgetEvaluationState = (AiWidgetEvaluationState) b.s(serialDescriptor, 3, AiWidgetEvaluationState$$serializer.INSTANCE, aiWidgetEvaluationState);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new AiWidgetEvaluationRequestBody(i, aiWidgetEvaluationGeopointWrapper, num, str, aiWidgetEvaluationState);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AiWidgetEvaluationRequestBody value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, AiWidgetEvaluationGeopointWrapper$$serializer.INSTANCE, value.a);
        b.g(serialDescriptor, 1, h6w.a, value.b);
        b.g(serialDescriptor, 2, auu0.a, value.c);
        b.g(serialDescriptor, 3, AiWidgetEvaluationState$$serializer.INSTANCE, value.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
