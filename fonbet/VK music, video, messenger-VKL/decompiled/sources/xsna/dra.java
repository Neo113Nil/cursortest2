package xsna;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.state.State;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: ChainReference.java */
/* loaded from: classes11.dex */
public class dra extends androidx.constraintlayout.core.state.c {
    public float n0;

    @NonNull
    @Deprecated
    public final HashMap<String, Float> o0;

    @NonNull
    @Deprecated
    public final HashMap<String, Float> p0;

    @NonNull
    @Deprecated
    public final HashMap<String, Float> q0;
    public HashMap<String, Float> r0;
    public HashMap<String, Float> s0;

    @NonNull
    public State.Chain t0;

    public dra(@NonNull State state, @NonNull State.Helper helper) {
        super(state, helper);
        this.n0 = 0.5f;
        this.o0 = new HashMap<>();
        this.p0 = new HashMap<>();
        this.q0 = new HashMap<>();
        this.t0 = State.Chain.SPREAD;
    }

    public final float t(@NonNull String str) {
        HashMap<String, Float> hashMap = this.s0;
        return (hashMap == null || !hashMap.containsKey(str)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.s0.get(str).floatValue();
    }

    public final float u(@NonNull String str) {
        HashMap<String, Float> hashMap = this.q0;
        return hashMap.containsKey(str) ? hashMap.get(str).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final float v(@NonNull String str) {
        HashMap<String, Float> hashMap = this.r0;
        return (hashMap == null || !hashMap.containsKey(str)) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.r0.get(str).floatValue();
    }

    public final float w(@NonNull String str) {
        HashMap<String, Float> hashMap = this.p0;
        return hashMap.containsKey(str) ? hashMap.get(str).floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
