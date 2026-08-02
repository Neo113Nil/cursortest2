package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public interface Animatable2Compat extends Animatable {

    public static abstract class a {
        public Animatable2.AnimationCallback a;

        public void a(Drawable drawable) {
        }

        public void b(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(a aVar);

    boolean unregisterAnimationCallback(a aVar);
}
