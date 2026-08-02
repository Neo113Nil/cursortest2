package com.yandex.go.payments.badges;

import com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment;
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
import defpackage.z96;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/payments/badges/PaymentMethodsBadgesExperiment.Badge.$serializer", "Luxs;", "Lcom/yandex/go/payments/badges/PaymentMethodsBadgesExperiment$Badge;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/payments/badges/PaymentMethodsBadgesExperiment$Badge;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/payments/badges/PaymentMethodsBadgesExperiment$Badge;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class PaymentMethodsBadgesExperiment$Badge$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PaymentMethodsBadgesExperiment$Badge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethodsBadgesExperiment$Badge$$serializer paymentMethodsBadgesExperiment$Badge$$serializer = new PaymentMethodsBadgesExperiment$Badge$$serializer();
        INSTANCE = paymentMethodsBadgesExperiment$Badge$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.payments.badges.PaymentMethodsBadgesExperiment.Badge", paymentMethodsBadgesExperiment$Badge$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("show_count_reset_time", true);
        pluginGeneratedSerialDescriptor.j("services", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("payment_screens", true);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("payment_type", true);
        pluginGeneratedSerialDescriptor.j("subtypes", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("can_shown_in_edit", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaymentMethodsBadgesExperiment$Badge$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PaymentMethodsBadgesExperiment.Badge.m;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, qke.n(h6wVar), qke.n(h6wVar), i3yVarArr[3].getValue(), auu0Var, i3yVarArr[5].getValue(), i3yVarArr[6].getValue(), auu0Var, i3yVarArr[8].getValue(), auu0Var, z96.a, auu0Var};
    }

    @Override // defpackage.myi
    public final PaymentMethodsBadgesExperiment.Badge deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentMethodsBadgesExperiment.Badge.m;
        b.getClass();
        PaymentMethodsBadgesExperiment.Badge badge = null;
        boolean z = true;
        List list = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        List list2 = null;
        String str2 = null;
        List list3 = null;
        List list4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
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
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list3);
                    i |= 32;
                    break;
                case 6:
                    list4 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list4);
                    i |= 64;
                    break;
                case 7:
                    str3 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    str4 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    z2 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    str5 = b.k(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return badge;
            }
            badge = null;
        }
        b.c(serialDescriptor);
        return new PaymentMethodsBadgesExperiment.Badge(i, str, num, num2, list2, str2, list3, list4, str3, list, str4, z2, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaymentMethodsBadgesExperiment.Badge value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PaymentMethodsBadgesExperiment.Badge.m;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, h6w.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, h6w.a, value.c);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(value.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (b.F() || !jl40.l(value.g, emptyList)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), value.g);
        }
        if (b.F() || !jl40.l(value.h, "")) {
            b.o(serialDescriptor, 7, value.h);
        }
        if (b.F() || !jl40.l(value.i, emptyList)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), value.i);
        }
        if (b.F() || !jl40.l(value.j, "")) {
            b.o(serialDescriptor, 9, value.j);
        }
        if (b.F() || value.k) {
            b.n(serialDescriptor, 10, value.k);
        }
        if (b.F() || !jl40.l(value.l, "")) {
            b.o(serialDescriptor, 11, value.l);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
