package xsna;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.stories.dto.StoriesMediascopeResearchDto;
import com.vk.api.generated.stories.dto.StoriesMediascopeResearchEventDto;
import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.common.links.LaunchContext;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.hints.HintId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.HighlightStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.dto.stories.model.clickable.ClickableApp;
import com.vk.dto.stories.model.clickable.ClickablePost;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView$Companion$Type;
import com.vk.libvideo.models.videotracker.RewindType;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.avatar.StoryAvatarView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.stories.design.view.viewer.StoryUploadIndicatorView;
import com.vk.stories.design.view.viewer.StoryViewHeader;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.collections.builders.ListBuilder;
import xsna.emm0;
import xsna.h7u0;
import xsna.ikv0;
import xsna.m8v0;

/* compiled from: StoryView.kt */
/* loaded from: classes6.dex */
public class mkm0 extends po6 implements uov {
    public final plm0 E;
    public final vu50 F;

    public /* synthetic */ mkm0(Context context, View.OnTouchListener onTouchListener, StoriesContainer storiesContainer, elm0 elm0Var, com.vk.story.api.a aVar, zb80 zb80Var, qlm0 qlm0Var, WeakReference weakReference, int i) {
        this(context, onTouchListener, storiesContainer, elm0Var, aVar, zb80Var, qlm0Var, weakReference, 1.0f, false, false);
    }

