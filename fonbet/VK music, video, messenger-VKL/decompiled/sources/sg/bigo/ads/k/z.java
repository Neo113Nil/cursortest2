package sg.bigo.ads.k;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.b;

/* loaded from: classes9.dex */
public final class z extends x {
    public z(@NonNull sg.bigo.ads.y.b bVar, sg.bigo.ads.ai.o oVar) {
        super(bVar, oVar);
    }

    @Override // sg.bigo.ads.k.x
    public final sg.bigo.ads.common.utils.o e(final ViewGroup viewGroup) {
        final View findViewById = viewGroup != null ? viewGroup.findViewById(R.id.inter_ad_info) : null;
        if (findViewById == null) {
            return null;
        }
        return new sg.bigo.ads.common.utils.o(((x) this).l != null ? r0.a("video_play_page.ad_component_show_time") * 1000 : 0L) { // from class: sg.bigo.ads.k.z.1
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                findViewById.setVisibility(0);
                sg.bigo.ads.ad.interstitial.c.a(findViewById, new b.d());
                z.this.f(viewGroup);
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
            }
        };
    }
}
