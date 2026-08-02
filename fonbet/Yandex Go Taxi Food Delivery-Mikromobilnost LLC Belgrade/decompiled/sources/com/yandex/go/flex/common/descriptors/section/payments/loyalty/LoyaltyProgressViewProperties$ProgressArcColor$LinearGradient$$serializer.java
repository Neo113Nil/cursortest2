package com.yandex.go.flex.common.descriptors.section.payments.loyalty;

import defpackage.i3y;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties.ProgressArcColor.LinearGradient.$serializer", "Luxs;", "Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer implements uxs {
    public static final LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer loyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer = new LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer();
        INSTANCE = loyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("linear_gradient_color", loyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("colors", false);
        pluginGeneratedSerialDescriptor.j("positions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list2 = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient(list, list2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = LoyaltyProgressViewProperties$ProgressArcColor$LinearGradient.c;
        KSerializer kSerializer = (KSerializer) i3yVarArr[0].getValue();
        List list = value.a;
        List list2 = value.b;
        b.e(serialDescriptor, 0, kSerializer, list);
        if (b.F() || list2 != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), list2);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
