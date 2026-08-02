package com.yandex.go.beginners.safety.experiments;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment.PhotoStep.$serializer", "Luxs;", "Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/beginners/safety/experiments/SafetyNewbiesVerificationExperiment$PhotoStep;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes12.dex */
public final /* synthetic */ class SafetyNewbiesVerificationExperiment$PhotoStep$$serializer implements uxs {
    public static final int $stable = 0;
    public static final SafetyNewbiesVerificationExperiment$PhotoStep$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SafetyNewbiesVerificationExperiment$PhotoStep$$serializer safetyNewbiesVerificationExperiment$PhotoStep$$serializer = new SafetyNewbiesVerificationExperiment$PhotoStep$$serializer();
        INSTANCE = safetyNewbiesVerificationExperiment$PhotoStep$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment.PhotoStep", safetyNewbiesVerificationExperiment$PhotoStep$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("photo_step_screen", true);
        pluginGeneratedSerialDescriptor.j("loading_screen", true);
        pluginGeneratedSerialDescriptor.j("success_screen", true);
        pluginGeneratedSerialDescriptor.j("network_error_screen", true);
        pluginGeneratedSerialDescriptor.j("validation_fail_intermediate_screen", true);
        pluginGeneratedSerialDescriptor.j("validation_fail_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SafetyNewbiesVerificationExperiment$PhotoStep$$serializer() {
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{SafetyNewbiesVerificationExperiment$PhotoStep$PhotoStepScreen$$serializer.INSTANCE, SafetyNewbiesVerificationExperiment$PhotoStep$LoadingScreen$$serializer.INSTANCE, SafetyNewbiesVerificationExperiment$PhotoStep$SuccessScreen$$serializer.INSTANCE, SafetyNewbiesVerificationExperiment$PhotoStep$NetworkErrorScreen$$serializer.INSTANCE, SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailIntermediateScreen$$serializer.INSTANCE, SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailScreen$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final SafetyNewbiesVerificationExperiment.PhotoStep deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        SafetyNewbiesVerificationExperiment.PhotoStep.PhotoStepScreen photoStepScreen = null;
        SafetyNewbiesVerificationExperiment.PhotoStep.LoadingScreen loadingScreen = null;
        SafetyNewbiesVerificationExperiment.PhotoStep.SuccessScreen successScreen = null;
        SafetyNewbiesVerificationExperiment.PhotoStep.NetworkErrorScreen networkErrorScreen = null;
        SafetyNewbiesVerificationExperiment.PhotoStep.ValidationFailIntermediateScreen validationFailIntermediateScreen = null;
        SafetyNewbiesVerificationExperiment.PhotoStep.ValidationFailScreen validationFailScreen = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    photoStepScreen = (SafetyNewbiesVerificationExperiment.PhotoStep.PhotoStepScreen) b.A(serialDescriptor, 0, SafetyNewbiesVerificationExperiment$PhotoStep$PhotoStepScreen$$serializer.INSTANCE, photoStepScreen);
                    i |= 1;
                    break;
                case 1:
                    loadingScreen = (SafetyNewbiesVerificationExperiment.PhotoStep.LoadingScreen) b.A(serialDescriptor, 1, SafetyNewbiesVerificationExperiment$PhotoStep$LoadingScreen$$serializer.INSTANCE, loadingScreen);
                    i |= 2;
                    break;
                case 2:
                    successScreen = (SafetyNewbiesVerificationExperiment.PhotoStep.SuccessScreen) b.A(serialDescriptor, 2, SafetyNewbiesVerificationExperiment$PhotoStep$SuccessScreen$$serializer.INSTANCE, successScreen);
                    i |= 4;
                    break;
                case 3:
                    networkErrorScreen = (SafetyNewbiesVerificationExperiment.PhotoStep.NetworkErrorScreen) b.A(serialDescriptor, 3, SafetyNewbiesVerificationExperiment$PhotoStep$NetworkErrorScreen$$serializer.INSTANCE, networkErrorScreen);
                    i |= 8;
                    break;
                case 4:
                    validationFailIntermediateScreen = (SafetyNewbiesVerificationExperiment.PhotoStep.ValidationFailIntermediateScreen) b.A(serialDescriptor, 4, SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailIntermediateScreen$$serializer.INSTANCE, validationFailIntermediateScreen);
                    i |= 16;
                    break;
                case 5:
                    validationFailScreen = (SafetyNewbiesVerificationExperiment.PhotoStep.ValidationFailScreen) b.A(serialDescriptor, 5, SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailScreen$$serializer.INSTANCE, validationFailScreen);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new SafetyNewbiesVerificationExperiment.PhotoStep(i, photoStepScreen, loadingScreen, successScreen, networkErrorScreen, validationFailIntermediateScreen, validationFailScreen);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SafetyNewbiesVerificationExperiment.PhotoStep value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(value.a, new SafetyNewbiesVerificationExperiment.PhotoStep.PhotoStepScreen(0))) {
            b.e(serialDescriptor, 0, SafetyNewbiesVerificationExperiment$PhotoStep$PhotoStepScreen$$serializer.INSTANCE, value.a);
        }
        if (b.F() || !jl40.l(value.b, new SafetyNewbiesVerificationExperiment.PhotoStep.LoadingScreen(0))) {
            b.e(serialDescriptor, 1, SafetyNewbiesVerificationExperiment$PhotoStep$LoadingScreen$$serializer.INSTANCE, value.b);
        }
        if (b.F() || !jl40.l(value.c, new SafetyNewbiesVerificationExperiment.PhotoStep.SuccessScreen(0))) {
            b.e(serialDescriptor, 2, SafetyNewbiesVerificationExperiment$PhotoStep$SuccessScreen$$serializer.INSTANCE, value.c);
        }
        if (b.F() || !jl40.l(value.d, new SafetyNewbiesVerificationExperiment.PhotoStep.NetworkErrorScreen(0))) {
            b.e(serialDescriptor, 3, SafetyNewbiesVerificationExperiment$PhotoStep$NetworkErrorScreen$$serializer.INSTANCE, value.d);
        }
        if (b.F() || !jl40.l(value.e, new SafetyNewbiesVerificationExperiment.PhotoStep.ValidationFailIntermediateScreen(0))) {
            b.e(serialDescriptor, 4, SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailIntermediateScreen$$serializer.INSTANCE, value.e);
        }
        if (b.F() || !jl40.l(value.f, new SafetyNewbiesVerificationExperiment.PhotoStep.ValidationFailScreen(0))) {
            b.e(serialDescriptor, 5, SafetyNewbiesVerificationExperiment$PhotoStep$ValidationFailScreen$$serializer.INSTANCE, value.f);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
