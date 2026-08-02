package ru.ok.android.externcalls.sdk.feature.internal.listener;

import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: ConversationFeatureListeners.kt */
/* loaded from: classes9.dex */
public interface ConversationFeatureListeners {
    void addFeatureListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener);

    FeatureRoles getFeatureRoles(CallFeature callFeature);

    boolean isFeatureEnabled(CallFeature callFeature);

    void removeFeatureListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener);
}
