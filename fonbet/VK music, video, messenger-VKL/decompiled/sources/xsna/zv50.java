package xsna;

import android.os.RemoteException;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;

/* compiled from: NativeMarkerOptionsWrapper.kt */
/* loaded from: classes2.dex */
public final class zv50 {
    public final String a;
    public final MarkerOptions b = new MarkerOptions();

    public zv50(String str) {
        this.a = str;
    }

    public final aw50 a(s9u s9uVar) {
        eo00 a = s9uVar.a(this.b);
        if (a != null) {
            try {
                a.a.zzx(new bq70(this.a));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        } else {
            a = null;
        }
        if (a != null) {
            return new aw50(a);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(cpv cpvVar) {
        MarkerOptions markerOptions = this.b;
        if (cpvVar == null) {
            markerOptions.e = null;
            markerOptions.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            markerOptions.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return;
        }
        try {
            markerOptions.e = ((rv50) cpvVar.j.getValue()).a;
        } catch (Throwable th) {
            L.i(th);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (cpvVar.e >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (cpvVar.e & 4294967295L));
        markerOptions.f = intBitsToFloat;
        markerOptions.g = intBitsToFloat2;
    }
}
