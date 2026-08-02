package com.yandex.go.splash.data.dto;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.yjd;
import java.util.Calendar;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/splash/data/dto/SplashScreenShowPolicy.$serializer", "Luxs;", "Lcom/yandex/go/splash/data/dto/SplashScreenShowPolicy;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/splash/data/dto/SplashScreenShowPolicy;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/splash/data/dto/SplashScreenShowPolicy;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class SplashScreenShowPolicy$$serializer implements uxs {
    public static final SplashScreenShowPolicy$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SplashScreenShowPolicy$$serializer splashScreenShowPolicy$$serializer = new SplashScreenShowPolicy$$serializer();
        INSTANCE = splashScreenShowPolicy$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.splash.data.dto.SplashScreenShowPolicy", splashScreenShowPolicy$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("start_date", true);
        pluginGeneratedSerialDescriptor.j("end_date", true);
        pluginGeneratedSerialDescriptor.j("daily_start_time", true);
        pluginGeneratedSerialDescriptor.j("daily_end_time", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SplashScreenShowPolicy$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        vmt vmtVar = vmt.a;
        KSerializer n = qke.n(vmtVar);
        KSerializer n2 = qke.n(vmtVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{h6wVar, n, n2, qke.n(auu0Var), qke.n(auu0Var), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final SplashScreenShowPolicy deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Calendar calendar = null;
        Calendar calendar2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    calendar = (Calendar) b.s(serialDescriptor, 1, vmt.a, calendar);
                    i |= 2;
                    break;
                case 2:
                    calendar2 = (Calendar) b.s(serialDescriptor, 2, vmt.a, calendar2);
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
                    num = (Integer) b.s(serialDescriptor, 5, h6w.a, num);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SplashScreenShowPolicy(i, i2, calendar, calendar2, str, str2, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SplashScreenShowPolicy value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || value.a != -1) {
            b.A(0, value.a, serialDescriptor);
        }
        if (b.F() || value.b != null) {
            b.g(serialDescriptor, 1, vmt.a, value.b);
        }
        if (b.F() || value.c != null) {
            b.g(serialDescriptor, 2, vmt.a, value.c);
        }
        if (b.F() || value.d != null) {
            b.g(serialDescriptor, 3, auu0.a, value.d);
        }
        if (b.F() || value.e != null) {
            b.g(serialDescriptor, 4, auu0.a, value.e);
        }
        if (b.F() || value.f != null) {
            b.g(serialDescriptor, 5, h6w.a, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
