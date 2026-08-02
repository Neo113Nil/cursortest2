package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class bmy0 {
    public float c;
    public float d;
    public final WeakReference f;
    public dky0 g;
    public final TextPaint a = new TextPaint(1);
    public final wpb b = new wpb(1, this);
    public boolean e = true;

    public bmy0(amy0 amy0Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(amy0Var);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(dky0 dky0Var, Context context) {
        if (this.g != dky0Var) {
            this.g = dky0Var;
            WeakReference weakReference = this.f;
            if (dky0Var != null) {
                TextPaint textPaint = this.a;
                wpb wpbVar = this.b;
                dky0Var.e(context, textPaint, wpbVar);
                amy0 amy0Var = (amy0) weakReference.get();
                if (amy0Var != null) {
                    textPaint.drawableState = amy0Var.getState();
                }
                dky0Var.d(context, textPaint, wpbVar);
                this.e = true;
            }
            amy0 amy0Var2 = (amy0) weakReference.get();
            if (amy0Var2 != null) {
                amy0Var2.onTextSizeChange();
                amy0Var2.onStateChange(amy0Var2.getState());
            }
        }
    }
}
