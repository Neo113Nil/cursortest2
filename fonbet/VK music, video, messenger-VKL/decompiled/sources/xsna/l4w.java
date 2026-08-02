package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.ui.views.BlurredFrameLayout;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;
import com.vk.im.ui.views.msg.video.AdaptiveTimeAndStatusLayout;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.play.PlayButton;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import one.video.transform.TransformController;
import xsna.as30;
import xsna.e3m;
import xsna.hr30;
import xsna.wfk0;
import xsna.xfz;

/* compiled from: ImInlinePublicVideoVC.kt */
/* loaded from: classes2.dex */
public final class l4w implements h4w {
    public static final int L;
    public static final int M;
    public static final Object N;
    public fh5 A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public AttachVideo J;
    public j4w K;
    public final zwv b;
    public ConstraintLayout c;
    public TextView d;
    public TextView e;
    public View f;
    public TextView g;
    public TextView h;
    public ImageView i;
    public PlayButton j;
    public View k;
    public VideoErrorView l;
    public DurationView m;
    public FrameLayout n;
    public ImageView o;
    public View p;
    public VideoOverlayView q;
    public ActionLinkView r;
    public VKEnhancedImageView s;
    public VideoTextureView t;
    public SpectatorsCounterView u;
    public BlurredFrameLayout v;
    public AdaptiveTimeAndStatusLayout w;
    public TimeAndStatusView x;
    public io.reactivex.rxjava3.disposables.c y;
    public ek30 z;

    static {
        cn70.b(148);
        L = cn70.b(8);
        M = cn70.b(12);
        N = msy.a(LazyThreadSafetyMode.NONE, new a44(20));
    }

    public l4w(zwv zwvVar) {
        fxc0.B().Q();
        this.b = zwvVar;
        myh myhVar = new myh(this, 24);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = msy.a(lazyThreadSafetyMode, myhVar);
        this.C = msy.a(lazyThreadSafetyMode, new p5h(this, 26));
        this.D = msy.a(lazyThreadSafetyMode, new enh(this, 22));
        this.E = msy.a(lazyThreadSafetyMode, new t2l(this, 13));
        this.F = msy.a(lazyThreadSafetyMode, new te0(22));
        this.G = msy.a(lazyThreadSafetyMode, new c6(13));
        this.H = msy.a(lazyThreadSafetyMode, new z34(16));
        this.I = msy.a(lazyThreadSafetyMode, new n1(19));
    }

    @Override // xsna.xfz.a
    public final void a(xfz.a.C4001a c4001a) {
        int i = c4001a.d;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(c4001a.b);
        TextView textView2 = this.e;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(i);
        TextView textView3 = this.h;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setTextColor(i);
        AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout = this.w;
        if (adaptiveTimeAndStatusLayout == null) {
            adaptiveTimeAndStatusLayout = null;
        }
        adaptiveTimeAndStatusLayout.getTimeAndStatusView().setTimeTextColor(c4001a.a);
        ImageView imageView = this.o;
        (imageView != null ? imageView : null).setImageTintList(ColorStateList.valueOf(c4001a.c));
    }

