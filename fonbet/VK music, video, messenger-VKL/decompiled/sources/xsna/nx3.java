package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.util.LruCache;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.ironsource.Ya;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.enterphone.EnterPhonePresenterInfo;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.auth.ui.VkAuthPhoneView.a;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.internal.VkBottomSheetBehavior;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.feed.design.view.posting.preview.image.attach.PostingPreviewImage;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.AdsPixel;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vk.stories.StoriesVideoEncoder;
import com.vk.voip.ui.view.VoipActionVerticalButtonView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptySet;
import one.video.controls.views.seek.VideoSeekViewOld;
import org.chromium.base.task.TaskRunnerImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nx3 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nx3(AdsAudioPixelsContainer adsAudioPixelsContainer, fs4 fs4Var) {
        this.b = 1;
        this.c = adsAudioPixelsContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdsPixel.Completed poll;
        int b;
        String str;
        int i = 1;
        switch (this.b) {
            case 0:
                ((rx3) this.c).b.clear();
                return;
            case 1:
                AdsAudioPixelsContainer adsAudioPixelsContainer = (AdsAudioPixelsContainer) this.c;
                while (!adsAudioPixelsContainer.d.isEmpty() && (poll = adsAudioPixelsContainer.d.poll()) != null) {
                    fs4.d(poll, true);
                }
                return;
            case 2:
                bds.d(4, (ArrayList) this.c);
                return;
            case 3:
                dpp dppVar = (dpp) this.c;
                EnterPhonePresenterInfo enterPhonePresenterInfo = dppVar.y;
                if (enterPhonePresenterInfo == null) {
                    enterPhonePresenterInfo = null;
                }
                if (enterPhonePresenterInfo instanceof EnterPhonePresenterInfo.SignUp) {
                    VkAuthPhoneView vkAuthPhoneView = dppVar.t;
                    if (vkAuthPhoneView == null) {
                        vkAuthPhoneView = null;
                    }
                    vkAuthPhoneView.f.addTextChangedListener(vkAuthPhoneView.new a(dppVar.z));
                }
                VkAuthPhoneView vkAuthPhoneView2 = dppVar.t;
                VkAuthPhoneView vkAuthPhoneView3 = vkAuthPhoneView2 != null ? vkAuthPhoneView2 : null;
                vkAuthPhoneView3.f.addTextChangedListener(vkAuthPhoneView3.new a(dppVar.B));
                return;
            case 4:
                com.vk.clips.viewer.impl.routing.transition.b bVar = (com.vk.clips.viewer.impl.routing.transition.b) this.c;
                yg5 yg5Var = bmp0.a;
                bmp0.a(null);
                com.vk.clips.viewer.impl.routing.transition.a Uh = bVar.c.Uh();
                if (Uh != null) {
                    io2 io2Var = Uh.a.a;
                    if (!io2Var.M() && yg5Var != null) {
                        yg5Var.pause();
                    }
                    io2Var.C();
                    return;
                }
                return;
            case 5:
                ObjectAnimator objectAnimator = (ObjectAnimator) this.c;
                int i2 = avr.j;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                    return;
                }
                return;
            case 6:
                HighlightEditFragment highlightEditFragment = (HighlightEditFragment) this.c;
                int i3 = HighlightEditFragment.h0;
                VkTabs vkTabs = highlightEditFragment.X;
                if (vkTabs == null) {
                    vkTabs = null;
                }
                vkTabs.f(0).a.setEnabled(true);
                ViewPager2 viewPager2 = highlightEditFragment.Y;
                (viewPager2 != null ? viewPager2 : null).setUserInputEnabled(true);
                return;
            case 7:
                a1a0 a1a0Var = ((n3w) this.c).k;
                bpn0 bpn0Var = a1a0Var.c;
                if (bpn0Var.isInitialized()) {
                    com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                    el3 el3Var = Event.b;
                    Event.a b2 = h5s.b("SettingsStorageManagerImpl.release");
                    b2.c("dbSettingsFileName", a1a0Var.b);
                    bVar2.k(b2.e());
                    ((e0w) bpn0Var.getValue()).close();
                    return;
                }
                return;
            case 8:
                ykw ykwVar = (ykw) this.c;
                PostingPreviewImage postingPreviewImage = ykwVar.n;
                k6k k6kVar = new k6k(ykwVar, 22);
                FrameLayout frameLayout = postingPreviewImage.v;
                View view = postingPreviewImage.u;
                PostingPreviewImage.Badge badge = postingPreviewImage.y;
                if (badge != null) {
                    if (badge instanceof PostingPreviewImage.Badge.b) {
                        int i4 = com.vk.feed.design.view.posting.preview.image.attach.a.$EnumSwitchMapping$0[((PostingPreviewImage.Badge.b) badge).b.ordinal()];
                        if (i4 == 1) {
                            b = cn70.b(36);
                        } else {
                            if (i4 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b = cn70.b(40);
                        }
                    } else {
                        if (!(badge instanceof PostingPreviewImage.Badge.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i5 = com.vk.feed.design.view.posting.preview.image.attach.a.$EnumSwitchMapping$0[((PostingPreviewImage.Badge.a) badge).c.ordinal()];
                        if (i5 == 1) {
                            b = cn70.b(36);
                        } else {
                            if (i5 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            b = cn70.b(40);
                        }
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ConstraintLayout.b bVar3 = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                    if (bVar3 != null) {
                        bVar3.v = -1;
                    }
                    if (bVar3 != null) {
                        ((ViewGroup.MarginLayoutParams) bVar3).width = frameLayout.getMeasuredWidth();
                    }
                    view.setLayoutParams(bVar3);
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(postingPreviewImage.x, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    ValueAnimator ofInt = ValueAnimator.ofInt(frameLayout.getMeasuredWidth(), b);
                    ofInt.addUpdateListener(new vye(postingPreviewImage, i));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(300L);
                    animatorSet.playTogether(rl3.y0(new ValueAnimator[]{ofInt, ofPropertyValuesHolder}));
                    d3m.g(animatorSet, k6kVar);
                    animatorSet.start();
                    return;
                }
                return;
            case 9:
                VkBottomSheetBehavior<RecyclerView> vkBottomSheetBehavior = ((o420) this.c).f;
                (vkBottomSheetBehavior != null ? vkBottomSheetBehavior : null).K(4);
                return;
            case 10:
                ((gzs) this.c).invoke();
                return;
            case 11:
                FragmentEntry fragmentEntry = (FragmentEntry) this.c;
                fv1 fv1Var = oz50.l;
                if (fragmentEntry == null || (str = fragmentEntry.d) == null) {
                    str = "";
                }
                fv1Var.getClass();
                fv1.b.remove(str);
                Preference preference = Preference.a;
                Preference.K(izi0.f(Preference.u(EmptySet.b, "by_version", "allowed_intent_ids_set"), str), "by_version", "allowed_intent_ids_set");
                return;
            case 12:
                ((PhotoViewer) this.c).k();
                return;
            case 13:
                e5b0 w4 = ((e2b0) this.c).H.w4();
                if (w4.b) {
                    return;
                }
                LruCache<UUID, mzp0> lruCache = rzp0.a;
                mzp0 e = rzp0.e(w4.a);
                if (e != null) {
                    e.a();
                    s3q0 s3q0Var = s3q0.a;
                    return;
                }
                return;
            case 14:
                xkg0 xkg0Var = (xkg0) this.c;
                synchronized (xkg0Var.b) {
                    xkg0Var.h();
                    xkg0Var.i();
                    s3q0 s3q0Var2 = s3q0.a;
                }
                return;
            case 15:
                StoriesVideoEncoder storiesVideoEncoder = (StoriesVideoEncoder) this.c;
                storiesVideoEncoder.k.set(null);
                storiesVideoEncoder.e.onCancel();
                return;
            case 16:
                super/*xsna.xon0*/.close();
                return;
            case 17:
                ((TaskRunnerImpl) this.c).runPreNativeTask();
                return;
            case 18:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) this.c).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager == null) {
                        return;
                    }
                    UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.OnBoardingCancelRight, usersDiscoverLayoutManager);
                    userDiscoverSmoothScroller.setTargetPosition(usersDiscoverLayoutManager.f.f);
                    usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    return;
                }
                return;
            case 19:
                ((VideoSeekViewOld) this.c).getPreview().setTimelineThumbs(null);
                return;
            case 20:
                d3m.e(((VideoToolbarView) this.c).w, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 500L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            case 21:
                VoipActionVerticalButtonView voipActionVerticalButtonView = (VoipActionVerticalButtonView) this.c;
                int f = e3m.f(R.attr.vk_ui_text_accent, voipActionVerticalButtonView.getContext());
                voipActionVerticalButtonView.setTitle(R.string.voip_call_menu_actions_screencast_stop);
                voipActionVerticalButtonView.setTitleTextColor(ColorStateList.valueOf(f));
                VoipActionVerticalButtonView.P4(voipActionVerticalButtonView, enj.c(R.drawable.ic_arrow_up_28, f, voipActionVerticalButtonView.getContext()), R.attr.vk_ui_icon_accent, 12);
                return;
            case 22:
                Ya.b((Ya) this.c);
                return;
            case 23:
                ((pdz0) this.c).getClass();
                return;
            default:
                yads.wl2.a((yads.wl2) this.c);
                return;
        }
    }

    public /* synthetic */ nx3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
