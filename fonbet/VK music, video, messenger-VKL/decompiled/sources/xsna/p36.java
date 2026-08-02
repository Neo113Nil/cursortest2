package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.stickers.popup.PopupStickerView;
import com.vkontakte.android.R;

/* compiled from: BannerVc.kt */
/* loaded from: classes2.dex */
public final class p36 {
    public final pim a;
    public final xam b;
    public final ebm c;
    public final jr4 d;
    public final qmb e;
    public final iem f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final ViewGroup j;
    public final ViewGroup k;
    public final ViewGroup l;
    public final ViewGroup m;
    public final View n;
    public final bpn0 o;
    public final bpn0 p;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final bpn0 t;
    public final bpn0 u;
    public final a v;
    public ChatFragment.b w;

    /* compiled from: BannerVc.kt */
    public final class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            p36 p36Var = p36.this;
            ChatFragment.b bVar = p36Var.w;
            if (bVar != null) {
                int c = p36Var.c();
                ChatFragment chatFragment = ChatFragment.this;
                PopupStickerView popupStickerView = chatFragment.e1;
                if (popupStickerView != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(popupStickerView.getLayoutParams().width, popupStickerView.getLayoutParams().height);
                    layoutParams.topMargin = c;
                    popupStickerView.setLayoutParams(layoutParams);
                }
                d6p d6pVar = chatFragment.P0;
                if (d6pVar != null) {
                    f4m.t(c, d6pVar.b.a);
                }
                int a = iah0.a(4) + c;
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.G0 = a;
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    vm30Var.y(a);
                }
                k28 k28Var = chatFragment.a1;
                if (k28Var == null) {
                    k28Var = null;
                }
                m28 m28Var = k28Var.k;
                m28Var.f = a;
                if (m28Var.c) {
                    View view2 = m28Var.d;
                    f4m.t(a, view2 != null ? view2 : null);
                }
            }
        }
    }

    public p36(pim pimVar, xam xamVar, ebm ebmVar, jr4 jr4Var, qmb qmbVar, iem iemVar, LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub) {
        View inflate;
        this.a = pimVar;
        this.b = xamVar;
        this.c = ebmVar;
        this.d = jr4Var;
        this.e = qmbVar;
        this.f = iemVar;
        layoutInflater.getContext();
        if (viewStub == null) {
            inflate = layoutInflater.inflate(R.layout.vkim_banner_container_old, viewGroup, false);
        } else {
            viewStub.setLayoutInflater(layoutInflater);
            viewStub.setLayoutResource(R.layout.vkim_banner_container_old);
            inflate = viewStub.inflate();
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.g = viewGroup2;
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.pinned_msg_container);
        this.h = viewGroup3;
        ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(R.id.bar_container);
        this.i = viewGroup4;
        ViewGroup viewGroup5 = (ViewGroup) viewGroup2.findViewById(R.id.business_notify_container);
        this.j = viewGroup5;
        ViewGroup viewGroup6 = (ViewGroup) viewGroup2.findViewById(R.id.player_container);
        this.k = viewGroup6;
        ViewGroup viewGroup7 = (ViewGroup) viewGroup2.findViewById(R.id.chat_audio_player_container);
        this.l = viewGroup7;
        ViewGroup viewGroup8 = (ViewGroup) viewGroup2.findViewById(R.id.group_call_container);
        this.m = viewGroup8;
        View findViewById = viewGroup2.findViewById(R.id.separator);
        this.n = findViewById;
        this.o = new bpn0(new xm1(this, 4));
        this.p = new bpn0(new ka0(this, 5));
        this.q = new bpn0(new vf0(this, 7));
        this.r = new bpn0(new b3(this, 8));
        this.s = new bpn0(new na(this, 9));
        this.t = new bpn0(new ra0(this, 9));
        this.u = new bpn0(new sa0(this, 10));
        this.v = new a();
        viewGroup3.setVisibility(8);
        viewGroup4.setVisibility(8);
        viewGroup5.setVisibility(8);
        viewGroup6.setVisibility(8);
        viewGroup7.setVisibility(8);
        viewGroup8.setVisibility(8);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public static void a(j8i j8iVar, tnp0 tnp0Var, ViewGroup viewGroup) {
        if (j8iVar.d) {
            tnp0Var.b();
            j8iVar.H0();
            viewGroup.removeAllViews();
        }
    }

    public static int b(tnp0 tnp0Var, ViewGroup viewGroup) {
        if (tnp0Var.i != null) {
            return 0;
        }
        if (tnp0Var.h || tnp0Var.g != null || bwt0.K(tnp0Var.a)) {
            return Math.max(0, viewGroup.getMeasuredHeight() - viewGroup.getPaddingBottom());
        }
        return 0;
    }

    public static void d(boolean z, j8i j8iVar, tnp0 tnp0Var, long j) {
        if (j8iVar.d) {
            boolean[] zArr = tnp0Var.j;
            View view = tnp0Var.a;
            if (!z) {
                tnp0Var.b();
                return;
            }
            if (tnp0Var.i == null && bwt0.K(view)) {
                tnp0Var.f.removeCallbacksAndMessages(null);
                tnp0Var.h = false;
                int length = zArr.length;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                for (int i = 0; viewGroup != null && i < length; i++) {
                    zArr[i] = viewGroup.getClipChildren();
                    s3q0 s3q0Var = s3q0.a;
                    ViewParent parent2 = viewGroup.getParent();
                    viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                }
                tnp0Var.k = true;
                int length2 = zArr.length;
                ViewParent parent3 = view.getParent();
                ViewGroup viewGroup2 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                for (int i2 = 0; viewGroup2 != null && i2 < length2; i2++) {
                    viewGroup2.setClipChildren(true);
                    s3q0 s3q0Var2 = s3q0.a;
                    ViewParent parent4 = viewGroup2.getParent();
                    viewGroup2 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
                }
                tnp0Var.a();
                ViewPropertyAnimator viewPropertyAnimator = tnp0Var.g;
                if (viewPropertyAnimator != null) {
                    j = 0;
                }
                float translationY = viewPropertyAnimator != null ? view.getTranslationY() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                view.setVisibility(0);
                view.setTranslationY(translationY);
                ViewPropertyAnimator translationY2 = view.animate().setStartDelay(j).setInterpolator(tnp0Var.c).setDuration(tnp0Var.e).withEndAction(new p69(tnp0Var, 9)).translationY(-view.getMeasuredHeight());
                translationY2.start();
                tnp0Var.i = translationY2;
            }
        }
    }

    public final int c() {
        return jw5.u(b((tnp0) this.o.getValue(), this.h), b((tnp0) this.p.getValue(), this.i), b((tnp0) this.q.getValue(), this.j), b((tnp0) this.r.getValue(), this.k), b((tnp0) this.s.getValue(), this.l), b((tnp0) this.t.getValue(), this.m));
    }

    public final void e(boolean z, j8i j8iVar, final tnp0 tnp0Var, ViewGroup viewGroup, final long j) {
        if (!j8iVar.d) {
            View F0 = j8iVar.F0(viewGroup, null);
            viewGroup.addOnLayoutChangeListener(this.v);
            viewGroup.addView(F0);
            tnp0Var.b();
        }
        if (z) {
            View view = tnp0Var.a;
            if (tnp0Var.h || tnp0Var.g != null || bwt0.K(view)) {
                return;
            }
            tnp0Var.h = true;
            view.setVisibility(4);
            view.invalidate();
            awt0.t(view, new gzs() { // from class: xsna.snp0
                @Override // xsna.gzs
                public final Object invoke() {
                    tnp0 tnp0Var2 = tnp0.this;
                    tnp0Var2.f.post(new qnz(tnp0Var2, j, 2));
                    return s3q0.a;
                }
            });
            return;
        }
        View view2 = tnp0Var.a;
        tnp0Var.f.removeCallbacksAndMessages(null);
        tnp0Var.h = false;
        tnp0Var.a();
        boolean[] zArr = tnp0Var.j;
        if (tnp0Var.k) {
            int length = zArr.length;
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            for (int i = 0; viewGroup2 != null && i < length; i++) {
                viewGroup2.setClipChildren(zArr[i]);
                s3q0 s3q0Var = s3q0.a;
                ViewParent parent2 = viewGroup2.getParent();
                viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            }
            tnp0Var.k = false;
        }
        view2.setVisibility(0);
        view2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
