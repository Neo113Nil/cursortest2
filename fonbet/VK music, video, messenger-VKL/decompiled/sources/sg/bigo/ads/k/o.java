package sg.bigo.ads.k;

import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.bv.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.k.a;

/* loaded from: classes9.dex */
public class o extends n {
    private LinearLayout H;
    private RoundedFrameLayout I;
    private TextView J;
    private IconListView K;
    private RoundedFrameLayout L;
    private Button M;
    private sg.bigo.ads.common.utils.o N;
    private ImageView O;
    private boolean P;
    private boolean Q;
    private int R;

    public o(@NonNull sg.bigo.ads.y.b bVar) {
        super(bVar);
        this.P = false;
        this.Q = false;
    }

    public static /* synthetic */ void g(o oVar) {
        oVar.Q = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        TransitionManager.beginDelayedTransition(oVar.s, transitionSet);
        oVar.H.getMeasuredWidth();
        oVar.c(oVar.H.getMeasuredHeight());
    }

    @Override // sg.bigo.ads.k.n
    public final boolean C() {
        return false;
    }

    @Override // sg.bigo.ads.k.n
    public final int D() {
        return Integer.MIN_VALUE;
    }

    @Override // sg.bigo.ads.k.n
    public final sg.bigo.ads.r.c F() {
        return sg.bigo.ads.r.c.FILL_MATCH_SELF;
    }

    @Override // sg.bigo.ads.k.n
    public final void I() {
        if (this.Q) {
            super.I();
        }
    }

    @Override // sg.bigo.ads.k.n
    public final void J() {
        super.J();
        if (this.t.h) {
            sg.bigo.ads.y.a.a(this.I, 18);
            sg.bigo.ads.y.a.a(this.r, this.I, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
        } else {
            sg.bigo.ads.y.a.a(this.r, this.I, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
        }
        IconListView iconListView = this.K;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i = 0; items != null && i < items.size(); i++) {
                IconListView.a aVar = items.get(i);
                sg.bigo.ads.y.a.a(aVar.d, 26);
                sg.bigo.ads.y.a.a(this.r, aVar.d, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
                sg.bigo.ads.y.a.a(aVar.g, 26);
                sg.bigo.ads.y.a.a(this.r, aVar.g, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
            }
        }
        sg.bigo.ads.ad.interstitial.x xVar = this.t;
        if (xVar == null || !xVar.g) {
            sg.bigo.ads.y.a.a(this.r, this.F.j, 8, sg.bigo.ads.ad.interstitial.r.H, 0);
        } else {
            sg.bigo.ads.y.a.a(this.F.j, 9);
            sg.bigo.ads.y.a.a(this.r, this.F.j, 8, ((sg.bigo.ads.ad.interstitial.u) this).c, this.t.i);
        }
    }

    public int L() {
        return 0;
    }

    public int M() {
        return 0;
    }

    public int N() {
        return 0;
    }

    @Override // sg.bigo.ads.k.n, sg.bigo.ads.k.a
    public final void a(double d) {
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.o oVar = this.N;
        if (oVar == null || oVar.e()) {
            return;
        }
        this.N.d();
    }

    @Override // sg.bigo.ads.k.n, sg.bigo.ads.k.a
    public final void t() {
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar;
        super.t();
        this.w.setTextColor(sg.bigo.ads.ad.interstitial.d.b);
        ((n) this).y.removeView(this.A);
        this.A.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int i = -1;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.H.addView(this.A, 0, layoutParams);
        sg.bigo.ads.common.utils.v.a(this.H, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.k.o.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (o.this.P) {
                    return;
                }
                o oVar = o.this;
                oVar.H.getMeasuredWidth();
                oVar.c(o.this.H.getMeasuredHeight());
            }
        });
        this.K.a(this.v);
        if (sg.bigo.ads.common.utils.l.a((Collection) this.K.getItems())) {
            this.K.setVisibility(8);
        } else {
            this.K.setVisibility(0);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar = this.C;
        if (cVar != null) {
            cVar.a(false);
        }
        sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.a(false);
        }
        sg.bigo.ads.r.a aVar = this.E;
        if (aVar != null) {
            aVar.f = false;
        }
        int w = w();
        if (w != 1) {
            if (w == 2) {
                bVar = this.F;
                i = -16777216;
            }
            K();
            a((b.a) null, false);
        }
        bVar = this.F;
        bVar.b(sg.bigo.ads.bv.b.b(i));
        K();
        a((b.a) null, false);
    }

