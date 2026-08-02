package defpackage;

import android.view.View;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;

/* loaded from: classes3.dex */
public final class fpb0 implements zo31 {
    public final BubbleComponent a;
    public final AccessibilityLiveRegionTextView b;

    public fpb0(BubbleComponent bubbleComponent, AccessibilityLiveRegionTextView accessibilityLiveRegionTextView) {
        this.a = bubbleComponent;
        this.b = accessibilityLiveRegionTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
