package xsna;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SpanUtils.kt */
/* loaded from: classes6.dex */
public final class kik0 extends ClickableSpan {
    public final /* synthetic */ FunctionReferenceImpl b;
    public final /* synthetic */ int c;

    /* JADX WARN: Multi-variable type inference failed */
    public kik0(int i, gzs gzsVar) {
        this.b = (FunctionReferenceImpl) gzsVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.cancelPendingInputEvents();
        this.b.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.c);
    }
}
