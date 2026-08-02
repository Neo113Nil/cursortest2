package sg.bigo.ads.j;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.bv.b;

/* loaded from: classes9.dex */
public class t extends s {
    public t(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @NonNull sg.bigo.ads.r.b bVar2, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, bVar2, cVar);
    }

    @Override // sg.bigo.ads.j.s, sg.bigo.ads.j.b
    public final void g(sg.bigo.ads.ad.interstitial.r rVar) {
        super.g(rVar);
        this.s.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.f.a(this.m.getContext(), 0);
        this.m.setLayoutParams(marginLayoutParams);
    }

    @Override // sg.bigo.ads.j.s, sg.bigo.ads.j.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_7;
    }

    @Override // sg.bigo.ads.j.s, sg.bigo.ads.j.a
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
        super.a(rVar, i);
        if (this.g == null) {
            return;
        }
        final View findViewById = this.l.findViewById(R.id.inter_btn_cta_layout);
        final Button button = (Button) this.l.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        int max = Math.max(1, i);
        final Pair<Integer, Boolean> e = e(rVar);
        button.postDelayed(new Runnable() { // from class: sg.bigo.ads.j.t.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) t.this.f)) {
                    return;
                }
                sg.bigo.ads.ad.interstitial.d.a(button, ((Integer) e.first).intValue(), new b.a() { // from class: sg.bigo.ads.j.t.1.1
                    @Override // sg.bigo.ads.bv.b.a
                    public final void b(int i2) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (findViewById == null || !((Boolean) e.second).booleanValue()) {
                            return;
                        }
                        sg.bigo.ads.ad.interstitial.c.e(findViewById);
                    }
                });
            }
        }, max * 1000);
    }
}
