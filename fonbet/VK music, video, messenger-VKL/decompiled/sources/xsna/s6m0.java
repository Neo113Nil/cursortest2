package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.camera.drawing.gradient.StoryEditText;

/* compiled from: StoryMentionDialogContract.kt */
/* loaded from: classes16.dex */
public interface s6m0 extends dc6<Object>, t9m0 {
    View A8();

    @Override // xsna.t9m0
    default void H(int i) {
        float f = i;
        A8().setTranslationY(f);
        m1().setTranslationY(f / 2.0f);
    }

    StoryEditText getEditText();

    ViewGroup m1();
}
