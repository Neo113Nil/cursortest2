package com.yandex.go.splash.data.dto;

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
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/splash/data/dto/DynamicSplash.$serializer", "Luxs;", "Lcom/yandex/go/splash/data/dto/DynamicSplash;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/splash/data/dto/DynamicSplash;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/splash/data/dto/DynamicSplash;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class DynamicSplash$$serializer implements uxs {
    public static final DynamicSplash$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DynamicSplash$$serializer dynamicSplash$$serializer = new DynamicSplash$$serializer();
        INSTANCE = dynamicSplash$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.splash.data.dto.DynamicSplash", dynamicSplash$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("top_image_tag", true);
        pluginGeneratedSerialDescriptor.j("background_image_tag", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("content_appear_duration", true);
        pluginGeneratedSerialDescriptor.j("content_freeze_duration", true);
        pluginGeneratedSerialDescriptor.j("fade_duration", true);
        pluginGeneratedSerialDescriptor.j("text_key", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DynamicSplash$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DynamicSplash.m;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), SplashScreenShowPolicy$$serializer.INSTANCE, h6wVar, h6wVar, h6wVar, qke.n(auu0Var), i3yVarArr[10].getValue()};
    }

    @Override // defpackage.myi
    public final DynamicSplash deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DynamicSplash.m;
        b.getClass();
        Map map = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        SplashScreenType splashScreenType = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        SplashScreenShowPolicy splashScreenShowPolicy = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    splashScreenType = (SplashScreenType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), splashScreenType);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    splashScreenShowPolicy = (SplashScreenShowPolicy) b.A(serialDescriptor, 5, SplashScreenShowPolicy$$serializer.INSTANCE, splashScreenShowPolicy);
                    i |= 32;
                    break;
                case 6:
                    i2 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3 = b.h(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i4 = b.h(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    break;
                case 10:
                    map = (Map) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), map);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new DynamicSplash(i, str2, splashScreenType, str3, str4, str5, splashScreenShowPolicy, i2, i3, i4, str, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DynamicSplash value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DynamicSplash.m;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || value.b != SplashScreenType.DYNAMIC_PROMO) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, auu0.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || !jl40.l(value.f, new SplashScreenShowPolicy(0))) {
            b.e(serialDescriptor, 5, SplashScreenShowPolicy$$serializer.INSTANCE, value.f);
        }
        if (b.F() || value.g != 500) {
            b.A(6, value.g, serialDescriptor);
        }
        if (b.F() || value.h != 500) {
            b.A(7, value.h, serialDescriptor);
        }
        if (b.F() || value.i != 300) {
            b.A(8, value.i, serialDescriptor);
        }
        if (b.F() || value.j != null) {
            b.g(serialDescriptor, 9, auu0.a, value.j);
        }
        if (b.F() || !jl40.l(value.k, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), value.k);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
