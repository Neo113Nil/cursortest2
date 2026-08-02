package xsna;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.api.models.PreloadSource;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DiscoverStubStoryView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class dan extends FrameLayout implements qo6 {
    public Window b;
    public DiscoverStubStoriesContainer c;
    public int d;
    public final ImageView e;
    public final TextView f;
    public final ImageView g;
    public final TextView h;

    /* compiled from: DiscoverStubStoryView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverStubStoriesContainer.State.values().length];
            try {
                iArr[DiscoverStubStoriesContainer.State.NO_MORE_STORIES_AVAILABLE_STEP1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverStubStoriesContainer.State.NO_MORE_STORIES_AVAILABLE_STEP2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DiscoverStubStoriesContainer.State.NO_GRID_LOADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dan(Context context, Window window, DiscoverStubStoriesContainer discoverStubStoriesContainer, int i) {
        super(context, null, 0);
        this.b = window;
        this.c = discoverStubStoriesContainer;
        this.d = i;
        LayoutInflater.from(context).inflate(R.layout.view_story_discover_stub, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(R.id.discover_stub_compass_image);
        this.e = imageView;
        TextView textView = (TextView) findViewById(R.id.discover_stub_title_discover);
        this.f = textView;
        ImageView imageView2 = (ImageView) findViewById(R.id.discover_stub_stories_image);
        this.g = imageView2;
        TextView textView2 = (TextView) findViewById(R.id.discover_stub_title_stories);
        this.h = textView2;
        int i2 = a.$EnumSwitchMapping$0[getStoriesContainer().p.ordinal()];
        if (i2 == 1 || i2 == 2) {
            bwt0.p0(textView2, false);
            bwt0.p0(imageView2, false);
            bwt0.p0(imageView, true);
            bwt0.p0(textView, true);
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            return;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        bwt0.p0(textView2, false);
        bwt0.p0(imageView2, false);
        bwt0.p0(imageView, true);
        imageView.setAlpha(1.0f);
        bwt0.p0(textView, true);
        textView.setAlpha(1.0f);
        textView.setText(R.string.stories_discover_title_loader);
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

    @Override // xsna.qo6
    public final void destroy() {
        ImageView imageView = this.e;
        imageView.clearAnimation();
        imageView.removeCallbacks(null);
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

    public void setStoriesContainer(DiscoverStubStoriesContainer discoverStubStoriesContainer) {
        this.c = discoverStubStoriesContainer;
    }

    public void setWindow(Window window) {
        this.b = window;
    }

    @Override // xsna.qo6
    public DiscoverStubStoriesContainer getStoriesContainer() {
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
