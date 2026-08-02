package xsna;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: URLSpanCache.android.kt */
/* loaded from: classes11.dex */
public final class hpi extends ClickableSpan {
    public final q8z b;

    public hpi(q8z q8zVar) {
        this.b = q8zVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        q8z q8zVar = this.b;
        i9z a = q8zVar.a();
        if (a != null) {
            a.a(q8zVar);
        }
    }
}
