package sg.bigo.ads.w;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.banner.g;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.i;

/* loaded from: classes9.dex */
public class a implements g {
    Context a;
    InterstitialAd b;
    public n c;

    public a(InterstitialAd interstitialAd, Context context, @NonNull n nVar) {
        this.c = nVar;
        this.a = context;
        this.b = interstitialAd;
    }

    @Override // sg.bigo.ads.ad.banner.g
    public void a(View view, View view2, i.b bVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
    }
}
