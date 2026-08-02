package xsna;

import android.graphics.Rect;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;

/* compiled from: BubblePaddingProvider.kt */
/* loaded from: classes2.dex */
public final class g98 implements ll8 {
    public static final Rect b;

    static {
        float f = 4;
        b = new Rect(iah0.a(12), iah0.a(f), iah0.a(f), iah0.a(8));
    }

    @Override // xsna.ll8
    public final Rect e(MsgBubblePart msgBubblePart) {
        return ml8.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return g98.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return g98.class.hashCode();
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
        return "BottomStrokeIncomingPaddingProvider";
    }
}
