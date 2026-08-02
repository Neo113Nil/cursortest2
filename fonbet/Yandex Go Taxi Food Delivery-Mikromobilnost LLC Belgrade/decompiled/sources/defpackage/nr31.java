package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;

/* loaded from: classes6.dex */
public final class nr31 implements zo31 {
    public final BubbleComponent a;
    public final AppCompatImageView b;
    public final AccessibilityLiveRegionTextView c;

    public nr31(BubbleComponent bubbleComponent, AppCompatImageView appCompatImageView, AccessibilityLiveRegionTextView accessibilityLiveRegionTextView) {
        this.a = bubbleComponent;
        this.b = appCompatImageView;
        this.c = accessibilityLiveRegionTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
