package com.yandex.go.taxi.order.chat.call_feedback.experiments;

import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackTexts.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackTexts;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackTexts;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackTexts;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class CallFeedbackTexts$$serializer implements uxs {
    public static final CallFeedbackTexts$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CallFeedbackTexts$$serializer callFeedbackTexts$$serializer = new CallFeedbackTexts$$serializer();
        INSTANCE = callFeedbackTexts$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.chat.call_feedback.experiments.CallFeedbackTexts", callFeedbackTexts$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("bad_feedback", true);
        pluginGeneratedSerialDescriptor.j("good_feedback", true);
        pluginGeneratedSerialDescriptor.j("general_feedback", true);
        pluginGeneratedSerialDescriptor.j("bad_feedback_button_title", true);
        pluginGeneratedSerialDescriptor.j("good_feedback_button_title", true);
        pluginGeneratedSerialDescriptor.j("send_feedback_button_title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CallFeedbackTexts$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(BadFeedback$$serializer.INSTANCE);
        KSerializer n2 = qke.n(GoodFeedback$$serializer.INSTANCE);
        KSerializer n3 = qke.n(GeneralFeedback$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final CallFeedbackTexts deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        BadFeedback badFeedback = null;
        GoodFeedback goodFeedback = null;
        GeneralFeedback generalFeedback = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    badFeedback = (BadFeedback) b.s(serialDescriptor, 0, BadFeedback$$serializer.INSTANCE, badFeedback);
                    i |= 1;
                    break;
                case 1:
                    goodFeedback = (GoodFeedback) b.s(serialDescriptor, 1, GoodFeedback$$serializer.INSTANCE, goodFeedback);
                    i |= 2;
                    break;
                case 2:
                    generalFeedback = (GeneralFeedback) b.s(serialDescriptor, 2, GeneralFeedback$$serializer.INSTANCE, generalFeedback);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new CallFeedbackTexts(i, badFeedback, goodFeedback, generalFeedback, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CallFeedbackTexts value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, BadFeedback$$serializer.INSTANCE, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, GoodFeedback$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, GeneralFeedback$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, auu0.a, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
