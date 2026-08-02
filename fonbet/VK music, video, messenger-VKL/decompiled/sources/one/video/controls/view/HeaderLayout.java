package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.video.controls.view.HeaderLayout;
import xsna.o7j;
import xsna.y3j;

/* compiled from: HeaderLayout.kt */
/* loaded from: classes8.dex */
public final class HeaderLayout extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public HeaderLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public HeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public HeaderLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ HeaderLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public HeaderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new y3j(new o7j() { // from class: xsna.qxu
            @Override // xsna.o7j
            public final void accept(Object obj) {
                rxu rxuVar = (rxu) obj;
                int i3 = HeaderLayout.c;
                if (rxuVar.b) {
                    return;
                }
                HeaderLayout.this.setVisibility(rxuVar.a ? 0 : 8);
            }
        });
    }
}
