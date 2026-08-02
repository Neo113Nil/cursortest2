package sg.bigo.ads.j;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.common.view.RoundedImageView;

/* loaded from: classes9.dex */
public class i extends g {
    private View u;
    private RoundedImageView v;

    public i(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, i, oVar, cVar);
    }

    @Override // sg.bigo.ads.j.g, sg.bigo.ads.j.a
    public final void d(final sg.bigo.ads.ad.interstitial.r rVar) {
        super.d(rVar);
        ViewGroup viewGroup = this.l;
        if (viewGroup == null) {
            return;
        }
        this.u = viewGroup.findViewById(R.id.inter_end_page_image_layout);
        this.v = (RoundedImageView) this.l.findViewById(R.id.inter_end_page_image);
        sg.bigo.ads.common.utils.v.a(this.u, new v.a() { // from class: sg.bigo.ads.j.i.1
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                int a;
                float a2;
                int i;
                int i2;
                sg.bigo.ads.an.p b = i.this.b(rVar);
                if (b.a(rect.width(), rect.height())) {
                    i2 = -1;
                    a2 = 0.0f;
                    a = 0;
                    i = -1;
                } else {
                    a = sg.bigo.ads.common.utils.f.a(i.this.v.getContext(), 20);
                    int i3 = a * 2;
                    sg.bigo.ads.an.p a3 = sg.bigo.ads.an.p.a(b.b, b.c, rect.width() - i3, rect.height() - i3);
                    int i4 = a3.b;
                    int i5 = a3.c;
                    a2 = sg.bigo.ads.common.utils.f.a(i.this.v.getContext(), 8);
                    i = i5;
                    i2 = i4;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i.this.v.getLayoutParams();
                marginLayoutParams.setMargins(a, a, a, a);
                marginLayoutParams.width = i2;
                marginLayoutParams.height = i;
                i.this.v.requestLayout();
                i.this.v.setCornerRadius(a2);
            }
        });
        TextView textView = this.m;
        if (textView != null) {
            sg.bigo.ads.ad.interstitial.d.a(textView, -1);
        }
    }

    @Override // sg.bigo.ads.j.g, sg.bigo.ads.j.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_16_17;
    }

    @Override // sg.bigo.ads.j.g
    public final void l() {
        View view = this.p;
        if (view != null) {
            view.setBackgroundColor(-1);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.v
    public final boolean d() {
        sg.bigo.ads.cp.a aVar;
        sg.bigo.ads.y.b bVar = this.f;
        if (bVar == null || (aVar = (sg.bigo.ads.cp.a) bVar.f()) == null) {
            return true;
        }
        return aVar.aZ();
    }

    @Override // sg.bigo.ads.j.g, sg.bigo.ads.j.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.j.g, sg.bigo.ads.j.a
    public final void a(int i, boolean z, boolean z2) {
        sg.bigo.ads.y.a.a(this.v, 5);
        if (z) {
            sg.bigo.ads.y.a.a(this.k, this.v, 4, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(this.k, this.v, 4, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        sg.bigo.ads.y.a.a(this.u, 9);
        ViewGroup viewGroup = this.k;
        if (z2) {
            sg.bigo.ads.y.a.a(viewGroup, this.u, 4, this.f, i);
        } else {
            sg.bigo.ads.y.a.a(viewGroup, this.u, 4, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        sg.bigo.ads.ai.o oVar = this.g;
        boolean z3 = true;
        if (oVar != null && oVar.a("endpage.ad_component_clickable_switch") != 1) {
            z3 = false;
        }
        View view = this.p;
        if (view != null) {
            sg.bigo.ads.y.a.a(view, 18);
            if (z3) {
                sg.bigo.ads.y.a.a(this.k, this.p, 8, this.f, i);
            } else {
                sg.bigo.ads.y.a.a(this.k, this.p, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
            }
        }
    }

    @Override // sg.bigo.ads.j.g, sg.bigo.ads.j.a
    public final void a(final Runnable runnable) {
        b(new Runnable() { // from class: sg.bigo.ads.j.i.2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                i.this.m();
            }
        });
    }
}
