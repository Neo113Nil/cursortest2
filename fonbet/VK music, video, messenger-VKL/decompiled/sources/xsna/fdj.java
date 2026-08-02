package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.ddj;

/* compiled from: ContactsSearchVc.kt */
/* loaded from: classes2.dex */
public final class fdj implements ddj.b {
    public final /* synthetic */ aiv0 a;

    public fdj(aiv0 aiv0Var) {
        this.a = aiv0Var;
    }

    @Override // xsna.ddj.b
    public final void a() {
        this.a.b();
    }

    @Override // xsna.ddj.b
    public final void b(tbh tbhVar) {
        this.a.a(tbhVar);
    }

    @Override // xsna.ddj.b
    public final boolean c() {
        return this.a.e;
    }

    @Override // xsna.ddj.b
    public final void cancel() {
        aiv0 aiv0Var = this.a;
        View view = aiv0Var.b;
        if (view != null) {
            d3m.b(view, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        }
        d3m.b(aiv0Var.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }
}
