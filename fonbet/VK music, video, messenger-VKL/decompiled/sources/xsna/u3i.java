package xsna;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: CommunityTitleViewDataDelegate.kt */
/* loaded from: classes5.dex */
public final class u3i extends ClickableSpan {
    public final /* synthetic */ gzs<s3q0> b;

    public u3i(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.invoke();
    }
}
