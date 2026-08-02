package sg.bigo.ads.j;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.u;

/* loaded from: classes9.dex */
public final class ac extends ab {
    private boolean u;

    public ac(@NonNull sg.bigo.ads.y.b bVar, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, oVar, cVar);
        this.u = false;
        this.t = false;
    }

    public final void a(int i) {
        this.p = i;
    }

    @Override // sg.bigo.ads.j.ab, sg.bigo.ads.j.a
    public final void d(sg.bigo.ads.ad.interstitial.r rVar) {
        ViewGroup viewGroup;
        this.u = sg.bigo.ads.common.utils.f.c(this.f.b.e) <= 2000;
        super.d(rVar);
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundColor(0);
            ViewGroup viewGroup3 = (ViewGroup) this.l.findViewById(R.id.bigo_ad_bottom_privacy_content);
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.l.findViewById(R.id.bigo_ad_inter_layout_end_page);
            if (viewGroup4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            String str = this.f.T().f;
            if (!sg.bigo.ads.common.utils.r.b((CharSequence) str) || (viewGroup = this.k) == null) {
                return;
            }
            Context context = viewGroup.getContext();
            sg.bigo.ads.common.view.c.a(context, this.k, new sg.bigo.ads.common.view.c(context, str));
        }
    }

    @Override // sg.bigo.ads.j.a
    public final boolean k() {
        return true;
    }

    @Override // sg.bigo.ads.j.ab
    public final int l() {
        return 13;
    }

    @Override // sg.bigo.ads.j.ab
    public final int p() {
        return 20;
    }

    @Override // sg.bigo.ads.j.ab
    public final int q() {
        if (this.u) {
            return 138;
        }
        return super.q();
    }

    @Override // sg.bigo.ads.j.ab
    public final void a(boolean z, boolean z2) {
        if (this.u) {
            if (z) {
                ViewGroup viewGroup = (ViewGroup) this.k.findViewById(R.id.bigo_ad_end_page_content);
                if (viewGroup != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    marginLayoutParams.topMargin = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 146);
                    viewGroup.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            if (z2) {
                ViewGroup viewGroup2 = (ViewGroup) this.k.findViewById(R.id.bigo_ad_end_page_content);
                if (viewGroup2 != null) {
                    int a = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 10);
                    int a2 = sg.bigo.ads.common.utils.f.a(viewGroup2.getContext(), 20);
                    viewGroup2.setPadding(a2, a, a2, a);
                }
                View findViewById = this.k.findViewById(R.id.inter_icon);
                if (findViewById != null) {
                    findViewById.setTranslationY(sg.bigo.ads.common.utils.f.a(findViewById.getContext(), -80));
                }
            }
        }
    }

    @Override // sg.bigo.ads.j.ab, sg.bigo.ads.ad.interstitial.v
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, @NonNull View view, u.a aVar, int i, int i2, int i3, @Nullable View... viewArr) {
        return a(this.f, rVar, viewGroup, view, aVar, i, 13, i3, viewArr);
    }
}
