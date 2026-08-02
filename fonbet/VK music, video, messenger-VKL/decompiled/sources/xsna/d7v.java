package xsna;

import android.text.Editable;
import android.text.TextWatcher;
import com.vk.camera.drawing.gradient.StoryEditText;

/* compiled from: HintWatcher.kt */
/* loaded from: classes16.dex */
public final class d7v implements TextWatcher {
    public final StoryEditText b;
    public final int c;

    public d7v(StoryEditText storyEditText, int i) {
        this.b = storyEditText;
        this.c = i;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        StoryEditText storyEditText = this.b;
        if (charSequence == null || charSequence.length() == 0) {
            storyEditText.setHint(this.c);
            storyEditText.setAlpha(0.4f);
        } else {
            storyEditText.setHint("");
            storyEditText.setAlpha(1.0f);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
