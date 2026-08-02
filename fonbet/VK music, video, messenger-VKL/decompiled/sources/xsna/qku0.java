package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import xsna.kvv;

/* compiled from: VkClickableLinkSpan.kt */
@ozl
/* loaded from: classes17.dex */
public abstract class qku0 extends CharacterStyle implements Cloneable {
    public final String b;
    public final kvv.b.a c;
    public final boolean d = true;
    public Integer e;
    public Typeface f;

    public qku0(String str, kvv.b.a aVar) {
        this.b = str;
        this.c = aVar;
    }

    public abstract void a();

    public abstract void b(Context context);

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.e.intValue());
        Typeface typeface = this.f;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
    }
}
