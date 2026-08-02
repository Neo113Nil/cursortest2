package com.yandex.go.pickup_from_photo.experiment;

import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment.CameraScreen.$serializer", "Luxs;", "Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$CameraScreen;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$CameraScreen;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/pickup_from_photo/experiment/PickupPhotoRecognitionExperiment$CameraScreen;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final /* synthetic */ class PickupPhotoRecognitionExperiment$CameraScreen$$serializer implements uxs {
    public static final int $stable = 0;
    public static final PickupPhotoRecognitionExperiment$CameraScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PickupPhotoRecognitionExperiment$CameraScreen$$serializer pickupPhotoRecognitionExperiment$CameraScreen$$serializer = new PickupPhotoRecognitionExperiment$CameraScreen$$serializer();
        INSTANCE = pickupPhotoRecognitionExperiment$CameraScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment.CameraScreen", pickupPhotoRecognitionExperiment$CameraScreen$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("camera_button", false);
        pluginGeneratedSerialDescriptor.j("flash_button", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PickupPhotoRecognitionExperiment$CameraScreen$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, PickupPhotoRecognitionExperiment.CameraScreen.e[1].getValue(), PickupPhotoRecognitionExperiment$CameraButton$$serializer.INSTANCE, PickupPhotoRecognitionExperiment$FlashButton$$serializer.INSTANCE};
    }

    @Override // defpackage.myi
    public final PickupPhotoRecognitionExperiment.CameraScreen deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PickupPhotoRecognitionExperiment.CameraScreen.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        PickupPhotoRecognitionExperiment.CameraButton cameraButton = null;
        PickupPhotoRecognitionExperiment.FlashButton flashButton = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                cameraButton = (PickupPhotoRecognitionExperiment.CameraButton) b.A(serialDescriptor, 2, PickupPhotoRecognitionExperiment$CameraButton$$serializer.INSTANCE, cameraButton);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                flashButton = (PickupPhotoRecognitionExperiment.FlashButton) b.A(serialDescriptor, 3, PickupPhotoRecognitionExperiment$FlashButton$$serializer.INSTANCE, flashButton);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new PickupPhotoRecognitionExperiment.CameraScreen(i, str, list, cameraButton, flashButton);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PickupPhotoRecognitionExperiment.CameraScreen value) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PickupPhotoRecognitionExperiment.CameraScreen.e;
        if (b.F() || !jl40.l(value.a, "")) {
            b.o(serialDescriptor, 0, value.a);
        }
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), value.b);
        b.e(serialDescriptor, 2, PickupPhotoRecognitionExperiment$CameraButton$$serializer.INSTANCE, value.c);
        b.e(serialDescriptor, 3, PickupPhotoRecognitionExperiment$FlashButton$$serializer.INSTANCE, value.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
