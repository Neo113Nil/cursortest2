package sg.bigo.ads.k;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* loaded from: classes9.dex */
public final class m extends sg.bigo.ads.ad.interstitial.u {
    public m(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull View view) {
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        if (findViewById == null) {
            return;
        }
        this.d.a(findViewById, 0);
    }
}
