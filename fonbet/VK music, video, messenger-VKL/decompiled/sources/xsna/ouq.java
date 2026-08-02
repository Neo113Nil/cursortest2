package xsna;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.features.CallFeature;

/* compiled from: FeatureListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class ouq implements muq, luq {
    public final ConcurrentHashMap<CallFeature, Set<luq>> b = new ConcurrentHashMap<>();

    @Override // xsna.muq
    public final void c(CallFeature callFeature, luq luqVar) {
        Set<luq> putIfAbsent;
        ConcurrentHashMap<CallFeature, Set<luq>> concurrentHashMap = this.b;
        Set<luq> set = concurrentHashMap.get(callFeature);
        if (set == null && (putIfAbsent = concurrentHashMap.putIfAbsent(callFeature, (set = new CopyOnWriteArraySet<>()))) != null) {
            set = putIfAbsent;
        }
        set.remove(luqVar);
    }

    @Override // xsna.luq
    public final void onFeatureEnabledChanged(CallFeature callFeature, boolean z) {
        Set<luq> set = this.b.get(callFeature);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((luq) it.next()).onFeatureEnabledChanged(callFeature, z);
            }
        }
    }

    @Override // xsna.luq
    public final void onFeatureRolesChanged(CallFeature callFeature, FeatureRoles featureRoles) {
        Set<luq> set = this.b.get(callFeature);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((luq) it.next()).onFeatureRolesChanged(callFeature, featureRoles);
            }
        }
    }
}
