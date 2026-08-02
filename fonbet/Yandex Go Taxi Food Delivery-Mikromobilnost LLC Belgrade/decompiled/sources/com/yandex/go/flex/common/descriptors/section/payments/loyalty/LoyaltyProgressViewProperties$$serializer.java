package com.yandex.go.flex.common.descriptors.section.payments.loyalty;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jxi;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.yvz;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties.$serializer", "Luxs;", "Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/flex/common/descriptors/section/payments/loyalty/LoyaltyProgressViewProperties;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class LoyaltyProgressViewProperties$$serializer implements uxs {
    public static final LoyaltyProgressViewProperties$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LoyaltyProgressViewProperties$$serializer loyaltyProgressViewProperties$$serializer = new LoyaltyProgressViewProperties$$serializer();
        INSTANCE = loyaltyProgressViewProperties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.flex.common.descriptors.section.payments.loyalty.LoyaltyProgressViewProperties", loyaltyProgressViewProperties$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("progress_percent", false);
        pluginGeneratedSerialDescriptor.j("background_arc_color", false);
        pluginGeneratedSerialDescriptor.j("progress_arc_color", false);
        pluginGeneratedSerialDescriptor.j("background_arc_stroke_width_dp", false);
        pluginGeneratedSerialDescriptor.j("progress_arc_stroke_width_dp", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LoyaltyProgressViewProperties$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = LoyaltyProgressViewProperties.f;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{nor.a, auu0.a, i3yVarArr[2].getValue(), h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final LoyaltyProgressViewProperties deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = LoyaltyProgressViewProperties.f;
        b.getClass();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        String str = null;
        yvz yvzVar = null;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = b.y(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                yvzVar = (yvz) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), yvzVar);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new LoyaltyProgressViewProperties(i, f, str, yvzVar, i2, i3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LoyaltyProgressViewProperties value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = LoyaltyProgressViewProperties.f;
        b.z(serialDescriptor, 0, value.a);
        b.o(serialDescriptor, 1, value.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.c);
        b.A(3, value.d, serialDescriptor);
        b.A(4, value.e, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
