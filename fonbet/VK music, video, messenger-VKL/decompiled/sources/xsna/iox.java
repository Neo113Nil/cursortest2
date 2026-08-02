package xsna;

import com.ironsource.Bb;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class iox implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Bb c;

    public /* synthetic */ iox(Bb bb, int i) {
        this.b = i;
        this.c = bb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                InterstitialAdLoader.a(this.c);
                break;
            default:
                RewardedAdLoader.a(this.c);
                break;
        }
    }
}
