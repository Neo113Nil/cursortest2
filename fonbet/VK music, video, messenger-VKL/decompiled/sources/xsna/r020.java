package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: MediaViewTool.kt */
/* loaded from: classes4.dex */
public final class r020 implements t020 {
    public final /* synthetic */ s020 a;

    public r020(s020 s020Var) {
        this.a = s020Var;
    }

    @Override // xsna.t020
    public final void f() {
        kkw kkwVar = this.a.e;
        if (kkwVar != null) {
            kkwVar.c.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            kkwVar.f = true;
        }
    }
}
