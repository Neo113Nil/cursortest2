package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.stickers.api.models.market.StoryServiceItemInfo;
import com.vk.stickers.api.styles.ServiceStickerStyle;
import com.vk.stories.design.view.stickers.market.ServiceStickerStyleSwitchingView;
import com.vk.stories.tool.view.NoOverlappingRenderingImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fdm0;
import xsna.h7u0;

/* compiled from: StoryServiceDialog.kt */
/* loaded from: classes16.dex */
public final class bdm0 extends tyl0<Object> {
    public final wmd0 f;
    public LottieAnimationView g;
    public ServiceStickerStyleSwitchingView h;
    public ViewGroup i;
    public TextView j;
    public ViewGroup k;
    public ViewGroup l;
    public final gdm0 m;

    /* compiled from: StoryServiceDialog.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i0q0.i(5000L, new hol(1, bdm0.this.f));
        }
    }

    static {
        iah0.a(48);
        iah0.a(12);
        iah0.a(68);
    }

    public bdm0(Context context, ddm0 ddm0Var, v3l0 v3l0Var, StoryServiceItemInfo storyServiceItemInfo) {
        super(LayoutInflater.from(context).inflate(R.layout.story_service_preview_dialog, (ViewGroup) null), true, v3l0Var);
        this.f = new wmd0(this, 10);
        this.m = new gdm0(this, ddm0Var, storyServiceItemInfo);
    }

    @Override // xsna.tyl0
    public final void b(ViewGroup viewGroup) {
        NoOverlappingRenderingImageView noOverlappingRenderingImageView = (NoOverlappingRenderingImageView) viewGroup.findViewById(R.id.story_dialog_close);
        if (noOverlappingRenderingImageView != null) {
            bwt0.h0(this, noOverlappingRenderingImageView);
        }
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView = (ServiceStickerStyleSwitchingView) viewGroup.findViewById(R.id.service_sticker);
        if (serviceStickerStyleSwitchingView != null) {
            serviceStickerStyleSwitchingView.setPreloadStyles(true);
            bwt0.h0(this, serviceStickerStyleSwitchingView);
            serviceStickerStyleSwitchingView.setAnimateChanges(true);
        } else {
            serviceStickerStyleSwitchingView = null;
        }
        this.h = serviceStickerStyleSwitchingView;
        this.i = (ViewGroup) viewGroup.findViewById(R.id.onboarding);
        this.g = (LottieAnimationView) viewGroup.findViewById(R.id.onboarding_animation);
        this.j = (TextView) viewGroup.findViewById(R.id.cta_onboarding_text);
        this.k = (ViewGroup) viewGroup.findViewById(R.id.cta_buttons_container);
        this.l = (ViewGroup) viewGroup.findViewById(R.id.bottom_buttons_container);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.btn_change_service);
        if (viewGroup2 != null) {
            bwt0.h0(this, viewGroup2);
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.btn_delete_service);
        if (viewGroup3 != null) {
            bwt0.h0(this, viewGroup3);
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(fdm0 fdm0Var) {
        gdm0 gdm0Var = this.m;
        if (gdm0Var != null) {
            bdm0 bdm0Var = gdm0Var.b;
            bpn0 bpn0Var = gdm0Var.d;
            ddm0 ddm0Var = gdm0Var.c;
            if (fdm0Var.equals(fdm0.e.a)) {
                int size = (gdm0Var.e.a + 1) % ((List) bpn0Var.getValue()).size();
                idm0 a2 = idm0.a(gdm0Var.e, size, null, (hdm0) ((List) bpn0Var.getValue()).get(size), 6);
                gdm0Var.e = a2;
                bdm0Var.h(a2);
                return;
            }
            if (!fdm0Var.equals(fdm0.b.a)) {
                if (fdm0Var.equals(fdm0.d.a)) {
                    gdm0Var.k();
                    return;
                }
                if (fdm0Var.equals(fdm0.a.a)) {
                    ((cp80) ddm0Var.k.getValue()).b(ddm0Var.f, ddm0Var.g.k3().e);
                    return;
                }
                if (!fdm0Var.equals(fdm0.c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                jdm0 i = ddm0Var.i();
                jdm0 jdm0Var = i != null ? i : null;
                if (jdm0Var != null) {
                    ddm0Var.b.t(jdm0Var);
                    return;
                }
                return;
            }
            bdm0Var.dismiss();
            nov novVar = ddm0Var.e;
            if (novVar == null) {
                if (ddm0Var.j) {
                    ddm0Var.j = false;
                    return;
                } else {
                    ddm0Var.j(null);
                    return;
                }
            }
            if (ddm0Var.j) {
                StoryServiceItemInfo info = ((jdm0) novVar).getInfo();
                if (info != null) {
                    ddm0Var.k(info, null);
                }
                ddm0Var.c.f();
            }
        }
    }

    @Override // xsna.dc6
    public final cc6 getPresenter() {
        return this.m;
    }

    public final void h(idm0 idm0Var) {
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView;
        hdm0 hdm0Var = idm0Var.e;
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView2 = this.h;
        if (serviceStickerStyleSwitchingView2 != null) {
            serviceStickerStyleSwitchingView2.setCurrentInfo(idm0Var.b);
        }
        ServiceStickerStyleSwitchingView serviceStickerStyleSwitchingView3 = this.h;
        ServiceStickerStyle currentStyle = serviceStickerStyleSwitchingView3 != null ? serviceStickerStyleSwitchingView3.getCurrentStyle() : null;
        ServiceStickerStyle serviceStickerStyle = hdm0Var.a;
        StoryServiceItemInfo.Style style = hdm0Var.b;
        if (currentStyle != serviceStickerStyle && (serviceStickerStyleSwitchingView = this.h) != null) {
            serviceStickerStyleSwitchingView.setCurrentStyle(serviceStickerStyle);
        }
        if (f4m.h(this.k) && Boolean.valueOf(style.h()).equals(Boolean.FALSE)) {
            xo2.e(this.k, 200L, null, 13);
            xo2.d(29, 200L, this.j);
        }
        if (f4m.h(this.j) && style.h()) {
            xo2.d(29, 200L, this.k);
            xo2.e(this.j, 200L, null, 13);
        }
        if (f4m.h(this.i) && Boolean.valueOf(idm0Var.d).equals(Boolean.FALSE)) {
            ViewGroup viewGroup = this.i;
            if (viewGroup != null) {
                bwt0.p0(viewGroup, false);
            }
            LottieAnimationView lottieAnimationView = this.g;
            if (lottieAnimationView != null) {
                lottieAnimationView.W();
            }
            LottieAnimationView lottieAnimationView2 = this.g;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.removeCallbacks(new yh9(this.f, 10));
            }
        }
        ViewGroup viewGroup2 = this.l;
        if (viewGroup2 != null) {
            awt0.u(viewGroup2, idm0Var.c);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        f(fdm0.b.a);
    }

    @Override // xsna.tyl0, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.story_dialog_close) {
            f(fdm0.b.a);
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.btn_delete_service) {
            h7u0.a c = new or1(getContext()).c();
            c.g0(R.string.story_service_delete_alert_title);
            c.U(R.string.story_service_delete_alert_message);
            c.W(R.string.cancel, new adm0());
            c.c0(R.string.delete, new t8o(this, 2));
            c.m();
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.btn_change_service) {
            f(fdm0.a.a);
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.service_sticker) {
            f(fdm0.e.a);
        } else if (valueOf != null && valueOf.intValue() == R.id.story_dialog_done) {
            f(fdm0.d.a);
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(-16777216);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.clearFlags(1024);
        }
        LottieAnimationView lottieAnimationView = this.g;
        if (lottieAnimationView != null) {
            lottieAnimationView.U(new a());
        }
        this.f.invoke();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        i0q0.g(new fs2(this.f, 13));
        LottieAnimationView lottieAnimationView = this.g;
        if (lottieAnimationView != null) {
            lottieAnimationView.o0();
        }
    }
}
