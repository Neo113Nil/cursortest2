package sg.bigo.ads.l;

import android.view.View;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ai.o;

/* loaded from: classes9.dex */
public final class b extends sg.bigo.ads.k.c {
    public b(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.k.b
    public final void A() {
        o oVar;
        int a;
        if (!v() || ((sg.bigo.ads.k.b) this).z == null || (oVar = this.u) == null || (a = oVar.a("video_play_page.guide_click_timing", 0)) < 0) {
            return;
        }
        ((sg.bigo.ads.k.b) this).z.postDelayed(new Runnable() { // from class: sg.bigo.ads.l.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.this.B();
            }
        }, a * 1000);
    }

    @Override // sg.bigo.ads.k.b, sg.bigo.ads.ad.interstitial.u
    public final void a(@NonNull View view) {
        View findViewById = view.findViewById(R.id.inter_ad_tag_layout);
        View findViewById2 = view.findViewById(R.id.inter_options);
        sg.bigo.ads.ax.b bVar = this.d;
        if (bVar == null) {
            return;
        }
        bVar.a(findViewById, 0);
        this.d.a(findViewById2, 0);
    }

    @Override // sg.bigo.ads.k.a
    public final boolean v() {
        o oVar = this.u;
        if (oVar != null) {
            return oVar.c("video_play_page.guide_click");
        }
        return false;
    }

    @Override // sg.bigo.ads.k.a
    public final int y() {
        o oVar = this.u;
        if (oVar != null) {
            return oVar.a("video_play_page.ad_component_show_time", 0);
        }
        return 0;
    }
}
