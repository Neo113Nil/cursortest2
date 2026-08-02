package sg.bigo.ads.s;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.aa.b;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.s;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.an.i;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.h.c;
import sg.bigo.ads.q.c;
import xsna.efz;

/* loaded from: classes9.dex */
public class d extends sg.bigo.ads.ad.interstitial.a implements sg.bigo.ads.s.a {
    protected sg.bigo.ads.ad.interstitial.a I;
    protected sg.bigo.ads.aa.b J;
    protected int K;
    protected int L;
    protected boolean M;
    private sg.bigo.ads.j.a R;
    private c S;
    private TextView T;
    private boolean U;
    private int V;
    private int W;
    private int X;
    private ViewGroup Y;
    private sg.bigo.ads.y.b Z;
    private o aa;
    private boolean ab;
    private sg.bigo.ads.f.b ac;
    private final ValueCallback<Double> ad;
    private final AdCountDownButton.b ae;

    public static class a implements h {
        private final int a;
        private final int b = 14;
        private final sg.bigo.ads.y.b c;
        private final d d;

        public a(d dVar, sg.bigo.ads.y.b bVar, int i) {
            this.a = i;
            this.c = bVar;
            this.d = dVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            d dVar = this.d;
            if (dVar != null) {
                dVar.a(true, true);
            }
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(i iVar, sg.bigo.ads.api.core.e eVar) {
            sg.bigo.ads.y.b bVar = this.c;
            if (bVar != null) {
                bVar.a(iVar, this.a, this.b, eVar);
            }
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void c() {
        }
    }

    public static class b implements c.a {
        private sg.bigo.ads.y.b a;

        public b(sg.bigo.ads.y.b bVar) {
            this.a = bVar;
        }

        @Override // sg.bigo.ads.h.c.a
        public final void a(i iVar, sg.bigo.ads.api.core.e eVar) {
            sg.bigo.ads.y.b bVar = this.a;
            if (bVar != null) {
                bVar.a(iVar, 15, 13, eVar);
            }
        }
    }

    public d(@NonNull Activity activity) {
        super(activity);
        this.K = 0;
        this.L = 1;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.M = false;
        this.X = 0;
        this.ad = new ValueCallback<Double>() { // from class: sg.bigo.ads.s.d.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d) {
                c cVar;
                int i;
                Double d2 = d;
                if (d.this.S != null) {
                    if (d2.doubleValue() <= 3.0d) {
                        cVar = d.this.S;
                        i = 0;
                    } else {
                        cVar = d.this.S;
                        i = 1;
                    }
                    cVar.setStyleType$2563266(i);
                }
            }
        };
        this.ae = new AdCountDownButton.b() { // from class: sg.bigo.ads.s.d.2
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
            public final void a() {
                d dVar = d.this;
                dVar.M = true;
                dVar.au();
            }
        };
    }

    private Map<String, Integer> aA() {
        HashMap hashMap = new HashMap();
        for (sg.bigo.ads.y.b bVar : this.J.L.keySet()) {
            hashMap.put(((sg.bigo.ads.cp.a) bVar.f()).s(), 1);
            if (((sg.bigo.ads.cp.a) bVar.f()).e() != null && 1 == ((sg.bigo.ads.cp.a) bVar.f()).e().a("endpage.is_endpage", 1) && ((sg.bigo.ads.cp.a) bVar.f()).e().a("endpage.ep_sprt", 0) == 0) {
                hashMap.put(((sg.bigo.ads.cp.a) bVar.f()).s(), 2);
            }
        }
        return hashMap;
    }

    private boolean aB() {
        return this.J.I instanceof sg.bigo.ads.aa.d;
    }

