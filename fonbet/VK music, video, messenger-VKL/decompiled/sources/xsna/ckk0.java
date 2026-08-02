package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;

/* compiled from: SpectatorsViewNew.kt */
/* loaded from: classes3.dex */
public final class ckk0 extends qjc {
    public final /* synthetic */ bkk0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckk0(bkk0 bkk0Var) {
        super(null);
        this.i = bkk0Var;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        vjk0 vjk0Var = this.i.G;
        if (vjk0Var != null) {
            vjk0Var.l();
        }
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
