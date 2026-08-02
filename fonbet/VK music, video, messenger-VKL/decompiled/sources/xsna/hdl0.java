package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import xsna.gdl0;

/* compiled from: StickersTabsLayout.kt */
/* loaded from: classes6.dex */
public final class hdl0 extends FrameLayout implements gdl0.a {
    public final /* synthetic */ gdl0 b;
    public final /* synthetic */ dbw0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdl0(gdl0 gdl0Var, dbw0 dbw0Var, Context context) {
        super(context);
        Drawable rippleBackground;
        this.b = gdl0Var;
        this.c = dbw0Var;
        rippleBackground = gdl0Var.getRippleBackground();
        setBackground(rippleBackground);
        addView(dbw0Var, new FrameLayout.LayoutParams(-2, gdl0.m, 17));
    }

    @Override // xsna.gdl0.a
    public final void a(int i, boolean z) {
        this.c.setSelected(i - this.b.h);
    }
}
