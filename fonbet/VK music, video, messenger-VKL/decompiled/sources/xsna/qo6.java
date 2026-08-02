package xsna;

import android.animation.Animator;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.Window;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.story.viewer.api.models.PreloadSource;

/* compiled from: BaseStoryViewContract.kt */
/* loaded from: classes6.dex */
public interface qo6 {
    void A();

    boolean B();

    void C();

    void D();

    void E();

    void E0(boolean z);

    void G();

    void G0(tu1 tu1Var);

    void H(int i, UserId userId);

    void H0(int i, UserId userId);

    void I();

    default boolean I0() {
        return true;
    }

    void J(StoryEntry storyEntry);

    default Animator K0(boolean z, ViewGroup viewGroup, int i, int i2) {
        return null;
    }

    void L(int i, int i2);

    void L0();

    void N();

    boolean O(int i, int i2);

    default Animator P() {
        return null;
    }

    void Q();

    void R();

    void S();

    boolean X(int i, int i2);

    void b();

    void c();

    void destroy();

    default float getCurrentHeaderAvatarScale() {
        return 1.0f;
    }

    StoryEntry getCurrentStory();

    long getCurrentTime();

    default Long getDuration() {
        return null;
    }

    int getPosition();

    default iz8 getSavedCadreSize() {
        return null;
    }

    StoriesContainer getStoriesContainer();

    Window getWindow();

    void j0(float f);

    void m0(axl0 axl0Var);

    void onPause();

    void onResume();

    void onTouch(MotionEvent motionEvent);

    void pause();

    void play();

    default boolean r0() {
        return true;
    }

    void setAudioMuted(boolean z);

    void setEncodingDone(zjm0 zjm0Var);

    void setPreloadSource(PreloadSource preloadSource);

    void setUploadDone(zjm0 zjm0Var);

    void setUploadFailed(zjm0 zjm0Var);

    void setUploadProgress(zjm0 zjm0Var);

    void v0(boolean z, boolean z2, boolean z3);

    void y0();

    void z();

    default void U() {
    }
}
