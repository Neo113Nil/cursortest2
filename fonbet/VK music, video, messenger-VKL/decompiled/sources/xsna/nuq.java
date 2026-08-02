package xsna;

import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: FeatureListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class nuq implements ConversationFeatureManager.FeatureListener {
    public final ouq a;

    public nuq(ouq ouqVar) {
        this.a = ouqVar;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureEnabledChanged(CallFeature callFeature, boolean z) {
        this.a.onFeatureEnabledChanged(callFeature, z);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureRolesChanged(CallFeature callFeature, FeatureRoles featureRoles) {
        this.a.onFeatureRolesChanged(callFeature, featureRoles);
    }
}
