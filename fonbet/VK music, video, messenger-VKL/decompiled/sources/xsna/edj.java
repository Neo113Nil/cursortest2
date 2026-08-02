package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.ddj;

/* compiled from: ContactsSearchVc.kt */
/* loaded from: classes2.dex */
public final class edj implements ddj.b {
    public final /* synthetic */ ecw a;

    public edj(ecw ecwVar) {
        this.a = ecwVar;
    }

    @Override // xsna.ddj.b
    public final void a() {
        ecw ecwVar = this.a;
        if (ecwVar.d) {
            return;
        }
        ecwVar.d = true;
        ecwVar.a.setVisibility(0);
        xo2.c(ecwVar.a, ecwVar.b, ecwVar.c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, iah0.v(), 300L, new akh(ecwVar, 27));
    }

    @Override // xsna.ddj.b
    public final void b(tbh tbhVar) {
        ecw ecwVar = this.a;
        if (ecwVar.d) {
            return;
        }
        ecwVar.d = true;
        ecwVar.a.setVisibility(0);
        xo2.c(ecwVar.a, ecwVar.b, ecwVar.c, iah0.v(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300L, new com.vk.movika.sdk.base.ui.s(10, ecwVar, tbhVar));
    }

    @Override // xsna.ddj.b
    public final boolean c() {
        return this.a.d;
    }

    @Override // xsna.ddj.b
    public final void cancel() {
        d3m.b(this.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }
}
