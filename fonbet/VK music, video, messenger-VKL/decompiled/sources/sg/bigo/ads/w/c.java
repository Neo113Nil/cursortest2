package sg.bigo.ads.w;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.i;
import sg.bigo.ads.common.utils.f;

/* loaded from: classes9.dex */
public final class c extends a {
    public c(InterstitialAd interstitialAd, Context context, @NonNull n nVar) {
        super(interstitialAd, context, nVar);
    }

    @Override // sg.bigo.ads.w.a, sg.bigo.ads.ad.banner.g
    public final void a(View view, View view2, i.b bVar) {
        int a = bVar != null ? bVar.a() : 0;
        int b = bVar != null ? bVar.b() : 0;
        Context context = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (a <= 0 || b <= 0) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            return;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        int c = f.c(context);
        if (a > b) {
            layoutParams.width = -1;
            layoutParams.height = (int) (((b * 1.0f) / a) * i);
        } else {
            layoutParams.width = (int) (((a * 1.0f) / b) * c);
            layoutParams.height = -1;
        }
        layoutParams.gravity = 17;
    }
}
