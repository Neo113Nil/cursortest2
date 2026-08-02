package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* compiled from: DescriptionSpansHelperImpl.kt */
/* loaded from: classes17.dex */
public final class j2m extends qjc {
    public final /* synthetic */ gzs<s3q0> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2m(gzs<s3q0> gzsVar) {
        super(null);
        this.i = gzsVar;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        this.i.invoke();
    }

    @Override // xsna.qjc, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
    }
}
