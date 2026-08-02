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
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DiscoverErrorLoadContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vkontakte.android.R;

/* compiled from: DiscoverErrorLoadStoryView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class b2n extends FrameLayout implements qo6 {
    public Window b;
    public DiscoverErrorLoadContainer c;
    public int d;
    public final qlm0 e;
    public final View f;
    public final View g;
    public final View h;

    public b2n(Context context, elm0 elm0Var, Window window, DiscoverErrorLoadContainer discoverErrorLoadContainer, int i, qlm0 qlm0Var) {
        super(context, null, 0);
        this.b = window;
        this.c = discoverErrorLoadContainer;
        this.d = i;
        this.e = qlm0Var;
        a2n a2nVar = new a2n(this);
        LayoutInflater.from(context).inflate(R.layout.view_story_discover_error_load, (ViewGroup) this, true);
        this.f = findViewById(R.id.pb_loading);
        this.g = findViewById(R.id.title_error);
        View findViewById = findViewById(R.id.error_reload_button);
        this.h = findViewById;
        bwt0.i0(findViewById, new ij8(9, elm0Var, this));
        bwt0.p0(findViewById(R.id.tv_title), false);
        bwt0.i0(findViewById(R.id.iv_close), new i4h(elm0Var, 12));
        getViewTreeObserver().addOnPreDrawListener(a2nVar);
    }

    @Override // xsna.qo6
    public final boolean B() {
        return false;
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

    @Override // xsna.qo6
    public int getPosition() {
        return this.d;
    }

    @Override // xsna.qo6
    public iz8 getSavedCadreSize() {
        return null;
    }

    public Long getVideoViewDuration() {
        return null;
    }

    @Override // xsna.qo6
    public Window getWindow() {
        return this.b;
    }

    @Override // xsna.qo6
    public final boolean r0() {
        return true;
    }

    public void setPosition(int i) {
        this.d = i;
    }

    public void setStoriesContainer(DiscoverErrorLoadContainer discoverErrorLoadContainer) {
        this.c = discoverErrorLoadContainer;
    }

    public void setWindow(Window window) {
        this.b = window;
    }

    @Override // xsna.qo6
    public DiscoverErrorLoadContainer getStoriesContainer() {
        return this.c;
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
    public final void destroy() {
    }

    @Override // xsna.qo6
    public final void onPause() {
    }

    @Override // xsna.qo6
    public final void onResume() {
    }

    @Override // xsna.qo6
    public final void pause() {
    }

    @Override // xsna.qo6
    public final void play() {
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
    public final void L(int i, int i2) {
    }

    @Override // xsna.qo6
    public final void v0(boolean z, boolean z2, boolean z3) {
    }
}
