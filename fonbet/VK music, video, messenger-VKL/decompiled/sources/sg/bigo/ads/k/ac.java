package sg.bigo.ads.k;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.f;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes9.dex */
public class ac extends x {
    public ac(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar) {
        super(bVar, oVar);
    }

    @Override // sg.bigo.ads.ad.f
    public final void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        if (this.p == null) {
            this.p = new sg.bigo.ads.ad.d();
        }
        this.p.a();
        this.p.a(viewGroup, m(), aVar);
    }
}
