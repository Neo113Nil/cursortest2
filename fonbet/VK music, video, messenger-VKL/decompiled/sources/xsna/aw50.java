package xsna;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;

/* compiled from: NativeMarkerWrapper.kt */
/* loaded from: classes2.dex */
public final class aw50 implements byf0 {
    public final eo00 a;
    public cpv b = null;
    public boolean c;

    public aw50(eo00 eo00Var) {
        this.a = eo00Var;
    }

    @Override // xsna.byf0
    public final String a() {
        try {
            Object g = bq70.g(this.a.a.zzh());
            String str = g instanceof String ? (String) g : null;
            return str != null ? str : "null";
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.byf0
    public final void b(cpv cpvVar) {
        this.b = cpvVar;
        d(cpvVar);
    }

    @Override // xsna.byf0
    public final void c(float f) {
        eo00 eo00Var = this.a;
        eo00Var.getClass();
        try {
            eo00Var.a.zzA(f);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(cpv cpvVar) {
        eo00 eo00Var = this.a;
        if (cpvVar == null) {
            eo00Var.c(null);
            eo00Var.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            try {
                eo00Var.c(((rv50) cpvVar.j.getValue()).a);
            } catch (Throwable th) {
                L.i(th);
            }
            eo00Var.b(Float.intBitsToFloat((int) (cpvVar.e >> 32)), Float.intBitsToFloat((int) (cpvVar.e & 4294967295L)));
        }
    }

    public final void e(boolean z) {
        try {
            this.a.a.zzz(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // xsna.byf0
    public final cpv getIcon() {
        return this.b;
    }
}
