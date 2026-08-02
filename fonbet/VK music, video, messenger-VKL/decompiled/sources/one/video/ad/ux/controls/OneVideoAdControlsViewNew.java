package one.video.ad.ux.controls;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnticipateOvershootInterpolator;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.ad.ux.AdRedirectView;
import one.video.ad.ux.ShoppableAdView;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import one.video.ad.ux.motion.view.OneVideoMotionView;
import one.video.ad.ux.playpause.PlayPauseFrameView;
import one.video.ad.ux.postview.AdPostView;
import xsna.an10;
import xsna.ba30;
import xsna.bi80;
import xsna.bpn0;
import xsna.cnw;
import xsna.ho8;
import xsna.jwb;
import xsna.k9q0;
import xsna.kn9;
import xsna.lhg;
import xsna.m33;
import xsna.n9c0;
import xsna.q3;
import xsna.qej0;
import xsna.rh0;
import xsna.sc0;
import xsna.sh0;
import xsna.sws0;
import xsna.tkc;
import xsna.x5r0;
import xsna.zj80;
import xsna.zjw;

/* compiled from: OneVideoAdControlsViewNew.kt */
/* loaded from: classes8.dex */
public final class OneVideoAdControlsViewNew extends ConstraintLayout implements OneVideoAdBaseControls {
    public static final int E = (int) x5r0.a(8, 1);
    public static final int F = (int) x5r0.a(12, 1);
    public static final int G = (int) x5r0.a(16, 1);
    public static final int H = (int) x5r0.a(24, 1);
    public static final float I = -x5r0.a(300, 1);
    public static final float J = -x5r0.a(5, 1);
    public boolean A;
    public OneVideoAdBaseControls.c B;
    public boolean C;
    public boolean D;
    public final zj80 t;
    public final AnimatorSet u;
    public final bpn0 v;
    public PlayPauseFrameView w;
    public final OneVideoAdControlsViewNew x;
    public final a y;
    public OneVideoAdBaseControls.a z;

