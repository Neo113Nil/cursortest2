package xsna;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PostingRedesignCarouselDraggingAnimator.kt */
/* loaded from: classes18.dex */
public final class mkc0 extends pkc0 {
    @Override // xsna.pkc0
    public final List<ObjectAnimator> b(View view) {
        return e43.l(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.94f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.94f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.75f));
    }

    @Override // xsna.pkc0
    public final List<ObjectAnimator> c(View view) {
        return EmptyList.b;
    }
}
