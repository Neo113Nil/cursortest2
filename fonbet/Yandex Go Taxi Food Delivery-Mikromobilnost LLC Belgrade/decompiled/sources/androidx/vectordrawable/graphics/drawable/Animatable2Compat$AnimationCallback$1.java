package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* loaded from: classes10.dex */
class Animatable2Compat$AnimationCallback$1 extends Animatable2.AnimationCallback {
    final /* synthetic */ Animatable2Compat.a this$0;

    public Animatable2Compat$AnimationCallback$1(Animatable2Compat.a aVar) {
        this.this$0 = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationEnd(Drawable drawable) {
        this.this$0.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationStart(Drawable drawable) {
        this.this$0.b(drawable);
    }
}
