package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.stories.design.view.HashtagHintsView;

/* compiled from: StoryHashtagDialogContract.kt */
/* loaded from: classes16.dex */
public interface p4m0 extends dc6<Object>, t9m0 {
    @Override // xsna.t9m0
    default void H(int i) {
        float f = i;
        el().setTranslationY(f);
        m1().setTranslationY(f / 2.0f);
    }

    HashtagHintsView el();

    StoryEditText getEditText();

    ImageView l7();

    ViewGroup m1();
}
