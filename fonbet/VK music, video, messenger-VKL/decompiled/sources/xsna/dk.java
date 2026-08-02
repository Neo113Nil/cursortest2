package xsna;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes12.dex */
public final class dk extends ClickableSpan {
    public final int b;
    public final am c;
    public final int d;

    public dk(int i, am amVar, int i2) {
        this.b = i;
        this.c = amVar;
        this.d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
        this.c.a.performAction(this.d, bundle);
    }
}
