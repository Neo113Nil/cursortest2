package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xgy0 {
    public final String a;
    public final String b;
    public final String c;
    public String f;
    public njz0 g;
    public final HashMap e = new HashMap();
    public int h = 10000;
    public float i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public final e5z0 d = e5z0.a(giy0.d, null);

    public xgy0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final HashMap a() {
        return new HashMap(this.e);
    }

    public final boolean b() {
        return "myTarget".equals(this.a);
    }
}
