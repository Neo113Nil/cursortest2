package com.yandex.go.analytics.realtime.experiments;

import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/analytics/realtime/experiments/InAppRealtimeAnalyticsExperiment.Configuration.$serializer", "Luxs;", "Lcom/yandex/go/analytics/realtime/experiments/InAppRealtimeAnalyticsExperiment$Configuration;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/analytics/realtime/experiments/InAppRealtimeAnalyticsExperiment$Configuration;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/analytics/realtime/experiments/InAppRealtimeAnalyticsExperiment$Configuration;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes.dex */
public final /* synthetic */ class InAppRealtimeAnalyticsExperiment$Configuration$$serializer implements uxs {
    public static final InAppRealtimeAnalyticsExperiment$Configuration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        InAppRealtimeAnalyticsExperiment$Configuration$$serializer inAppRealtimeAnalyticsExperiment$Configuration$$serializer = new InAppRealtimeAnalyticsExperiment$Configuration$$serializer();
        INSTANCE = inAppRealtimeAnalyticsExperiment$Configuration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment.Configuration", inAppRealtimeAnalyticsExperiment$Configuration$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("buffer_size", false);
        pluginGeneratedSerialDescriptor.j("appmetrica_api_key", false);
        pluginGeneratedSerialDescriptor.j("buffer_lifetime_ms", false);
        pluginGeneratedSerialDescriptor.j("duplicate_as_plain_events", false);
        pluginGeneratedSerialDescriptor.j("view_visibility_threshold", false);
        pluginGeneratedSerialDescriptor.j("view_visibility_timeout_ms", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private InAppRealtimeAnalyticsExperiment$Configuration$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, auu0.a, h6wVar, z96.a, nor.a, h6wVar};
    }

    @Override // defpackage.myi
    public final InAppRealtimeAnalyticsExperiment.Configuration deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        String str = null;
        float f = 0.0f;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    f = b.y(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i4 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new InAppRealtimeAnalyticsExperiment.Configuration(i, i2, str, i3, z, f, i4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, InAppRealtimeAnalyticsExperiment.Configuration value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.A(0, value.a, serialDescriptor);
        b.o(serialDescriptor, 1, value.b);
        b.A(2, value.c, serialDescriptor);
        b.n(serialDescriptor, 3, value.d);
        b.z(serialDescriptor, 4, value.e);
        b.A(5, value.f, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
