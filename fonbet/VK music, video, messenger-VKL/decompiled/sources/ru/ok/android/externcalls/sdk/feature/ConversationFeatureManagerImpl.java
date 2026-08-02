package ru.ok.android.externcalls.sdk.feature;

import java.util.Set;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationFeatureManagerImpl.kt */
/* loaded from: classes9.dex */
public final class ConversationFeatureManagerImpl implements ConversationFeatureManager, ConversationFeatureCommandExecutor, ConversationFeatureListeners {
    private final ConversationFeatureCommandExecutor commandExecutor;
    private final ConversationFeatureListeners featureListeners;

    public ConversationFeatureManagerImpl(ConversationFeatureCommandExecutor conversationFeatureCommandExecutor, ConversationFeatureListeners conversationFeatureListeners) {
        this.commandExecutor = conversationFeatureCommandExecutor;
        this.featureListeners = conversationFeatureListeners;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void addFeatureListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener) {
        this.featureListeners.addFeatureListener(callFeature, featureListener);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForAll(CallFeature callFeature, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.enableFeatureForAll(callFeature, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutor
    public void enableFeatureForRoles(CallFeature callFeature, Set<? extends CallParticipant.Role> set, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.enableFeatureForRoles(callFeature, set, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public FeatureRoles getFeatureRoles(CallFeature callFeature) {
        return this.featureListeners.getFeatureRoles(callFeature);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public boolean isFeatureEnabled(CallFeature callFeature) {
        return this.featureListeners.isFeatureEnabled(callFeature);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager, ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void removeFeatureListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener) {
        this.featureListeners.removeFeatureListener(callFeature, featureListener);
    }
}
