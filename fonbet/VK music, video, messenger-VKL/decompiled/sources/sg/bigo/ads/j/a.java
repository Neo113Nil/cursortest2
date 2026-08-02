package sg.bigo.ads.j;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes9.dex */
public abstract class a extends sg.bigo.ads.ad.interstitial.v {
    protected final int i;
    protected final sg.bigo.ads.ad.interstitial.f j;
    protected ViewGroup k;
    protected ViewGroup l;

    @Nullable
    protected TextView m;

    @Nullable
    protected final sg.bigo.ads.n.c n;
    protected final ValueCallback<Double> o;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    public a(@NonNull sg.bigo.ads.y.b bVar, int i, @NonNull sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.n.c cVar) {
        super(bVar, oVar);
        this.o = new ValueCallback<Double>() { // from class: sg.bigo.ads.j.a.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d) {
                Double d2 = d;
                if (d2 != null) {
                    a.this.a(d2.doubleValue());
                }
            }
        };
        this.i = i;
        ?? f = bVar.f();
        this.j = new sg.bigo.ads.ad.interstitial.f(oVar.a("endpage.gp_element"), 0, f != 0 ? f.o() : "");
        this.n = cVar;
    }

    public static int a(@Nullable sg.bigo.ads.ai.o oVar) {
        return sg.bigo.ads.k.a.a(oVar, "endpage.webview_layout");
    }

    public static int b(@Nullable sg.bigo.ads.ai.o oVar) {
        return sg.bigo.ads.k.a.a(oVar, "endpage.webview_force_time", "endpage.webview_force_time_new");
    }

    public abstract void a(double d);

    public abstract void a(int i, boolean z, boolean z2);

    public abstract void a(View view);

    public abstract void d(sg.bigo.ads.ad.interstitial.r rVar);

    @Override // sg.bigo.ads.ad.interstitial.v
    public final int e() {
        sg.bigo.ads.ai.o oVar = this.g;
        return sg.bigo.ads.r.e.a(oVar != null ? oVar.a("endpage.mediaview_colour") : 3);
    }

    public final int f(@NonNull sg.bigo.ads.ad.interstitial.r rVar) {
        int i;
        sg.bigo.ads.ai.o oVar = this.g;
        if (oVar == null) {
            return -16736769;
        }
        int a = oVar.a("endpage.cta_color");
        return (a == 3 && d() && (i = sg.bigo.ads.ad.interstitial.v.a(rVar).j) != 0) ? i : sg.bigo.ads.ad.interstitial.s.a(this.f, a, null);
    }

    public boolean g() {
        return false;
    }

    public abstract int h();

    public void i() {
        String j = ((sg.bigo.ads.cp.a) this.f.f()).j();
        TextView textView = (TextView) this.l.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.l.findViewById(R.id.inter_ad_label);
        if (textView != null && TextUtils.isEmpty(j)) {
            textView.setVisibility(8);
        } else {
            if (textView == null || textView2 == null) {
                return;
            }
            textView.setText(j);
            textView.setPadding(sg.bigo.ads.common.utils.f.a(this.l.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView.getContext(), 1), sg.bigo.ads.common.utils.f.a(textView.getContext(), 4), sg.bigo.ads.common.utils.f.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
        }
    }

    public final boolean j() {
        sg.bigo.ads.ai.o oVar = this.g;
        return oVar != null && oVar.c("endpage.is_cta_show_animation");
    }

    public boolean k() {
        return false;
    }

    public View a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, @NonNull ViewGroup viewGroup, int i) {
        String str;
        String str2;
        String str3;
        if (rVar == null || viewGroup == null) {
            return this.k;
        }
        this.k = viewGroup;
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        ViewGroup viewGroup3 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), h(), null, false);
        this.l = viewGroup3;
        this.k.addView(viewGroup3, new ViewGroup.LayoutParams(-1, -1));
        this.m = (TextView) this.l.findViewById(R.id.inter_warning);
        d(rVar);
        sg.bigo.ads.common.utils.v.a(this.l, new v.a() { // from class: sg.bigo.ads.j.a.2
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                a.this.a(view);
            }
        });
        a(new Runnable() { // from class: sg.bigo.ads.j.a.3
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                sg.bigo.ads.n.c cVar = aVar.n;
                if (cVar != null) {
                    cVar.a(aVar.l, 1);
                }
            }
        });
        a(rVar, 1);
        if (k()) {
            str = "multi_ads_endpage.click_type";
            str2 = "multi_ads_endpage.media_view_clickable_switch";
            str3 = "multi_ads_endpage.other_space_clickable_switch";
        } else {
            str = "endpage.click_type";
            str2 = "endpage.media_view_clickable_switch";
            str3 = "endpage.other_space_clickable_switch";
        }
        ViewGroup viewGroup4 = this.k;
        ViewGroup viewGroup5 = this.l;
        sg.bigo.ads.ai.o oVar = this.g;
        a(rVar, viewGroup4, viewGroup5, null, i, 4, oVar == null ? 0 : oVar.a(str), this.l);
        i();
        sg.bigo.ads.ai.o oVar2 = this.g;
        int a = oVar2 != null ? oVar2.a(str) : 0;
        sg.bigo.ads.ai.o oVar3 = this.g;
        boolean z = oVar3 == null || oVar3.a(str2) == 1;
        sg.bigo.ads.ai.o oVar4 = this.g;
        a(a, z, oVar4 == null || oVar4.a(str3) == 1);
        sg.bigo.ads.ad.interstitial.v.a(rVar).e().a(this.o);
        return this.l;
    }

    @NonNull
    public final Pair<Integer, Boolean> e(@NonNull sg.bigo.ads.ad.interstitial.r rVar) {
        return Pair.create(Integer.valueOf(f(rVar)), Boolean.valueOf(j()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static a a(@NonNull sg.bigo.ads.y.b bVar, @Nullable sg.bigo.ads.ai.o oVar, @Nullable sg.bigo.ads.r.b bVar2, @Nullable sg.bigo.ads.n.c cVar, boolean z) {
        if (oVar == null || z) {
            return null;
        }
        if (bVar instanceof sg.bigo.ads.aj.e) {
            return new w(bVar, oVar, cVar);
        }
        if (bVar instanceof sg.bigo.ads.aj.f) {
            sg.bigo.ads.aj.f fVar = (sg.bigo.ads.aj.f) bVar;
            if (!fVar.i_()) {
                return fVar.I() == 3 ? new ab(bVar, oVar, cVar) : new ac(bVar, oVar, cVar);
            }
        }
        int a = oVar.a("endpage.ad_component_layout");
        switch (a) {
            case 6:
                if (bVar2 == null) {
                    return null;
                }
                return new s(bVar, a, oVar, bVar2, cVar);
            case 7:
                if (bVar2 == null) {
                    return null;
                }
                return new t(bVar, a, oVar, bVar2, cVar);
            case 8:
                if (bVar2 == null) {
                    return null;
                }
                return new u(bVar, a, oVar, bVar2, cVar);
            case 9:
                if (bVar2 == null) {
                    return null;
                }
                return new v(bVar, a, oVar, bVar2, cVar);
            case 10:
                if (bVar2 == null) {
                    return null;
                }
                return new c(bVar, a, oVar, bVar2, cVar);
            case 11:
                if (bVar2 == null) {
                    return null;
                }
                return new d(bVar, a, oVar, bVar2, cVar);
            case 12:
                if (bVar2 == null) {
                    return null;
                }
                return new e(bVar, a, oVar, bVar2, cVar);
            case 13:
                if (bVar2 == null) {
                    return null;
                }
                return new f(bVar, a, oVar, bVar2, cVar);
            case 14:
                return new g(bVar, a, oVar, cVar);
            case 15:
                return new h(bVar, a, oVar, cVar);
            case 16:
                return new i(bVar, a, oVar, cVar);
            case 17:
                return new j(bVar, a, oVar, cVar);
            case 18:
                return new k(bVar, a, oVar, cVar);
            case 19:
                return new l(bVar, a, oVar, cVar);
            case 20:
                return new m(bVar, a, oVar, cVar);
            case 21:
                return new n(bVar, a, oVar, cVar);
            case 22:
                return new o(bVar, a, oVar, cVar);
            case 23:
                return new p(bVar, a, oVar, cVar);
            case 24:
                return new q(bVar, a, oVar, cVar);
            case 25:
                return new r(bVar, a, oVar, cVar);
            default:
                return null;
        }
    }

    public void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.c.a(this.l, this.k, runnable);
    }

    public void a(@NonNull sg.bigo.ads.ad.interstitial.r rVar, int i) {
    }

    public static boolean a(a aVar, sg.bigo.ads.ai.o oVar) {
        if (aVar != null && aVar.d()) {
            return true;
        }
        if (oVar == null) {
            return false;
        }
        int a = oVar.a("endpage.ad_component_layout");
        return a == 3 || a == 4;
    }
}
