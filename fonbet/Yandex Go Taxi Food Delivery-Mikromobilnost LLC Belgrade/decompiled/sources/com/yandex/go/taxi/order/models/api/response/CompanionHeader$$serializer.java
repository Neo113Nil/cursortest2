package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.taxi.order.models.api.response.CompanionHeader;
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
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/taxi/order/models/api/response/CompanionHeader.$serializer", "Luxs;", "Lcom/yandex/go/taxi/order/models/api/response/CompanionHeader;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/taxi/order/models/api/response/CompanionHeader;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/taxi/order/models/api/response/CompanionHeader;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes14.dex */
public final /* synthetic */ class CompanionHeader$$serializer implements uxs {
    public static final CompanionHeader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CompanionHeader$$serializer companionHeader$$serializer = new CompanionHeader$$serializer();
        INSTANCE = companionHeader$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.taxi.order.models.api.response.CompanionHeader", companionHeader$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("car", true);
        pluginGeneratedSerialDescriptor.j("chevron", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("animation", true);
        pluginGeneratedSerialDescriptor.j("animation_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CompanionHeader$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CompanionHeaderTitle$$serializer.INSTANCE, CompanionHeaderSubtitle$$serializer.INSTANCE, qke.n(Car$$serializer.INSTANCE), qke.n(Chevron$$serializer.INSTANCE), auu0.a, CompanionHeader.h[5].getValue(), CompanionHeader$AnimationSettings$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final CompanionHeader deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CompanionHeader.h;
        b.getClass();
        CompanionHeader companionHeader = null;
        boolean z = true;
        int i = 0;
        CompanionHeaderTitle companionHeaderTitle = null;
        CompanionHeaderSubtitle companionHeaderSubtitle = null;
        Car car = null;
        Chevron chevron = null;
        String str = null;
        CompanionHeader.Animation animation = null;
        CompanionHeader.AnimationSettings animationSettings = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    companionHeaderTitle = (CompanionHeaderTitle) b.A(serialDescriptor, 0, CompanionHeaderTitle$$serializer.INSTANCE, companionHeaderTitle);
                    i |= 1;
                    break;
                case 1:
                    companionHeaderSubtitle = (CompanionHeaderSubtitle) b.A(serialDescriptor, 1, CompanionHeaderSubtitle$$serializer.INSTANCE, companionHeaderSubtitle);
                    i |= 2;
                    break;
                case 2:
                    car = (Car) b.s(serialDescriptor, 2, Car$$serializer.INSTANCE, car);
                    i |= 4;
                    break;
                case 3:
                    chevron = (Chevron) b.s(serialDescriptor, 3, Chevron$$serializer.INSTANCE, chevron);
                    i |= 8;
                    break;
                case 4:
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    animation = (CompanionHeader.Animation) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), animation);
                    i |= 32;
                    break;
                case 6:
                    animationSettings = (CompanionHeader.AnimationSettings) b.A(serialDescriptor, 6, CompanionHeader$AnimationSettings$$serializer.INSTANCE, animationSettings);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return companionHeader;
            }
            companionHeader = null;
        }
        b.c(serialDescriptor);
        return new CompanionHeader(i, companionHeaderTitle, companionHeaderSubtitle, car, chevron, str, animation, animationSettings);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.taxi.order.models.api.response.CompanionHeader.AnimationSettings.c) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, CompanionHeader value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CompanionHeader.h;
        if (b.F() || !jl40.l(value.a, new CompanionHeaderTitle(0))) {
            b.e(serialDescriptor, 0, CompanionHeaderTitle$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new CompanionHeaderSubtitle(0))) {
            b.e(serialDescriptor, 1, CompanionHeaderSubtitle$$serializer.INSTANCE, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, Car$$serializer.INSTANCE, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, Chevron$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || value.f != CompanionHeader.Animation.UNSUPPORTED) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), value.f);
        }
        if (!b.F()) {
            CompanionHeader.AnimationSettings animationSettings = value.g;
            CompanionHeader.AnimationSettings.Companion.getClass();
        }
        b.e(serialDescriptor, 6, CompanionHeader$AnimationSettings$$serializer.INSTANCE, value.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
