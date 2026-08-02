package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import one.video.controls.view.EndViewLayout;
import xsna.o7j;
import xsna.y3j;

/* compiled from: EndViewLayout.kt */
/* loaded from: classes8.dex */
public final class EndViewLayout extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public EndViewLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public EndViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public EndViewLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ EndViewLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public EndViewLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new y3j(new o7j() { // from class: xsna.zkp
            @Override // xsna.o7j
            public final void accept(Object obj) {
                alp alpVar = (alp) obj;
                int i3 = EndViewLayout.c;
                if (alpVar.b) {
                    return;
                }
                EndViewLayout.this.setVisibility(alpVar.a ? 0 : 8);
            }
        });
    }
}
