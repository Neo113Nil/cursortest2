package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import one.video.controls.view.ButtonsLayout;
import xsna.kxt0;
import xsna.o7j;
import xsna.y3j;

/* compiled from: ButtonsLayout.kt */
/* loaded from: classes8.dex */
public final class ButtonsLayout extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public ButtonsLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        kxt0 kxt0Var = new kxt0(this);
        while (kxt0Var.hasNext()) {
            kxt0Var.next().setEnabled(z);
        }
    }

    public ButtonsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ButtonsLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ ButtonsLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public ButtonsLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new y3j(new o7j() { // from class: xsna.gs8
            @Override // xsna.o7j
            public final void accept(Object obj) {
                hs8 hs8Var = (hs8) obj;
                int i3 = ButtonsLayout.c;
                if (hs8Var.b) {
                    return;
                }
                ButtonsLayout.this.setVisibility(hs8Var.a ? 0 : 8);
            }
        });
    }
}
