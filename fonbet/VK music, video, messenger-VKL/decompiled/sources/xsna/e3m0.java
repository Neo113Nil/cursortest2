package xsna;

import android.transition.Transition;
import com.vk.preview.presentation.view.StoryGalleryPickerPreviewViewNew;
import com.vkontakte.android.R;

/* compiled from: Transition.kt */
/* loaded from: classes5.dex */
public final class e3m0 implements Transition.TransitionListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ StoryGalleryPickerPreviewViewNew b;

    public e3m0(boolean z, StoryGalleryPickerPreviewViewNew storyGalleryPickerPreviewViewNew) {
        this.a = z;
        this.b = storyGalleryPickerPreviewViewNew;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (this.a) {
            wzs<? super Integer, ? super Integer, s3q0> wzsVar = this.b.f;
            if (wzsVar != null) {
                wzsVar.invoke(Integer.valueOf(R.string.collage_with_video_message), null);
            }
            vvr0.b(150, 75L);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
