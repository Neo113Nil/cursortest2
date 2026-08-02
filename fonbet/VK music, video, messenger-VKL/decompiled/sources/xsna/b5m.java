package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* compiled from: DetailsView.kt */
/* loaded from: classes2.dex */
public final class b5m extends qjc {
    public final /* synthetic */ c5m i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5m(c5m c5mVar) {
        super(null);
        this.i = c5mVar;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        j4m j4mVar = this.i.e;
        if (j4mVar == null) {
            j4mVar = null;
        }
        j4mVar.v();
    }

    @Override // xsna.qjc, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(-1);
        textPaint.setUnderlineText(false);
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
    }
}
