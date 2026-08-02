package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.payment.sdk.flex.impl.customview.views.webview.CustomWebView;

/* loaded from: classes2.dex */
public final class anf extends jz4 {
    public final lir c;

    public anf(lir lirVar) {
        super(io41.Companion.serializer());
        this.c = lirVar;
    }

    @Override // defpackage.jz4
    public final void a(View view, yzh yzhVar) {
        ((CustomWebView) view).bind(yzhVar);
    }

    @Override // defpackage.jz4
    public final View b(Context context, Object obj, qnh qnhVar) {
        return new CustomWebView(context, this.c, (io41) obj);
    }
}
