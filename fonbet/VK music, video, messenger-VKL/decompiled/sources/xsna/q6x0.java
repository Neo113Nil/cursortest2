package xsna;

import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: VoipWatchMoviePlayerController.kt */
/* loaded from: classes7.dex */
public final class q6x0 implements luq {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<FeatureRoles> b;

    public q6x0(io.reactivex.rxjava3.core.r<FeatureRoles> rVar) {
        this.b = rVar;
    }

    @Override // xsna.luq
    public final void onFeatureRolesChanged(CallFeature callFeature, FeatureRoles featureRoles) {
        this.b.onNext(featureRoles);
    }

    @Override // xsna.luq
    public final void onFeatureEnabledChanged(CallFeature callFeature, boolean z) {
    }
}
