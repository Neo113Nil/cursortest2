package com.vk.writebar.attach;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.StaticMapView;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.im.design.view.spoiler.SpoilerView;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.media.model.CameraVideoEncoderParameters;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.pending.PendingAudioAttachment;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingStoryAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.story.api.media.StoryMediaData;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioArtistAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.AudioPlaylistAttachment;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.DonutLinkAttachment;
import com.vkontakte.android.attachments.EventAttachment;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.LinkAttachment;
import com.vkontakte.android.attachments.MarketAttachment;
import com.vkontakte.android.attachments.MiniAppAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.PostAttachment;
import com.vkontakte.android.attachments.PostReplyAttachment;
import com.vkontakte.android.attachments.QuestionAttachment;
import com.vkontakte.android.attachments.StoryAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import xsna.a24;
import xsna.a390;
import xsna.bay;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cqi;
import xsna.cvk;
import xsna.d84;
import xsna.ddg0;
import xsna.dhr0;
import xsna.dun;
import xsna.e3m;
import xsna.enj;
import xsna.f84;
import xsna.fw3;
import xsna.fxc0;
import xsna.g20;
import xsna.g760;
import xsna.g84;
import xsna.g94;
import xsna.gd70;
import xsna.gpt0;
import xsna.h84;
import xsna.i1t0;
import xsna.i8c0;
import xsna.iah0;
import xsna.ixj0;
import xsna.j84;
import xsna.ju90;
import xsna.jwx;
import xsna.m8v0;
import xsna.msy;
import xsna.odg0;
import xsna.om60;
import xsna.pdc;
import xsna.pm60;
import xsna.q7v0;
import xsna.ra;
import xsna.u1u0;
import xsna.uk;
import xsna.uyq0;
import xsna.yg5;
import xsna.z8s;

/* loaded from: classes7.dex */
public class AttachmentsEditorView extends HorizontalScrollView implements g94, View.OnClickListener {
    public static final /* synthetic */ int C = 0;
    public final jwx A;
    public final a24 B;
    public final j84 b;
    public final ArrayList<Attachment> c;
    public j d;
    public boolean e;
    public boolean f;
    public final b g;
    public final c h;
    public float i;
    public float j;
    public float k;
    public float l;
    public View m;
    public int n;
    public k o;
    public final long p;
    public final int q;
    public boolean r;
    public io.reactivex.rxjava3.disposables.c s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public FragmentImpl x;

    @Nullable
    public d84 y;
    public g760 z;

    public class a implements View.OnLongClickListener {
        public a() {
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            AttachmentsEditorView attachmentsEditorView = AttachmentsEditorView.this;
            attachmentsEditorView.requestDisallowInterceptTouchEvent(true);
            attachmentsEditorView.k = attachmentsEditorView.i;
            attachmentsEditorView.l = attachmentsEditorView.j;
            attachmentsEditorView.n = attachmentsEditorView.b.indexOfChild(view);
            attachmentsEditorView.m = view;
            attachmentsEditorView.b.getLayoutTransition().setAnimator(2, null);
            attachmentsEditorView.b.getLayoutTransition().setAnimator(3, null);
            attachmentsEditorView.b.getLayoutTransition().setStartDelay(1, 0L);
            attachmentsEditorView.b.getLayoutTransition().setStartDelay(0, 0L);
            attachmentsEditorView.b.getLayoutTransition().setStartDelay(2, 0L);
            attachmentsEditorView.b.getLayoutTransition().setStartDelay(3, 0L);
            attachmentsEditorView.b.invalidate();
            view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(200L).start();
            return true;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Attachment attachment;
            j jVar;
            Attachment attachment2 = (Attachment) ((View) view.getParent()).getTag();
            AttachmentsEditorView attachmentsEditorView = AttachmentsEditorView.this;
            ArrayList<Attachment> arrayList = attachmentsEditorView.c;
            int indexOf = arrayList.indexOf(attachment2);
            if (indexOf != -1) {
                try {
                    attachmentsEditorView.b.removeViewAt(indexOf);
                    attachment = arrayList.remove(indexOf);
                } catch (Exception e) {
                    L.i(e);
                    attachment = null;
                }
                if (attachment == null || (jVar = attachmentsEditorView.d) == null) {
                    return;
                }
                jVar.b(attachment);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            View view2 = (View) view.getParent();
            Object tag = view2.getTag();
            if (tag instanceof ju90) {
                L.p("vk", cqi.c(tag, "RETRY CLICK "));
                u1u0.n(0, view2.findViewById(R.id.attach_progress));
                u1u0.n(8, view2.findViewById(R.id.attach_error));
                ((ProgressBar) view2.findViewById(R.id.attach_progress)).setProgress(0);
                AttachmentsEditorView.this.d.a((ju90) tag);
            }
        }
    }

