package xsna;

import android.graphics.Rect;
import com.vk.im.ui.views.msg.bubble.MsgBubblePart;

/* compiled from: BubblePaddingProvider.kt */
/* loaded from: classes2.dex */
public interface ll8 {
    Rect e(MsgBubblePart msgBubblePart);

    default Rect i(MsgBubblePart msgBubblePart) {
        return new Rect();
    }

    Rect j(MsgBubblePart msgBubblePart);
}
