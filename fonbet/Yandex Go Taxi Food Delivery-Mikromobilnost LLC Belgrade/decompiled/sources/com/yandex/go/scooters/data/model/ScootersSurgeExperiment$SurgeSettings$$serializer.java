package com.yandex.go.scooters.data.model;

import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import defpackage.auu0;
import defpackage.jl40;
import defpackage.jxi;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/scooters/data/model/ScootersSurgeExperiment.SurgeSettings.$serializer", "Luxs;", "Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/scooters/data/model/ScootersSurgeExperiment$SurgeSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes8.dex */
public final /* synthetic */ class ScootersSurgeExperiment$SurgeSettings$$serializer implements uxs {
    public static final int $stable = 0;
    public static final ScootersSurgeExperiment$SurgeSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScootersSurgeExperiment$SurgeSettings$$serializer scootersSurgeExperiment$SurgeSettings$$serializer = new ScootersSurgeExperiment$SurgeSettings$$serializer();
        INSTANCE = scootersSurgeExperiment$SurgeSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.scooters.data.model.ScootersSurgeExperiment.SurgeSettings", scootersSurgeExperiment$SurgeSettings$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("indicator_settings", true);
        pluginGeneratedSerialDescriptor.j("offer_icon", true);
        pluginGeneratedSerialDescriptor.j("offer_accessibility_title", true);
        pluginGeneratedSerialDescriptor.j("book_button_icon", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScootersSurgeExperiment$SurgeSettings$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(ScootersSurgeExperiment$SurgeSettings$Details$$serializer.INSTANCE);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, ScootersSurgeExperiment$SurgeSettings$IndicatorSettings$$serializer.INSTANCE, auu0Var, auu0Var, auu0Var, n, ScootersSurgeExperiment$SurgeSettings$Content$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final ScootersSurgeExperiment.SurgeSettings deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        ScootersSurgeExperiment.SurgeSettings surgeSettings = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        ScootersSurgeExperiment.SurgeSettings.IndicatorSettings indicatorSettings = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ScootersSurgeExperiment.SurgeSettings.Details details = null;
        ScootersSurgeExperiment.SurgeSettings.Content content = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    indicatorSettings = (ScootersSurgeExperiment.SurgeSettings.IndicatorSettings) b.A(serialDescriptor, 2, ScootersSurgeExperiment$SurgeSettings$IndicatorSettings$$serializer.INSTANCE, indicatorSettings);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    details = (ScootersSurgeExperiment.SurgeSettings.Details) b.s(serialDescriptor, 6, ScootersSurgeExperiment$SurgeSettings$Details$$serializer.INSTANCE, details);
                    i |= 64;
                    break;
                case 7:
                    content = (ScootersSurgeExperiment.SurgeSettings.Content) b.A(serialDescriptor, 7, ScootersSurgeExperiment$SurgeSettings$Content$$serializer.INSTANCE, content);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return surgeSettings;
            }
            surgeSettings = null;
        }
        b.c(serialDescriptor);
        return new ScootersSurgeExperiment.SurgeSettings(i, str, str2, indicatorSettings, str3, str4, str5, details, content);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.scooters.data.model.ScootersSurgeExperiment.SurgeSettings.IndicatorSettings.c) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (defpackage.jl40.l(r0, com.yandex.go.scooters.data.model.ScootersSurgeExperiment.SurgeSettings.Content.g) == false) goto L49;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, ScootersSurgeExperiment.SurgeSettings value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        e0 e0Var = ScootersSurgeExperiment.SurgeSettings.Companion;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        if (b.F() || !jl40.l(value.b, "")) {
            b.o(serialDescriptor, 1, value.b);
        }
        if (!b.F()) {
            ScootersSurgeExperiment.SurgeSettings.IndicatorSettings indicatorSettings = value.c;
            ScootersSurgeExperiment.SurgeSettings.IndicatorSettings.Companion.getClass();
        }
        b.e(serialDescriptor, 2, ScootersSurgeExperiment$SurgeSettings$IndicatorSettings$$serializer.INSTANCE, value.c);
        if (b.F() || !jl40.l(value.d, "")) {
            b.o(serialDescriptor, 3, value.d);
        }
        if (b.F() || !jl40.l(value.e, "")) {
            b.o(serialDescriptor, 4, value.e);
        }
        if (b.F() || !jl40.l(value.f, "")) {
            b.o(serialDescriptor, 5, value.f);
        }
        if (b.F() || value.g != null) {
            b.g(serialDescriptor, 6, ScootersSurgeExperiment$SurgeSettings$Details$$serializer.INSTANCE, value.g);
        }
        if (!b.F()) {
            ScootersSurgeExperiment.SurgeSettings.Content content = value.h;
            ScootersSurgeExperiment.SurgeSettings.Content.Companion.getClass();
        }
        b.e(serialDescriptor, 7, ScootersSurgeExperiment$SurgeSettings$Content$$serializer.INSTANCE, value.h);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