    public class d implements TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return Math.min(1.0f, f * 6.0f);
        }
    }

    public class e extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ((View) ((ObjectAnimator) ((AnimatorSet) animator).getChildAnimations().get(0)).getTarget()).setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public class f extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            View view = (View) ((ObjectAnimator) ((AnimatorSet) animator).getChildAnimations().get(0)).getTarget();
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    public class g implements View.OnClickListener {
        public final /* synthetic */ PollAttachment b;

        public g(PollAttachment pollAttachment) {
            this.b = pollAttachment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PollAttachment pollAttachment = this.b;
            if (!pollAttachment.f.t0()) {
                cvk.u(R.string.poll_edit_completed, false);
                return;
            }
            AttachmentsEditorView attachmentsEditorView = AttachmentsEditorView.this;
            if (attachmentsEditorView.x instanceof ChatFragment) {
                return;
            }
            bay.c().getClass();
            if (attachmentsEditorView.x != null) {
                int i = PollEditorFragment.a.m;
                PollEditorFragment.a.C1520a.b(pollAttachment, "poll").g(10009, attachmentsEditorView.x);
                return;
            }
            int i2 = PollEditorFragment.a.m;
            PollEditorFragment.a b = PollEditorFragment.a.C1520a.b(pollAttachment, "poll");
            Context context = attachmentsEditorView.getContext();
            bpn0 bpn0Var = enj.a;
            b.h(e3m.h(context), 10009);
        }
    }

    public class h implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ int c;

        public h(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            AttachmentsEditorView attachmentsEditorView = AttachmentsEditorView.this;
            attachmentsEditorView.getViewTreeObserver().removeOnPreDrawListener(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(96), iah0.a(72));
            layoutParams.rightMargin = iah0.a(8);
            View view = this.b;
            if (view.getParent() != null) {
                return true;
            }
            j84 j84Var = attachmentsEditorView.b;
            j84Var.addView(view, Math.min(this.c, j84Var.getChildCount()), layoutParams);
            return true;
        }
    }

    public class i implements Runnable {
        public final /* synthetic */ int b;

        public i(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = this.b;
            AttachmentsEditorView attachmentsEditorView = AttachmentsEditorView.this;
            attachmentsEditorView.smoothScrollTo(i * attachmentsEditorView.q, 0);
        }
    }

    public interface j {
        void a(@NonNull ju90<?> ju90Var);

        void b(Attachment attachment);

        void c(@NonNull ju90<?> ju90Var);
    }

    public class k implements Runnable {
        public final int b;

        public k(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AttachmentsEditorView attachmentsEditorView = AttachmentsEditorView.this;
            if (attachmentsEditorView.m == null) {
                return;
            }
            int scrollX = attachmentsEditorView.getScrollX();
            int width = attachmentsEditorView.b.getWidth() - attachmentsEditorView.getWidth();
            int i = this.b;
            if (scrollX != width || i <= 0) {
                if (attachmentsEditorView.getScrollX() != 0 || i >= 0) {
                    attachmentsEditorView.scrollBy(iah0.a(i * 2), 0);
                    attachmentsEditorView.k -= iah0.a(r1);
                    attachmentsEditorView.k();
                    attachmentsEditorView.postDelayed(this, 10L);
                }
            }
        }
    }

    public AttachmentsEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new ArrayList<>();
        this.f = false;
        new io.reactivex.rxjava3.disposables.b();
        this.g = new b();
        this.h = new c();
        this.p = System.currentTimeMillis();
        this.r = false;
        i8c0 i8c0Var = new i8c0(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, i8c0Var);
        int i2 = 15;
        this.u = msy.a(lazyThreadSafetyMode, new om60(i2));
        this.v = msy.a(lazyThreadSafetyMode, new pm60(i2));
        this.w = msy.a(lazyThreadSafetyMode, new f84(0));
        this.A = new jwx(3, 8);
        this.B = new a24(this);
        j84 j84Var = new j84(this, getContext());
        this.b = j84Var;
        j84Var.setOrientation(0);
        this.b.setGravity(16);
        this.b.setLayoutTransition(new LayoutTransition());
        h();
        addView(this.b);
        setFillViewport(true);
        setHorizontalScrollBarEnabled(false);
        this.q = iah0.a(96);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v51, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Attachment attachment, @Nullable Integer num) {
        boolean z;
        com.vk.libvideo.design.view.overlay.b bVar;
        String uri;
        int i2;
        int i3;
        if (this.e) {
            L.G("vk", "Attach editor ignore new attach when in hidden mode");
            return;
        }
        L.p("vk", "Attach editor add");
        ArrayList<Attachment> arrayList = this.c;
        int b2 = num == null ? com.vkontakte.android.attachments.a.b(attachment, arrayList) : num.intValue();
        arrayList.add(b2, attachment);
        boolean z2 = attachment instanceof PhotoAttachment;
        b bVar2 = this.g;
        if (z2) {
            PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
            boolean z3 = this.r;
            View inflate = View.inflate(getContext(), R.layout.attach_edit_photo, null);
            inflate.findViewById(R.id.attach_progress).setVisibility(8);
            VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.attach_thumb);
            String str = photoAttachment.w;
            Photo photo = photoAttachment.l;
            Object[] objArr = str != null;
            if (objArr == true) {
                vKImageView.setPostprocessor(this.A);
            } else {
                vKImageView.setPostprocessor(null);
            }
            SpoilerView spoilerView = (SpoilerView) inflate.findViewById(R.id.spoiler);
            if (spoilerView != null) {
                spoilerView.setVisibility(objArr != false ? 0 : 8);
            }
            ArrayList arrayList2 = photo.y.b;
            int i4 = this.q;
            ImageSize imageSize = (ImageSize) ixj0.c(arrayList2, i4, i4);
            vKImageView.load(imageSize != null ? imageSize.d.d : null);
            View findViewById = inflate.findViewById(R.id.donut);
            if (findViewById != null) {
                u1u0.n(photoAttachment.v ? 0 : 8, findViewById);
            }
            ddg0 ddg0Var = ddg0.a;
            if (ddg0.d(photo.c, photo.e)) {
                i2 = 0;
                i3 = R.id.attach_remove;
            } else {
                i2 = 0;
                PhotoRestriction photoRestriction = photo.L;
                Image image = photo.y;
                vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_legacy_placeholder_icon_background));
                odg0 odg0Var = odg0.a;
                odg0Var.getClass();
                gd70 gd70Var = new gd70(image, 22);
                i3 = R.id.attach_remove;
                odg0Var.k(vKImageView, photoRestriction, true, false, gd70Var);
            }
            inflate.findViewById(i3).setOnClickListener(bVar2);
            inflate.findViewById(R.id.edit_icon).setVisibility(z3 ? i2 : 8);
            inflate.setId(R.id.attachments_editor_view_photo);
            inflate.setOnClickListener(this);
            b(inflate, attachment, b2);
            return;
        }
        boolean z4 = false;
        if (attachment instanceof PendingStoryAttachment) {
            View inflate2 = View.inflate(getContext(), R.layout.attach_edit_photo, null);
            inflate2.findViewById(R.id.attach_progress).setVisibility(8);
            VKImageView vKImageView2 = (VKImageView) inflate2.findViewById(R.id.attach_thumb);
            StoryMediaData storyMediaData = ((PendingStoryAttachment) attachment).f;
            if (storyMediaData.e) {
                uri = Uri.fromFile(storyMediaData.b).toString();
            } else {
                CameraVideoEncoderParameters cameraVideoEncoderParameters = storyMediaData.c;
                uri = Uri.fromFile(cameraVideoEncoderParameters != null ? cameraVideoEncoderParameters.d : null).toString();
            }
            vKImageView2.O0(uri, ImageScreenSize.VERY_SMALL);
            inflate2.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            b(inflate2, attachment, b2);
            return;
        }
        if (attachment instanceof StoryAttachment) {
            View inflate3 = View.inflate(getContext(), R.layout.attach_edit_photo, null);
            inflate3.findViewById(R.id.attach_progress).setVisibility(8);
            ((VKImageView) inflate3.findViewById(R.id.attach_thumb)).O0(((StoryAttachment) attachment).f.l, ImageScreenSize.VERY_SMALL);
            inflate3.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            b(inflate3, attachment, b2);
            return;
        }
        if (attachment instanceof PendingPhotoAttachment) {
            PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment;
            View e2 = e(R.layout.attach_edit_photo, pendingPhotoAttachment.f, this.r, pendingPhotoAttachment.l != null, pendingPhotoAttachment.m);
            e2.setId(R.id.attachments_editor_view_pending_photo);
            e2.setOnClickListener(this);
            b(e2, attachment, b2);
            this.d.c(pendingPhotoAttachment);
            return;
        }
        if (attachment instanceof PodcastAttachment) {
            MusicTrack musicTrack = ((PodcastAttachment) attachment).f;
            b(c(R.drawable.vk_icon_podcast_24, musicTrack.h, musicTrack.d, false), attachment, b2);
            return;
        }
        if (attachment instanceof AudioAttachment) {
            AudioAttachment audioAttachment = (AudioAttachment) attachment;
            if (!(attachment instanceof PendingAudioAttachment)) {
                MusicTrack musicTrack2 = audioAttachment.f;
                b(c(R.drawable.vk_icon_music_24, musicTrack2.h, musicTrack2.d, false), attachment, b2);
                return;
            } else {
                MusicTrack musicTrack3 = audioAttachment.f;
                b(c(R.drawable.vk_icon_music_24, musicTrack3.h, musicTrack3.d, true), attachment, b2);
                this.d.c((PendingAudioAttachment) attachment);
                return;
            }
        }
        int i5 = 4;
        if (attachment instanceof PendingVideoAttachment) {
            PendingVideoAttachment pendingVideoAttachment = (PendingVideoAttachment) attachment;
            View inflate4 = View.inflate(getContext(), R.layout.attach_edit_video, null);
            VideoFile videoFile = pendingVideoAttachment.k;
            ((TextView) inflate4.findViewById(R.id.attach_video_duration)).setText(String.format("%d:%02d", Integer.valueOf(videoFile.getDuration() / 60), Integer.valueOf(videoFile.getDuration() % 60)));
            VKImageView vKImageView3 = (VKImageView) inflate4.findViewById(R.id.attach_thumb);
            Image image2 = videoFile.getImage();
            ImageScreenSize imageScreenSize = ImageScreenSize.VERY_SMALL;
            ImageSize Cb = image2.Cb(imageScreenSize.h(), true, true);
            vKImageView3.O0(Cb == null ? null : Cb.d.d, imageScreenSize);
            inflate4.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            ((ProgressBar) inflate4.findViewById(R.id.attach_progress)).setProgressDrawable(new pdc(true));
            ((ProgressBar) inflate4.findViewById(R.id.attach_progress)).setIndeterminateDrawable(new pdc(true));
            ((ProgressBar) inflate4.findViewById(R.id.attach_progress)).setIndeterminate(false);
            inflate4.findViewById(R.id.attach_progress).setVisibility(4);
            inflate4.findViewById(R.id.attach_error).setOnClickListener(this.h);
            inflate4.setId(R.id.attachments_editor_view_pending_video);
            inflate4.setOnClickListener(this);
            b(inflate4, attachment, b2);
            this.d.c(pendingVideoAttachment);
            return;
        }
        if (attachment instanceof VideoAttachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            View inflate5 = View.inflate(getContext(), R.layout.attach_edit_video, null);
            VideoFile videoFile2 = videoAttachment.k;
            TextView textView = (TextView) inflate5.findViewById(R.id.attach_video_duration);
            InteractiveDurationView interactiveDurationView = (InteractiveDurationView) inflate5.findViewById(R.id.attach_interactive_video_duration);
            if (videoFile2.W9()) {
                int duration = videoFile2.getDuration();
                gpt0 gpt0Var = gpt0.a;
                interactiveDurationView.setDurationText(z8s.a(duration));
                interactiveDurationView.setTextDescriptionVisible(false);
                interactiveDurationView.setVisibility(0);
                textView.setVisibility(8);
            } else {
                int duration2 = videoFile2.getDuration();
                gpt0 gpt0Var2 = gpt0.a;
                textView.setText(z8s.a(duration2));
                textView.setVisibility(0);
                interactiveDurationView.setVisibility(8);
            }
            VKImageView vKImageView4 = (VKImageView) inflate5.findViewById(R.id.attach_thumb);
            VideoOverlayView videoOverlayView = (VideoOverlayView) inflate5.findViewById(R.id.attach_edit_video_overlay);
            VideoFile videoFile3 = videoAttachment.k;
            bpn0 bpn0Var = VideoOverlayView.I;
            h84 h84Var = new h84(videoFile3, vKImageView4, videoOverlayView, z4 ? 1 : 0);
            g20 g20Var = new g20(this, i5);
            boolean c2 = fxc0.B().c(videoFile3);
            ra raVar = new ra(videoFile3, i5);
            uk ukVar = new uk(3, this, videoFile3);
            if (videoFile3.O() != null) {
                z = true;
                bVar = ((a390) this.v.getValue()).a(videoFile3.O());
            } else {
                z = true;
                bVar = null;
            }
            boolean z5 = (videoFile3.d8() || videoFile3.z0()) ? z : false;
            VideoPipStateHolder.a.getClass();
            yg5 c3 = VideoPipStateHolder.c();
            if (c3 != null) {
                z4 = c3.A().a1().equals(videoFile3.a1());
            }
            boolean z6 = z4;
            Object obj = this.u;
            Objects.requireNonNull(obj);
            VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView4, videoOverlayView, h84Var, g20Var, null, true, c2, raVar, ukVar, bVar, z5, z6, new uyq0(obj, 6), (i1t0) this.w.getValue()));
            inflate5.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            inflate5.setId(R.id.attachments_editor_view_video);
            inflate5.setOnClickListener(this);
            b(inflate5, attachment, b2);
            return;
        }
        if (attachment instanceof MarketAttachment) {
            MarketAttachment marketAttachment = (MarketAttachment) attachment;
            View inflate6 = View.inflate(getContext(), R.layout.attach_edit_market_thumb, null);
            ((TextView) inflate6.findViewById(R.id.attach_title)).setText(marketAttachment.f.d);
            ((TextView) inflate6.findViewById(R.id.attach_text)).setText(marketAttachment.f.h.e);
            inflate6.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            inflate6.findViewById(R.id.attach_remove).setVisibility(0);
            VKImageView vKImageView5 = (VKImageView) inflate6.findViewById(R.id.attach_thumb);
            bwt0.S(vKImageView5, new g84(z4 ? 1 : 0, marketAttachment, vKImageView5));
            b(inflate6, attachment, b2);
            return;
        }
        String str2 = "";
        if (attachment instanceof DocumentAttachment) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
            String str3 = documentAttachment.f;
            long j2 = documentAttachment.n;
            String[] split = str3.split("\\.");
            if (split.length > 0) {
                str2 = split[split.length - 1].toUpperCase() + ", ";
            }
            String str4 = documentAttachment.h;
            if (str4 == null || str4.length() <= 0) {
                String str5 = documentAttachment.f;
                StringBuilder e3 = fw3.e(str2);
                e3.append(dun.s6(j2, getResources()));
                b(c(R.drawable.vk_icon_document_24, str5, e3.toString(), attachment instanceof PendingDocumentAttachment), attachment, b2);
            } else {
                StringBuilder e4 = fw3.e(str2);
                e4.append(dun.s6(j2, getResources()));
                String sb = e4.toString();
                if (documentAttachment instanceof PendingDocumentAttachment) {
                    View e5 = e(R.layout.attach_edit_doc_thumb, documentAttachment.h, false, false, false);
                    ((TextView) e5.findViewById(R.id.attach_title)).setText(sb);
                    b(e5, attachment, b2);
                } else {
                    View inflate7 = View.inflate(getContext(), R.layout.attach_edit_doc_thumb, null);
                    inflate7.findViewById(R.id.attach_progress).setVisibility(8);
                    ((TextView) inflate7.findViewById(R.id.attach_title)).setText(sb);
                    ((VKImageView) inflate7.findViewById(R.id.attach_thumb)).O0(documentAttachment.h, ImageScreenSize.VERY_SMALL);
                    inflate7.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
                    b(inflate7, attachment, b2);
                }
            }
            if (attachment instanceof PendingDocumentAttachment) {
                this.d.c((PendingDocumentAttachment) attachment);
                return;
            }
            return;
        }
        if (attachment instanceof GeoAttachment) {
            GeoAttachment geoAttachment = (GeoAttachment) attachment;
            View inflate8 = View.inflate(getContext(), R.layout.attach_edit_geo, null);
            ((StaticMapView) inflate8.findViewById(R.id.attach_thumb)).e(geoAttachment.f, geoAttachment.g);
            inflate8.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            b(inflate8, attachment, b2);
            return;
        }
        if (attachment instanceof FwdMessagesAttachment) {
            int size = ((FwdMessagesAttachment) attachment).g.size();
            View inflate9 = View.inflate(getContext(), R.layout.attach_edit_fwd_message, null);
            ((TextView) inflate9.findViewById(R.id.attach_title)).setText(getResources().getQuantityString(R.plurals.messages, size, Integer.valueOf(size)));
            ((TextView) inflate9.findViewById(R.id.attach_type)).setText(size + "");
            inflate9.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            b(inflate9, attachment, b2);
            return;
        }
        if (attachment instanceof PostAttachment) {
            b(c(R.drawable.vk_icon_newsfeed_24, getContext().getString(R.string.attach_wall_post), ((PostAttachment) attachment).i, false), attachment, b2);
            return;
        }
        if (attachment instanceof PostReplyAttachment) {
            b(c(R.drawable.vk_icon_newsfeed_24, getContext().getString(R.string.attach_wall_post_reply), ((PostReplyAttachment) attachment).j, false), attachment, b2);
            return;
        }
        if (attachment instanceof LinkAttachment) {
            LinkAttachment linkAttachment = (LinkAttachment) attachment;
            b(c(R.drawable.vk_icon_link_24, linkAttachment.f.b.replace("http://", "").replace("https://", ""), linkAttachment.g, false), attachment, b2);
            return;
        }
        if (attachment instanceof PollAttachment) {
            PollAttachment pollAttachment = (PollAttachment) attachment;
            View c4 = c(R.drawable.vk_icon_poll_24, pollAttachment.f.d, "", false);
            c4.setOnClickListener(new g(pollAttachment));
            b(c4, attachment, b2);
            return;
        }
        if (attachment instanceof SnippetAttachment) {
            SnippetAttachment snippetAttachment = (SnippetAttachment) attachment;
            b(c(R.drawable.vk_icon_link_24, snippetAttachment.g, snippetAttachment.h, false), attachment, b2);
            return;
        }
        if (attachment instanceof ArticleAttachment) {
            Article article = ((ArticleAttachment) attachment).f;
            b(c(R.drawable.vk_icon_link_24, article.f, article.g, false), attachment, b2);
            return;
        }
        if (attachment instanceof AudioPlaylistAttachment) {
            AudioPlaylistAttachment audioPlaylistAttachment = (AudioPlaylistAttachment) attachment;
            int i6 = audioPlaylistAttachment.f.d;
            b(c(R.drawable.vk_icon_music_24, getContext().getString(i6 == 1 ? R.string.attach_album : i6 == 0 ? R.string.attach_playlist : R.string.attach_playlist_chat), audioPlaylistAttachment.f.h, false), attachment, b2);
            return;
        }
        if (attachment instanceof AudioArtistAttachment) {
            b(c(R.drawable.vk_icon_music_mic_24, getContext().getString(R.string.attach_artist), ((AudioArtistAttachment) attachment).f.c, false), attachment, b2);
            return;
        }
        if (attachment instanceof EventAttachment) {
            EventAttachment eventAttachment = (EventAttachment) attachment;
            Owner owner = eventAttachment.o;
            b(c(R.drawable.vk_icon_link_24, owner != null ? owner.c : getContext().getString(R.string.attach_event), eventAttachment.h, false), attachment, b2);
            return;
        }
        if (attachment instanceof MiniAppAttachment) {
            MiniAppAttachment miniAppAttachment = (MiniAppAttachment) attachment;
            ApiApplication apiApplication = miniAppAttachment.f;
            b(c((apiApplication.zb().booleanValue() || (apiApplication.C.equals("game") || apiApplication.C.equals("standalone"))) ? R.drawable.vk_icon_game_24 : R.drawable.vk_icon_services_24, miniAppAttachment.g, miniAppAttachment.h, false), attachment, b2);
            return;
        }
        if (attachment instanceof DonutLinkAttachment) {
            DonutLinkAttachment donutLinkAttachment = (DonutLinkAttachment) attachment;
            Owner owner2 = donutLinkAttachment.f;
            b(c(R.drawable.vk_icon_link_24, owner2 != null ? owner2.c : getContext().getString(R.string.attach_link), donutLinkAttachment.h, false), attachment, b2);
            return;
        }
        if (attachment instanceof QuestionAttachment) {
            this.f = true;
            b(c(R.drawable.vk_icon_question_outline_28, ((QuestionAttachment) attachment).h, "", false), attachment, b2);
            return;
        }
        if (!(attachment instanceof ChannelMessageAttachment)) {
            L.l("vk", "Unknown attachment: " + attachment);
        } else {
            String str6 = ((ChannelMessageAttachment) attachment).i;
            View inflate10 = View.inflate(getContext(), R.layout.attach_edit_fwd_message, null);
            ((TextView) inflate10.findViewById(R.id.attach_title)).setText(getResources().getString(R.string.attach_post));
            ((TextView) inflate10.findViewById(R.id.attach_type)).setText(str6);
            inflate10.findViewById(R.id.attach_remove).setOnClickListener(bVar2);
            b(inflate10, attachment, b2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (java.lang.Math.ceil((getWidth() + getScrollX()) / r4.q) <= r0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, Attachment attachment, int i2) {
        view.setTag(attachment);
        if (this.f) {
            View findViewById = view.findViewById(R.id.attach_remove);
            if (this.f) {
                findViewById.setVisibility(8);
            }
        }
        getViewTreeObserver().addOnPreDrawListener(new h(view, i2));
        invalidate();
        if (System.currentTimeMillis() - this.p > 500) {
            double d2 = i2;
            if (d2 >= Math.floor(getScrollX() / this.q)) {
            }
            postDelayed(new i(i2), 150L);
        }
        view.setOnLongClickListener(new a());
    }

    public final View c(int i2, String str, String str2, boolean z) {
        View inflate = View.inflate(getContext(), z ? R.layout.attach_edit_imageless_progress : R.layout.attach_edit_imageless, null);
        ((TextView) inflate.findViewById(R.id.attach_title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.attach_subtitle);
        textView.setText(str2);
        textView.setVisibility(TextUtils.isEmpty(str2) ? 8 : 0);
        ((ImageView) inflate.findViewById(R.id.attach_icon)).setImageResource(i2);
        if (z) {
            ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setProgressDrawable(new pdc(true));
            ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setIndeterminateDrawable(new pdc(true));
            ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setIndeterminate(false);
            inflate.findViewById(R.id.attach_error).setOnClickListener(this.h);
        }
        inflate.findViewById(R.id.attach_remove).setOnClickListener(this.g);
        return inflate;
    }

    @Override // xsna.g94
    public final int d(@NonNull Attachment attachment) {
        return this.c.indexOf(attachment);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.i = motionEvent.getX();
        this.j = motionEvent.getY();
        if (this.m == null) {
            requestDisallowInterceptTouchEvent(false);
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 2) {
            k();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
            h();
            this.m.animate().scaleX(1.0f).scaleY(1.0f).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(200L).start();
            this.m = null;
            this.n = 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View e(int i2, String str, boolean z, boolean z2, boolean z3) {
        boolean z4;
        SpoilerView spoilerView;
        final View findViewById;
        View findViewById2;
        final VkOnboardingCampaign e2;
        final View inflate = View.inflate(getContext(), i2, null);
        Uri parse = Uri.parse(str);
        if (parse != null) {
            File file = new File(parse.getPath());
            g760 g760Var = this.z;
            if (g760Var != null && g760Var.b(file)) {
                z4 = true;
                boolean z5 = !z && z4;
                ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setProgressDrawable(new pdc(true));
                ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setIndeterminateDrawable(new pdc(true));
                ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setIndeterminate(false);
                inflate.findViewById(R.id.attach_progress).setVisibility(4);
                VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.attach_thumb);
                spoilerView = (SpoilerView) inflate.findViewById(R.id.spoiler);
                if (spoilerView != null) {
                    spoilerView.setVisibility(z2 ? 0 : 8);
                }
                if (z2) {
                    vKImageView.setPostprocessor(null);
                } else {
                    vKImageView.setPostprocessor(this.A);
                }
                vKImageView.L0(parse, ImageScreenSize.VERY_SMALL);
                inflate.findViewById(R.id.attach_remove).setOnClickListener(this.g);
                inflate.findViewById(R.id.attach_error).setOnClickListener(this.h);
                findViewById = inflate.findViewById(R.id.edit_icon);
                if (findViewById != null) {
                    findViewById.setVisibility(z5 ? 0 : 8);
                }
                findViewById2 = inflate.findViewById(R.id.donut);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(z3 ? 0 : 8);
                }
                if (findViewById != null) {
                    final a24 a24Var = this.B;
                    q7v0 q7v0Var = a24Var.c;
                    if (q7v0Var.isReady()) {
                        ImFeatures imFeatures = ImFeatures.BLUR_POST;
                        imFeatures.getClass();
                        if (com.vk.toggle.b.A.a(imFeatures) && (e2 = q7v0Var.e("me:channel_blur_post")) != null && !a24Var.a && q7v0Var.d(e2) && q7v0Var.b(e2, false)) {
                            a24Var.d.post(new Runnable() { // from class: xsna.y14
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a24 a24Var2 = a24.this;
                                    a24Var2.getClass();
                                    int i3 = m8v0.M;
                                    View view = findViewById;
                                    String string = view.getContext().getString(R.string.vkim_write_bar_partial_donut_onboarding);
                                    VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
                                    VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size48;
                                    VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.BottomRight;
                                    VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
                                    boolean z6 = dhr0.C().b;
                                    VkOnboardingCampaign vkOnboardingCampaign = e2;
                                    m8v0.a.a(view, string, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, null, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, new ab(2, a24Var2, vkOnboardingCampaign), new nt(3), new v7(7), new db(7), new o43(3, a24Var2, vkOnboardingCampaign), new z14(a24Var2, vkOnboardingCampaign, inflate, 0), null, 0, true, null, null, false, null, z6, 7651364);
                                }
                            });
                        }
                    }
                }
                return inflate;
            }
        }
        z4 = false;
        if (z) {
        }
        ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setProgressDrawable(new pdc(true));
        ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setIndeterminateDrawable(new pdc(true));
        ((ProgressBar) inflate.findViewById(R.id.attach_progress)).setIndeterminate(false);
        inflate.findViewById(R.id.attach_progress).setVisibility(4);
        VKImageView vKImageView2 = (VKImageView) inflate.findViewById(R.id.attach_thumb);
        spoilerView = (SpoilerView) inflate.findViewById(R.id.spoiler);
        if (spoilerView != null) {
        }
        if (z2) {
        }
        vKImageView2.L0(parse, ImageScreenSize.VERY_SMALL);
        inflate.findViewById(R.id.attach_remove).setOnClickListener(this.g);
        inflate.findViewById(R.id.attach_error).setOnClickListener(this.h);
        findViewById = inflate.findViewById(R.id.edit_icon);
        if (findViewById != null) {
        }
        findViewById2 = inflate.findViewById(R.id.donut);
        if (findViewById2 != null) {
        }
        if (findViewById != null) {
        }
        return inflate;
    }

    public final boolean f() {
        Iterator<Attachment> it = this.c.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ju90) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.g94
    public final void g(@NonNull PendingPhotoAttachment pendingPhotoAttachment, @Nullable Integer num) {
        a(pendingPhotoAttachment, num);
    }

    public int getCount() {
        Iterator<Attachment> it = this.c.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Attachment next = it.next();
            if (!(next instanceof GeoAttachment) && !(next instanceof FwdMessagesAttachment)) {
                i2++;
            }
        }
        return i2;
    }

    public int getRealCount() {
        return this.c.size();
    }

    public final void h() {
        LayoutTransition layoutTransition = this.b.getLayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) property, 0.1f, 1.0f);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) property2, 0.1f, 1.0f);
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        Property property3 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) property3, fArr));
        animatorSet.getChildAnimations().get(0).setInterpolator(new OvershootInterpolator());
        animatorSet.getChildAnimations().get(1).setInterpolator(new OvershootInterpolator());
        animatorSet.getChildAnimations().get(2).setInterpolator(new d());
        animatorSet.addListener(new e());
        layoutTransition.setAnimator(2, animatorSet);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) property, 1.0f, 0.1f).setDuration(300L), ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) property2, 1.0f, 0.1f).setDuration(300L), ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ROTATION, 90.0f).setDuration(300L), ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) property3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L));
        animatorSet2.addListener(new f());
        layoutTransition.setAnimator(3, animatorSet2);
        layoutTransition.setStartDelay(1, 150L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(2, 500L);
        layoutTransition.setStartDelay(3, 0L);
    }

    @Override // xsna.g94
    public final void i(int i2) {
        try {
            this.b.removeViewAt(i2);
            this.c.remove(i2);
        } catch (Exception e2) {
            L.i(e2);
        }
    }

    public final void k() {
        this.m.setTranslationX(this.i - this.k);
        this.m.setTranslationY(this.j - this.l);
        int round = Math.round((this.m.getTranslationX() + this.m.getLeft()) / this.m.getWidth());
        int i2 = this.n;
        ArrayList<Attachment> arrayList = this.c;
        if (round != i2 && round >= 0 && round < this.b.getChildCount() && com.vkontakte.android.attachments.a.a(arrayList.get(this.n), arrayList.get(round))) {
            this.b.removeView(this.m);
            this.b.addView(this.m, round);
            Attachment attachment = arrayList.get(this.n);
            Attachment attachment2 = arrayList.get(round);
            arrayList.set(round, attachment);
            arrayList.set(this.n, attachment2);
            View view = this.m;
            view.setTranslationX(view.getTranslationX() - (this.m.getWidth() * (round - this.n)));
            this.k += this.m.getWidth() * (round - this.n);
            this.n = round;
        }
        if (((this.m.getTranslationX() + this.m.getLeft()) + this.m.getWidth()) - getScrollX() > getWidth()) {
            if (this.o != null || this.n >= arrayList.size() - 1) {
                return;
            }
            k kVar = new k(1);
            this.o = kVar;
            post(kVar);
            return;
        }
        if (((this.m.getTranslationX() + this.m.getLeft()) + (this.m.getWidth() / 3)) - getScrollX() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.o == null) {
                k kVar2 = new k(-1);
                this.o = kVar2;
                post(kVar2);
                return;
            }
            return;
        }
        Runnable runnable = this.o;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.o = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.y == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.attachments_editor_view_photo) {
            this.y.a(view.getTag() instanceof PhotoAttachment ? (PhotoAttachment) view.getTag() : null);
            return;
        }
        if (id == R.id.attachments_editor_view_pending_photo) {
            if (view.getTag() instanceof PendingPhotoAttachment) {
                this.y.d((PendingPhotoAttachment) view.getTag());
                return;
            } else if (view.getTag() instanceof PhotoAttachment) {
                this.y.a((PhotoAttachment) view.getTag());
                return;
            } else {
                this.y.a(null);
                return;
            }
        }
        if (id == R.id.attachments_editor_view_video) {
            this.y.b(view.getTag() instanceof VideoAttachment ? (VideoAttachment) view.getTag() : null);
            return;
        }
        if (id == R.id.attachments_editor_view_pending_video) {
            if (view.getTag() instanceof PendingVideoAttachment) {
                this.y.c((PendingVideoAttachment) view.getTag());
            } else if (view.getTag() instanceof VideoAttachment) {
                this.y.b((VideoAttachment) view.getTag());
            } else {
                this.y.c(null);
            }
        }
    }

    public void setAttachmentsClickListener(@Nullable d84 d84Var) {
        this.y = d84Var;
    }

    public void setCallback(j jVar) {
        this.d = jVar;
    }

    public void setNewEditorScreenFactory(g760 g760Var) {
        this.z = g760Var;
    }

    public void setResultFragment(@Nullable FragmentImpl fragmentImpl) {
        this.x = fragmentImpl;
    }

    public void setShowPhotoEditorEntryPoints(boolean z) {
        this.r = z;
    }

    @Override // xsna.g94
    public ArrayList<Attachment> getAll() {
        return new ArrayList<>(this.c);
    }

    @Override // xsna.g94
    public final void j(@NonNull LinkedHashMap linkedHashMap) {
    }
}
