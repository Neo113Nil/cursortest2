package xsna;

import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class pn2 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap<tqo, Integer> concurrentHashMap = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.d;
        float andSet = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.a.getAndSet(0);
        float andSet2 = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.b.getAndSet(0);
        float andSet3 = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.c.getAndSet(0);
        float f = andSet + andSet2 + andSet3;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f2 = andSet / f;
            float f3 = andSet3 / f;
            if (andSet2 / f > 0.25f || f3 > 0.1f) {
                for (Map.Entry<tqo, Integer> entry : concurrentHashMap.entrySet()) {
                    com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.a(entry.getKey(), -entry.getValue().intValue());
                }
            } else if (f2 > 0.98f) {
                for (Map.Entry<tqo, Integer> entry2 : concurrentHashMap.entrySet()) {
                    com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.a(entry2.getKey(), entry2.getValue().intValue());
                }
            }
            concurrentHashMap.clear();
        }
        ((Handler) com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.e.getValue()).postDelayed(com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.f, 2000L);
    }
}
