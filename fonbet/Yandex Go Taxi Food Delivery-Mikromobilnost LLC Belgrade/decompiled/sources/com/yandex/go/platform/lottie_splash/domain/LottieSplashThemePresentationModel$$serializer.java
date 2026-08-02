package com.yandex.go.platform.lottie_splash.domain;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.auu0;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel.$serializer", "Luxs;", "Lcom/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/yandex/go/platform/lottie_splash/domain/LottieSplashThemePresentationModel;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@jxi
/* loaded from: classes13.dex */
public final class LottieSplashThemePresentationModel$$serializer implements uxs {
    public static final LottieSplashThemePresentationModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        LottieSplashThemePresentationModel$$serializer lottieSplashThemePresentationModel$$serializer = new LottieSplashThemePresentationModel$$serializer();
        INSTANCE = lottieSplashThemePresentationModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.go.platform.lottie_splash.domain.LottieSplashThemePresentationModel", lottieSplashThemePresentationModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("lottie", false);
        pluginGeneratedSerialDescriptor.j(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, false);
        pluginGeneratedSerialDescriptor.j("spiralColor", false);
        pluginGeneratedSerialDescriptor.j("lottiePosition", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private LottieSplashThemePresentationModel$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = LottieSplashThemePresentationModel.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(kSerializerArr[3])};
    }

    @Override // defpackage.myi
    public LottieSplashThemePresentationModel deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        KSerializer[] kSerializerArr = LottieSplashThemePresentationModel.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        LottiePositionPresentationModel lottiePositionPresentationModel = null;
        while (z) {
            int v = b.v(descriptor2);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(descriptor2, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(descriptor2, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(descriptor2, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                lottiePositionPresentationModel = (LottiePositionPresentationModel) b.s(descriptor2, 3, kSerializerArr[3], lottiePositionPresentationModel);
                i |= 8;
            }
        }
        b.c(descriptor2);
        return new LottieSplashThemePresentationModel(i, str, str2, str3, lottiePositionPresentationModel);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, LottieSplashThemePresentationModel value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        KSerializer[] kSerializerArr = LottieSplashThemePresentationModel.e;
        auu0 auu0Var = auu0.a;
        b.g(descriptor2, 0, auu0Var, value.a);
        b.g(descriptor2, 1, auu0Var, value.b);
        b.g(descriptor2, 2, auu0Var, value.c);
        b.g(descriptor2, 3, kSerializerArr[3], value.d);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
