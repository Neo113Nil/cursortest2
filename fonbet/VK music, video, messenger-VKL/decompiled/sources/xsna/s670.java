package xsna;

import android.graphics.Rect;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;

/* compiled from: BubblePaddingProvider.kt */
/* loaded from: classes2.dex */
public final class s670 implements ll8 {
    public static final Rect b = new Rect(iah0.a(4), 0, iah0.a(12), 0);

    @Override // xsna.ll8
    public final Rect e(MsgBubblePart msgBubblePart) {
        return b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return s670.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return s670.class.hashCode();
    }

    @Override // xsna.ll8
    public final Rect i(MsgBubblePart msgBubblePart) {
        return new Rect();
    }

    @Override // xsna.ll8
    public final Rect j(MsgBubblePart msgBubblePart) {
        return b;
    }

    public final String toString() {
        return "NoneOutgoingPaddingProvider";
    }
}
