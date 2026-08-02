package ru.ok.android.externcalls.sdk.feature.internal.listener;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.signaling.feature.event.CallFeatureSetChangedEvent;
import ru.ok.android.webrtc.signaling.feature.event.CallFeaturesPerRoleChangedEvent;
import xsna.epx;
import xsna.izi0;
import xsna.jgp;

/* compiled from: ConversationFeatureListenersImpl.kt */
/* loaded from: classes9.dex */
public final class ConversationFeatureListenersImpl implements ConversationFeatureListeners {
    private final EnumMap<CallFeature, Set<ConversationFeatureManager.FeatureListener>> listenersMap = new EnumMap<>(CallFeature.class);
    private Set<? extends CallFeature> enabledFeatureSet = EmptySet.b;
    private Map<CallFeature, ? extends FeatureRoles> featureRolesMap = jgp.b;

    private final Map<CallFeature, FeatureRoles> getFeaturesRolesMap(CallFeaturesPerRoleChangedEvent callFeaturesPerRoleChangedEvent) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (CallFeature callFeature : CallFeature.values()) {
            Set<CallParticipant.Role> set = callFeaturesPerRoleChangedEvent.getFeaturesPerRole().get(callFeature);
            Set<CallParticipant.Role> set2 = set;
            if (set2 == null || set2.isEmpty()) {
                linkedHashMap.put(callFeature, FeatureRoles.EnabledForAll.INSTANCE);
            } else {
                linkedHashMap.put(callFeature, new FeatureRoles.EnabledForRoles(set));
            }
        }
        return linkedHashMap;
    }

    private final void notifyListenersWithNewEnabledFeatures(Set<? extends CallFeature> set, Set<? extends CallFeature> set2) {
        for (CallFeature callFeature : izi0.g(set, set2)) {
            Set<ConversationFeatureManager.FeatureListener> set3 = this.listenersMap.get(callFeature);
            if (set3 != null) {
                Iterator<T> it = set3.iterator();
                while (it.hasNext()) {
                    ((ConversationFeatureManager.FeatureListener) it.next()).onFeatureEnabledChanged(callFeature, false);
                }
            }
        }
        for (CallFeature callFeature2 : izi0.g(set2, set)) {
            Set<ConversationFeatureManager.FeatureListener> set4 = this.listenersMap.get(callFeature2);
            if (set4 != null) {
                Iterator<T> it2 = set4.iterator();
                while (it2.hasNext()) {
                    ((ConversationFeatureManager.FeatureListener) it2.next()).onFeatureEnabledChanged(callFeature2, true);
                }
            }
        }
    }

    private final void notifyListenersWithNewFeaturesRoles(Map<CallFeature, ? extends FeatureRoles> map, Map<CallFeature, ? extends FeatureRoles> map2) {
        Set<ConversationFeatureManager.FeatureListener> set;
        for (CallFeature callFeature : izi0.j(map.keySet(), map2.keySet())) {
            if (!epx.f(map.get(callFeature), map2.get(callFeature)) && (set = this.listenersMap.get(callFeature)) != null) {
                for (ConversationFeatureManager.FeatureListener featureListener : set) {
                    FeatureRoles.Companion companion = FeatureRoles.Companion;
                    FeatureRoles featureRoles = map2.get(callFeature);
                    if (featureRoles == null) {
                        featureRoles = companion.createDisabledForAll();
                    }
                    featureListener.onFeatureRolesChanged(callFeature, featureRoles);
                }
            }
        }
    }

    private final void notifyNewListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener) {
        featureListener.onFeatureEnabledChanged(callFeature, isFeatureEnabled(callFeature));
        featureListener.onFeatureRolesChanged(callFeature, getFeatureRoles(callFeature));
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void addFeatureListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener) {
        EnumMap<CallFeature, Set<ConversationFeatureManager.FeatureListener>> enumMap = this.listenersMap;
        Set<ConversationFeatureManager.FeatureListener> set = enumMap.get(callFeature);
        if (set == null) {
            set = new HashSet<>();
            enumMap.put((EnumMap<CallFeature, Set<ConversationFeatureManager.FeatureListener>>) callFeature, (CallFeature) set);
        }
        set.add(featureListener);
        notifyNewListener(callFeature, featureListener);
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public FeatureRoles getFeatureRoles(CallFeature callFeature) {
        Map<CallFeature, ? extends FeatureRoles> map = this.featureRolesMap;
        FeatureRoles.Companion companion = FeatureRoles.Companion;
        FeatureRoles featureRoles = map.get(callFeature);
        if (featureRoles == null) {
            featureRoles = companion.createDisabledForAll();
        }
        return featureRoles;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public boolean isFeatureEnabled(CallFeature callFeature) {
        return this.enabledFeatureSet.contains(callFeature);
    }

    public final void onFeatureSetChanged(CallFeatureSetChangedEvent callFeatureSetChangedEvent) {
        Set<CallFeature> features = callFeatureSetChangedEvent.getFeatures();
        notifyListenersWithNewEnabledFeatures(this.enabledFeatureSet, features);
        this.enabledFeatureSet = features;
    }

    public final void onFeaturesPerRoleChanged(CallFeaturesPerRoleChangedEvent callFeaturesPerRoleChangedEvent) {
        Map<CallFeature, FeatureRoles> featuresRolesMap = getFeaturesRolesMap(callFeaturesPerRoleChangedEvent);
        notifyListenersWithNewFeaturesRoles(this.featureRolesMap, featuresRolesMap);
        this.featureRolesMap = featuresRolesMap;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListeners
    public void removeFeatureListener(CallFeature callFeature, ConversationFeatureManager.FeatureListener featureListener) {
        Set<ConversationFeatureManager.FeatureListener> set = this.listenersMap.get(callFeature);
        if (set != null) {
            set.remove(featureListener);
        }
    }
}
