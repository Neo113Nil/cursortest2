package xsna;

import android.app.Activity;
import android.content.Context;
import com.unity3d.mediation.interstitial.LevelPlayInterstitialAd;

/* compiled from: CommunityPartnerBannerRepository.kt */
/* loaded from: classes18.dex */
public final class fch implements urr, f4q0 {
    public final Object b;
    public Object c;

    public /* synthetic */ fch(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.f4q0
    public void a(n2z n2zVar) {
        this.c = n2zVar;
        ((LevelPlayInterstitialAd) this.b).setListener(new nl(n2zVar, false));
    }

    @Override // xsna.urr
    public fq4 create(Context context) {
        return new fq4((izs) this.b, context, (wzs) this.c);
    }

    @Override // xsna.f4q0
    public void g() {
        this.c = null;
        ((LevelPlayInterstitialAd) this.b).setListener(null);
    }

    @Override // xsna.f4q0
    public boolean isReady() {
        return ((LevelPlayInterstitialAd) this.b).isAdReady();
    }

    @Override // xsna.f4q0
    public void load() {
        ((LevelPlayInterstitialAd) this.b).loadAd();
    }

    @Override // xsna.f4q0
    public void show(Activity activity) {
        LevelPlayInterstitialAd levelPlayInterstitialAd = (LevelPlayInterstitialAd) this.b;
        if (levelPlayInterstitialAd.isAdReady()) {
            levelPlayInterstitialAd.showAd(activity);
            return;
        }
        n2z n2zVar = (n2z) this.c;
        if (n2zVar != null) {
            n2zVar.d();
        }
    }

    public fch(String str) {
        this.b = new LevelPlayInterstitialAd(str);
    }

    public fch(cfm0 cfm0Var) {
        this.b = cfm0Var;
        this.c = new his0();
    }

    public fch(zqu zquVar) {
        ne6 ne6Var = new ne6();
        this.b = zquVar;
        this.c = ne6Var;
    }
}
