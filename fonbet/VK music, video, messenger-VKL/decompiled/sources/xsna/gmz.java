package xsna;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.video.VideoOwner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vk.story.viewer.impl.presentation.stories.view.SourceTransitionStory;
import com.vkontakte.android.R;

/* compiled from: LiveStoryView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class gmz extends FrameLayout implements qo6, niz {
    public final elm0 b;
    public StoriesContainer c;
    public Window d;
    public ViewGroup e;
    public int f;
    public final qlm0 g;
    public final piz h;
    public final VideoOwner i;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gmz(Context context, elm0 elm0Var, StoriesContainer storiesContainer, Window window, ViewPager viewPager, int i, qlm0 qlm0Var) {
        super(context, null, 0);
        UserId Fb;
        Group group;
        StoryOwner.User zb;
        VideoFile videoFile;
        VideoFile videoFile2;
        this.b = elm0Var;
        this.c = storiesContainer;
        this.d = window;
        this.e = viewPager;
        this.f = i;
        this.g = qlm0Var;
        LayoutInflater.from(context).inflate(R.layout.view_story_live, (ViewGroup) this, true);
        piz U = fxc0.B().T().U(context);
        this.h = U;
        addView(U.getView());
        StoryEntry Lb = getStoriesContainer().Lb();
        int o0 = (Lb == null || (videoFile2 = Lb.n) == null) ? 0 : videoFile2.o0();
        StoryEntry Lb2 = getStoriesContainer().Lb();
        if (Lb2 == null || (videoFile = Lb2.n) == null || (Fb = videoFile.I0()) == null) {
            StoryOwner storyOwner = getStoriesContainer().b;
            Fb = storyOwner != null ? storyOwner.Fb() : UserId.d;
        }
        VideoOwner videoOwner = new VideoOwner(o0, Fb);
        this.i = videoOwner;
        StoryOwner storyOwner2 = getStoriesContainer().b;
        videoOwner.g = (storyOwner2 == null || (zb = storyOwner2.zb()) == null) ? null : zb.c;
        VideoOwner videoOwner2 = this.i;
        videoOwner2 = videoOwner2 == null ? null : videoOwner2;
        StoryOwner storyOwner3 = getStoriesContainer().b;
        if (storyOwner3 != null) {
            StoryOwner.Community community = storyOwner3 instanceof StoryOwner.Community ? (StoryOwner.Community) storyOwner3 : null;
            if (community != null) {
                group = community.c;
                videoOwner2.h = group;
                if (!getStoriesContainer().g.isEmpty()) {
                    VideoOwner videoOwner3 = this.i;
                    (videoOwner3 == null ? null : videoOwner3).f = getStoriesContainer().g.get(0).n;
                    VideoOwner videoOwner4 = this.i;
                    (videoOwner4 == null ? null : videoOwner4).f.bb();
                    VideoOwner videoOwner5 = this.i;
                    (videoOwner5 == null ? null : videoOwner5).f.r0(true);
                }
                View view = U.getView();
                VideoOwner videoOwner6 = this.i;
                view.setTag((videoOwner6 == null ? null : videoOwner6).c);
                U.setWindow(getWindow());
                U.setPresenter(fxc0.B().T().Q(U));
                U.getPresenter().v0(fxc0.B().T().Z(U));
                U.getPresenter().e2();
                U.getPresenter().u0(false);
                U.getPresenter().h2(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER));
                oiz presenter = U.getPresenter();
                VideoOwner videoOwner7 = this.i;
                presenter.e1(videoOwner7 != null ? videoOwner7 : null);
                U.getPresenter().D1();
                if (!getStoriesContainer().g.isEmpty()) {
                    U.getPresenter().G0(getStoriesContainer().g.get(0).c);
                }
                U.getPresenter().G1(this);
                U.getView().setBackgroundColor(getContext().getColor(R.color.vk_black));
                U.getPresenter().w1(true);
                U.setSmoothHideBack(true);
                U.getPresenter().i2();
                U.getPresenter().B0();
                if (elm0Var == null && getPosition() == elm0Var.getCurrentIdlePagerPosition()) {
                    U.getPresenter().setActive(true);
                    U.getPresenter().start();
                    U.getPresenter().y();
                    return;
                }
            }
        }
        group = null;
        videoOwner2.h = group;
        if (!getStoriesContainer().g.isEmpty()) {
        }
        View view2 = U.getView();
        VideoOwner videoOwner62 = this.i;
        view2.setTag((videoOwner62 == null ? null : videoOwner62).c);
        U.setWindow(getWindow());
        U.setPresenter(fxc0.B().T().Q(U));
        U.getPresenter().v0(fxc0.B().T().Z(U));
        U.getPresenter().e2();
        U.getPresenter().u0(false);
        U.getPresenter().h2(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER));
        oiz presenter2 = U.getPresenter();
        VideoOwner videoOwner72 = this.i;
        presenter2.e1(videoOwner72 != null ? videoOwner72 : null);
        U.getPresenter().D1();
        if (!getStoriesContainer().g.isEmpty()) {
        }
        U.getPresenter().G1(this);
        U.getView().setBackgroundColor(getContext().getColor(R.color.vk_black));
        U.getPresenter().w1(true);
        U.setSmoothHideBack(true);
        U.getPresenter().i2();
        U.getPresenter().B0();
        if (elm0Var == null) {
        }
    }

    @Override // xsna.qo6
    public final boolean B() {
        return false;
    }

    @Override // xsna.niz
    public final void F() {
        this.h.getPresenter().y();
        elm0 elm0Var = this.b;
        if (elm0Var != null) {
            elm0Var.finish();
        }
    }

    @Override // xsna.qo6
    public final boolean I0() {
        return true;
    }

    @Override // xsna.qo6
    public final Animator K0(boolean z, ViewGroup viewGroup, int i, int i2) {
        return null;
    }

    @Override // xsna.qo6
    public final void L(int i, int i2) {
        int position = getPosition();
        piz pizVar = this.h;
        if (i == position) {
            pizVar.getPresenter().setActive(true);
            pizVar.getPresenter().start();
            pizVar.getPresenter().y();
        } else {
            pizVar.getPresenter().setActive(false);
            pizVar.pause();
            pizVar.Q2(false);
        }
    }

    @Override // xsna.qo6
    public final boolean O(int i, int i2) {
        return false;
    }

    @Override // xsna.qo6
    public final Animator P() {
        return null;
    }

    @Override // xsna.qo6
    public final boolean X(int i, int i2) {
        return false;
    }

    @Override // xsna.niz
    public final void delete() {
        UserId Fb;
        StoryOwner storyOwner = getStoriesContainer().b;
        if (storyOwner == null || (Fb = storyOwner.Fb()) == null) {
            return;
        }
        hg1.l(this.g.a.n(Fb, getStoriesContainer(), null), getContext(), 62).subscribe(new fmz(this, Fb, 0), new lz(new cww(this, 3), 19));
    }

    @Override // xsna.qo6
    public final void destroy() {
        piz pizVar = this.h;
        pizVar.release();
        pizVar.getPresenter().y();
    }

    public Context getCtx() {
        return getContext();
    }

    @Override // xsna.qo6
    public float getCurrentHeaderAvatarScale() {
        return 1.0f;
    }

    @Override // xsna.qo6
    public StoryEntry getCurrentStory() {
        return getStoriesContainer().Bb();
    }

    @Override // xsna.qo6
    public long getCurrentTime() {
        return 0L;
    }

    @Override // xsna.qo6
    public Long getDuration() {
        return null;
    }

    public int getHeightPx() {
        return getHeight();
    }

    public int getMeasuredWidthPx() {
        return getMeasuredWidth();
    }

    public final ViewGroup getPager() {
        return this.e;
    }

    @Override // xsna.qo6
    public int getPosition() {
        return this.f;
    }

    @Override // xsna.qo6
    public iz8 getSavedCadreSize() {
        return null;
    }

    @Override // xsna.qo6
    public StoriesContainer getStoriesContainer() {
        return this.c;
    }

    public Long getVideoViewDuration() {
        return null;
    }

    @Override // xsna.qo6
    public Window getWindow() {
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        destroy();
    }

    @Override // xsna.qo6
    public final void onPause() {
        this.h.pause();
    }

    @Override // xsna.qo6
    public final void onResume() {
        this.h.resume();
    }

    @Override // xsna.qo6
    public final void pause() {
        piz pizVar = this.h;
        pizVar.pause();
        gv5 gv5Var = pizVar instanceof gv5 ? (gv5) pizVar : null;
        if (gv5Var != null) {
            gv5Var.a0();
        }
    }

    @Override // xsna.qo6
    public final void play() {
        elm0 elm0Var = this.b;
        if (elm0Var == null || elm0Var.getCurrentIdlePagerPosition() != getPosition()) {
            return;
        }
        this.h.resume();
    }

    @Override // xsna.qo6
    public final boolean r0() {
        return true;
    }

    public final void setPager(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public void setPosition(int i) {
        this.f = i;
    }

    public void setStoriesContainer(StoriesContainer storiesContainer) {
        this.c = storiesContainer;
    }

    public void setWindow(Window window) {
        this.d = window;
    }

    @Override // xsna.niz
    public final void t6() {
        elm0 elm0Var = this.b;
        if (elm0Var != null) {
            elm0Var.e(SourceTransitionStory.CLICK);
        }
    }

    @Override // xsna.qo6
    public final void A() {
    }

    @Override // xsna.qo6
    public final void C() {
    }

    @Override // xsna.qo6
    public final void D() {
    }

    @Override // xsna.qo6
    public final void E() {
    }

    @Override // xsna.qo6
    public final void G() {
    }

    @Override // xsna.qo6
    public final void I() {
    }

    @Override // xsna.qo6
    public final void L0() {
    }

    @Override // xsna.qo6
    public final void N() {
    }

    @Override // xsna.qo6
    public final void Q() {
    }

    @Override // xsna.qo6
    public final void R() {
    }

    @Override // xsna.qo6
    public final void S() {
    }

    @Override // xsna.qo6
    public final void U() {
    }

    @Override // xsna.qo6
    public final void b() {
    }

    @Override // xsna.qo6
    public final void c() {
    }

    @Override // xsna.qo6
    public final void y0() {
    }

    @Override // xsna.qo6
    public final void z() {
    }

    @Override // xsna.qo6
    public final void E0(boolean z) {
    }

    @Override // xsna.qo6
    public final void G0(tu1 tu1Var) {
    }

    @Override // xsna.qo6
    public final void J(StoryEntry storyEntry) {
    }

    @Override // xsna.qo6
    public final void j0(float f) {
    }

    @Override // xsna.qo6
    public final void m0(axl0 axl0Var) {
    }

    @Override // xsna.qo6
    public final void onTouch(MotionEvent motionEvent) {
    }

    @Override // xsna.qo6
    public void setAudioMuted(boolean z) {
    }

    @Override // xsna.qo6
    public void setEncodingDone(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public void setPreloadSource(PreloadSource preloadSource) {
    }

    @Override // xsna.qo6
    public void setUploadDone(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public void setUploadFailed(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public void setUploadProgress(zjm0 zjm0Var) {
    }

    @Override // xsna.qo6
    public final void H(int i, UserId userId) {
    }

    @Override // xsna.qo6
    public final void H0(int i, UserId userId) {
    }

    @Override // xsna.qo6
    public final void v0(boolean z, boolean z2, boolean z3) {
    }
}
