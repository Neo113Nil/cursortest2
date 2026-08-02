package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class byk implements v9k0 {
    public final /* synthetic */ qvy a;

    public byk(qvy qvyVar) {
        this.a = qvyVar;
    }

    @Override // xsna.v9k0
    public final float a(float f) {
        return this.a.a(f);
    }

    @Override // xsna.v9k0
    public final float b(float f, float f2) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
