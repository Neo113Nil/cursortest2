package sg.bigo.ads.u;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.p;

/* loaded from: classes9.dex */
public final class b extends a {
    protected TextView t;
    protected TextView u;

    public b(@NonNull sg.bigo.ads.y.b bVar, @NonNull o oVar, @NonNull p pVar) {
        super(bVar, oVar, pVar);
    }

    @Override // sg.bigo.ads.u.a
    public final void d(@NonNull r rVar) {
        ViewGroup viewGroup = this.l;
        if (viewGroup == null || rVar == null) {
            return;
        }
        this.t = (TextView) viewGroup.findViewById(R.id.inter_title);
        this.u = (TextView) this.l.findViewById(R.id.inter_description);
        sg.bigo.ads.ad.interstitial.d.a(this.t, -234881024);
        sg.bigo.ads.ad.interstitial.d.a(this.u, -234881024);
    }

    @Override // sg.bigo.ads.u.a
    public final boolean g() {
        p pVar = ((a) this).i;
        return pVar != null && pVar.c > 960;
    }

    @Override // sg.bigo.ads.u.a
    public final int h() {
        return R.layout.bigo_ad_view_click_guide_1;
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        return false;
    }
}
