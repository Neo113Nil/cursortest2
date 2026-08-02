package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.vk.attachpicker.widget.EditButton;
import com.vkontakte.android.R;

/* compiled from: EditButton.java */
/* loaded from: classes15.dex */
public final class mzo extends AnimatorListenerAdapter {
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ int c;

    public mzo(ImageView imageView, int i) {
        this.b = imageView;
        this.c = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ImageView imageView = this.b;
        imageView.setVisibility(4);
        int[] iArr = EditButton.j;
        int i = this.c;
        if (i == R.drawable.vk_icon_deprecated_picker_ic_video_trim_24dp) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            imageView.setAlpha(1.0f);
            imageView.setVisibility(4);
        }
    }
}
