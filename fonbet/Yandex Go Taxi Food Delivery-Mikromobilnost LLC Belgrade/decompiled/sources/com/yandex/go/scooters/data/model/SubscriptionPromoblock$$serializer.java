package com.yandex.go.scooters.data.model;

import com.adjust.sdk.Constants;
import com.yandex.go.scooters.data.model.SubscriptionPromoblock;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/SubscriptionPromoblock.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/SubscriptionPromoblock;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class SubscriptionPromoblock$$serializer implements uxs {
    public static final int $stable = 0;
    public static final SubscriptionPromoblock$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SubscriptionPromoblock$$serializer subscriptionPromoblock$$serializer = new SubscriptionPromoblock$$serializer();
        INSTANCE = subscriptionPromoblock$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.SubscriptionPromoblock", subscriptionPromoblock$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubscriptionPromoblock$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(SubscriptionPromoblock$Badge$$serializer.INSTANCE);
        KSerializer n3 = qke.n(SubscriptionPromoblock$Toggle$$serializer.INSTANCE);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, auu0Var, w7sVar, w7sVar, n2, n3};
    }

    @Override // defpackage.myi
    public final SubscriptionPromoblock deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        SubscriptionPromoblock.Badge badge = null;
        SubscriptionPromoblock.Toggle toggle = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    badge = (SubscriptionPromoblock.Badge) b.s(serialDescriptor, 4, SubscriptionPromoblock$Badge$$serializer.INSTANCE, badge);
                    i |= 16;
                    break;
                case 5:
                    toggle = (SubscriptionPromoblock.Toggle) b.s(serialDescriptor, 5, SubscriptionPromoblock$Toggle$$serializer.INSTANCE, toggle);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SubscriptionPromoblock(i, str, str2, formattedText, formattedText2, badge, toggle);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SubscriptionPromoblock value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != null) {
            b.g(serialDescriptor, 0, auu0.a, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (b.F() || !jl40.l(value.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, value.c);
        }
        if (b.F() || !jl40.l(value.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, SubscriptionPromoblock$Badge$$serializer.INSTANCE, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, SubscriptionPromoblock$Toggle$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
