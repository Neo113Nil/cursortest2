package com.yandex.go.feedback_common.data.model;

import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips$$serializer;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices;
import com.yandex.go.taxi.order.models.api.objects.FeedbackChoices$$serializer;
import defpackage.auu0;
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
import defpackage.vmt;
import defpackage.yjd;
import defpackage.z96;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/feedback_common/data/model/FeedbackParam.$serializer", "Luxs;", "Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/feedback_common/data/model/FeedbackParam;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/feedback_common/data/model/FeedbackParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class FeedbackParam$$serializer implements uxs {
    public static final FeedbackParam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FeedbackParam$$serializer feedbackParam$$serializer = new FeedbackParam$$serializer();
        INSTANCE = feedbackParam$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.feedback_common.data.model.FeedbackParam", feedbackParam$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("tips", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("orderid", true);
        pluginGeneratedSerialDescriptor.j("msg", true);
        pluginGeneratedSerialDescriptor.j("choices", true);
        pluginGeneratedSerialDescriptor.j("created_time", true);
        pluginGeneratedSerialDescriptor.j("survey", true);
        pluginGeneratedSerialDescriptor.j("correct_car_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeedbackParam$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FeedbackParam.j;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(Tips$$serializer.INSTANCE), qke.n(h6w.a), auu0Var, qke.n(auu0Var), FeedbackChoices$$serializer.INSTANCE, qke.n(vmt.a), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n(z96.a)};
    }

    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Boolean, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12 */
    @Override // defpackage.myi
    public final FeedbackParam deserialize(Decoder decoder) {
        Integer num;
        ?? r1;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackParam.j;
        b.getClass();
        Boolean bool = null;
        boolean z = true;
        int i = 0;
        String str = null;
        Tips tips = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        FeedbackChoices feedbackChoices = null;
        Calendar calendar = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    tips = (Tips) b.s(serialDescriptor, 1, Tips$$serializer.INSTANCE, tips);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    feedbackChoices = (FeedbackChoices) b.A(serialDescriptor, 5, FeedbackChoices$$serializer.INSTANCE, feedbackChoices);
                    i |= 32;
                    break;
                case 6:
                    calendar = (Calendar) b.s(serialDescriptor, 6, vmt.a, calendar);
                    i |= 64;
                    break;
                case 7:
                    list = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) b.s(serialDescriptor, 8, z96.a, bool);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        FeedbackParam feedbackParam = new FeedbackParam();
        if ((i & 1) == 0) {
            feedbackParam.a = "";
        } else {
            feedbackParam.a = str;
        }
        if ((i & 2) == 0) {
            num = null;
            feedbackParam.b = null;
        } else {
            num = null;
            feedbackParam.b = tips;
        }
        if ((i & 4) == 0) {
            feedbackParam.c = num;
        } else {
            feedbackParam.c = num2;
        }
        if ((i & 8) == 0) {
            feedbackParam.d = "";
        } else {
            feedbackParam.d = str2;
        }
        if ((i & 16) == 0) {
            feedbackParam.e = null;
        } else {
            feedbackParam.e = str3;
        }
        if ((i & 32) == 0) {
            feedbackParam.f = new FeedbackChoices((List) null, (List) null, (Map) null, (List) null, 31);
        } else {
            feedbackParam.f = feedbackChoices;
        }
        if ((i & 64) == 0) {
            r1 = 0;
            feedbackParam.g = null;
        } else {
            r1 = 0;
            feedbackParam.g = calendar;
        }
        if ((i & 128) == 0) {
            feedbackParam.h = r1;
        } else {
            feedbackParam.h = list;
        }
        if ((i & 256) == 0) {
            feedbackParam.i = r1;
            return feedbackParam;
        }
        feedbackParam.i = bool;
        return feedbackParam;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (defpackage.jl40.l(r10.f, new com.yandex.go.taxi.order.models.api.objects.FeedbackChoices((java.util.List) null, (java.util.List) null, (java.util.Map) null, (java.util.List) null, 31)) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, FeedbackParam value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackParam.j;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, Tips$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (!b.F()) {
        }
        b.e(serialDescriptor, 5, FeedbackChoices$$serializer.INSTANCE, value.f);
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, vmt.a, value.g);
        }
        if (b.F() || value.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), value.h);
        }
        if (b.F() || value.i != null) {
            b.g(serialDescriptor, 8, z96.a, value.i);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