    @Override // sg.bigo.ads.k.a
    public final int x() {
        return 2;
    }

    @Override // sg.bigo.ads.k.n
    public final boolean z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.F == null) {
            return;
        }
        int N = N();
        int M = M();
        Context context = this.A.getContext();
        this.F.k.setCornerRadius(L());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.k.getLayoutParams();
        marginLayoutParams.leftMargin = M;
        boolean z = this.Q;
        marginLayoutParams.topMargin = z ? this.R + N : N;
        marginLayoutParams.rightMargin = M;
        if (z) {
            N += this.R;
        }
        marginLayoutParams.bottomMargin = N;
        this.F.k.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
        int i2 = this.R;
        marginLayoutParams2.topMargin = -i2;
        marginLayoutParams2.height = (i2 * 2) + i;
        this.A.setLayoutParams(marginLayoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.F.a.getLayoutParams();
        marginLayoutParams3.bottomMargin = sg.bigo.ads.common.utils.f.a(context, 12) + this.R;
        this.F.a.setLayoutParams(marginLayoutParams3);
        RoundedFrameLayout roundedFrameLayout = this.I;
        int i3 = this.R;
        roundedFrameLayout.a(i3, i3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.I.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.I.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 0;
        layoutParams.weight = 1.0f;
        layoutParams.topMargin = -this.R;
        this.I.setLayoutParams(layoutParams);
    }

    @Override // sg.bigo.ads.k.n
    public final void a(int i, boolean z, int i2, boolean z2) {
        super.a(i, z, i, false);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.o oVar = this.N;
        if (oVar == null || !oVar.e()) {
            return;
        }
        this.N.c();
    }

    public static /* synthetic */ void c(o oVar) {
        oVar.P = true;
        oVar.Q = true;
        oVar.r.post(new Runnable() { // from class: sg.bigo.ads.k.o.3
            @Override // java.lang.Runnable
            public final void run() {
                o oVar2 = o.this;
                oVar2.H.getMeasuredWidth();
                oVar2.c(o.this.H.getMeasuredHeight());
                o.this.O.setVisibility(4);
            }
        });
        final float a = sg.bigo.ads.common.utils.f.a(oVar.r.getContext(), 252);
        final float measuredWidth = oVar.A.getMeasuredWidth();
        sg.bigo.ads.an.p a2 = sg.bigo.ads.ad.interstitial.s.a(((sg.bigo.ads.ad.interstitial.u) oVar).c);
        if (a2.a()) {
            float f = measuredWidth / a;
            int i = a2.b;
            int i2 = a2.c;
            if (f < (i * 1.0f) / i2) {
                a = ((i2 * measuredWidth) * 1.0f) / i;
            }
        }
        oVar.r.post(new Runnable() { // from class: sg.bigo.ads.k.o.4
            @Override // java.lang.Runnable
            public final void run() {
                o.b(o.this, (int) a);
            }
        });
    }

    @Override // sg.bigo.ads.k.n
    public final void a(sg.bigo.ads.ad.interstitial.r rVar) {
        super.a(rVar);
        this.H = (LinearLayout) this.r.findViewById(R.id.inter_media_container);
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) this.r.findViewById(R.id.inter_media_gp_container);
        this.I = roundedFrameLayout;
        this.J = (TextView) roundedFrameLayout.findViewById(R.id.inter_company);
        this.K = (IconListView) this.I.findViewById(R.id.inter_download_msg);
        RoundedFrameLayout roundedFrameLayout2 = (RoundedFrameLayout) this.I.findViewById(R.id.inter_btn_cta_layout);
        this.L = roundedFrameLayout2;
        this.M = (Button) roundedFrameLayout2.findViewById(R.id.inter_btn_cta);
        this.O = (ImageView) this.I.findViewById(R.id.inter_gp_btn_close);
        this.R = sg.bigo.ads.common.utils.f.a(this.r.getContext(), 12);
    }

    @Override // sg.bigo.ads.k.n
    public final void b(int i) {
        super.b(i);
        sg.bigo.ads.common.utils.o oVar = new sg.bigo.ads.common.utils.o(Math.max(1, i) * 1000) { // from class: sg.bigo.ads.k.o.2
            @Override // sg.bigo.ads.common.utils.o
            public final void a() {
                o.this.r.post(new Runnable() { // from class: sg.bigo.ads.k.o.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        o.c(o.this);
                    }
                });
            }

            @Override // sg.bigo.ads.common.utils.o
            public final void a(long j) {
            }
        };
        this.N = oVar;
        oVar.c();
    }

    private void a(b.a aVar, boolean z) {
        a.C2498a u = u();
        Button button = this.M;
        if (button != null) {
            sg.bigo.ads.ad.interstitial.d.a(button, u.a, aVar);
        }
        TextView textView = this.J;
        if (textView != null) {
            textView.setTextColor(u.a);
        }
        if (z && u.b) {
            a(this.M, new b.a() { // from class: sg.bigo.ads.k.o.8
                @Override // sg.bigo.ads.bv.b.a
                public final void b(int i) {
                    super.b(i);
                    if (o.this.J != null) {
                        o.this.J.setTextColor(i);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void b(o oVar, int i) {
        long j;
        long max;
        sg.bigo.ads.common.utils.s sVar;
        final boolean v = oVar.v();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addListener((Transition.TransitionListener) new sg.bigo.ads.an.h() { // from class: sg.bigo.ads.k.o.7
            @Override // sg.bigo.ads.an.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                if (v) {
                    sg.bigo.ads.ad.interstitial.c.e(o.this.L);
                }
                o.this.I();
            }
        });
        TransitionManager.beginDelayedTransition(oVar.s, transitionSet);
        oVar.a(new b.a(), true);
        oVar.c(i);
        sg.bigo.ads.ad.interstitial.f fVar = oVar.v;
        if (fVar != null) {
            int i2 = fVar.b;
            int i3 = 3;
            if (i2 == 1) {
                sVar = sg.bigo.ads.common.utils.s.a;
            } else if (i2 == 2) {
                sVar = sg.bigo.ads.common.utils.s.a;
                i3 = 5;
            } else if (i2 == 3) {
                sVar = sg.bigo.ads.common.utils.s.a;
                i3 = 10;
            }
            j = sVar.a(i3);
            max = Math.max(0L, j);
            if (max != 0) {
                oVar.O.setVisibility(0);
            } else {
                oVar.O.postDelayed(new Runnable() { // from class: sg.bigo.ads.k.o.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.d.c.a((sg.bigo.ads.d.c) ((sg.bigo.ads.ad.interstitial.u) o.this).c)) {
                            return;
                        }
                        TransitionSet transitionSet2 = new TransitionSet();
                        transitionSet2.addTransition(new Fade());
                        TransitionManager.beginDelayedTransition(o.this.I, transitionSet2);
                        o.this.O.setVisibility(0);
                    }
                }, max);
            }
            oVar.O.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.k.o.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o.g(o.this);
                }
            });
        }
        j = 0;
        max = Math.max(0L, j);
        if (max != 0) {
        }
        oVar.O.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.k.o.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.g(o.this);
            }
        });
    }
}