    private boolean av() {
        Pair<sg.bigo.ads.y.b, sg.bigo.ads.ad.interstitial.a> as = as();
        if (as == null) {
            return false;
        }
        sg.bigo.ads.y.b bVar = (sg.bigo.ads.y.b) as.first;
        sg.bigo.ads.ad.interstitial.a aVar = (sg.bigo.ads.ad.interstitial.a) as.second;
        if (bVar == null || aVar == null) {
            return false;
        }
        ax();
        ViewGroup viewGroup = this.B;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.aa = ((sg.bigo.ads.cp.a) bVar.f()).e();
        ((t) this.A).a(bVar);
        aVar.E = bVar;
        this.K++;
        aVar.X();
        this.I = aVar;
        if (1 == this.K) {
            E();
        }
        return true;
    }

    private int aw() {
        o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar == null) {
            return 15;
        }
        if (this.U) {
            return oVar.a("multi_ads_endpage.force_staying_time", 3);
        }
        sg.bigo.ads.y.b bVar = this.Z;
        return bVar != null ? ((sg.bigo.ads.cp.a) bVar.f()).e().a("endpage.force_staying_time", 3) : oVar.a("multi_ads.force_staying_time", 15);
    }

    private void ax() {
        sg.bigo.ads.ad.interstitial.a aVar = this.I;
        if (aVar != null) {
            aVar.J();
            this.I = null;
        }
        sg.bigo.ads.aa.b bVar = this.J;
        if (bVar != null) {
            bVar.I();
        }
    }

