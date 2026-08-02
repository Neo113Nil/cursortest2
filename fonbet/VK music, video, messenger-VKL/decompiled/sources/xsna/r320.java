package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: MentionLinkSpan.kt */
/* loaded from: classes7.dex */
public final class r320 extends qaz {
    public final String m;

    public r320(String str, String str2, Bundle bundle) {
        super(str, bundle, null);
        this.m = str2;
    }

    @Override // xsna.qaz, xsna.rku0
    public final void a(Context context, View view) {
        xwk.d().e().g(context, this.m, new eo2(this, context, view, 3));
    }
}
