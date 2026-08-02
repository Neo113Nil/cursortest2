package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ironsource.C4267cg;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.common.text.views.CreateStoryEditText;
import com.vk.catalog2.feature.music.holders.artist.MusicPagePhoneHeaderNewVh;
import com.vk.catalog2.feature.music.ui.holder.PodcastCategoryCatalogRootVh;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.PhotoViewPager;
import com.vk.reactions.view.ElevationImageView;
import com.vk.stories.design.view.text.StorySeekBar;
import com.vk.stories.design.view.text.TextStyleFontPicker;
import com.vk.story.viewer.impl.presentation.ideas.ui.IdeasOnboardingShimmerView;
import com.vk.writebar.fullscreen.WriteBarButtonsBubbleView;
import com.vkontakte.android.actionlinks.views.fragments.ItemsDialogWrapper;
import com.vkontakte.android.sdk.SDKInviteDialog;
import ru.mail.libverify.j.b;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.media.PublisherImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tn9 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tn9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        int i = this.b;
        Activity activity = null;
        activity = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj).getPresenter();
                if (presenter != null && presenter.U3() && presenter.y4()) {
                    presenter.r();
                    break;
                }
                break;
            case 1:
                ((irb) obj).j = false;
                break;
            case 2:
                int i2 = rec.j1;
                ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = ((nw20) obj).i;
                if (modalBottomSheetBehavior != null) {
                    modalBottomSheetBehavior.O(3);
                    break;
                }
                break;
            case 3:
                ((com.vk.clips.editor.templates.impl.player.a) obj).B.b();
                break;
            case 4:
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0((CredentialProviderCreatePublicKeyCredentialController) obj);
                break;
            case 5:
                float[] fArr = ElevationImageView.A;
                ((gzs) obj).invoke();
                break;
            case 6:
                PlaylistPlayerVideoView playlistPlayerVideoView = ((atu) obj).a.v.a;
                f5b0.a(playlistPlayerVideoView.getContext()).abandonAudioFocus(playlistPlayerVideoView.v);
                break;
            case 7:
                IdeasOnboardingShimmerView ideasOnboardingShimmerView = ((quv) obj).l;
                ValueAnimator valueAnimator = ideasOnboardingShimmerView.e;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    long j = ideasOnboardingShimmerView.i + ideasOnboardingShimmerView.j;
                    ValueAnimator valueAnimator2 = ideasOnboardingShimmerView.e;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    if (j < 1) {
                        j = 1;
                    }
                    ofFloat.setDuration(j);
                    ofFloat.setRepeatCount(-1);
                    ofFloat.setRepeatMode(1);
                    ofFloat.addUpdateListener(new msv(ideasOnboardingShimmerView, 0));
                    ofFloat.start();
                    ideasOnboardingShimmerView.e = ofFloat;
                    break;
                }
                break;
            case 8:
                int i3 = ItemsDialogWrapper.S;
                ((ItemsDialogWrapper) obj).dismiss();
                break;
            case 9:
                p630.setAdvertisementMode$lambda$11((p630) obj);
                break;
            case 10:
                CollapsingToolbarLayout collapsingToolbarLayout = ((MusicPagePhoneHeaderNewVh) obj).d;
                if (collapsingToolbarLayout != null && (context = collapsingToolbarLayout.getContext()) != null) {
                    activity = e3m.h(context);
                }
                if (activity != null) {
                    mnh0.w(activity.getWindow().getDecorView(), !r9.f);
                    break;
                }
                break;
            case 11:
                PhotoViewPager photoViewPager = (PhotoViewPager) obj;
                int i4 = PhotoViewPager.b;
                if (!photoViewPager.isFakeDragging()) {
                    photoViewPager.beginFakeDrag();
                    if (photoViewPager.isFakeDragging()) {
                        photoViewPager.endFakeDrag();
                        break;
                    }
                }
                break;
            case 12:
                ((VideoSink.a) obj).onFirstFrameRendered();
                break;
            case 13:
                PodcastCategoryCatalogRootVh podcastCategoryCatalogRootVh = (PodcastCategoryCatalogRootVh) obj;
                g3a.a(podcastCategoryCatalogRootVh.p, podcastCategoryCatalogRootVh);
                break;
            case 14:
                ((PublisherImpl) obj).lambda$pause$4();
                break;
            case 15:
                gzs<s3q0> onCameraFirstFrameDrawnCallback = ((xoe0) obj).getOnCameraFirstFrameDrawnCallback();
                if (onCameraFirstFrameDrawnCallback != null) {
                    onCameraFirstFrameDrawnCallback.invoke();
                    break;
                }
                break;
            case 16:
                ((hte0) obj).P4();
                break;
            case 17:
                SDKInviteDialog.a aVar = ((SDKInviteDialog) obj).Q;
                if (aVar != null) {
                    aVar.c1();
                    break;
                }
                break;
            case 18:
                StickyMusicPlayerBottomSheet.w0((StickyMusicPlayerBottomSheet) obj);
                break;
            case 19:
                cmo0 cmo0Var = (cmo0) obj;
                CreateStoryEditText createStoryEditText = cmo0Var.i;
                if (createStoryEditText == null) {
                    createStoryEditText = null;
                }
                createStoryEditText.animate().alpha(1.0f).setDuration(200L).setInterpolator(new hlq()).start();
                StorySeekBar storySeekBar = cmo0Var.j;
                if (storySeekBar == null) {
                    storySeekBar = null;
                }
                storySeekBar.animate().alpha(1.0f).setDuration(200L).setInterpolator(new hlq()).start();
                TextStyleFontPicker textStyleFontPicker = cmo0Var.l;
                (textStyleFontPicker != null ? textStyleFontPicker : null).animate().alpha(1.0f).setDuration(200L).setInterpolator(new hlq()).start();
                break;
            case 20:
                ((TextureViewRenderer) obj).dropPostponedFrameIfExists();
                break;
            case 21:
                jpr0 jpr0Var = (jpr0) obj;
                jpr0Var.b.removeView(jpr0Var.m);
                break;
            case 22:
                cys0 cys0Var = (cys0) obj;
                f4m.j(cys0Var.l0);
                cys0Var.k0.setVisibility(0);
                f4m.j(cys0Var.o0);
                break;
            case 23:
                qcy<Object>[] qcyVarArr = VideoView.T0;
                ((VideoView) obj).requestLayout();
                break;
            case 24:
                VkTooltip vkTooltip = (VkTooltip) obj;
                vkTooltip.getLocationOnScreen(new int[2]);
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 0, vkTooltip.A - r1[0], 0, vkTooltip.B - r1[1]);
                scaleAnimation.setDuration(200L);
                scaleAnimation.setInterpolator(new DecelerateInterpolator());
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                alphaAnimation.setDuration(200L);
                AnimationSet animationSet = new AnimationSet(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(alphaAnimation);
                animationSet.setFillAfter(true);
                animationSet.setAnimationListener(new ftv0(vkTooltip));
                vkTooltip.startAnimation(animationSet);
                break;
            case 25:
                int i5 = WriteBarButtonsBubbleView.h;
                bwt0.p0((WriteBarButtonsBubbleView) obj, false);
                break;
            case 26:
                b.C2205b.a((ru.mail.libverify.j.b) obj);
                break;
            case 27:
                ((ru.mail.libverify.j0.c) obj).h();
                break;
            default:
                C4267cg.e((C4267cg) obj);
                break;
        }
    }
}
