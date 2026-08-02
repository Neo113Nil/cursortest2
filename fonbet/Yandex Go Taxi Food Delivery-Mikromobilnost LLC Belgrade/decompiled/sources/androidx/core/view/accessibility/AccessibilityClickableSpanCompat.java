package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import defpackage.wh;

/* loaded from: classes10.dex */
public final class AccessibilityClickableSpanCompat extends ClickableSpan {
    public static final String SPAN_ID = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int mClickableSpanActionId;
    private final wh mNodeInfoCompat;
    private final int mOriginalClickableSpanId;

    public AccessibilityClickableSpanCompat(int i, wh whVar, int i2) {
        this.mOriginalClickableSpanId = i;
        this.mNodeInfoCompat = whVar;
        this.mClickableSpanActionId = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(SPAN_ID, this.mOriginalClickableSpanId);
        wh whVar = this.mNodeInfoCompat;
        whVar.a.performAction(this.mClickableSpanActionId, bundle);
    }
}
