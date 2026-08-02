package com.yandex.go.pickup_from_photo.experiment;

import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import com.yandex.messaging.core.net.entities.BackendConfig;
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
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment.$serializer", "Luxs;", "Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class PickupPhotoRecognitionExperiment$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PickupPhotoRecognitionExperiment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PickupPhotoRecognitionExperiment$$serializer pickupPhotoRecognitionExperiment$$serializer = new PickupPhotoRecognitionExperiment$$serializer();
        INSTANCE = pickupPhotoRecognitionExperiment$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment", pickupPhotoRecognitionExperiment$$serializer, 13);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, false);
        pluginGeneratedSerialDescriptor.j("entry_point_button", false);
        pluginGeneratedSerialDescriptor.j("supported_order_flows", false);
        pluginGeneratedSerialDescriptor.j("l10n", false);
        pluginGeneratedSerialDescriptor.j("camera_screen", false);
        pluginGeneratedSerialDescriptor.j("camera_permission_screen", false);
        pluginGeneratedSerialDescriptor.j("recognition_error_screen", false);
        pluginGeneratedSerialDescriptor.j("recognition_success_screen", false);
        pluginGeneratedSerialDescriptor.j("photo_recognition_settings", false);
        pluginGeneratedSerialDescriptor.j("onboarding", true);
        pluginGeneratedSerialDescriptor.j("device_tilt_hint", true);
        pluginGeneratedSerialDescriptor.j("device_rotation_hint", true);
        pluginGeneratedSerialDescriptor.j("night_mode_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PickupPhotoRecognitionExperiment$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = PickupPhotoRecognitionExperiment.o;
        return new KSerializer[]{z96.a, PickupPhotoRecognitionExperiment$Button$$serializer.INSTANCE, i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), PickupPhotoRecognitionExperiment$CameraScreen$$serializer.INSTANCE, PickupPhotoRecognitionExperiment$CameraPermissionScreen$$serializer.INSTANCE, PickupPhotoRecognitionExperiment$RecognitionErrorScreen$$serializer.INSTANCE, PickupPhotoRecognitionExperiment$RecognitionSuccessScreen$$serializer.INSTANCE, PickupPhotoRecognitionExperiment$PhotoRecognitionSettings$$serializer.INSTANCE, qke.n(PickupPhotoRecognitionExperiment$Onboarding$$serializer.INSTANCE), PickupPhotoRecognitionExperiment$DeviceTiltHint$$serializer.INSTANCE, PickupPhotoRecognitionExperiment$DeviceRotationHint$$serializer.INSTANCE, qke.n(PickupPhotoRecognitionExperiment$NightModeSettings$$serializer.INSTANCE)};
    }

    @Override // defpackage.myi
    public final PickupPhotoRecognitionExperiment deserialize(Decoder decoder) {
        boolean z;
        PickupPhotoRecognitionExperiment.Button button;
        PickupPhotoRecognitionExperiment.DeviceRotationHint deviceRotationHint;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PickupPhotoRecognitionExperiment.o;
        b.getClass();
        PickupPhotoRecognitionExperiment.DeviceRotationHint deviceRotationHint2 = null;
        PickupPhotoRecognitionExperiment.DeviceTiltHint deviceTiltHint = null;
        PickupPhotoRecognitionExperiment.Onboarding onboarding = null;
        PickupPhotoRecognitionExperiment.PhotoRecognitionSettings photoRecognitionSettings = null;
        PickupPhotoRecognitionExperiment.NightModeSettings nightModeSettings = null;
        PickupPhotoRecognitionExperiment.RecognitionSuccessScreen recognitionSuccessScreen = null;
        int i = 0;
        boolean z2 = false;
        PickupPhotoRecognitionExperiment.Button button2 = null;
        List list = null;
        Map map = null;
        PickupPhotoRecognitionExperiment.CameraScreen cameraScreen = null;
        PickupPhotoRecognitionExperiment.CameraPermissionScreen cameraPermissionScreen = null;
        PickupPhotoRecognitionExperiment.RecognitionErrorScreen recognitionErrorScreen = null;
        boolean z3 = true;
        while (z3) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z3 = false;
                    z2 = z2;
                case 0:
                    deviceRotationHint = deviceRotationHint2;
                    i |= 1;
                    z2 = b.C(serialDescriptor, 0);
                    deviceRotationHint2 = deviceRotationHint;
                case 1:
                    deviceRotationHint = deviceRotationHint2;
                    button2 = (PickupPhotoRecognitionExperiment.Button) b.A(serialDescriptor, 1, PickupPhotoRecognitionExperiment$Button$$serializer.INSTANCE, button2);
                    i |= 2;
                    z2 = z2;
                    deviceRotationHint2 = deviceRotationHint;
                case 2:
                    z = z2;
                    button = button2;
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    z2 = z;
                    button2 = button;
                case 3:
                    z = z2;
                    button = button2;
                    map = (Map) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                    i |= 8;
                    z2 = z;
                    button2 = button;
                case 4:
                    z = z2;
                    button = button2;
                    cameraScreen = (PickupPhotoRecognitionExperiment.CameraScreen) b.A(serialDescriptor, 4, PickupPhotoRecognitionExperiment$CameraScreen$$serializer.INSTANCE, cameraScreen);
                    i |= 16;
                    z2 = z;
                    button2 = button;
                case 5:
                    z = z2;
                    button = button2;
                    cameraPermissionScreen = (PickupPhotoRecognitionExperiment.CameraPermissionScreen) b.A(serialDescriptor, 5, PickupPhotoRecognitionExperiment$CameraPermissionScreen$$serializer.INSTANCE, cameraPermissionScreen);
                    i |= 32;
                    z2 = z;
                    button2 = button;
                case 6:
                    z = z2;
                    button = button2;
                    recognitionErrorScreen = (PickupPhotoRecognitionExperiment.RecognitionErrorScreen) b.A(serialDescriptor, 6, PickupPhotoRecognitionExperiment$RecognitionErrorScreen$$serializer.INSTANCE, recognitionErrorScreen);
                    i |= 64;
                    z2 = z;
                    button2 = button;
                case 7:
                    z = z2;
                    button = button2;
                    recognitionSuccessScreen = (PickupPhotoRecognitionExperiment.RecognitionSuccessScreen) b.A(serialDescriptor, 7, PickupPhotoRecognitionExperiment$RecognitionSuccessScreen$$serializer.INSTANCE, recognitionSuccessScreen);
                    i |= 128;
                    z2 = z;
                    button2 = button;
                case 8:
                    z = z2;
                    button = button2;
                    photoRecognitionSettings = (PickupPhotoRecognitionExperiment.PhotoRecognitionSettings) b.A(serialDescriptor, 8, PickupPhotoRecognitionExperiment$PhotoRecognitionSettings$$serializer.INSTANCE, photoRecognitionSettings);
                    i |= 256;
                    z2 = z;
                    button2 = button;
                case 9:
                    z = z2;
                    button = button2;
                    onboarding = (PickupPhotoRecognitionExperiment.Onboarding) b.s(serialDescriptor, 9, PickupPhotoRecognitionExperiment$Onboarding$$serializer.INSTANCE, onboarding);
                    i |= 512;
                    z2 = z;
                    button2 = button;
                case 10:
                    z = z2;
                    button = button2;
                    deviceTiltHint = (PickupPhotoRecognitionExperiment.DeviceTiltHint) b.A(serialDescriptor, 10, PickupPhotoRecognitionExperiment$DeviceTiltHint$$serializer.INSTANCE, deviceTiltHint);
                    i |= 1024;
                    z2 = z;
                    button2 = button;
                case 11:
                    z = z2;
                    button = button2;
                    deviceRotationHint2 = (PickupPhotoRecognitionExperiment.DeviceRotationHint) b.A(serialDescriptor, 11, PickupPhotoRecognitionExperiment$DeviceRotationHint$$serializer.INSTANCE, deviceRotationHint2);
                    i |= 2048;
                    z2 = z;
                    button2 = button;
                case 12:
                    z = z2;
                    button = button2;
                    nightModeSettings = (PickupPhotoRecognitionExperiment.NightModeSettings) b.s(serialDescriptor, 12, PickupPhotoRecognitionExperiment$NightModeSettings$$serializer.INSTANCE, nightModeSettings);
                    i |= 4096;
                    z2 = z;
                    button2 = button;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new PickupPhotoRecognitionExperiment(i, z2, button2, list, map, cameraScreen, cameraPermissionScreen, recognitionErrorScreen, recognitionSuccessScreen, photoRecognitionSettings, onboarding, deviceTiltHint, deviceRotationHint2, nightModeSettings);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PickupPhotoRecognitionExperiment value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PickupPhotoRecognitionExperiment.o;
        boolean z = value.b;
        PickupPhotoRecognitionExperiment.NightModeSettings nightModeSettings = value.n;
        PickupPhotoRecognitionExperiment.DeviceRotationHint deviceRotationHint = value.m;
        PickupPhotoRecognitionExperiment.DeviceTiltHint deviceTiltHint = value.l;
        PickupPhotoRecognitionExperiment.Onboarding onboarding = value.k;
        b.n(serialDescriptor, 0, z);
        b.e(serialDescriptor, 1, PickupPhotoRecognitionExperiment$Button$$serializer.INSTANCE, value.c);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), value.d);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), value.e);
        b.e(serialDescriptor, 4, PickupPhotoRecognitionExperiment$CameraScreen$$serializer.INSTANCE, value.f);
        b.e(serialDescriptor, 5, PickupPhotoRecognitionExperiment$CameraPermissionScreen$$serializer.INSTANCE, value.g);
        b.e(serialDescriptor, 6, PickupPhotoRecognitionExperiment$RecognitionErrorScreen$$serializer.INSTANCE, value.h);
        b.e(serialDescriptor, 7, PickupPhotoRecognitionExperiment$RecognitionSuccessScreen$$serializer.INSTANCE, value.i);
        b.e(serialDescriptor, 8, PickupPhotoRecognitionExperiment$PhotoRecognitionSettings$$serializer.INSTANCE, value.j);
        if (b.F() || onboarding != null) {
            b.g(serialDescriptor, 9, PickupPhotoRecognitionExperiment$Onboarding$$serializer.INSTANCE, onboarding);
        }
        if (b.F() || !jl40.l(deviceTiltHint, new PickupPhotoRecognitionExperiment.DeviceTiltHint(0))) {
            b.e(serialDescriptor, 10, PickupPhotoRecognitionExperiment$DeviceTiltHint$$serializer.INSTANCE, deviceTiltHint);
        }
        if (b.F() || !jl40.l(deviceRotationHint, new PickupPhotoRecognitionExperiment.DeviceRotationHint(0))) {
            b.e(serialDescriptor, 11, PickupPhotoRecognitionExperiment$DeviceRotationHint$$serializer.INSTANCE, deviceRotationHint);
        }
        if (b.F() || nightModeSettings != null) {
            b.g(serialDescriptor, 12, PickupPhotoRecognitionExperiment$NightModeSettings$$serializer.INSTANCE, nightModeSettings);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
