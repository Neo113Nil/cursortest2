package sg.bigo.ads.t;

import android.app.Activity;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ad.interstitial.y;

/* loaded from: classes9.dex */
public final class a extends y {
    private int K;

    public a(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.ad.interstitial.y, sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final x c() {
        x c = super.c();
        c.c = this.K;
        return c;
    }

    public a(@NonNull Activity activity, int i) {
        super(activity);
        this.K = i;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void ab() {
    }
}
