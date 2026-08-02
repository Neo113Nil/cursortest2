package defpackage;

import com.yandex.go.platform.lottie_splash.domain.LottiePositionPresentationModel;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class buz {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LottiePositionPresentationModel.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
