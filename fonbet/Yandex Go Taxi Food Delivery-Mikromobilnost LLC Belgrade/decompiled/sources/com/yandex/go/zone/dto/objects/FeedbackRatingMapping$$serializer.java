package com.yandex.go.zone.dto.objects;

import com.yandex.go.zone.dto.objects.FeedbackRatingMapping;
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
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/zone/dto/objects/FeedbackRatingMapping.$serializer", "Luxs;", "Lcom/yandex/go/zone/dto/objects/FeedbackRatingMapping;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/zone/dto/objects/FeedbackRatingMapping;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/zone/dto/objects/FeedbackRatingMapping;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes15.dex */
public final /* synthetic */ class FeedbackRatingMapping$$serializer implements uxs {
    public static final FeedbackRatingMapping$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FeedbackRatingMapping$$serializer feedbackRatingMapping$$serializer = new FeedbackRatingMapping$$serializer();
        INSTANCE = feedbackRatingMapping$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.zone.dto.objects.FeedbackRatingMapping", feedbackRatingMapping$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("badges_type", true);
        pluginGeneratedSerialDescriptor.j("choice_title", true);
        pluginGeneratedSerialDescriptor.j("comment_placeholder", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("layout_options", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FeedbackRatingMapping$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FeedbackRatingMapping.g;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), auu0Var, qke.n(auu0Var), h6w.a, FeedbackRatingMapping$LayoutOptions$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final FeedbackRatingMapping deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackRatingMapping.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        List list = null;
        FeedbackBadgeChoice$FeedbackBadgeType feedbackBadgeChoice$FeedbackBadgeType = null;
        String str = null;
        String str2 = null;
        FeedbackRatingMapping.LayoutOptions layoutOptions = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    feedbackBadgeChoice$FeedbackBadgeType = (FeedbackBadgeChoice$FeedbackBadgeType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), feedbackBadgeChoice$FeedbackBadgeType);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    layoutOptions = (FeedbackRatingMapping.LayoutOptions) b.A(serialDescriptor, 5, FeedbackRatingMapping$LayoutOptions$$serializer.INSTANCE, layoutOptions);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FeedbackRatingMapping(i, list, feedbackBadgeChoice$FeedbackBadgeType, str, str2, i2, layoutOptions);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.zone.dto.objects.FeedbackRatingMapping.LayoutOptions.e) == false) goto L37;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, FeedbackRatingMapping value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackRatingMapping.g;
        if (b.F() || !jl40.l(value.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), value.a);
        }
        if (b.F() || value.b != FeedbackBadgeChoice$FeedbackBadgeType.TEXT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || !jl40.l(value.c, "")) {
            b.o(serialDescriptor, 2, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != 0) {
            b.A(4, value.e, serialDescriptor);
        }
        if (!b.F()) {
            FeedbackRatingMapping.LayoutOptions layoutOptions = value.f;
            FeedbackRatingMapping.LayoutOptions.Companion.getClass();
        }
        b.e(serialDescriptor, 5, FeedbackRatingMapping$LayoutOptions$$serializer.INSTANCE, value.f);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
