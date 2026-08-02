package xsna;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: CommunityWidgetThemedAbstractComposeView.kt */
/* loaded from: classes17.dex */
public abstract class i5i extends rpo0 implements mmx0 {
    public final wh50 m;

    public i5i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = androidx.compose.runtime.k.b(new ht(17));
    }

    public final izs<String, s3q0> getOnOpenUrl() {
        return (izs) ((zak0) this.m).getValue();
    }

    public final void setOnOpenUrl(izs<? super String, s3q0> izsVar) {
        ((zak0) this.m).setValue(izsVar);
    }
}
