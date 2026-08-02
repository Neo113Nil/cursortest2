package xsna;

import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: VoipWatchMoviePlayerController.kt */
/* loaded from: classes7.dex */
public final class o6x0 implements luq {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Boolean> b;

    public o6x0(io.reactivex.rxjava3.core.r<Boolean> rVar) {
        this.b = rVar;
    }

    @Override // xsna.luq
    public final void onFeatureEnabledChanged(CallFeature callFeature, boolean z) {
        this.b.onNext(Boolean.valueOf(z));
    }

    @Override // xsna.luq
    public final void onFeatureRolesChanged(CallFeature callFeature, FeatureRoles featureRoles) {
    }
}