    /* compiled from: OneVideoAdControlsViewNew.kt */
    public final class a implements OneVideoAdBaseControls.b {
        public a() {
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.b
        public final void a(boolean z) {
            OneVideoAdControlsViewNew.this.t.j.setFullscreen(z);
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.b
        public final void b(ba30 ba30Var) {
            OneVideoAdControlsViewNew oneVideoAdControlsViewNew = OneVideoAdControlsViewNew.this;
            oneVideoAdControlsViewNew.t.j.T4(ba30Var);
            oneVideoAdControlsViewNew.t.j.setVisibility(ba30Var != null ? 0 : 8);
        }

        @Override // one.video.ad.ux.controls.OneVideoAdBaseControls.b
        public final void c(sws0 sws0Var) {
            OneVideoAdControlsViewNew.this.t.j.setController(sws0Var);
        }
    }

    /* compiled from: OneVideoAdControlsViewNew.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OneVideoAdBaseControls.Type.values().length];
            try {
                iArr[OneVideoAdBaseControls.Type.FULLSCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoAdBaseControls.Type.CATALOG_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoAdBaseControls.Type.DISCOVERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneVideoAdBaseControls.Type.CATALOG_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneVideoAdBaseControls.Type.PIP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OneVideoAdBaseControls.SoundState.values().length];
            try {
                iArr2[OneVideoAdBaseControls.SoundState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[OneVideoAdBaseControls.SoundState.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public OneVideoAdControlsViewNew(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final Drawable getChevron() {
        return (Drawable) this.v.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r10.D == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P4(OneVideoAdBaseControls.Type type) {
        int i;
        int i2;
        zj80 zj80Var = this.t;
        AdRedirectView adRedirectView = zj80Var.f;
        int i3 = 0;
        if (this.C && !getState().c) {
            int i4 = b.$EnumSwitchMapping$0[type.ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 != 3 && i4 != 4) {
                    if (i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            i = 0;
            adRedirectView.setVisibility(i);
            Object obj = x5r0.a;
            AdRedirectView adRedirectView2 = zj80Var.f;
            i2 = b.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 != 1) {
                i3 = G;
            } else if (i2 == 2) {
                i3 = E;
            } else if (i2 == 3 || i2 == 4) {
                i3 = F;
            } else if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            x5r0.f(i3, adRedirectView2);
        }
        i = 8;
        adRedirectView.setVisibility(i);
        Object obj2 = x5r0.a;
        AdRedirectView adRedirectView22 = zj80Var.f;
        i2 = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 != 1) {
        }
        x5r0.f(i3, adRedirectView22);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q4(OneVideoAdBaseControls.c cVar) {
        int i;
        int i2;
        int i3;
        boolean z = cVar.c;
        OneVideoAdBaseControls.SoundState soundState = cVar.b;
        zj80 zj80Var = this.t;
        if (z) {
            zj80Var.c.setVisibility(8);
            return;
        }
        int i4 = b.$EnumSwitchMapping$0[cVar.a.ordinal()];
        if (i4 != 1) {
            i = 4;
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4 && i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            zj80Var.c.setVisibility(i);
            if (zj80Var.c.getVisibility() != 0) {
                int[] iArr = b.$EnumSwitchMapping$1;
                int i5 = iArr[soundState.ordinal()];
                if (i5 == 1) {
                    i2 = R.drawable.one_video_volume_on_24;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.one_video_volume_off_24;
                }
                int i6 = iArr[soundState.ordinal()];
                if (i6 == 1) {
                    i3 = R.string.one_video_video_accessibility_sound_off;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = R.string.one_video_video_accessibility_sound_on;
                }
                zj80Var.c.setImageDrawable(m33.a(i2, getContext()));
                zj80Var.c.setContentDescription(getContext().getString(i3));
                return;
            }
            return;
        }
        i = 0;
        zj80Var.c.setVisibility(i);
        if (zj80Var.c.getVisibility() != 0) {
        }
    }

    public final void T4(OneVideoAdBaseControls.Type type) {
        int i;
        int i2 = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = E;
                        Object obj = x5r0.a;
                        x5r0.h(this.t.e, i, 0, i, i);
                    }
                }
            }
            i = 0;
            Object obj2 = x5r0.a;
            x5r0.h(this.t.e, i, 0, i, i);
        }
        i = G;
        Object obj22 = x5r0.a;
        x5r0.h(this.t.e, i, 0, i, i);
    }

    public final void U4(final int i) {
        String string;
        AppCompatTextView appCompatTextView = this.t.h;
        appCompatTextView.setVisibility(getState().a != OneVideoAdBaseControls.Type.PIP ? 0 : 8);
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: xsna.yj80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = OneVideoAdControlsViewNew.E;
                boolean z = i == 0;
                OneVideoAdControlsViewNew oneVideoAdControlsViewNew = this;
                if (z) {
                    oneVideoAdControlsViewNew.getListener();
                }
                OneVideoAdBaseControls.a listener = oneVideoAdControlsViewNew.getListener();
                if (listener != null) {
                    listener.a(z);
                }
            }
        });
        int b2 = an10.b(i / 1000.0f);
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, b2 > 0 ? null : getChevron(), (Drawable) null);
        if (b2 > 0) {
            string = appCompatTextView.getContext().getString(R.string.one_video_ad_skip) + " " + (b2 < 10 ? lhg.a(b2, "0") : String.valueOf(b2));
        } else {
            string = appCompatTextView.getContext().getString(R.string.one_video_ad_skip);
        }
        appCompatTextView.setText(string);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public final void V2() {
        zj80 zj80Var = this.t;
        AnimatorSet animatorSet = zj80Var.g.g;
        if (animatorSet != null) {
            animatorSet.pause();
        }
        zj80Var.b.pause();
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public final void c1() {
        AnimatorSet animatorSet = this.t.g.g;
        if (animatorSet != null) {
            animatorSet.resume();
        }
    }

    public OneVideoAdBaseControls.a getListener() {
        return this.z;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public OneVideoAdBaseControls.b getMotionDelegate() {
        return this.y;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public n9c0 getPostView() {
        return this.t.b;
    }

    public qej0 getShoppableAdViewListener() {
        return this.t.g.getListener();
    }

    public boolean getShowAdShoppableProducts() {
        return this.A;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public OneVideoAdBaseControls.c getState() {
        return this.B;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setAdBannerData(sc0 sc0Var) {
        ArrayList arrayList = sc0Var.g;
        sh0 sh0Var = sc0Var.h;
        zj80 zj80Var = this.t;
        AppCompatTextView appCompatTextView = zj80Var.i;
        ShoppableAdView shoppableAdView = zj80Var.g;
        if (sc0Var.e) {
            appCompatTextView.setOnClickListener(new kn9(this, 10));
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, appCompatTextView.getContext().getDrawable(R.drawable.one_video_info_outline_16), (Drawable) null);
        } else {
            appCompatTextView.setOnClickListener(null);
            appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (!getShowAdShoppableProducts() || arrayList.isEmpty()) {
            shoppableAdView.setVisibility(8);
        } else {
            shoppableAdView.setCardsList(arrayList);
            shoppableAdView.setVisibility(0);
        }
        AdRedirectView adRedirectView = zj80Var.f;
        if (sh0Var.a.length() <= 0 || shoppableAdView.getVisibility() == 0) {
            this.C = false;
        } else {
            this.C = true;
            String str = sh0Var.d;
            this.D = true ^ (str == null || str.length() == 0);
            adRedirectView.a(sh0Var, AdRedirectView.Type.REDIRECT_INSIDE);
            adRedirectView.setBtnClickListener(new tkc(this, 6));
        }
        P4(getState().a);
        zj80Var.e.setMax(sc0Var.c);
        zj80Var.j.setVisibility(8);
        zj80Var.h.setVisibility(8);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setAdProgress(rh0 rh0Var) {
        int i = rh0Var.a;
        Integer num = rh0Var.b;
        int i2 = rh0Var.c;
        OneVideoAdBaseControls.Type type = getState().a;
        OneVideoAdBaseControls.Type type2 = OneVideoAdBaseControls.Type.PIP;
        boolean z = type != type2;
        zj80 zj80Var = this.t;
        AppCompatTextView appCompatTextView = zj80Var.h;
        AppCompatTextView appCompatTextView2 = zj80Var.i;
        appCompatTextView.setVisibility((!z || num == null) ? 8 : 0);
        appCompatTextView2.setVisibility(z ? 0 : 8);
        Q4(getState());
        zj80Var.d.setVisibility(z ? 8 : 0);
        if (getState().a != type2) {
            if (num == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getContext().getString(R.string.one_video_ad_title));
                sb.append(" ");
                int i3 = i2 / 1000;
                String valueOf = String.valueOf(i3 / 60);
                String valueOf2 = String.valueOf(i3 % 60);
                StringBuilder b2 = ho8.b(valueOf, StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (valueOf2.length() < 2) {
                    b2.append("0");
                }
                b2.append(valueOf2);
                sb.append(b2.toString());
                appCompatTextView2.setText(sb.toString());
            } else {
                U4(num.intValue());
            }
        }
        if (i == 0 && this.C) {
            OneVideoAdBaseControls.Type type3 = getState().a;
            OneVideoAdBaseControls.Type type4 = OneVideoAdBaseControls.Type.FULLSCREEN;
            AnimatorSet animatorSet = this.u;
            if (type3 != type4) {
                animatorSet.end();
            } else if (!animatorSet.isRunning()) {
                animatorSet.start();
            }
        }
        ProgressBar progressBar = zj80Var.e;
        if (progressBar.getProgress() == 0 || Math.abs(progressBar.getProgress() - i) > 100) {
            progressBar.setProgress(i);
        }
        zj80Var.j.setVisibility(8);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setImageLoader(zjw zjwVar) {
        zj80 zj80Var = this.t;
        zj80Var.g.setImageLoader(zjwVar);
        zj80Var.b.setImageLoader(zjwVar);
        zj80Var.f.setImageLoader(zjwVar);
        zj80Var.j.setImageLoader(zjwVar);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setListener(OneVideoAdBaseControls.a aVar) {
        this.z = aVar;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setPlayPauseControl(boolean z) {
        if (this.w == null) {
            PlayPauseFrameView playPauseFrameView = new PlayPauseFrameView(getContext(), null, 0, 14, 0);
            playPauseFrameView.setId(View.generateViewId());
            playPauseFrameView.setVisibility(8);
            playPauseFrameView.setLayoutParams(new ConstraintLayout.b(-1, -1));
            addView(playPauseFrameView, 0);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(this);
            bVar.k(playPauseFrameView.getId(), 6, getId(), 6);
            bVar.k(playPauseFrameView.getId(), 7, getId(), 7);
            bVar.k(playPauseFrameView.getId(), 4, getId(), 4);
            bVar.k(playPauseFrameView.getId(), 3, getId(), 3);
            bVar.b(this);
            playPauseFrameView.setPlayPauseClickListener(new bi80(this, 1));
            this.w = playPauseFrameView;
        }
        PlayPauseFrameView playPauseFrameView2 = this.w;
        if (playPauseFrameView2 != null) {
            playPauseFrameView2.c(z);
        }
        PlayPauseFrameView playPauseFrameView3 = this.w;
        if (playPauseFrameView3 != null) {
            playPauseFrameView3.setVisibility(getState().c ? 8 : 0);
        }
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setShoppableAdViewListener(qej0 qej0Var) {
        this.t.g.setListener(qej0Var);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setShowAdShoppableProducts(boolean z) {
        this.A = z;
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public void setState(OneVideoAdBaseControls.c cVar) {
        if (cVar.equals(this.B)) {
            return;
        }
        Q4(cVar);
        OneVideoAdBaseControls.Type type = cVar.a;
        boolean z = cVar.c;
        int i = F;
        int i2 = G;
        zj80 zj80Var = this.t;
        if (z) {
            AdRedirectView adRedirectView = zj80Var.f;
            AdPostView adPostView = zj80Var.b;
            AppCompatTextView appCompatTextView = zj80Var.i;
            adRedirectView.setVisibility(8);
            appCompatTextView.setText(getContext().getString(R.string.one_video_ad_title));
            PlayPauseFrameView playPauseFrameView = this.w;
            if (playPauseFrameView != null) {
                playPauseFrameView.setVisibility(8);
            }
            zj80Var.j.setVisibility(8);
            U4(0);
            T4(type);
            if (b.$EnumSwitchMapping$0[type.ordinal()] == 1) {
                i = i2;
            }
            x5r0.f(i, appCompatTextView);
            x5r0.e(i, zj80Var.h);
            adPostView.setViewType((type != OneVideoAdBaseControls.Type.FULLSCREEN || (getResources().getConfiguration().orientation == 1)) ? AdPostView.ViewType.SMALL : AdPostView.ViewType.LARGE);
            ViewGroup.LayoutParams layoutParams = adPostView.getLayoutParams();
            ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
            if (bVar != null) {
                ((ViewGroup.MarginLayoutParams) bVar).width = cVar.d;
                ((ViewGroup.MarginLayoutParams) bVar).height = cVar.e;
            }
        } else {
            T4(type);
            P4(type);
            PlayPauseFrameView playPauseFrameView2 = this.w;
            if (playPauseFrameView2 != null) {
                playPauseFrameView2.setVisibility(0);
            }
            zj80Var.j.setVisibility(8);
            Object obj = x5r0.a;
            AppCompatTextView appCompatTextView2 = zj80Var.i;
            if (b.$EnumSwitchMapping$0[type.ordinal()] == 1) {
                i = i2;
            }
            x5r0.f(i, appCompatTextView2);
            x5r0.e(H, zj80Var.h);
        }
        this.B = cVar;
    }

    public OneVideoAdControlsViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    @Override // one.video.ad.ux.controls.OneVideoAdBaseControls
    public OneVideoAdControlsViewNew getView() {
        return this.x;
    }

    public OneVideoAdControlsViewNew(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ OneVideoAdControlsViewNew(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public OneVideoAdControlsViewNew(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_ad_controls_view_new, this);
        int i3 = R.id.post_view;
        AdPostView adPostView = (AdPostView) k9q0.j(R.id.post_view, this);
        if (adPostView != null) {
            i3 = R.id.sound_control;
            AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.sound_control, this);
            if (appCompatImageView != null) {
                i3 = R.id.video_ad_pip_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.video_ad_pip_title, this);
                if (appCompatTextView != null) {
                    i3 = R.id.video_ad_progress_bar;
                    ProgressBar progressBar = (ProgressBar) k9q0.j(R.id.video_ad_progress_bar, this);
                    if (progressBar != null) {
                        i3 = R.id.video_ad_redirect;
                        AdRedirectView adRedirectView = (AdRedirectView) k9q0.j(R.id.video_ad_redirect, this);
                        if (adRedirectView != null) {
                            i3 = R.id.video_ad_shoppable_products;
                            ShoppableAdView shoppableAdView = (ShoppableAdView) k9q0.j(R.id.video_ad_shoppable_products, this);
                            if (shoppableAdView != null) {
                                i3 = R.id.video_ad_skip;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.video_ad_skip, this);
                                if (appCompatTextView2 != null) {
                                    i3 = R.id.video_ad_title;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) k9q0.j(R.id.video_ad_title, this);
                                    if (appCompatTextView3 != null) {
                                        i3 = R.id.video_motion_view;
                                        OneVideoMotionView oneVideoMotionView = (OneVideoMotionView) k9q0.j(R.id.video_motion_view, this);
                                        if (oneVideoMotionView != null) {
                                            this.t = new zj80(this, adPostView, appCompatImageView, appCompatTextView, progressBar, adRedirectView, shoppableAdView, appCompatTextView2, appCompatTextView3, oneVideoMotionView);
                                            float f = J;
                                            float[] fArr = {f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
                                            Property property = View.TRANSLATION_X;
                                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(adRedirectView, (Property<AdRedirectView, Float>) property, fArr);
                                            ofFloat.setDuration(150L);
                                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(adRedirectView, (Property<AdRedirectView, Float>) property, I, f);
                                            ofFloat2.setDuration(1050L);
                                            ofFloat2.setInterpolator(new AnticipateOvershootInterpolator(2.3f));
                                            AnimatorSet animatorSet = new AnimatorSet();
                                            animatorSet.playSequentially(ofFloat2, ofFloat);
                                            this.u = animatorSet;
                                            this.v = new bpn0(new jwb(context, 1));
                                            this.x = this;
                                            this.y = new a();
                                            this.B = new OneVideoAdBaseControls.c(OneVideoAdBaseControls.Type.FULLSCREEN, OneVideoAdBaseControls.SoundState.ON, false, -1, -1);
                                            setClipChildren(false);
                                            appCompatImageView.setOnClickListener(new cnw(this, 3));
                                            adPostView.setBtnClickListener(new q3(this, 8));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
