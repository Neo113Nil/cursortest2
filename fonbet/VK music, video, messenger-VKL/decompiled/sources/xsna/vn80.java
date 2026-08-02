package xsna;

import android.view.View;
import androidx.annotation.NonNull;
import one.video.controls.view.OptimizedTimeView;
import one.video.controls.view.PositionDurationView;

/* compiled from: OneVideoTimeViewBinding.java */
/* loaded from: classes8.dex */
public final class vn80 implements xtt0 {

    @NonNull
    public final PositionDurationView a;

    @NonNull
    public final OptimizedTimeView b;

    @NonNull
    public final OptimizedTimeView c;

    public vn80(@NonNull PositionDurationView positionDurationView, @NonNull OptimizedTimeView optimizedTimeView, @NonNull OptimizedTimeView optimizedTimeView2) {
        this.a = positionDurationView;
        this.b = optimizedTimeView;
        this.c = optimizedTimeView2;
    }

    @Override // xsna.xtt0
    @NonNull
    public final View getRoot() {
        return this.a;
    }
}
