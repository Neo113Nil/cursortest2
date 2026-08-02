package ru.ok.android.externcalls.sdk.feature;

import java.util.Set;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationFeatureManager.kt */
/* loaded from: classes9.dex */
public interface ConversationFeatureManager {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void enableFeatureForAll$default(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFeatureForAll");
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        conversationFeatureManager.enableFeatureForAll(callFeature, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void enableFeatureForRoles$default(ConversationFeatureManager conversationFeatureManager, CallFeature callFeature, Set set, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableFeatureForRoles");
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        conversationFeatureManager.enableFeatureForRoles(callFeature, set, gzsVar, izsVar);
    }

    void addFeatureListener(CallFeature callFeature, FeatureListener featureListener);

    void enableFeatureForAll(CallFeature callFeature, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void enableFeatureForRoles(CallFeature callFeature, Set<? extends CallParticipant.Role> set, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    FeatureRoles getFeatureRoles(CallFeature callFeature);

    boolean isFeatureEnabled(CallFeature callFeature);

    void removeFeatureListener(CallFeature callFeature, FeatureListener featureListener);

    /* compiled from: ConversationFeatureManager.kt */
    public interface FeatureListener {
        default void onFeatureEnabledChanged(CallFeature callFeature, boolean z) {
        }

        default void onFeatureRolesChanged(CallFeature callFeature, FeatureRoles featureRoles) {
        }
    }
}
