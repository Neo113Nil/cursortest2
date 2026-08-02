package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* compiled from: DescriptionSpansHelperImpl.kt */
/* loaded from: classes17.dex */
public final class k2m extends qjc {
    public final /* synthetic */ l2m i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2m(l2m l2mVar, String str) {
        super(null);
        this.i = l2mVar;
        this.j = str;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        this.i.a.invoke(this.j);
    }

    @Override // xsna.qjc, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
    }
}
