package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public final class ly81 implements b25, az81 {
    public final om2 a;
    public final wn2 b;
    public IAccountAccessor c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ GoogleApiManager f;

    public ly81(GoogleApiManager googleApiManager, om2 om2Var, wn2 wn2Var) {
        this.f = googleApiManager;
        this.a = om2Var;
        this.b = wn2Var;
    }

    @Override // defpackage.b25
    public final void a(ConnectionResult connectionResult) {
        this.f.zar.post(new tqs((Object) this, (Object) connectionResult, false, 21));
    }

    public final void b(ConnectionResult connectionResult) {
        Map map;
        map = this.f.zan;
        jy81 jy81Var = (jy81) map.get(this.b);
        if (jy81Var != null) {
            jy81Var.p(connectionResult);
        }
    }

    public final void c(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
            return;
        }
        this.c = iAccountAccessor;
        this.d = set;
        if (this.e) {
            this.a.getRemoteService(iAccountAccessor, set);
        }
    }

    public final void d(int i) {
        Map map;
        map = this.f.zan;
        jy81 jy81Var = (jy81) map.get(this.b);
        if (jy81Var != null) {
            if (jy81Var.B) {
                jy81Var.p(new ConnectionResult(17));
            } else {
                jy81Var.onConnectionSuspended(i);
            }
        }
    }
}
