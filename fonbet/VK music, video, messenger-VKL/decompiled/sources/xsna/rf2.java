package xsna;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.LayerDrawable;

/* compiled from: AnimatableLayerDrawable.java */
/* loaded from: classes2.dex */
public final class rf2 extends LayerDrawable implements Animatable {
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return ((Animatable) getDrawable(0)).isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ((Animatable) getDrawable(0)).start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        ((Animatable) getDrawable(0)).stop();
    }
}
