package xsna;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.libvideo.live.impl.views.error.ErrorView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Iterator;
import xsna.dw20;
import xsna.h7u0;
import xsna.ify;
import xsna.tzp0;

/* compiled from: BroadcastView.java */
/* loaded from: classes16.dex */
public final class ek8 extends FrameLayout implements pe8, gv5 {
    public pl70 A;
    public ujk0 B;
    public ikp C;
    public final Activity D;
    public boolean E;
    public boolean F;
    public ays G;
    public final jfy H;
    public final HashSet I;
    public final a J;
    public final ErrorView b;
    public final View c;
    public final LinearLayout d;
    public final FrameLayout e;
    public final FrameLayout f;
    public final FrameLayout g;
    public final FrameLayout h;
    public final View i;
    public final VkSpinner j;
    public final View k;
    public final View l;
    public final int m;
    public boolean n;
    public boolean o;
    public float p;
    public float q;
    public final float r;
    public ne8 s;
    public boolean t;
    public f3y0 u;
    public yxj v;
    public ck8 w;
    public ef8 x;
    public lnz y;
    public nzb z;

    /* compiled from: BroadcastView.java */
    public class a implements ify.a {
        public a() {
        }

        @Override // xsna.ify.a
        public final void Y0() {
            ek8.this.b();
        }

        @Override // xsna.ify.a
        public final void x0(int i) {
            ek8.this.b();
        }
    }