    private boolean ay() {
        o oVar;
        b.a aVar;
        T t;
        sg.bigo.ads.y.b bVar = this.Z;
        if (bVar != null && (t = this.A) != 0) {
            ((t) t).c(bVar);
        }
        sg.bigo.ads.aa.b bVar2 = this.J;
        int i = Integer.MAX_VALUE;
        sg.bigo.ads.y.b bVar3 = null;
        for (Map.Entry<sg.bigo.ads.y.b, b.a> entry : bVar2.L.entrySet()) {
            sg.bigo.ads.y.b key = entry.getKey();
            o e = ((sg.bigo.ads.cp.a) key.f()).e();
            if (e != null && !entry.getValue().e && entry.getValue().a && 1 == e.a("endpage.is_endpage") && 1 == e.a("endpage.ep_sprt") && entry.getValue().c < i) {
                i = entry.getValue().c;
                bVar3 = key;
            }
        }
        if (bVar3 != null && (aVar = bVar2.L.get(bVar3)) != null) {
            aVar.e = true;
        }
        this.Z = bVar3;
        if (bVar3 != null || ((oVar = ((sg.bigo.ads.ad.interstitial.a) this).c) != null && 1 == oVar.a("multi_ads_endpage.is_endpage", 1) && !this.U)) {
            sg.bigo.ads.y.b bVar4 = this.Z;
            if (bVar4 != null) {
                sg.bigo.ads.j.a a2 = sg.bigo.ads.j.a.a(bVar4, ((sg.bigo.ads.cp.a) bVar4.f()).e(), null, null, false);
                this.R = a2;
                if (a2 != null) {
                    a2.h = this.P;
                    az();
                    if (this.Y != null) {
                        ax();
                        E();
                        this.R.a(this, this.Y, am());
                        at();
                        return true;
                    }
                }
            } else {
                sg.bigo.ads.aa.b bVar5 = this.J;
                if (bVar5.S > 0 && bVar5.O.get() == bVar5.S) {
                    sg.bigo.ads.j.a a3 = sg.bigo.ads.j.a.a(this.J, ((sg.bigo.ads.ad.interstitial.a) this).c, null, null, false);
                    this.R = a3;
                    if (a3 != null) {
                        a3.h = this.P;
                        az();
                        if (this.Y != null) {
                            this.U = true;
                            this.M = false;
                            E();
                            this.R.a(this, this.Y, am());
                            ax();
                            at();
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private void az() {
        ViewStub viewStub;
        if (this.Y != null || (viewStub = (ViewStub) q(R.id.bigo_ad_native_ad_view_stub)) == null) {
            return;
        }
        viewStub.setLayoutResource(R.layout.bigo_ad_activity_interstitial_multi_owner_native);
        this.Y = (ViewGroup) viewStub.inflate();
    }

    private void i(boolean z) {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || this.M) {
            return;
        }
        adCountDownButton.c(z);
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void E() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || ((sg.bigo.ads.ad.interstitial.a) this).c == null) {
            return;
        }
        if (adCountDownButton.getVisibility() != 0) {
            this.C.setVisibility(0);
            sg.bigo.ads.ad.interstitial.c.b((View) this.C);
        }
        u();
        int aw = aw();
        if (aw <= 0) {
            aw = 10;
        }
        if (this.U || this.Z != null) {
            this.C.b(aw, this.ae);
        } else {
            this.C.a(aw, this.ae);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void J() {
        this.J = null;
        this.Z = null;
        sg.bigo.ads.f.b bVar = this.ac;
        if (bVar != null) {
            bVar.b();
            this.ac = null;
        }
        super.J();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int W() {
        return R.layout.bigo_ad_one2n_activity_interstitial;
    }

    @Override // sg.bigo.ads.ad.interstitial.i, sg.bigo.ads.cl.b, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void X() {
        super.X();
        sg.bigo.ads.y.b K = ((t) this.A).K();
        if (!(K instanceof sg.bigo.ads.aa.b)) {
            aM();
            return;
        }
        this.J = (sg.bigo.ads.aa.b) K;
        o oVar = ((sg.bigo.ads.ad.interstitial.a) this).c;
        if (oVar != null) {
            this.V = oVar.a("multi_ads.n_tips", 0);
            this.L = ((sg.bigo.ads.ad.interstitial.a) this).c.a("multi_ads.switch_type", 1);
        }
        int i = this.V;
        if (i == 2) {
            FrameLayout frameLayout = (FrameLayout) q(R.id.inter_container);
            if (frameLayout != null && this.V != 0) {
                this.S = new c(this.N);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, sg.bigo.ads.common.utils.f.a(frameLayout.getContext(), 2));
                int a2 = sg.bigo.ads.common.utils.f.a(frameLayout.getContext(), 12);
                layoutParams.topMargin = sg.bigo.ads.common.utils.f.a(frameLayout.getContext(), 7);
                layoutParams.leftMargin = a2;
                layoutParams.rightMargin = a2;
                layoutParams.gravity = 48;
                frameLayout.addView(this.S, layoutParams);
                this.S.setTotalNum(aA());
            }
        } else if (i == 1) {
            TextView textView = new TextView(this.N);
            this.T = textView;
            textView.setTextSize(12.0f);
            this.T.setTextColor(r.b("#CCFFFFFF", -1));
            this.T.setShadowLayer(2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, -16777216);
            ViewGroup viewGroup = (ViewGroup) q(R.id.bigo_ad_close_progress_container);
            if (viewGroup != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(viewGroup.getContext(), 7);
                viewGroup.addView(this.T, 0, marginLayoutParams);
            }
        }
        if (av()) {
            return;
        }
        aM();
    }

    @Override // sg.bigo.ads.s.a
    public final ValueCallback<Double> a() {
        return this.ad;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final int ac() {
        return 0;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final void ae() {
        super.ae();
        f(0);
        D();
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ah() {
        sg.bigo.ads.aa.b bVar = this.J;
        if (bVar == null) {
            return true;
        }
        sg.bigo.ads.y.b bVar2 = bVar.I;
        if (bVar2 instanceof sg.bigo.ads.aa.d) {
            return ((sg.bigo.ads.aa.d) bVar2).P;
        }
        return true;
    }

    public Pair<sg.bigo.ads.y.b, sg.bigo.ads.ad.interstitial.a> as() {
        sg.bigo.ads.y.b G = this.J.G();
        if (G == null) {
            return null;
        }
        Object eVar = G instanceof sg.bigo.ads.z.d ? new e(this.N, this) : G instanceof sg.bigo.ads.z.e ? new f(this.N, this) : null;
        if (eVar == null) {
            return null;
        }
        return new Pair<>(G, eVar);
    }

    @Override // sg.bigo.ads.s.a
    public final View b() {
        sg.bigo.ads.y.b bVar;
        Pair<sg.bigo.ads.f.c, sg.bigo.ads.f.a> b2;
        FrameLayout frameLayout;
        T t = this.A;
        if (t != 0 && (bVar = this.Z) != null && (b2 = ((t) t).b(bVar)) != null) {
            sg.bigo.ads.f.c cVar = (sg.bigo.ads.f.c) b2.first;
            if (cVar.a && cVar.b() && !cVar.b) {
                cVar.a(1);
                cVar.a(new a(this, this.Z, 13));
                return cVar.o.k;
            }
            if (cVar.a && !cVar.b && cVar.h()) {
                cVar.a(new a(this, this.Z, 13));
                Activity activity = this.N;
                if (activity == null) {
                    frameLayout = null;
                } else {
                    sg.bigo.ads.f.b bVar2 = this.ac;
                    if (bVar2 != null) {
                        bVar2.b();
                    }
                    frameLayout = new FrameLayout(activity);
                    frameLayout.setTag(19);
                    sg.bigo.ads.f.b bVar3 = new sg.bigo.ads.f.b(cVar);
                    this.ac = bVar3;
                    bVar3.a(frameLayout, activity);
                }
                if (frameLayout != null) {
                    return frameLayout;
                }
            } else if (!cVar.b()) {
                cVar.o.f();
            }
            sg.bigo.ads.f.a aVar = (sg.bigo.ads.f.a) b2.second;
            if (aVar.a && aVar.b()) {
                aVar.a(1);
                aVar.a(new a(this, this.Z, 15));
                aVar.a(new b(this.Z));
                return aVar.a();
            }
            if (!aVar.b()) {
                aVar.f();
            }
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    @NonNull
    public final x c() {
        x xVar = new x();
        xVar.b = 0;
        return xVar;
    }

    @Override // sg.bigo.ads.s.a
    public final void d_() {
        this.ab = true;
    }

    @Override // sg.bigo.ads.s.a
    public final boolean e_() {
        return this.ab;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final boolean f(boolean z) {
        return a(z, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void h() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.c();
        }
        sg.bigo.ads.ad.interstitial.a aVar = this.I;
        if (aVar instanceof f) {
            ((f) aVar).h();
        } else if (aVar instanceof e) {
            ((e) aVar).h();
        } else {
            super.h();
        }
        sg.bigo.ads.j.a aVar2 = this.R;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a, sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void j() {
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        sg.bigo.ads.ad.interstitial.a aVar = this.I;
        if (aVar instanceof f) {
            ((f) aVar).j();
        } else if (aVar instanceof e) {
            ((e) aVar).j();
        } else {
            super.j();
        }
        sg.bigo.ads.j.a aVar2 = this.R;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void u() {
        String str;
        sg.bigo.ads.y.b bVar = this.Z;
        if (bVar != null) {
            this.aa = ((sg.bigo.ads.cp.a) bVar.f()).e();
        }
        o oVar = this.aa;
        if (oVar == null || this.C == null) {
            super.u();
            return;
        }
        if (this.U) {
            str = "multi_ads_endpage.close_button_style";
        } else {
            int i = this.X;
            str = (i == 11 || i == 12) ? "endpage.close_button_style" : "video_play_page.close_button_style";
        }
        s.a(oVar.a(str, 1), this.C);
    }

    @Override // sg.bigo.ads.s.a
    public final void a(int i) {
        sg.bigo.ads.y.b bVar;
        this.X = i;
        if (i == 11) {
            this.ad.onReceiveValue(Double.valueOf(1.0d));
        }
        sg.bigo.ads.aa.b bVar2 = this.J;
        int incrementAndGet = bVar2.T.incrementAndGet();
        Iterator<sg.bigo.ads.y.b> it = bVar2.L.keySet().iterator();
        while (it.hasNext()) {
            ((sg.bigo.ads.cp.a) it.next().f()).p(incrementAndGet);
        }
        if (i == 12 || i == 13) {
            c cVar = this.S;
            if (cVar != null) {
                cVar.setVisibility(8);
            }
            TextView textView = this.T;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            c cVar2 = this.S;
            if (cVar2 != null && (bVar = this.J.I) != null) {
                this.W++;
                String s = ((sg.bigo.ads.cp.a) bVar.f()).s();
                int i2 = this.W;
                if (cVar2.a.containsKey(s)) {
                    if (cVar2.d == null) {
                        cVar2.d = s;
                        cVar2.c.remove(s);
                        cVar2.c.add(0, s);
                    }
                    for (String str : cVar2.c) {
                        Integer num = cVar2.a.get(str);
                        int min = Math.min(i2, num == null ? 0 : num.intValue());
                        cVar2.b.put(str, Integer.valueOf(min));
                        i2 -= min;
                    }
                    cVar2.invalidate();
                }
            } else if (this.T != null) {
                Locale locale = Locale.US;
                this.T.setText(efz.a(this.K, this.J.S, "Ad ", " of "));
            }
        }
        u();
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        i(false);
        if (this.K <= 1 || i != 0) {
            return;
        }
        this.C.c();
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void b(@NonNull View view) {
        v.a(view, new v.a() { // from class: sg.bigo.ads.s.d.3
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view2, @NonNull Rect rect) {
                if (d.this.P != null) {
                    d.this.P.a(view2, 1);
                }
            }
        });
    }

    @Override // sg.bigo.ads.s.a
    public final void a(int i, int i2) {
        sg.bigo.ads.ad.interstitial.a aVar;
        AdCountDownButton adCountDownButton;
        AdCountDownButton adCountDownButton2;
        if (this.U) {
            return;
        }
        i(true);
        if (this.L == 2 && i2 == 2 && 1 == this.K && (adCountDownButton2 = this.C) != null && !adCountDownButton2.c && (i == 11 || (!aB() && (!this.I.P() || this.I.Q())))) {
            this.C.b();
        }
        if (this.L == 2 && i2 == 1 && (aVar = this.I) != null && ((!aVar.P() || this.I.Q()) && aB() && (adCountDownButton = this.C) != null && !adCountDownButton.c)) {
            ((sg.bigo.ads.aa.d) this.J.I).P = false;
            if (1 == this.K) {
                adCountDownButton.b();
            }
        }
        if (this.L == 1) {
            if (i == 11) {
                a(true, true);
                return;
            }
            if (i == 0) {
                sg.bigo.ads.ad.interstitial.a aVar2 = this.I;
                if (aVar2 == null || !aVar2.P() || this.I.Q()) {
                    if (aB() && i2 == 1) {
                        a(true, true);
                    } else {
                        if (aB() || i2 != 2) {
                            return;
                        }
                        a(true, true);
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.s.a
    public final void a(boolean z, int i, int i2, int i3, i iVar, sg.bigo.ads.y.b bVar, sg.bigo.ads.ad.interstitial.r rVar) {
    }

    public boolean a(boolean z, boolean z2) {
        if (this.U) {
            return true;
        }
        if (this.M && (!z2 || this.K == this.J.S)) {
            return !ay();
        }
        c.b bVar = this.I;
        if (!(bVar instanceof sg.bigo.ads.s.b) || ((sg.bigo.ads.s.b) bVar).a()) {
            return this.K == this.J.S ? !ay() : (av() || ay()) ? false : true;
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a
    public final void N() {
    }

    public void at() {
    }

    public void au() {
    }
}
