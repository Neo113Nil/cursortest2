package xsna;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import xsna.hab;

/* compiled from: ChannelReactionQuantitySelectorView.kt */
/* loaded from: classes16.dex */
public final class tab extends CharacterStyle implements l2v0 {
    public final int b;
    public final /* synthetic */ uab c;

    public tab(int i, uab uabVar) {
        this.c = uabVar;
        this.b = i;
    }

    @Override // xsna.rku0
    public final boolean e() {
        return false;
    }

    @Override // xsna.rku0
    public final void f(Context context, View view) {
        this.c.d.invoke(hab.e.b);
    }

    @Override // xsna.l2v0
    public final int getColor() {
        return this.b;
    }

    @Override // xsna.l2v0
    public final String i() {
        return null;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
    }

    @Override // xsna.rku0
    public final void a(Context context, View view) {
    }
}
