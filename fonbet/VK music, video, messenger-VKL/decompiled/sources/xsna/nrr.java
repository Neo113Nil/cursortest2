package xsna;

import android.view.View;
import com.vk.im.ui.views.msg.bubble.FloatingBubbleFluidLayout;
import com.vk.im.ui.views.msg.bubble.MsgBubbleView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nrr implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ nrr(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                int i2 = FloatingBubbleFluidLayout.j;
                MsgBubbleView msgBubbleView = (MsgBubbleView) view;
                return Integer.valueOf(msgBubbleView.getRight() - (msgBubbleView.getBubbleStyle().f ? msgBubbleView.getStylePadding().right : msgBubbleView.getBubbleDrawablePadding().right));
            default:
                lda0.a(view, 0.75f, true);
                return s3q0.a;
        }
    }
}
