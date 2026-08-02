package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class oiz0 extends byy0 {
    public final float h;
    public final boolean i;
    public float j;

    public oiz0(String str, float f, int i, boolean z, int i2, boolean z2) {
        super(i, "playheadViewabilityValue", str, i2, z2);
        this.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.h = f;
        this.i = z;
    }
}
