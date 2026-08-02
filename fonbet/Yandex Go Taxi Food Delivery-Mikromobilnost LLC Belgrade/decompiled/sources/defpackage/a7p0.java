package defpackage;

import android.view.View;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.widget.accessibility.AccessibilityLiveRegionTextView;

/* loaded from: classes6.dex */
public final class a7p0 implements zo31 {
    public final BubbleComponent a;
    public final AccessibilityLiveRegionTextView b;

    public a7p0(BubbleComponent bubbleComponent, AccessibilityLiveRegionTextView accessibilityLiveRegionTextView) {
        this.a = bubbleComponent;
        this.b = accessibilityLiveRegionTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