    /* compiled from: BroadcastView.java */
    public class b implements izs<Integer, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            ek8.this.d.setTranslationY(-num.intValue());
            return s3q0.a;
        }
    }

    /* compiled from: BroadcastView.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ek8.this.getPresenter().q();
        }
    }

    /* compiled from: BroadcastView.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ek8.this.getPresenter().q();
        }
    }

    public ek8(@NonNull l7s l7sVar) {
        super(l7sVar, null, 0);
        this.m = iah0.a(120);
        this.n = false;
        this.o = false;
        this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.r = iah0.a(20.0f);
        this.E = true;
        this.F = true;
        this.I = new HashSet();
        a aVar = new a();
        this.J = aVar;
        View inflate = LayoutInflater.from(l7sVar).inflate(R.layout.live_broadcast, (ViewGroup) this, true);
        setKeepScreenOn(true);
        this.g = (FrameLayout) inflate.findViewById(R.id.broadcast_main_holder);
        this.h = (FrameLayout) inflate.findViewById(R.id.bottom_sheet_container);
        this.i = inflate.findViewById(R.id.bottom_sheet_gradient_view);
        View findViewById = inflate.findViewById(R.id.broadcast_close);
        this.c = findViewById;
        this.e = (FrameLayout) inflate.findViewById(R.id.broadcast_top_holder_left);
        this.f = (FrameLayout) inflate.findViewById(R.id.broadcast_top_holder_center);
        this.d = (LinearLayout) inflate.findViewById(R.id.broadcast_top_holder);
        this.j = (VkSpinner) inflate.findViewById(R.id.broadcast_progress);
        this.b = (ErrorView) inflate.findViewById(R.id.broadcast_error);
        View findViewById2 = inflate.findViewById(R.id.broadcast_fade_up);
        this.k = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.broadcast_fade_bottom);
        this.l = findViewById3;
        findViewById2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        findViewById3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        findViewById.setVisibility(8);
        setClipToPadding(false);
        setClipChildren(false);
        findViewById.setOnClickListener(new fk8(this));
        Context context = getContext();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        this.D = h;
        jfy jfyVar = new jfy(h, h.getWindow());
        this.H = jfyVar;
        h.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(jfyVar);
        int i = ify.a;
        ify.a(aVar);
    }

    private int getViewIndexOverGradient() {
        View view = this.i;
        return ((ViewGroup) view.getParent()).indexOfChild(view) + 1;
    }

    private void setChatAndFlyViewsTranslationY(float f) {
        lnz lnzVar = this.y;
        if (lnzVar != null) {
            lnzVar.setTranslationY(f);
        }
        nzb nzbVar = this.z;
        if (nzbVar != null) {
            nzbVar.setTranslationY(f);
        }
    }

    @Override // xsna.pe8
    public final void A() {
        this.n = false;
        b();
    }

    @Override // xsna.pe8
    public final void B2(boolean z) {
        View view = this.k;
        View view2 = this.l;
        if (z) {
            view2.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).start();
            view.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).start();
        } else {
            view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // xsna.pe8
    public final f2y0 C(boolean z) {
        f3y0 f3y0Var = new f3y0(getContext());
        this.u = f3y0Var;
        f3y0Var.setBottomSheetParams(new ojf0(iah0.a(64), false, 2.4f, true, true, true));
        this.u.setBottomSheet(this.h);
        this.u.setBottomSheetGradientView(this.i);
        this.u.o0(this, true);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(64.0f));
        layoutParams.gravity = 80;
        this.u.setLayoutParams(layoutParams);
        this.g.addView(this.u, getViewIndexOverGradient());
        if (z) {
            this.u.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.u.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.I.add(this.u);
        f3y0 f3y0Var2 = this.u;
        f3y0Var2.x = new ec(this, 13);
        return f3y0Var2;
    }

    @Override // xsna.pe8
    public final void C1(@Nullable View view, Boolean bool) {
        Activity activity = this.D;
        this.G = new ays(activity, activity.getWindow(), view);
        if (!iah0.s(activity) && !fnj.d(activity)) {
            this.G.b = new b();
        }
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.G);
        this.G.c = !bool.booleanValue();
    }

    @Override // xsna.pe8
    public final kxj C2() {
        this.v = new yxj(getContext());
        this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.v.setCancelPosition(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.g.addView(this.v, getViewIndexOverGradient());
        this.v.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.v.animate().alpha(1.0f).setDuration(300L).start();
        this.I.add(this.v);
        return this.v;
    }

    @Override // xsna.pe8
    public final prk0 D3() {
        Context context = getContext();
        dhr0.a.getClass();
        return new xsk0(new l7s(context, dhr0.u().c));
    }

    @Override // xsna.pe8
    public final uur J() {
        this.y = new lnz(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iah0.a(150.0f), iah0.a(400.0f));
        layoutParams.gravity = 85;
        layoutParams.bottomMargin = iah0.a(64.0f);
        layoutParams.rightMargin = iah0.a(-48.0f);
        this.y.setLayoutParams(layoutParams);
        this.g.addView(this.y, 0);
        this.I.add(this.y);
        return this.y;
    }

    @Override // xsna.pe8
    public final rpb K() {
        this.z = new nzb(getContext(), false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = iah0.a(64.0f);
        this.z.setLayoutParams(layoutParams);
        this.g.addView(this.z, 0);
        this.z.setActionLinkMarginBottom(iah0.a(12));
        this.I.add(this.z);
        return this.z;
    }

    @Override // xsna.pe8
    public final void P2() {
        this.l.animate().alpha(1.0f).setDuration(300L).start();
        this.k.animate().alpha(0.5f).setDuration(300L).start();
    }

    @Override // xsna.pe8
    public final ak8 R0() {
        ck8 ck8Var = new ck8(getContext());
        this.w = ck8Var;
        ck8Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g.addView(this.w, 0);
        this.w.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.w.animate().alpha(1.0f).setDuration(300L).start();
        this.I.add(this.w);
        return this.w;
    }

    @Override // xsna.pe8
    public final void S(boolean z) {
        VkSpinner vkSpinner = this.j;
        if (vkSpinner.getVisibility() == 8) {
            vkSpinner.setVisibility(0);
            vkSpinner.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vkSpinner.animate().alpha(1.0f).setStartDelay(900L).setDuration(300L).start();
        }
    }

    @Override // xsna.pe8
    public final void Y3(ViewGroup viewGroup, String str) {
        Context context = getContext();
        dhr0.a.getClass();
        new dw20.b(new l7s(context, dhr0.u().c), new tzp0.c(null, false)).w0(str).D0(viewGroup, false).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3)).I0("BroadcastView" + str);
    }

    public final void a() {
        boolean z = this.E;
        this.E = !z;
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        f3y0 f3y0Var = this.u;
        if (f3y0Var != null) {
            f3y0Var.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(accelerateInterpolator).setDuration(250L).start();
            this.u.animate().translationY(!z ? 0.0f : iah0.a(80.0f)).setInterpolator(accelerateInterpolator).setDuration(250L).start();
        }
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(accelerateInterpolator).setDuration(250L).start();
            linearLayout.animate().translationY(!z ? 0.0f : -iah0.a(80.0f)).setInterpolator(accelerateInterpolator).setDuration(250L).start();
        }
        lnz lnzVar = this.y;
        if (lnzVar != null) {
            lnzVar.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(accelerateInterpolator).setDuration(250L).start();
        }
        nzb nzbVar = this.z;
        if (nzbVar != null) {
            nzbVar.animate().alpha(!z ? 1.0f : 0.0f).setInterpolator(accelerateInterpolator).setDuration(250L).start();
        }
        View view = this.k;
        if (view != null) {
            view.animate().alpha(!z ? 0.5f : 0.0f).setInterpolator(accelerateInterpolator).setDuration(250L).start();
        }
        View view2 = this.l;
        if (view2 != null) {
            view2.animate().alpha(z ? 0.0f : 1.0f).setInterpolator(accelerateInterpolator).setDuration(250L).start();
        }
    }

    @Override // xsna.gv5
    public final boolean a0() {
        ikp ikpVar;
        f3y0 f3y0Var = this.u;
        boolean a0 = f3y0Var != null ? f3y0Var.a0() : false;
        if (!a0) {
            a0 = this.s.L0();
        }
        if (!a0 && (ikpVar = this.C) != null) {
            ikpVar.a();
            a0 = true;
        }
        if (a0) {
            return a0;
        }
        if (!this.s.q1()) {
            this.s.close();
            return true;
        }
        h7u0.a aVar = new h7u0.a(getContext());
        aVar.g0(R.string.live_broadcast_end_title);
        aVar.U(R.string.live_broadcast_end_message);
        aVar.c0(R.string.live_broadcast_end_confirm, new gk8(this));
        aVar.W(R.string.cancel, new hk8());
        aVar.m();
        return true;
    }

    public final void b() {
        int i;
        if (this.n) {
            int i2 = ify.a;
            if (!ify.e(ify.c) && !this.o) {
                i = -this.m;
                setChatAndFlyViewsTranslationY(i);
            }
        }
        i = 0;
        setChatAndFlyViewsTranslationY(i);
    }

    @Override // xsna.pe8
    public final void d3() {
        d3m.e(this.c, 300L, 0L, null, null, true);
    }

    @Override // xsna.pe8
    public final il70 f4(boolean z) {
        this.A = new pl70(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iah0.a(56));
        layoutParams.setMargins(iah0.a(12.0f), 0, 0, 0);
        this.A.setLayoutParams(layoutParams);
        this.f.addView(this.A);
        if (z) {
            this.A.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.A.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.A.setOnClickListener(new c());
        this.I.add(this.A);
        return this.A;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.pe8
    public f2y0 getWrite() {
        return this.u;
    }

    @Override // xsna.pe8
    public final af8 j1() {
        Context context = getContext();
        ef8 ef8Var = new ef8(context, null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.live_broadcast_error, (ViewGroup) ef8Var, true);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.broadcast_error_retry_button);
        ((VkButton) inflate.findViewById(R.id.broadcast_error_cancel_button)).setOnClickListener(new cf8(ef8Var));
        vkButton.setOnClickListener(new df8(ef8Var));
        ef8Var.setClickable(true);
        this.x = ef8Var;
        this.x.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g.addView(this.x, getViewIndexOverGradient());
        this.x.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.x.animate().alpha(1.0f).setDuration(300L).start();
        this.I.add(this.x);
        return this.x;
    }

    @Override // xsna.pe8
    public final xjp m1() {
        this.C = new ikp(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ikp ikpVar = this.C;
        ikpVar.setLayoutParams(layoutParams);
        this.g.addView(ikpVar, getViewIndexOverGradient());
        ikpVar.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ikpVar.animate().alpha(1.0f).setDuration(300L).start();
        this.I.add(this.C);
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.p = motionEvent.getRawY();
            this.q = motionEvent.getRawX();
            if (!fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), (ViewGroup) getParent(), new edp0(false))) {
                return true;
            }
        } else if (action != 2) {
            if (action == 3 || action == 4 || action == 5 || action == 6) {
                this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return false;
            }
        } else if (this.p == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.p = motionEvent.getRawY();
            this.q = motionEvent.getRawX();
            if (!fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), (ViewGroup) getParent(), new edp0(false))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        f3y0 f3y0Var;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.t || (f3y0Var = this.u) == null) {
            return;
        }
        f3y0Var.F2();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3y0 f3y0Var;
        if (motionEvent.getAction() == 0 && (f3y0Var = this.u) != null && f3y0Var.a0()) {
            this.F = true;
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.p = motionEvent.getRawY();
            this.q = motionEvent.getRawX();
        } else {
            if (action == 1) {
                if (this.F) {
                    this.F = false;
                    return false;
                }
                float abs = Math.abs(this.q - motionEvent.getRawX());
                float f = this.r;
                if (abs < f && Math.abs(this.p - motionEvent.getRawY()) < f) {
                    if (!this.E) {
                        a();
                    } else if (!fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), (ViewGroup) getParent(), new edp0(false)) && !a0()) {
                        a();
                    }
                }
                this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return false;
            }
            if (action != 2) {
                if (action == 3) {
                    this.p = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    this.q = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    return false;
                }
                return false;
            }
        }
        if (this.p == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.p = motionEvent.getRawY();
            this.q = motionEvent.getRawX();
        }
        return false;
    }

    @Override // xsna.rr6
    public final void pause() {
        ne8 ne8Var = this.s;
        if (ne8Var != null) {
            ne8Var.pause();
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).pause();
        }
        Activity activity = this.D;
        activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.H);
        mhy.d(activity.getCurrentFocus());
    }

    @Override // xsna.pe8
    public final void q2() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, 0, -1728053248);
        ofInt.setDuration(500L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
    }

    @Override // xsna.pe8
    public final void r() {
        VkSpinner vkSpinner = this.j;
        vkSpinner.animate().cancel();
        vkSpinner.setVisibility(8);
        vkSpinner.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.pe8
    public final void r0() {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, -1728053248, 0);
        ofInt.setDuration(1000L);
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.start();
    }

    @Override // xsna.rr6
    public final void release() {
        this.t = true;
        ne8 ne8Var = this.s;
        if (ne8Var != null) {
            ne8Var.release();
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).release();
        }
        int i = ify.a;
        ify.g(this.J);
        Activity activity = this.D;
        activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.G);
        activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.H);
    }

    @Override // xsna.rr6
    public final void resume() {
        ne8 ne8Var = this.s;
        if (ne8Var != null) {
            ne8Var.resume();
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((rr6) it.next()).resume();
        }
        Activity activity = this.D;
        activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.H);
        mhy.d(activity.getCurrentFocus());
    }

    @Override // xsna.pe8
    public final wjk0 v(boolean z) {
        this.B = new ujk0(getContext());
        this.B.setLayoutParams(new FrameLayout.LayoutParams(-2, iah0.a(56.0f)));
        this.e.addView(this.B);
        if (z) {
            this.B.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.B.animate().alpha(1.0f).setDuration(300L).start();
        }
        this.B.setOnClickListener(new d());
        this.I.add(this.B);
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pe8
    public final void x() {
        this.E = true;
        HashSet hashSet = this.I;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            rr6 rr6Var = (rr6) it.next();
            rr6Var.release();
            View view = (View) rr6Var;
            ((ViewGroup) view.getParent()).removeView(view);
        }
        hashSet.clear();
        LinearLayout linearLayout = this.d;
        linearLayout.animate().cancel();
        linearLayout.setAlpha(1.0f);
        linearLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view2 = this.k;
        view2.animate().cancel();
        view2.setAlpha(0.5f);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        View view3 = this.l;
        view3.animate().cancel();
        view3.setAlpha(1.0f);
        view3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b.setVisibility(8);
        this.j.setVisibility(8);
    }

    @Override // xsna.pe8
    public final void y2() {
        View view = this.c;
        if (view.getVisibility() != 0) {
            view.animate().setListener(null).start();
            view.setVisibility(0);
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            view.animate().alpha(1.0f).setDuration(500L).start();
        }
    }

    @Override // xsna.pe8
    public final void z() {
        this.n = true;
        b();
    }

    @Override // xsna.rr6
    public ne8 getPresenter() {
        return this.s;
    }

    @Override // xsna.rr6
    public void setPresenter(ne8 ne8Var) {
        this.s = ne8Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