    @Override // xsna.qo6
    public final void D() {
        this.E.a().j();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v11 int, still in use, count: 1, list:
          (r1v11 int) from 0x0038: INVOKE 
          (r3v3 xsna.rlt0)
          (r1v11 int)
          (r2v0 int)
          (wrap:com.vk.libvideo.models.videotracker.RewindType:0x0036: SGET  A[WRAPPED] (LINE:55) com.vk.libvideo.models.videotracker.RewindType.DOUBLE_TAP com.vk.libvideo.models.videotracker.RewindType)
         VIRTUAL call: xsna.rlt0.l(int, int, com.vk.libvideo.models.videotracker.RewindType):void A[MD:(int, int, com.vk.libvideo.models.videotracker.RewindType):void (m)] (LINE:57)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @Override // xsna.qo6
    public final void E() {
        /*
            r5 = this;
            xsna.plm0 r0 = r5.E
            xsna.rot r0 = r0.d
            xsna.q7r r1 = r0.a
            xsna.mkm0 r1 = r1.i0
            com.vk.dto.stories.model.StoryEntry r1 = r1.getCurrentStory()
            if (r1 == 0) goto L56
            xsna.q7r r1 = r0.a
            xsna.mkm0 r1 = r1.i0
            com.vk.dto.stories.model.StoryEntry r1 = r1.getCurrentStory()
            boolean r1 = r1.Mb()
            if (r1 == 0) goto L56
            xsna.q7r r1 = r0.a
            xsna.xaj0 r1 = r1.v
            if (r1 == 0) goto L56
            long r1 = r1.getCurrentPosition()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            int r1 = (int) r1
            int r2 = r1 + (-10)
            r3 = -10
            if (r2 <= r3) goto L56
            xsna.q7r r3 = r0.a
            xsna.rlt0 r3 = r3.n
            if (r3 == 0) goto L3b
            com.vk.libvideo.models.videotracker.RewindType r4 = com.vk.libvideo.models.videotracker.RewindType.DOUBLE_TAP
            r3.l(r1, r2, r4)
        L3b:
            xsna.q7r r1 = r0.a
            com.vk.libvideo.design.view.seek.VideoFastSeekView r1 = r1.t
            r2 = 0
            r1.z = r2
            r3 = 0
            com.vk.libvideo.design.view.seek.VideoFastSeekView$Companion$Type r4 = com.vk.libvideo.design.view.seek.VideoFastSeekView$Companion$Type.BUTTON
            r1.a(r2, r3, r4)
            xsna.q7r r0 = r0.a
            xsna.xaj0 r0 = r0.v
            long r1 = r0.getCurrentPosition()
            r3 = 10000(0x2710, double:4.9407E-320)
            long r1 = r1 - r3
            r0.b(r1)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.mkm0.E():void");
    }

    @Override // xsna.po6, xsna.qo6
    public final void E0(boolean z) {
        q7r q7rVar = this.E.b().a;
        if (q7rVar.i0.R0() || !q7rVar.c0) {
            return;
        }
        q7rVar.a0.setAlpha(z ? 255 : 0);
        StoryBottomViewGroup storyBottomViewGroup = q7rVar.G;
        if (storyBottomViewGroup != null) {
            storyBottomViewGroup.setVisibility(z ? 0 : 8);
        }
        StoryUploadIndicatorView storyUploadIndicatorView = q7rVar.H;
        if (storyUploadIndicatorView != null) {
            boolean z2 = storyUploadIndicatorView.getState() == StoryUploadIndicatorView.State.IDLE;
            StoryUploadIndicatorView storyUploadIndicatorView2 = q7rVar.H;
            if (storyUploadIndicatorView2 != null) {
                storyUploadIndicatorView2.setVisibility((!z || z2) ? 8 : 0);
            }
        }
    }

    @Override // xsna.skm0.a
    public final void F() {
        fw fwVar = this.E.b;
        fwVar.a.i0.f1(StoryViewAction.GO_TO_SETTINGS, null);
        sxc0.a().a(fwVar.a.i0.getContext(), this.d);
    }

    @Override // xsna.skm0.a
    public final void F0() {
        this.E.b.d(true);
    }

    @Override // xsna.qo6
    public final void G() {
        this.E.e.b.g();
    }

    @Override // xsna.qo6
    public final void G0(tu1 tu1Var) {
        int i;
        atu atuVar = this.E.e;
        StoryEntry currentStory = atuVar.a.i0.getCurrentStory();
        if (currentStory == null || currentStory.c != tu1Var.b || !o25.a().a(tu1Var.a) || (i = currentStory.z) <= 0) {
            return;
        }
        int i2 = i - tu1Var.c;
        currentStory.z = i2;
        if (i2 < 0) {
            currentStory.z = 0;
        }
        atuVar.b.g();
    }

    @Override // xsna.qo6
    public final void H(int i, UserId userId) {
        atu atuVar = this.E.e;
        StoryOwner storyOwner = atuVar.a.i0.getStoriesContainer().b;
        if (storyOwner instanceof StoryOwner.Community) {
            StoryOwner.Community community = (StoryOwner.Community) storyOwner;
            if (storyOwner.Ib(userId)) {
                Group group = community.c;
                boolean z = true;
                if (i != 1 && i != 4) {
                    z = false;
                }
                group.j = z;
                group.C = i;
                atuVar.d.c();
            }
        }
    }

    @Override // xsna.qo6
    public final void H0(int i, UserId userId) {
        atu atuVar = this.E.e;
        StoryOwner storyOwner = atuVar.a.i0.getStoriesContainer().b;
        if (storyOwner instanceof StoryOwner.User) {
            StoryOwner.User user = (StoryOwner.User) storyOwner;
            if (user.Ib(userId)) {
                user.c.v = i;
                atuVar.d.c();
            }
        }
    }

    @Override // xsna.qo6
    public final boolean I0() {
        zbx zbxVar = this.E.a.l0;
        if (zbxVar == null) {
            return false;
        }
        if (zbxVar.d != null) {
            return !r0.e;
        }
        return true;
    }

    @Override // xsna.qo6
    public final void J(StoryEntry storyEntry) {
        int i;
        atu atuVar = this.E.e;
        StoryEntry currentStory = atuVar.a.i0.getCurrentStory();
        if (currentStory != null && storyEntry.O == currentStory.c && storyEntry.P.equals(currentStory.d) && (i = currentStory.z) > 0) {
            currentStory.z = i - 1;
            atuVar.b.g();
        } else if (currentStory != null && currentStory.c == storyEntry.c && currentStory.d.equals(storyEntry.d)) {
            atuVar.c.c(atuVar.a.i0.getCurrentIndex());
        }
    }

    @Override // xsna.skm0.a
    public final void J0() {
        fw fwVar = this.E.b;
        StoryEntry currentStory = fwVar.a.i0.getCurrentStory();
        Objects.requireNonNull(currentStory);
        i0q0.d(50L, new aw(0, fwVar, currentStory));
    }

    @Override // xsna.uov
    public final void Ji() {
        this.E.f.b();
    }

    @Override // xsna.qo6
    public final Animator K0(boolean z, ViewGroup viewGroup, int i, int i2) {
        ebm0 ebm0Var;
        tp80 tp80Var = this.E.q;
        Context context = getContext();
        q7r q7rVar = tp80Var.a;
        mkm0 mkm0Var = q7rVar.i0;
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        if (z) {
            jz8 jz8Var = tp80Var.b;
            StoryEntry currentStory = mkm0Var.getCurrentStory();
            Integer valueOf = currentStory != null ? Integer.valueOf(currentStory.c) : null;
            ViewGroup viewGroup2 = (mkm0Var.getStoriesContainer().Rb() && (valueOf != null && mkm0Var.getDependencies().o.m(valueOf.intValue()))) ? q7rVar.H : q7rVar.G;
            if (viewGroup2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iah0.z(context), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                viewGroup2.measure(makeMeasureSpec, makeMeasureSpec2);
                jz8Var.a(jz8Var.c(i, i2, false));
                viewGroup2.measure(makeMeasureSpec, makeMeasureSpec2);
                float translationY = viewGroup2.getTranslationY();
                float measuredHeight = (-translationY) + viewGroup2.getMeasuredHeight();
                if (viewGroup2.getMeasuredWidth() > 0 && viewGroup2.getMeasuredHeight() > 0) {
                    if ((viewGroup2 instanceof StoryBottomViewGroup) && (ebm0Var = ((StoryBottomViewGroup) viewGroup2).B.m) != null) {
                        ebm0Var.h.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    Bitmap i3 = kd7.i(viewGroup2, null);
                    ImageView imageView = new ImageView(context);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight(), 80));
                    imageView.setImageBitmap(i3);
                    imageView.setTranslationY(measuredHeight);
                    imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    viewGroup.addView(imageView);
                    f4m.j(viewGroup2);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, measuredHeight, translationY), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                    animatorSet.addListener(new sp80(viewGroup, imageView, viewGroup2));
                    return animatorSet;
                }
            }
        } else {
            StoryEntry currentStory2 = mkm0Var.getCurrentStory();
            Integer valueOf2 = currentStory2 != null ? Integer.valueOf(currentStory2.c) : null;
            View view = (mkm0Var.getStoriesContainer().Rb() && (valueOf2 != null && mkm0Var.getDependencies().o.m(valueOf2.intValue()))) ? q7rVar.H : q7rVar.G;
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(iah0.z(context), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                float translationY2 = view.getTranslationY();
                float measuredHeight2 = (-translationY2) + view.getMeasuredHeight();
                if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                    Bitmap i4 = kd7.i(view, null);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setLayoutParams(new FrameLayout.LayoutParams(view.getMeasuredWidth(), view.getMeasuredHeight(), 80));
                    imageView2.setImageBitmap(i4);
                    imageView2.setTranslationY(translationY2);
                    viewGroup.addView(imageView2);
                    f4m.j(view);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, translationY2, measuredHeight2), ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    return animatorSet2;
                }
            }
        }
        return null;
    }

    @Override // xsna.qo6
    public void L(int i, int i2) {
        xaj0 xaj0Var;
        xaj0 xaj0Var2;
        atu atuVar = this.E.e;
        mkm0 mkm0Var = atuVar.a.i0;
        if (mkm0Var.f || mkm0Var.n || mkm0Var.getCurrentStory() == null) {
            return;
        }
        int position = atuVar.a.i0.getPosition();
        if (position == i) {
            atuVar.a.i0.R();
            atuVar.c.h(atuVar.a.i0.getCurrentStory(), atuVar.a.i0.getViewEntryPoint());
        }
        if (position == i2) {
            atuVar.a.i0.getDependencies().e.f(atuVar.a.i0.getCurrentStory(), atuVar.a.i0.getViewEntryPoint());
        }
        if (i != atuVar.a.i0.getPosition() && (xaj0Var2 = atuVar.a.v) != null) {
            xaj0Var2.a.post(new tn9(atuVar, 6));
            return;
        }
        if (i == atuVar.a.i0.getPosition() && atuVar.a.i0.getCurrentStory().Ub() && (xaj0Var = atuVar.a.v) != null) {
            PlaylistPlayerVideoView playlistPlayerVideoView = xaj0Var.a;
            a4t0 a4t0Var = playlistPlayerVideoView.v;
            if (!playlistPlayerVideoView.w || playlistPlayerVideoView.x == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            if (f5b0.a(playlistPlayerVideoView.getContext()).requestAudioFocus(a4t0Var, 3, 2) == 1) {
                a4t0Var.onAudioFocusChange(2);
            } else {
                a4t0Var.onAudioFocusChange(-1);
            }
        }
    }

    @Override // xsna.qo6
    public final void L0() {
        final rot rotVar = this.E.d;
        if (!rotVar.a.i0.T0() && rotVar.a.i0.R0()) {
            mkm0 mkm0Var = rotVar.a.i0;
            if (mkm0Var.f || mkm0Var.getCurrentStory() == null || rotVar.a.i0.getCurrentIndex() >= rotVar.a.i0.getStoriesContainer().g.size() || rotVar.a.i0.getDependencies().o.j(rotVar.a.i0.getCurrentStory().c)) {
                return;
            }
            if (rotVar.a.i0.getStoriesContainer().Rb()) {
                rotVar.a.V.a(false);
                return;
            }
            mkm0 mkm0Var2 = rotVar.a.i0;
            if (mkm0Var2.f || mkm0Var2.getCurrentStory() == null) {
                return;
            }
            if (rotVar.a.i0.getStoriesContainer().j) {
                rotVar.c.d(rotVar.a.i0.getCurrentStory(), true, false, new zzs() { // from class: xsna.qot
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        rot.this.a.G.B.m((StoryEntry) obj, false);
                        return null;
                    }
                });
                return;
            }
            mkm0 mkm0Var3 = rotVar.a.i0;
            if (mkm0Var3.getCurrentStory() != null && !TextUtils.isEmpty(mkm0Var3.getCurrentStory().T)) {
                rotVar.c.b(false, null, null);
                return;
            }
            if (rotVar.a.i0.getCurrentStory().r) {
                rotVar.c.e();
                return;
            }
            mkm0 mkm0Var4 = rotVar.a.j0;
            if (!(mkm0Var4 instanceof ep50)) {
                if (mkm0Var4 instanceof kq50) {
                    ((kq50) mkm0Var4).r1();
                }
            } else {
                ep50 ep50Var = (ep50) mkm0Var4;
                ep50Var.O = true;
                View ctaButtonView = ep50.this.getCtaButtonView();
                if (ctaButtonView != null) {
                    ctaButtonView.performClick();
                }
            }
        }
    }

    @Override // xsna.skm0.a
    public final void M0() {
        fw fwVar = this.E.b;
        if (fwVar.a.i0.getCurrentStory() == null) {
            return;
        }
        fwVar.a.i0.getDependencies().f.m(fwVar.a.i0.getCurrentStory(), fwVar.a.i0.getViewEntryPoint(), fwVar.a.i0.P0());
        io.reactivex.rxjava3.internal.operators.single.b0 m = fwVar.a.i0.getDependencies().a.e(fwVar.a.i0.getCurrentStory()).m(io.reactivex.rxjava3.android.schedulers.a.b());
        sv svVar = new sv(fwVar, 0);
        int i = kwg0.a;
        m.subscribe(svVar, new iwg0());
    }

    @Override // xsna.qo6
    public final void N() {
        xaj0 xaj0Var;
        int currentPosition;
        int currentPosition2;
        rot rotVar = this.E.d;
        StoryEntry currentStory = rotVar.a.i0.getCurrentStory();
        if (currentStory == null || !currentStory.Mb() || (xaj0Var = rotVar.a.v) == null || (currentPosition2 = (currentPosition = (int) (xaj0Var.getCurrentPosition() / 1000)) + 10) >= ((int) (rotVar.a.v.getDuration() / 1000)) + 10) {
            return;
        }
        VideoFastSeekView videoFastSeekView = rotVar.a.t;
        videoFastSeekView.z = false;
        videoFastSeekView.a(true, null, VideoFastSeekView$Companion$Type.BUTTON);
        xaj0 xaj0Var2 = rotVar.a.v;
        xaj0Var2.b(xaj0Var2.getCurrentPosition() + 10000);
        rlt0 rlt0Var = rotVar.a.n;
        if (rlt0Var != null) {
            rlt0Var.l(currentPosition, currentPosition2, RewindType.DOUBLE_TAP);
        }
    }

    @Override // xsna.y5p0
    public final Activity N0() {
        return e3m.h(this.E.a.i0.getContext());
    }

    @Override // xsna.uov
    public final Dialog Nf(ymm0 ymm0Var, View.OnClickListener onClickListener) {
        f0q0 b = this.E.b();
        q7r q7rVar = b.a;
        mkm0 mkm0Var = q7rVar.i0;
        Context context = mkm0Var.getContext();
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        if (h == null || mkm0Var.f) {
            return null;
        }
        Dialog currentDialog = mkm0Var.getCurrentDialog();
        if (currentDialog != null) {
            currentDialog.dismiss();
        }
        androidx.appcompat.app.d a = zmm0.a(h, ymm0Var, onClickListener, null);
        a.setOnDismissListener(q7rVar.j0);
        q7rVar.i0.setCurrentDialog(a);
        b.c.b();
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory != null) {
            mkm0Var.getDependencies().e.f(currentStory, mkm0Var.getViewEntryPoint());
        }
        return mkm0Var.getCurrentDialog();
    }

    @Override // xsna.po6, xsna.qo6
    public final boolean O(int i, int i2) {
        bdl0 bdl0Var = this.E.i;
        bdl0Var.getClass();
        if (jjc.b()) {
            return false;
        }
        q7r q7rVar = bdl0Var.a;
        if (q7rVar.Q == null || q7rVar.i0.getCurrentStory() == null || bdl0Var.a.i0.getCurrentStory().X == null) {
            return false;
        }
        q7r q7rVar2 = bdl0Var.a;
        return q7rVar2.Q.d(q7rVar2.j0, q7rVar2.i0.getCurrentStory().X, i, i2, null);
    }

    @Override // xsna.skm0.a
    public final void O0() {
        fw fwVar = this.E.b;
        fwVar.a.i0.getDependencies().f.G(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, fwVar.a.i0.getViewEntryPoint(), fwVar.a.i0.getCurrentStory(), fwVar.a.i0.P0());
    }

    @Override // xsna.qo6
    public final Animator P() {
        return this.E.q.a(0.5f);
    }

    @Override // xsna.qo6
    public final void Q() {
        xut0 xut0Var;
        rot rotVar = this.E.d;
        if (!rotVar.a.i0.R0() || (xut0Var = rotVar.a.D) == null) {
            return;
        }
        xut0Var.b();
    }

    @Override // xsna.qo6
    public final void S() {
        xut0 xut0Var = this.E.d.a.D;
        if (xut0Var != null) {
            xut0Var.a(false);
        }
    }

    @Override // xsna.qo6
    public final void U() {
        this.E.f.d();
    }

    @Override // xsna.po6
    public void V0(SourceTransitionStory sourceTransitionStory) {
        this.E.a().f(sourceTransitionStory);
    }

    @Override // xsna.po6
    public final void W0(SourceTransitionStory sourceTransitionStory) {
        this.E.a().g(sourceTransitionStory);
    }

    @Override // xsna.po6
    public void X0(int i) {
        q50.i(this.E.a(), i, 6);
    }

    @Override // xsna.umm0.a
    public final void Y() {
        StoryEntry currentStory;
        q7r q7rVar = this.E.h.b;
        if (q7rVar == null || (currentStory = q7rVar.i0.getCurrentStory()) == null) {
            return;
        }
        int i = q7rVar.h;
        int i2 = currentStory.c;
        if (i != i2) {
            q7rVar.h = i2;
            q7rVar.i = System.currentTimeMillis();
            q7rVar.k = false;
        }
    }

    @Override // xsna.qo6
    public final void b() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        f0q0 f0q0Var = this.E.d.b;
        xjt0 xjt0Var = f0q0Var.a.o;
        if (xjt0Var == null || (animate = xjt0Var.animate()) == null || (alpha = animate.alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) == null || (duration = alpha.setDuration(300L)) == null || (listener = duration.setListener(new vko(f0q0Var, 1))) == null) {
            return;
        }
        listener.start();
    }

    @Override // xsna.qo6
    public final void c() {
        xaj0 xaj0Var;
        f0q0 f0q0Var = this.E.d.b;
        q7r q7rVar = f0q0Var.a;
        mkm0 mkm0Var = q7rVar.i0;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if (currentStory == null || (xaj0Var = q7rVar.v) == null) {
            return;
        }
        boolean z = xaj0Var.getDuration() > 0 && xaj0Var.t;
        if (q7rVar.o == null && currentStory.Mb() && xaj0Var.getCurrentPosition() != 0 && z) {
            xjt0 xjt0Var = new xjt0(mkm0Var.getContext());
            VideoFile videoFile = currentStory.n;
            xjt0Var.setTimelineThumbs(videoFile != null ? videoFile.B0() : null);
            mkm0Var.addView(xjt0Var);
            xjt0Var.setAlpha(0.01f);
            xjt0Var.animate().alpha(1.0f).setDuration(300L).start();
            xjt0Var.a(xaj0Var.getCurrentPosition(), xaj0Var.getCurrentPosition(), xaj0Var.getDuration());
            q7rVar.o = xjt0Var;
            f0q0Var.c.b();
            f0q0Var.c();
        }
    }

    @Override // xsna.skm0.a
    public final void c0(boolean z, boolean z2) {
        fw fwVar = this.E.b;
        fwVar.getClass();
        int i = 0;
        boolean z3 = z && !z2;
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(bwt0.u(fwVar.a.i0.getContext()));
        if (!z3 || fwVar.a.i0.getCurrentStory().n0 > 0) {
            f0q0 f0q0Var = fwVar.c;
            c.U(fwVar.a.i0.getCurrentStory().n0 > 0 ? R.string.narrative_story_delete : R.string.story_multi_delete_confirm_message);
            c.c0(R.string.delete, new nv(fwVar, i));
            c.W(R.string.cancel_request, new o1c());
            f0q0Var.e(c.m(), null);
            return;
        }
        f0q0 f0q0Var2 = fwVar.c;
        c.g0(R.string.story_multi_delete_confirm_message_privacy_title);
        c.U(R.string.story_multi_delete_confirm_message_privacy_message);
        c.c0(R.string.delete, new lv(fwVar, i));
        c.W(R.string.story_multi_delete_confirm_message_privacy_action, new mv(fwVar, i));
        f0q0Var2.e(c.m(), null);
    }

    @Override // xsna.skm0.a
    public final void d() {
        this.E.b.b.b(true, null, null);
    }

    @Override // xsna.po6, xsna.qo6
    public final void destroy() {
        this.E.g.a();
    }

    @Override // xsna.po6, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        xjc xjcVar;
        q7r q7rVar = this.E.r.a;
        super.dispatchDraw(canvas);
        StoryEntry currentStory = q7rVar.i0.getCurrentStory();
        if (currentStory == null || !qxi.a().n() || (xjcVar = q7rVar.Q) == null) {
            return;
        }
        xjcVar.e(canvas, currentStory.X);
    }

    @Override // xsna.skm0.a
    public final void e() {
        fw fwVar = this.E.b;
        fwVar.a.i0.getDependencies().f.H(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER, fwVar.a.i0.getViewEntryPoint(), fwVar.a.i0.getCurrentStory(), fwVar.a.i0.P0());
        Window window = fwVar.a.i0.getWindow();
        if (window != null) {
            ikv0.a aVar = new ikv0.a(bwt0.u(fwVar.a.i0.getContext()));
            aVar.u = new ikv0.d(new ikv0.d.c(fwVar.a.i0.getContext().getString(R.string.story_actions_url_copied), 2), (ikv0.d.b) null, (ikv0.d.a) null);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null);
            aVar.o = Integer.valueOf(iah0.a(88));
            aVar.p(window);
        }
    }

    @Override // xsna.po6
    public final void e1(StoryViewAction storyViewAction) {
        f1(storyViewAction, null);
    }

    public void g() {
        q50 q50Var = this.E.h.c;
        if (q50Var != null) {
            q50Var.f(SourceTransitionStory.EXPIRED_TIME);
        }
    }

    @Override // xsna.po6
    public final void g1() {
        kl20 kl20Var = this.E.f;
        if (kl20Var.a.i0.getCurrentStory() != null) {
            kl20Var.a.j = System.currentTimeMillis() - kl20Var.a.i0.getStartTime();
        }
        if (kl20Var.a.i0.getCurrentStory() != null) {
            q7r q7rVar = kl20Var.a;
            if (q7rVar.h == q7rVar.i0.getCurrentStory().c) {
                q7r q7rVar2 = kl20Var.a;
                if (q7rVar2.k) {
                    return;
                }
                q7rVar2.k = true;
                anm0 anm0Var = q7rVar2.i0.getDependencies().f;
                q7r q7rVar3 = kl20Var.a;
                PreloadSource preloadSource = q7rVar3.l;
                if (preloadSource == null) {
                    PreloadSource.a aVar = PreloadSource.Companion;
                    MobileOfficialAppsConStoriesStat$ViewEntryPoint viewEntryPoint = q7rVar3.i0.getViewEntryPoint();
                    aVar.getClass();
                    switch (PreloadSource.a.C1832a.$EnumSwitchMapping$0[viewEntryPoint.ordinal()]) {
                        case 1:
                            preloadSource = PreloadSource.NEWS;
                            break;
                        case 2:
                            preloadSource = PreloadSource.LINK;
                            break;
                        case 3:
                            preloadSource = PreloadSource.PROFILE;
                            break;
                        case 4:
                            preloadSource = PreloadSource.REPLIES_LIST;
                            break;
                        case 5:
                            preloadSource = PreloadSource.REPLY_STORY;
                            break;
                        case 6:
                            preloadSource = PreloadSource.DISCOVER;
                            break;
                        case 7:
                            preloadSource = PreloadSource.NARRATIVE_SNIPPET;
                            break;
                        case 8:
                            preloadSource = PreloadSource.NARRATIVE_STORY;
                            break;
                        case 9:
                            preloadSource = PreloadSource.NARRATIVE_RECOMMENDATIONS;
                            break;
                        case 10:
                            preloadSource = PreloadSource.NARRATIVE_LINK;
                            break;
                        case 11:
                            preloadSource = PreloadSource.NARRATIVE_SECTION;
                            break;
                        case 12:
                            preloadSource = PreloadSource.FAVE;
                            break;
                        case 13:
                            preloadSource = PreloadSource.LIST_MIDDLE;
                            break;
                        case 14:
                            preloadSource = PreloadSource.ARCHIVE;
                            break;
                        case 15:
                            preloadSource = PreloadSource.IM_DIALOGS_LIST;
                            break;
                        case 16:
                            preloadSource = PreloadSource.IM_MSG_LIST;
                            break;
                        case 17:
                            preloadSource = PreloadSource.IM_DIALOG_HEADER;
                            break;
                        case 18:
                            preloadSource = PreloadSource.QUESTION_STORY;
                            break;
                        case 19:
                            preloadSource = PreloadSource.SEARCH_STORY_LIST;
                            break;
                        case 20:
                            preloadSource = PreloadSource.PLACE_STORY_LIST;
                            break;
                        case 21:
                            preloadSource = PreloadSource.PROFILE_SNACKBAR;
                            break;
                        case 22:
                            preloadSource = PreloadSource.POST_AVATAR;
                            break;
                        case 23:
                            preloadSource = PreloadSource.COMMENT_AVATAR;
                            break;
                        case 24:
                            preloadSource = PreloadSource.AVATAR;
                            break;
                        default:
                            preloadSource = PreloadSource.LINK;
                            break;
                    }
                }
                anm0Var.e(preloadSource, kl20Var.a.i0.getCurrentStory(), kl20Var.a.i);
            }
        }
    }

    public final View getAccessDeniedView() {
        return this.E.a.M;
    }

    @Override // xsna.uov
    public xkm0 getAnalyticsParams() {
        return this.E.f.a();
    }

    @Override // xsna.uov
    public iz8 getCadreSize() {
        return this.E.a.d0;
    }

    @Override // xsna.uov
    public elm0 getCallback() {
        return this.c;
    }

    @Override // xsna.uov
    public Bitmap getCurrentBitmap() {
        plm0 plm0Var = this.E;
        q7r q7rVar = plm0Var.a;
        q7r q7rVar2 = plm0Var.a;
        StoryEntry currentStory = q7rVar.i0.getCurrentStory();
        if (currentStory == null) {
            return null;
        }
        VKImageView vKImageView = q7rVar2.x;
        umm0 umm0Var = this.b;
        if (umm0Var != null && umm0Var.a() == 0) {
            return null;
        }
        if (currentStory.Sb()) {
            if (vKImageView == null) {
                return null;
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (vKImageView.isLaidOut()) {
                return hyt0.a(vKImageView);
            }
            return null;
        }
        if (!currentStory.Tb() && !"live_finished".equals(currentStory.e)) {
            return null;
        }
        xaj0 xaj0Var = q7rVar2.v;
        if (xaj0Var != null && xaj0Var.getCurrentPosition() == 0) {
            if (vKImageView == null) {
                return null;
            }
            WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
            if (vKImageView.isLaidOut()) {
                return hyt0.a(vKImageView);
            }
            return null;
        }
        xaj0 xaj0Var2 = q7rVar2.v;
        if (xaj0Var2 == null) {
            return null;
        }
        View[] d = awt0.d(xaj0Var2.a);
        ArrayList arrayList = new ArrayList();
        for (View view : d) {
            if (view instanceof TextureView) {
                arrayList.add(view);
            }
        }
        TextureView textureView = (TextureView) j5g.a0(arrayList);
        if (textureView != null) {
            return textureView.getBitmap();
        }
        return null;
    }

    @Override // xsna.po6
    public Dialog getCurrentDialog() {
        return super.getCurrentDialog();
    }

    @Override // xsna.po6, xsna.qo6
    public float getCurrentHeaderAvatarScale() {
        StoryAvatarView avatarView;
        StoryViewHeader storyViewHeader = this.E.q.a.P;
        if (storyViewHeader == null || (avatarView = storyViewHeader.getAvatarView()) == null) {
            return 1.0f;
        }
        return avatarView.getScaleX();
    }

    @Override // xsna.po6, xsna.qo6
    public StoryEntry getCurrentStory() {
        return this.m;
    }

    @Override // xsna.po6, xsna.qo6
    public long getCurrentTime() {
        umm0 umm0Var = this.E.a.i0.b;
        if (umm0Var == null) {
            return -1L;
        }
        o3e0 o3e0Var = umm0Var.c;
        if (o3e0Var != null) {
            return o3e0Var.a();
        }
        return 0L;
    }

    public final plm0 getDelegateProvider() {
        return this.E;
    }

    public final View getDeletedView() {
        return this.E.a.L;
    }

    @Override // xsna.po6, xsna.qo6
    public Long getDuration() {
        xaj0 xaj0Var;
        q7r q7rVar = this.E.a;
        mkm0 mkm0Var = q7rVar.i0;
        if (mkm0Var.getCurrentStory() == null) {
            return null;
        }
        if (mkm0Var.getCurrentStory().Tb() && (xaj0Var = q7rVar.v) != null) {
            return Long.valueOf(xaj0Var.getDuration());
        }
        if (mkm0Var.b.c != null) {
            return Long.valueOf(r0.c());
        }
        return null;
    }

    public final StoryViewHeader getHeaderView() {
        return this.E.a.P;
    }

    public final VKImageView getImagePreview() {
        return this.E.a.x;
    }

    @Override // xsna.po6, xsna.qo6
    public iz8 getSavedCadreSize() {
        return this.E.a.d0;
    }

    public final com.vk.story.api.a getStorySettings() {
        return this.E.a.p;
    }

    public final View getTopGradient() {
        return this.E.a.E;
    }

    @Override // xsna.po6
    public Long getVideoViewDuration() {
        return this.E.a.b();
    }

    @Override // xsna.po6, xsna.uov
    public MobileOfficialAppsConStoriesStat$ViewEntryPoint getViewEntryPoint() {
        return this.d;
    }

    @Override // xsna.skm0.a
    public final void h() {
        this.E.b.e(false);
    }

    @Override // xsna.skm0.a
    public final void i() {
        fw fwVar = this.E.b;
        fwVar.getClass();
        fwVar.a(StoryViewAction.CHANGE_PRIVACY_FROM_DOTS);
    }

    public final void i1(float f, int i) {
        AnimatorSet a;
        StoryViewHeader storyViewHeader;
        plm0 plm0Var = this.E;
        h1();
        X0(i);
        q7r q7rVar = plm0Var.a;
        mkm0 mkm0Var = q7rVar.i0;
        if (mkm0Var.getCurrentStory() != null && !(mkm0Var.getStoriesContainer() instanceof MyTargetAdStoriesContainer) && (storyViewHeader = q7rVar.P) != null) {
            storyViewHeader.setOwnerLayerClickListener(new eph(q7rVar, 16));
        }
        if (f == 1.0f || (a = plm0Var.q.a(f)) == null) {
            return;
        }
        a.setDuration(106L).start();
    }

    @Override // xsna.umm0.a
    public final void j() {
        mkm0 mkm0Var;
        StoryEntry currentStory;
        q7r q7rVar = this.E.h.b;
        if (q7rVar == null || (currentStory = (mkm0Var = q7rVar.i0).getCurrentStory()) == null || currentStory.i0) {
            return;
        }
        mkm0Var.Z0();
    }

    @Override // xsna.po6, xsna.qo6
    public final void j0(float f) {
        q7r q7rVar = this.E.b().a;
        if (q7rVar.i0.R0()) {
            float f2 = f != 1.0f ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
            q7rVar.a0.setAlpha((int) (255 * f2));
            StoryBottomViewGroup storyBottomViewGroup = q7rVar.G;
            if (storyBottomViewGroup != null) {
                storyBottomViewGroup.setAlpha(f2);
            }
            StoryUploadIndicatorView storyUploadIndicatorView = q7rVar.H;
            if (storyUploadIndicatorView != null) {
                storyUploadIndicatorView.setAlpha(f2);
            }
            View view = q7rVar.F;
            if (view != null) {
                view.setAlpha(f2);
            }
        }
    }

    public final void j1() {
        super.destroy();
    }

    @Override // xsna.skm0.a
    public final void k() {
        final fw fwVar = this.E.b;
        fwVar.b.d(fwVar.a.i0.getCurrentStory(), false, true, new zzs() { // from class: xsna.uv
            @Override // xsna.zzs
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                fw.this.a.G.B.m((StoryEntry) obj, false);
                return null;
            }
        });
    }

    public final void k1(SourceTransitionStory sourceTransitionStory) {
        super.V0(sourceTransitionStory);
    }

    @Override // xsna.skm0.a
    public final void l0() {
        this.E.b.c();
    }

    @Override // xsna.skm0.a
    public final void m() {
        String str;
        fw fwVar = this.E.b;
        StoryEntry currentStory = fwVar.a.i0.getCurrentStory();
        if (currentStory == null || (str = currentStory.u0) == null || str.isEmpty()) {
            return;
        }
        fvr.l(fwVar.a.i0.getContext(), currentStory.u0);
        fwVar.b();
    }

    @Override // xsna.qo6
    public final void m0(axl0 axl0Var) {
        ClickableStickers clickableStickers;
        StoryEntry currentStory = this.E.e.a.i0.getCurrentStory();
        if (currentStory == null || currentStory.c != axl0Var.a || (clickableStickers = currentStory.X) == null) {
            return;
        }
        List<ClickableSticker> list = clickableStickers.d;
        for (int i = 0; i < list.size(); i++) {
            ClickableSticker clickableSticker = list.get(i);
            if (clickableSticker instanceof ClickableApp) {
                ClickableApp clickableApp = (ClickableApp) clickableSticker;
                if (clickableApp.b == axl0Var.b) {
                    clickableApp.g = false;
                    ClickableStickers clickableStickers2 = currentStory.X;
                    if (clickableStickers2 != null) {
                        clickableStickers2.Ab();
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void m1(SourceTransitionStory sourceTransitionStory) {
        super.W0(sourceTransitionStory);
    }

    @Override // xsna.skm0.a
    public final void n() {
        final fw fwVar = this.E.b;
        StoryEntry currentStory = fwVar.a.i0.getCurrentStory();
        Objects.requireNonNull(currentStory);
        Narrative narrative = ((HighlightStoriesContainer) fwVar.a.i0.getStoriesContainer()).o;
        final com.vk.core.view.components.spinner.c e = qv20.e(fwVar.a.i0.getContext(), Integer.valueOf(R.string.highlight_changing_story_cover));
        e.setCancelable(false);
        io.reactivex.rxjava3.internal.operators.completable.p h = fwVar.a.i0.getDependencies().d.h(narrative.b, narrative.c, currentStory.c);
        wv wvVar = new wv(0, fwVar, e);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        fwVar.a.i0.a(new io.reactivex.rxjava3.internal.operators.completable.w(h, wvVar, lVar, kVar, kVar, kVar, kVar).subscribe(new xv(e, 0), new io.reactivex.rxjava3.functions.f() { // from class: xsna.yv
            @Override // io.reactivex.rxjava3.functions.f
            public final void accept(Object obj) {
                Context context = fw.this.a.i0.getContext();
                com.vk.core.view.components.spinner.c cVar = e;
                cmf0.d(context, cVar.getWindow(), j03.g(context, (Throwable) obj, R.string.error), false, iah0.a(88), true);
                qv20.b(cVar);
            }
        }));
    }

    @Override // xsna.umm0.a
    public final void n0() {
        eza0 eza0Var;
        n3e0 n3e0Var = this.E.h;
        q7r q7rVar = n3e0Var.b;
        if (q7rVar == null) {
            return;
        }
        if (q7rVar.o != null && (eza0Var = n3e0Var.d) != null) {
            eza0Var.b();
        }
        rlt0 rlt0Var = q7rVar.n;
        xaj0 xaj0Var = q7rVar.v;
        if (rlt0Var == null || xaj0Var == null) {
            return;
        }
        rlt0Var.j((int) (xaj0Var.getCurrentPosition() / 1000), 1.0f, xaj0Var.a.getVolume(), false, null, -1, 0);
    }

    public final void n1() {
        super.pause();
    }

    @Override // xsna.skm0.a
    public final void o0() {
        fw fwVar = this.E.b;
        fwVar.a.i0.postDelayed(new vv(fwVar, fwVar.a.i0.getCurrentIndex(), 0), 50L);
    }

    public final void o1() {
        super.play();
    }

    @Override // xsna.po6, android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onAttachedToWindow() {
        umm0 umm0Var;
        q7r q7rVar = this.E.r.a;
        vrl0 a = q7rVar.a();
        mkm0 mkm0Var = q7rVar.j0;
        mkm0 mkm0Var2 = q7rVar.i0;
        if (a != null) {
            a.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_ATTACH_TO_WINDOW_STORY_VIEW, mkm0Var2.getCurrentStory(), mkm0Var2.f, q7rVar.b());
        }
        super.onAttachedToWindow();
        if (mkm0Var2.f) {
            return;
        }
        if (!q7rVar.n0 && (umm0Var = mkm0Var2.b) != null) {
            umm0Var.i.postDelayed(new qb3(umm0Var, 15), 500L);
        }
        int i = ify.a;
        ify.a(mkm0Var);
    }

    @Override // xsna.po6, android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        p5z p5zVar = this.E.r;
        q7r q7rVar = p5zVar.a;
        super.onDetachedFromWindow();
        StoryEntry currentStory = q7rVar.i0.getCurrentStory();
        if (currentStory == null || !currentStory.Nb()) {
            return;
        }
        p5zVar.f.a();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ww50 v;
        p5z p5zVar = this.E.r;
        p5zVar.getClass();
        L.A("StoryView", "onDismiss (dialog)");
        q7r q7rVar = p5zVar.a;
        mkm0 mkm0Var = q7rVar.i0;
        elm0 elm0Var = mkm0Var.c;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        if ((dialogInterface instanceof tcm0) && elm0Var != null && currentStory != null) {
            mkm0Var.postDelayed(new nq4(elm0Var, 6), 200L);
            int i = currentStory.c;
            Object text = ((tcm0) dialogInterface).d.getText();
            if (text == null) {
                text = "";
            }
            elm0Var.s(i, text.toString());
        }
        if ((dialogInterface instanceof fcn) && (v = s200.v(mkm0Var.getContext())) != null) {
            v.H((fcn) dialogInterface);
        }
        if (mkm0Var.getCurrentDialog() != dialogInterface) {
            if (mkm0Var.getNotBlockingDialog() == dialogInterface) {
                mkm0Var.setNotBlockingDialog(null);
                return;
            }
            return;
        }
        fmm0 fmm0Var = q7rVar.R;
        if (fmm0Var != null) {
            fmm0Var.onDismiss(mkm0Var.getCurrentDialog());
        }
        gmm0 gmm0Var = q7rVar.S;
        if (gmm0Var != null) {
            mkm0Var.getCurrentDialog();
            gmm0Var.e = false;
        }
        mkm0Var.setCurrentDialog(null);
        p5zVar.f.c();
        if (mkm0Var.f || !mkm0Var.R0() || currentStory == null) {
            return;
        }
        p5zVar.d.h(currentStory, mkm0Var.getViewEntryPoint());
    }

    @Override // xsna.po6, xsna.qo6
    public final void onPause() {
        String str;
        p5z p5zVar = this.E.r;
        q7r q7rVar = p5zVar.a;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0Var.getDependencies().s.h = false;
        q7rVar.j0.x = true;
        boolean z = mkm0Var.f;
        boolean z2 = mkm0Var.n;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        xaj0 xaj0Var = q7rVar.v;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.LogType logType = L.LogType.v;
            StringBuilder c = gp.c("onPause isStub = ", ", isDestroyed = ", ", videoUniqueIndex = ", z, z2);
            c.append(p5zVar.hashCode());
            c.append(", storyId = ");
            if (currentStory == null || (str = currentStory.Yb()) == null) {
                str = "0";
            }
            c.append(str);
            L.u(l, logType, new Object[]{"StoryView", c.toString()});
        }
        if (z || z2) {
            return;
        }
        if (xaj0Var != null) {
            q7rVar.q = xaj0Var.getCurrentPosition();
            xaj0Var.e(false);
        }
        mkm0Var.d1();
        if (!mkm0Var.R0() || currentStory == null) {
            return;
        }
        mkm0Var.getDependencies().e.f(currentStory, mkm0Var.getViewEntryPoint());
    }

    @Override // xsna.po6, xsna.qo6
    public final void onResume() {
        fmm0 fmm0Var;
        gmm0 gmm0Var;
        p5z p5zVar = this.E.r;
        q7r q7rVar = p5zVar.a;
        mkm0 mkm0Var = q7rVar.i0;
        mkm0 mkm0Var2 = q7rVar.j0;
        q7m0 q7m0Var = mkm0Var.getDependencies().s;
        q7m0Var.h = true;
        wt30 wt30Var = q7m0Var.f;
        if (wt30Var != null) {
            wt30Var.invoke();
        }
        mkm0Var2.x = false;
        xaj0 xaj0Var = q7rVar.v;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        vrl0 a = q7rVar.a();
        if (a != null) {
            a.b(MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventTypeAndroid.ON_RESUME_STORY_VIEW, currentStory, mkm0Var.f, q7rVar.b());
        }
        Dialog currentDialog = mkm0Var.getCurrentDialog();
        tcm0 tcm0Var = currentDialog instanceof tcm0 ? (tcm0) currentDialog : null;
        if (tcm0Var != null) {
            mhy.j(tcm0Var.d);
        }
        if (mkm0Var.f || mkm0Var.n || currentStory == null || !mkm0Var.R0()) {
            return;
        }
        if (currentStory.Ob()) {
            iq50 iq50Var = q7rVar.u0;
            if (iq50Var.g) {
                iq50Var.g = false;
                iq50Var.a.i0.d1();
                iq50Var.f = true;
                iq50Var.a();
            }
        }
        if (currentStory.Tb()) {
            if (mkm0Var2.u || q7rVar.q == 0 || xaj0Var == null || xaj0Var.getCurrentPosition() != q7rVar.q) {
                p5zVar.b.f(currentStory, mkm0Var.getStoriesContainer().g, true, false);
            } else if (mkm0Var.getCurrentDialog() == null) {
                xaj0Var.e(true);
            }
        }
        if (mkm0Var.getCurrentDialog() == null && !mkm0Var2.u && ((fmm0Var = q7rVar.R) == null || (!fmm0Var.j) || (gmm0Var = q7rVar.S) == null || (!gmm0Var.e))) {
            if (xaj0Var != null) {
                xaj0Var.e(currentStory.n != null);
            }
            mkm0Var.c1(true);
        }
        p5zVar.d.h(currentStory, mkm0Var.getViewEntryPoint());
    }

    @Override // xsna.qo6
    public final void onTouch(MotionEvent motionEvent) {
        long j;
        rot rotVar = this.E.d;
        rotVar.b.c();
        q7r q7rVar = rotVar.a;
        if (q7rVar.o != null && q7rVar.i0.getCurrentStory() != null && rotVar.a.i0.getCurrentStory().n != null) {
            q7r q7rVar2 = rotVar.a;
            if (q7rVar2.v != null && q7rVar2.o.getProgressView().getWidth() > 0) {
                q7r q7rVar3 = rotVar.a;
                if (q7rVar3.u == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    q7rVar3.u = motionEvent.getX();
                }
                long currentPosition = (long) (r1.v.getCurrentPosition() + ((motionEvent.getX() - rotVar.a.u) * (rotVar.a.v.getDuration() / rotVar.a.o.getProgressView().getWidth()) * 2.0f));
                if (currentPosition < 0) {
                    j = 0;
                } else {
                    if (currentPosition > rotVar.a.v.getDuration()) {
                        currentPosition = rotVar.a.v.getDuration();
                    }
                    j = currentPosition;
                }
                q7r q7rVar4 = rotVar.a;
                q7rVar4.o.a(j, q7rVar4.v.getCurrentPosition(), rotVar.a.v.getDuration());
                return;
            }
        }
        rotVar.a.u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.skm0.a
    public final void p0() {
        fw fwVar = this.E.b;
        if (fwVar.a.i0.getCurrentStory() == null || fwVar.a.i0.getCurrentStory().t0 == null || fwVar.a.i0.getCurrentStory().t0.isEmpty()) {
            return;
        }
        xwk.d().e().l(fwVar.a.i0.getContext(), fwVar.a.i0.getCurrentStory().t0, LaunchContext.A, null, null);
        fwVar.c();
    }

    @Override // xsna.po6, xsna.qo6
    public final void pause() {
        this.E.g.b();
    }

    @Override // xsna.po6, xsna.qo6
    public final void play() {
        mbx mbxVar;
        plm0 plm0Var = this.E;
        plm0Var.g.c();
        zbx zbxVar = plm0Var.a.l0;
        if (zbxVar == null || (mbxVar = zbxVar.d) == null) {
            return;
        }
        mbxVar.e = false;
        ((FrameLayout) mbxVar.g.getValue()).setVisibility(4);
        mhy.d(mbxVar.a().h);
        mbxVar.a.v0(true, (r3 & 2) != 0, false);
    }

    @Override // xsna.skm0.a
    public final void q() {
        final fw fwVar = this.E.b;
        final int currentIndex = fwVar.a.i0.getCurrentIndex();
        StoryEntry currentStory = fwVar.a.i0.getCurrentStory();
        Objects.requireNonNull(currentStory);
        Narrative narrative = ((HighlightStoriesContainer) fwVar.a.i0.getStoriesContainer()).o;
        final com.vk.core.view.components.spinner.c e = qv20.e(fwVar.a.i0.getContext(), Integer.valueOf(R.string.highlight_deleting_story_from_highlight));
        e.setCancelable(false);
        io.reactivex.rxjava3.internal.operators.completable.p f = fwVar.a.i0.getDependencies().d.f(currentStory.c, narrative.c, narrative.b);
        pv pvVar = new pv(0, fwVar, e);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        fwVar.a.i0.a(new io.reactivex.rxjava3.internal.operators.completable.w(f, pvVar, lVar, kVar, kVar, kVar, kVar).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.qv
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                fw.this.e.c(currentIndex);
                qv20.b(e);
            }
        }, new rv(0, fwVar, e)));
    }

    @Override // xsna.skm0.a
    public final void q0() {
        this.E.b.b();
    }

    @Override // xsna.qo6
    public final boolean r0() {
        zbx zbxVar = this.E.a.l0;
        if (zbxVar == null) {
            return false;
        }
        mbx mbxVar = zbxVar.d;
        if (mbxVar == null) {
            return true;
        }
        boolean z = mbxVar.e;
        boolean z2 = !z;
        if (z) {
            mbxVar.b();
        }
        return z2;
    }

    @Override // xsna.skm0.a
    public final void s() {
        fw fwVar = this.E.b;
        if (fwVar.a.i0.getCurrentStory() == null) {
            return;
        }
        fwVar.a.i0.f1(StoryViewAction.HIDE_FROM_STORIES, null);
        hg1.l(fwVar.a.i0.getDependencies().a.n(fwVar.a.i0.getCurrentStory().d, fwVar.a.i0.getStoriesContainer(), fwVar.a.i0.getCurrentStory().u), fwVar.a.i0.getContext(), 62).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new kv(fwVar, 0), new v8(fwVar, 1));
    }

    @Override // xsna.uov
    public void setActionInProgress(boolean z) {
        this.u = z;
    }

    @Override // xsna.po6, xsna.qo6
    public void setAudioMuted(boolean z) {
        this.E.n.e(z);
    }

    @Override // xsna.uov
    public void setBottomVisible(boolean z) {
        StoryBottomViewGroup storyBottomViewGroup = this.E.b().a.G;
        if (storyBottomViewGroup != null) {
            storyBottomViewGroup.setVisibility(z ? 0 : 4);
        }
    }

    @Override // xsna.po6, xsna.umm0.a
    public void setCurrentStorySeekMs(long j) {
        q7r q7rVar = this.E.h.b;
        if (q7rVar != null) {
            q7rVar.q = j;
        }
    }

    @Override // xsna.po6, xsna.qo6
    public void setEncodingDone(zjm0 zjm0Var) {
        String str = zjm0Var.d;
        StoryEntry currentStory = getCurrentStory();
        plm0 plm0Var = this.E;
        if (currentStory != null && zjm0Var.f != null && epx.f(str, "video")) {
            currentStory.y = zjm0Var.f;
            currentStory.e = str;
            currentStory.B0 = zjm0Var.k.G;
            plm0Var.b().d(currentStory);
        }
        wcq0 wcq0Var = plm0Var.m;
        StoryEntry currentStory2 = wcq0Var.a.i0.getCurrentStory();
        if (currentStory2 != null) {
            int i = currentStory2.c;
            int i2 = zjm0Var.a;
            if (i == i2) {
                q7r q7rVar = wcq0Var.a;
                if (q7rVar.g0 && q7rVar.f0 == i2) {
                    File file = zjm0Var.f;
                    currentStory2.y = file;
                    VideoFileOld videoFileOld = new VideoFileOld();
                    HashMap hashMap = new HashMap();
                    VideoUrl videoUrl = VideoUrl.URL_240;
                    String absolutePath = file.getAbsolutePath();
                    if (absolutePath != null) {
                        if (!myc0.f(absolutePath)) {
                            absolutePath = null;
                        }
                        if (absolutePath != null) {
                            VideoUrlStorage.b bVar = VideoUrlStorage.c;
                            VideoUrlStorage.d.b(hashMap, videoUrl, absolutePath);
                        }
                    }
                    videoFileOld.f = new VideoUrlStorage(hashMap);
                    videoFileOld.Q0 = false;
                    videoFileOld.R = false;
                    videoFileOld.z = true;
                    videoFileOld.j0 = false;
                    videoFileOld.O = true;
                    currentStory2.n = videoFileOld;
                    q50 q50Var = wcq0Var.b;
                    int currentIndex = wcq0Var.a.i0.getCurrentIndex();
                    q50Var.getClass();
                    q50.i(q50Var, currentIndex, 6);
                }
            }
        }
        if (currentStory2 != null) {
            if (zjm0Var.d(currentStory2.c, currentStory2.d)) {
                currentStory2.z++;
                wcq0Var.c.g();
            }
        }
    }

    @Override // xsna.po6
    public void setErrorVisible(boolean z) {
        View view = this.E.b().a.r;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.po6
    public void setLoadingProgressVisible(boolean z) {
        ProgressBar progressBar = this.E.b().a.s;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 8);
        }
    }

    @Override // xsna.po6, xsna.qo6
    public void setPreloadSource(PreloadSource preloadSource) {
        this.E.a.l = preloadSource;
    }

    @Override // xsna.po6, xsna.qo6
    public void setUploadDone(zjm0 zjm0Var) {
        StoryEntry storyEntry;
        wcq0 wcq0Var = this.E.m;
        StoryEntry currentStory = wcq0Var.a.i0.getCurrentStory();
        if (currentStory != null) {
            q7r q7rVar = wcq0Var.a;
            if (q7rVar.g0 && q7rVar.f0 == zjm0Var.a && (storyEntry = zjm0Var.g) != null) {
                currentStory.y = zjm0Var.f;
                currentStory.Xb(storyEntry);
                q50 q50Var = wcq0Var.b;
                int currentIndex = wcq0Var.a.i0.getCurrentIndex();
                q50Var.getClass();
                q50.i(q50Var, currentIndex, 4);
            }
        }
        if (currentStory != null) {
            if (zjm0Var.d(currentStory.c, currentStory.d)) {
                currentStory.z++;
                wcq0Var.c.g();
            }
        }
    }

    @Override // xsna.po6, xsna.qo6
    public void setUploadFailed(zjm0 zjm0Var) {
        wcq0 wcq0Var = this.E.m;
        StoryEntry currentStory = wcq0Var.a.i0.getCurrentStory();
        if (currentStory != null && currentStory.b && currentStory.c == zjm0Var.a) {
            q50 q50Var = wcq0Var.b;
            int currentIndex = wcq0Var.a.i0.getCurrentIndex();
            q50Var.getClass();
            q50.i(q50Var, currentIndex, 6);
        }
    }

    @Override // xsna.po6, xsna.qo6
    public void setUploadProgress(zjm0 zjm0Var) {
        gkm0 gkm0Var;
        wcq0 wcq0Var = this.E.m;
        StoryEntry currentStory = wcq0Var.a.i0.getCurrentStory();
        if (currentStory == null || !currentStory.b || currentStory.c != zjm0Var.a || (gkm0Var = wcq0Var.a.K) == null) {
            return;
        }
        gkm0Var.setProgress(zjm0Var.h);
    }

    @Override // xsna.uov
    public final void tj() {
        this.E.f.c();
    }

    @Override // xsna.skm0.a
    public final void u() {
        fw fwVar = this.E.b;
        StoryEntry currentStory = fwVar.a.i0.getCurrentStory();
        if (currentStory == null) {
            return;
        }
        if (currentStory.E0 != null) {
            b6m.a().i(fwVar.a.i0.getContext(), currentStory.E0.e, currentStory.u);
        } else if (currentStory.m0 != null) {
            b6m.a().e(fwVar.a.i0.getContext(), "ad", currentStory.c, currentStory.d, "story", currentStory.u);
        } else {
            b6m.a().e(fwVar.a.i0.getContext(), "story", currentStory.c, currentStory.d, "story", null);
        }
        fwVar.a.i0.f1(StoryViewAction.CLAIM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8 A[SYNTHETIC] */
    @Override // xsna.umm0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        StoryEntry currentStory;
        String str;
        io.reactivex.rxjava3.core.a aVar;
        AudienceResearchSurfaceCode audienceResearchSurfaceCode;
        List<ClickableSticker> list;
        Narrative narrative;
        n3e0 n3e0Var = this.E.h;
        q7r q7rVar = n3e0Var.b;
        if (q7rVar == null || (currentStory = q7rVar.i0.getCurrentStory()) == null) {
            return;
        }
        smm0 smm0Var = q7rVar.i0.getDependencies().t;
        String id = currentStory.getId();
        StoryEntry b = smm0Var.a.b();
        if (epx.f(id, b != null ? b.getId() : null)) {
            smm0Var.h = true;
            smm0Var.d.dispose();
            smm0Var.d = new io.reactivex.rxjava3.internal.operators.observable.s0(new pkb(smm0Var, 1)).L(new tuz(new mmm0(smm0Var, 0), 14), false).u(new ie40(new arb0(smm0Var, 22), 14)).q(asu0.a.c()).subscribe(new pmm0(), new o7y(new z7w(23), 20));
        }
        vrl0 a = q7rVar.a();
        if (a != null && !q7rVar.i0.getDependencies().s.i) {
            a.p(q7rVar.i0.getCurrentStory(), null, q7rVar.i0.f, q7rVar.b(), null);
        }
        if (!currentStory.i0) {
            q7rVar.i0.Z0();
        }
        q7rVar.i0.Q0();
        elm0 elm0Var = q7rVar.i0.c;
        if (elm0Var == null || (str = elm0Var.getRef()) == null) {
            str = "unknown";
        }
        String str2 = str;
        StoriesContainer storiesContainer = q7rVar.i0.getStoriesContainer();
        HighlightStoriesContainer highlightStoriesContainer = storiesContainer instanceof HighlightStoriesContainer ? (HighlightStoriesContainer) storiesContainer : null;
        Integer valueOf = (highlightStoriesContainer == null || (narrative = highlightStoriesContainer.o) == null) ? null : Integer.valueOf(narrative.b);
        elm0 elm0Var2 = q7rVar.i0.c;
        if (elm0Var2 != null && !elm0Var2.f()) {
            q7rVar.i0.getDependencies().f.z(q7rVar.i0.getViewEntryPoint(), currentStory, q7rVar.i0.P0(), str2, q7rVar.j, valueOf, q7rVar.i0.getCurrentIndex());
            elm0 elm0Var3 = q7rVar.i0.c;
            if (elm0Var3 != null) {
                elm0Var3.m();
            }
        }
        q7rVar.i0.getDependencies().f.y(q7rVar.i0.getViewEntryPoint(), currentStory, q7rVar.i0.P0(), str2, q7rVar.j, valueOf, q7rVar.i0.getCurrentIndex());
        StoriesMediascopeResearchDto storiesMediascopeResearchDto = currentStory.F0;
        if (storiesMediascopeResearchDto != null) {
            List<String> e = storiesMediascopeResearchDto.e();
            if (e != null) {
                ClickableStickers clickableStickers = currentStory.X;
                if (clickableStickers != null && (list = clickableStickers.d) != null) {
                    List<ClickableSticker> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (((ClickableSticker) it.next()) instanceof ClickablePost) {
                                audienceResearchSurfaceCode = AudienceResearchSurfaceCode.STORY_STICKER_POST;
                                break;
                            }
                        }
                    }
                }
                audienceResearchSurfaceCode = AudienceResearchSurfaceCode.OTHER;
                io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new y94(e, q7rVar.i0.getDependencies().y.Z2(), audienceResearchSurfaceCode, 0)), new ao90(new iyd0(q7rVar, 2), 2));
                asu0.a.getClass();
                q7rVar.i0.a(sVar.q(asu0.i()).subscribe());
            }
            List<StoriesMediascopeResearchEventDto> d = storiesMediascopeResearchDto.d();
            if (d != null) {
                ia4 b2 = q7rVar.i0.getDependencies().y.b();
                ArrayList arrayList = new ArrayList();
                for (StoriesMediascopeResearchEventDto storiesMediascopeResearchEventDto : d) {
                    if (storiesMediascopeResearchEventDto.e() != null) {
                        UserId userId = new UserId(r6.intValue());
                        String d2 = storiesMediascopeResearchEventDto.d();
                        if (d2 != null) {
                            aVar = b2.c(userId, d2);
                            if (aVar == null) {
                                arrayList.add(aVar);
                            }
                        }
                    }
                    aVar = null;
                    if (aVar == null) {
                    }
                }
                io.reactivex.rxjava3.internal.operators.completable.d dVar = new io.reactivex.rxjava3.internal.operators.completable.d(arrayList);
                asu0.a.getClass();
                io.reactivex.rxjava3.disposables.c subscribe = dVar.q(asu0.i()).subscribe();
                if (subscribe != null) {
                    q7rVar.i0.A.b(subscribe);
                }
            }
        }
        fmm0 fmm0Var = q7rVar.R;
        if (fmm0Var != null) {
            fmm0Var.k = true;
        }
        gmm0 gmm0Var = q7rVar.S;
        if (gmm0Var != null) {
            gmm0Var.f = true;
        }
        if (n3e0Var.a) {
            n3e0Var.a = false;
            q7rVar.j0.y0();
        }
    }

    @Override // xsna.qo6
    public final void v0(boolean z, boolean z2, boolean z3) {
        List<View> allViewsExcludeAnimation;
        q7r q7rVar = this.E.b().a;
        if (q7rVar.i0.R0()) {
            AnimatorSet animatorSet = q7rVar.m;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            StoryViewHeader storyViewHeader = q7rVar.P;
            if (!epx.d(storyViewHeader != null ? Float.valueOf(storyViewHeader.getAlpha()) : null, 1.0f)) {
                q7rVar.i0.f1(StoryViewAction.RESUME_RELEASE, null);
            }
            ListBuilder e = e43.e();
            e.add(q7rVar.P);
            if (z3) {
                StoryBottomViewGroup storyBottomViewGroup = q7rVar.G;
                if (storyBottomViewGroup != null && (allViewsExcludeAnimation = storyBottomViewGroup.getAllViewsExcludeAnimation()) != null) {
                    Iterator<T> it = allViewsExcludeAnimation.iterator();
                    while (it.hasNext()) {
                        e.add((View) it.next());
                    }
                }
            } else {
                e.add(q7rVar.G);
            }
            StoryUploadIndicatorView storyUploadIndicatorView = q7rVar.H;
            if (storyUploadIndicatorView != null) {
                e.add(storyUploadIndicatorView);
            }
            View[] viewArr = (View[]) e.g().toArray(new View[0]);
            int i = (!z2 || z) ? 0 : 500;
            View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
            int[] iArr = u1u0.a;
            AnimatorSet animatorSet2 = new AnimatorSet();
            float f = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            ArrayList arrayList = new ArrayList();
            for (View view : viewArr2) {
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f).setDuration(200));
                view.setClickable(z);
            }
            animatorSet2.setStartDelay(i);
            animatorSet2.playTogether(arrayList);
            animatorSet2.start();
            q7rVar.m = animatorSet2;
        }
    }

    @Override // xsna.skm0.a
    public final void w() {
        fw fwVar = this.E.b;
        fwVar.getClass();
        int i = h7u0.p;
        h7u0.a c = h7u0.b.c(bwt0.u(fwVar.a.i0.getContext()));
        c.g0(R.string.stories_hide_discover_confirmation_title);
        c.U(R.string.stories_hide_discover_confirmation_message);
        c.c0(R.string.stories_discover_hide, new tv(fwVar, 0));
        c.W(R.string.cancel, null);
        fwVar.c.e(c.m(), null);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        q7r q7rVar = this.E.b().a;
        if (q7rVar.W != null) {
            q7rVar.P.getHeight();
        }
    }

    @Override // xsna.umm0.a
    public final void y() {
        xaj0 xaj0Var;
        q7r q7rVar = this.E.h.b;
        if (q7rVar == null) {
            return;
        }
        mkm0 mkm0Var = q7rVar.i0;
        StoryEntry currentStory = mkm0Var.getCurrentStory();
        elm0 elm0Var = mkm0Var.c;
        if (currentStory == null || (xaj0Var = q7rVar.v) == null) {
            return;
        }
        if (q7rVar.q == 0 && xaj0Var.getCurrentPosition() == 0) {
            if (currentStory.Ub() && elm0Var != null) {
                elm0Var.b();
            }
        } else if (elm0Var != null) {
            elm0Var.l();
        }
        xaj0 xaj0Var2 = q7rVar.v;
        if (xaj0Var2 != null) {
            xaj0Var2.e(mkm0Var.R0() && currentStory.n != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r3.m(r1.a) != false) goto L16;
     */
    @Override // xsna.qo6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0() {
        emm0.a aVar;
        StoryViewHeader storyViewHeader;
        View menuView;
        StoryEntry storyEntry = this.m;
        if (storyEntry != null) {
            s7v s7vVar = this.E.s;
            h7v h7vVar = s7vVar.a;
            q7r q7rVar = s7vVar.b;
            mkm0 mkm0Var = q7rVar.i0;
            if (mkm0Var.getDependencies().x.a(storyEntry.d) && storyEntry.y0 && !mkm0Var.getStoriesContainer().j && !(mkm0Var.getStoriesContainer() instanceof HighlightStoriesContainer)) {
                aVar = emm0.a.b;
            }
            aVar = null;
            if (aVar == null || (storyViewHeader = q7rVar.P) == null || (menuView = storyViewHeader.getMenuView()) == null) {
                return;
            }
            String string = menuView.getContext().getString(R.string.story_remove_hint_only_me);
            HintId hintId = aVar.a;
            if (h7vVar.p(hintId.getId()) == null) {
                return;
            }
            m8v0.a.a(menuView, string, null, VkTooltip$MarkerStyle.Style1, VkTooltip$MarkerSize.Size64, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Left, new d10(menuView, 1), new ekh(menuView, 7), null, null, new eqq(s7vVar, 7), new t9e(s7vVar, 26), null, 0, false, null, null, false, null, false, 16763940);
            h7vVar.b(hintId.getId());
        }
    }

    @Override // xsna.qo6
    public final void z() {
        StoryEntry currentStory;
        om3 om3Var = this.E.n;
        mkm0 mkm0Var = ((q7r) om3Var.b).i0;
        if (mkm0Var.f || !mkm0Var.R0() || (currentStory = mkm0Var.getCurrentStory()) == null || !currentStory.Tb()) {
            return;
        }
        om3Var.e(false);
        q7r.A0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.lkm0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mkm0(Context context, View.OnTouchListener onTouchListener, StoriesContainer storiesContainer, elm0 elm0Var, com.vk.story.api.a aVar, zb80 zb80Var, qlm0 qlm0Var, WeakReference weakReference, final float f, boolean z, boolean z2) {
        super(context, storiesContainer, elm0Var, onTouchListener, aVar, qlm0Var, weakReference);
        final int Kb;
        q7m0 q7m0Var;
        StoryEntry storyEntry;
        vu50 Ic = ((NarrativeComponent) ((k7m) m7m.f(this)).a(fpf0.a(NarrativeComponent.class))).Ic();
        this.F = Ic;
        plm0 plm0Var = new plm0(aVar, zb80Var, this, this, this, weakReference, Ic, qlm0Var.v, z, z2);
        this.E = plm0Var;
        Integer num = aVar.h;
        if (num == null) {
            num = elm0Var != null ? Integer.valueOf(elm0Var.c(this.h)) : null;
            if (num == null) {
                Kb = this.h.Kb();
                q7m0Var = qlm0Var.s;
                q7m0Var.h = false;
                storyEntry = (StoryEntry) j5g.b0(Kb, storiesContainer.g);
                if (q7m0Var.c == null && epx.f(storiesContainer.Ob(), q7m0Var.a) && storyEntry != null) {
                    q7m0Var.c = storyEntry;
                    q7m0Var.g = storiesContainer;
                }
                q7r q7rVar = plm0Var.a;
                if (!z) {
                    q7rVar.c(new izs() { // from class: xsna.lkm0
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            mkm0.this.i1(f, Kb);
                            return s3q0.a;
                        }
                    });
                    return;
                } else {
                    q7rVar.c(null);
                    i1(f, Kb);
                    return;
                }
            }
        }
        Kb = num.intValue();
        q7m0Var = qlm0Var.s;
        q7m0Var.h = false;
        storyEntry = (StoryEntry) j5g.b0(Kb, storiesContainer.g);
        if (q7m0Var.c == null) {
            q7m0Var.c = storyEntry;
            q7m0Var.g = storiesContainer;
        }
        q7r q7rVar2 = plm0Var.a;
        if (!z) {
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
    }

    @Override // xsna.uov
    public ViewGroup getView() {
        return this;
    }

    public void h1() {
    }

    @Override // xsna.y5p0
    public final void r() {
    }

    @Override // xsna.y5p0
    public final void s0() {
    }
}