    @Override // xsna.xfz.a
    public final void b() {
        fh5 fh5Var = this.A;
        if (fh5Var == null) {
            fh5Var = null;
        }
        fh5Var.S();
        io.reactivex.rxjava3.disposables.c cVar = this.y;
        if (cVar != null) {
            cVar.dispose();
        }
        this.y = null;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xfz.a
    public final void bind(wp10 wp10Var) {
        VideoFile A;
        String str;
        j4w j4wVar = (j4w) wp10Var;
        jr30 jr30Var = j4wVar.m;
        boolean z = jr30Var.g;
        this.K = j4wVar;
        AttachVideo attachVideo = j4wVar.c;
        this.J = attachVideo;
        if (j4wVar.C) {
            TextView textView = this.d;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(0);
            AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout = this.w;
            if (adaptiveTimeAndStatusLayout == null) {
                adaptiveTimeAndStatusLayout = null;
            }
            adaptiveTimeAndStatusLayout.setVisibility(0);
            TextView textView2 = this.d;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(j4wVar.n);
            TextView textView3 = this.h;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setText(j4wVar.o);
            TextView textView4 = this.e;
            if (textView4 == null) {
                textView4 = null;
            }
            int i = j4wVar.p;
            float f = 6;
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) rik0.b(f)).append((CharSequence) "·").append((CharSequence) rik0.b(f));
            ylw ylwVar = new ylw(R.drawable.vk_icon_view_12);
            ylwVar.e = -1.0f;
            ylwVar.d = true;
            SpannableStringBuilder append2 = append.append((CharSequence) ylwVar.b(d())).append((CharSequence) rik0.b(f)).append((CharSequence) xpm0.a(i));
            SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
            textView4.setText(new SpannableString(append2));
            ImageView imageView = this.o;
            if (imageView == null) {
                imageView = null;
            }
            awt0.v(imageView, j4wVar.q);
            StringBuilder sb = hr30.b;
            AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout2 = this.w;
            if (adaptiveTimeAndStatusLayout2 == null) {
                adaptiveTimeAndStatusLayout2 = null;
            }
            TimeAndStatusView timeAndStatusView = adaptiveTimeAndStatusLayout2.getTimeAndStatusView();
            timeAndStatusView.setGradientBubble(z);
            hr30.a.b(timeAndStatusView, jr30Var, false);
            TimeAndStatusView timeAndStatusView2 = this.x;
            if (timeAndStatusView2 == null) {
                timeAndStatusView2 = null;
            }
            f4m.j(timeAndStatusView2);
        } else {
            TextView textView5 = this.d;
            if (textView5 == null) {
                textView5 = null;
            }
            f4m.j(textView5);
            AdaptiveTimeAndStatusLayout adaptiveTimeAndStatusLayout3 = this.w;
            if (adaptiveTimeAndStatusLayout3 == null) {
                adaptiveTimeAndStatusLayout3 = null;
            }
            f4m.j(adaptiveTimeAndStatusLayout3);
            TimeAndStatusView timeAndStatusView3 = this.x;
            if (timeAndStatusView3 == null) {
                timeAndStatusView3 = null;
            }
            timeAndStatusView3.setVisibility(0);
            StringBuilder sb2 = hr30.b;
            TimeAndStatusView timeAndStatusView4 = this.x;
            if (timeAndStatusView4 == null) {
                timeAndStatusView4 = null;
            }
            timeAndStatusView4.setGradientBubble(z);
            hr30.a.b(timeAndStatusView4, jr30Var, true);
        }
        boolean z2 = j4wVar.r;
        boolean z3 = j4wVar.j.z;
        this.b.getClass();
        yg5 a = zwv.a(attachVideo);
        if (a != null) {
            fh5 fh5Var = this.A;
            if (fh5Var == null) {
                fh5Var = null;
            }
            fh5Var.k(a.A(), a, new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, z3, false, null, null, null, null, null, null, false, null, 523517));
            a.D();
            float E0 = a.A().E0();
            Float valueOf = Float.valueOf(E0);
            if (E0 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                valueOf = null;
            }
            if (valueOf == null || (str = valueOf.toString()) == null) {
                str = "1.7777778";
            }
            BlurredFrameLayout blurredFrameLayout = this.v;
            if (blurredFrameLayout == null) {
                blurredFrameLayout = null;
            }
            ViewGroup.LayoutParams layoutParams = blurredFrameLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.G = str;
            ((ViewGroup.MarginLayoutParams) bVar).height = 0;
            blurredFrameLayout.setLayoutParams(bVar);
            VideoTextureView videoTextureView = this.t;
            if (videoTextureView == null) {
                videoTextureView = null;
            }
            ViewGroup.LayoutParams layoutParams2 = videoTextureView.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -1;
            videoTextureView.setLayoutParams(layoutParams2);
        }
        TextView textView6 = this.g;
        if (textView6 == null) {
            textView6 = null;
        }
        f4m.j(textView6);
        View view = this.p;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, !z2);
        VideoFile videoFile = j4wVar.s;
        ImageList imageList = j4wVar.t;
        ImageList imageList2 = j4wVar.u;
        ImageList imageList3 = j4wVar.v;
        bpn0 bpn0Var = VideoOverlayView.I;
        VKEnhancedImageView vKEnhancedImageView = this.s;
        VKEnhancedImageView vKEnhancedImageView2 = vKEnhancedImageView == null ? null : vKEnhancedImageView;
        VideoOverlayView videoOverlayView = this.q;
        VideoOverlayView videoOverlayView2 = videoOverlayView == null ? null : videoOverlayView;
        DurationView durationView = this.m;
        DurationView durationView2 = durationView == null ? null : durationView;
        boolean c = fxc0.B().c(videoFile);
        VideoRestriction O = videoFile.O();
        com.vk.libvideo.design.view.overlay.b a2 = O != null ? ((a390) this.H.getValue()).a(O) : null;
        boolean z4 = videoFile.d8() || videoFile.z0();
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        int i2 = 13;
        VideoOverlayView.b.a(new VideoOverlayView.a(vKEnhancedImageView2, videoOverlayView2, new k4w(this, imageList, imageList2, imageList3, 0), new d9j(this, 17), durationView2, false, false, c, new jc(r7, videoFile), new p5(i2, this, videoFile), a2, z4, epx.f((c2 == null || (A = c2.A()) == null) ? null : A.a1(), videoFile.a1()), new xrj(this, i2), (i1t0) this.I.getValue(), null, 65760));
        f14 e = j4wVar.e(d());
        int i3 = e.a;
        int i4 = e.b;
        BlurredFrameLayout blurredFrameLayout2 = this.v;
        if (blurredFrameLayout2 == null) {
            blurredFrameLayout2 = null;
        }
        blurredFrameLayout2.a(i3, i4);
        View view2 = this.f;
        if (view2 == null) {
            view2 = null;
        }
        ((wng0) view2.getBackground()).c(i3, i3, i4, i4);
        String str2 = j4wVar.w;
        boolean z5 = j4wVar.x;
        boolean z6 = j4wVar.z;
        boolean z7 = j4wVar.y;
        TextView textView7 = this.g;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setBackground(z6 ? (Drawable) this.B.getValue() : (Drawable) this.C.getValue());
        TextView textView8 = this.g;
        if (textView8 == null) {
            textView8 = null;
        }
        textView8.setContentDescription("");
        TextView textView9 = this.g;
        if (textView9 == null) {
            textView9 = null;
        }
        if (str2.length() <= 0) {
            str2 = z7 ? (String) this.D.getValue() : z5 ? (String) this.E.getValue() : "";
        }
        textView9.setText(str2);
        abi0 abi0Var = j4wVar.B;
        boolean d = abi0Var != null ? abi0Var.d(Integer.valueOf(j4wVar.l)) : false;
        View view3 = this.f;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.p0(view3, d);
        int b = (j4wVar.g == 0 ? 0 : 1) != 0 ? cn70.b(0) : j4wVar.i ? M : L;
        TextView textView10 = this.d;
        if (textView10 == null) {
            textView10 = null;
        }
        ViewGroup.LayoutParams layoutParams3 = textView10.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams.leftMargin = b;
        marginLayoutParams.rightMargin = b;
        textView10.setLayoutParams(marginLayoutParams);
        boolean z8 = j4wVar.f;
        boolean z9 = j4wVar.k;
        ConstraintLayout constraintLayout = this.c;
        (constraintLayout != null ? constraintLayout : null).setMinWidth((z8 && z9) ? e3m.a(R.dimen.vkim_video_attach_small_min_width, d()) : e3m.a(R.dimen.vkim_video_attach_large_min_width, d()));
    }

    public final Context d() {
        ConstraintLayout constraintLayout = this.c;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        return constraintLayout.getContext();
    }

    @Override // xsna.xfz.a
    public final dnt0 getPresenter() {
        fh5 fh5Var = this.A;
        if (fh5Var == null) {
            return null;
        }
        return fh5Var;
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xfz.a
    public final View i(MsgBubbleView msgBubbleView, as30.a aVar) {
        int i = 0;
        ConstraintLayout constraintLayout = (ConstraintLayout) bwt0.I(R.layout.vkim_msg_part_public_video, msgBubbleView, false);
        this.c = constraintLayout;
        this.d = (TextView) constraintLayout.findViewById(R.id.title);
        ConstraintLayout constraintLayout2 = this.c;
        String str = null;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        this.g = (TextView) constraintLayout2.findViewById(R.id.label);
        ConstraintLayout constraintLayout3 = this.c;
        if (constraintLayout3 == null) {
            constraintLayout3 = null;
        }
        VideoErrorView videoErrorView = (VideoErrorView) constraintLayout3.findViewById(R.id.error);
        videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
        this.l = videoErrorView;
        ConstraintLayout constraintLayout4 = this.c;
        if (constraintLayout4 == null) {
            constraintLayout4 = null;
        }
        this.h = (TextView) constraintLayout4.findViewById(R.id.owner);
        ConstraintLayout constraintLayout5 = this.c;
        if (constraintLayout5 == null) {
            constraintLayout5 = null;
        }
        this.j = (PlayButton) constraintLayout5.findViewById(R.id.replay);
        ConstraintLayout constraintLayout6 = this.c;
        if (constraintLayout6 == null) {
            constraintLayout6 = null;
        }
        this.e = (TextView) constraintLayout6.findViewById(R.id.subtitle);
        ConstraintLayout constraintLayout7 = this.c;
        if (constraintLayout7 == null) {
            constraintLayout7 = null;
        }
        this.s = (VKEnhancedImageView) constraintLayout7.findViewById(R.id.preview);
        ConstraintLayout constraintLayout8 = this.c;
        if (constraintLayout8 == null) {
            constraintLayout8 = null;
        }
        this.q = (VideoOverlayView) constraintLayout8.findViewById(R.id.overlay);
        ConstraintLayout constraintLayout9 = this.c;
        if (constraintLayout9 == null) {
            constraintLayout9 = null;
        }
        this.m = (DurationView) constraintLayout9.findViewById(R.id.duration);
        ConstraintLayout constraintLayout10 = this.c;
        if (constraintLayout10 == null) {
            constraintLayout10 = null;
        }
        this.i = (ImageView) constraintLayout10.findViewById(R.id.play_button);
        ConstraintLayout constraintLayout11 = this.c;
        if (constraintLayout11 == null) {
            constraintLayout11 = null;
        }
        this.u = (SpectatorsCounterView) constraintLayout11.findViewById(R.id.spectators);
        ConstraintLayout constraintLayout12 = this.c;
        if (constraintLayout12 == null) {
            constraintLayout12 = null;
        }
        this.k = constraintLayout12.findViewById(R.id.sound_control);
        ConstraintLayout constraintLayout13 = this.c;
        if (constraintLayout13 == null) {
            constraintLayout13 = null;
        }
        this.w = (AdaptiveTimeAndStatusLayout) constraintLayout13.findViewById(R.id.subtitle_wrapper);
        ConstraintLayout constraintLayout14 = this.c;
        if (constraintLayout14 == null) {
            constraintLayout14 = null;
        }
        this.o = (ImageView) constraintLayout14.findViewById(R.id.verification_icon);
        ConstraintLayout constraintLayout15 = this.c;
        if (constraintLayout15 == null) {
            constraintLayout15 = null;
        }
        this.r = (ActionLinkView) constraintLayout15.findViewById(R.id.video_action_link_view);
        ConstraintLayout constraintLayout16 = this.c;
        if (constraintLayout16 == null) {
            constraintLayout16 = null;
        }
        this.p = constraintLayout16.findViewById(R.id.duration_holder);
        ConstraintLayout constraintLayout17 = this.c;
        if (constraintLayout17 == null) {
            constraintLayout17 = null;
        }
        this.n = (FrameLayout) constraintLayout17.findViewById(R.id.video_inline_live_holder);
        ConstraintLayout constraintLayout18 = this.c;
        if (constraintLayout18 == null) {
            constraintLayout18 = null;
        }
        this.x = (TimeAndStatusView) constraintLayout18.findViewById(R.id.timeAndStatus);
        ConstraintLayout constraintLayout19 = this.c;
        if (constraintLayout19 == null) {
            constraintLayout19 = null;
        }
        BlurredFrameLayout blurredFrameLayout = (BlurredFrameLayout) constraintLayout19.findViewById(R.id.video_wrapper);
        blurredFrameLayout.setBlurPostprocessor((jwx) N.getValue());
        this.v = blurredFrameLayout;
        ConstraintLayout constraintLayout20 = this.c;
        if (constraintLayout20 == null) {
            constraintLayout20 = null;
        }
        View findViewById = constraintLayout20.findViewById(R.id.selection_mask);
        wng0 wng0Var = new wng0();
        Context context = findViewById.getContext();
        e3m.a aVar2 = e3m.a;
        wng0Var.b(context.getColor(R.color.vkim_msg_part_selection_mask));
        findViewById.setBackground(wng0Var);
        this.f = findViewById;
        ConstraintLayout constraintLayout21 = this.c;
        if (constraintLayout21 == null) {
            constraintLayout21 = null;
        }
        VideoTextureView videoTextureView = (VideoTextureView) constraintLayout21.findViewById(R.id.video_display);
        this.t = videoTextureView;
        TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        kq01 kq01Var = new kq01();
        VideoTextureView videoTextureView2 = this.t;
        VideoTextureView videoTextureView3 = videoTextureView2 == null ? null : videoTextureView2;
        ConstraintLayout constraintLayout22 = this.c;
        ConstraintLayout constraintLayout23 = constraintLayout22 == null ? null : constraintLayout22;
        VKEnhancedImageView vKEnhancedImageView = this.s;
        VKEnhancedImageView vKEnhancedImageView2 = vKEnhancedImageView == null ? null : vKEnhancedImageView;
        ImageView imageView = this.i;
        ImageView imageView2 = imageView == null ? null : imageView;
        PlayButton playButton = this.j;
        PlayButton playButton2 = playButton == null ? null : playButton;
        View view = this.k;
        if (view == null) {
            view = null;
        }
        wfk0.a aVar3 = new wfk0.a(view);
        DurationView durationView = this.m;
        DurationView durationView2 = durationView == null ? null : durationView;
        VideoOverlayView videoOverlayView = this.q;
        VideoOverlayView videoOverlayView2 = videoOverlayView == null ? null : videoOverlayView;
        VideoErrorView videoErrorView2 = this.l;
        VideoErrorView videoErrorView3 = videoErrorView2 == null ? null : videoErrorView2;
        FrameLayout frameLayout = this.n;
        FrameLayout frameLayout2 = frameLayout == null ? null : frameLayout;
        SpectatorsCounterView spectatorsCounterView = this.u;
        SpectatorsCounterView spectatorsCounterView2 = spectatorsCounterView == null ? null : spectatorsCounterView;
        ActionLinkView actionLinkView = this.r;
        fh5 fh5Var = new fh5(kq01Var, videoTextureView3, constraintLayout23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vKEnhancedImageView2, imageView2, null, playButton2, null, null, aVar3, null, null, durationView2, null, null, videoOverlayView2, videoErrorView3, frameLayout2, spectatorsCounterView2, false, actionLinkView == null ? null : actionLinkView, null, null, null, null, null, null, null, null, -33461632, 31);
        fh5Var.w("im");
        this.A = fh5Var;
        com.vk.im.video.c cVar = new com.vk.im.video.c(i, this, aVar);
        VideoTextureView videoTextureView4 = this.t;
        if (videoTextureView4 == null) {
            videoTextureView4 = null;
        }
        bwt0.h0(cVar, videoTextureView4);
        VideoOverlayView videoOverlayView3 = this.q;
        if (videoOverlayView3 == null) {
            videoOverlayView3 = null;
        }
        bwt0.h0(cVar, videoOverlayView3);
        ConstraintLayout constraintLayout24 = this.c;
        if (constraintLayout24 == null) {
            constraintLayout24 = null;
        }
        bwt0.k0(constraintLayout24, new rlh(aVar, 15));
        PlayButton playButton3 = this.j;
        if (playButton3 == null) {
            playButton3 = null;
        }
        bwt0.i0(playButton3, new bv1(17, this, aVar));
        ImageView imageView3 = this.i;
        if (imageView3 == null) {
            imageView3 = null;
        }
        bwt0.i0(imageView3, new bhh(this, 25));
        View view2 = this.k;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.i0(view2, new qqe(this, 27));
        ActionLinkView actionLinkView2 = this.r;
        if (actionLinkView2 == null) {
            actionLinkView2 = null;
        }
        bwt0.i0(actionLinkView2, new r3h(this, 18));
        VideoErrorView videoErrorView4 = this.l;
        if (videoErrorView4 == null) {
            videoErrorView4 = null;
        }
        videoErrorView4.a(new VideoErrorView.a(str, new x01(this, 3), true, 57));
        this.z = new ek30(d(), 0);
        ConstraintLayout constraintLayout25 = this.c;
        if (constraintLayout25 == null) {
            return null;
        }
        return constraintLayout25;
    }

    @Override // xsna.h4w
    public final boolean isActive() {
        return false;
    }

    @Override // xsna.h4w
    public final Collection<Integer> v(String str) {
        return EmptyList.b;
    }

    @Override // xsna.g34.a
    public final void c(int i) {
    }

    @Override // xsna.g34.a
    public final void f(int i) {
    }

    @Override // xsna.xfz.a
    public final void g(ArrayList arrayList) {
    }

    @Override // xsna.g34.a
    public final void e(int i, int i2, int i3) {
    }
}
